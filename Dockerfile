# GIAI ĐOẠN 1: BUILD
FROM maven:3.9.11-eclipse-temurin-25 AS builder
WORKDIR /app
COPY . .
# Biên dịch code thành file .jar (bỏ qua chạy thử test để build nhanh)
RUN mvn package -DskipTests

# GIAI ĐOẠN 2: RUN
FROM eclipse-temurin:25-jre-jammy
WORKDIR /app
# Chỉ lấy file .jar từ builder (Giai đoạn 1)
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
# Lệnh "bật công tắc" để khởi động Container
ENTRYPOINT ["java", "-jar", "app.jar"]