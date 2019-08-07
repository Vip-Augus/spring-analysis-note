package transaction;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 映射
 * @author JingQ at 2019-06-24
 */
public class UserRowMapper implements RowMapper<JdbcUser> {


	@Override
	public JdbcUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		JdbcUser user = new JdbcUser();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getInt("age"));
		return user;
	}
}
