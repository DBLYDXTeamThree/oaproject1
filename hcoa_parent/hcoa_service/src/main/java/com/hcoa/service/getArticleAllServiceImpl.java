package com.hcoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.SendArticleAttachMapper;
import com.hcoa.dao.SendArticleMapper;
import com.hcoa.dao.StaffInfoMapper;
import com.hcoa.entity.SendArticle;
import com.hcoa.entity.SendArticleAttach;
import com.hcoa.entity.SendArticleAttachExample;
import com.hcoa.entity.SendArticleExample;
import com.hcoa.entity.StaffInfo;

@Service
public class getArticleAllServiceImpl implements getArticleAllService{
	@Autowired SendArticleMapper sam;
	@Autowired SendArticleAttachMapper saam;
    @Autowired StaffInfoMapper sim;
	public List<SendArticle> findall() {
		List<SendArticle> list=sam.selectByExample(new SendArticleExample());
		return list;
	}

	public String findChecker(Long checker) {
        String str=sam.findCheckername(checker);
		return str;
	}

	public String findDept(long l) {
		String str=sam.findDeptName(l);
		return str;
	}

	public List<SendArticleAttach> select() {
		List<SendArticleAttach> list=saam.selectByExample(new SendArticleAttachExample());
		return list;
	}

	public List<SendArticleAttach> selectFile(Long id) {
		List<SendArticleAttach> list=saam.selectFire(id);
		return list;
	}

	public StaffInfo getName(Long createby) {
		StaffInfo list=sam.getname(createby);
		return list;
	}



	public List<SendArticleAttach> selectOne(Long id) {
		List<SendArticleAttach> list=saam.selectByid(id);
		return list;
	}
}
