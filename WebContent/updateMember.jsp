<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="upDateForm.do" method="post">
		<table border="1">
			<tr>
				<td>MemberNum</td>
				<td>${original.memberNum}</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>${original.id}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${original.name}"></td>
			</tr>
			<tr>
				<td>NickName</td>
				<td><input type="text" name="nickname"
					value="${original.nickname}"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${original.email}</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원정보수정"></td>
			</tr>
		</table>
	</form>
</body>
</html>