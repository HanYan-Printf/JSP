<%--
  Created by IntelliJ IDEA.
  User: 17132
  Date: 2022/5/11
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="User" class="com.example.test.beans.Users"/>
<%@page import="com.example.test.beans.DataBase" %>
<jsp:setProperty name="User" property="*"/>
<jsp:useBean id="login" class="com.example.test.beans.DataBase"/>
<%
    boolean result=false;
    result=login.CheckLogin(User.getEmail(), User.getPassword());
    if(result){
%>
<script>
    alert("登录成功");
    window.location.href="../index.html";
</script>
<%
    }else{
%>
<script>
    alert("账号或密码错误");
    history.go(-1);
</script>
<%
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
