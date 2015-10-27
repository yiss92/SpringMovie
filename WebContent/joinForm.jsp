<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
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
	</head>
	<body style="width:100%;overflow-x:hidden;overflow-y:hidden; float:right; left: -25px; position: absolute; text-align: right; top: 0; width: 100%;">
		<table style="width:100%;overflow-x:hidden;overflow-y:hidden; text-align: right; top: 0; width: 100%;">
			<tr>
				<td width="99%">
					<form action="logginForm.do" class="LogInForm" method="post" target="main">
						ID<input type="text" name="id" size="-5">　
						PW<input type="password" name="pw" size="-5">
						<input type="submit" value="로그인"><input type="hidden" name="type" value="login">
					</form>
				</td>
				<td>
					<form action="register_Form.do" class="LogInForm" method="post" target="main">
						<input type="submit" value="회원가입">
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>