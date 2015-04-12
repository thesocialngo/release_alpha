<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>The socialNGO.</title>
</head>
<body>
  
<h2>Security Questions Management Screen : The socialNGO.</h2>
   


<form:form method="get" action="add/securityQuestion" commandName="securityQuestion">
  
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
  
        
<h3>Security Questions</h3>
<c:if  test="${!empty securityQuestionList}">
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
  
</body>
</html>