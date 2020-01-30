<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div style="padding-left: 10px;padding-right: 10px;">
	<h4>Noida Extension's News</h4>
</div>
<div ng-if="isNewsSelected" align="left" style="padding-left: 15px;padding-right: 15px;background-color: white;">
		<table>
			<tr align="left">
				<td align="left" width="30%" style="padding-right: 20px; padding-top: 10px;">
					<img src="<c:url value="{{selectedNewsImageUrl}}"/>" class="img-rounded" width="450" height="250">
				</td>
				<td align="left" width="70%" style="vertical-align: top;text-align: left;">
					<h4>{{selectedNewsHeadline}}</h4>
					 <small style="vertical-align: top;white-space:pre-wrap; text-align: left;">{{selectedNewsHeadlineDetails}}
					 </small>
					 <a class="button" ng-href="{{selectedNewsSourceLink}}" target="_blank">
						<h5>
							<span>Read More</span>
						<h5>
					</a>
				</td>
			</tr>
			<tr align="left">
				<td style="padding-top: 5px;padding-bottom: 5px;">
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



