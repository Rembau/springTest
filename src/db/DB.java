package db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DB {

	public static void main(String[] args) {
		String xmlPath = "classpath:applicationContext.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(xmlPath);
		JdbcTemplate db = (JdbcTemplate) ac.getBean("dbTem");
		int count = db.queryForInt("select count(*) from test;");
		System.out.println(count);
	}
}
