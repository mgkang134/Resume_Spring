package resume.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private static final int MY_BIRTH_YEAR = 1994;
	
	@RequestMapping("/")
	public String home(Model model) {
		int currentYear = LocalDate.now().getYear();
		int myAge = currentYear - MY_BIRTH_YEAR + 1;
		model.addAttribute("myAge", myAge);
		return "home";
	}
}
