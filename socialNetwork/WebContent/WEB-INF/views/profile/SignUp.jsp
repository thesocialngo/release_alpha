<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
</head>
<body>
	<form:form method="post" action="edit" commandName="userprofile">

		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName"></form:input>
		<br />

		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName"></form:input>
		<br />
		 
		Email <form:input path="email"></form:input>
		<br />

		<form:label path="password">Password</form:label>
		<form:input path="password"></form:input>
		<br />

		<input id="u9" type="text" value="Re- Type Password" class="u9">
		<br />

		<input id="u9" type="text" value="DD" />
		<input id="u9" type="text" value="MM" />
		<input id="u9" type="text" value="YYYY">
		<br />

		<form:select path="gender">
			<form:option value="1">Male</form:option>
			<form:option value="2">Female</form:option>
			<form:option selected="selected" value="0">Gender</form:option>
		</form:select>
		<br />

		<form:select path="securityQuestionId_1">

			<form:option selected="selected" value="0">select your security question</form:option>
			<c:if test="${!empty userprofile.securityQuestions}">
				<c:forEach items="${userprofile.securityQuestions}"
					var="securityQuestion">
					<option value="${securityQuestion.id} ">${securityQuestion.description} </option>
				</c:forEach>
			</c:if>
		</form:select>
		 <form:input path="securityAnswer_1"></form:input>
<%--
		<select id="u29" class="u29">
			<option selected="selected" value="select your security question">select
				your security question</option>
			<c:if test="${!empty userprofile.securityQuestions}">
				<c:forEach items="${userprofile.securityQuestions}"
					var="securityQuestion">
					<option value="${securityQuestion.id} ">${securityQuestion.description}
					</option>
				</c:forEach>
			</c:if>
		</select> --%>
		
		<br />

		<select id="u31" class="u31">
			<option selected="selected" value="select your security question">select
				your security question</option>
			<c:if test="${!empty userprofile.securityQuestions}">
				<c:forEach items="${userprofile.securityQuestions}"
					var="securityQuestion">
					<option value="${securityQuestion.id} ">${securityQuestion.description}
					</option>
				</c:forEach>
			</c:if>
		</select>
		<input id="u32" type="text" value="Answer" class="u32">
		<br />

		<select id="u33" class="u33">
			<option selected="selected" value="select your security question">select
				your security question</option>
			<c:if test="${!empty userprofile.securityQuestions}">
				<c:forEach items="${userprofile.securityQuestions}"
					var="securityQuestion">
					<option value="${securityQuestion.id} ">${securityQuestion.description}
					</option>
				</c:forEach>
			</c:if>
		</select>
		<input id="u34" type="text" value="Answer" class="u34">
		<br />

		<select id="u35" class="u35">
			<option selected="selected" value="select your security question">select
				your security question</option>
			<c:if test="${!empty userprofile.securityQuestions}">
				<c:forEach items="${userprofile.securityQuestions}"
					var="securityQuestion">
					<option value="${securityQuestion.id} ">${securityQuestion.description}
					</option>
				</c:forEach>
			</c:if>
		</select>
		<input id="u34" type="text" value="Answer" class="u34">
		<br />
		<br />

		<input type="checkbox" value="checkbox" checked="checked">
		
		&nbsp; &nbsp; Sign me up for the weekly newsletter <br />
		<br /> By signing up you agree to our Terms of Use Privacy Policy. <a>
			Already have an account?</a>
		<br />

		<input type="submit" value="create my account" checked="checked">

	</form:form>
</body>
</html>