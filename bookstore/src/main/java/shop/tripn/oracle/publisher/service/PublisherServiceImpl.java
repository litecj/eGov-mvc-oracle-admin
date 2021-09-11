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
	public List<PublisherDto> findAll() {
		return publisherMapper.findAll();
	}

	@Override
	public PublisherDto findById(int pubId) {
		return publisherMapper.findById(pubId);
	}

	@Override
	public List<PublisherDto> findByPubName(String pubName) {
		return publisherMapper.findByPubName(pubName);
	}

	@Override
	public List<PublisherDto> findByMgrName(String mgrName) {
		return publisherMapper.findByMgrName(mgrName);
	}

	@Override
	public List<PublisherDto> findByPhone(String phone) {
		return publisherMapper.findByPhone(phone);
	}

}
