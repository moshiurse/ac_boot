<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="views/js/company.js"></script>
</head>
<body> 

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create your Company</h1>
            <hr>
        </div>
        <div class="card-body text-center">
            <form action="" method="post">
                <h3 class="bg-danger errormsg"></h3>
                <div class="form-group">
                	<label>Company Name </label>
                    <input required type="text" class="form-control form-control-lg"
                     placeholder="Company Name" name="cname" id="cname">
                     <span class="error" id="ercname"></span>
                </div>
                
                <div class="form-group">
                	<label>Company Email </label>
                    <input required type="text" class="form-control form-control-lg"
                     placeholder="Company Email" name="cemail" id="cemail">
                     <span class="error" id="ercemail"></span>
                </div>
                
                <div class="form-group">
                	<label>Company Address </label>
                    <input required type="text" class="form-control form-control-lg"
                     placeholder="Company Address" name="caddress" id="caddress">
                     <span class="error" id="ercaddress"></span>
                </div>
                
                <div class="form-group">
                	<label>Phone </label>
                    <input required type="number" class="form-control form-control-lg"
                     placeholder="Phone Number" name="cphone" id="cphone">
                     <span class="error" id="ercphone"></span>
                </div>
                
                <div class="form-group">
                <label>Fax </label>
                    <input type="text" class="form-control form-control-lg" 
                    placeholder="fax" name="cfax" id="cfax"> 
                    <span class="error" id="ercfax"></span>
                </div>
                
                <div class="form-group">
                <label>Website </label>
                    <input type="text" class="form-control form-control-lg"
                     placeholder="Website" name="cwebsite" id="cwebsite">
                     <span class="error" id="ercwebsite"></span>
                </div>
                
                <input type="submit" class="btn btn-lg btn-acc" 
                value="Create Company" id="createcompany">
            </form>
        </div>
    </div>
	
	
	</div>
</div>


</body>
</html>