package Api.DofusLite.DofusLite.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/creation")
	public String creation() {
		return "creation";
	}
	
	@GetMapping("/tendency")
	public String tendency() {
		return "tendency";
	}

}
