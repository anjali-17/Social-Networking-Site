<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FriendsBook</title>
<link href="logincss.css" rel="stylesheet" type="text/css" />
</head>
<body>
<br/>
<br/>
<div align="left">
<img src="C:\Users\HP\workspace\social\WebContent\logo1.png" height="60" width="200">
</div>

<form method="post" action = "loginserv">
<fieldset id="h1">
<legend><font face="Palatino Linotype, Book Antiqua, Palatino, serif" color="black" size="+3"><b>Login</b></font></legend>
<div class="register">
<table  align="left" width="35%">
  <tr>
    <td class="t1">Email</td>
    <td class="t1">Password</td>
    <td></td>
  </tr>
  <tr>
    <td><input type="text" name=emailid size="25" tabindex="1"></td>
    <td><input type="password" name=password size="25" tabindex="2"></td>
    <td><a href=""></a><input type="submit" name="b1" value="Login" class="t2" tabindex="3"></a></td>
  </tr>
</table></div>
</fieldset>
</form>
<br />
<br />
<br/>
<form method ="post" action = "createacc">
<fieldset id="h1">
<legend><font face="Palatino Linotype, Book Antiqua, Palatino, serif" color="black" size="+3"><b>Create Your Account</b></font>
</legend>
<div class="register"></div>
<table align="left" width="25%">

<tr><td colspan="2"><input type="text" size="62" name="emailid" tabindex="6" placeholder="Email ID" /></td></tr>
<tr><td colspan="2"><input type="password" size="62" name="password" tabindex="7" placeholder="Password" /></td></tr>
 <tr><td colspan="2"><input type="password" size="62" name="cpassword" tabindex="8" placeholder="Confirm Password" /></td></tr>


</table>
<br>
<div class="sign-up" >
<input type="submit" value="Create Account" class="t2" /></div>

</fieldset>
</form>
<br />

</body>
</html>