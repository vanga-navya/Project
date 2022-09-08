<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="mp" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
     
<mp:login title="Main Page">

<jsp:attribute name="head">

<style>

.mystyle1 {
background-color:  #CCCCFF;
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>


$(document).ready(function(){
	$("tr").hover(function(){
		$(this).addClass("mystyle1");
	},function(){
		$(this).removeClass("mystyle1");
	});
});
</script>



</jsp:attribute>
 <jsp:attribute name="content">
 <link href="${pageContext.request.contextPath}/resources/styles/style.css" rel="stylesheet">
   <div class="container" >
<div class="site_title">

<h1>Bus Ticket Reservation System</h1>


</div>
<div class="overlay"></div>
</div> 

</jsp:attribute>
</mp:login>

