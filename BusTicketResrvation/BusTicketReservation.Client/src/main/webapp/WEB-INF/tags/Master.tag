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
h1 {
	color: red;
}
</style>
<meta charset="UTF-8">
<title>${title}</title>
<link href="${pageContext.request.contextPath}/resources/styles/nav.css"
	rel="stylesheet">

</head>
<body>
	<c:choose>
		<c:when test="${sessionScope.customerId}==null">
			<c:redirect url="LoginHere"></c:redirect>
		</c:when>
		<c:otherwise>


			<h1>
				Welcome :
				<c:out value="${sessionScope.customerId}"></c:out>
			</h1>
			<div
				style="position: absolute; left: 0px; top: -84px; width: 100%; height: 100%">
				<img src="<%=request.getContextPath()%>/resources/images/s1.png">
			</div>

			<div
				style="position: absolute; left: 0px; top: 0px; width: 100%; height: 0%">
				<div id="abc">
					<nav>
						<ul>
							<li><a href="check1">Home</a></li>
							<li><a href="profile">Profile</a></li>
							<li><a href="bus_form">Book Ticket</a></li>
							<li><a href="History">View History</a></li>
							<li><a href="cancelT">Cancel Ticket</a></li>
							<div style="float: left;">
								Welcome :
								<c:out value="${sessionScope.customerId}"></c:out>
							</div>
							<li style="color: yellow; float: right; text-align: center;"><a
								href="logout">Logout </a></li>
						</ul>
					</nav>
				</div>
			</div>
			<jsp:invoke fragment="head"></jsp:invoke>
			<jsp:invoke fragment="content"></jsp:invoke>
		</c:otherwise>
	</c:choose>
</body>
</html>