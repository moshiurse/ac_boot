<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/registration.css" rel="stylesheet"></link>
</head>
<body>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Register here!</h1>
            <img class="img-fluid" src="img/logo.jpeg" alt="logo">
        </div>
        <div class="card-body text-center">
            <form action="">
                <div class="form-group">
                	<label>Full Name </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Full Name" name="fullname" id="fullname">
                </div>
                
                <div class="form-group">
                	<label>Email </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Email" name="email" id="email">
                </div>
                
                <div class="form-group">
                	<label>Username </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Username" name="username" id="username">
                </div>
                
                <div class="form-group">
                <label>Password </label>
                    <input type="password" class="form-control form-control-lg" placeholder="Password" name="password" id="password"> 
                </div>
                
                <div class="form-group">
                <label>Confirm Password </label>
                    <input type="password" class="form-control form-control-lg" placeholder="Confirm Password" name="conpass" id="conpass">
                </div>
                
                <input type="submit" class="btn btn-lg btn-acc" value="Registration">
            </form>
        </div>
    </div>
	
	
	</div>
</div>


</body>
</html>