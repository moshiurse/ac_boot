<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/login.css" rel="stylesheet"></link>

</head>
<body>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Login Panel</h1>
            <hr>
        </div>
        <div class="card-body text-center">
            <form action="">
                <div class="form-group">
                    <input required type="text" class="form-control form-control-lg" placeholder="Username">
                </div>
                <div class="form-group">
                    <input required type="password" class="form-control form-control-lg" placeholder="Password">
                </div>
                
                <div class="form-group">
                    <select id="company" name="company" class="form-control">
                    <option>Select Company</option>
                    </select>
                </div>
                
                <div class="form-group">
                    <select id="finyear" name="finyear" class="form-control">
                    <option>Select Financial Year</option>
                    </select>
                </div>
                <div class="form-check text-center">
                    <input type="checkbox" class="form-check-input" id="check">
                    <label class="form-check-label" for="check" >Remember me</label>
                </div>

                <input type="submit" class="btn btn-lg btn-acc" value="Log In">
            </form>
        </div>
    </div>
	
	
	</div>
</div>

     
</body>

<script type="text/javascript" src="/views/js/login.js"></script>


</html>