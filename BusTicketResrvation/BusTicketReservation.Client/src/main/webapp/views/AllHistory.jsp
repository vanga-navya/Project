<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:admin title="Main Page">
	<jsp:attribute name="head">
<link
			href="${pageContext.request.contextPath}/resources/styles/bus_details.css"
			rel="stylesheet">


</jsp:attribute>

	<jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
		 Ticket History
		</div>
		<div align="center" style="font-size:20px;">
			<b:if test="${ empty E}">
				<b:out value="${'No Details are Present'}"></b:out>
			</b:if>	
	</div>
		<div style="margin-left: 200px;">
		<form action="">
<table border="2" class="table table-striped ">
<b:if test="${not empty E}">
<thead>
          <tr>
			 <th scope="col"></th>    
			<th scope="col">TicketId</th>
			 <th scope="col">CustomerName</th>
			  <th scope="col">CustomerId</th>
			<th scope="col">busId</th>
			<th scope="col">NoOfSeatsBooked</th>
			<th scope="col">dateOfBooking</th>
			<th scope="col">amount</th>
			<th scope="col">Status</th>
</tr>
</thead>

  <tbody>
        <b:forEach var="i" items="${LS}">
                <tr>
                    <th scope="row"></th>
                    <td><b:out value="${i.ticketId}"></b:out></td>
                    <td><b:out value="${i.getCustomerId().getCustomerName()}"></b:out></td>
                     <td><b:out value="${i.getCustomerId().getCustomerId()}"></b:out></td>
             		<td><b:out value="${i.getBusId().getBusId()}"></b:out></td>
                    <td><b:out value="${i.noOfSeatsBooked}"></b:out></td>
                    <td><b:out value="${i.dateOfBooking}"></b:out></td>
                    <td><b:out value="${i.amount}"></b:out></td>
                    <td><b:out value="${i.status}"></b:out></td>
                </tr>
            </b:forEach>
       </tbody>
       </b:if>
    </table>
</form>
</div>

		       </div>

</jsp:attribute>
</mp:admin> 

