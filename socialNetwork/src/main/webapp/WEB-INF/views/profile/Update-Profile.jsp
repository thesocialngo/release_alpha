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
 <jsp:include page="../common/header.jsp"></jsp:include>

<!------------ CONTENT START-------------->

<section class="content">
    
    <div class="container">
    <h2>Update Your Profile</h2>
   
    	 <form:form class="form"  method="post" action="updateProfile" commandName="userprofile">
        <div class="update_profile">
        <h6>Build your profile and show the world what u care about</h6>
        	
        <div class="rgtCl">
        	<div class="upload_photo">
            	Upload your PhotoGraph
                <img src="../images/avatar.png" alt="avtar" />
            </div>
        </div>
         <div class="leftCl">
         	
            <div class="row">
            	<div class="p_left">Profile Picture</div>
                <div class="p_right"><img src="../images/avatar.png" alt="avtar" /></div>
            </div>
            
            <div class="row">
            	<div class="p_left">Sex</div>
                <div class="p_right">
					<form:select path="gender">
						<form:option value="M">Male</form:option>
						<form:option value="F">Female</form:option>
						<form:option selected="selected" value="O">Gender</form:option>
					</form:select>
		 
</div>
            </div>
            
             <div class="row">
            	<div class="p_left">Date Of Birth</div>
                <div class="p_right">02/02/1999</div>
            </div>
            
            
             <div class="row">
            	<div class="p_left">Highest Education</div>
                <div class="p_right">
                <select>
                	<option>Select Class</option>
                	<option>10th </option>
                    <option>12th </option>
                    <option>Bachelor degree</option>
                    <option>Master Digree</option>
                </select></div>
            </div>
            
             <div class="row">
            	<div class="p_left">Location</div>
                <div class="p_right">
                	<input type="text" value="Address 1" />
                    <input type="text" value="Address 1" />
                    <select>
                	<option>Select City</option>
                	<option>city name</option>
                   <option>city name</option>
                   <option>city name</option>
                </select>
                 <select>
                	<option>Select State</option>
                	<option>city name</option>
                   <option>city name</option>
                   <option>city name</option>
                </select>
                </div>
            </div>
            
            
            <div class="row">
            	<div class="p_left">About Me</div>
                <div class="p_right">
                	<textarea></textarea>
                </div>
            </div>
            
            <div class="row">
            	<div class="p_left">Present Work</div>
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
            
            <div class="row-b">
              <input class="button" type="submit"  value="Save and Review Your Profile" >
            	<!-- <input type="button" class="button" value="Save and Review Your Profile" /> -->
            </div>
            
            
            
         </div>
         
         
        </div>
       </form:form> 
        
      
    </div>
<div class="clear"></div>
</section>


<!------------ CONTENT END-------------->
<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
