<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>로긴 페이지</title>
</head>
<body>
    <form action="logginForm.do" method="post">
      <table border="1">
        <tr>
           <td>ID</td>
           <td>
           <input type="text" name="id">
           </td>
        </tr>
        <tr>
            <td>PW</td>
            <td>
            <input type="password" name="password">
            </td>
        </tr>
        <tr>
          <td colspan="2">
            <input type="submit" value="로그인">
          </td>
        </tr>
      </table>
    </form>

</body>
</html>