package com.woniuxy.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.woniuxy.domain.Dept;


public interface IDeptService {
	
	void save(Dept dept);
	void delete(Integer did);
	void update(Dept dept);
	Dept findOne(Integer did);
	List<Dept> findAll();
}
