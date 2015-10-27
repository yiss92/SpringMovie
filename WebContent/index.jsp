<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>AboutMovie</title>
		<meta charset="utf-8">
		<link rel="icon" href="img/favicon.ico" type="image/x-icon">
		<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen">
		<link rel="stylesheet" href="css/responsive.css" type="text/css" media="screen">
		<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
		<link rel="stylesheet" href="css/touchTouch.css" type="text/css" media="screen">
		<link rel="stylesheet" href="css/kwicks-slider.css" type="text/css" media="screen">
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300' rel='stylesheet' type='text/css'>
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
		<style type="text/css">
			#loginForm{ width:100%; height:45px; overflow:hidden; }
			#main{ position:fixed; width:100%; height:calc(100% - 190px); }
		</style>
	</head>
	<body>
	<div>
		<header>
			<div class="container clearfix">
				<div class="row">
					<div class="span12">
						<div class="navbar navbar_">
							<div class="container">
								<h1 class="brand brand_">
									<a href="/SpringMovie/main.do"  target="main"><img src="img/MainTopic.JPG"> </a>
								</h1>
								<a class="btn btn-navbar btn-navbar_" data-toggle="collapse" data-target=".nav-collapse_">Menu <span class="icon-bar"></span></a>
								<div class="nav-collapse nav-collapse_  collapse">
									<ul class="nav sf-menu">
										<li><a href="Mmovie?type=nowMovie"  target="main"><b>상영작</b></a></li>
										<li class="sub-menu"><a href="Mmovie?type=soonMovie"  target="main"><b>개봉예정</b></a></li>
										<li><a href="index-2.html"  target="main"><b>평점</b></a></li>
										<li><a href="index-3.html"  target="main"><b>리뷰</b></a></li>
										<li><a href="board?type=list"  target="main"><b>게시판</b></a></li>
									</ul>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
		</header>
	</div>
	<div id='loginForm'>
		<iframe src="/SpringMovie/joinForm.jsp" width=100%; height=100%; frameborder="0"  name="login" ></iframe>
	</div>	
	<div id='main' align="right">
		<iframe src="/SpringMovie/main.do" width=100%; height=100%; frameborder="0"  name="main"></iframe>
	</div>

		
		
		
		

	</body>
</html>