<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<script async
	src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
  (adsbygoogle = window.adsbygoogle || []).push({
    google_ad_client: "ca-pub-8688561335438798",
    enable_page_level_ads: true
  });
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
<title>NxDial.com - Noida Extension's Free Directory</title>
<link rel="shortcut icon" href="/img/NxD.ico" type="image/x-icon">
</head>
<body ng-app='shopModule' class="mh-100"
	style="width: 1000px; height: 1000px; background-color: #eed; margin: auto;">
	<jsp:include page="common.jsp"></jsp:include>

	<div ng-controller="shopController" style="width: 1000px;background-color: #eee"
		ng-init="initialize()">

		<div>
			<jsp:include page="header.jsp"></jsp:include>
		</div>

		</br>

		<div style="width: 980px; background-color: #eed; margin: auto;">
			<jsp:include page="categories.jsp"></jsp:include>
			<jsp:include page="advertisement.jsp"></jsp:include>
		</div>


		<div ng-if="enableSection=='Home'">
			<jsp:include page="news.jsp"></jsp:include>
			<jsp:include page="categoriesThumbnails.jsp"></jsp:include>
			<jsp:include page="otherCategoriesThumbnails.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection=='Restaurants'">
			<jsp:include page="restaurantsListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'Doctors'">
			<jsp:include page="doctorsListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection  == 'Hospitals'">
			<jsp:include page="hospitalsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'Pharmacy'">
			<jsp:include page="pharmacyListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'Path Labs'">
			<jsp:include page="pathLabsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'Schools'">
			<jsp:include page="schoolsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection  == 'Play Schools'">
			<jsp:include page="playSchoolsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'Daily Needs'">
			<jsp:include page="dailyNeedsListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'Taxi Services'">
			<jsp:include page="taxiServiceListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection == 'Parlour & Salon'">
			<jsp:include page="personalCareListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='Automobiles'">
			<jsp:include page="automobilesListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection=='Shopping'">
			<jsp:include page="shoppingListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='Boutique'">
			<jsp:include page="boutiqueListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='Rent & Sale'">
			<jsp:include page="rentSaleFlatListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='Metro Bus'">
			<jsp:include page="busRouteNmrcListing.jsp"></jsp:include>
		</div>
		
		<div ng-if="enableSection=='OtherCategory'">
			<jsp:include page="otherCategoryListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'aboutUs'">
			<jsp:include page="aboutUs.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'contactUs'">
			<jsp:include page="contactUs.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'freeListing'">
			<jsp:include page="freeListing.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'advertise'">
			<jsp:include page="advertise.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'customerCare'">
			<jsp:include page="customerCare.jsp"></jsp:include>
		</div>

		<div ng-if="enableSection == 'register'">
			<jsp:include page="registerListing.jsp"></jsp:include>
		</div>

		<hr noshade="noshade" />
		<div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<button onclick="topFunction()" id="myBtn" title="Go to top"
			align="right">Top</button>
	</div>
</body>
</html>
