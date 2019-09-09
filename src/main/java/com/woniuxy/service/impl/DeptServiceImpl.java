package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.DeptMapper;
import com.woniuxy.domain.Dept;
import com.woniuxy.domain.DeptExample;
import com.woniuxy.service.IDeptService;

@Service
@Transactional
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private DeptMapper dm;
	
	
	@Override
	public void save(Dept dept) {
		dm.insertSelective(dept);
	}

	@Override
	public void delete(Integer did) {

		dm.deleteByPrimaryKey(did);
	}

	@Override
	public void update(Dept dept) {

		dm.updateByPrimaryKeySelective(dept);
	}

	@Override
	public Dept findOne(Integer did) {
		Dept dept = dm.selectByPrimaryKey(did);
		return dept;
	}

	@Override
	public List<Dept> findAll() {
		List<Dept> list = dm.selectByExample(null);
		return list;
	}

}
