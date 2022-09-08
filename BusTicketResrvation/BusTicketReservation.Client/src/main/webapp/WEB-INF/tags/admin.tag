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
body {
	margin: 0;
	font-family: Arial;
	background-image: url("/resources/images/a2.png");
}

.topnav {
	margin-top: 10px;
	height: 60px;
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	margin-top: 4px;
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.active {
	background-color: #04AA6D;
	color: white;
}

.topnav .icon {
	display: none;
}

.dropdown {
	float: left;
	overflow: hidden;
	margin-top: 5px;
}

.dropdown .dropbtn {
	font-size: 17px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.topnav a:hover, .dropdown:hover .dropbtn {
	background-color: #555;
	color: white;
}

.dropdown-content a:hover {
	background-color: #ddd;
	color: black;
}

.dropdown:hover .dropdown-content {
	display: block;
}

@media screen and (max-width: 600px) {
	.topnav a:not(:first-child), .dropdown .dropbtn {
		display: none;
	}
	.topnav a.icon {
		float: right;
		display: block;
	}
}

@media screen and (max-width: 600px) {
	.topnav.responsive {
		position: relative;
	}
	.topnav.responsive .icon {
		position: absolute;
		right: 0;
		top: 0;
	}
	.topnav.responsive a {
		float: none;
		display: block;
		text-align: left;
	}
	.topnav.responsive .dropdown {
		float: none;
	}
	.topnav.responsive .dropdown-content {
		position: relative;
	}
	.topnav.responsive .dropdown .dropbtn {
		display: block;
		width: 100%;
		text-align: left;
	}
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
			<div class="topnav" id="myTopnav">
				<a href="Home1" class="active">Home</a> <a href="insertintoschedule">Add
					Schedule</a> <a href="add_route">Add Route</a> <a href="insertintobus">Add
					Bus</a> <a href="add_route">Add Route</a>
				<div class="dropdown">
					<button class="dropbtn">
						View All <i class="fa fa-caret-down"></i>
					</button>
					<div class="dropdown-content">
						<a href="allBus">Bus Details</a> <a href="AllSchedules">Schedule
							Details</a> <a href="AllRoutes">Route Details</a> <a
							href="AllHistory">All TicketBooking History</a>
					</div>

				</div>
				<a href="#about">About</a> <a href="AllCustomersD">CustomersDetails</a>
				<div style="float: right;">
					<a href="logout">Logout </a>
				</div>
				<a href="javascript:void(0);" style="font-size: 15px;" class="icon"
					onclick="myFunction()">&#9776;</a>
			</div>
			<jsp:invoke fragment="head"></jsp:invoke>
			<jsp:invoke fragment="content"></jsp:invoke>
		</c:otherwise>
	</c:choose>
</body>
</html>