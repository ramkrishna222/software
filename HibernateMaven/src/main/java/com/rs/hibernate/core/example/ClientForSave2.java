package com.rs.hibernate.core.example;



	import org.hibernate.*;
	import org.hibernate.cfg.*;

	public class ClientForSave2 { 

		public static void main(String[] args)
		{

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 

			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			Product p=new Product(); 

			//p.setProductId(105);
			p.setProName("moto");
			p.setPrice(2000d);
           // p.setVersion(2);
			Transaction tx = session.beginTransaction();
			session.save(p);
			tx.commit();
			/*Product product=new Product();
			product.setProductId(105);
			product.setProName("moto");
			product=(Product) session.get(Product.class,product);
			System.out.println(product.getPrice());*/
			/*Object o=session.load(Product.class,new Integer(102));
			Product p=(Product)o;*/
			/*session.delete(p);*/
			//p.setPrice(45000);  
			// For loading Transaction scope is not necessary...
			//System.out.println("Loaded object product name is___"+s.getProName());
			
			System.out.println("Object saved successfully.....!!");
			
			session.close();
			factory.close();
		}

	}

