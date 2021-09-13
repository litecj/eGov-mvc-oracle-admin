package shop.tripn.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.publisher.domain.PublisherDto;
import shop.tripn.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/publisher")
public class PublisherController {
	
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	
	@RequestMapping(value="/register", method= {RequestMethod.POST})
	public String add(@RequestParam("pubId")int pubId,
			@RequestParam("pubName")String pubName,
			@RequestParam("mgrName")String mgrName,
			@RequestParam("phone")String phone) 
		{System.out.println("pubId : " + pubId);
		System.out.println("pubName : " + pubName);
		System.out.println("mgrName : " + mgrName);
		System.out.println("phone : " + phone);
		publisher.setPubId(pubId);
		publisher.setPubName(pubName);
		publisher.setMgrName(mgrName);
		publisher.setPhone(phone);
		publisherService.add(publisher);
		return "register success";}
	
	@RequestMapping("/list")
	public void findAll() {
		List<PublisherDto> list = publisherService.findAll();
		for (PublisherDto p : list) {System.out.println(p.toString());}
	}
	@RequestMapping("/pubId/{pubId}")
	public void findById(@PathVariable int pubId) {
		PublisherDto publisher = publisherService.findById(pubId);
		System.out.println(publisher.toString());
	}
	@RequestMapping("/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDto> publishers = publisherService.findByPubName(pubName);
		for (PublisherDto p : publishers) {System.out.println(p.toString());}
	}
	@RequestMapping("/mgrName/{mgrName}")
	public void findByMgrName(@PathVariable String mgrName) {
		List<PublisherDto> publishers = publisherService.findByMgrName(mgrName);
		for (PublisherDto p : publishers) {System.out.println(p.toString());}
	}
	@RequestMapping("/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<PublisherDto> publishers = publisherService.findByPhone(phone);
		for (PublisherDto p : publishers) {System.out.println(p.toString());}
	}
}
