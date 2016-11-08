package com.caveofprogramming.spring.test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OfferDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public List<Offer> getAllOffers() {
		return null;
	}

	@Autowired
	public void setJdbcTemplate(DataSource jdbcTemplate) {
		this.jdbcTemplate = new JdbcTemplate(jdbcTemplate);
	}
}
