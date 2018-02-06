<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="web.css" type="text/css">
<title>トップ画面</title>
</head>
<body>
<%!  int accessCount =0; %>
<%
     accessCount +=1;
%>
<h1>TODOアプリケーション</h1>
<form action="CreateSessionServlet" method="post">
<% out.println(accessCount); %>
<br><strong>入力画面</strong>
<br><br>
<%
	String kazu,naiyou;

%>
<select name = "kazu">
<option value="5">5</option>
<option value="4">4</option>
<option value="3">3</option>
<option value="2">2</option>
<option value="1">1</option>
</select>
<input type ="text"  size="20" name ="naiyou" placeholder="タスク内容">
<input type="submit" value="送信">


</form>
</body>
</html>