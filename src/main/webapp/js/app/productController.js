'use strict';

var module = angular.module('shopModule', ['ngRoute' , 'ui.bootstrap' , 'ngTouch' , 'ngAnimate']);
angular.module('shopModule').controller('shopController', [ '$scope', '$http', '$window', '$uibModal', function($scope, $http, $uibModal) {
	
		$scope.initialize = function(){
			
		$scope.listingImageWidth = "300";
		$scope.listingImageHeight = "150";
		
		$scope.advertiseImageWidth = "100%";
		$scope.advertiseImageHeight = "15%";
		
		$scope.advertiseImageWidth1 = "90%";
		$scope.advertiseImageHeight1 = "15%";
		
		$scope.enableSection = "Home";
		$scope.searchString = "";
		
		$scope.prodUrlPrifix = "/nxdial-1";  // for production value should be "/nxdial-1" & for local it should be ""
		//$scope.prodUrlPrifix = ""; 
		
		$scope.openCloseTime =["","12:00 AM","12:30 AM","01:00 AM","01:30 AM","02:00 AM","02:30 AM","03:00 AM","03:30 AM","04:00 AM","04:30 AM","05:00 AM","05:30 AM",
								"06:00 AM","06:30 AM","07:00 AM","07:30 AM","08:00 AM","08:30 AM","09:00 AM","09:30 AM","10:00 AM","10:30 AM","11:00 AM","11:30 AM",
								"12:00 PM","12:30 PM","01:00 PM","01:30 PM","02:00 PM","02:30 PM","03:00 PM","03:30 PM","04:00 PM","04:30 PM","05:00 PM","05:30 PM",
								"06:00 PM","06:30 PM","07:00 PM","07:30 PM","08:00 PM","08:30 PM","09:00 PM","09:30 PM","10:00 PM","10:30 PM","11:00 PM","11:30 PM"];
		//advertisementHome();
		$scope.whichPlatform = whichPlatform();
	}
		
		  
		  /* $scope.openModal = function(){
			 $scope.modalInstance = $uibModal.open({
			  ariaLabelledBy: 'modal-title',
			  ariaDescribedBy: 'modal-body',
			  templateUrl: 'modalWindow.html',
			  controller :'ModelHandlerController',
			  controllerAs: '$ctrl',
			  size: 'lg',
			  resolve: {
			  
			  }
			  });  */
		
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
	 * getNxCategoryList is provide the selected Category list, after search
	 */
	$scope.getNxSelectedCategoryList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxCategoryList",
			params :  {selectedCategory :  $scope.selectedCategory}, 
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxCategoryList = response;
		});
	}
	
	/**
	 * getNxDoctorsSpecializationKeyList is provide the doctor's specialization key in Doctors listing
	 */
	$scope.getNxDoctorsSpecializationKeyList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxDoctorsSpecializationKeyList",	
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxDirDoctorsSpecializationKeyList = response;
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
	 * getNxRentSaleFlatList is provide the Rent Flats on home page
	 */
	$scope.getNxRentSaleFlatList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxRentSaleFlatList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxRentSaleFlatList = response;
		});
	}
	
	/**
	 * getNxNewsList is provide the list of all news
	 */
	$scope.getNxNewsList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxNewsList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxNewsList = response;
		});
	}
	
	
	/**
	 * getNxBusRouteNmrcList is provide the Metro Bus Routes
	 */
	$scope.getNxBusRouteNmrcList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxBusRouteNmrcList",
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxBusRouteNmrcList = response;
		});
	}
	
	/**
	 * getNxSearchSiteList is provide the Search Result
	 */
	$scope.getNxSearchSiteList = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getNxSearchSiteList",
			params :  {searchSiteString :  $scope.searchString}, 
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxSearchSiteList = response;
		});
	}
	
	
	/**
	 * getUniqueLocations is provide the selected Category list
	 */
	$scope.getUniqueLocations = function() { 
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getUniqueLocationsList",
			params :  {selectedCategory :  $scope.selectedCategory}, 
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxUniqueLocationsList = response;
			  
		});
	}
	
	
	/**
	 * getUniqueLocationsOfSearch is provide the selected Category list
	 */
	$scope.getUniqueLocationsOfSearch = function() { 
		$scope.nxUniqueLocationsOfSearchList = "";
		$http({
			method : "GET",
			url:$scope.prodUrlPrifix + "/getUniqueLocationsOfSearchList",
			params :  {selectedCategory :  $scope.searchString}, 
			//url:"order/summary/"+'2017-11-01'+"/"+'2017-11-07',
			//data : angular.toJson(),
			headers :{
				'Content-Type' : 'application/json'}
		}).success(function(response) {
			  console.log('response: ' + response);
			  $scope.nxUniqueLocationsOfSearchList = response;
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
	
	$scope.filterSearch= function(data) {
		$scope.searchFilter1 = data;
	}
	
	$scope.clearSearchFilter= function(url) { 
		$scope.searchFilter1 = '';
	}
	
	$scope.getMyAction= function(url) { 
		$scope.enableSection = url;
	}
	
	$scope.advertiseSection = 'Home';
	$scope.getMyAction1= function(category) { 
		if(category == 'Home')
		{
			$scope.enableSection = 'Home';
		} 
		else if(category == 'Rent & Sale'){
			$scope.enableSection = 'Rent & Sale';
		} 
		else if(category == 'Metro Bus'){
			$scope.enableSection = 'Metro Bus';
		} 
		else {
			$scope.enableSection = 'SelectedCategory';
		}
		$scope.advertiseSection = category;
		$scope.selectedCategory = category;
	}
	
	$scope.getMyAction= function(url, searchString) { 
		$scope.enableSection = url;
		$scope.searchString = searchString;
		$scope.advertiseSection = url;
	}
	
	$scope.getMyActionOtherCategory= function(url) { 
		$scope.otherSelectedCategory = url;
		$scope.enableSection = 'OtherCategory';
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
	
	$scope.privacyPolicy = function() { 
		$scope.enableSection = "privacyPolicy";
	}
	
	$scope.newsListing = function() { 
		$scope.enableSection = "newsListing";
	}
	
	$scope.isNewsSelected = false;
	$scope.selectedNews = function(newsHeadline, newsHeadlineDetails, newsSource, newsSourceLink,  newsDate, imageUrl ) { 
		$scope.isNewsSelected = true;
		$scope.selectedNewsHeadline = newsHeadline;
		$scope.selectedNewsHeadlineDetails = newsHeadlineDetails;
		$scope.selectedNewsSource = newsSource;
		$scope.selectedNewsSourceLink = newsSourceLink;
		$scope.selectedNewsDate = newsDate;
		$scope.selectedNewsImageUrl = imageUrl;
	}	
	
	$scope.goToTop = function() {
		  document.body.scrollTop = 0; // For Safari
		  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
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


/*app.controller("ModelHandlerController",function($scope,$uibModalInstance){
	 
	 $scope.cancelModal = function(){
	 console.log("cancelmodal");
	 $uibModalInstance.dismiss('close');
	 }
	 $scope.ok = function(){
	 $uibModalInstance.close('save');
	 
	 }
	 
	});*/


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
	var isMobile = {
		    Android: function() {
		        return navigator.userAgent.match(/Android/i);
		    },
		    BlackBerry: function() {
		        return navigator.userAgent.match(/BlackBerry/i);
		    },
		    iOS: function() {
		        return navigator.userAgent.match(/iPhone|iPad|iPod/i);
		    },
		    Opera: function() {
		        return navigator.userAgent.match(/Opera Mini/i);
		    },
		    Windows: function() {
		        return navigator.userAgent.match(/IEMobile/i) || navigator.userAgent.match(/WPDesktop/i);
		    },
		    any: function() {
		        return (isMobile.Android() || isMobile.BlackBerry() || isMobile.iOS() || isMobile.Opera() || isMobile.Windows());
		    }
		};
	
	
	if(isMobile.any() == null)
	{
		window.parent("/nxdial-1/img/nxdialAlert.jpg", "https://wa.me/918800587117", 'width=300,height=300,scrollbars=yes,screenX=500,screenY=800,top=200');
		//window.open("/nxdial-1/img/restaurant/restaurant_MirchMasalaChineseFastFood.jpeg", "RestaurantMirchMasala", 'width=200,height=200,scrollbars=yes,screenX=400,screenY=400,top=400');

		//window.open("/img/doctor/doctor_DrKamanaPurohit.jpeg", "DoctorKamana", 'width=200,height=200,scrollbars=yes,screenX=605,screenY=605,top=400');
		//window.open("/img/restaurant/restaurant_MirchMasalaChineseFastFood.jpeg", "RestaurantMirchMasala", 'width=200,height=200,scrollbars=yes,screenX=400,screenY=400,top=400');
	}
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


// To set facebook link
function whichPlatform()
{
	var isMobile = {
		    Android: function() {
		        return navigator.userAgent.match(/Android/i);
		    },
		    BlackBerry: function() {
		        return navigator.userAgent.match(/BlackBerry/i);
		    },
		    iOS: function() {
		        return navigator.userAgent.match(/iPhone|iPad|iPod/i);
		    },
		    Opera: function() {
		        return navigator.userAgent.match(/Opera Mini/i);
		    },
		    Windows: function() {
		        return navigator.userAgent.match(/IEMobile/i) || navigator.userAgent.match(/WPDesktop/i);
		    },
		    any: function() {
		        return (isMobile.Android() || isMobile.BlackBerry() || isMobile.iOS() || isMobile.Opera() || isMobile.Windows());
		    }
		};
	return isMobile.any();
	/*if('Android' == isMobile.any())
		{
			return 'fb://page/430200921108236';
		}
	else{
		return 'https://www.facebook.com/nxdial/';
	}*/
	//alert(isMobile.any());
//	if( isMobile.Windows() ) 
//		alert('Android');
//	
//	alert(Object.values(isMobile.any()));
	
}
