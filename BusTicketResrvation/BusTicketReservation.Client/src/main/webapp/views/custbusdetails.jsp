<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="mp" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
     
<mp:Master  title="Main Page">

<jsp:attribute name="head">


<link href="${pageContext.request.contextPath}/resources/styles/bus_details.css" rel="stylesheet">


</jsp:attribute>

 <jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
		 Bus Details Form
		</div>
		<form action="">


<table border="2" class="table table-striped ">
<thead>
          <tr>
      <th scope="col"></th>    
<th scope="col">Bus Id</th>
<th scope="col">Bus Name</th>
<th scope="col">Bus No</th>
<th scope="col">Bus Type</th>
<th scope="col">Total Seats</th>
<th scope="col">Route Id</th>
<th scope="col">Route From</th>
<th scope="col"> To</th>
<th scope="col">Schedule Id</th>
<th scope="col">Date</th>
<th scope="col">Time</th>
</tr>
</thead>

  <tbody>
        <b:forEach var="i" items="${E}">
                <tr>
                    <th scope="row"></th>
                    <td><b:out value="${i.busId}"></b:out></td>
                     <td><b:out value="${i.busName}"></b:out></td>
                    <td><b:out value="${i.busNo}"></b:out></td>
                    <td><b:out value="${i.busType}"></b:out></td>
                    <td><b:out value="${i.totalSeats}"></b:out></td>
                    <td><b:out value="${i.routeId.getR_Id()}"></b:out></td>
                    <td><b:out value="${i.routeId.getR_from()}"></b:out></td>
                    <td><b:out value="${i.routeId.getR_to()}"></b:out></td>
                    <td><b:out value="${i.scheduleId.getScheduleId()}"></b:out></td>
                     <td><b:out value="${i.scheduleId.getS_date()}"></b:out></td>
                     <td><b:out value="${i.scheduleId.getTime()}"></b:out></td>
                </tr>
            </b:forEach>
       </tbody>
    </table>
</form>
		       </div>

</jsp:attribute>
</mp:Master>

