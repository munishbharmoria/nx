<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<div  ng-init="getNxDirCategories()">
	<nav class="navbar navbar-inverse">
			<ul class="nav navbar-nav">
				<li ng-repeat="nxCategory in nxDirCategories" style="padding-left: 5px;padding-right: 5px;">
					<h5 ng-model="data" ng-init="data=nxCategory.caption" ng-click="getMyAction(data)"
					 class="hvr-grow categories"> 
						{{nxCategory.name}}
					</h5>
				</li>			
			 </ul>
	</nav>
</div>

