<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/cropbalance.css" rel="stylesheet"></link>
</head>
<body>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create Opening Balance</h1>
           	<hr>
        </div>
        <div class="card-body text-center">
            <form action="">
                <div class="form-group">
                	<label>Financial Year Id </label>
                    <input required type="text" class="form-control form-control-lg" placeholder="Fianancial Year Id" name="finyearid" id="finyearid">
                </div>
                
                <div class="form-group">
                	<label>Account Head</label>
                    <input required type="text" class="form-control form-control-lg" placeholder="Account Head" name="acchead" id="acchead">
                </div>
                
                <div class="form-group">
                	<label>Project </label>
                    <input required type="text" class="form-control form-control-lg" placeholder="Project" name="project" id="project">
                </div>
                
                <div class="form-group">
                <label>Balance</label>
                    <input required type="number" class="form-control form-control-lg" placeholder="Balance" name="balance" id="balance"> 
                </div>
                
                <div class="form-group">
                <label>Currency </label>
                    <input required type="number" class="form-control form-control-lg" placeholder="Currency" name="currency" id="currency">
                </div>
                
                <input type="submit" class="btn btn-lg btn-acc" value="Create Opening Balance">
            </form>
        </div>
    </div>
	
	
	</div>
</div>


</body>
</html>