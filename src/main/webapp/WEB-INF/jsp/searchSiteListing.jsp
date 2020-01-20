<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="padding-top: 10px;padding-bottom: 10px;padding-left: 10px;padding-right: 10px;">
		<table width="100%">
			<tr>
				<td align="left" width="50%">
					You searched for '{{searchString}}'
				</td>
				<td align="right" width="50%">
					Filter Result:<input type="test" size="50" placeholder="Filter here.." style="color: red" ng-model="searchFilter">
				</td>
			</tr>
		</table>
</div>

<div ng-init="getNxSearchSiteList()" class="container" style="width:100%; padding-left: 10px;padding-right: 10px;padding-top: 10px;">
		
		
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxSearchSite in nxSearchSiteList | filter:searchFilter" >
				<table style=" border-spacing: 105px;" cellpadding="100">
					<tr>
						<td width="30%">
								<img src="<c:url value="{{nxSearchSite.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}>
						</td>
						<td width="1%"></td>
						<td valign="top" width="60%" style="text-align:left;">
									<h4>{{ nxSearchSite.name}}</h4>
									 <h5>{{nxSearchSite.specialization}}</h5>
									<h5>
										<a href="{{nxSearchSite.map}}" onClick="return popup(this, 'location')">		
										<img src="<c:url value="/img/common/address.png"/>"class="img-rounded" width="20" height="20"> </a>
										{{ nxSearchSite.address}}
									</h5>
									<h5>
										<a class="button" ng-href="tel:{{nxSearchSite.contactNumber}}">
										<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> 
										{{ nxSearchSite.contactNumber}}
										</a>
										 {{ nxSearchSite.contactNumberOther}}
										<!-- <a class="button" ng-href="tel:{{ nxSearchSite.contactNumber}}">{{ nxSearchSite.contactNumber}}</a> -->
									</h5> 
									<h5>
										<img src="<c:url value="/img/common/openTime.png"/>"class="img-rounded" width="20" height="20"> {{ nxSearchSite.openTime}} 
									</h5>
									<h5><img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20">   {{ nxSearchSite.website}} </h5> 
						</td>
						<td valign="top" style="text-align:left;">
							<small style="color: red">{{nxSearchSite.market}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>



