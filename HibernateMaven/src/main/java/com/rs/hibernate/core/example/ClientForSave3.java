package com.rs.hibernate.core.example;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ClientForSave3 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		/*
		 * Query qry =
		 * session.createQuery("delete from Product p where p.productId=:id");
		 */
		/*
		 * Query qry = session.createQuery("from Product p where p.productId=:id");
		 * qry.setParameter("id", 1); int res = qry.executeUpdate();
		 * System.out.println("Numer of records effected due to delete query"+res);
		 */

		/*
		 * Query qry =
		 * session.createQuery("update Product p set p.proName=? where p.productId=2");
		 * qry.setParameter(0, "success.."); int res = qry.executeUpdate();
		 */
		/*
		 * Query qry = session.
		 * createQuery("insert into Product(productId,proName,price) select i.itemId,i.itemName,i.itemPrice from Items i where i.itemId= ?"
		 * ); qry.setParameter(0,600); int res = qry.executeUpdate();
		 * 
		 * System.out.println("Numer of records effected due to delete query: " + res);
		 */

		/*
		 * Query qry = session.createQuery("from Product p");
		 * 
		 * List l =qry.list();
		 * System.out.println("Total Number Of Records : "+l.size()); Iterator it =
		 * l.iterator();
		 * 
		 * while(it.hasNext()) { Object o = (Object)it.next(); Product p = (Product)o;
		 * System.out.println("Product id : "+p.getProductId());
		 * System.out.println("Product Name : "+p.getProName());
		 * System.out.println("Product Price : "+p.getPrice()); }
		 * 
		 * Query qry =
		 * session.createQuery("select p.productId,p.proName from Product p");
		 * 
		 * List l =qry.list();
		 * System.out.println("Total Number Of Records : "+l.size()); Iterator it =
		 * l.iterator();
		 * 
		 * while(it.hasNext()) { Object o[] = (Object[])it.next();
		 * 
		 * System.out.println("Product id : "+o[0]+ "Product Name : "+o[1]);
		 * 
		 * System.out.println("----------------"); }
		 */
		/*
		 * Query qry = session.createQuery("select p.productId from Product p");
		 * 
		 * List l =qry.list();
		 * System.out.println("Total Number Of Records : "+l.size()); Iterator it =
		 * l.iterator();
		 * 
		 * while(it.hasNext()) { Integer i = (Integer)it.next();
		 * System.out.println("Product id : "+i.intValue());
		 * System.out.println("---------------------------");
		 * 
		 * }
		 */

		/*
		 * Criteria crit = session.createCriteria(Product.class); //Criterion cn =
		 * Restrictions.gt("price",new Double(2000)); //crit.add(cn); List
		 * l=crit.list(); System.out.println("List total size..._"+l.size()); Iterator
		 * it=l.iterator();
		 * 
		 * while(it.hasNext()) { Product p=(Product)it.next();
		 * System.out.println(p.getProductId()); System.out.println(p.getProName());
		 * System.out.println(p.getPrice()); System.out.println("-----------------"); }
		 */
		//Criteria crit = session.createCriteria(Product.class);
		/*
		 * Criterion cn = Restrictions.gt("price",new Double(2000)); crit.add(cn);
		 * crit.addOrder(Order.asc("price")); List l=crit.list();
		 * System.out.println("List total size..._"+l.size()); Iterator it=l.iterator();
		 * 
		 * while(it.hasNext()) { Product p=(Product)it.next();
		 * System.out.println(p.getProductId()); //System.out.println(p.getProName());
		 * //System.out.println(p.getPrice()); }
		 */
		/*ProjectionList p1 = Projections.projectionList();
		p1.add(Projections.property("proName"));
		p1.add(Projections.property("price"));

		crit.setProjection(p1);

		List l = crit.list();

		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object ob[] = (Object[]) it.next();
			System.out.println(ob[0] + "--------" + ob[1]);
		}*/
		/*Query qry=session.getNamedQuery("Myquery");*/
		SQLQuery qry = session.createSQLQuery("select * from PRODUCTS");
		/*qry.setParameter("java4s", new Double(2000));*/

		List l=qry.list();
		System.out.println("List total size..._"+l.size());
		Iterator it=l.iterator();

		while(it.hasNext())
		{
			Object p[]=(Object[])it.next();
			System.out.println(p[0]+"   "+p[1]+"  "+p[2]);
			System.out.println("-----------------");
		}



		tx.commit();

		/*
		 * delete from Address where id= :id"); query.setLong("id", 4);
		 */
		/*
		 * Product p=new Product();
		 * 
		 * //p.setProductId(105); p.setProName("moto"); p.setPrice(2000d); //
		 * p.setVersion(2); Transaction tx = session.beginTransaction();
		 * session.save(p); tx.commit();
		 */
		/*
		 * Product product=new Product(); product.setProductId(105);
		 * product.setProName("moto"); product=(Product)
		 * session.get(Product.class,product); System.out.println(product.getPrice());
		 */
		/*
		 * Object o=session.load(Product.class,new Integer(102)); Product p=(Product)o;
		 */
		/* session.delete(p); */
		// p.setPrice(45000);
		// For loading Transaction scope is not necessary...
		// System.out.println("Loaded object product name is___"+s.getProName());

		// System.out.println("Object saved successfully.....!!");

		session.close();
		factory.close();
	}
}
