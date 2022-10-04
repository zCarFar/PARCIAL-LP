package upeu.edu.pe.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.dao.Todo;
import upeu.edu.pe.entity.Orders;

@Component
public class OrdersDaoimpl implements Todo<Orders>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Orders> readAll() {
		String query = "SELECT o.OrderID, o.ShipCountry FROM orders o JOIN customers c ON o.CustomerID = c.CustomerID;";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Orders>(Orders.class));
	}

	@Override
	public int create(Orders t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Orders t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orders read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}