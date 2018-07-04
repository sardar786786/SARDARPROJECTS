package com.Acc.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class naveenDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;	
		}
	
	public int savenaveen(naveen n1){
		String sql="insert into naresh values('"+n1.getId()+"','"+n1.getName()+"')";
		return jdbcTemplate.update(sql);
		
	}

}
