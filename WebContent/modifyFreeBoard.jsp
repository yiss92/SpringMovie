<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html>
<head>
<title>Insert title here</title>
</head>
<body>
      <form action="modify.do" method="post">
          �۹�ȣ:${original.boardNo} <br>
          ����:<textarea rows="3" cols="20" name="comment">${original.comment}</textarea><br>
       <input type="hidden" name="boardNo" value="${original.boardNo}"> <br> 
       <input type="submit" value="�����ϱ�">   
      </form>

</body>
</html>