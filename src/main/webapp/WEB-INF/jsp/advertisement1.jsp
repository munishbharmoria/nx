<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row">
	<div class="col-xs-12">
			<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2000" >
			
				<!-- Wrapper for slides -->		
				<div class="carousel-inner" ng-if="advertiseSection=='Home' 
				  || advertiseSection=='aboutUs' || advertiseSection=='contactUs' || advertiseSection=='freeListing' || advertiseSection=='advertise' || 
				  advertiseSection=='customerCare' || advertiseSection=='privacyPolicy'" >
						<div class="item active">
							<div class="row" style="padding-top: 10px;padding-right: 15px;padding-left: 15px;padding-bottom: 10px;">
								<div class="col-xs-4" >
									<a class="button" ng-href="tel:01206850573">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight1}}; width: {{advertiseImageWidth1}}' src="<c:url value="/img/advertisement/adv1_FiveStarChicken.png"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:08826164813">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight1}}; width: {{advertiseImageWidth1}}' src="<c:url value="/img/advertisement/adv_OneTouchAirCondition&Refrigeration.png"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:07678599576">
										<img class="img-rounded hvr-grow" style='height: {{advertiseImageHeight1}}; width: {{advertiseImageWidth1}}' src="<c:url value="/img/advertisement/adv_teddyzonesPlaySchool.png"/>" >
									</a>
								</div>
							</div>
						</div>
						<%-- <div class="item">
							<div class="row">
								 <div class="col-xs-4">
									<a class="button" ng-href="tel:09319241740">
										<img style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_DrSSChandelOrtho.png"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:09319241740">
										<img style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_AryaAutomobile.jpg"/>" >
									</a>
								</div>
								<div class="col-xs-4">
									<a class="button" ng-href="tel:09319241740">
										<img style='height: {{advertiseImageHeight}}; width: {{advertiseImageWidth}}' src="<c:url value="/img/advertisement/adv_UMgroupAdvNoidaGSTReady.png"/>" >
									</a>
								</div>
							</div>
						</div>	 --%>
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
