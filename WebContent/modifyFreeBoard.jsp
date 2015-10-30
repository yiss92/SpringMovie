<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html>
<head>
<title>Insert title here</title>
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
</head>
<body class="bg-content">
	<div class="container">
				<div class="row">
					<article class="span8">
					<br><br><br>
      <form action="modify.do" method="post">
          글번호:${original.boardNo} <br><br>
          내용:<textarea rows="3" cols="20" name="comment">${original.comment}</textarea><br>
       <input type="hidden" name="boardNo" value="${original.boardNo}"> <br> 
       <input type="submit" value="수정하기">   
      </form>
	</article>
	</div>
	</div>
</body>
</html>