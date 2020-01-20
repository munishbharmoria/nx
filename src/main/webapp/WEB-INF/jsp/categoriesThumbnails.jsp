<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<div style="padding-left: 14px;padding-right: 14px;">
		<table width="100%">
			<tr>
				<td align="right" style="color: blue;">Search:
					<input type="test" size="50" placeholder="search for anything.." style="color: red" ng-model="searchSiteString" ng-keydown="$event.keyCode === 13 && getMyAction('SearchSite', searchSiteString); goToTop();"/>
					<button class="fa fa-search" style="color: red;"  ng-click="getMyAction('SearchSite', searchSiteString); goToTop();"/>
				</td>
			</tr>
			<tr>
				<td align="left" style="color: blue;">
					<h4  class="figure-caption text-left" >
						Popular Services
					</h4>
				</td>
			</tr>
		</table>	
	</div>
	<div ng-init="getNxDirThumnailCategories()" >
			<ul class="nav navbar-nav" >
				<li style="padding-right: 14px;padding-bottom: 20px;padding-left: 14px;" ng-repeat="nxDirThumnail in nxCategoriesThumbnails">
					<h5  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> 
						{{nxDirThumnail.caption}}
					</h5>
					<img style="cursor: pointer" ng-click="getMyAction(data); goToTop()" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="135" height="135">
				</li>
			</ul>
	</div>
