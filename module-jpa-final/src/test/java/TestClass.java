import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;

import com.bergit.jpa.model.User;


public class TestClass {

	private static final Logger logger = Logger.getLogger(TestClass.class);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {/*
		logger.info("---------Invoke test---------");
		 
		try {
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/applicationContextJar.xml"});
			JpaTransactionManager tM=(JpaTransactionManager) app.getBean("transactionManager-seconde");	
			EntityManagerFactory emf=tM.getEntityManagerFactory();
			String queryString = "SELECT c FROM User c";
			EntityManager em = emf.createEntityManager();
			Query query = em.createQuery(queryString); 
			List<User> response=  query.getResultList();
			System.out.println("RESULT "+response.get(0).getFirstname());
			assertTrue(true);
			} catch (Exception e) {
			assertTrue(e.getMessage().toString(),false);
			}*/
	}

}
