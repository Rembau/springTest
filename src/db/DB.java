package db;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DB {
	static JdbcTemplate db;
	public static void main(String[] args) {
		String xmlPath = "classpath:applicationContext.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(xmlPath);
		db = (JdbcTemplate) ac.getBean("dbTem");
		getListTest();
	}
	public static void getListTest(){
		List<Map<String,Object>> list= db.queryForList("select * from test;");
		for (Map<String, Object> map : list) {
			Iterator<?> it = map.keySet().iterator();
			while(it.hasNext()){
				String str = (String) it.next();
				System.out.print("key="+str+",value="+map.get(str));
			}
			System.out.println();
		}
	}
}
