package cn.study.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.study.entity.Dept;
import cn.study.service.IDeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	public DeptController(){
		System.out.println("进来了");
	}
	
	@Resource(name="deptService")
	/*@Autowired*/
	private IDeptService deptService;
	
	public IDeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	@RequestMapping(value="/adds",method=RequestMethod.POST)
	public String add(Dept dept){
		deptService.addDept(dept);
		return "/WEB-INF/jsps/login.jsp";
	}
}
