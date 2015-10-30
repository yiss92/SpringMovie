<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
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
<title>freeboard_main.jsp</title>
</head>
<body class="bg-content">
	<div class="container">
		<div class="col-md-10">
			<div class="row">
			<article class="span8">
			<br><br><br>
				<form action="write.do" method="post">
					<input type="text" name="title" size="10" value='����' onfocus="this.value=''" ><br> 
					<textarea rows="10" cols="20" name="comment" onclick="this.value=''">������ �Է��ϼ���</textarea><br>
					<input type="submit" value="�ۼ�">
				</form>

				<hr>
				<table  class="table table-condensed">
				<c:choose>
					<c:when test="${empty freeboardPage.freeboardList}">
						<tr>
							<td>���� �޽����� �������� �ʽ��ϴ�. �޼����� ���ܺ�����!</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="freeboard" items="${freeboardPage.freeboardList}">
							<tr>
								<td>�۹�ȣ:${freeboard.boardNo}<br> 
									����:${freeboard.title}<br>
									�۾���:${freeboard.id}<br> 
									�۳���: ${freeboard.comment}<br>
									�ۼ���: <fmt:formatDate value="${freeboard.date}" pattern="YY/MM/dd"/><br> 
									
									<c:if test="${sessionScope.id==freeboard.id}">
									<a
									href="modifyForm.do?boardNo=${freeboard.boardNo}">[�����ϱ�]</a> <a
									href="deleteFreeBoardForm.do?boardNo=${freeboard.boardNo}">[�����ϱ�]</a>
									
									</c:if>
									
								</td>
							</tr>
						</c:forEach>
						<tr>
							<td><c:forEach begin="${freeboardPage.startPage}"
									end="${freeboardPage.endPage}" var="p">
									<a href="freeboard.do?page=${p}">[${p}]</a>
								</c:forEach></td>
						</tr>
					</c:otherwise>
					</c:choose>
				</table>
				</article>
			</div>
		</div>
	</div>
</body>
</html>