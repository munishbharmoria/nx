<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div ng-init="getNxAutomobileList()" class="container" style="width: 1000px;">

		<table width="100%">
		<tr>
			<td align="left">&nbsp;&nbsp;&nbsp;&nbsp;<h4>Automobiles Services in Noida Extension</h4></td>
		</tr>
			<tr>
				<td align="right"><h4>Search:&nbsp;<input type="test" size="50" placeholder="search for anything.." ng-model="searchFilter"></h4></td>
			</tr>
		</table>
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxAutomobile in nxAutoMList | filter:searchFilter" >
				<table style=" border-spacing: 105px;" cellpadding="100">
					<tr>
						<td width="30%">
								<img src="<c:url value="{{nxAutomobile.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}>
						</td>
						<td width="1%"></td>
						<td valign="top" width="60%" style="text-align:left;">
									<h4>{{ nxAutomobile.name}}</h4>
									<h5>
									<a href="{{nxAutomobile.map}}" onClick="return popup(this, 'location')">		
									<img src="<c:url value="/img/common/address.png"/>"class="img-rounded" width="20" height="20"> </a>
									{{ nxAutomobile.address}}
									</h5>
									<h5><img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> {{ nxAutomobile.contactNumber}} </h5> 
									<h5><img src="<c:url value="/img/common/openTime.png"/>"class="img-rounded" width="20" height="20"> {{ nxAutomobile.openTime}} </h5>
									<h5><img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20">   {{ nxAutomobile.website}} </h5> 
						</td>
						<td valign="top" style="text-align:left;">
							<small style="color: red">{{nxAutomobile.market}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>



