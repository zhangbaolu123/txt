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
	<a href="toadd"><input type="button" value="新增"></a>
	<input  type="button" value="批量删除" onclick="deleteAll()">
	<table>
	  <tr>
	    <th><input type="checkbox">全选</th>
	    <th>编号</th>
	    <th>品牌</th>
	    <th>分类</th>
	    <th>发布时间</th>
	    <th>操作</th>
	  </tr>
	  <c:forEach items="${page.list }" var="d">
	  	 <tr>
	    	<td><input type="checkbox" value="${d.id }" name="id"></td>
	    	<td>${d.id }</td>
	    	<td>${d.name }</td>
	    	<td>${d.type_id }</td>
	    	<td>${d.datea }</td>
	    	<td><a>详情</a><a href="toupdate?gid=${d.id }"><input type="button" value="编辑"></a></td>
	  	</tr>
	  </c:forEach>
	 	<tr>
	    	<td colspan="6">
	    		<a href="list?pageNum=${page.firstPage }">首页</a>
	    		<a href="list?pageNum=${page.prePage }">上一页</a>
	    		<a href="list?pageNum=${page.nextPage}">下一页</a>
	    		<a href="list?pageNum=${page.lastPage }">末页</a>
	    		当前为${page.pageNum }/${page.pages}页
	    	</td>
	  	</tr>
	</table>
	
</body>
<script type="text/javascript">
	function deleteAll(id){
		if(confirm("确定删除吗")){
			var ids = "";
			if(id == undefined){
				ids = $("[name='id']:checked").map(function(){
					return $(this).val();
				}).get().join(",");
			}else{
				ids = id;
			}
		}
		
		$.post("deleteGoods",{"ids":ids},function(data){
			if(data){
				alert("删除成功");
				location.href="http://localhost:8080/list";
			}else{
				alert('删除失败');
			}
		},"json");
		
	}
</script>
</html>