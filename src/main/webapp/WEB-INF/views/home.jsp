<%--
  Created by IntelliJ IDEA.
  User: 이상욱
  Date: 2024-10-11
  Time: 오후 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Home</h1>
    <table>
        <tr>
            <td>로그인을 원하시면 버튼을 누르세용 <br/>
                <button onclick="window.location = '/member/login'">로그인</button>
            </td>
        </tr>
        <tr>
            <td>
                <a href="/member/signup">회원가입</a>
            </td>
        </tr>
    </table>
</body>
</html>
