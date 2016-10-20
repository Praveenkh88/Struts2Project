<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Insert User Here</h1>

	<s:form action="insertBooks">
		
		<s:textfield name="user.username" label="Username" />
		<s:password  name="user.password" label="Password" />
		<s:textfield name="user.isEqual" label="Admin" />
		<s:textfield name="addr.city" 	label="city" />
		<s:textfield name="addr.country" label="country" />
		<s:textfield name="addr.pincode" label="pincode" />
	<s:submit />
	</s:form>

</body>
</html>