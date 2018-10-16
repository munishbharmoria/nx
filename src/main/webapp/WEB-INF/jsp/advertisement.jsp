<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
	
<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<!-- Wrapper for slides -->
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'home'">
			<div class="item active">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home1.JPG"/>" width="970" ></a>
			</div>
			<div class="item">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home2.JPG"/>" width="970" ></a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'restaurants'">
			<div class="item active">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home1.JPG"/>" width="970" ></a>
			</div>
			<div class="item">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home2.JPG"/>" width="970" ></a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'hospitals'">
			<div class="item active">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home1.JPG"/>" width="970" ></a>
			</div>
			<div class="item">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home2.JPG"/>" width="970" ></a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'schools'">
			<div class="item active">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home1.JPG"/>" width="970" ></a>
			</div>
			<div class="item">
				<a href=""> <img src="<c:url value="/img/advertisement/adv_home2.JPG"/>" width="970" ></a>
			</div>
	</div>
</div>


