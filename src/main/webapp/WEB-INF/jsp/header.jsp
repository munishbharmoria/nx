<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="background-color: F5DEB3; padding-bottom: 10px;padding-left: 10px;padding-right: 10px">
	<table width="100%">
		<tr>
			<td  style="text-align: left;width: 35%">
				<a class="button" style="text-decoration: none;" ng-click="getMyAction1('Home'); goToTop();clearSearchFilter()">
					<div>
							<span class="headerNx">Nx</span>
							<span class="headerDial">Dial.com</span>
					</div>	
					<div>
							<span class="headerNxDir">Noida Extension's Online Directory</span>
					</div>
				</a>
			</td>
			<td style="text-align: center;width: 25%">
				<a class="button" ng-href="https://wa.me/918800587117" target="_blank">
					<marquee  class="slide" scrollamount="2" behavior="alternate" direction="right" onMouseOver="this.stop()" onMouseOut="this.start()">
						<span class="colorRed">WhatsApp</span>
						<span class="colorBlue underline">8800587117</span>
						<!-- <span class="colorRed">for free listing</span> -->
					</marquee>  
				</a>
			</td>
			<td style="text-align: right;width: 10%">
				<a class="button" ng-href="https://wa.me/918800587117" target="_blank">
					<img src="<c:url value="/img/common/freeListing.png"/>" class="img-rounded"/>
				</a>
			</td>	
			<td style="text-align: right;width: 30%">	
				<a class="button underline" ng-href="tel:08800587117">
					<img src="<c:url value="/img/common/phone.png"/>" class="img-rounded" width="20" height="20"/> 
					<span class="colorBlue">8800587117</span>
					<span class="colorBlack">for Advertise</span>
				</a>
			</td>
		</tr>
	</table>
</div>
