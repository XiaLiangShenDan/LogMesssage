<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#search").click(function(){
			$.ajax({
				type:"post",
				url:"findbyid.action",
				data:$("#id"),
				dataType:"json",
				success:function(data){
					var html = "";
					html += "<td>" + data.id + "</td><td>" + data.date + "</td><td>"+ data.messageLocation + "</td><td>"+ data.messageRank + "</td><td>"+ data.message + "</td>";
					$("#logMessage").html(html);
				},
				error:function(){
					console.log("请输入正确的序号！");
				}
			})
		})
		$("#searchAll").click(function(){
			$.ajax({
				type:"post",
				url:"findall.action",
				dataType:"json",
				success:function(data){
					var html = "";
					console.log(data.length);
					for(var i=0;i<data.length;i++){
						html += "<tr><td>" + data[i].id + "</td><td>" + data[i].date + "</td><td>"+ data[i].messageLocation + "</td><td>"+ data[i].messageRank + "</td><td>"+ data[i].message + "</td></tr>";
						
					}
					$("#logMessage").html(html);
				},
				error:function(){
					console.log("请输入正确的序号！");
				}
			})
		})
	})
</script>
<body>
	<div style="margin-top:25px">
		请输入所要查询的序号:<input type="text" id="id" name="id"/><input id="search" style="margin-left:10px" type="button" value="搜索"/><input id="searchAll" style="margin-left:10px" type="button" value="全部信息"><br>
	</div>
	<div style="margin-top:50px">
		<table border="1">
			<tr>
				<td>序号</td>
				<td>日志信息时间</td>
				<td>日志发生位置</td>
				<td>日志等级</td>
				<td>日志信息</td>
			</tr>
			<tr id="logMessage">
			
			</tr>
		</table>
	</div>
</body>
</html>
