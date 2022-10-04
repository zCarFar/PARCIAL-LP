package upeu.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.dao.Todo;
import upeu.edu.pe.daoimpl.OrdersDaoimpl;
import upeu.edu.pe.entity.Orders;

@Service
public class OrdersService implements Todo<Orders>{
	
	@Autowired
	private OrdersDaoimpl countryDao;

	@Override
	public List<Orders> readAll() {
		// TODO Auto-generated method stub
		return countryDao.readAll();
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