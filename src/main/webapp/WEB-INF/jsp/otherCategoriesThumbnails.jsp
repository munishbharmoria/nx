<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div ng-init="getNxDirThumnailCategories()" style="padding-left: 14px;padding-right: 14px;">
		<table>
			<tr>
				<td align="left" style="padding-right: 290px;">
					<h4  class="figure-caption text-left" style="color: blue;">
						Other Services
					</h4>
				</td>
			</tr>
		</table>	
	</div>

	<div ng-init="getNxDirThumnailOtherCategories()">
			<ul class="nav navbar-nav">
				<li style="padding-right: 14px;padding-bottom: 20px;padding-left: 14px;" ng-repeat="nxDirThumnail in nxOtherCategoriesThumbnails">
					<h5  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> 
						{{nxDirThumnail.caption}}
					</h5>
					<img style="cursor: pointer" ng-click="getMyActionOtherCategory(data); goToTop()" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="135" height="135">
				</li>
			</ul>
	</div>
	
