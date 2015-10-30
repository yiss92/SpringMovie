<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<title>회원가입</title>

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
<link href="./bootstrap/css/bootstrap1.css" rel="stylesheet"
	type="text/css" />
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

</head>
<body class="bg-content">
<!-- 	<h2>회원가입</h2> -->
<br><br><br><br>
	<div class="container">
		<div class="col-md-10">
			<div class="row">
				<article class="span8">
					<form action="registerForm.do" method="post">
						<table border="1">
							<tr>
								<td>ID</td>
								<td><input type="text" name="id"></td>
							</tr>
							<tr>
								<td>PW</td>
								<td><input type="password" name="password"></td>
							</tr>
							<tr>
								<td>NAME</td>
								<td><input type="text" name="name"></td>
							</tr>
							<tr>
								<td>NICKNAME</td>
								<td><input type="text" name="nickname"></td>
							</tr>
							<tr>
								<td>EMAIL</td>
								<td><input type="text" name="email"></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="회원가입">
								</td>
							</tr>
						</table>
					</form>
				</article>
			</div>
		</div>
	</div>

</body>
</html>