<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript"   src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
 <script type="text/javascript">
  $(function(){
	   $.ajax({
		  type:"post",
		  contentType:"application/json;charset=utf-8",
		  url:"${pageContext.request.contextPath }/abc.action",
		  data:'{"name":"张三",  "price" :123}',
		  success:function(date){
          alert(date.name)
		  }
		  
	  }) 
	/*  var  url="${pageContext.request.contextPath }/abc.action";
	 var data='{"name":"张三",  "price" :123}';
	  $.post(url,data,function(date){
		  
	  },'json')
	  alert("asd") */
	  
  })
</script>
<body> 
 
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
<form action="${pageContext.request.contextPath }/batchDel.action" method="post">
</table>
商品列表：
<table width="100%" border=1>
<tr>
    	<td>商品id</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemList }" var="item"   varStatus="i">
<tr>
   <td><input type="checkbox"   name="ids"  value="${item.id}" /></td>
	<td><input type="text"   name="list[${i.index }].name"  value="${item.name }" /></td>
	<td><input type="text"   name="list[${i.index }].price"  value="${item.price }" /></td>
	<td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td><input type="text"   name="list[${i.index }].detail"  value="${item.detail }" /></td>
	
	<td><a href="${pageContext.request.contextPath }/itemEdit.action?id=${item.id}">修改</a></td>

</tr>
</c:forEach>

</table>
<input type="submit"    value="提交" />
</form>
</body>

</html>