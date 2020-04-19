<%@page import="lms.domain.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <h1>유저목록</h1>
  
  <a href='add'>유저등록</a><br>
  <table border='1'>
  <tr>
    <th>번호</th>
    <th>이메일</th>
    <th>이름</th>
  </tr> 
   
  <c:forEach items="${list}" var="item">
  <form action='search' method='get'>
    <input name='keyword' type='text' placeholder="유저 검색">
    <button>검색</button>
  </form>
  
  <tr>
    <td>${user.no}</td>
    <td><a href='detail?no=${user.no}'>=> ${user.name}</a></td>
    <td>${user.email}</td>
    <td>${user.name}</td>
  </tr>
  </c:forEach>
  </table>
  