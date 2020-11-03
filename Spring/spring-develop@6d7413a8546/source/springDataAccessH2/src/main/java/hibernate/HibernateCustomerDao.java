package hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.CustomerDao;
import domain.Customer;

public class HibernateCustomerDao implements CustomerDao {

    protected HibernateTemplate template = null;

    public void setSessionFactory(SessionFactory sessionFactory) {
        template = new HibernateTemplate(sessionFactory);
    }

    @SuppressWarnings("unchecked")
    public List<Customer> getAll() {
    	return template.find("from Customer");
    }

}
