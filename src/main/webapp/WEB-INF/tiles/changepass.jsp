<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<div class="row">
<h3 class="text-center">Change Password</h3>
<hr>
</div>

<div class="row">
<div class="col-md-4"></div>

<div class="col-md-8">

<div class="row">
<div class="form-group">
<div class="col-md-3">
<label for="crps">Current Password:</label> 
</div>
<div class="col-md-6">
<input required type="text" name="crps" id="crps" class="form-control">
</div>
<div class="col-md-3">
<p class="alert"></p>
</div>
</div>
</div>

<div class="row">
<div class="form-group">
<div class="col-md-3">
<label for="newps">New Password:</label> 
</div>
<div class="col-md-6">
<input required type="text" name="newps" id="newps" class="form-control">
</div>
<div class="col-md-3">
<p class="alert"></p>
</div>
</div>
</div>

<div class="row">
<div class="form-group">
<div class="col-md-3">
<label for="crps">Confirm Password:</label> 
</div>
<div class="col-md-6">
<input required type="text" name="cnps" id="cnps" class="form-control">
</div>
<div class="col-md-3">
<p class="alert"></p>
</div>
</div>
</div>

<div class="row">
<div class="form-group">
<div class="col-md-3"></div>
<div class="col-md-6 text-center">
<input type="submit" name="cngps" value="Change Password" id="cngpass" class="btn btn-success">
</div>
<div class="col-md-3">
<p class="alert"></p>
</div>
</div>
</div>

</div></div></div>
</body>
</html>