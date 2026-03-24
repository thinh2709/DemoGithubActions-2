package com.hutech.nguyenphucthinh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Nguyễn Phúc Thịnh");
        model.addAttribute("job", "Lập trình viên Java & Full-stack");
        model.addAttribute("email", "thinh270924@gmail.com");
        model.addAttribute("phone", "0365981370");
        model.addAttribute("location", "TP. Hồ Chí Minh, Việt Nam");
        model.addAttribute("bio", "Tôi là một lập trình viên đam mê công nghệ, chuyên xây dựng các ứng dụng web hiệu năng cao với Spring Boot và các công nghệ frontend hiện đại. Luôn sẵn sàng học hỏi và chinh phục những thử thách mới.");
        
        // Bổ sung thêm danh sách kỹ năng
        model.addAttribute("skills", new String[]{"Java", "Spring Boot", "MySQL", "ReactJS", "Docker", "Git"});
        
        // Bổ sung các liên kết mạng xã hội
        model.addAttribute("github", "https://github.com/phucthinh");
        model.addAttribute("linkedin", "https://linkedin.com/in/phucthinh");
        model.addAttribute("facebook", "https://facebook.com/phucthinh");
        
        return "index";
    }
}
