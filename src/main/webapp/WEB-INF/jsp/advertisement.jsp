<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="padding-top:  10px;">
	<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2000" >
	
		<!-- Wrapper for slides -->		
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Home' 
		  || advertiseSection=='aboutUs' || advertiseSection=='contactUs' || advertiseSection=='freeListing' || advertiseSection=='advertise' || 
		  advertiseSection=='customerCare' || advertiseSection=='privacyPolicy'" >
				<div class="item active">
					<a class="button" ng-href="https://www.zomato.com/ncr/five-star-chicken-crossing-republik-ghaziabad" target="_blank">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_FiveStarChicken.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08826164813">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_Auntyskitchen.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08826164813">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_OneTouchAirCondition&Refrigeration.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:07678599576">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_teddyzonesPlaySchool.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:09319241740">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_DrSSChandelOrtho.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:09319241740">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AryaAutomobile.jpg"/>" >
					</a>
				</div>
				<%-- <div class="item">
					<a class="button" ng-href="tel:09319241740">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_UMgroupAdvNoidaGSTReady.png"/>" >
					</a>
				</div> --%>
				<div class="item">
					<a class="button" ng-href="https://timesofindia.indiatimes.com/city/noida/noida-metro-gets-nod-to-build-second-greater-noida-corridor/articleshow/72357664.cms" target="_blank">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_metroAquaToNoidaX.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div> 
				<div class="item">
					<a style="cursor: pointer" ng-click="getMyAction('Metro Bus'); goToTop()"> 
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_MetroBusService.png"/>"  >
					</a>
				</div>
				<%-- <div class="item">
					<a style="cursor: pointer" href="https://www.milkbasket.com/" target="_blank"> 
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_milkBasket.JPG"/>" >
					</a>
				</div>  --%>
				<div class="item">
					<a style="cursor: pointer" href="http://www.sarvottamnoida.com/" target="_blank"> 
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_sarvottamInternationalSchool.png"/>" >
					</a>
				</div> 
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Restaurants'">
				<%-- <div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/restaurant/restaurant_advertise1.jpeg"/>" >
				</div> --%>
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_FiveStarChicken.png"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Doctors'">
				<div class="item active">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div> 
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Hospitals'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/hospital/hospital_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Pharmacy'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/pharmacy/pharmacy_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Path Labs'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/pathLabs/pathLabs_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Rent & Sale'">
				<div class="item active">
					<a> 
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_Rent&Sale.png"/>"  >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Daily Needs'">
				<div class="item active">
					<a class="button" ng-href="tel:09990098106">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/dailyNeeds/dailyNeeds_advertise1.jpeg"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Schools'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/school/school_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Play Schools'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/playSchools/playSchools_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Taxi Services'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/taxiService/taxiService_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Parlour & Salon'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/personalCare/personalCare_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Automobiles'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/automobiles/automobiles_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117"><img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" ></a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Shopping'">
				<div class="item active">
					<a class="button" ng-href="tel:08800587117"><img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" ></a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div> 
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Boutique'">
				<div class="item active">
					<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}; cursor: pointer' src="<c:url value="/img/boutique/boutique_advertise1.jpeg"/>" >
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='OtherCategory'">
				<div class="item active">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div> 
		</div>
		<div class="carousel-inner" align="center" ng-if="advertiseSection=='Metro Bus'">
				<div class="item active">
					<a style="cursor: pointer" ng-click="getMyAction('Metro Bus'); goToTop()"> 
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_MetroBusService.png"/>"  >
					</a>
				</div>
				<div class="item">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
					</a>
				</div>
		</div>
		
		<div class="carousel-inner" align="center" ng-if=" advertiseSection=='AC Service'">
				<div class="item active">
					<a class="button" ng-href="tel:08826164813">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_OneTouchAirCondition&Refrigeration.png"/>" >
					</a>
				</div>
		</div>
		
		<div class="carousel-inner" align="center" ng-if=" advertiseSection=='SearchSite'">
				<div class="item active">
					<a class="button" ng-href="tel:08826164813">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_OneTouchAirCondition&Refrigeration.png"/>" >
					</a>
				</div>
		</div>
		
		<div class="carousel-inner" align="center" ng-if=" advertiseSection=='Toys' || advertiseSection=='Gifts'
						|| advertiseSection=='Photo Studio' || advertiseSection=='Stationery'
						|| advertiseSection=='Bakery' || advertiseSection=='Sweet Shops'
						|| advertiseSection=='Opticians' || advertiseSection=='Dry Cleaner'
						|| advertiseSection=='Notaries' || advertiseSection=='Pooja Items'
						|| advertiseSection=='Pandit Ji' || advertiseSection=='Tiffin Service'
						|| advertiseSection=='Appliance Repair' || advertiseSection=='Laptop Repair'
						|| advertiseSection=='Mobile Repair' || advertiseSection=='Pet Care'
						|| advertiseSection=='Interior Designer' || advertiseSection=='Electrical Shops'
						|| advertiseSection=='Electronic Shops' || advertiseSection=='Crockery Shops'
						|| advertiseSection=='Home & Décor' || advertiseSection=='Hardware & Paint'
						|| advertiseSection=='Cycle Shops' || advertiseSection=='ATMs'
						|| advertiseSection=='Banks' || advertiseSection=='Cake Shops'
						|| advertiseSection=='Courier Services' || advertiseSection=='COVID 19 Products'
						|| advertiseSection=='Tution' || advertiseSection=='Art Classes'">
				<div class="item active">
					<a class="button" ng-href="tel:08800587117">
						<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
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
</div>
	
 
 
