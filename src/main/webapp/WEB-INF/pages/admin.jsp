<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Snag</title>

	<script src="applicationJS.js"></script>

</head>
<body style="text-align: center">

<form:form id="ad" action="/submitDB" method="POST" modelAttribute="admin">
	<h3>DB Access</h3>
	<%--<p>Name: <form:input id="name" type="text" path="user.username" value="" onkeypress="return validateAlpha()"/></p>--%>
	<%--<p>Email: <form:input type="email" path="user.email"/></p>--%>
	<%--<p>Phone: <form:input type="text" path="user.phone" value="" onkeypress="return isNumberKey(event)"/></p>--%>
	<%--<h3>Questions</h3> <h6 style="color:red">please enter a 'yes' or a 'no'</h6>--%>

	<c:forEach items="${admin.questions}" varStatus="i">
		<div class="col-sm-4">
		<p>Question</p><c:out value="${admin.questions[i.index].question}"/>
			<p>edit</p><form:input path="questions[${i.index}].question" value="" type="text"/>
			</div>
		<div class="col-sm-1"> -------- </div>
		<div class="col-sm-4">
		<p>Answer</p>
		<c:out value="${admin.questions[i.index].answer}"/>
			<p>edit</p><form:input path="questions[${i.index}].answer" value="" type="text"/>
		</div>
		<br>
	</c:forEach>
	<br>
	<div class="col-sm-5 button">
		<button>submit</button>
	</div>
</form:form>

</body>