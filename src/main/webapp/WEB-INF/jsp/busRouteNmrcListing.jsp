<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div style="padding-top: 20px;padding-left: 10px;padding-right: 10px;">
		<h3 class="font-weight-bold" align="center" style="color: Blue; background-color: orange;">
			<strong>Metro Bus Timings</strong>
		</h3>
</div>

<div ng-init="getNxBusRouteNmrcList()" style="padding-left: 10px;padding-right: 10px;padding-bottom: 10px">
		<ul class="nav navbar-nav" style="margin-left: 20px;">
			<li ng-repeat="nxBusRouteNmrc in nxBusRouteNmrcList" style="padding-left: 10px;padding-right: 10px;">
				<h4  class="figure-caption text-left" ng-model="data" ng-init="data=nxDirThumnail.caption"> 
					<strong>{{nxBusRouteNmrc.fromTo}}</strong>
				</h4>
				<img src="<c:url value="{{nxBusRouteNmrc.imageUrl}}"/>" class="img-rounded"/>
			</li>
		</ul>
</div>
