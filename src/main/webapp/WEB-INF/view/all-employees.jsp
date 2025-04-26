<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Employee List</title>
  <style>
    table {
      border-collapse: collapse;
      width: 60%;
      margin: 20px auto;
    }
    th, td {
      border: 1px solid #aaa;
      padding: 8px;
      text-align: left;
    }
    th {
      background-color: #eee;
    }
  </style>
</head>
<body>
    <h2>All Employees</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Department</th>
                <th>Salary</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employee" items="${employees}">
                <!-- Corrected c:url example for reference -->
                <!-- 
                <c:url var="employeeUrl" value="employee">
                    <c:param name="id" value="${employee.id}" />
                </c:url>
                -->
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.surname}</td>
                    <td>${employee.department}</td>
                    <td>${employee.salary}</td>
                    <td>
                        <a href="updateEmployee?id=${employee.id}">
                            <button>Update</button>
                        </a>
                        <a href="deleteEmployee?id=${employee.id}" onclick="return confirm('Are you sure you want to delete this employee?');">
                            <button>Delete</button>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="addNewEmployee">Add New Employee</a>
</body>
</html>
