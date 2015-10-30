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
<link href="./bootstrap/css/bootstrap1.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script src="js/forms.js"></script>
 <script type="text/javascript" src="js/bootstrap.min.js"></script>
 <script type="text/javascript" src="js/bootstrap1.js"></script>
 <script type="text/javascript" src="js/jquery.twbsPagination.js"></script>
 <script type="text/javascript" src="js/respond.js"></script>
<script>
	jQuery(window).load(function() {
		jQuery('.spinner').animate({
			'opacity' : 0
		}, 1000, 'easeOutCubic', function() {
			jQuery(this).css('display', 'none')
		});
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

	<div>
		<!--============================== content =================================-->
		<div class="container">
			<div class="col-md-10">
				<div class="row">
					<article class="span8">
						<br>
						<form action="writeComment.do" method="post">
							 <input type="text" name="movie_title" size="10" value='영화제목' onfocus="this.value=''" ><br>
							 <input type="text" name="comment"  size="100" value='한줄평' onfocus="this.value=''" ><br>
							 <input type="text" name="score" value='평점' onfocus="this.value=''"  ><br>
							<input type="submit" value="작성">
						
						</form>



<!-- 						<hr> -->
<br><br><br><br>
						<table class="table table-condensed">
							<c:choose>
								
								<c:when test="${empty commentPage.commentList}">
									<tr>
										<td>아직 평점이 없습니다.좀 적고 가주세요</td>
									</tr>
								</c:when>
								<c:otherwise>
									<tr>
											<th width="70">글 번호</th>
											<th width="100">영화제목</th>
											<th width="50">아이디</th>
											<th width="400">한줄 평</th>
											<th width="50">평점</th>
									</tr>
									
									<c:forEach var="c" items="${commentPage.commentList}">
										
										<tr>
											<td align="center">${c.getComment_num()}</td> 
											<td>${c.movie_title} </td> 
											<td>${c.id} </td> 
											<td width="400">${c.comment}</td>
											<td>${c.score}</td> 
										</tr>
										<c:if test="${sessionScope.id==c.id}">
										<tr>
											<td colspan="4"></td>
											<td>
											<a href="modifyCommentForm.do?comment_num=${c.comment_num}">[수정]</a>
											<a href="deleteComment.do?comment_num=${c.comment_num}">[삭제]</a>
											<input type="hidden" name="comment_num" value="${c.comment_num}" >
											</td>
										</tr>
										</c:if>
									</c:forEach>

									<tr>
										<td colspan="3"></td>
										<td colspan="2"><c:forEach begin="${commentPage.startPage}"
 												end="${commentPage.endPage}" var="p">  
  												<a href="comment.do?page=${p}"> [${p}]</a> 
  											</c:forEach></td>  
									</tr>
								</c:otherwise>
								<%-- 							</c:if> --%>
							</c:choose>
						</table>


					</article>
				</div>
			</div>
		</div>
	</div>



</body>
</html>