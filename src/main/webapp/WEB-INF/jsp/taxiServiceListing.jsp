<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div ng-init="getNxTaxiServiceList()" class="container" style="width: 1000px;">
		</br>
		<table width="100%">
		<tr>
			<td align="left">&nbsp;&nbsp;&nbsp;&nbsp;Taxi Services in Noida Extension</td>
			<td align="right">Search:&nbsp;<input type="test" size="50" placeholder="search for anything.." ng-model="searchFilter"></td>
			</tr>
		</table>
		</br>
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxTaxiService in nxTaxiServiceList | filter:searchFilter" >
				<table style=" border-spacing: 105px;" cellpadding="100">
					<tr>
						<td width="30%">
								<img src="<c:url value="{{nxTaxiService.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}>
						</td>
						<td width="1%"></td>
						<td valign="top" width="60%" style="text-align:left;">
									<h4>{{ nxTaxiService.name}}</h4>
									<h5>
									<a href="{{nxTaxiService.map}}" onClick="return popup(this, 'location')">		
									<img src="<c:url value="/img/common/address.png"/>"class="img-rounded" width="20" height="20"> </a>
									{{ nxTaxiService.address}}
									</h5>
									<h5>
									<a class="button" ng-href="tel:{{nxTaxiService.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> 
									{{nxTaxiService.contactNumber}}
									</a>
									 {{nxTaxiService.contactNumberOther}}
									<%-- <img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> {{ nxTaxiService.contactNumber}}  --%>
									</h5> 
									<h5><img src="<c:url value="/img/common/openTime.png"/>"class="img-rounded" width="20" height="20"> {{ nxTaxiService.openTime}} </h5>
									<h5><img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20">   {{ nxTaxiService.website}} </h5> 
						</td>
						<td valign="top" style="text-align:left;">
							<small style="color: red">{{nxTaxiService.market}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>



