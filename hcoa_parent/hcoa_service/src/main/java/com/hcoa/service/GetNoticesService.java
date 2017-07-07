package com.hcoa.service;

import java.util.List;

import com.hcoa.entity.Notices;

public interface GetNoticesService {

	List<Notices> getNotices();
	Notices getDetail(Long id);
	void noticeDel(Long id);
	void addNotice(Notices n);
}
