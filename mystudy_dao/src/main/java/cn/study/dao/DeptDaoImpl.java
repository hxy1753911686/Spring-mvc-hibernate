package cn.study.dao;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.study.entity.Dept;

@Repository("deptDao")
public class DeptDaoImpl implements IDeptDao {
	@Resource
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int addDept(Dept dept) {
		Serializable count = sessionFactory.getCurrentSession().save(dept);
		return (int) count;
	}

}
