<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div ng-init="getNxBusRouteNmrcList()" class="container" style="width: 1000px;">
		<h3 class="font-weight-bold" align="center" style="color: Blue; background-color: orange; ;">&nbsp;&nbsp;&nbsp;&nbsp;
			<strong>Metro Bus Timings</strong>
		</h3>
		
		<ul class="nav navbar-nav" style="margin-left: 20px;">
			<li ng-repeat="nxBusRouteNmrc in nxBusRouteNmrcList">
			<h4  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> <strong>{{nxBusRouteNmrc.fromTo}} </strong></h4>
				<img src="<c:url value="{{nxBusRouteNmrc.imageUrl}}"/>" class="img-rounded">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</li>
		</ul>
</div>
