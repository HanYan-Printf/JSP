<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商家后台商品信息管理系统</title>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="../dist/css/style.css">
<link rel="stylesheet" href="../pages/font-awesome/css/font-awesome.min.css">
</head>
<body class="body-bg-color">
<div class="wrapper">
  <div class="form-body">
    <form action="/test_war_exploded/servlet/LoginServlet" class="col-form" novalidate name="Form">
    <div class="col-logo"><a href="../index.html"></a></div>
      <header>登录</header>
      <fieldset>
        <section>
          <div class="form-group has-feedback">
            <label class="control-label">邮箱</label>
            <input class="form-control" placeholder="邮箱" type="text" name = "email">
            <span class="fa fa-envelope form-control-feedback" aria-hidden="true"></span> </div>
        </section>
        <section>
          <div class="form-group has-feedback">
            <label class="control-label">密码</label>
            <input class="form-control" placeholder="密码" type="password" name="password">
            <span class="fa fa-lock form-control-feedback" aria-hidden="true"></span> </div>
        </section>
        <section>
          <div class="row">
            <div class="col-md-6 checkbox"> <a href="forgot-password.html" class="modal-opener">忘记密码?</a> </div>
            <div class="col-md-6 text-right">
              <label class="checkbox">
                <input name="remember" checked="" type="checkbox">
                <i></i>记住我</label>
            </div>
          </div>
        </section>
      </fieldset>
      <footer class="text-right">
        <button type="submit" class="btn btn-info pull-right" onclick="login()">登录</button>
        <a href="register.jsp" class="button button-secondary">注册</a>
      </footer>
    </form>
  </div>
</div>
<script>
  function login(){
    if(!Form.email.value){
      alert("请输入账号！");
      myForm.email.focus();
      return;
    }
    else if(!Form.password.value){
      alert("请输入密码！");
      myForm.password.focus();
      return;
    }
    else {

    }
  }
</script>
<script src="../dist/js/jquery.min.js"></script> 
<script src="../bootstrap/js/bootstrap.min.js"></script> 
<script src="../dist/js/index.js"></script>
</body>
</html>