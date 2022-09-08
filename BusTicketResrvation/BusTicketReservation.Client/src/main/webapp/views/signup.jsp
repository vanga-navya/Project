<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:login title="Main Page">
	<jsp:attribute name="head">
<style>
.header-text {
	color: white;
	text-decoration: underline;
}
</style>

<link
			href="${pageContext.request.contextPath}/resources/styles/signup.css"
			rel="stylesheet">

</jsp:attribute>
	<jsp:attribute name="content">

 
 <div id="lunchbox" style="margin-top: 85px;">
<form action="inserted">
 <div class="header-text">
			Registration Form
		</div>
<table class="table">
    <tr>
        <td>USERNAME:</td>
        <td><input placeholder="Customer Id" type="text"></td>
    </tr>
    <tr>
        <td>GENDER:</td>
        <td><select name="select" id="">
            <option value="g">SELECT</option>
            <option value="g">FEMALE</option>
            <option value="g">MALE</option>
            <option value="g">TRANSGENDER</option>
            <option value="g">NOT TO SPECIFY</option>
        </select></td>
    </tr>
    <tr>
        <td>DOB:</td>
        <td><input type="date"></td>
    </tr>
    <tr>
        <td>GMAIL:</td>
        <td><input type="email"></td>
    </tr>
    <tr>
        <td>CONTACT NUMBER:</td>
        <td><input type="CONTACT NUMBER"></td>
    </tr>
    
    <tr>
        <td>COUNTRY:</td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td>STATE:</td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td>CITY:</td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td>PINCODE:</td>
        <td><input type="NUMBER"></td>
    </tr>
    <tr>
        <td>ADDRESS:</td>
        <td><input type="text"></td>
    </tr>
    <tr>
        <td>CUSTOMER TYPE:</td>
        <td><select name="type" id="type">
            <option value="type">Select</option>
            <option value="type">Senior Citizen</option>
            <option value="type">Child</option>
            <option value="type">Adult</option>
        </select></td>
        <!-- <td><input type="text" placeholder="CHOOSE THE BELOW"></td> -->
    </tr>
    <tr>
        <td>CHOOSE THE PASSWORD:</td>
        <td><input type="password"></td>
    </tr>
    
    <tr>
        <td>CONFIRM PASSWORD:</td>
        <td><input type="password"></td>
    </tr>

    
    <tr>
        <td><input type="submit" value="Login"
							style="background-color: teal; position: relative; left: 100%; width: 20vw; height: 3vh;"></td>
    </tr>
    <tr class="new_ask">
    <td><a href="reg.html">create a new account</a></td> 
    <td><a href="forgot.html">forgot password!!</a></td>
					</tr>
</table>


</form>

</div>
 
 

</jsp:attribute>
</mp:login>

