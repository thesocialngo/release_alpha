<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <title>NGO</title>
  <meta charset="utf-8">
 <link href="<c:url value="/css/style.css" />" type="text/css"	rel="stylesheet" media="all"/>
<link href="<c:url value="/css/reset.css" />" type="text/css"rel="stylesheet" media="all"/>
 <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,200,100,500,600,700' rel='stylesheet' type='text/css'>
  
  <!--[if lt IE 7]>
  	<link rel="stylesheet" href="Style/ie/ie6.css" type="text/css" media="all">
  <![endif]-->
  <!--[if lt IE 9]>
  	<script type="text/javascript" src="js/html5.js"></script>
    <script type="text/javascript" src="js/IE9.js"></script>
  <![endif]-->
  
  
</head>
<body>



<!------------ top row start-------------->

<div class="toprow">
	<div class="container">
    	<div class="search">
          <input type="text" value="" class="input1" /><input type="button" value="" class="input2" />
        </div>
        <div class="login_link">
<c:choose>
<c:when test="${not empty userprofile && userprofile.validProfile }"><a href="/socialNetwork/user/logout">LOGOUT</a> | <a href="/socialNetwork/user/updateProfile">Update Profile</a></c:when>
<c:otherwise><a href="/socialNetwork/user/SignUp?login=true">LOGIN</a> | <a href="/socialNetwork/user/SignUp">SIGN UP</a> </c:otherwise>
</c:choose>
 
 
           
        </div>
        <div class="clear"></div>
    </div>	
</div>



<!------------ top row end-------------->





<!------------ header start-------------->

<div class="header">
	<div class="container">
    	<div class="logo">
    	<img src="<c:url value="/images/logo.jpg"/> " >
        	<!-- <img src="images/logo.png" alt="logo" /> -->
        </div>
        
        <div class="nav">
        	
            <ul>
            	<li><a href="/socialNetwork/" class="active">HOME</a></li>  
                <li><a href="/socialNetwork/explore">Explore</a></li>           
                <li><a href="/socialNetwork/howItWorks">How it works</a></li>               
                <li><a href="/socialNetwork/StartYourMovement">Start your movement</a></li>
            </ul>
            
        </div>
   
        
    </div>
    <div class="clear"></div>
</div>

<!------------ header End-------------->






<!------------ banner start-------------->

<!-- <div class="banner-inner">
	<div class="slide-inner">
    	<h2>Frequently asked questions</h2>
    </div>
    <div class="clear"></div>
</div> -->

<!------------ banner End-------------->





</body>
</html>
