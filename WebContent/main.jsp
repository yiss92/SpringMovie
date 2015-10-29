<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>About</title>
<meta charset="utf-8">
<link rel="icon" href="img/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
<meta name="description" content="Your description">
<meta name="keywords" content="Your keywords">
<meta name="author" content="Your name">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/responsive.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/touchTouch.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/kwicks-slider.css" type="text/css"
	media="screen">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="js/jquery.kwicks-1.5.1.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script type="text/javascript" src="js/touchTouch.jquery.js"></script>
<script type="text/javascript">
	if ($(window).width() > 1024) {
		document.write("<"+"script src='js/jquery.preloader.js'></"+"script>");
	}
</script>
<style type="text/css">
.LogInForm {
	position: relative;
	right: -860px;
	/*  		top: -800px; */
	//
}
</style>

<script>
	$(function() {
		$x = $(window).width();
		if ($x > 1024) {
			jQuery("#content .row").preloader();
		}

		jQuery('.magnifier').touchTouch();
		jQuery('.spinner').animate({
			'opacity' : 0
		}, 1000, 'easeOutCubic', function() {
			jQuery(this).css('display', 'none')
		});

		$('#joinBtn').click(function() {
			document.location.href = "movie?type=joinForm";
			return false;
		})
	});
</script>

<style>
input.tooltip {
	position: absolute;
	visibility: hidden;
	z-index: 1000;
	filter: alpha(opacity = 100);
}
</style>
</head>

<body>
	<div class="spinner"></div>
	
	<div class="bg-content">
		<div class="container">
			<div class="row">
				<div class="span12" align="center">

					<!--============================== slider =================================-->
					<div class="flexslider" style="z-index: 1;">
						<ul class="slides" style="z-index: 1;">
							<c:forEach var="main" items="${movieImage}">
								<li>
									<form action="nowMovieRead.do" method="post">
										<input type="hidden" name="movie_title" value="${main.movie_title}">
										<input type="image" src="${main.movie_image}" style="width: 450px; Z-index: 1;" >
									</form>
								</li>

							</c:forEach>
						</ul>
					</div>
					<span id="responsiveFlag"></span>
					<div class="block-slogan">
						<h2>Welcome!</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>