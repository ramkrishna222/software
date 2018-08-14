package com.rs.hibernate.core.example.relations2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		/*
		 * Vendor v =new Vendor();
		 * 
		 * v.setVendorId(1); v.setVendorName("java");
		 * 
		 * Customer c1=new Customer();
		 * 
		 * c1.setCustomerId(1); c1.setCustomerName("customer4"); c1.setParentObjects(v);
		 * 
		 * Customer c2=new Customer();
		 * 
		 * c2.setCustomerId(2); c2.setCustomerName("customer5"); c2.setParentObjects(v);
		 * 
		 * Customer c3=new Customer();
		 * 
		 * c3.setCustomerId(3); c3.setCustomerName("customer6"); c3.setParentObjects(v);
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * session.save(c1); session.save(c2); session.save(c3);
		 */
		Transaction tx = session.beginTransaction();

		Object o = session.get(Customer.class, new Integer(507));
		Customer c = (Customer) o;

		session.delete(c);

		/*
		 * System.out.println(c.getCustomerName()); Vendor v=c.getParentObjects();
		 * System.out.println(v.getVendorName());
		 */

		tx.commit();
		session.close();
		System.out.println("Many To one is Done..!!");
		factory.close();

	}
}