package dao.impl;

import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import dao.CustomerDao;
import domain.Customer;

public class JdbcCustomerDao extends JdbcDaoSupport implements CustomerDao {

	
	@SuppressWarnings("unchecked")
	public List<Customer> getAll() {
        return getJdbcTemplate().query("select * from t_customer",
                ParameterizedBeanPropertyRowMapper.newInstance(Customer.class));		
	}

}
