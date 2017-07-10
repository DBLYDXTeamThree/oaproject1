package com.hcoa.service;


import java.util.List;

import com.hcoa.entity.Forum;

public interface StaffNeService {

	List<Forum> getAll();

	List<Forum> getById(Long id);

	Forum getOne(Long id);

	void insertOne(Forum f);

	void delById(Long id);

}
