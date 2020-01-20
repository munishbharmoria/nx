<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<div id="myCarousel" class="carousel slide" data-ride="carousel" style="width: 980px; background-color: #eed; margin: auto;"
	data-interval="3000">

	<!-- Wrapper for slides -->
	
	<div class="carousel-inner" align="center" ng-if="enableSection=='Home' || enableSection=='SearchSite'" >
			<div class="item active">
				<a class="button" ng-href="tel:09319241740">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_UMgroupAdvNoidaGSTReady.png"/>" >
				</a>
			</div>
			<div class="item">
				<a class="button" ng-href="https://timesofindia.indiatimes.com/city/noida/noida-metro-gets-nod-to-build-second-greater-noida-corridor/articleshow/72357664.cms" target="_blank">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_metroAquaToNoidaX.png"/>" >
				</a>
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div> 
			<div class="item">
				<a style="cursor: pointer" ng-click="getMyAction('Metro Bus'); goToTop()"> 
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_MetroBusService.png"/>"  >
				</a>
			</div>
			<div class="item">
				<a style="cursor: pointer" href="https://www.milkbasket.com/" target="_blank"> 
					<img style='height: 170px; width: 1100px' src="<c:url value="/img/advertisement/adv_milkBasket.JPG"/>" >
				</a>
			</div> 
			<div class="item">
				<a style="cursor: pointer" href="http://www.sarvottamnoida.com/" target="_blank"> 
					<img style='height: 170px; width: 1100px' src="<c:url value="/img/advertisement/adv_sarvottamInternationalSchool.png"/>" >
				</a>
			</div> 
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Restaurants'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/restaurant/restaurant_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Doctors'">
			<div class="item active">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div> 
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Hospitals'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/hospital/hospital_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Pharmacy'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/pharmacy/pharmacy_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Path Labs'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/pathLabs/pathLabs_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Rent & Sale'">
			<div class="item active">
				<a> 
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_Rent&Sale.png"/>"  >
				</a>
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Daily Needs'">
			<div class="item active">
				<a class="button" ng-href="tel:09990098106">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/dailyNeeds/dailyNeeds_advertise1.jpeg"/>" >
				</a>
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Schools'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/school/school_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Play Schools'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/playSchools/playSchools_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	
	<div class="carousel-inner" align="center" ng-if="enableSection=='Taxi Services'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/taxiService/taxiService_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Parlour & Salon'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/personalCare/personalCare_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Automobiles'">
			<div class="item active">
				<img style='height: 170px; width: 1000px' src="<c:url value="/img/automobiles/automobiles_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117"><img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" ></a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Shopping'">
			<div class="item active">
				<a class="button" ng-href="tel:08800587117"><img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" ></a>
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div> 
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Boutique'">
			<div class="item active">
				<img style='height: 170px; width: 1000px; cursor: pointer' src="<c:url value="/img/boutique/boutique_advertise1.jpeg"/>" >
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='OtherCategory'">
			<div class="item active">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div> 
	</div>
	<div class="carousel-inner" align="center" ng-if="enableSection=='Metro Bus'">
			<div class="item active">
				<a style="cursor: pointer" ng-click="getMyAction('Metro Bus'); goToTop()"> 
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_MetroBusService.png"/>"  >
				</a>
			</div>
			<div class="item">
				<a class="button" ng-href="tel:08800587117">
					<img style='height: 170px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
				</a>
			</div>
	</div>
	
	<!-- Controls -->
	  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
	    <span class="glyphicon glyphicon-chevron-left"></span>
	  </a>
	  <a class="right carousel-control" href="#myCarousel" data-slide="next">
	    <span class="glyphicon glyphicon-chevron-right"></span>
	  </a>
	
</div>


