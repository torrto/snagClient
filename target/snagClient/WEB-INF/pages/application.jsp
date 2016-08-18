<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Project Bark</title>
</head>
<body style="text-align: center">
<form:form id="wrap" action="/submitForm" method="POST" modelAttribute="wrapper">

	<p>Name: <form:input type="text" path="username" value=""/></p>
	<p>Email: <form:input type="text" path="email"/></p>
	<p>Phone: <form:input type="text" path="phone"/></p>
	<p>Questions</p>

	<c:forEach items="${wrapper.questions}" varStatus="i">
		<form:input path="questions[${i.index}].answer" type="text"/>
	</c:forEach>


	<button>submit</button>
</form:form>

</body>