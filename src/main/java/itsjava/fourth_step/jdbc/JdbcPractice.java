package itsjava.fourth_step.jdbc;

import itsjava.fourth_step.jdbc.dao.EmployerDao;
import itsjava.fourth_step.jdbc.dao.EmployerJdbcImpl;
import itsjava.fourth_step.jdbc.dao.UserDao;
import itsjava.fourth_step.jdbc.dao.UsersJdbcImpl;

import java.sql.*;

public class JdbcPractice {
//    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone = UTC";


    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//            Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT name, age FROM schema_online_course.employers");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name") + ":" + resultSet.getInt("age"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        EmployerDao dao = new EmployerJdbcImpl();
        System.out.println("dao.findAgeByName(\"tanya\") = " + dao.findAgeByName("tanya"));

        UserDao userDao = new UsersJdbcImpl();
        System.out.println("userDao.getAgeByUserName(\"user_1\") = " + userDao.getAgeByUserName("user_1"));
    }
}
