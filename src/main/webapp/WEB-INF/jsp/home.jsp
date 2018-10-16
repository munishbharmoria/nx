<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<body ng-app='shopModule' class="mh-100"
	style="width: 1000px; height: 1000px; background-color: #eed; margin: auto;">
	<jsp:include page="common.jsp"></jsp:include>
	
	<div ng-controller="shopController" style="background-color: #eee"
		ng-init="initialize()">

		<div>
			<jsp:include page="header.jsp"></jsp:include>
		</div>
		
		</br>

		<div>
			<jsp:include page="categories.jsp"></jsp:include>
		</div>

		<hr noshade="noshade" />

		<div ng-if="enableSection=='Home'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="categoriesThumbnails.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection=='Restaurants'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="restaurantsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'Doctors'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="doctorsListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection  == 'Hospitals'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="hospitalsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'Schools'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="schoolsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'PlaySchools'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="playSchoolsListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'register'">
			<jsp:include page="registerBusiness.jsp"></jsp:include>
		</div>
		
		<hr noshade="noshade" />

		<div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>
