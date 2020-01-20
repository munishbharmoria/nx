<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="padding-top: 20px;padding-left: 10px;padding-right: 10px;">
		<table width="100%">
			<tr>
				<td align="left">
					Boutiques in Noida Extension
				</td>
				<td align="right">
					Search:<input type="test" size="50" placeholder="search for {{enableSection}}.." ng-model="searchFilter">
				</td>
			</tr>
		</table>
</div>

<div ng-init="getNxBoutiqueList()" style="padding-top: 20px;padding-left: 10px;padding-right: 10px;">		
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxBoutique in nxBoutiqueList | filter:searchFilter" >
				<table style=" border-spacing: 105px;">
					<tr>
						<td style="padding-right: 5px;width: 30%">
							<img src="<c:url value="{{nxBoutique.imageUrl}}"/>" class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}/>
						</td>
						<td valign="top" style="text-align:left;width: 60%">
							<h4>
								{{nxBoutique.name}}
							</h4>
							<h5>
								<a href="{{nxBoutique.map}}" onClick="return popup(this, 'location')">		
								<img src="<c:url value="/img/common/address.png"/>" class="img-rounded" width="20" height="20"/> 
								</a>
								{{nxBoutique.address}}
							</h5>
							<h5>
								<a class="button" ng-href="tel:{{nxBoutique.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>" class="img-rounded" width="20" height="20"/> 
									{{ nxBoutique.contactNumber}} 
								</a>
								{{ nxBoutique.contactNumberOther}}
							</h5> 
							<h5>
								<img src="<c:url value="/img/common/openTime.png"/>" class="img-rounded" width="20" height="20"/> 
								{{nxBoutique.openTime}} 
							</h5> 
							<h5>
								<img src="<c:url value="/img/common/website.png"/>" class="img-rounded" width="20" height="20"/> 
								{{nxBoutique.website}} 
							</h5>
						</td>
						<td valign="top" style="text-align:left;color: red">
							<small >{{nxBoutique.market}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>
