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
<body >
 <jsp:include page="../common/header.jsp"></jsp:include>
 


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
                    <h6>SUPPORTERS2</h6>
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
<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
