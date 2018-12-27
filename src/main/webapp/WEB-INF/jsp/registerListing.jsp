<div  ng-init="getNxDirCategories()" align="center" style="color: blue;">
	<h4></br>&nbsp;&nbsp;***Fill Below Form To List Your Business***</br></br></h4>
	<table border = "1" style="color: blue;">
		<tr>
			<td></br>&nbsp;&nbsp;
				Business Name: *
			</td>
			<td  align="center">
				<input type="text" ng-model="businessName" size="90" width="85%">
			</td>
		</tr>
		<tr style=" background-color: lightblue;">
			<td style="text-align: left;"></br>&nbsp;&nbsp;
				Select Category: *
			</td>
			<td>
				 <select ng-model="businessCatagory" ng-init="businessCatagory=category.caption" ng-options="category.caption for category  in nxDirCategories"></select>
			</td>
		</tr>
		<tr>
			<td></br>&nbsp;&nbsp;
				Address: *
			</td>
			<td align="center">
				  <input type="text" ng-model="businessAdd" placeholder="Only Noida Extension and Crossing Republic Address Allowed" size="90" width="85%">
			</td>
		</tr>
		<tr style=" background-color: lightblue;">
			<td></br>&nbsp;&nbsp;
				Contact Number: *
			</td>
			<td align="center">
				 <input type="text" ng-model="businessContactNo" placeholder="9818880638, 8800587117,...." size="90" width="85%">
			</td>
		</tr>
		<tr>
			<td></br>&nbsp;&nbsp;
				Open Hours:
			</td>
			<td>
				  <select ng-model="openHours" ng-init="opemHours=time" ng-options="time for time  in openCloseTime"></select>
			</td>
		</tr>
		<tr style=" background-color: lightblue;">
			<td></br>&nbsp;&nbsp;
				Close Hours:
			</td>
			<td>
				  <select ng-model="closeHours" ng-init="closeHours=time" ng-options="time for time  in openCloseTime"></select>
			</td>
		</tr>
		<tr>
			<td></br>&nbsp;&nbsp;
				Enter Your Own Open And Close Hours: 
			</td>
			<td align="center">
				   <input type="text" ng-model="ownOpenCloseHours" placeholder="10:00 AM to 12:00 PM & 05:00 PM to 09:00 PM" size="90" width="85%">
			</td>
		</tr>
		<tr style=" background-color: lightblue;">
			<td></br>&nbsp;&nbsp;
				Upload Image: </br><h5>&nbsp;&nbsp; (Image Will Upload After Approval)</h5>
			</td>
			<td>
				 <input type="file" ng-file-select="onFileSelect($files)" ng-model="imageSrc" disabled="disabled"> <img ng-src="{{imageSrc}}" />
			</td>
		</tr>
		
	</table>
	<table style="color: black;">
		<tr>
			<td align="center"></br>&nbsp;&nbsp;
				<button ng-click = "submitListing(businessName, category, businessAdd, businessContactNo, openHours, closeHours, ownOpenCloseHours, imageSrc)">Submit</button>
			</td>
		</tr>
		<tr>
			<td align="left"></br>&nbsp;&nbsp;
				<h5>Note: Any other details like Doctor specialization etc. will be updated once listing will approve.</h5>
			</td>
		</tr>
	</table>
</div>
