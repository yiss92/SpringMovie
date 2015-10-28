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
								<th width="200">영화</th>
								<th width="700">제목</th>
								<th width="100">아이디</th>
								<th width="100">날짜</th>
								<th width="100">별점</th>
								<th width="100">추천수</th>
								<th width="100">조회</th>
							</tr>
							<c:choose>
								<c:when test="${empty reviewPage.reviewList}">
								<tr>
									<td colspan="7" align="center">리뷰가 없습니다.</td>
								</tr>
								</c:when>
			
								<c:otherwise>
								<c:forEach var="r" items="${reviewPage.reviewList}">
										<tr align="center">
											<td>${r.movie_title}</td>
											<td><a href="readReview.do?review_num=${r.review_num}">${r.review_title}
											</a></td>
											<td>${r.id}</td>
											<td><fmt:formatDate value="${r.date}"
													pattern="yy/MM/dd" /></td>
											<td>${r.score}</td>
											<td>${r.recommend_count}</td>
											<td>${r.read_count}</td>
										</tr>
									</c:forEach>
								<tr>
										<td colspan="7" align="center"><c:forEach begin="${reviewPage.startPage}"
 												end="${reviewPage.endPage}" var="p">
 												<a href="review.do?page=${p}">[${p}]</a> 
 											</c:forEach></td> 
									</tr>
								</c:otherwise>

							</c:choose>
						</table>
						<br>
						<a href="writeReviewForm.do"><button>글쓰기</button></a> 
					</article>
				</div>
			</div>
		</div>
	</div>



</body>
</html>