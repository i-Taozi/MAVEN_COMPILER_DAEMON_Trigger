<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 3.0 License

Name       : Unofficial Channels
Description: A two-column, fixed-width design with a bright color scheme.
Version    : 1.0
Released   : 20120723
-->
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title>
			VAPORware Marketplace
		</title>

		<link type="text/css" href="css/custom-theme/jquery-ui-1.8.24.custom.css" rel="stylesheet" />
		<link href="http://fonts.googleapis.com/css?family=Arvo" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="style.css" />

		<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
		<script type="text/javascript" src="js/jquery-ui-1.8.24.custom.min.js"></script>
		<script language="JavaScript">

			// Put the active cursor on the search box when the page first loads
			$(function() {
				$("#searchString").focus();
			});		
			
			// When the search button is clicked, ensure that the search box is not empty and then submit the search form
			function submitSearchForm() {
				var searchString = $("#searchString").val();
				if(searchString == null || searchString.replace(/^\s+|\s+$/g, '') == "") {
					alert("You must enter some search words");
				} else {
					$("#searchForm").submit();
				}
			}
			
			// When the user selects a new sort order, re-do the search with the selected sorting
			function submitSortedSearch() {
				$("#sortedSearchForm").submit();
			}

			// When the "Install" button is clicked for an app, display an alert indicating the the app was purchased			
			function installApp(price) {
				alert("Thank you for pretending to install this pretend app!\nA pretend $" + price + " has been charged to your pretend account.");
			}
		</script>
	</head>
	<body>
		<div id="bg1"></div>
		<div id="bg2"></div>
		<div id="outer">
			<div id="header">
				<div id="logo">
					<h1><a href="index.html"><i>VAPORware</i> Marketplace</a></h1>
				</div>
				<form id="searchForm" action="search" method="post">
					<div id="search">
						<div>
							<input class="text" id="searchString" name="searchString" size="32" maxlength="64" value='${fn:replace(searchString, "\"", "&quot;")}' />
							<img src="images/search.png" style="margin: -13px;" onclick="submitSearchForm()"/>
						</div>
					</div>
				</form>
			</div>
			<div id="banner">
				<div class="captions">
					<h2><i>The</i>&nbsp;&nbsp;source for apps that may or may not ever be developed</h2>
				</div>
				<img src="images/banner.jpg" alt="" height="150" width="1180"/>
			</div>
			<div id="main">
				<div id="sidebar">
					<div class="box">
						<h3>Upcoming Releases</h3>
						<div class="dateList">
							<ul class="linkedList dateList">
								<li class="first">
									<span class="date">Jul 23</span> Frustrated Flamingos
								</li>
								<li>
									<span class="date">Jul 28</span> Athena Internet Radio
								</li>
								<li>
									<span class="date">Aug 7</span> Dome Web Browser
								</li>
								<li>
									<span class="date">Aug 9</span> Gripe Video Conferencing
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div id="content">
					<div class="box">
						<table>
							<tr>
								<td valign="top"><h2>Search Results</h2></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td valign="top">
								
									<!-- 
										A <select> pulldown showing all of the available sort order options, with the current option pre-selected.
										When the selection changes, a new search will be peformed with the selected sort order.
									-->
									
									<form id="sortedSearchForm" action="search" method="post">
										<label for="sortField">Sort by:</label>
										<select id="sortField" name="sortField" onchange="submitSortedSearch()">
											<option value="relevance" ${sortField == 'relevance' ? 'selected="selected"' : ''}>Relevance</option>
											<option value="name" ${sortField == 'name' ? 'selected="selected"' : ''}>Name (A-Z)</option>
											<option value="name-reverse" ${sortField == 'name-reverse' ? 'selected="selected"' : ''}>Name (Z-A)</option>
										</select>
										<input type="hidden" name="searchString" value='${fn:replace(searchString, "\"", "&quot;")}' />							
									</form>
								</td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td valign="top">
								
									<!-- 
										Pagination.  When a search query returns more than 5 results, the controller servlet forwards only a 
										batch of 5 to this JSP.  The code below displays the total number of results, and where the current batch 
										is among that number.  "Previous" and "Next" links send the user to the previous or next 5 result batch.
									-->
								
									${firstResult+1}-${firstResult+5 < resultSize ? firstResult+5 : resultSize} of ${resultSize} results
									&nbsp;&nbsp;&nbsp;
									<c:if test="${firstResult > 0}">
										(<a href='<c:url value="search">
										<c:param name="searchString" value="${searchString}"/>
										<c:param name="sortField" value="${sortField}"/>
										<c:param name="firstResult" value="${firstResult-5}"/>
										</c:url>'>prev</a>)
									</c:if>
									<c:if test="${firstResult+5 < resultSize}">
										(<a href='<c:url value="search">
										<c:param name="searchString" value="${searchString}"/>
										<c:param name="sortField" value="${sortField}"/>
										<c:param name="firstResult" value="${firstResult+5}"/>
										</c:url>'>next</a>)
									</c:if>
								</td>
							</tr>
						</table>
						
						<!-- Iterate through the search results inserted into this request by the controller servlet, displaying a row for each. -->
						
						<table style="width: 100%; margin-left: auto; margin-right: auto;">
						<c:forEach items="${apps}" var="app" varStatus="loop">
						<tr>
							<td style="width: 25%; text-align: center; vertical-align: middle;" rowspan="2"><img src="images/apps/${app.image}"/></td>
							<td style="height: 1em; width: 75%; text-align: left; vertical-align: bottom; border-bottom: thin dotted black;">
								<b>${app.name}</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
								<input type="button" id="appDetailButton_${loop.index}" value="Full Details" />
							</td>							
						</tr>
						<tr>
							<td style="text-align: left; vertical-align: top; padding-bottom: 30px;">${app.description}</td>
						</tr>
						
						<!-- 
							Pop-up modal, showing the full details for this app.  The <div> representing this modal is hidden by
							on page load, but is used to build a jQuery UI dialog when the "Full Details" button for an app is clicked.
						-->
						<div style="font-size:10px; display:none;">
							<div id="appDetail_${loop.index}" title="App Details">
								<img src="images/apps/${app.image}" style="float:left; margin:10px;" />
								<b>${app.name}</b>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="Install" onclick="installApp(${app.price});" /><hr/>
								<br/>${app.description}<br/><br/><hr/>
								Supported devices: 
								<c:forEach items="${app.supportedDevices}" var="device" varStatus="devicesLoop">
									${device.manufacturer} ${device.name}<c:if test="${not devicesLoop.last}">,</c:if>
								</c:forEach>
								<hr/><br/>
								Customer Reviews:<br/><br/>
								<c:forEach items="${app.customerReviews}" var="customerReview">
									<b>${customerReview.stars} out of 5 stars</b> (user: <i>${customerReview.username}</i>)<br/>
									${customerReview.comments}<br/><br/>
								</c:forEach>
							</div>
						</div>
						<script language="JavaScript">
							$(function() {
								$("#appDetailButton_${loop.index}").click(function() {
									$("#appDetail_${loop.index}").dialog({
										width: 650,
										modal: true
									});
								});
							});
						</script>
						
						</c:forEach>
						</table>
					</div><br class="clear" />
				</div><br class="clear" />
			</div>
		</div>
		<div id="copyright">
			This application uses HTML/CSS design from <a href="http://www.freecsstemplates.org/">freecsstemplates.org</a>, 
			and photos by <a href="http://fotogrph.com/">Fotogrph</a>, both made available under the 
			<a href="http://creativecommons.org/licenses/by/3.0/">Creative Commons Attribution license</a>.
		</div>
	</body>
</html>
