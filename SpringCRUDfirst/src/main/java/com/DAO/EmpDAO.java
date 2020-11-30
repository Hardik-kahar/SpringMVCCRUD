package com.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bean.Emp;

public class EmpDAO {

	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//for insert data
	public int insertData(Emp emp) {
		return jdbcTemplate.update("insert into employee (ename,econtact,eemail,ecity) values('" + emp.getEname()
				+ "','" + emp.getEcontact() + "','" + emp.getEemail() + "','" + emp.getEcity() + "')");
	}

	// for fetch all data in Show.jsp
	public List<Emp> getAllData() {
		return jdbcTemplate.query("select * from employee", new RowMapper<Emp>() {

			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setEcontact(rs.getInt(3));
				e.setEemail(rs.getString(4));
				e.setEcity(rs.getString(5));
				return e;
			}
		});
	}
	
	// for datele data 
	public int deletebyId(int id) {
		return jdbcTemplate.update("delete from employee where id=" + id);
	}
	
	// finally update data
	public int updatebyId(Emp e)
	{
		String sql="update employee set ename='"+e.getEname()+"',econtact='"+e.getEcontact()
		+"',eemail='"+e.getEemail()+"',ecity='"+e.getEcity()+"' where id='"+e.getId()+"'";
		return jdbcTemplate.update(sql);
	}

	// data fetch by id on update.jsp 
	public Emp getDataById(int id) {
		String sql="select * from employee where id=?";
		return jdbcTemplate.queryForObject ( sql, new Object[] {id}, new BeanPropertyRowMapper<Emp>(Emp.class));
	}
}


