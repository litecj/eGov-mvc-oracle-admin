package shop.tripn.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.publisher.domain.PublisherDto;

@Component 
public interface PublisherService extends GenericInterface<PublisherDto, Integer> {
//	public List<PublisherDto> findAll();
//	public PublisherDto findById(int pubId);
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMgrName(String mgrName);
	public List<PublisherDto> findByPhone(String phone);
//	public void add(PublisherDto publisher);
}
