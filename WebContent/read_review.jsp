<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Contact</title>
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
<script src="js/forms.js"></script>
<script>		
   jQuery(window).load(function() {	
    jQuery('.spinner').animate({'opacity':0},1000,'easeOutCubic',function (){jQuery(this).css('display','none')});	
   });			
	</script>

<!--[if lt IE 8]> 
  		<div style='text-align:center'><a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/img/upgrade.jpg"border="0"alt=""/></a></div>  
 	<![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<!--<![endif]-->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <link rel="stylesheet" href="css/docs.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/ie.css" type="text/css" media="screen">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400' rel='stylesheet' type='text/css'>
  <![endif]-->
</head>

<body>
	<div class="spinner"></div>
	<div class="bg-content">
		<!--============================== content =================================-->
		<div id="content">
			<div class="ic"></div>
			<div class="container">
				<div class="row">
					<article class="span8">
						<br>
						<table border="1">
							<tr>
								<th width="300">제목</th>
								<th>아이디</th>
								<th>작성일</th>
								<th>추천수</th>
								<th>조회수</th>
							</tr>
							<tr align="center">
								<td>${review.review_title}</td>
								<td>${review.id}</td>
								<td><fmt:formatDate value="${review.date}"
										pattern="yy/MM/dd" /></td>
								<td>${review.recommend_count}</td>
								<td>${review.read_count}</td>
							</tr>
							<tr>
								<td colspan="5">영화 : ${review.movie_title}</td>
							</tr>
							
							<tr  height="100">
								<td colspan="5" >${review.content}</td>
							</tr>
							<tr>
								<td colspan="5" align="right">평점 : ${review.score}</td>
							</tr>
						</table>
						<br>
						<a href="recommendReview.do?review_num=${review.review_num}"><button>추천</button></a>
						<br>
						<a href="modifyReviewForm.do?review_num=${review.review_num}">[수정]</a>
						<a href="deleteReview.do?review_num=${review.review_num}">[삭제]</a>
						<input type="hidden" name="review_num" value="${review.review_num}"> 
					</article>
				</div>
			</div>
		</div>
	</div>



</body>
</html>