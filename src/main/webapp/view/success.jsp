<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>data inserted successfully</h1>
	userid:<s:property value="user.user_id" />
	username:<s:property value="user.username" />
	password:<s:property value="user.password" />
	Admin:<s:property value="user.isEqual"/>
	First Hobbby</br>
	<s:property value="addr.city" />
		<s:property value="addr.country"/>
		<s:property value="addr.pincode" />
		
		<s:property value="hobby1.hobbyvalue" />
		<s:property value="hobby1.hobbylove" />
		<s:property value="hobby1.hobbytime"  />
		Second Hobby</br>
		<s:property value="hobby2.hobbyvalue" />
		<s:property value="hobby2.hobbytime" />
		<s:property value="hobby2.hobbylove"/></br>
		card type:</br>
		<s:property value="idcard.cardtype"/>
		
		<s:property value="cardtype"/>
</body>
</html>