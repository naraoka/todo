<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="todo.RecordBean" %>
<%@ page import="todo.InfoBean" %>
<!DOCTYPE html>

<html>
	<head>
		<title>TODOアプリケーション</title>
		<link rel=stylesheet type=text/css href=web.css>
	</head>

	<body>
	<jsp:useBean id ="recordBean" class="todo.RecordBean" scope="session" />
	<jsp:useBean id ="infBean" class="todo.InfoBean" scope="session" />

		<h1>TODOアプリケーション</h1>
		<strong>出力画面</strong><br>

		<table border="1">
		<tr><th>重要度</th><th>内容</th></tr>
		<%
		ArrayList<RecordBean> recordBeanArray = infBean.getRecordBeanArray();

		for(RecordBean rcd: recordBeanArray){
			out.println("<tr><td>" + rcd.getDegree() + "</td><td>" + rcd.getContent() + "</td></tr>");
		}
		%>

		</table>
		<br>現在の登録数 : <%= infBean.getArraySize() %>件<p>
		<br>現在のセッションID:<% out.print(session.getId()); %><br>



		<form action =SessionRemoveServlet method=post >
			<input type=submit value=セッション削除>
		</form>


		<form action =index.jsp method= get>
			<input type=submit value=戻る>
		</form>

</body>
</html>