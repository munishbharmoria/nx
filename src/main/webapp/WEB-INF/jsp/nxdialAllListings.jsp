<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div ng-init="getNxDoctorsSpecializationKeyList()"  style="padding-top: 20px;padding-left: 15px;padding-right: 10px;">
	<table>
			<tr>
				<table width="100%">
					<tr>
						<td style="width: 50%; text-align: left">
							<h4>{{selectedCategory}} in Noida Extension</h4>
						</td>
						<td style="text-align: right; width: 15%; color: red;cursor: pointer;" ng-click='clearSearchFilter()'>
							Clear All
						</td>
						<td style="width: 10%; text-align: right;padding-right: 3px;">
							Filter:
						</td>
						<td style="width: 25%; align: right;">
						<input type="test" size="50" placeholder="Filter for {{selectedCategory}}.."
							ng-model="searchFilter">
						</td>
					</tr>
					<tr>
						<td style="width: 50%; text-align: left">
							<div ng-repeat="nxDirDoctorsSpecializationKey in nxDirDoctorsSpecializationKeyList">
								<a class="underline" style="text-decoration: none;cursor: pointer;" ng-click="filterSearch(dataKey);goToTop();" ng-model="dataKey">
									<span>{{nxDirDoctorsSpecializationKey.specializationKey}}</span>
								</a>
							</div>
						</td>
					</tr>
				</table>
			</tr>
	</table>
</div>
<h5 style="padding-left: 15px;padding-right: 10px; font-weight:bold;color: dark gray;">SORT RESULT NEAR YOU</h5>
<div ng-init="getUniqueLocations()" style="padding-left: 10px;padding-right: 10px;">
<table valign="top">
		<tr valign="top">
			<td valign="top" width="15%">
				<ul class="list-group" >
					<li ng-class-odd="'odd'" ng-class-even="'even'" class="list-group-item" ng-repeat="nxUniqueLocation in nxUniqueLocationsList" > 
							<a class="underline" style="text-decoration: none;cursor: pointer;" ng-click="filterSearch(data);goToTop();" ng-model="data" ng-init="data=nxUniqueLocation.marketMain">
								<span>{{nxUniqueLocation.marketMain}}</span>
							</a>
					</li>
				</ul>
			</td>
		<td align="left" width="85%">
			<div ng-init="getNxSelectedCategoryList()" style="padding-left: 10px;padding-right: 10px;">	
					<ul class="list-group" >
						<li class="list-group-item"  ng-repeat="nxCategory in nxCategoryList | filter:searchFilter | filter:searchFilter1" > 
							<table style=" border-spacing: 105px;">
								<tr>
									<td style="padding-right: 5px;width: 15%">
											<img src="<c:url value="{{nxCategory.imageUrl}}"/>" class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}/>
									</td>
									<td valign="top" style="text-align:left;width: 75%">
										<h4>
											{{ nxCategory.name}}
										</h4>
										<h5 ng-if="nxCategory.specialization!=''">
											<img src="<c:url value="/img/common/speciality.png"/>" class="img-rounded" width="20" height="20"/> 
											{{nxCategory.specialization}}
										</h5>
										<h5>
											<a href="{{nxCategory.map}}" onClick="return popup(this, 'location')">		
											<img src="<c:url value="/img/common/address.png"/>" class="img-rounded" width="20" height="20"/> </a>
											{{ nxCategory.address}}
										</h5>
										<h5>
											<a class="button" ng-href="tel:{{nxCategory.contactNumber}}">
												<img src="<c:url value="/img/common/phone.png"/>" class="img-rounded" width="20" height="20"/> 
												{{nxCategory.contactNumber}} 
											</a>
											{{nxCategory.contactNumberOther}}
											<a class="button" ng-href="https://wa.me/91{{nxCategory.contactNumber}}" target="_blank">
												<img src="<c:url value="/img/common/whatsApp.png"/>" class="img-rounded" width="20" height="20"/>
											</a>
										</h5> 
										<h5>
											<img src="<c:url value="/img/common/openTime.png"/>" class="img-rounded" width="20" height="20"/> 
											{{ nxCategory.openTime}} 
										</h5>
										<h5 ng-if="nxCategory.website!=''">
											<a href="{{nxCategory.website}}" target="_blank">	
												<img src="<c:url value="/img/common/website.png"/>" class="img-rounded" width="20" height="20"/>   
												{{ nxCategory.website}} 
											</a>
										</h5> 
									</td>
									<td valign="top" style="text-align:left;color: red; width: 15%">
										<small >{{nxCategory.market}}</small>
									</td>
								</tr>
							</table>
						</li>
					</ul>
			</div>
		</td>
	</tr>
</table>
</div>