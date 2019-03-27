package com.ejb;

import javax.sql.DataSource;

import com.project.User;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.sql.*;
import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * Session Bean implementation class UserDAO
 */
public class UserDAO {

	@Resource(name = "jdbc/demoProject")
	private DataSource ds;

	public void addUser(User user) {
		String sql = "INSERT INTO 'demoProject'.'user'" + "('Name','Surname','BirthDate','BirthPlace',"
				+ "'Email','Phone','Gender','GradDegree'," + "'Address_1','Address_2','Country','State',"
				+ "'ZipCode','RegDate')" + "VALUES('" + user.getName() + "','" + user.getSurname() + "'," + "'"
				+ user.getBirthDate() + "','" + user.getBirthPlace() + "'," + "'" + user.getEmail() + "','"
				+ user.getPhone() + "'," + "'" + user.getGender() + "','" + user.getGradDegree() + "'," + "'"
				+ user.getAddress_1() + "','" + user.getAddress_2() + "'," + "'" + user.getCountry() + "','"
				+ user.getState() + "'," + "'" + user.getZipCode() + "','" + user.getRegDate() + "');";
		executeModifyQuery(sql);
	}

	public void updateUser(User user) {
		String sql = "UPDATE 'demoProject'.'user' SET" + " Name = '" + user.getName() + "', Surname = '"
				+ user.getSurname() + "'," + " BirthDate " + user.getBirthDate() + "', BirthPlace = '"
				+ user.getBirthPlace() + "'," + " Email = '" + user.getEmail() + ", Phone = '" + user.getPhone() + "', "
				+ " Gender = '" + user.getGender() + "' , GradDegree = '" + user.getGradDegree() + "',"
				+ " Address_1 = '" + user.getAddress_1() + "',Address_2 = '" + user.getAddress_2() + "',"
				+ " Country = '" + user.getCountry() + "', State = '" + user.getState() + "'," + " ZipCode = '"
				+ user.getZipCode() + "' , RegDate = '" + user.getRegDate() + "'" + " WHERE 'ID' = '" + user.getID()
				+ "';";
		executeModifyQuery(sql);
	}

	public void deleteUser(User user) {
		String sql = "DELETE FROM 'demoProject'.'user'" + " WHERE 'ID' = '" + user.getID() + "';";
		executeModifyQuery(sql);
	}

	public User getUser(String id) {
		User user = new User();
		String sql = "SELECT * FROM 'demoProject'.'user'" + " WHERE 'ID' = '" + id + "';";
		System.out.println(sql);
		ResultSet rs = executeFetchQuery(sql);
		try {
			if (rs.next()) {
				user.setID(rs.getInt("ID"));
				user.setName(rs.getString("Name"));
				user.setSurname(rs.getString("Surname"));
				user.setGender(rs.getString("Gender"));
				user.setPhone(rs.getString("Phone"));
				user.setEmail(rs.getString("Email"));
				user.setBirthDate(rs.getTimestamp("BirthDate"));
				user.setBirthPlace(rs.getString("BirthPlace"));
				user.setGradDegree(rs.getString("GradDegree"));
				user.setAddress_1(rs.getString("Address_1"));
				user.setAddress_2(rs.getString("Address_2"));
				user.setCountry(rs.getString("Country"));
				user.setState(rs.getString("State"));
				user.setZipCode(rs.getString("ZipCode"));
				user.setRegDate(rs.getTimestamp("RegDate"));

			}
		} catch (SQLException ex) {
			System.err.println("GS" + ex.getMessage());
		}
		return user;
	}

	public ArrayList<User> getAllUsers() {
		ArrayList<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM 'demoProject'.'user'";
		ResultSet rs = executeFetchQuery(sql);
		try {
			while (rs.next()) {
				User user = new User();
				user.setID(rs.getInt("ID"));
				user.setName(rs.getString("Name"));
				user.setSurname(rs.getString("Surname"));
				user.setGender(rs.getString("Gender"));
				user.setPhone(rs.getString("Phone"));
				user.setEmail(rs.getString("Email"));
				user.setBirthDate(rs.getTimestamp("BirthDate"));
				user.setBirthPlace(rs.getString("BirthPlace"));
				user.setGradDegree(rs.getString("GradDegree"));
				user.setAddress_1(rs.getString("Address_1"));
				user.setAddress_2(rs.getString("Address_2"));
				user.setCountry(rs.getString("Country"));
				user.setState(rs.getString("State"));
				user.setZipCode(rs.getString("ZipCode"));
				user.setRegDate(rs.getTimestamp("RegDate"));
				list.add(user);
			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return list;
	}

	public void executeModifyQuery(String sql) {
		try {
			Connection conn = ds.getConnection();
			conn.createStatement().execute(sql);
			conn.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public ResultSet executeFetchQuery(String sql) {
		ResultSet rs = null;
		try {
			Connection conn = ds.getConnection();
			rs = conn.createStatement().executeQuery(sql);
			conn.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return rs;
	}

}
