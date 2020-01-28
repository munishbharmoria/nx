<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	
<div style="padding-left: 10px;padding-right: 10px;padding-bottom: 5px;padding-top: 5px;">
		<table width="100%">
			<tr>
				<td style="width: 55%; text-align: right;padding-right: 50px">	
					<a class="button blinking" ng-click ="newsListing()" style="font-weight:bold;cursor: pointer;;text-align: right;width: 20%">
						Noida Extension's News
					</a>
				</td>
				<td style="color: blue;width: 5%; text-align: right;padding-right: 2px">	
					Search:
				</td>
				<td style="width: 35%; align: right;">
						<input type="test" size="50" placeholder="search for anything.." style="color: red" ng-model="searchSiteString" ng-keydown="$event.keyCode === 13 && getMyAction('SearchSite', searchSiteString); goToTop();"/>
						
				</td>
				<td style="color: blue;">	
					<button class="fa fa-search" style="color: red;"  ng-click="getMyAction('SearchSite', searchSiteString); goToTop();"/>
				</td>
			</tr>
		</table>	
</div>
<div  ng-init="getNxDirCategories()">
	<nav class="navbar navbar-inverse">
			<ul class="nav navbar-nav">
				<li ng-repeat="nxCategory in nxDirCategories" style="padding-left: 5px;padding-right: 5px;">
					<h5 ng-model="data" ng-init="data=nxCategory.caption" ng-click="getMyAction1(data)"
					 class="hvr-grow categories"> 
						{{nxCategory.name}}
					</h5>
				</li>			
			 </ul>
	</nav>
</div>

