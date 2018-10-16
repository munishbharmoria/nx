<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%-- <div ng-init="getNxDirThumnailCategories()" class="container" data-scale="1.6">
&nbsp;&nbsp;&nbsp;&nbsp;</br><h5  class="figure-caption text-left">Popular Services</h5></br>
	<ul class="nav navbar-nav">
		<li ng-repeat="nxDirThumnail in nxCategoriesThumbnails">
		<h5  class="figure-caption text-center"> {{nxDirThumnail.caption}}</h5>
		<a class="hvr-grow" href="<c:url value="/shop/listing/{{nxDirThumnail.caption}}"/>">		
			<img src="<c:url value="{{nxDirThumnail.imagePath}}"/>"class="img-rounded" width="200" height="200">
		</a></li>
	</ul>
</div> --%>

<div ng-init="getNxDirThumnailCategories()" class="container" data-scale="1.6">
&nbsp;&nbsp;&nbsp;&nbsp;</br><h5  class="figure-caption text-left">Popular Services</h5></br>
	<ul class="nav navbar-nav" >
		<li ng-repeat="nxDirThumnail in nxCategoriesThumbnails">
		<h4  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> {{nxDirThumnail.caption}}</h4>
			<img style="cursor: pointer" ng-click="getMyAction(data)" src="<c:url value="{{nxDirThumnail.imagePath}}"/>" class="img-rounded hvr-grow" width="200" height="200">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</li>
	</ul>
</div>