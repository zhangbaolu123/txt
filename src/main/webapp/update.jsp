<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="update" method="post" enctype="multipart/form-data">
	<input type="text" name="id" value="${goods.id }">
	品牌<input type="text" name="name" value="${goods.name }">
	分类<select name="type_id">
	<option>请选择</option>
	<c:forEach items="${typeList }" var="t">
	<option value="${t.type_id }"><c:if test="${goods.type_id==t.type_id }">selected="selected"</c:if>${t.cname}</option>
	</c:forEach>
	</select>
	价格<input type="text" name="status" value="${goods.status }">
	<input type="submit" value="修改">
</form>
</body>
</html>