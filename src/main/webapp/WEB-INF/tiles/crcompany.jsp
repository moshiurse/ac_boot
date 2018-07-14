<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/crcompany.css" rel="stylesheet"></link>
</head>
<body> 

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create your Company</h1>
            <img class="img-fluid" src="img/logo.jpeg" alt="logo">
        </div>
        <div class="card-body text-center">
            <form action="">
                <div class="form-group">
                	<label>Company Name </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Company Name" name="companyname" id="companyname">
                </div>
                
                <div class="form-group">
                	<label>Company Address </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Company Address" name="comaddress" id="comaddress">
                </div>
                
                <div class="form-group">
                	<label>Phone </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Phone Number" name="phone" id="phone">
                </div>
                
                <div class="form-group">
                <label>Fax </label>
                    <input type="text" class="form-control form-control-lg" placeholder="fax" name="fax" id="fax"> 
                </div>
                
                <div class="form-group">
                <label>Website </label>
                    <input type="text" class="form-control form-control-lg" placeholder="Website" name="website" id="website">
                </div>
                
                <div class="form-group">
                <label>Upload a logo</label>
                    <input type="file" class="form-control" name="logo" id="logo">
                    <a href="#" class="btn btn-warning">Upload</a>
                </div>
                
                <input type="submit" class="btn btn-lg btn-acc" value="Create Company">
            </form>
        </div>
    </div>
	
	
	</div>
</div>


</body>
</html>