<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.css" />">

<style type="text/css">
@font-face {
	font-family: 'Glyphicons Halflings';
	src:
		url('<c:url value="/resources/fonts/glyphicons-halflings-regular.eot" />');
	src:
		url('<c:url value="/resources/fonts/glyphicons-halflings-regular.eot?#iefix" />')
		format('embedded-opentype'),
		url('<c:url value="/resources/fonts/glyphicons-halflings-regular.woff" />')
		format('woff'),
		url('<c:url value="/resources/fonts/glyphicons-halflings-regular.ttf" />')
		format('truetype'),
		url('<c:url value="/resources/fonts/glyphicons-halflings-regular.svg#glyphicons_halflingsregular" />')
		format('svg');
}

body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	max-width: 300px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading, .form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"], .form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap-responsive.css" />">
</head>
<body>
	<div class="container">
		<c:if test="${not empty error}">
			<div class="errorblock">
				Your login attempt was not successful, try again.<br /> Caused :
				${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</div>
		</c:if>

		<form class="form-signin"
			action="<c:url value='j_spring_security_check' />" method="POST">
			<h2 class="form-signin-heading">Autentifcare</h2>
			<input type="text" class="input-block-level"
				placeholder="Adresa de email" name="j_username" /> <input
				type="password" class="input-block-level" placeholder="Parola"
				name="j_password" />
			<button class="btn btn-large btn-primary" name="j_password"
				type="submit">Autentificare</button>
		</form>

	</div>
	<!-- /container -->
</body>
</html>