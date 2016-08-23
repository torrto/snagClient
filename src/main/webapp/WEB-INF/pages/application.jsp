<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Project Bark</title>

	<script src="applicationJS.js"></script>

</head>
<body style="text-align: center">

<form:form id="wrap" action="/submitForm" method="POST" modelAttribute="wrapper">
	<h3>Applicant Info</h3>
	<p>Name: <form:input id="name" type="text" path="username" value="" onkeypress="return validateAlpha()"/></p>
	<p>Email: <form:input type="email" path="email"/></p>
	<p>Phone: <form:input type="text" path="phone" value="" onkeypress="return isNumberKey(event)"/></p>
	<h3>Questions</h3> <h6 style="color:red">please enter a 'yes' or a 'no'</h6>

	<c:forEach items="${wrapper.questions}" varStatus="i">
		<div class="col-sm-8">
		<c:out value="${wrapper.questions[i.index].question}"/>
		<form:input path="questions[${i.index}].answer" type="text"/>
		</div>
	</c:forEach>
	<br>
	<div class="col-sm-5 button">
		<button>submit</button>
	</div>
</form:form>

</body>