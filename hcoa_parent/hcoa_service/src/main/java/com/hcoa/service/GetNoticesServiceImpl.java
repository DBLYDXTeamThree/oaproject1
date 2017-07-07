package com.hcoa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcoa.dao.NoticesMapper;
import com.hcoa.entity.Notices;
import com.hcoa.entity.NoticesExample;
@Service
public class GetNoticesServiceImpl implements GetNoticesService{

	@Autowired
	NoticesMapper noticesMapper;
	/**
	 * 查询全部通告
	 */
	public List<Notices> getNotices() {
		NoticesExample e1=new NoticesExample();
		e1.createCriteria().andIdIsNotNull();
		List<Notices> list=noticesMapper.selectByExampleWithBLOBs(e1);
		return list;
	}

	/**
	 * 查询通告详情
	 */
	public Notices getDetail(Long id) {
		Notices notice=noticesMapper.selectByPrimaryKey(id);
		return notice;
	}

	/**
	 * 删除通告
	 */
	public void noticeDel(Long id) {
		noticesMapper.deleteByPrimaryKey(id);
		
	}

	/**
	 * 添加通告
	 */
	public void addNotice(Notices n) {
		n.setCreatetime(new Date());
		noticesMapper.insertSelective(n);
	}

}
