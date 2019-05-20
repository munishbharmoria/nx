'use strict';

var module = angular.module('shopModule', ['ngRoute']);
angular.module('shopModule').controller('shopController', [ '$scope', '$http', '$window', function($scope, $http, $interval) {
	
		$scope.initialize = function(){
		$scope.listingImageWidth = "300";
		$scope.listingImageHeight = "150";
		$scope.enableSection = "Home";
		//$scope.prodUrlPrifix = "/nxdial-1";  // for production value should be "/nxdial-1" & for local it should be ""
		$scope.prodUrlPrifix = ""; 
		$scope.openCloseTime =["","12:00 AM","12:30 AM","01:00 AM","01:30 AM","02:00 AM","02:30 AM","03:00 AM","03:30 AM","04:00 AM","04:30 AM","05:00 AM","05:30 AM",
								"06:00 AM","06:30 AM","07:00 AM","07:30 AM","08:00 AM","08:30 AM","09:00 AM","09:30 AM","10:00 AM","10:30 AM","11:00 AM","11:30 AM",
								"12:00 PM","12:30 PM","01:00 PM","01:30 PM","02:00 PM","02:30 PM","03:00 PM","03:30 PM","04:00 PM","04:30 PM","05:00 PM","05:30 PM",
								"06:00 PM","06:30 PM","07:00 PM","07:30 PM","08:00 PM","08:30 PM","09:00 PM","09:30 PM","10:00 PM","10:30 PM","11:00 PM","11:30 PM"];
		advertisementHome();
	}
	
	/**
	 * getNxDirCategories is provide the categories on the top of the page
	 */
	$scope.getNxDirCategories = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxDirCategories",	
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
			url:$scope.prodUrlPrifix + "/getNxCategoriesThumbnails",
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
			url:$scope.prodUrlPrifix + "/getNxRestaurentList",
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
	 * getNxAutomobileList is provide the automobiles listing on home page
	 */
	$scope.getNxAutomobileList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxAutomobileList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxAutoMList = response;
		});
	}
	
	
	/**
	 * getNxShoppingList is provide the shopping listing on home page
	 */
	$scope.getNxShoppingList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxShoppingList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxShopList = response;
		});
	}
	
	
	/**
	 * getNxHospitalList is provide the hospitals listing categories on home page
	 */
	$scope.getNxHospitalList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxHospitalList",
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
			url:$scope.prodUrlPrifix + "/getNxSchoolList",
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
			url:$scope.prodUrlPrifix + "/getNxDoctorList",
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
	 * getNxPlaySchoolList is provide the play schools listing on home page
	 */
	$scope.getNxPlaySchoolList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxPlaySchoolList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxPlaySchoolsList = response;
		});
	}
	
	/**
	 * getNxPharmacyList is provide the pharmacy shops on home page
	 */
	$scope.getNxPharmacyList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxPharmacyList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxPharmacyList = response;
		});
	}
	
	/**
	 * getNxDailyNeedsList is provide the pharmacy shops on home page
	 */
	$scope.getNxDailyNeedsList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxDailyNeedsList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxDailyNeedsList = response;
		});
	}
	
	/**
	 * getNxPathLabsList is provide the PathLabs on home page
	 */
	$scope.getNxPathLabsList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxPathLabsList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxPathLabsList = response;
		});
	}
	
	/**
	 * getNxDirNews is to get news on home page
	 */
	$scope.getNxDirNews = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxNews",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxNewsList = response;
		});
	}
	
	$scope.getMyAction= function(url) { 
		$scope.enableSection = url;
		//$scope.enableListing = true;
	}
	
	/* $scope.setListingFalse= function() { 
		$scope.enableListing = false;
	} */

	/*$scope.registerBusiness = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxPlaySchoolList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxPlaySchoolsList = response;
		});
	}*/

	$scope.registerBusiness = function() { 
		$scope.enableSection = "register";
	}

	$scope.aboutUs = function() { 
		$scope.enableSection = "aboutUs";
	}

	$scope.contactUs = function() { 
		$scope.enableSection = "contactUs";
	}
	
	$scope.freeListing = function() { 
		$scope.enableSection = "freeListing";
	}
	
	$scope.advertise = function() { 
		$scope.enableSection = "advertise";
	}
	
	$scope.customerCare = function() { 
		$scope.enableSection = "customerCare";
	}
	
	$scope.submitListing = function (businessName, category, businessAdd, businessContactNo, openHours, closeHours, ownOpenCloseHours, imageSrc) {
		if(businessName == undefined || category == undefined || businessAdd == undefined || businessContactNo == undefined ||
			businessName.trim().length == 0 || category.trim().length == 0 || businessAdd.trim().length == 0 || businessContactNo.trim().length == 0)
		{
			alert("Enter Manadatory Fields");
			alert('[{businessName : "' + businessName + '"},{businessCatagory : "' + businessCatagory + '"},{businessAdd :"' + businessAdd + '"},{businessContactNo :"' + businessContactNo +
			'"},{ openHours :"' + openHours + '"},{closeHours :"' + closeHours + '"},{ownOpenCloseHours :"' + ownOpenCloseHours + '"},{ imageSrc :"' + imageSrc + '"}]');
			return;
		}
		$scope.listingValues = '[{businessName : "' + businessName + '"},{businessCatagory : "' + category + '"},{businessAdd :"' + businessAdd + '"},{businessContactNo :"' + businessContactNo +
			'"},{ openHours :"' + openHours + '"},{closeHours :"' + closeHours + '"},{ownOpenCloseHours :"' + ownOpenCloseHours + '"},{ imageSrc :"' + imageSrc + '"}]';
		$http({
			method: "POST",
			url: $scope.prodUrlPrifix + "/submitListing" + "/" + $scope.listingValues,
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers: {
				'Content-Type': 'application/json'
			}
		}).success(function (response) {
			console.log('response: ' + response);
			$scope.submitStatus = response;
		});
		$scope.businessName = null;
		$scope.businessAdd = "";
		$scope.businessContactNo = "";
		alert("You Request Submitted For Approval.");
	}

} ]);

function popup(mylink, windowname, website) {
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
	
	//window.open("/nxdial-1/img/doctor/doctor_DrKamanaPurohit.jpeg", "DoctorKamana", 'width=200,height=200,scrollbars=yes,screenX=605,screenY=605,top=400');
	//window.open("/nxdial-1/img/restaurant/restaurant_MirchMasalaChineseFastFood.jpeg", "RestaurantMirchMasala", 'width=200,height=200,scrollbars=yes,screenX=400,screenY=400,top=400');

	//window.open("/img/doctor/doctor_DrKamanaPurohit.jpeg", "DoctorKamana", 'width=200,height=200,scrollbars=yes,screenX=605,screenY=605,top=400');
	//window.open("/img/restaurant/restaurant_MirchMasalaChineseFastFood.jpeg", "RestaurantMirchMasala", 'width=200,height=200,scrollbars=yes,screenX=400,screenY=400,top=400');
}

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    document.getElementById("myBtn").style.display = "block";
  } else {
    document.getElementById("myBtn").style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0; // For Safari
  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
} 

