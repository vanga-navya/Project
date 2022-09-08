<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:login title="Main Page">
	<jsp:attribute name="head">
<link
			href="${pageContext.request.contextPath}/resources/styles/about.css"
			rel="stylesheet">
			<style>
.er {
	color: red;
}
</style>

<link
			href="${pageContext.request.contextPath}/resources/styles/Aboutus1.css"
			rel="stylesheet">


<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

.header {
	color: white;
	background-color: #1B589B;
	padding: 30px;
	text-align: center;
	font-size: 35px;
}

.column {
	float: left;
	width: 33.33%;
	padding: 10px;
	height: 300px;
}

.row:after {img = "1111111111.jpg" content:"";
	display: table;
	clear: both;
}

.footer p {
	color: blue;
	padding: 10px;
	text-align: center;
	font-color: blue;
}

.column .one, .two, .three {
	position: relative;
	width: 150px;
	height: 150px;
}

.flex {
	display: flex;
	flex-direction: row;
	padding: 1vw;
}

.flex ul li p {
	font-size: 20px;
}
/* .flex ul li{ */
/* width:100%; */
/* }  */
@media ( max-width : 600px) {
	.column {
		width: 100%;
	}
}
</style>
</jsp:attribute>
	<jsp:attribute name="content">
  <div class="form-box">
		    
					
<h1 style="font-size: 46px; position: relative; left: 40%; top: 5px; text-decoration: underline;">ABOUT US</h1>
<div class="flex"> 
			<ul>
					<li><p>Providing Quality Servies since 1992 through Tech-bus privated Limited</p></li>
			</ul>
			<ul>
					<li><p>10 Lakh plus Happy-Customers all Over the Globe as seamless as we 	!!</p></li>
			</ul>
</div>
	<div class="header">
  			<h2 style="font-size: 3.3vh; color: #1B589B ';'">OUR TEAM</h2>
	</div>
	<div class="row">
  		<div class="column" style="background-color: #aaa;">
  			<h3>FOUNDER</h3>
  				
 	 			<h1 style="font-size: 10px;">Hard work is the key for a well success Organisation. Believe in yourself and do the thing right.<h1>
  	  </div>
  	<div class="column" style="background-color: #bbb;"> 
  			<h3>CEO</h3>
 		<h1 style="font-size: 10px;"> Our CEO says that no one got ever lucky once you taste the truth. Do a bit of what hard and achieve more! </h1>
  	</div>
  	<div class="column" style="background-color: #ccc;"> 
  		<h3>DIRECTOR</h3>
 		
 					 <h1 style="font-size: 10px;">The powerful key for every aspect is Colloboration. Achieve more do more!</h1>
 		 </div>
	</div>

	</div>
<div class="footer">
  <p>Our Mission - Work Hard untill you are the only one to challenge yourself </p>
  <p>Our Vision - Enlighten the lives of the Customers By providing Safest Rides</p>
</div>
</div>
</jsp:attribute>
</mp:login>

