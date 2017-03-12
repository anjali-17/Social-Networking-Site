<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FriendsBook</title>
<link href="infocss.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form method="post"  action="infoserv" class="h1">
<fieldset id="h2">
<legend align="center"><font face="Palatino Linotype, Book Antiqua, Palatino, serif" color="black" size="+3"><i><b>Update Your Profile</i></b></font>
</legend>
<div class="register">
<table align="center" >
<tr><td><input type="text" name="name" size="25" placeholder="Name" tabindex="4" /></td>&nbsp;

<tr><td colspan="2"><input type="text" size="62" name="city" tabindex="6" placeholder="City" /></td></tr>
<tr><td colspan="2"><input type="text" size="62" name="phone" tabindex="7" placeholder="Phone" /></td></tr>
 <br>
<tr><td colspan="2" class="dob"><b>Date Of Birth</b></td></tr>
<tr><td><table><tr><td><select name="date" tabindex="9">
<option value ="Date">Date</option>
<option value =1>1</option>
<option value =2>2</option>
<option value =3>3</option>
<option value =4>4</option>
<option value =5>5</option>
<option value =6>6</option>
<option value =7>7</option>
<option value =8>8</option>
<option value =9>9</option>
<option value =10>10</option>
<option value =11>11</option>
<option value =12>12</option>
<option value =13>13</option>
<option value =14>14</option>
<option value =15>15</option>
<option value =16>16</option>
<option value =17>17</option>
<option value =18>18</option>
<option value =19>19</option>
<option value =20>20</option>
<option value =21>21</option>
<option value =22>22</option>
<option value =23>23</option>
<option value =24>24</option>
<option value =25>25</option>
<option value =26>26</option>
<option value =27>27</option>
<option value =28>28</option>
<option value =29>29</option>
<option value =30>30</option>
<option value =31>31</option></select></td>
<td><select name="month" tabindex="10">
<option value ="month">Month</option>
<option value =1>1</option>
<option value =2>2</option>
<option value =3>3</option>
<option value =4>4</option>
<option value =5>5</option>
<option value =6>6</option>
<option value =7>7</option>
<option value =8>8</option>
<option value =9>9</option>
<option value =10>10</option>
<option value =11>11</option>
<option value =12>12</option></select></td>
<td><select name="year" tabindex="11">
<option value ="year">Year</option>
<option value =1993>1993</option>
<option value =1994>1994</option>
<option value =1995>1995</option>
<option value =1996>1996</option>
<option value =1997>1997</option>
<option value =1998>1998</option>
<option value =1999>1999</option>
<option value =2000>2000</option></select></td></tr></table></td></tr>
<br>
<tr><td class="gender">Male<input type="radio" name="gender" tabindex="12" />&nbsp; &nbsp;Female<input type="radio" name="r1" tabindex="13" /></td><td></td></tr>
<tr><td colspan="2"><input type="text" size="62" name="movie" tabindex="8" placeholder="Movie" /></td></tr>
<tr><td colspan="2"><input type="text" size="62" name="sport" tabindex="8" placeholder="Sport" /></td></tr>
<tr><td colspan="2"><input type="text" size="62" name="novel" tabindex="8" placeholder="Novel" /></td></tr>
<tr><td colspan="2"><input type="text" size="62" name="school" tabindex="8" placeholder="School" /></td></tr>
<tr><td colspan="2"><input type="text" size="62" name="college" tabindex="8" placeholder="College" /></td></tr>
<tr><td colspan="2"><input type="text" size="62" name="work" tabindex="8" placeholder="Work" /></td></tr>

</table>
<br><center>
<div class="Continue" >
<input type="submit" value="Continue" class="t2" /></div>
</center>

</body>
</html>