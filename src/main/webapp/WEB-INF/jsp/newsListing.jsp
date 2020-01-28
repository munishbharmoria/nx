<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div style="padding-left: 10px;padding-right: 10px;">
	<h4>Noida Extension's News</h4>
</div>
<div ng-if="isNewsSelected" style="padding-top: 10px;padding-left: 10px;padding-right: 10px;background: white; border-radius: 5px;">
		<table width="100%">
			<tr>
				<td align="left" width="30%" style="padding-right: 20px;">
					<img src="<c:url value="{{selectedNewsImageUrl}}"/>" class="img-rounded" width="350" height="300">
				</td>
				<td align="left" style="vertical-align: text-top;" >
						 <h2>{{selectedNewsHeadline}}</h2>
						 <h4>{{selectedNewsHeadlineDetails}}</h4>
						 <a class="button" ng-href="{{selectedNewsSourceLink}}" target="_blank">
							Read More
						</a>
				</td>
			</tr>
			<tr>
				<td align="left" style="padding-top: 3px;padding-bottom: 3px;">
						<span>{{selectedNewsSource}}</span> 
						<span style="color: gray;"> - {{selectedNewsDate}}</span>
				</td>
			</tr>
		</table>
</div>

<div ng-if="isNewsSelected" style="padding-top: 10px;padding-left: 10px;padding-right: 10px;">
		<table width="100%">
			<tr>
				<td align="left">	
						<h4>Other Stories</h4>
				</td>
			</tr>
		</table>
</div>

<div ng-init="getNxNewsList();" style="padding-top: 10px;padding-left: 10px;padding-right: 10px;">		
		<ul class="list-group" >
			<li class="list-group-item"  ng-repeat="nxNews in nxNewsList" >
				<a ng-click ="goToTop(); selectedNews(nxNews.newsHeadline, nxNews.newsHeadlineDetails, nxNews.newsSource, nxNews.newsSourceLink,  nxNews.newsDate, nxNews.imageUrl )" style="cursor: pointer;">
					<table style=" border-spacing: 105px;">
						<tr>
							<td style="padding-right: 5px;">
								<img src="<c:url value="{{nxNews.imageUrl}}"/>" class="img-rounded" width="150" height="100">
							</td>
							<td align="left" style="text-align:left;vertical-align: text-top;" >
								<h4>
									{{ nxNews.newsHeadline }}
								</h4>
								<h5>
									<span>{{nxNews.newsSource}}</span> 
									<span style="color: gray;"> - {{nxNews.newsDate}}</span>
								</h5>
							</td>
						</tr>
					</table>
				</a>
			</li>
		</ul>
</div> 



