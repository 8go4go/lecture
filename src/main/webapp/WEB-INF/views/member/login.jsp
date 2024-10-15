<%--
  Created by IntelliJ IDEA.
  User: 이상욱
  Date: 2024-10-15
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<h2>로그인 폼</h2>
<form action="/member/login" method="POST">
    <table>
        <tr>
            <td>아이디</td>
            <td><input type="text" name="id"/></td>
        </tr>
        <tr>
            <td>패스워드</td>
            <td><input type="text" name="pw"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="gender" value="로그인"/>
                <input type="button" name="gender" value="취소" onclick="window.location = '/member/login'"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
