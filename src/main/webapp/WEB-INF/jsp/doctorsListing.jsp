<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<%-- <div id="myCarousel" class="carousel slide" data-ride="carousel" style="width: 980px; background-color: #eed; margin: auto;">
  <!-- Indicators -->
 <!--  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol> -->

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
  			<div class="item active">
	    		<a class="button" ng-href="tel:09873577568"><img style='height: 150px; width: 1000px' src="<c:url value="/img/doctor/doctor_advertise1.jpeg"/>" ></a>
	    	</div>
	    	<div class="item">
	    		<a class="button" ng-href="tel:08800587117"><img style='height: 150px; width: 1000px' src="<c:url value="/img/advertisement/adv_AdvertiseYourShopHere.png"/>" ></a>
	    	</div>
	</div>
	
	  <!-- Controls -->
	 <!--  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
	    <span class="glyphicon glyphicon-chevron-left"></span>
	  </a>
	  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
	    <span class="glyphicon glyphicon-chevron-right"></span>
	  </a> -->
</div> <!-- Carousel --> --%>

<div ng-init="getNxDoctorList()" class="container" style="width: 1000px;">
		</br>
		<table width="100%">
			<tr>
				<td align="left">&nbsp;&nbsp;&nbsp;&nbsp;Doctors in Noida Extension</td>
				<td align="right">Search:&nbsp;<input type="test" size="50" placeholder="search for {{enableSection}}.." ng-model="searchFilter"></td>
			</tr>
		</table>
		</br>
		
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxDoctor in nxDoctorsList | filter:searchFilter" >
				<table style=" border-spacing: 105px;" cellpadding="100">
					<tr>
						<td width="30%">
								<img src="<c:url value="{{nxDoctor.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}>
						</td>
						<td width="1%"></td>
						<td valign="top" width="60%" style="text-align:left;">
									<h4>{{nxDoctor.name}}</h4>
									<h5>
									<img src="<c:url value="/img/common/speciality.png"/>"class="img-rounded" width="20" height="20"> </a>
									{{nxDoctor.specialization}}
									</h5>
									<h5>
									<a href="{{nxDoctor.map}}" onClick="return popup(this, 'location')">		
									<img src="<c:url value="/img/common/address.png"/>"class="img-rounded" width="20" height="20"> </a>
									{{nxDoctor.address}}
									</h5>
									<h5>
									<a class="button" ng-href="tel:{{nxDoctor.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> 
									{{nxDoctor.contactNumber}}
									</a>
									 {{nxDoctor.contactNumberOther}}
									<%-- <img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> {{nxDoctor.contactNumber}}  --%>
									</h5> 
									<h5><img src="<c:url value="/img/common/openTime.png"/>"class="img-rounded" width="20" height="20"> {{nxDoctor.openTime}} </h5> 
									<h5><img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20"> {{nxDoctor.website}} </h5>
						</td>
						<td valign="top">
							<small style="color: red">{{nxDoctor.market}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>
