<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
	
<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<!-- Wrapper for slides -->
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'home'">
			<div class="item active">
				<a href="http://www.sarvottamnoida.com/" target="_blank"> <img style='height: 150px; width: 1000px' src="<c:url value="/img/advertisement/adv_sarvottamInternationalSchool.JPG"/>"  ></a>
			</div>
			<div class="item">
				<a href="https://www.milkbasket.com/" target="_blank"> <img style='height: 150px; width: 1100px' src="<c:url value="/img/advertisement/adv_milkBasket.JPG"/>" ></a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'restaurants'">
			<div class="item active">
				<a href="http://www.sarvottamnoida.com/" target="_blank"> <img style='height: 150px; width: 1000px' src="<c:url value="/img/advertisement/adv_sarvottamInternationalSchool.JPG"/>"  ></a>
			</div>
			<div class="item">
				<a href="https://www.milkbasket.com/" target="_blank"> <img style='height: 150px; width: 1100px' src="<c:url value="/img/advertisement/adv_milkBasket.JPG"/>" ></a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'hospitals'">
			<div class="item active">
				<a href="http://www.sarvottamnoida.com/" target="_blank"> <img style='height: 150px; width: 1000px' src="<c:url value="/img/advertisement/adv_sarvottamInternationalSchool.JPG"/>"  ></a>
			</div>
			<div class="item">
				<a href="https://www.milkbasket.com/" target="_blank"> <img style='height: 150px; width: 1100px' src="<c:url value="/img/advertisement/adv_milkBasket.JPG"/>" ></a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="'${key}' == 'schools'">
			<div class="item active">
				<a href="http://www.sarvottamnoida.com/" target="_blank"> <img style='height: 150px; width: 1000px' src="<c:url value="/img/advertisement/adv_sarvottamInternationalSchool.JPG"/>"  ></a>
			</div>
			<div class="item">
				<a href="https://www.milkbasket.com/" target="_blank"> <img style='height: 150px; width: 1100px' src="<c:url value="/img/advertisement/adv_milkBasket.JPG"/>" ></a>
			</div>
	</div>
</div>


