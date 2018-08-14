package com.rs.hibernate.core.example.relations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



	public class OurLogic {

	public static void main(String args[])
	{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	//parent object
	
	/*Vendor v =new Vendor();

	v.setVendorId(103);
	v.setVendorName("java4s");

	//creating 3 child objects
	Customer c1=new Customer();

	c1.setCustomerId(11);
	c1.setCustomerName("a8");

	Customer c2=new Customer();

	c2.setCustomerId(12);
	c2.setCustomerName("a9");

	Customer c3=new Customer();

	c3.setCustomerId(13);
	c3.setCustomerName("a10");

	// adding child objects to set, as we taken 3rd property set in parent
	Set<Customer> s=new HashSet<Customer>();

	s.add(c1);
	s.add(c2);
	s.add(c3);

	v.setCustomers(s); 
	*/
	/*Object o = session.get(Vendor.class, new Integer(103));
	Vendor v = (Vendor)o;
	System.out.println(v.getVendorId());
	System.out.println(v.getVendorName());

	Set s=v.getCustomers();
	Iterator it = s.iterator();

	while(it.hasNext())
	{

	Object o1 = it.next();
	Customer c = (Customer) o1;
	System.out.println("---------------------------");
	System.out.println("Customer objects...");
	System.out.println("---------------------------");
	System.out.println(c.getCustomerId());
	System.out.println(c.getCustomerName());
	System.out.println(c.getVendorId());
	System.out.println("---------------------------");
	}
*/
	Query qry =session.createQuery("from Vendor v");
	List l=qry.list();
	Iterator it = l.iterator();

	while(it.hasNext())
	{

	Object o = it.next();
	Vendor v = (Vendor) o;
	System.out.println(v.getVendorId()+ " " +v.getVendorName());
	

	Set s= v.getCustomers();
	Iterator it1=s.iterator();

	while(it1.hasNext())
	{
	Customer c = (Customer) it1.next();
	System.out.println(c.getCustomerId()+" "+c.getCustomerName()+ " "+ c.getVendorId());

	}

	}
	/*Transaction tx = session.beginTransaction();
	Object o = session.get(Vendor.class, new Integer(101));
	Vendor v = (Vendor)o;*/

	//Transaction tx = session.beginTransaction();
	//session.delete(v);
	//session.delete(v);

	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	factory.close();

	}

}
