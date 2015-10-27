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
	���̵�:<input type="text" name="guestName" size="10"><br>
	��й�ȣ:<input type="password" name="password" size="10"><br>
	���� �޽���:<textarea rows="10" cols="20" name="message"></textarea>
	<input type="submit" value="�ۼ�">
</form>

<hr>
<table border="1">
	<c:if test="${empty FreeBoardPage.FreeBoardList}">
		<tr>
			<td>
			���� �޽����� �������� �ʽ��ϴ�. 
			�޼����� ���ܺ�����!
			</td>
		</tr>
	</c:if>
	<c:if test="${!empty freeboardPage.freeboardList}">
		<c:forEach var="freeboard" items="${freeboardPage.freeboardList}">
			<tr>
				<td>
					�۹�ȣ:${freeboard.boardNo}<br>
					����: ${freeboard.title}<br>
					�۳���: ${freeboard.comment}<br>
					�ۼ���: ${freeboard.date}<br>
					<a href="modifyForm.do?messageId=${freeboard.boardNo}">[�����ϱ�]</a>
					<a href="deleteForm.do?messageId=${freeboard.boardNo}">[�����ϱ�]</a>
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