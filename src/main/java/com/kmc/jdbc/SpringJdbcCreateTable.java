package com.kmc.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcCreateTable {
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void createTable() {
		jt.execute("create table sptest(sno number(3), sname varchar(10))");
		// execute() returns void
		System.out.println("table created");
	}

	public void loadAll() {
		List l = jt.queryForList("select * from EMP");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o.toString());
		}
	}
}
