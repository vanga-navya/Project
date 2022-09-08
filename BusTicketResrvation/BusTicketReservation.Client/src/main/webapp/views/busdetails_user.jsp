<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:Master title="Search Page">

	<jsp:attribute name="head">

<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
			crossorigin="anonymous">
<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<link
			href="${pageContext.request.contextPath}/resources/styles/busdetails_user.css"
			rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</jsp:attribute>
	<jsp:attribute name="content">
	
 <div class="cards">
 <div class="row">
 <b:forEach var="a" begin="1" end="10" step="1">
 
<b:out value="${a}"></b:out>

 
 <div class="form-box" >
		       <div class="header-text">
		           Bus Details Form <b:out value="${a}"></b:out>
		       </div>
		<form action="">
 
                <div class="w3-card-4">

                      <header class="w3-container w3-blue">
                                <h1>Header</h1>
                                
                                     <table>
                                        <tr>Bus Id<td>   <td>@456</td></tr>
                                        <tr>Bus name<td> <td>navya</td></tr>
                                        <tr><td>bus no </td><td>465</td></tr>
                                        <tr>bus type<td><td>ac</td></tr>
                                     </table>
                         </header>



                             <div class="w3-container">
                                           start address--------------------------->to address
                              </div>

                      <footer class="w3-container w3-white">
                          <h5>Footer</h5>
                          <table>
                          <tr>schedule id<td><td>schedule id</td></tr>
                          <tr><td colspan="2"><button formaction="">Book Ticket</button></td> </tr>
                         </table>
                      </footer>

               </div>
              
	         </form>
	         
	 </div>
	 </b:forEach> 
	  </div>
</div>
</jsp:attribute>
</mp:Master>

