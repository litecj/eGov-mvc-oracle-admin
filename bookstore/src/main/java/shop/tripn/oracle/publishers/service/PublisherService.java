package shop.tripn.oracle.publishers.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.publisher.domain.PublisherDto;

@Component 
public interface PublisherService {
	public List<PublisherDto> findAll();
	public PublisherDto findById(int pubId);
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMgrName(String mgrName);
	public List<PublisherDto> findByPhone(String phone);

}
