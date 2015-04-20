<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="<c:url value="/css/style.css" />" type="text/css"
	rel="stylesheet" />
<link href="<c:url value="/css/jquery-ui-themes.css" />" type="text/css"
	rel="stylesheet" />
<link href="<c:url value="/css/axure_rp_page.css" />" type="text/css"
	rel="stylesheet" />
<link href="<c:url value="/css/axurerp_pagespecificstyles.css" />"
	type="text/css" rel="stylesheet" />
</head>

<body>
	<div id="wrapper">
		<div class="header">
			<div class="logoDiv"></div>
			<div class="signin-btn">
				<label>Sign In</label>
			</div>

		</div>




		<div class="create-account">
			<label>Create your account</label>
		</div>
		<div class="left-sec">
			<div class="text-dum">
				<label>Lorem ipsum dolor sit amet, consectetur adipiscing
					elit. Quisque feugiat luctus nisi, in commodo erat ultricies sed.
					Phasellus porttitor luctus dui, eu lacinia ipsum ornare varius.
					Donec euismod convallis ante id iaculis.</label>
			</div>
			<div class="we-can">
				<label><p>WE</p>
					<br />CAN DO IT TOGETHER
			</div>
			<div class="join">
				<label>Come join hands with us to <br />Bridge the Gap
				</label>
			</div>
		</div>
		<div class="right-sec">
			<div class="sign-label">Sign up with Email</div>
			<form:form class="form"  method="post" action="edit" commandName="userprofile">
				<ul>
					<li><span> 
					 
		<form:input placeholder="First Name" path="firstName"></form:input>
		
					 	</span>
						
						<label> <form:input placeholder="Last Name"  path="lastName"></form:input>     </label>
					</li>
					
					<li><span><form:input class="single-row"  path="email" placeholder="Email Id"></form:input>  </span></li>
					<li><span><form:input class="single-row"  path="password" placeholder="Password"></form:input> </span></li>
					<li><span><form:input class="single-row"  path="rePassword" placeholder="Retype Password"></form:input> </span></li>
					<li><span>Already have an account?</span><label class="text-dec">Login</label></li>
				</ul>
				<input class="signin-btn" type="submit" value="Sign up" >
				<div class="signin-btn">
					<label>Sign up</label>
				</div>
</form:form>

		</div>


	</div>
</body>
</html>
