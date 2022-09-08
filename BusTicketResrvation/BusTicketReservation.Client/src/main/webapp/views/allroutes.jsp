<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:admin title="Main Page">
	<jsp:attribute name="head">
<link
			href="${pageContext.request.contextPath}/resources/styles/allroutes.css"
			rel="stylesheet">
</jsp:attribute>

	<jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
			Routes
		</div>
			<div align="center" style="font-size: 20px;">
		<b:if test="${ empty sl}">
		<b:out value="${'No Routes  yet alloted'}"></b:out>
</b:if>	
	</div>
<div style="margin-left: 450px; font-size: 20px;">
<form action="">
<table border="1" class="table table-striped " style="padding: 17px;">
<b:if test="${not empty sl}">
<thead>
          <tr>
			 <th scope="col"></th>    
			<th scope="col">RouteId</th>
			 <th scope="col">Route From</th>
			<th scope="col">Route To</th>
			<th scope="col">DistCost</th>
</tr>
</thead>
  <tbody>
        <b:forEach var="i" items="${sl}">
                <tr>
                    <th scope="row"></th>
                    <td><b:out value="${i.r_Id}"></b:out></td>
                    <td><b:out value="${i.r_from}"></b:out></td>
             		<td><b:out value="${i.r_to}"></b:out></td>
             		<td><b:out value="${i.dist_cost}"></b:out></td>
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

