package springboot.thymeleaf.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springboot.thymeleaf.form.model.User;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("userForm", new User());
		return "index";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		model.addAttribute("userForm", new User());
		model.addAttribute("message", "you have registered successfully.");
		
		return "index";
	}
	
}
