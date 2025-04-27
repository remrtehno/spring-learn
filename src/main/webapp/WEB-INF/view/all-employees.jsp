<!DOCTYPE html>
<html>
<head>
    <title>Manager Dashboard</title>
</head>
<body>
<c:if test="${userRole == 'HR'}">
    <a href="hr">HR Dashboard</a>
</c:if>
<c:if test="${userRole == 'Manager'}">
    <a href="manager">Manager Dashboard</a>
</c:if>
// ...existing code...
</body>