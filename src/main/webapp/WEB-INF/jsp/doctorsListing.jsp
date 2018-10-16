<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div ng-init="getNxDoctorList()" class="container" style="width: 1000px;">
&nbsp;&nbsp;&nbsp;&nbsp;<h4>Doctors in Noida Extension</h4>
		
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxDoctor in nxDoctorsList" >
				<table style=" border-spacing: 105px;" cellpadding="100">
					<tr>
						<td width="30%">
								<img src="<c:url value="{{nxDoctor.imageUrl}}"/>"class="img-rounded" width={{listingImageWidth}} height={{listingImageHeight}}>
						</td>
						<td valign="top" width="65%" style="text-align:left;">
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
									<h5><img src="<c:url value="/img/common/phone.png"/>"class="img-rounded" width="20" height="20"> {{nxDoctor.contactNumber}} </h5> 
									<h5><img src="<c:url value="/img/common/openTime.png"/>"class="img-rounded" width="20" height="20"> {{nxDoctor.openTime}} </h5> 
									<h5><img src="<c:url value="/img/common/website.png"/>"class="img-rounded" width="20" height="20"> {{nxDoctor.website}} </h5>
						</td>
					</tr>
				</table>
			</li>
		</ul>
</div>
