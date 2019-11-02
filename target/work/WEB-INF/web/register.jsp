<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>register</title>
</head>
<body>
<div style="margin: auto">
    <form id="formSubmit" action="<%=path%>/web/checkRegister" method="post">
        <sapn>用户账号</sapn><input id="userName" name="userAccount" type="text"/><br>
        <span>用户密码</span><input name="password" id="userPassword" type="password"/><br>
        <span>再次输入密码</span><input id="userPasswordx" type="password"/><br>
        <span>邮箱</span><input name="email" id="userEmail" type="text"><br>
        <input value="注册" id="sub" type="button">
    </form>
</div>



<script src="<%=path%>/static/js/jquery-3.3.1.min.js"></script>
<script>
    //注册的表单验证
    $(function () {
        $("#sub").click(function () {
            var name = $("#userName").val();
            var passWord = $("#userPassword").val();
            var passWordx = $("#userPasswordx").val();
            var email = $("#userEmail").val();
            var flag=true;
            if(name==""){
                alert("请输入用户账号");
                return;
            }
            //用户名验证
            $.ajax({
                url:"<%=path%>/web/checkUserName",
                type:"post",
                data:{name: name},
                async:false,
                success:function (data) {
                    if (data == "1") {
                        alert("该用户已经注册");
                        flag=false;
                        return;
                    }
                }
            });
            if(flag==false){
                return;
            }
            if(passWord==""){
                alert("请输入密码!");
                return;
            }
            //确认密码
            if(passWord !=passWordx)
            {
                alert("两次密码不一致");
                return;
            }
            //邮箱验证
            var regExp = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
            if (regExp.test(email)) {
            } else {
                alert("邮箱格式错误！");
                return;
            }
           $("#formSubmit").submit();

        });
    })
</script>
</body>
</html>
