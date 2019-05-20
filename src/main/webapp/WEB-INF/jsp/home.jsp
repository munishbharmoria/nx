<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
	<title>
		NxDial.com - Noida Extension's Free Directory
	</title>
</head>
<body ng-app='shopModule' class="mh-100"
	style="width: 1000px; height: 1000px; background-color: #eed; margin: auto;">
	<jsp:include page="common.jsp"></jsp:include>
	
	<div ng-controller="shopController" style="background-color: #eee"
		ng-init="initialize()">

		<div>
			<jsp:include page="header.jsp"></jsp:include>
		</div>
		
		</br>
		
		
		<div style="width: 980px; background-color: #eed; margin: auto;">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
		</div>


		<div ng-if="enableSection=='Home'">
			<jsp:include page="categoriesThumbnails.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection=='Restaurants'">
			<jsp:include page="restaurantsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='Automobiles'">
			<jsp:include page="automobilesListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='Shopping'">
			<jsp:include page="shoppingListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'Doctors'">
			<jsp:include page="doctorsListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection  == 'Hospitals'">
			<jsp:include page="hospitalsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'Schools'">
			<jsp:include page="schoolsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'PlaySchools'">
			<jsp:include page="playSchoolsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'Pharmacy'">
			<jsp:include page="pharmacyListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'PathLabs'">
			<jsp:include page="pathLabsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'DailyNeeds'">
			<jsp:include page="dailyNeedsListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'aboutUs'">
			<jsp:include page="aboutUs.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'contactUs'">
			<jsp:include page="contactUs.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'freeListing'">
			<jsp:include page="freeListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'advertise'">
			<jsp:include page="advertise.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'customerCare'">
			<jsp:include page="customerCare.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'register'">
			<jsp:include page="registerListing.jsp"></jsp:include>
		</div>
		
		<hr noshade="noshade" />
		<div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		 <button onclick="topFunction()" id="myBtn" title="Go to top" align="right">Top</button> 
	</div>
</body>
</html>
