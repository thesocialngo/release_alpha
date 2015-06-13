<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<%@ taglib prefix="ca" uri="/WEB-INF/taglib/constantAccess.tld"%>

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
    <h2 class="ctr">CREATE YOUR ACCOUNT</h2>
   
    	
        <div class="update_profile">
      
        <div class="signL">
        	<p>
            	Your use of this website   constitutes your acceptance of the terms of this Privacy policy (the “Policy”). By accepting this Policy. 
            </p>
            
            <h5>
            <span>WE</span> <br />
            CAN DO IT <br />
            TOGETHER 
            </h5>
            
            <h6>come join hands with us to bridge the Gap</h6>
            
        </div>
        <%-- <ca:session constant='USER_PROFILE' /> --%>
      <form:form class="form"  method="post" action="SignUp" commandName="userprofile">
         <div class="signR">
         	
          <h6>Sign up with email</h6>
          
          <div class="row">
          <form:input placeholder="Fairst Name" path="firstName"  ></form:input>
          	<!-- <input type="text" value="Frist Name" /> -->
          </div>
          
           <div class="row">
            <form:input placeholder="Last Name"  path="lastName"  ></form:input>
          <!-- 	<input type="text" value="Last Name" /> -->
          </div>
          
           <div class="row">
           <form:input class="single-row"  path="email" placeholder="Email Id"></form:input> 
          	<!-- <input type="text" value="Email Id" /> -->
          </div>
          
           <div class="row">
           <form:input class="single-row"  path="password" placeholder="Password"></form:input>
          	<!-- <input type="text" value="Password" /> -->
          </div>
          
           <div class="row">
          	<form:input class="single-row"  path="rePassword" placeholder="Retype Password"></form:input>
          <!-- <input type="text" value="Reconfirm password" /> -->
          </div>
          
           <div class="row2">
           		<div class="left">
          			Date of Birth
            	</div>	
                <div class="right">
          			<div class="cls">
                    	<select>
                        	<option>Date</option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>
                    <div class="cls">
                    	<select>
                        	<option>Month</option>
                            <option>Jan</option>
                            <option>Feb</option>
                            <option>March</option>
                            <option>April</option>
                            <option>May</option>
                        </select>
                    </div>
                    <div class="cls">
                    	<select>
                        	<option>Year</option>
                            <option>2001</option>
                            <option>2000</option>
                            <option>1999</option>
                            <option>1998</option>
                            <option>1997</option>
                        </select>
                    </div>
            	</div>
                <div class="clear"></div>
          </div>
          
           <div class="row2">
          	<div class="rdN">Male</div> 
            <div class="rdIN"><input name="" type="radio" value=""></div> 
            <div class="rdN">Femail</div> 
            <div class="rdIN"><input name="" type="radio" value=""></div>
            <div class="clear"></div>
          </div>
          
          <div class="row2">
          	<input name="" type="checkbox" value=""> By signing up you agree to our <a href="/socialNetwork/TermAndConditions">Terms of use</a> and <a href="#">privacy policy</a>
          </div>
          
          <div class="row3">
          	Already have an account? <a href="#">LOG IN</a>
          </div>
          
          <div class="row2 ctr">
          <input class="signin-btn" type="submit"  value="Sign up" >
          	<!-- <input type="button" class="button" value="Create New Account" /> -->
          </div>
            
         </div>
         </form:form>
         
        </div>
        
        
      
    </div>
<div class="clear"></div>
</section>


<!------------ CONTENT END-------------->

<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
