package pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * many-to-one relationship
 * :
 * many employees can have the (one)same company address.
 Many Vehicle belong to person(user)
 */
@Entity
@Table(name = "EmpM2O")
public class ManyEmp 
{
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 100)
	@GeneratedValue(generator = "mySeqGen")
	@Column(name = "EmpId")
	int eid;
	@Column(name = "EmpName", nullable = false, length = 100)
	String name;
	@ManyToOne(cascade = CascadeType.ALL)
	CompanyAddress EmpAddr;
	public ManyEmp(String name, CompanyAddress EmpAddr) {
		super();
		this.name = name;
		this.EmpAddr = EmpAddr;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CompanyAddress getAddr1() {
		return EmpAddr;
	}
	public void setAddr1(CompanyAddress EmpAddr) {
		this.EmpAddr = EmpAddr;
	}
	
}