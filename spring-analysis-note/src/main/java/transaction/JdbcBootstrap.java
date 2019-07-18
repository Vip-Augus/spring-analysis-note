package transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * jdbc 和 transaction 启动类
 * @author JingQ at 2019-06-24
 */
public class JdbcBootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("transaction/transaction.xml");
		UserJdbcTemplate jdbcTemplate = (UserJdbcTemplate) context.getBean("userJdbcTemplate");
		System.out.println("--- Records Creation start ----");
		JdbcUser user = new JdbcUser(3, "名字", 18);
		jdbcTemplate.insertUser(user);
		System.out.println("--- Records Creation end ---");
		System.out.println("--- Multiple Records search start ---");
		List<JdbcUser> users = jdbcTemplate.selectAll();
		System.out.println("size : " + users.size());
		for (JdbcUser tmp : users) {
			System.out.println(tmp.toString() + "\n");
		}
		System.out.println("--- Multiple Records search end ---");
	}

	// 最后输出结果：
	//--- Records Creation start ----
	//Create record : JdbcUser{id=3, name='名字', age=18}
	//--- Records Creation end ---
	//--- Multiple Records search start ---
	//size : 3（前面两条是之前插入的数据）
	//JdbcUser{id=1, name='wahaha', age=18}
	//
	//JdbcUser{id=2, name='stu001', age=20}
	//
	//JdbcUser{id=3, name='名字', age=18}
	//
	//--- Multiple Records search end ---
}
