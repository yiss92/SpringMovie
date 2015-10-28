<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>freeboard_main.jsp</title>
</head>
<body>
<form action="write.do" method="post">
	아이디:<input type="text" name="guestName" size="10"><br>
	비밀번호:<input type="password" name="password" size="10"><br>
	남길 메시지:<textarea rows="10" cols="20" name="message"></textarea>
	<input type="submit" value="작성">
</form>

<hr>
<table border="1">
	<c:if test="${empty FreeBoardPage.FreeBoardList}">
		<tr>
			<td>
			아직 메시지가 존재하지 않습니다. 
			메세지를 남겨보세요!
			</td>
		</tr>
	</c:if>
	<c:if test="${!empty freeboardPage.freeboardList}">
		<c:forEach var="freeboard" items="${freeboardPage.freeboardList}">
			<tr>
				<td>
					글번호:${freeboard.boardNo}<br>
					제목: ${freeboard.title}<br>
					글내용: ${freeboard.comment}<br>
					작성일: ${freeboard.date}<br>
					<a href="modifyForm.do?messageId=${freeboard.boardNo}">[수정하기]</a>
					<a href="deleteForm.do?messageId=${freeboard.boardNo}">[삭제하기]</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td>
				<c:forEach begin="${freeboardPage.startPage}" end="${freeboardPage.endPage}" var="p">
				<a href="freeboard.do?page=${p}">[${p}]</a>
				</c:forEach>
			</td>
		</tr>
	</c:if>
</table>
</body>
</html>