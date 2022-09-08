<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ attribute name="content" fragment="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
</style>
<meta charset="UTF-8">
<title>${title}</title>
<link href="${pageContext.request.contextPath}/resources/styles/nav.css"
	rel="stylesheet">

</head>
<body>

	<div
		style="position: absolute; left: 0px; top: -84px; width: 100%; height: 200%">
		<img src="<%=request.getContextPath()%>/resources/images/s1.png"
			height="100%" width="100%">
	</div>

	<div
		style="position: absolute; left: 0px; top: 0px; width: 100%; height: 0%">
		<div id="abc">
			<nav>
				<ul>
					<li><a  href="home">Home</a></li>
					<li><a href="LoginHere">Login</a></li>
					<li><a href="insert">Signup</a></li>
					<li><a href="About">About Us</a></li>
				</ul>
			</nav>
		</div>
	</div>







	<jsp:invoke fragment="head"></jsp:invoke>
	<jsp:invoke fragment="content"></jsp:invoke>

</body>
</html>