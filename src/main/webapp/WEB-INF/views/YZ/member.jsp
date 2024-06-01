<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
	<meta name="generator" content="Hugo 0.112.5">
	<title>Login</title>
	<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/resources/css/layout.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/resources/js/color-modes.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="header"><div id="app_title">gw-springmvc-demo</div></div>
	<div id="navigation">${breadcrumb}</div>
	<div id="content">
        <main class="form-signin w-100 m-auto">
          <form:form modelAttribute="menuForm" name="dynamicalMemberForm"
                        action="${pageContext.request.contextPath}/YZ/menu.do" method="post">
                member
          </form>
        </main>
	</div>
	<div id="footer"></div>
</body>
</html>
