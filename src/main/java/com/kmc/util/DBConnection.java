package com.kmc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kmc.jdbc.SpringJdbcCreateTable;

public class DBConnection {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/user-beans.xml");

	SpringJdbcCreateTable st = (SpringJdbcCreateTable) applicationContext.getBean("id3");
	st.loadAll();

}
}
