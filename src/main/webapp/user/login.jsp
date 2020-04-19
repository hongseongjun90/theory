<%@page import="java.util.List"%>
<%@page import="lms.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
  <h1>회원 검색 결과</h1>
  
  <c:if test="${not empty user}">
    번호: <td>${user.no}</td>
    이메일:  <td>${user.email}</td>
    이름: <td>${user.name}</td>
    <td><a href='list'>목록으로 돌아가기</a><br></td>
  </c:if>
  
  <c:if test="${empty requestScope.user}">
  <p>해당 유저가 없습니다.</p>
  </c:if>
    