<%-- <div class="row">
	<div class="col-xs-12">
			<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2000" >
			
				<!-- Wrapper for slides -->		
				<div class="carousel-inner" ng-if="advertiseSection=='Home' 
				  || advertiseSection=='aboutUs' || advertiseSection=='contactUs' || advertiseSection=='freeListing' || advertiseSection=='advertise' || 
				  advertiseSection=='customerCare' || advertiseSection=='privacyPolicy'" >
						<div class="item active">
							<div class="row">
								<div class="col-xs-4">
									<a class="button" ng-href="tel:01206850573">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_Auntyskitchen.png"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:08826164813">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_OneTouchAirCondition&Refrigeration.png"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:07678599576">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_teddyzonesPlaySchool.png"/>" >
									</a>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="row">
								 <div class="col-xs-4">
									<a class="button" ng-href="tel:09319241740">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_DrSSChandelOrtho.png"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:09319241740">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AryaAutomobile.jpg"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:09319241740">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_UMgroupAdvNoidaGSTReady.png"/>" >
									</a>
								</div>
							</div>
						</div>	
						
						
						<div class="item">
							<a class="button" ng-href="https://timesofindia.indiatimes.com/city/noida/noida-metro-gets-nod-to-build-second-greater-noida-corridor/articleshow/72357664.cms" target="_blank">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_metroAquaToNoidaX.png"/>" >
							</a>
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div> 
						<div class="item">
							<a style="cursor: pointer" ng-click="getMyAction('Metro Bus'); goToTop()"> 
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_MetroBusService.png"/>"  >
							</a>
						</div>
						<div class="item">
							<a style="cursor: pointer" href="https://www.milkbasket.com/" target="_blank"> 
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_milkBasket.JPG"/>" >
							</a>
						</div> 
						<div class="item">
							<a style="cursor: pointer" href="http://www.sarvottamnoida.com/" target="_blank"> 
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_sarvottamInternationalSchool.png"/>" >
							</a>
						</div> 
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Restaurants'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/restaurant/restaurant_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Doctors'">
						<div class="item active">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div> 
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Hospitals'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/hospital/hospital_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Pharmacy'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/pharmacy/pharmacy_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Path Labs'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/pathLabs/pathLabs_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Rent & Sale'">
						<div class="item active">
							<a> 
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_Rent&Sale.png"/>"  >
							</a>
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Daily Needs'">
						<div class="item active">
							<a class="button" ng-href="tel:09990098106">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/dailyNeeds/dailyNeeds_advertise1.jpeg"/>" >
							</a>
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Schools'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/school/school_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Play Schools'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/playSchools/playSchools_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Taxi Services'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/taxiService/taxiService_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Parlour & Salon'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/personalCare/personalCare_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Automobiles'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/automobiles/automobiles_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117"><img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" ></a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Shopping'">
						<div class="item active">
							<a class="button" ng-href="tel:08800587117"><img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" ></a>
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div> 
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Boutique'">
						<div class="item active">
							<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}; cursor: pointer' src="<c:url value="/img/boutique/boutique_advertise1.jpeg"/>" >
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='OtherCategory'">
						<div class="item active">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div> 
				</div>
				<div class="carousel-inner" align="center" ng-if="advertiseSection=='Metro Bus'">
						<div class="item active">
							<a style="cursor: pointer" ng-click="getMyAction('Metro Bus'); goToTop()"> 
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_MetroBusService.png"/>"  >
							</a>
						</div>
						<div class="item">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
							</a>
						</div>
				</div>
				
				<div class="carousel-inner" align="center" ng-if=" advertiseSection=='AC Service'">
						<div class="item active">
							<a class="button" ng-href="tel:08826164813">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_OneTouchAirCondition&Refrigeration.png"/>" >
							</a>
						</div>
				</div>
				
				<div class="carousel-inner" align="center" ng-if=" advertiseSection=='SearchSite'">
						<div class="item active">
							<a class="button" ng-href="tel:08826164813">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_OneTouchAirCondition&Refrigeration.png"/>" >
							</a>
						</div>
				</div>
				
				<div class="carousel-inner" align="center" ng-if=" advertiseSection=='Toys' || advertiseSection=='Gifts'
								|| advertiseSection=='Photo Studio' || advertiseSection=='Stationery'
								|| advertiseSection=='Bakery' || advertiseSection=='Sweet Shops'
								|| advertiseSection=='Opticians' || advertiseSection=='Dry Cleaner'
								|| advertiseSection=='Notaries' || advertiseSection=='Pooja Items'
								|| advertiseSection=='Pandit Ji' || advertiseSection=='Tiffin Service'
								|| advertiseSection=='Appliance Repair' || advertiseSection=='Laptop Repair'
								|| advertiseSection=='Mobile Repair' || advertiseSection=='Pet Care'
								|| advertiseSection=='Interior Designer' || advertiseSection=='Electrical Shops'
								|| advertiseSection=='Electronic Shops' || advertiseSection=='Crockery Shops'
								|| advertiseSection=='Home & Décor' || advertiseSection=='Hardware & Paint'
								|| advertiseSection=='Cycle Shops' || advertiseSection=='ATMs'
								|| advertiseSection=='Banks' || advertiseSection=='Cake Shops'
								|| advertiseSection=='Courier Services'
								|| advertiseSection=='Tution' || advertiseSection=='Art Classes'">
						<div class="item active">
							<a class="button" ng-href="tel:08800587117">
								<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" >
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
	</div>
</div>
 --%>