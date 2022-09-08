<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:admin title="Main Page">
	<jsp:attribute name="head">
<link
			href="${pageContext.request.contextPath}/resources/styles/allSchedule.css"
			rel="stylesheet">
</jsp:attribute>

	<jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
		 Schedule 
		</div>
	<div align="center" style="font-size:20px;">
		<b:if test="${ empty ls}">
		<b:out value="${'No schedule yet alloted '}"></b:out>
</b:if>	
	</div>
<div style="margin-left: 450px;font-size: 20px;">
<form action="">
<table border="1" class="table table-striped " style="padding:17px;">
<b:if test="${not empty E}">
<thead>
          <tr>
			 <th scope="col"></th>    
			<th scope="col">scheduleId</th>
			 <th scope="col">Schedule Id</th>
			<th scope="col">Time</th>
</tr>
</thead>
  <tbody>
        <b:forEach var="i" items="${sl}">
                <tr>
                    <th scope="row"></th>
                    <td><b:out value="${i.scheduleId}"></b:out></td>
                    <td><b:out value="${i.s_date}"></b:out></td>
             		<td><b:out value="${i.getTime()}"></b:out></td>
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

