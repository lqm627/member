<%@ page language="java" import="java.util.*,java.net.*"
         contentType="text/html; charset=utf-8" pageEncoding="utf-8"
         errorPage=""%>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
   <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<script type="text/javascript">
    function test() {
        console.log("111");
        alert(111111);
    }
    function submitMember()
    {
        var d = {};
        d.name = $("#name").val();
        d.phone = $("#phone").val();
        $.ajax(
            {
                url:"save",
                type:"post",
                data:JSON.stringify(d),
                contentType:"application/json;charset=utf-8",
                dataType:"json",
                success:function(data)
                {
                    var jsons = data;
                    alert(jsons);
                }
            });
    }
</script>
<body >
姓名：<input id="name"type="text" name="name">
手机：<input id="phone"type="text" name="phone">
<br/>
<input id="btn" type="button" onclick="submitMember()" value="注册" style="width: 50px;height: 50px"/>
</body>
</html>