<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>

<div align="left">
	<table width="100%">
		<tr>
			<td width="1%"> </td>
			<td>
			<a href="<c:url value="/shop"/>" style="text-decoration: none;">
			<large style='font-family: "Comic Sans MS", cursive, sans-serif; font-size: 35px;color:blue;font-weight: bold;'>Nx</large>
			<large style='font-family: "Comic Sans MS", cursive, sans-serif; font-size: 35px;color:red;font-weight: bold;'>Dial.com</large>
				<%-- <img src="<c:url value="/img/nxDirectory.jpg"/>" class="img-rounded"> --%>
			</a>
			</td>
			<td>
				<marquee align="center" width="75%" style='font-family: "Comic Sans MS", cursive, sans-serif;'  behavior="alternate" direction="right" onMouseOver="this.stop()" onMouseOut="this.start()">
		<small style="color:red">WhatsApp </small><u style="color:blue">8800587117</u><small style="color:red"> your detail for free listing</small>
	</marquee> 
			
			</td>
			<td align="right">
				<img src="<c:url value="/img/common/freeListing.png"/>" class="img-rounded" ng-click ="registerBusiness()" style="cursor: pointer;"/>
			
			&nbsp;&nbsp; 
				<u style='color:black;font-family: "Comic Sans MS", cursive, sans-serif;'>Call </u><u style='color:blue;font-family: "Comic Sans MS", cursive, sans-serif;'>8800587117</u><u style='olor:black;font-family: "Comic Sans MS", cursive, sans-serif;'> for Advertise</u>
					<!-- 	<a th:href="@{/admin}">Login</a> -->
			<%-- <a href="<c:url value="/admin"/>">	Login</a>&nbsp;&nbsp; 
			<a href="<c:url value="#"/>">	Logout</a> --%>
			&nbsp;&nbsp;</td>
		</tr>
	</table>
	<!-- <marquee align="center" width="100%" behavior="scroll" direction="right" onMouseOver="this.stop()" onMouseOut="this.start()">
		<small style="color:black">WhatsApp </small><u style="color:blue">8800587117</u><small style="color:black"> your detail for free listing</small>
	</marquee>  -->
</div>
