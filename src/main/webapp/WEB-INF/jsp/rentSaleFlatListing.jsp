<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="padding-top: 20px;padding-left: 10px;padding-right: 10px;">
		<table width="100%">
			<tr>
				<td align="left">
					Rent & Sale Flat in Noida Extension
				</td>
				<td align="right">
					Search:<input type="test" size="50" placeholder="search for {{enableSection}}.." ng-model="searchFilter">
				</td>
			</tr>
		</table>
</div>

<div ng-init="getNxRentSaleFlatList()" style="padding-top: 20px;padding-left: 10px;padding-right: 10px;">	
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxRentSaleFlat in nxRentSaleFlatList | filter:searchFilter" >
				<table style=" border-spacing: 105px;width: 100%">
					<tr>
						<td style="padding-right: 5px;width: 30%">
								<img src="<c:url value="{{nxRentSaleFlat.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}/>
						</td>
						<td valign="top" style="text-align:left;width: 60%">
							<h4>
								{{nxRentSaleFlat.flatSize}} Flat for {{nxRentSaleFlat.categoryType}}
							</h4>
							<h5>
								Flat Details: {{ nxRentSaleFlat.flatDetails}}
							</h5>
							<h5>
								Address: {{ nxRentSaleFlat.address}}
							</h5> 
							<h5>
								Cost: {{ nxRentSaleFlat.cost}} 
							</h5> 
							<h5>
								{{ nxRentSaleFlat.ownerDealer}}  Name: {{ nxRentSaleFlat.ownerDealerName}} 
							</h5>
							<h5>
								Contact {{nxRentSaleFlat.ownerDealer}}: 
								<a class="button" ng-href="tel:{{nxRentSaleFlat.contactNumber}}">
									<img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"/> 
									{{ nxRentSaleFlat.contactNumber}} 
								</a>
							</h5> 
									
						</td>
						<td valign="top" style="text-align:lft;color: red; width: 10%;">
							<small >{{nxRentSaleFlat.locality}}</small>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>



