package shop.tripn.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.publisher.domain.PublisherDto;
import shop.tripn.oracle.publishers.service.PublisherService;

@Controller
public class PublisherController {
	
	@Autowired PublisherService publisherService;
	@RequestMapping("/Publisher")
	public void findAll() {
		List<PublisherDto> list = publisherService.findAll();
		for (PublisherDto p : list) {System.out.println(p.toString());}
	}
	@RequestMapping("/Publisher/pubId/{pubId}")
	public void findById(@PathVariable int pubId) {
		PublisherDto publisher = publisherService.findById(pubId);
		System.out.println(publisher.toString());
	}
	@RequestMapping("/Publisher/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDto> publishers = publisherService.findByPubName(pubName);
		for (PublisherDto p : publishers) {System.out.println(p.toString());}
	}
	@RequestMapping("/Publisher/mgrName/{mgrName}")
	public void findByMgrName(@PathVariable String mgrName) {
		List<PublisherDto> publishers = publisherService.findByMgrName(mgrName);
		for (PublisherDto p : publishers) {System.out.println(p.toString());}
	}
	@RequestMapping("/Publisher/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<PublisherDto> publishers = publisherService.findByPhone(phone);
		for (PublisherDto p : publishers) {System.out.println(p.toString());}
	}
}
