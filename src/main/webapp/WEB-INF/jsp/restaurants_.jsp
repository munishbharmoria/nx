<html>
<head>
<link href="css/custom.css" rel="stylesheet">
<jsp:include page="./common.jsp"></jsp:include>
</head>
<body ng-app='shopModule' ng-controller="shopController" class="mh-100" style="width: 1000px; height: 1000px; background-color: #eed;  margin: auto;">
	<div style="background-color: #eee">
		<div>
			
		</div>
		<div>
			<jsp:include page="./header.jsp"></jsp:include>
		</div>
		<hr noshade="noshade" />
		<div>
			<jsp:include page="./categories.jsp"></jsp:include>
		</div>
		<hr noshade="noshade" />
		 <div>
			<jsp:include page="./restaurantsAdvertisement.jsp"></jsp:include>
		</div>
		<hr noshade="noshade" />
		<div>
			<jsp:include page="./restaurantsListing.jsp" ></jsp:include>
		</div>
		<hr noshade="noshade" /> 
		<div>
			<jsp:include page="./footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>
