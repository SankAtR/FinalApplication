<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
<meta name="viewport" content="widt-h=device-width, initial-scale=1.0" />
<link href="resources/css/bootstrap.css" rel="stylesheet" />
<link href="resources/css/loginpage.css" rel="stylesheet" />
</head>
<body>
	<script type="text/javascript"
		src="//code.jquery.com/jquery-1.10.2.min.js"></script>
		<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js" type="text/javascript"></script>
	<script type="text/javascript" src="resources/js/bootstrap.js"></script>
	<script type="text/javascript" src="resources/js/mycustom.js"></script>
	<div id="container">

		<div class="centralstuff">
			<div>
				<label><h2>Sign Up</h2></label>
			</div>
		</div>
		<div class="centralstuff">
			<div>
				<label>Its Free</label>
			</div>

		</div>



		<div class="centralstuff signinyouupform">
			<form id="joinPmForm" method="post" action="">
				<div class="inlineformelements">
					<div>
						<input type="text" required placeholder="FirstName"></input>
					</div>
				</div>
				<div class="inlineformelements">
					<div>
						<input type="text" required placeholder="LastName"></input>
					</div>
				</div>

				<div class="pmformelemets">
					<input type="text" placeholder="EmailId">
				</div>
				<div class="pmformelemets">
					<input type="text" placeholder="Re-Enter EmailId">
				</div>

				<div class="pmformelemets">
					<p>
						BirthDay: <input type="text" id="datepicker"/>
					</p>
				</div>
				<div class="pmformelemets">
					<input type="button" value="SignUp" />
				</div>
			</form>


		</div>


	</div>
</body>
</html>