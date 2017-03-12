<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message</title>

</head>
<body>
<form id="contact_form" action="messageserv" method="POST" >
	<div class="row">
		<label for="name">Receiver's name:</label><br />
		<input id="name" class="input" name="name" type="text" value="" size="30" /><br />
		<br>
	</div>
	<div class="row">
		<label for="email">Receiver's email:</label><br />
		<input id="email" class="input" name="email" type="text" value="" size="30" /><br />
	</div>
	<br>
	<div class="row">
		<label for="message">Your message:</label><br />
		<textarea id="message" class="input" name="message" rows="7" cols="30"></textarea><br />
	</div>
	<br>
	<input id="submit_button" type="submit" value="Send message" />
</form>						

</body>
</html>