<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<html>

<head>
<style type="text/css">
.sticky {
    display: block;
    
    position: fixed;
    bottom: 0;
    left: 0;
    width: 100%;
    z-index: 20;
}

i {
	font-size: 50px;
	border-radius: 50px;
	
}

.social {
	display: block;
	top: 50%;
	left: 20%;
}

.footer {
	padding-top: 10px;
	background: #39567D;
}
</style>
</head>
</html>
	
<footer class="">
  <div class="container footer">
  
  <div class="row">
  <div class="col-md-3">
  
  <div class="form-group">
  	<input type="text" class="form-control" id="name" placeholder="Write Your Name"><br>
    <input type="text" class="form-control" id="email" placeholder="Write Your Email">
  </div>
  </div>
  <div class="col-md-4">
  	<div class="form-group">
    <textarea rows="4" class="form-control" id="text" placeholder="Write your query"></textarea>
  </div>
  </div>
  
  <div class="col-md-2">
  <input class="btn btn-primary d-block" type="submit" value="Contact Us" id="contact">
  </div>
  
  <div class="col-md-3">
  <div class="social text-center">
	  <a href=""><i class="fa fa-facebook"></i></a>
	  <a href=""><i class="fa fa-facebook"></i></a>
	  <a href=""><i class="fa fa-facebook"></i></a>
	  <a href=""><i class="fa fa-facebook"></i></a>
	  <a href=""><i class="fa fa-facebook"></i></a>
	
  </div>
    </div>
    
    </div>
  
  </div>
</footer>