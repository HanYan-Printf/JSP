<%@page import="com.example.test.beans.Users" %>
<%@ page import="com.example.test.beans.CRLF" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: 17132
  Date: 2022/5/6
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="User" class="com.example.test.beans.Users"/>
<jsp:setProperty name="User" property="*"/>
<jsp:useBean id="dataBase" class="com.example.test.beans.DataBase"/>
<%
    User.setEmail(CRLF.toUTF8(User.getEmail()));
    User.setPassword(CRLF.toUTF8(User.getPassword()));
    try{
        dataBase.insertPerson(User);
        response.sendRedirect("http://localhost:8080/test_war_exploded/JSP%E5%95%86%E5%AE%B6%E5%90%8E%E5%8F%B0%E5%95%86%E5%93%81%E4%BF%A1%E6%81%AF%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F/index.html");
//        System.out.println(CRLF.toUTF8(User.getEmail()));
//        System.out.println(CRLF.toUTF8(User.getPassword()));
    } catch (Exception e){
        e.printStackTrace();
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
