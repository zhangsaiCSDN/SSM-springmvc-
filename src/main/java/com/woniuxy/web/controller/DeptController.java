package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Dept;
import com.woniuxy.service.IDeptService;

@Controller
@RequestMapping("depts")
public class DeptController {

	@Autowired
	private IDeptService ds;
	
	@PostMapping
	@ResponseBody
	public void save(Dept dept) {

		ds.save(dept);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer did) {
		ds.delete(did);
	}
	
	
	@PutMapping
	@ResponseBody
	public void update(Integer did) {
		ds.update(ds.findOne(did));
	}
	
	@GetMapping
	@ResponseBody
	public List<Dept> find() {
		List<Dept> list = ds.findAll();
		return list;
	} 
}
