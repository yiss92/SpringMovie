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
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script type="text/javascript">if($(window).width()>1024){document.write("<"+"script src='js/jquery.preloader.js'></"+"script>");}	</script>
<script>		
		 jQuery(window).load(function() {	
		 $x = $(window).width();		
	if($x > 1024)
	{			
	jQuery("#content .row").preloader();    }			 
		
		 jQuery('.spinner').animate({'opacity':0},1000,'easeOutCubic',function (){jQuery(this).css('display','none')});	
		 
  		  }); 
				
		 
		 
	</script>

</head>

<body>
	<div class="bg-content">

		<!--============================== content =================================-->

		<div id="content">
			<div class="ic"></div>
			<div class="container">
				<div class="row">
					<article class="span12">
						<h3>�󿵿�����</h3>
					</article>
					<div class="clear"></div>
					<ul class="thumbnails thumbnails-1 list-services">
						<c:forEach var="pre"
							items="${preMoviePage.movieList}">
							<li class="span4">
								<div class="thumbnail thumbnail-1">
									<section>
										<form action="PreMovieRead.do" method="post">
<!-- 											<input type="hidden" name="type" value="preMovieRead"> -->
											<input type="hidden" name="movieTitle" value="${pre.movieTitle}">
											<input type="image" src="${pre.movieImage}" style="width: 245px;">
										</form>
										<font color="orange"><b>${pre.movieTitle}</b></font> (${pre.ymd})<br>
										���� : ${pre.director}<br>
										��� : ${pre.stars}<br>
<%-- 										���� : ${pre.score} --%>

									</section>
								</div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</div>

</body>
</html>