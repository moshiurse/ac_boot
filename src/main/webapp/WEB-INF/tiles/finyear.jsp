<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/crfinyear.css" rel="stylesheet"></link>
</head>
<body>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create financial year</h1>
            <hr>
        </div>
        <div class="card-body text-center">
            <form action="">
                <div class="form-group">
                	<label>Financial Year No </label>
                    <input required type="text" class="form-control form-control-lg" placeholder="Financial Year No" name="finyearno" id="finyearno">
                </div>
                
                <div class="form-group">
                	<label for="company">Company </label>
					  <select class="form-control" id="company">
					    <option>Acc</option>
					    <option>Bcc</option>
					    <option>Cdd</option>
					    <option>Dee</option>
					  </select>
                </div>
                
                <div class="form-group">
                	<label>Start Date </label>
                    <input required type="date" class="form-control form-control-lg" placeholder="Start Date" name="startdate" id="startdate">
                </div>
                
                <div class="form-group">
                <label>End Date </label>
                    <input required type="date" class="form-control form-control-lg" placeholder="End Date" name="enddate" id="enddate"> 
                </div>
                
                <input type="submit" class="btn btn-lg btn-acc" value="Create Financial Year">
            </form>
        </div>
    </div>
	
	
	</div>
</div>


</body>
</html>