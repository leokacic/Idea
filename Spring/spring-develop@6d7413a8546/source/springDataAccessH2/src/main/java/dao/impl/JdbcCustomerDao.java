package dao.impl;

import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import dao.CustomerDao;
import domain.Customer;

public class JdbcCustomerDao extends JdbcDaoSupport implements CustomerDao {

    public List<Customer> getAll() {
        List<Customer> customers = (List<Customer>) getJdbcTemplate().query("select * from t_customer",
                new CustomerRowMapper());
        return customers;
    }

}
