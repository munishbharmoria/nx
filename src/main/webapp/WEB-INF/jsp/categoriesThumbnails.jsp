<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	 
<div ng-init="getNxDirThumnailCategories()">
	<table width="100%">
		<tr width="100%">
			<td width="100%">
				<ul class="nav navbar-nav" >
					<li style="padding-top: 14px;padding-right: 22px;padding-left: 20px;padding-bottom: 20px;" ng-repeat="nxDirThumnail in nxCategoriesThumbnails">
						<h5  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> 
							{{nxDirThumnail.caption}}
						</h5>
						<img style="cursor: pointer" ng-click="getMyAction1(data); goToTop()" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="135" height="135">
					</li>
				</ul>
			</td>
		</tr>	
	</table>
</div> 