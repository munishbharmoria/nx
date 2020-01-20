<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="padding-top: 20px;padding-left: 10px;padding-right: 10px;">
		<table width="100%">
			<tr>
				<td align="left">
					Taxi Services in Noida Extension
				</td>
				<td align="right">
					Search:<input type="test" size="50" placeholder="search for {{enableSection}}.." ng-model="searchFilter">
				</td>
			</tr>
		</table>
</div>

<div ng-init="getNxTaxiServiceList()" style="padding-top: 20px;padding-left: 10px;padding-right: 10px;">		
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxTaxiService in nxTaxiServiceList | filter:searchFilter" >
				<table style=" border-spacing: 105px;">
					<tr>
						<td style="padding-right: 5px;width: 30%">
							<img src="<c:url value="{{nxTaxiService.imageUrl}}"/>" class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}/>
						</td>
						<td valign="top" style="text-align:left;width: 60%">
							<h4>
								{{ nxTaxiService.name}}
							</h4>
							<h5>
								<a href="{{nxTaxiService.map}}" onClick="return popup(this, 'location')">		
									<img src="<c:url value="/img/common/address.png"/>" class="img-rounded" width="20" height="20"/> 
								</a>
								{{ nxTaxiService.address}}
							</h5>
							<h5>
								<a class="button" ng-href="tel:{{nxTaxiService.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>" class="img-rounded" width="20" height="20"/> 
									{{nxTaxiService.contactNumber}}
								</a>
								{{nxTaxiService.contactNumberOther}}
							</h5> 
							<h5>
								<img src="<c:url value="/img/common/openTime.png"/>" class="img-rounded" width="20" height="20"/> 
								{{ nxTaxiService.openTime}} 
							</h5>
							<h5>
								<img src="<c:url value="/img/common/website.png"/>" class="img-rounded" width="20" height="20"/>   
								{{ nxTaxiService.website}} 
							</h5> 
						</td>
						<td valign="top" style="text-align:left;color: red">
							<small >{{nxTaxiService.market}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>



