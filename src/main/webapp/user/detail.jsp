<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

<h1>회원 상세정보</h1>

<c:if test='${not empty user}'>   
<img src='../upload/thumbnail.${user.ProfilePhoto}.jpg'><br>
<form action='update' method='post' enctype='multipart/form-data'>
        번호: <input name='no' type='text' readonly value='${user.no}'><br>
        이메일: ${user.email}<br>
        이름: ${user.name}<br>
        암호: ${user.password}<br>
        전화: ${user.tel}<br>
        전공: ${user.major}<br>
        자기소개:<br>
        <textarea name='introduce' rows='5' cols='60'>${user.introduce}</textarea><br>
        사진: ${user.profilePhoto}<br>
        <%
        int loginm = user.getLoginMethod();
        String loginstr;
        switch(loginm) {
          case 0 : loginstr = "이메일"; break;
          case 1 : loginstr = "카카오"; break;
          case 2 : loginstr = "구글"; break;
          default : loginstr = "null";
        } %>
        로그인 방식: ${user.loginstr}<br>
        회원가입일 : ${user.createDate}<br>
        <p><a href='delete?no=${user.userNo}'>삭제</a>
        <p><a href='update?no=${user.userNo}'>변경</a></p>
        <p><button>변경</button>
        </form>
</c:if>

<c:if test="test=${empty requestScope.user}">
<p>해당 유저가 없습니다.</p>
</c:if>


