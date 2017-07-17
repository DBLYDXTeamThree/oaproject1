package com.hcoa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcoa.entity.SendArticle;
import com.hcoa.entity.SendArticleAttach;
import com.hcoa.entity.StaffInfo;

@Service
public interface getArticleAllService {

	List<SendArticle> findall();

	String findChecker(Long checker);

	String findDept(long l);

	List <SendArticleAttach> select();

	List<SendArticleAttach> selectFile(Long id);

	StaffInfo  getName(Long createby);

	List<SendArticleAttach> selectOne(Long id);

}
