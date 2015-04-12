<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>The socialNGO.</title>
</head>
<body>
	<h2>Management Screen : The socialNGO</h2>
	<!------------Security questions --------------->
	<h3>Security Questions .</h3>

	<form:form method="get" action="add" >
		<input type="hidden" name="tableName" value="SECURITY_QUESTIONS" />

		<input type="text" name="textValue" />
		<input type="submit"
			value="<spring:message code="label.question.add"/>" />
	</form:form>

	<table class="data">
		<c:forEach items="${masterRecords.securityQuestions}" var="entity">
			<tr>
			  <td><a href="delete/SECURITY_QUESTIONS/${entity.id}">delete</a></td>	<td>${entity.description}</td>
			</tr>
		</c:forEach>
	</table>

	<!------------Occupations --------------->
	<h3>Occupations .</h3>
	<form:form method="get" action="add">
		<input type="hidden" name="tableName" value="OCCUPATION" />
		<input type="text" name="textValue" />
		<input type="submit"
			value="<spring:message code="label.occupation.add"/>" />
	</form:form>
	<table class="data">
		<c:forEach items="${masterRecords.occupations}" var="entity">
			<tr>
			  <td><a href="delete/OCCUPATION/${entity.id}">delete</a></td>	<td>${entity.description}</td>
			</tr>
		</c:forEach>
	</table>

	<!-----------3-Education --------------->
	<h3>Educations .</h3>
	<form:form method="get" action="add">
		<input type="hidden" name="tableName" value="EDUCATION" />
		<input type="text" name="textValue" />
		<input type="submit"
			value="<spring:message code="label.education.add"/>" />
	</form:form>
	<table class="data">
		<c:forEach items="${masterRecords.educations}" var="entity">
			<tr>
			 <td><a href="delete/EDUCATION/${entity.id}">delete</a></td>	<td>${entity.description}</td>
			</tr>
		</c:forEach>
	</table>

	<!-----------4-Causes --------------->
	<h3>Causes .</h3>
	<form:form method="get" action="add">
		<input type="hidden" name="tableName" value="CAUSES" />
		<input type="text" name="textValue" />
		<input type="submit" value="<spring:message code="label.cause.add"/>" />
	</form:form>
	<table class="data">
		<c:forEach items="${masterRecords.causes}" var="entity">
			<tr>
			<td><a href="delete/CAUSES/${entity.id}">delete</a></td>	<td>${entity.description}</td>
			</tr>
		</c:forEach>
	</table>
	<!-----------5-Catagories --------------->
	<h3>Catagories .</h3>

	<form:form method="get" action="add">
		<input type="hidden" name="tableName" value="CATEGORIES" />
		<input type="text" name="textValue" />
		<input type="submit"
			value="<spring:message code="label.category.add"/>" />
	</form:form>


	<table class="data">
		<c:forEach items="${masterRecords.categories}" var="entity">
			<tr>
			<td><a href="delete/CATEGORIES/${entity.id}">delete</a></td>	<td>${entity.description}</td>
			</tr>
		</c:forEach>
	</table>
</html>
</body>