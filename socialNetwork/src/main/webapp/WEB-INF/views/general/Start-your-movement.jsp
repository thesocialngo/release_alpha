<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <title>NGO</title>
  <meta charset="utf-8">
<link href="<c:url value="/css/reset.css" />" type="text/css"rel="stylesheet" media="all"/>
<link href="<c:url value="/css/style.css" />" type="text/css"	rel="stylesheet" media="all"/>
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

<jsp:include page="../common/header.jsp"></jsp:include>
<!------------ CONTENT START-------------->

<section class="content">
    
    <div class="container">
    <h2>Start your movement </h2>
    <p>
    Your use of this website (the “Site”) constitutes your acceptance of the terms of this Privacy policy (the “Policy”). By accepting this Policy, you expressly consent to our collection, storage, use and disclosure of your personal information as described. 
    </p>
   
    	
        <div class="update_profile">
        <h6>Build your profile and show the world what u care about</h6>
        	
        <!--<div class="rgtCl">
        	<div class="upload_photo">
            	Upload your PhotoGraph
                <img src="images/avatar.png" alt="avtar" />
            </div>
        </div>-->
         <div class="cols-111">
         	
            <div class="row">
            	<div class="p_left">Movement Picture</div>
                <div class="p_right"><img src="images/avatar.png" alt="avtar" /></div>
            </div>
            
            <div class="row">
            	<div class="p_left">Type</div>
                <div class="p_right">
                	<select>
                	<option>Individual</option>
                	<option>............ </option>
                </select>
                </div>
            </div>
            
             <div class="row">
            	<div class="p_left">Category</div>
                <div class="p_right">
                	<select>
                	<option>Category</option>
                	<option>Animal </option>
                    <option>Animal </option>
                    <option>Animal </option>
                    <option>Animal </option>
                    <option>Animal </option>
                </select>
                </div>
            </div>
            
            
             <div class="row">
            	<div class="p_left">Geographical Conrage</div>
                <div class="p_right">
                <input type="text" value="Street" />
                 <input type="text" value="TwonCity" />
                 <select>
                	<option>Select your city</option>
                	<option>..... </option>
                    <option>..... </option>
                </select>
                <select>
                	<option>Select Start</option>
                	<option>..... </option>
                    <option>..... </option>
                </select>
                </div>
            </div>
            
            
            <div class="row">
            	<div class="p_left">Punchline</div>
                <div class="p_right">
                	<textarea></textarea>
                </div>
            </div>
            
             <div class="row">
            	<div class="p_left">Social/Environmental issue</div>
                <div class="p_right">
                	<textarea></textarea>
                </div>
            </div>
            
             <div class="row">
            	<div class="p_left">Statistics</div>
                <div class="p_right">
                	<textarea></textarea>
                </div>
            </div>
            
             <div class="row">
            	<div class="p_left">Solution</div>
                <div class="p_right">
                	<textarea></textarea>
                </div>
            </div>
            
            <div class="row">
            	<div class="p_left">Milestone 1</div>
                <div class="p_right">
                	<select>
                	<option>Select </option>
                	<option>-------</option>
                    <option>----- </option>
                    <option>------</option>
                    <option>------</option>
                </select>
                
                <textarea>Description</textarea>
                </div>
            </div>
            
            <div class="row">
            	<div class="p_left">Milestone 2</div>
                <div class="p_right">
                	<select>
                	<option>Select </option>
                	<option>-------</option>
                    <option>----- </option>
                    <option>------</option>
                    <option>------</option>
                </select>
                
                <textarea>Description</textarea>
                </div>
            </div>
            
            <div class="row">
            <div class="p_left">&nbsp;</div>
            	<div class="p_right1"><input type="button" class="button" value="Save and Review Your Movements" /></div>
            </div>
            
            
            
         </div>
         
         
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
            <h6>Join the SocialNGo Movement</h6>
            <div class="newslatter">
            	<div class="lt">
                	<input type="text" value="Email Id" />
                </div>
                <div class="rt">
                	<input type="button" value="Sign Up" class="button" />
                </div>
            </div>
            <div class="socialIcon">
                  <div class="cols-4"><img src="images/facebook.png" alt="facebook" /></div>
                  <div class="cols-4"><img src="images/google-plus.png" alt="google plus" /></div>
                  <div class="cols-4"><img src="images/twitter.png" alt="twitter" /></div>
                  <div class="cols-4-last"><img src="images/tube.png" alt="youtube" /></div>
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
