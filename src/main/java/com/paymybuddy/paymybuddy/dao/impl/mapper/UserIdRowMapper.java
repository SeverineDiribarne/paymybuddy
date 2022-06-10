package com.paymybuddy.paymybuddy.dao.impl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.paymybuddy.paymybuddy.model.Customer;

public class UserIdRowMapper implements RowMapper<Customer>{

	/**
	 * retrieves the information of customerId in the database
	 */
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Customer( rs.getInt("id"));
	}
}