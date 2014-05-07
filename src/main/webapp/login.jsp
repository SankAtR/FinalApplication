<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login with bootstrap</title>
<meta name="viewport" content="widt-h=device-width, initial-scale=1.0" />
<link href="resources/css/bootstrap.css" rel="stylesheet" />
<link href="resources/css/loginpage.css" rel="stylesheet" />
</head>
<body>
	<script type="text/javascript"
		src="//code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"
		type="text/javascript"></script>
	<script type="text/javascript" src="resources/js/bootstrap.js"></script>
	<script type="text/javascript" src="resources/js/mycustom.js"></script>
	<div id="container">
		<div class="div1">
			<div id="colorstrip">
				<div class="signupform">

					<form method="POST" id="loginform"
						action="<c:url value="/j_spring_security_check" />">


						<div class="formelements">
							
							<div>
								<input type="text" name="j_username" placeholder="UserName"
									required autofocus />
							</div>
							<div>
								<input type="checkbox" />Remember Me?
							</div>
							<div>
								<c:if test="${not empty param.error}">
									<font color="red"> Invalid Credentials. </font>
								</c:if>

							</div>
							
						</div>
						<div class="formelements">
							<div class="error"></div>
							<div>
								<input type="password" name="j_password" placeholder="Password"
									required />
							</div>
							<div>
								<a href="http//www.google.com">Forgot Password</a>
							</div>
						</div>
						<div class="formelements">
							<button type="submit" id="submitbutton">Sign in</button>
						</div>
					</form>
				</div>





			</div>



		</div>

		<div class="div2 rightstuff centralfromtop">







			<div class="">
				<div>
					<label><h2>Sign Up</h2></label>
				</div>
			</div>
			<div class="">
				<div>
					<label>Its Free</label>
				</div>

			</div>



			<div class=" signinyouupform">
				<form id="joinPmForm" method="post" action="signup.html?module=signup&action=signup">
					<div class="inlineformelements">
						<div>
							<input type="text" required placeholder="FirstName" id="fname" name="fname"></input>
						</div>
					</div>
					<div class="inlineformelements">
						<div>
							<input type="text" required placeholder="LastName" id="lname" name="lname"></input>
						</div>
					</div>

					<div class="pmformelemets">
						<input type="text" placeholder="EmailId" required id="emailId" name="emailId">
					</div>
					<div class="pmformelemets">
						<input type="text" placeholder="Re-Enter EmailId">
					</div>

<div class="pmformelemets">
<input type="password" required id="password" placeholder="password" name="password"/>
</div>
					<div class="pmformelemets">
						<p>
							BirthDay: <input type="text" id="datepicker" name="datepicker"/>
						</p>
					</div>
					<div class="pmformelemets">
						<input type="submit" value="SignUp" />
					</div>
				</form>


			</div>




			<!--  signup for ends -->









		</div>

	</div>

	<!-- div class="errors form-signin">
		<c:if test="${not empty param.error}">
			<font color="red"> Login error. <br /> Reason :
				${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</font>
		</c:if>
	</div>
	 -->
</body>
</html>