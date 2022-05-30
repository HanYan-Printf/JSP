package com.example.test.servlet;

import com.example.test.beans.CRLF;
import com.example.test.beans.DataBase;
import com.example.test.beans.Users;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet",value = "/servlet/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset= UTF-8");
        Users user = new Users();
        DataBase database = new DataBase();
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        try{
            database.insertPerson(user);
            PrintWriter out = response.getWriter();
//        response.sendRedirect("http://localhost:8080/test_war_exploded/JSP%E5%95%86%E5%AE%B6%E5%90%8E%E5%8F%B0%E5%95%86%E5%93%81%E4%BF%A1%E6%81%AF%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F/index.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert(\"注册成功！\");window.location.href=\"../JSP商家后台商品信息管理系统/index.html\"");
            out.println("</script>");
//        System.out.println(CRLF.toUTF8(User.getEmail()));
//        System.out.println(CRLF.toUTF8(User.getPassword()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
