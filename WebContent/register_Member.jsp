<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>ȸ������</title>
</head>
<body>
<h2>ȸ������</h2>

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
       <td colspan="2">
        <input type="submit" value="ȸ������">
       </td>       
    </tr>  
  </table>
</form>
</body>
</html>