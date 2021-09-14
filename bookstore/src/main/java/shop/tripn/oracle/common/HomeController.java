package shop.tripn.oracle.common;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, HttpServletRequest request)
		{String contextPath = request.getContextPath();
    	session.setAttribute("contextPath", contextPath);
    	
//		(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		String formattedDate = dateFormat.format(date);
//		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String join(Locale locale, Model model) {
		return "user/Join";	}
	
	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "user/Login";	}
	@RequestMapping(value = "/userListForm", method = RequestMethod.GET)
	public String userList() {
		return "user/List";	}
	@RequestMapping(value = "/userDeleteForm", method = RequestMethod.GET)
	public String userDelete() {
		return "user/Delete";	}
	@RequestMapping(value = "/userUpdateForm", method = RequestMethod.GET)
	public String userUpdate() {
		return "user/Update";	}
	
	@RequestMapping(value = "/bookAddForm", method = RequestMethod.GET)
	public String bookRegister() {
		return "book/Register";	}
	
	@RequestMapping(value = "/bookListForm", method = RequestMethod.GET)
	public String bookList() {
		return "book/List";	}
	
	@RequestMapping(value = "/bookDeleteForm", method = RequestMethod.GET)
	public String bookDelete() {
		return "book/Delete";	}
	
	@RequestMapping(value = "/bookUpdateForm", method = RequestMethod.GET)
	public String bookUpdate() {
		return "book/Update";	}
	
	@RequestMapping(value = "/orderform", method = RequestMethod.GET)
	public String order(Locale locale, Model model) {
		
		return "order/Order";
	}
	
	@RequestMapping(value = "/publisherform", method = RequestMethod.GET)
	public String publisher(Locale locale, Model model) {
		
		return "publisher/Register";
	}
}