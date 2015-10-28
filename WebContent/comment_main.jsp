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
						<form action="writeComment.do" method="post">
							영화제목 <input type="text" name="movie_title" size="10"><br>
							한줄평 <input type="text" name="comment"  size="100"><br>
							평점 <input type="text" name="score" ><br>
							<br>
							<input type="submit" value="작성">
						
						</form>



						<hr>

						<table border="1">
							<c:choose>
								
								<c:when test="${empty commentPage.commentList}">
									<tr>
										<td>아직 평점이 없습니다.좀 적고 가주세요</td>
									</tr>
								</c:when>
								<c:otherwise>
									<tr>
											<th>글 번호</th>
											<th>영화제목</th>
											<th>아이디</th>
											<th>한줄 평</th>
											<th>평점</th>
									</tr>
									
									<c:forEach var="c" items="${commentPage.commentList}">
										
										<tr>
											<td>${c.getComment_num()}</td> 
											<td>${c.movie_title} </td> 
											<td>${c.id} </td> 
											<td width="400">${c.comment}</td>
											<td>${c.score}</td> 
										</tr>
										<c:if test="${sessionScope.id==c.id}">
										<tr>
											<td colspan="5" align="right">
											<a href="modifyCommentForm.do?comment_num=${c.comment_num}">[수정]</a>
											<a href="deleteComment.do?comment_num=${c.comment_num}">[삭제]</a>
											<input type="hidden" name="comment_num" value="${c.comment_num}" >
											</td>
										</tr>
										</c:if>
									</c:forEach>

									<tr>
										<td colspan="5"><c:forEach begin="${commentPage.startPage}"
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