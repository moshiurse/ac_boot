<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="views/js/trialbalance.js"></script>
<script type="text/javascript" src="/views/js/jspdf.min.js"></script>
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/trialbalance.css" rel="stylesheet"></link>
</head>
<body>

<div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-8">
	
	<div id="content">
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Daffodil Internation University</h1>
            <h3>Trial Balance</h3>
            <h3>December 31, 2017</h3>
            
          <div class="row">
            <div class="col-md-3">
            <div class="form-group">
            <label class="">Start Date</label>
                    <input required type="date" class="form-control" 
                    placeholder="Start Date" name="startdate" id="startdate">
                </div>
                </div>
                <div class="col-md-3">
                <div class="form-group">
                <label class="">End Date</label>
                    <input type="date" class="form-control"
                     placeholder="Finish Date" name="enddate" id="enddate" required>
                </div>
                </div>
            <input type="submit" class="btn btn-lg btn-acc" value="Show Trial Balance" id="showtrial">
            <input type="submit" class="btn btn-lg btn-acc" value="Download Pdf" id="pdf">
            
            </div>
            
        </div>
        <div class="card-body text-center">
    <div id="dataTable"></div>
    <table class="table table-bordered text-center">
    <thead>
      <tr>
        <th>Account Name</th>
        <th>Debit</th>
        <th>Credit</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Cash</td>
        <td>$ 1000</td>
        <td></td>
      </tr>
      <tr>
        <td>Account Recievable</td>
        <td>2500</td>
        <td></td>
      </tr>
      <tr>
        <td>Prepaid Building rent</td>
        <td>1000</td>
        <td></td>
      </tr>
      <tr>
        <td>Accumulated depreciation- equipment</td>
        <td></td>
        <td>$ 2500</td>
      </tr>
      <tr>
        <td>Notes Payable</td>
        <td></td>
        <td>1000</td>
      </tr>
      <tr>
        <td>Salary Payable</td>
        <td></td>
        <td>1000</td>
      </tr>
      <tr>
        <td>Totals</td>
        <td>$ 4500</td>
        <td>$ 4500</td>
      </tr>
    </tbody>
  </table>
        
</div>
    </div>
	</div>
	
	</div>
	<div class="col-md-2"></div>
</div>



</body>
</html>