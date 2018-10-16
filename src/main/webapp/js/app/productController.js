'use strict';

var module = angular.module('shopModule', ['ngRoute']);
angular.module('shopModule').controller('shopController', [ '$scope', '$http', function($scope, $http,$interval) {
	
	$scope.initialize = function(){
		$scope.listingImageWidth = "300";
		$scope.listingImageHeight = "150";
		$scope.enableSection = "Home";
		advertisementHome();
	}
	
	/**
	 * getNxDirCategories is provide the categories on the top of the page
	 */
	$scope.getNxDirCategories = function() { 
		$http({
			method : "GET",
			url:"/getNxDirCategories",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxDirCategories = response;
		});
	} 
	
	/**
	 * getNxDirThumnailCategories is provide the popular categories on home page
	 */
	$scope.getNxDirThumnailCategories = function() { 
		$http({
			method : "GET",
			url:"/getNxCategoriesThumbnails",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxCategoriesThumbnails = response;
		});
	}
	
	/**
	 * getNxRestaurantList is provide the restaurant listing categories on home page
	 */
	$scope.getNxRestaurantList = function() { 
		$http({
			method : "GET",
			url:"/getNxRestaurentList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxRestList = response;
		});
	}
	
	
	/**
	 * getNxHospitalList is provide the hospitals listing categories on home page
	 */
	$scope.getNxHospitalList = function() { 
		$http({
			method : "GET",
			url:"/getNxHospitalList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxHospitalsList = response;
		});
	}
	
	/**
	 * getNxSchoolList is provide the schools listing categories on home page
	 */
	$scope.getNxSchoolList = function() { 
		$http({
			method : "GET",
			url:"/getNxSchoolList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxSchoolsList = response;
		});
	}
	
	/**
	 * getNxDoctorList is provide the doctors listing categories on home page
	 */
	$scope.getNxDoctorList = function() { 
		$http({
			method : "GET",
			url:"/getNxDoctorList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxDoctorsList = response;
		});
	}
	
	/**
	 * getNxPlaySchoolList is provide the play schools listing categories on home page
	 */
	$scope.getNxPlaySchoolList = function() { 
		$http({
			method : "GET",
			url:"/getNxPlaySchoolList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxPlaySchoolsList = response;
		});
	}
	
	
	$scope.getMyAction= function(url) { 
		$scope.enableSection = url;
		$scope.enableListing = true;
	}
	
	$scope.setListingFalse= function() { 
		$scope.enableListing = false;
	}

} ]);

function popup(mylink, windowname) {
	var mapUrl = String(mylink);
	if (mapUrl.charAt(mapUrl.length - 1) != '#') {
		if (!window.focus) return true;
		var href;
		if (typeof (mylink) == 'string')
			href = mylink;
		else
			href = mylink.href;
		window.open(href, windowname, 'width=1000,height=600,scrollbars=yes');
	}
	else
		{
			alert("map link not available");
		}
	return false;
}

function advertisementHome()
{
	
	window.open("http://localhost:8080/img/doctor/doctor_DrKamanaPurohit.jpeg", "DoctorKamana", 
			'width=200,height=200,scrollbars=yes,screenX=850,screenY=850,top=50');
	window.open("http://localhost:8080/img/restaurant/restaurant_MirchMasalaChineseFastFood.jpeg", "RestaurantMirchMasala", 
			'width=200,height=200,scrollbars=yes,screenX=50,screenY=50,top=50');
}