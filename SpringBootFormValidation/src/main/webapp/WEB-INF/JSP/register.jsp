<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTER</title>
<style type="text/css">
.error{
color: red;
font-style: italic;
}

</style>
</head>
<body>
<h1>Register form</h1>
<form:form action="userregister" method="post" modelAttribute="user">
<div>
<form:label path="id">User Id: </form:label>
<form:input path="id"/>
<form:errors path="id" cssClass="error"></form:errors>
</div>
<div>
<form:label path="name">name: </form:label>
<form:input path="name"/>
<form:errors path="name" cssClass="error"></form:errors>
</div>
<div>
<form:label path="email">email : </form:label>
<form:input path="email"/>
<form:errors path="email" cssClass="error"></form:errors>
</div>
<div>
<form:label path="startDate">startDate : </form:label>
<form:input path="startDate" type="date"/>
<form:errors path="startDate" cssClass="error"></form:errors>
</div>
<div>
<form:label path="gender">select Gender : </form:label>

<form:radiobutton path="gender" value="female" label="Female"/>
<form:radiobutton path="gender" value="male" label="Male"/>

<form:errors path="gender" cssClass="error"></form:errors>
</div>
<input type="submit" value="register">
</form:form>
</body>
</html>