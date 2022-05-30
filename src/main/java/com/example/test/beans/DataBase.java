package com.example.test.beans;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private String url="jdbc:mysql://localhost:3306/Users";
    private String name="root";
    private String password="122282";
    private static Connection connection=null;
    public DataBase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,name,password);
//            if(connection!=null){
//                System.out.println("正常");
//            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertPerson(Users users){
        DataBase dataBase = new DataBase();
        String sql="insert into user values (?,?)";
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1, users.getEmail());
            preparedStatement.setString(2, users.getPassword());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean CheckLogin(String email,String password) {
        String sql = "select * from user where email =? AND password=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String result = resultSet.getString("email");
                System.out.println("OK");
                return true;
            } else {
                System.out.println("账号或密码错误");
                return false;
            }
//            while (resultSet.next()){
//                String email=resultSet.getString("email");
//                System.out.println(email);
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
//    public static void main(String[] args){
//        DataBase dataBase=new DataBase();
//        dataBase.CheckLogin("17616251128","122282");
//    }
//    public List<Users> findAll(){
//        String sql="select * from user";
//        List<Users> users=new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement=connection.prepareStatement(sql);
//            preparedStatement.execute();
//            ResultSet resultSet= preparedStatement.executeQuery();
//            while(resultSet.next()){
//                Users user=new Users();
//                resultSet.getString(1);
//                user.setEmail(resultSet.getString("email"));
//                user.setPassword(resultSet.getString("password"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return users;
//    }

//    public static void main(String[] args) {
//        Users users=new Users();
//        users.setEmail(users.getEmail());
//        users.setPassword(users.getPassword());
//        System.out.println(users.getEmail());
//        System.out.println(users.getPassword());
//    }

}
