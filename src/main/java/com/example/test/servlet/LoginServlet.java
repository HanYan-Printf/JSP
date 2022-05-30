package com.example.test.servlet;

import com.example.test.beans.Users;
import com.example.test.beans.DataBase;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet",value = "/servlet/LoginServlet")
    public class LoginServlet extends HttpServlet {
    @Override
        protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
            response.setContentType("text/html;charset= UTF-8");
            boolean login = false;
            String success = "登录成功";
            String failure = "账号或密码错误";
            PrintWriter out = response.getWriter();
            Users user = new Users();
            DataBase checklogin = new DataBase();
            login = checklogin.CheckLogin(request.getParameter("email"),request.getParameter("password"));
            if(login){
                out.println("<script type=\"text/javascript\">");
                out.println("alert(\"登录成功！\");window.location.href=\"../JSP商家后台商品信息管理系统/index.html\"");
                out.println("</script>");
            }
            else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert(\"账号或密码错误！\");history.go(-1);");
                out.println("</script>");
            }
    }
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
        }
    }
