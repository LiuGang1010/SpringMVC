<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>请登录</title>
	</head>

	<body>
		<div style="margin: 0 auto; padding-top: 100px;" align="center">
			<form action="doLogin.html" method="post">
				<p>
					<span>用户名:<input type="text" name="userName" /> </span>
				</p>
				<p>
					<span>密 码:<input type="password" name="password" /> </span>
				</p>
				<p>
					<span><input type="submit" value="登录" /></span>
				</p>
			</form>
		</div>
	</body>
</html>
