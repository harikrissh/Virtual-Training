package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.CompanyAddress;
import pojo.ManyEmp;

public class ManyToOneMain
{
	public static void main(String[] args) {
	Session s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction t=s.beginTransaction();
	CompanyAddress address = new CompanyAddress("Navalur, Chennai", "TN");
	CompanyAddress address1 = new CompanyAddress("Aluva, Kerala", "KER");
	//By using cascade=all option the address need not be 
	//saved explicitly when the employee 
	//object is persisted the address will be automatically saved.
	            //session.save(address);//not needed
	ManyEmp s1 = new ManyEmp("Hk", address);
	ManyEmp s2 = new ManyEmp("Pk", address);
	ManyEmp s3 = new ManyEmp("Cj", address1);
	ManyEmp s4 = new ManyEmp("Mani", address1);
	s.save(s1);
	s.save(s2);
	s.save(s3);
	s.save(s4);
	t.commit();
	}

}