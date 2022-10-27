package itsjava.fourth_step.jdbc.dao;

import java.sql.*;

public class UsersJdbcImpl implements UserDao{
    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone = UTC";
    public static final String DB_LOGIN = "login";
    public static final String DB_PASSWORD = "password";


    @Override
    public int getAgeByUserName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select age from schema_online_course.users where name = ?")
        ){
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
