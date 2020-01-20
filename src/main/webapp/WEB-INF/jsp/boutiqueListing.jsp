<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div ng-init="getNxBoutiqueList()" class="container" style="width: 1000px;">
		</br>
		<table width="100%">
			<tr>
				<td align="left">&nbsp;&nbsp;&nbsp;&nbsp;Boutiques in Noida Extension</td>
				<td align="right">Search:&nbsp;<input type="test" size="50" placeholder="search for {{enableSection}}.." ng-model="searchFilter"></td>
			</tr>
		</table>
		</br>
		
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxBoutique in nxBoutiqueList | filter:searchFilter" >
				<table style=" border-spacing: 105px;" cellpadding="100">
					<tr>
						<td width="30%">
								<img src="<c:url value="{{nxBoutique.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}>
						</td>
						<td width="1%"></td>
						<td valign="top" width="60%" style="text-align:left;">
									<h4>{{nxBoutique.name}}</h4>
									<h5>
									<a href="{{nxBoutique.map}}" onClick="return popup(this, 'location')">		
									<img src="<c:url value="/img/common/address.png"/>"class="img-rounded" width="20" height="20"> </a>
									{{nxBoutique.address}}
									</h5>
									<h5>
									<a class="button" ng-href="tel:{{nxBoutique.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> 
									{{ nxBoutique.contactNumber}} 
									</a>
									{{ nxBoutique.contactNumberOther}}
									<%-- <img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> {{nxBoutique.contactNumber}}  --%>
									</h5> 
									<h5><img src="<c:url value="/img/common/openTime.png"/>"class="img-rounded" width="20" height="20"> {{nxBoutique.openTime}} </h5> 
									<h5><img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20"> {{nxBoutique.website}} </h5>
						</td>
						<td valign="top">
							<small style="color: red">{{nxBoutique.market}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>
