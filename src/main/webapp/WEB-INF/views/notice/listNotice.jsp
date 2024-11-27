<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>


<html>
<head>
<meta charset=UTF-8">
<title>코드 그룹 출력창</title>
</head>
<body>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="pink">
      <td><b>idx</b></td>
      <td><b>category</b></td>
      <td><b>title</b></td>
      <td><b>content</b></td>
      <td><b>regdate</b></td>
      <td><b>update</b></td>
      <td><b>status</b></td>
   </tr>

 <c:forEach var="notice" items="${listNotice}" >
   <tr align="center">
      <td>${notice.n_idx}</td>
      <td>${notice.n_category}</td>
      <td>${notice.n_title}</td>
      <td>${notice.n_content}</td>
      <td>${notice.n_regdate}</td>
      <td>${notice.n_update}</td>
      <td>${notice.n_status}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
