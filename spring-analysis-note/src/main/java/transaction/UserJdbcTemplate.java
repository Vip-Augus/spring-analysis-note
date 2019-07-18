package transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

/**
 * dao 实现
 * @author JingQ at 2019-06-24
 */
public class UserJdbcTemplate implements UserDao {

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;


	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void insertUser(JdbcUser user) {
		String sql = "insert into user (id, name, age) values (?, ?, ?)";
		jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge());
		System.out.println("Create record : " + user.toString());

		// 事务测试，抛出异常，让上面的插入操作回滚
		throw new RuntimeException("aa");
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		String sql = "delete from user where id = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("Delete record, id = " + id);
	}


	@Override
	public List<JdbcUser> selectAll() {
		String sql = "select * from user";
		List<JdbcUser> users = jdbcTemplate.query(sql, new UserRowMapper());
		return users;
	}



	public void setDataSource(DataSource dataSource) {
		// 使用 setter 注入参数时，同时初始化 jdbcTemplate
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
