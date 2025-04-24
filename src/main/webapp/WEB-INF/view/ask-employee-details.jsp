<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details Form</title>
</head>
<body>
<form action="/spring_course/show-employee-details" method="post">
    <label for="employee-name">Name:</label>
    <input type="text" id="employee-name" name="employeeName" required>
    <br>
    <label for="employee-id">Employee ID:</label>
    <input type="text" id="employee-id" name="employeeId" required>
    <br>
    <label for="employee-department">Department:</label>
    <input type="text" id="employee-department" name="employeeDepartment" required>
    <br>
    <button type="submit">Submit</button>
</form>
</body>
</html>