<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div ng-init="getNxRentSaleFlatList()" class="container" style="width: 1000px;">
		</br>
		<table width="100%">
		<tr>
			<td align="left">&nbsp;&nbsp;&nbsp;&nbsp;Rent & Sale Flat in Noida Extension</td>
			<td align="right">Search:&nbsp;<input type="test" size="50" placeholder="search for anything.." ng-model="searchFilter"></td>
		</tr>
		</table>
		</br>
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxRentSaleFlat in nxRentSaleFlatList | filter:searchFilter" >
				<table style=" border-spacing: 105px;" cellpadding="100">
					<tr>
						<td width="30%">
								<img src="<c:url value="{{nxRentSaleFlat.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}>
						</td>
						<td width="1%"></td>
						<td valign="top" width="60%" style="text-align:left;">
									<h4>{{nxRentSaleFlat.flatSize}} Flat for {{nxRentSaleFlat.categoryType}}</h4>
									<h5>
									<%-- <a href="{{nxRentSaleFlat.map}}" onClick="return popup(this, 'location')">		
									<img src="<c:url value="/img/common/address.png"/>"class="img-rounded" width="20" height="20"> </a> --%>
									Flat Details: &nbsp;{{ nxRentSaleFlat.flatDetails}}
									</h5>
									<h5>
									<%-- <a class="button" ng-href="tel:{{nxRentSaleFlat.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> 
									</a> --%>
									Address: &nbsp;{{ nxRentSaleFlat.address}}
									<!-- <a class="button" ng-href="tel:{{ nxRentSaleFlat.contactNumber}}">{{ nxRentSaleFlat.contactNumber}}</a> -->
									 </h5> 
									 <h5>
									<%-- <img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20">    --%>
									Cost: &nbsp;{{ nxRentSaleFlat.cost}} </h5> 
									<h5>
									<%-- <img src="<c:url value="/img/common/opentSaleime.png"/>"class="img-rounded" width="20" height="20"> --%> 
									{{ nxRentSaleFlat.ownerDealer}}  Name: &nbsp;{{ nxRentSaleFlat.ownerDealerName}} </h5>
									<h5>
									<%-- <img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20">    --%>
									Contact {{nxRentSaleFlat.ownerDealer}}: &nbsp;
									<a class="button" ng-href="tel:{{nxRentSaleFlat.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> 
									{{ nxRentSaleFlat.contactNumber}} 
									</a>
									</h5> 
									
						</td>
						<td valign="top" style="text-align:left;">
							<small style="color: red">{{nxRentSaleFlat.locality}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>



