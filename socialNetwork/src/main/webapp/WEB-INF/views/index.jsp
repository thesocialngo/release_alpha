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
        	<a href="#">LOGIN</a> |
            <a href="#">SIGN UP</a>
        </div>
        <div class="clear"></div>
    </div>	
</div>

<!------------ top row end-------------->

<!------------ header start-------------->

<div class="header">
	<div class="container">
    	<div class="logo">
        	<img src="images/logo.png" alt="logo" />
        </div>
        
        <div class="nav">
        	
            <ul>
            	<li><a href="#" class="active">HOME</a></li>
                <li><a href="static/Explore.jsp">Explore</a></li>            
                <li><a href="#">How it works</a></li>               
                <li><a href="#">Start your movement</a></li>
            </ul>
            
        </div>
   
        
    </div>
    <div class="clear"></div>
</div>

<!------------ header End-------------->

<!------------ banner start-------------->

<div class="banner">
	<div class="slide">
    	<img src="images/banner.png" alt="banner" />
    </div>
    <div class="clear"></div>
</div>

<!------------ banner End-------------->


<!------------ CONTENT START-------------->

<section class="content">
	
    <div class="block-row">	
		<div class="blocks">
    	<div class="container">
        	
            <div class="cols-3">
            	<div class="block3">
                	<div class="icon"><img src="images/icon1.png" alt="icon" /></div>
                    <h6>SUPPORTERS</h6>
                    <p>
                    	The world has never been so interconnect
                        ed - both in terms of business and 
                    </p>
                    <a href="#" class="readmore">Readmore...</a>
                </div>
            </div>
            
             <div class="cols-3">
            	<div class="block3">
                	<div class="icon"><img src="images/icon1.png" alt="icon" /></div>
                    <h6>DONATIONS</h6>
                    <p>
                    	The world has never been so interconnect
                        ed - both in terms of business and 
                    </p>
                    <a href="#" class="readmore">Readmore...</a>
                </div>
            </div>
            
             <div class="cols-3-last">
            	<div class="block3">
                	<div class="icon"><img src="images/icon1.png" alt="icon" /></div>
                    <h6>MOVEMENTS</h6>
                    <p>
                    	The world has never been so interconnect
                        ed - both in terms of business and 
                    </p>
                    <a href="#" class="readmore">Readmore...</a>
                </div>
            </div>
            
        </div>
        <div class="clear"></div>
    </div>
    </div>
    
    <div class="container">
    <h1>We can do it togather, pick your movement</h1>
    
    <div class="lft">
    	<img src="images/pic1.png" alt="pic" />
    </div>
    
    <div class="rgt">
    	<p>
        	The world has never been so interconnected both in terms of business and  culturally. 
It is our mission to deliver the interpreting and translation services required to ensure  
clear understanding and the  better  connection  of  people  in  business,  government 
services and the legal profession.
        </p>
        <p>
        	Edis Interpreting commits to providing the leading translation and interpreting services 
for your task. All of our interpreters comply with the highest industry accreditation as 
well as extensive professional experience.

        </p>
        <ul>
        	<li>Minimum level 3 NAATI Accreditation.</li>
            <li>Professionals with a minimum 5 years experience.</li>
            <li>Experience in legal matters including court appearances</li>
            <li>Excel in each language.</li>
        </ul>
    </div>
    </div>
<div class="clear"></div>
</section>


<!------------ CONTENT END-------------->


<!------------ FOOTER START-------------->

<div class="footer">

	<div class="four_clum">
    	<div class="container">
        	
            <div class="cols-4">
            	<h6>ABOUT US</h6>
                <ul>
                	<li><a href="#">Login</a></li>
                    <li><a href="#">Signup</a></li>
                    <li><a href="#">Donate</a></li>
                   <li><a href="#">Movements</a></li>
                   <li><a href="#">Jobs</a></li>
                </ul>
            </div>
            
            <div class="cols-4">
            	<h6>The Social NGO</h6>
               <ul>
                	<li><a href="#">About</a></li>
                    <li><a href="#">Why</a></li>
                    <li><a href="#">Fees</a></li>
                   <li><a href="#">Team</a></li>
                    <li><a href="#">Media</a></li>
                     
                </ul>
            </div>
            
            <div class="cols-4">
                <h6>Help</h6>
                 <ul>
                    <li><a href="#">Guidelines</a></li>
                    <li><a href="#">FAQ</a></li>
                    <li><a href="#">Contact</a></li>
                   <li><a href="#">Terms of Use</a></li>
                   <li><a href="#">Privacy policy</a></li>
                </ul>
            </div>
            
            <div class="cols-4-last">
            <h6>Connect With us</h6>
            <div class="socialIcon">
                  <div class="cols-3"><img src="images/facebook.png" alt="facebook" /></div>
                  <div class="cols-3"><img src="images/google-plus.png" alt="google plus" /></div>
                  <div class="cols-3-last"><img src="images/twitter.png" alt="twitter" /></div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    
    <div class="copyright">
    	<div class="container">
        	<div class="cols-2">COPYRIGHT &copy; Prayas socialngo foundation</div>
            <div class="cols-2-last algn_rgt">
            	DESIGN AND DEVELOP BY :: I3WEBWORLD.COM
            </div>
        </div>
        <div class="clear"></div>
    </div>
    
    
</div>

<!------------ FOOTER END-------------->
</body>
</html>
