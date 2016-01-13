package no.thremains.pro.one.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:spring.xml", "classpath:spring-hibernate.xml" })
public class TestCase {
	
	@Autowired
	private SessionFactory factory;
	private Session session;

	@Before
	public void init(){
		try {
			session = factory.getCurrentSession();
		} catch (Exception e) {
			session = factory.openSession();
			System.out.println("error!");
		}
	}
	
	
	@Test
	public void testOne() {
		System.out.println(session);
	}
}
