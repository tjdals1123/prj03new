package org.ict.service;

import java.util.List;

import org.ict.domain.BoardAttachVO;
import org.ict.mapper.BoardAttachMapper;
import org.springframework.beans.factory.annotation.Autowired;

import jdk.internal.org.jline.utils.Log;

public class BoardAttachServiceImpl implements BoardAttachService {

	@Autowired
	private BoardAttachMapper mapper;
	
	@Override
	public void insert(BoardAttachVO vo) {
		mapper.insert(vo);
	}

	@Override
	public void delete(String uuid) {
		mapper.delete(uuid);
	}

	@Override
	public List<BoardAttachVO> findByBno(Long bno) {
		return mapper.findByBno(bno);
	}

	@Override
	public List<BoardAttachVO> getAttachList(Long bno) {
		
		Log.info("get Attach list : " + bno);
		
		return mapper.findByBno(bno);
	}

}
