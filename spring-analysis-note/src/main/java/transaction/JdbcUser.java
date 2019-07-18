package transaction;

/**
 * 数据库测试类
 *
 * 建表语句：
 *
 * create table test.user(id int auto_increment	 primary key, name varchar(20) null, age int(3) null)engine=MyISAM charset=utf8;
 *
 * @author JingQ at 2019-06-24
 */
public class JdbcUser {

	private Integer id;

	private String name;

	private Integer age;

	public JdbcUser() {
	}

	public JdbcUser(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "JdbcUser{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
