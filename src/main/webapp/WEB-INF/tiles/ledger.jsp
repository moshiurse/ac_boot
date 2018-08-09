<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="views/js/trialbalance.js"></script>
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/ledger.css" rel="stylesheet"></link>
</head>
<body>

<div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center card-lg">
        <div class="card-header">
            <h1>General Ledger</h1>
            <div class="row">
            <div class="col-md-3">
            <div class="form-group">
                    <input required type="date" class="form-control" 
                    placeholder="Start Date" name="startdate" id="startdate">
                </div>
                </div>
                <div class="col-md-3">
                <div class="form-group">
                    <input required type="date" class="form-control"
                     placeholder="Finish Date" name="enddate" id="enddate">
                </div>
                </div>
            <input type="submit" class="btn btn-lg btn-acc" value="Show" id="showledger">
            </div>
        </div>
        <div class="card-body">
            
 <table class="table table-bordered text-center">
    <thead>
      <tr>
        <th>ACC 101</th>
        <th colspan="2">CASH ON HAND</th>
        <th>Balance</th>
      </tr>
      <tr>
        <td></td>
        <td>Particular</td>
        <th>Debit</th>
        <th>Credit</th>
        <th> Debit Balance</th>
      </tr>
    </thead>
    <tbody>

      <tr>
        <td>1 September 14</td>
        <td>Cash</td>
        <td></td>
        <td></td>
        <td>$ 6000</td>
      </tr>
      <tr>
        <td>4 September 14</td>
        <td>
        Department<br>
        Account Head<br>
        Narration
        </td>
        <td>$ 5000</td>
        <td>$ 1000</td>
        <td>$ 10000</td>
      </tr>
      <tr>
        <td>5 September 14</td>
        <td>
        Department<br>
        Account Head<br>
        Narration
        </td>
        <td></td>
        <td>$ 2000</td>
        <td>$ 8000</td>
      </tr>
      
    </tbody>
  </table>       
  
  <table class="table table-bordered text-center">
    <thead>
      <tr>
        <th>ACC 130</th>
        <th colspan="2">PROD SELLS REVENUE</th>
        <th>Balance</th>
      </tr>
      <tr>
        <td></td>
        <th>Debit</th>
        <th>Credit</th>
        <th> Credit Balance</th>
      </tr>
    </thead>
    <tbody>

      <tr>
        <td>1 September 14</td>
        <td></td>
        <td></td>
        <td>$ 45000</td>
      </tr>
      <tr>
        <td>4 September 14</td>
        <td></td>
        <td>$ 4500</td>
        <td>$ 50000</td>
      </tr>
      <tr>
        <td>5 September 14</td>
        <td></td>
        <td>$ 5900</td>
        <td>$ 55900</td>
      </tr>
      
      <tr>
        <td>6 September 14</td>
        <td></td>
        <td>$ 1200</td>
        <td>$ 56100</td>
      </tr>
      
      <tr>
        <td>6 September 14</td>
        <td></td>
        <td>$ 1900</td>
        <td>$ 58000</td>
      </tr>
      
    </tbody>
  </table>       
  
  
 </div>
    </div>
	</div>
	
	<div class="col-md-2"></div>
</div>


</body>
</html>