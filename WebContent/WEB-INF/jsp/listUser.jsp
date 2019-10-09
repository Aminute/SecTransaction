<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.user_id}</td>
            <td>${c.user_name}</td>
               
        </tr>
    </c:forEach>
</table>
<form action="login">
  		 账户 ：<input type="text" name="user_id" value=""><br/>
   		密码： <input type="password" name="user_pwd" value=""><br/>
    <input type="submit" value="登录">
</form>