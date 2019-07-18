package transaction;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 事务测试 启动器
 * @author JingQ at 2019-06-25
 */
public class TransactionBootstrap {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("transaction/transaction.xml");
			UserJdbcTemplate jdbcTemplate = (UserJdbcTemplate) context.getBean("userJdbcTemplate");
			System.out.println("--- Records Creation start ----");
			JdbcUser user = new JdbcUser(4, "test", 21);
			jdbcTemplate.insertUser(user);
	}

}
