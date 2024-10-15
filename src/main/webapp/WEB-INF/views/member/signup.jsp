<%--
  Created by IntelliJ IDEA.
  User: 이상욱
  Date: 2024-10-15
  Time: 오전 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h2>회원가입 폼</h2>
<form action="/member/signup" method="POST">
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
            <td>패스워드 확인</td>
            <td><input type="text" name="pwch"/></td>
        </tr>
        <tr>
            <td>이름</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>이메일</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>성별</td>
            <td>
                <input type="radio" name="gender" value="male" checked/>남
                <input type="radio" name="gender" value="female"/>여
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="gender" value="가입"/>
                <input type="reset" name="gender" value="재작성"/>
                <input type="button" name="gender" value="취소" onclick="window.location = '/'"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
