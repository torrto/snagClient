<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Project Bark</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"></head>
<body style="text-align: center">

<form:form id="wrap" action="/submitForm" method="POST" modelAttribute="wrapper">
<div class="form-group">
	<p>Name: <form:input type="text" path="username" value=""/></p>
	<p>Email: <form:input type="email" path="email"/></p>
	<p>Phone: <form:input type="tel" placeholder="" path="phone"/></p>
	<p>Questions</p>

	<c:forEach items="${wrapper.questions}" varStatus="i">
	<div class="col-sm-7">
			<%--<p>${wrapper.questions.question}</p>--%>
		<%--<form:input class="col-sm-12" path="questions[${i.index}].question" type="text"/>--%>
		<p>break</p>
		<form:input class="col-sm-12" path="questions[${i.index}].answer" type="text"/>
	</div>
	</c:forEach>


	<button>submit</button>

</form:form>

</body>