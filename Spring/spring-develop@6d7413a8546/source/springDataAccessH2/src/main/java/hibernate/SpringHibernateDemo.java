package hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.CustomerDao;
import domain.Customer;

public class SpringHibernateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    ApplicationContext ctx = new ClassPathXmlApplicationContext(
	    							"/META-INF/spring/springhibernatedemo-context.xml");
	 
	    CustomerDao customerDao = (CustomerDao)ctx.getBean("customerDAO");
	 
	    List<Customer> list = customerDao.getAll();
	    for (Customer customer : list) {
			System.out.println(customer.getId());
		}
	}
}
