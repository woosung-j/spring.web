<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<form action="login" method='post'>
	ID: <input type='text' name='userId' value='${user.userId}'/><br>
	PW: <input type='password' name='pw'/><br>
	<input type='checkbox' name='rememberMe'/>아이디 저장<br>
	<input type='submit' value='로그인'/>
</form>