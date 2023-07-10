package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView redirectView(@RequestParam("querybox") String query) {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com/search?q=" + query);
		return redirectView;
	}
}