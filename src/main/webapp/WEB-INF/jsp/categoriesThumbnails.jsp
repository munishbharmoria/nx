<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div ng-init="getNxDirThumnailCategories()" class="container" style="width: 100%;">
		<table width="100%">
		<tr>
			<td align="left">&nbsp;&nbsp;&nbsp;&nbsp;<h4  class="figure-caption text-left" style="margin-left: 20px; color: blue;">Popular Services</h4>
			</td>
			<td align="right">Search:&nbsp;
			<input type="test" size="50" placeholder="search for anything.." ng-model="searchSiteString" ng-keydown="$event.keyCode === 13 && getMyAction('SearchSite', searchSiteString); goToTop();">
				<button class="fa fa-search" style="color: maroon;"  ng-click="getMyAction('SearchSite', searchSiteString); goToTop();"></button>
			</td>
		</tr>
		</table>
		
			<ul class="nav navbar-nav" style="margin-left: 20px;">
			<li ng-repeat="nxDirThumnail in nxCategoriesThumbnails">
				<h5  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> {{nxDirThumnail.caption}}</h5>
					<img style="cursor: pointer" ng-click="getMyAction(data); goToTop()" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="135" height="135">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			</li>
		</ul>
		
	</div>
