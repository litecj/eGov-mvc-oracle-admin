package shop.tripn.oracle.publisher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.mappers.PublisherMapper;
import shop.tripn.oracle.publisher.domain.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService {

	@Autowired PublisherMapper publisherMapper;

	@Override
	public void save(PublisherDto t) {
		publisherMapper.save(t);	}

	@Override
	public PublisherDto findById(Integer id) {
		return publisherMapper.findById(id);	}

	@Override
	public List<PublisherDto> findAll() {
		return publisherMapper.findAll();	}

	@Override
	public void update(PublisherDto t) {
		publisherMapper.update(t);	}

	@Override
	public void delete(Integer id) {
		publisherMapper.delete(id);	}

	@Override
	public List<PublisherDto> findByPubName(String pubName) {
		return publisherMapper.findByPubName(pubName);	}

	@Override
	public List<PublisherDto> findByMgrName(String mgrName) {
		return publisherMapper.findByMgrName(mgrName);	}

	@Override
	public List<PublisherDto> findByPhone(String phone) {
		return publisherMapper.findByPhone(phone);	}
	
	
//	@Override
//	public List<PublisherDto> findAll() {
//		return publisherMapper.findAll();
//	}
//
//	@Override
//	public PublisherDto findById(int pubId) {
//		return publisherMapper.findById(pubId);
//	}
//
//	@Override
//	public List<PublisherDto> findByPubName(String pubName) {
//		return publisherMapper.findByPubName(pubName);
//	}
//
//	@Override
//	public List<PublisherDto> findByMgrName(String mgrName) {
//		return publisherMapper.findByMgrName(mgrName);
//	}
//
//	@Override
//	public List<PublisherDto> findByPhone(String phone) {
//		return publisherMapper.findByPhone(phone);
//	}
//
//	@Override
//	public void add(PublisherDto publisher) {
//		publisherMapper.add(publisher);
//		
//	}

}
