<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>

<div align="left">
	<table width="100%">
		<tr>
			<td>
			<a href="<c:url value="/shop"/>">
				 <img src="<c:url value="/img/nxDirectoryMenu.jpg"/>" class="img-rounded">
			<a href="<c:url value="/shop"/>">
				<img src="<c:url value="/img/nxDirectory.jpg"/>" class="img-rounded">
			</a>
			</td>
			<td align="right"><a class="bg-danger" ng-href="string">Free Listing</a> &nbsp;&nbsp; 
			<u>
				<a ng-href="string" align="right">Call (9818880638) for Advertise</a> </u> &nbsp;&nbsp; 
					<!-- 	<a th:href="@{/admin}">Login</a> -->
			<a href="<c:url value="/admin"/>">	Login</a>&nbsp;&nbsp; 
			<a href="<c:url value="#"/>">	Logout</a>
			&nbsp;&nbsp;</td>
		</tr>
	</table>
</div>
