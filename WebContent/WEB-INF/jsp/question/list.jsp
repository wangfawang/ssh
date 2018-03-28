<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>问题表</h1>
	<table>
		<tr>
			<td>id</td>
			<td>内容</td>
		</tr>
		<s:iterator value="questions" var="q">
			<tr>
				<td>${q.qid }</td>
				<td>${q.qcontent }</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>