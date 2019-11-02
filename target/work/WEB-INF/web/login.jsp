<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>login</title>
</head>
<body>
<form id="formSubmit" action="<%=path%>/web/show" method="post">
    <sapn>用户账号</sapn><input id="userName" name="userAccount" type="text"/><br>
    <span>用户密码</span><input name="password" id="userPassword" type="password"/><br>
    <input value="登录" id="sub" type="button">
</form>
<script src="<%=path%>/static/js/jquery-3.3.1.min.js"></script>
<script>
    //注册的表单验证
    $(function () {
        $("#sub").click(function () {
            var name = $("#userName").val();
            var passWord = $("#userPassword").val();
            if(name==""){
                alert("请输入用户账号");
                return;
            }
            if(passWord==""){
                alert("请输入密码!");
                return;
            }
            //用户名验证
            //用户名验证
            $.ajax({
                url:"<%=path%>/web/checkLogin",
                type:"post",
                data:{name: name,passWord:passWord},
                async:false,
                success:function (data) {
                    if (data == "0") {
                        alert("账号或者密码错误！");
                        return;
                    }
                    else{
                        $("#formSubmit").submit();
                    }
                }
            });

        });
    })
</script>

</body>
</html>
