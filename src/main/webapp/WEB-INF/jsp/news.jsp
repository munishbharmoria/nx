<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div ng-init="getNxDirNews()">
		<li ng-repeat="nxNews in nxNewsList">
			<marquee align="center" class="news" direction="left" onMouseOver="this.stop()" onMouseOut="this.start()"> 
					<span class="colorRed">News Headline: </span>{{nxNews.news}} 
			</marquee>
		</li>
</div>

