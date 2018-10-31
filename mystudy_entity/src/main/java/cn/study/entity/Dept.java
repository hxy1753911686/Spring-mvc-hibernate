package cn.study.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity
@Table(name="dept")
public class Dept {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer deptno;
	
	@Column
	private String deptname;

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
}
