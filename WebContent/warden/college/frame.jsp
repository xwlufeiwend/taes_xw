<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>框架集</title>
</head>
<!-- 
	什么是frameset框架集？
	实现在一个页面中访问多个页面
	frame的属性有:src:链接的url id:名称name:名称 scrolling:是否滚动(yes/no/auto) noresize:"noresize" 防止鼠标调整框架大小
	Frameset的属性有:rows:"行数" cols:"列数" frameborder:"yes/no/0/1"
 -->
<frameset rows="10%,90%" frameborder="0">
		<frame src="college/mCollege.jsp" name="top" noresize="noresize"/>
		<frameset cols="100%">
			<!--<frame src="left.html" name="home" noresize="noresize"/>-->
			<frame src="college/right.jsp" name="index1" />
		</frameset>
		<noframes>
			<body>
				你的浏览器不支持frame
			</body>
		</noframes>
</frameset>
</html>