<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/views/js/registration.js"></script>
<link href="views/css/registration.css" rel="stylesheet"></link>
</head>
<body>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">

	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Register here!</h1>
            <hr>
        </div>
        <div class="card-body text-center">
            <form action="">
                <H3 class="bg-danger" id="errormsg"></H3>
                <div class="form-group">
                	<label>Full Name </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Full Name" name="regfullname" id="regfullname">
                    <span class="error" id="erfullname"></span>
                </div>

                <div class="form-group">="
                	<label>Email </label>
                    <input type="email" class="form-control form-control-lg" placeholder="Email" name="regemail" id="regemail">
                    <span class="error" id="eremail"></span>
                </div>

                <div class="form-group">
                	<label>Username </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Username" name="regusername" id="regusername">
                    <span class="error" id="erusername"></span>
                </div>

                <div class="form-group">
                <label>Password </label>
                    <input type="password" class="form-control form-control-lg" placeholder="Password" name="regpassword" id="regpassword">
                    <span class="error" id="erpassword"></span>
                </div>

                <div class="form-group">
                <label>Confirm Password </label>
                    <input type="password" class="form-control form-control-lg" placeholder="Confirm Password" name="regconpass" id="regconpass" required>
                    <span class="error" id="erconpass"></span>
                </div>

                <input type="submit" class="btn btn-lg btn-acc" value="Registration" id="registration">
            </form>
        </div>
    </div>


	</div>
</div>



</body>
</html>