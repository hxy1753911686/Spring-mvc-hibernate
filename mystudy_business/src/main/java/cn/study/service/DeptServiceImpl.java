package cn.study.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cn.study.dao.IDeptDao;
import cn.study.entity.Dept;

@Service("deptService")
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDao dao;
	
	public IDeptDao getDao() {
		return dao;
	}

	public void setDao(IDeptDao dao) {
		this.dao = dao;
	}

	@Transactional
	@Override
	public int addDept(Dept dept) {
		return dao.addDept(dept);
	}

}
