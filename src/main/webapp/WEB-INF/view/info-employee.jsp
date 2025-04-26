<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Employee</title>
</head>
<body>
    <h2>Add New Employee</h2>
    <form:form action="saveNewEmployee" modelAttribute="employee">
        <form:hidden path="id"  />
<%--        this hidden is optional --%>
        <table>
            <tr>
                <td>First Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><form:input path="surname" /></td>
            </tr>
            <tr>
                <td>Department:</td>
                <td><form:input path="department" /></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><form:input path="salary" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
    </form:form>
    <br>
    <a href="/">Back to Employee List</a>
</body>
</html>
