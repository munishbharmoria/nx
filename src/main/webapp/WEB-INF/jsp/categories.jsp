<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<%@ page session="false"%>

<div  ng-init="getNxDirCategories()">
	<nav class="navbar navbar-inverse">
			<ul class="nav navbar-nav">
				<li ng-repeat="nxCategory in nxDirCategories">
					<h5 ng-model="data" ng-init="data=nxCategory.caption" ng-click="getMyAction(data)"
					 style='color:white;cursor: pointer;font-family: "Comic Sans MS", cursive, sans-serif;' class="hvr-grow"> 
						&nbsp;&nbsp;
						{{nxCategory.name}}
						&nbsp;&nbsp;
					</h5>
					
			</ul>
	</nav>
</div>

