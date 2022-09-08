<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<mp:Master title="Search Page">

	<jsp:attribute name="head">
	<style>
	
	.form-box {
	background-color: rgba(0, 0, 0, 0.5);
	margin: auto auto;
	padding:30px;
	border-radius: 5px;
	box-shadow: 0 0 1px #000;
	position: absolute;
	
	width: 20%;
	height: 25%;
}
	</style>

<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
			crossorigin="anonymous">
<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<link
			href="${pageContext.request.contextPath}/resources/styles/bus_form.css"
			rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</jsp:attribute>
	<jsp:attribute name="content">
	
 <div class="cards">
  <form:form action="BookT" modelAttribue="B">
 <div class="row">
 <div class="form-box" align="center">
 <h2><b:out value="${msg}"></b:out></h2>
 </div>
		 <b:forEach var="i" items="${E}">
		 <div class="card">
		  <h5 class="card-header">Bus Name: <b:out value="${i.busName}"></b:out>
									</h5>
		  <div class="card-body">
		 
			 
				       <h5 class="card-title">Bus ID: <b:out value="${i.busId}"></b:out>
										</h5> 
				    	 <h5 class="card-title">Bus Number: <b:out
												value="${i.busNo}"></b:out>
										</h5> 
				  	 	 <h5 class="card-title">Bus Type: <b:out
												value="${i.busType}"></b:out>
										</h5>
					      <h5 class="card-title">Total Seats:<b:out
												value="${i.totalSeats}"></b:out>
										</h5>
					 <h5 class="card-title"> From:<b:out
												value="${i.routeId.getR_from()}"></b:out>
										</h5>
					 <h5 class="card-title"> To:<b:out
												value="${i.routeId.getR_to()}"></b:out>
										</h5>
				    <!-- <h5 class="card-text">starting address----------------destination address</h5> -->
				    <a href="BookT" class="btn btn-primary">Book Ticket</a>
				    <button style="align: right;" class="btn btn-primary">₹ <b:out
												value="${i.routeId.getDist_cost()}"></b:out>
										</button>
				  </div>
		
		</div>
		 
		 
		  </b:forEach> 
	  </div>
	  </form:form>
</div>

</jsp:attribute>
</mp:Master>

