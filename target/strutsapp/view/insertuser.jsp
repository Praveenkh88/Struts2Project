<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Insert User Here</h1>

	<s:form action="/insertUser">
		
		<s:textfield name="username" label="Username" />
		<s:password  name="password" label="Password" />
		<s:textfield name="isEqual" label="Admin" />
		<s:textfield name="addr.city" label="city" />
		<s:textfield name="addr.country" label="country" />
		<s:textfield name="addr.pincode" label="pincode" />
		First Hobbby
		<s:textfield name="hobby1.hobbyname" label="hobbyname" />
		<s:textfield name="hobby1.hobbylove" label="hobbylove" />
		<s:textfield name="hobby1.hobbytime" label="hobbytime" />
		Second Hobby
		<s:textfield name="hobby2.hobbyname" label="hobbyname" />
		<s:textfield name="hobby2.hobbytime" label="hobbytime" />
		<s:textfield name="hobby2.hobbylove" label="hobbylove" /></br>
		<s:textfield name="cardtype" label="cardtype"/>
		this is not good
		<s:textfield name="friend1.friendname" label="friendname1" />
		<s:textfield name="friend1.friendstars" label="friendstars1" />
		<s:textfield name="friend2.friendname" label="friendname2" />
		<s:textfield name="friend2.friendstars" label="friendstars2" />
		<s:submit />
	</s:form>

</body>
</html>