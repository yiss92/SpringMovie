<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<title>회원정보수정</title>
</head>
<body>
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
				<td>${original.name}</td>
			</tr>
			<tr>
				<td>NickName</td>
				<td>${original.nickname}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${original.email}</td>
			</tr>
			<tr>
				<td><a href="updateMemberForm.do">[회원정보수정]</a></td>
				<td><a href="deleteMemberForm.do">[회원탈퇴]</a>
			</tr>
		</table>

</body>
</html>