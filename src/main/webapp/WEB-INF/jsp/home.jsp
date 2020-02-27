<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<script data-ad-client="ca-pub-8688561335438798" 
async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js">
		
</script>
	
	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async
		src="https://www.googletagmanager.com/gtag/js?id=UA-140234422-1"></script>
	<script>
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());
	
	  gtag('config', 'UA-140234422-1');
	</script>
	
	<title>NxDial.com - Noida Extension's Online Directory</title>
	
	<link rel="shortcut icon" href="/img/NxD.ico" type="image/x-icon">
	
</head>

<body ng-app='shopModule' class="home" >

	<jsp:include page="common.jsp"></jsp:include>

	<div ng-controller="shopController" class="homeBase" ng-init="initialize()">

		<div>
			<jsp:include page="header.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection=='Home'">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="categoriesThumbnails.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='SearchSite'" >
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="searchSiteListing.jsp"></jsp:include>
		</div>
		
		 <div ng-if="enableSection=='SelectedCategory'" >
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="nxdialAllListings.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection=='Rent & Sale'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="rentSaleFlatListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='newsListing'">
			<jsp:include page="newsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='Metro Bus'">
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="busRouteNmrcListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'aboutUs'">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="aboutUs.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'contactUs'">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="contactUs.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'freeListing'">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="freeListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'advertise'">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="advertise.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'customerCare'">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="customerCare.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'privacyPolicy'">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="privacyPolicy.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'register'">
			<jsp:include page="registerListing.jsp"></jsp:include>
		</div>

		<div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<button onclick="topFunction()" id="myBtn" title="Go to top"
			align="right">Top</button>

		<%-- <a class="button" ng-href="https://wa.me/918800587117" target="_blank">
			<img class="img-fluid" alt="Responsive image" src="<c:url value="/img/common/whatsApp.jpg"/>" >
		</a>	 --%>
		</div>
</body>
</html>
