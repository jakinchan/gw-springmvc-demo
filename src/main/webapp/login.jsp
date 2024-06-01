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
          <form:form modelAttribute="loginForm" name="dynamicForm"
                        action="${pageContext.request.contextPath}/login.do" method="post">
            <img class="mb-4" src="../assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
            <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

            <div class="form-floating">
              <input type="text" class="form-control" id="userId" >
              <label for="floatingInput">User ID</label>
            </div>
            <div class="form-floating">
              <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
              <label for="floatingPassword">Password</label>
            </div>

            <div class="form-check text-start my-3">
              <input class="form-check-input" type="checkbox" value="remember-me" id="flexCheckDefault">
              <label class="form-check-label" for="flexCheckDefault">
                Remember me
              </label>
            </div>
            <button class="btn btn-primary w-100 py-2" type="submit">ログイン</button>
            <p class="mt-5 mb-3 text-body-secondary">&copy; 2017–2024</p>
          </form>
        </main>
	</div>
	<div id="footer"></div>
</body>
</html>
