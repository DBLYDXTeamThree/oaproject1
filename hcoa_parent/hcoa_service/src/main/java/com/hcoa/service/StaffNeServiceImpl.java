package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.ForumMapper;
import com.hcoa.entity.Forum;

@Service
public class StaffNeServiceImpl implements StaffNeService {

	@Autowired
	ForumMapper forumMapper;
	
	public List<Forum> getAll() {
		return forumMapper.selectAll();
	}

	public List<Forum> getById(Long id) {
		return forumMapper.selectById(id);
	}

	public Forum getOne(Long id) {
		return forumMapper.selectOne(id);
	}

	public void insertOne(Forum f) {
		forumMapper.insertSelective(f);
	}

	public void delById(Long id) {
		forumMapper.delById(id);
		
	}

}
