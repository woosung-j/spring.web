<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<c:if test='${agree == "yes"}'>
	약관에 동의합니다.
</c:if>
<c:if test='${agree == "no"}'>
	약관을 거절합니다.
</c:if>