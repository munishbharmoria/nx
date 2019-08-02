<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>
<div ng-init="getNxDirNews()" align="center">
		<li ng-repeat="nxNews in nxNewsList" style="list-style-type: none;">
			<marquee align="center"
			width="98%"
					style='font-family: "Comic Sans MS", cursive, sans-serif;background-color: yellow ;'
					direction="left" onMouseOver="this.stop()"
					onMouseOut="this.start()"> 
					<span style='color:red'>News Headline: </span>{{nxNews.news}} 
					<a href="{{nxNews.newsURL}}" target="_blank"> Read more</a>
			</marquee>
		</li>
</div>

