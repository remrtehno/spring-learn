<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details Form</title>
</head>
<body>
<form:form action="/spring_course/employee/show-employee-details" method="post" modelAttribute="employee">
    <label for="employee-name">Name:</label>
    <form:input path="employeeName" id="employee-name" required="true" />
    <form:errors path="employeeName" cssClass="error"/>

    <button type="submit">Submit</button>
</form:form>
</body>
</html>