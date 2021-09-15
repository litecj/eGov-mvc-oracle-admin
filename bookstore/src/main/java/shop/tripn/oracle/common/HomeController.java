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
	
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
	
	@RequestMapping(value = "/orderAddForm", method = RequestMethod.GET)
	public String orderRegister() {
		return "order/Order";	}
	
	@RequestMapping(value = "/orderListForm", method = RequestMethod.GET)
	public String orderList() {
		return "order/List";	}
	
	@RequestMapping(value = "/orderDeleteForm", method = RequestMethod.GET)
	public String orderDelete() {
		return "order/Delete";	}
	
	@RequestMapping(value = "/orderUpdateForm", method = RequestMethod.GET)
	public String orderUpdate() {
		return "order/Update";	}
	
	@RequestMapping(value = "/orderDetailForm", method = RequestMethod.GET)
	public String orderDetail() {
		return "order/Detail";	}
	
	@RequestMapping(value = "/publisherAddForm", method = RequestMethod.GET)
	public String publisherRegister() {
		return "order/Register";	}
	
	@RequestMapping(value = "/publisherListForm", method = RequestMethod.GET)
	public String publisherList() {
		return "publisher/List";	}
	
	@RequestMapping(value = "/publisherDeleteForm", method = RequestMethod.GET)
	public String publisherDelete() {
		return "publisher/Delete";	}
	
	@RequestMapping(value = "/publisherUpdateForm", method = RequestMethod.GET)
	public String publisherUpdate() {
		return "publisher/Update";	}
	
	@RequestMapping(value = "/publisherDetailForm", method = RequestMethod.GET)
	public String publisherDetail() {
		return "publisher/Detail";	}
	
	
	@RequestMapping(value = "/publisherform", method = RequestMethod.GET)
	public String publisher(Locale locale, Model model) {
		return "publisher/Register";}
}
