<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Snag</title>

	<script src="applicationJS.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body style="text-align: center">

<form:form id="wrap" action="/submitForm" method="POST" modelAttribute="wrapper">
	<h3>Applicant Info</h3>
	<p>Name: <form:input id="name" type="text" path="user.username" value="" onkeypress="return validateAlpha()"/></p>
	<p>Email: <form:input type="email" path="user.email"/></p>
	<p>Phone: <form:input type="text" path="user.phone" value="" onkeypress="return isNumberKey(event)"/></p>
	<h3>Questions</h3> <h6 style="color:red">please enter a 'yes' or a 'no'</h6>

	<c:forEach items="${wrapper.questions}" varStatus="i">
		<div class="row">
		<c:out value="${wrapper.questions[i.index].question}"/>
		<form:input path="questions[${i.index}].answer" type="text"/>
		</div>
	</c:forEach>
	<br>
	<div class="row button">
		<button>submit</button>
	</div>
</form:form>

</body>