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
	jQuery("#content .row").preloader();}	
	
	jQuery(".list-blog li:last-child").addClass("last"); 
	jQuery(".list li:last-child").addClass("last"); 

	
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
					<article class="span8">
						<div class="inner-1">
							<ul class="list-blog">
								<li>
									<h3>${preMovie.movieTitle}
										(${preMovie.ymd})</h3> <!--             <div class="name-author">by Admin</div> -->
									<div class="clear"></div> <img alt=""
									src="${preMovie.movieImage}" width="250px">
									<h5>감독 : ${preMovie.director}</h5>
									<h5>주연배우 : ${preMovie.stars}</h5>
									<h5>장르 : ${preMovie.genre_1} ${preMovie.genre_2}</h5>
									<h5>${preMovie.story}</h5> 
									
									<table border="1">
										<tr>
<!-- 											<th width="100" height="30">평점</th> -->
<!-- 											<th width="400" height="30">한줄 평</th> -->
<!-- 											<th width="100" height="30">ID</th> -->
										</tr>
<%-- 										<c:choose> --%>
<%-- 											<c:when test="${empty nowMovieComment}"> --%>
<!-- 												<tr> -->
<!-- 													<td colspan="3" align="center"><br>-<br></td> -->
<!-- 												</tr> -->
<%-- 											</c:when> --%>
<%-- 											<c:otherwise> --%>
<%-- 												<c:forEach var="n" items="${nowMovieComment}">   --%>
<!-- 													<tr> -->
<%-- 														<td align=center>${n.score}</td> --%>
<%-- 														<td align=center>${n.comment}</td> --%>
<%-- 														<td align=center>${n.id}</td> --%>
<!-- 													</tr> -->
<%--  												</c:forEach>  --%>
 												
<%-- 											</c:otherwise> --%>
<%-- 										</c:choose> --%>
									</table>             

								</li>



							</ul>
						</div>
					</article>

				</div>
			</div>
		</div>
	</div>


</body>
</html>