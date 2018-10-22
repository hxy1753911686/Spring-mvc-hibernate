package cn.study.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.study.entity.Dept;
import cn.study.service.IDeptService;

@Controller
public class DeptController {
	@Resource(name="deptService")
	private IDeptService deptService;
	
	public IDeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	@RequestMapping("/adds")
	public String add(Dept dept){
		deptService.addDept(dept);
		return "login";
	}
}
