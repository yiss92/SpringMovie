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
<link href="./bootstrap/css/bootstrap1.css" rel="stylesheet" type="text/css"/>
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
 <script type="text/javascript" src="js/bootstrap.min.js"></script>
 <script type="text/javascript" src="js/bootstrap1.js"></script>
 <script type="text/javascript" src="js/jquery.twbsPagination.js"></script>
 <script type="text/javascript" src="js/respond.js"></script>
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

<body  class="bg-content">
	<div class="row">
		<!--============================== content =================================-->
		<div class="container">
			<div class="col-md-10">
			
					<article class="span8">
						<br>
						<table class="table table-condensed">
							<thead>
							<tr  align="center">
								<th width="10%">제목</th>
								<th width="60%">${review.review_title}</th>
							</tr>
							<tr  align="center">
								<th width="10%">영화 제목</th>
								<th width="60%">${review.movie_title}</th>
							</tr>
							</thead>
							<tbody>
							<tr>
								<td>작성일</td>
								<td>
								<fmt:formatDate value="${review.date}" pattern="yy/MM/dd" />
								<span style='float:right'>조회 :${review.read_count}</span>
								</td>
							</tr>
							<tr>
								<td>글쓴이</td>
								<td>${review.id}
								<span style='float:right'>평점 : ${review.score}</span>
								</td>
							</tr>
							<tr>
								<td colspan="2" >
								<p>${review.content}</p>
								</td>
							</tr>
							</tbody>
						</table>

						<c:if test="${sessionScope.id==review.id}">
						<span style='float:right'>
						<a href="modifyReviewForm.do?review_num=${review.review_num}">[수정]</a>
						<a href="deleteReview.do?review_num=${review.review_num}">[삭제]</a>
						<input type="hidden" name="review_num" value="${review.review_num}">
						</span>
						</c:if> 
						<br><br>
						
						<table border="1">
							<c:if test="${!empty reply}">
								<tr>
									<th>댓글</th>
									<th>아이디</th>
								</tr>
								<c:forEach var="re" items="${reply}">
									<tr align="center">
										<td width="300">${re.reply}</td>
										<td width="100">${re.id}</td>
									</tr>
								</c:forEach>
							</c:if>
						</table>
						<br>
						<form action="readReview.do" method="post">
							<input type="text" name="reply">
							<input type="hidden" name="review_num" value="${review.review_num}">
							<input type="submit" value="댓글작성">
						</form>
					</article>
				
			</div>
		</div>
	</div>



</body>
</html>