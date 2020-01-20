<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<div style="padding-left: 50px;padding-right: 50px;">
		<table>
			<tr>
				<td align="left" style="padding-right: 250px;">
					<h4  class="figure-caption text-left" style="color: blue;">
						Popular Services
					</h4>
				</td>
				<td align="left" style="padding-right: 5px;">Search:
					<input type="test" size="50" placeholder="search for anything.." ng-model="searchSiteString" ng-keydown="$event.keyCode === 13 && getMyAction('SearchSite', searchSiteString); goToTop();"/>
				</td>
				<td align="left" >
					<button class="fa fa-search" style="color: red;"  ng-click="getMyAction('SearchSite', searchSiteString); goToTop();"/>
				</td>
			</tr>
		</table>	
	</div>
	<div ng-init="getNxDirThumnailCategories()" style="padding-left: 50px;">
			<ul class="nav navbar-nav" >
				<li style="padding-right: 50px;padding-bottom: 20px;" ng-repeat="nxDirThumnail in nxCategoriesThumbnails">
					<h5  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> 
						{{nxDirThumnail.caption}}
					</h5>
					<img style="cursor: pointer" ng-click="getMyAction(data); goToTop()" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="135" height="135">
				</li>
			</ul>
	</div>
