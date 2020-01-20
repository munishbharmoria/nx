<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<%-- <div ng-init="getNxDirThumnailOtherCategories()" class="container" style="width: 100%;">
&nbsp;&nbsp;&nbsp;&nbsp;</br><h4  class="figure-caption text-left" style="margin-left: 20px;color: blue;">Other Services</h4>
	<ul class="nav navbar-nav" style="margin-left: 20px;">
		<li ng-repeat="nxDirThumnail in nxOtherCategoriesThumbnails">
		<h5  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> {{nxDirThumnail.caption}}</h5>
			<img style="cursor: pointer" ng-click="getMyActionOtherCategory(data); goToTop()" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="135" height="135">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</li>
	</ul>
</div> --%>

<div ng-init="getNxDirThumnailCategories()" style="padding-left: 50px;padding-right: 50px;">
		<table>
			<tr>
				<td align="left" style="padding-right: 250px;">
					<h4  class="figure-caption text-left" style="color: blue;">
						Other Services
					</h4>
				</td>
			</tr>
		</table>	
	</div>

	<div ng-init="getNxDirThumnailOtherCategories()" style="padding-left: 50px;">
			<ul class="nav navbar-nav">
				<li style="padding-right: 50px;padding-bottom: 20px;" ng-repeat="nxDirThumnail in nxOtherCategoriesThumbnails">
				<h5  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> 
					{{nxDirThumnail.caption}}
				</h5>
				<img style="cursor: pointer" ng-click="getMyActionOtherCategory(data); goToTop()" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="135" height="135">
				</li>
			</ul>
	</div>
