<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>

<div align="left">
	<table width="100%">
		<tr>
			<td width="1%"> </td>
			<td disabled="true">
			<a ng-click="getMyAction('Home'); goToTop()" style="text-decoration: none;cursor: pointer">
			<large style='font-family: "Comic Sans MS", cursive, sans-serif; font-size: 35px;color:blue;font-weight: bold;'>Nx</large>
			<large style='font-family: "Comic Sans MS", cursive, sans-serif; font-size: 35px;color:red;font-weight: bold;'>Dial.com</large>
			<br>
			<large style='font-family: "Comic Sans MS", cursive, sans-serif; font-size: 11px;color:gray;font-weight: bold;'>Noida Extension's Online Directory</large>
			</a>
			</td>
			<td><a class="button" ng-href="https://wa.me/918800587117">
				<marquee align="center" width="70%" style='font-family: "Comic Sans MS", cursive, sans-serif;'  scrollamount="2" behavior="alternate" direction="right" onMouseOver="this.stop()" onMouseOut="this.start()">
		<small style="color:red">WhatsApp </small><u style="color:blue">8800587117</u><small style="color:red"> for free listing</small>
	</marquee>  </a>
			
			
			</td>
			<td align="right">
			<!-- 	<img src="<c:url value="/img/common/freeListing.png"/>" class="img-rounded" ng-click ="registerBusiness()" style="cursor: pointer;"/>  -->
				<a class="button" ng-href="https://wa.me/918800587117">
				<img src="<c:url value="/img/common/freeListing.png"/>" class="img-rounded"/>
				</a>
			
			&nbsp;&nbsp; 
			<a class="button" ng-href="tel:08800587117">
			<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> 
					<u style='color:blue;font-family: "Comic Sans MS", cursive, sans-serif;'>8800587117
					</u>
					<u style='color:black;font-family: "Comic Sans MS", cursive, sans-serif;'>for Advertise
					</u>
			</a>
				
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
