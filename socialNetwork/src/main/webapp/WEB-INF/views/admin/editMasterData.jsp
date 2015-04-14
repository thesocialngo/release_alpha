<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>The socialNGO.</title>
</head>
<body>

	<h2>Security Questions Management Screen : The socialNGO.</h2>


	<%--
<form:form method="get" action="add" commandName="allTables">
  
    <table>
    <tr>
        <td><form:label path="questionText"><spring:message code="label.questionText"/></form:label></td>
        <td><form:input path="questionText" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form> 
 --%>
	<h3>All master tables</h3>
	<c:if test="${!empty tables}">


		<table class="data">
			<tr>
				<th>Table name</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${tables}" var="tablename">
				<tr>
					<td>${tablename}</td>
					<td><a href="edit/${tablename}">edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<%-- Code to show data for all tables and delete record  --%>

	<c:if test="${!empty securityQuestionList}">
		<h3>Security Questions</h3>

		<form:form method="get" action="add/" commandName="securityQuestion">

			<table>
				<tr>
					<td><form:label path="questionText">
							<spring:message code="label.questionText" />
						</form:label></td>
					<td><form:input path="questionText" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"
						value="<spring:message code="label.add"/>" /></td>
				</tr>
			</table>
		</form:form>


		<table class="data">
			<tr>
				<th>question text</th>
				<th>id</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${securityQuestionList}" var="qn">
				<tr>
					<td>${qn.questionText}</td>
					<td>${qn.questionId}</td>
					<td><a href="delete/${qn.questionId}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<c:if test="${!empty catagoryList}">
		<h3>Categories :</h3>
		<table class="data">
			<tr>
				<th>category text</th>
				<th>id</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${catagoryList}" var="item">
				<tr>
					<td>${item.categoryDescr}</td>
					<td>${item.categoryId}</td>
					<td><a href="delete/${item.categoryId}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<c:if test="${!empty causeList}">
		<h3>Causes :</h3>
		<table class="data">
			<tr>
				<th>cause text</th>
				<th>id</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${causeList}" var="item">
				<tr>
					<td>${item.causeDescr}</td>
					<td>${item.causeId}</td>
					<td><a href="delete/${item.causeId}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<c:if test="${!empty educationList}">
		<h3>Educations :</h3>
		<table class="data">
			<tr>
				<th>Education text</th>
				<th>id</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${educationList}" var="item">
				<tr>
					<td>${item.educationText}</td>
					<td>${item.educationId}</td>
					<td><a href="delete/${item.educationId}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<c:if test="${!empty occupationList}">
		<h3>Occupations :</h3>
		<table class="data">
			<tr>
				<th>Occupation text</th>
				<th>id</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${occupationList}" var="item">
				<tr>
					<td>${item.occupationText}</td>
					<td>${item.occupationId}</td>
					<td><a href="delete/${item.occupationId}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


</body>
</html>