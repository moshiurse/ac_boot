<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/views/js/chaartofaccount.js"></script>
<link href="views/css/common.css" rel="stylesheet"></link>
<link href="views/css/chaartofaccount.css" rel="stylesheet"></link>

<script type="text/javascript">

	$(document).ready(function(){
		getAccCaGroups();
		//viewData();
		function validator(){
			var caLevel =$.trim($("#controlllevel").val());
			var accgroup	= $.trim($("#accgroup").val());
			var accsubgroup	= $.trim($("#acccasubgroup").val());
			var controlhead	= $.trim($("#cHead_1").val());
			var subcontrolhead	= $.trim($("#cHead_2").val());
			var subsubcontrolhead	= $.trim($("#cHead_3").val());
			var controlheadname	= $.trim($("#controlheadname_1").val());
			var subcontrolheadname	= $.trim($("#controlheadname_2").val());
			var subsubcontrolheadname	= $.trim($("#controlheadname_3").val());
			alert(controlhead);
			if(accgroup == ""){		
		   	 	$("#errorMessage").html("Please Select Acc Group.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			} 
			else if(accsubgroup == ""){		
		   	 	$("#errorMessage").html("Please Select Acc Sub Group.");
		   	    $("#errorMessage").removeClass("hidden");
		   	 	
		   	    
		   	    $("#successMessage").addClass("hidden");	         	      	 
		        return false;		                
			} else if(caLevel == 1){
				if(controlhead == ""){		
			   	 	$("#errorMessage").html("Please Enter Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		                
				}
				else if(controlheadname == ""){		
			   	 	$("#errorMessage").html("Please Enter Controlhead name.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		                
				}
			} else if(caLevel == 2){
				if(controlhead == ""){		
			   	 	$("#errorMessage").html("Please Enter Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		                
				}
				else if(controlheadname == ""){		
			   	 	$("#errorMessage").html("Please Enter Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		                
				}
				else if(subcontrolhead == ""){		
			   	 	$("#errorMessage").html("Please Enter Sub Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		                
				}
				else if(subcontrolheadname == ""){		
			   	 	$("#errorMessage").html("Please Enter Sub Controlhead Name.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		                
				}
				
			} else if(caLevel == 3){
				//alert("in 3");
				if(controlhead == ""){
					
			   	 	$("#errorMessage").html("Please Enter Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;	
			        
			        
				} else if(controlheadname == ""){
					
			   	 	$("#errorMessage").html("Please Enter Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;	
			        
			        
				} else if(subcontrolhead == ""){		
					
			   	 	$("#errorMessage").html("Please Enter Sub Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;	
			        
			        
				} else if(subcontrolheadname == ""){		
					
			   	 	$("#errorMessage").html("Please Enter Sub Controlhead Name.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		
			        
				} else if(subsubcontrolhead == ""){		
			   	 	
					$("#errorMessage").html("Please Enter Sub Sub Controlhead Name.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;	
			        
				} else if(subsubcontrolheadname == ""){		
			   	 	
					$("#errorMessage").html("Please Enter Sub Sub Controlhead.");
			   	    $("#errorMessage").removeClass("hidden");
			   	 	
			   	    
			   	    $("#successMessage").addClass("hidden");	         	      	 
			        return false;		                
				} 
					
			}
			
			return true;
			
			
			
	}
		
		$("#submit").click(function(event) {		
			
			//event.preventDefault();
			
			
			if(validator()){	
				var data = [];			
				
				var caLevel =$.trim($("#controlllevel").val());
				alert("control Level value:"+caLevel);
				
				 for(var i = 1; i <= caLevel; i++){
					var element = {caId:[],caName:[],casgId:[],caComid:[],caParent:[],caLevel:[],display:[]};
					element["caId"] = $("#cHead_" + i).val();
					element["caName"] = $("#controlheadname_" + i).val();
					element["casgId"] = $("#acccasubgroup").val();
					element["cacomId"] = 1;
					
					if(i ==1){
						element["caParent"] = null;
					} else if(i == 2){
						element["caParent"] = $("#cHead_1").val();
					} else if(i == 3){
						element["caParent"] = $("#cHead_2").val();
					}
					element["caLevel"] = i;
					element["display"]=1;
					alert(JSON.stringify(element));
					data.push(element);
				}
				 
				 $.ajax({
		             type: "POST",
		             url: "saveChartOfAccounts",
		             data: JSON.stringify(data),
		             contentType: "application/json; charset=utf-8",             
		             success: function (successData) {
		            	alert("Data inserted");
		            	 
		             	$("#submit").prop("disabled", false);			                 
		                $("#successMessage").html(successData); 
		                $("#successMessage").removeClass("hidden");
		                $("#errorMessage").addClass("hidden");
		                      
		             },
		             error: function (error) {
		            	 $("#errorMessage").html("Error: Record Not Saved");
		            	 $("#errorMessage").removeClass("hidden");
		                 $("#submit").prop("disabled", false);
		                 
		             }
				});
				
	
			} // End of validation		
			
		}); 
	
	
	}); //End of document ready()
		
	function showDiv(elem){
		if(elem.value==1){
			document.getElementById('div2_1').style.display ="none";
			document.getElementById('div2_2').style.display ="none";
			document.getElementById('div3_1').style.display ="none";
			
		}
		else if(elem.value==2){
			document.getElementById('div2_1').style.display ="none";
			document.getElementById('div2_2').style.display ="block";
			document.getElementById('div3_1').style.display ="none";
		}
		else{
			document.getElementById('div2_1').style.display ="none";
			document.getElementById('div2_2').style.display ="block";
			document.getElementById('div3_1').style.display ="block";
		}
	}
	function getAccCaGroups(){
		$.post("showAccCaGroups", function(data){
				//alert(JSON.stringify(data));
			  var select = '<select class="select form-control" id="accgroup" onchange="GetSubAccCaGroup(this.value);">';
			  select +='<option value="">Select</option>';
			  for(key in data)
				  {
				  select +='<option value="' +data[key].cagId+'">' +data[key].cagName +'</option>';
				  }
			  		select +='</option>';
				  $("#accgroupdiv").html(select);
				  
		});
	}
	
	function GetSubAccCaGroup(cagId){
		$.post("GetSubAccGroupbyGroupID",{cagId:cagId}, function(data){
			//alert(JSON.stringify(data));
			var selectSubacc = '<select class="select form-control" id="acccasubgroup" onchange="createhead();">';
			    selectSubacc += '<option value="0">Select</option>';
			for(key in data){
				selectSubacc += '<option value="'+data[key].casgId+'">' +data[key].casgName +'</option>';
			}
			selectSubacc += '</select>';
			$("#SubGroup").html(selectSubacc);
			document.getElementById('div2_1').style.display ="block";
			/* var auto = $("#controlllevel").val();
			if(auto == 1){
				auto = 1;
				controlhead(auto);
			}
			else if(auto == 2){
				auto = 2
				controlhead(auto);
			}
			else if(auto ==3){
				auto = 3;
				controlhead(auto);
			} */
		});
	}
	function createhead(){
		var acccasubgroup = $("#acccasubgroup").val();
		if(acccasubgroup != 0){
			var auto = $("#controlllevel").val();
			if(auto == 1){
				auto = 1;
				controlhead(auto);
			}
			else if(auto == 2){
				auto = 2
				controlhead(auto);
			}
			else if(auto ==3){
				auto = 3;
				controlhead(auto);
			}
		}
		else{
			$('#cHead_1').val('');
			$('#cHead_2').val('');
			$('#cHead_3').val('');
		}
	}
	
	function controlhead(auto){
		var Controlheadmax;
		var casgId = $("#acccasubgroup").val();
		$.post("getControlHeadMax",{casgId:casgId, cagId: $("#accgroup").val()} ,function(data){
			//alert(JSON.stringify(data));
			$('#cHead_1').val(data);
			
			if(auto >= 2){
				//alert(auto);
				subcontrolhead(auto);
			}
		});
		//alert(auto);
		
		
	}
	function subcontrolhead(auto){
		var casgId = $("#acccasubgroup").val();
		$.post("getSubControlHeadMax",{casgId:casgId, cagId: $("#accgroup").val(), caId:$("#cHead_1").val()} ,function(data){
			//alert(JSON.stringify(data));
			$('#cHead_2').val(data);
			if(auto == 3){
				subsubcontrolhead();
			}
		});
		//alert(auto);
		
		
	}
	function subsubcontrolhead(){
		var casgId = $("#acccasubgroup").val();
		$.post("getSubSubControlHead",{casgId:casgId, cagId: $("#accgroup").val(), caId:$("#cHead_2").val()} ,function(data){
			//alert(JSON.stringify(data));
			$('#cHead_3').val(data);
		});
	}
	function showControlhead(){
		var casgId = $("#acccasubgroup").val();
		var level = 1;
		$.post("showControlhead",{casgId:casgId} ,function(data){
			//alert(JSON.stringify(data));
		var dataTable = '<table class="table" id="accca"><tr><th><b>ID</th><th><b>NAME</b></th><th><b>Select</b></th></tr>';
			
			for(var key in data){
				dataTable += '<tr><td>' + data[key].caId + '</td><td>' + data[key].caName+'</td><td><input type="button" id="update" onclick="getValue(' + data[key].caId +","+level + ",'" + data[key].caName + "'" + ')" value="Select" class="update">'+'</td></tr>';
			}
			
			dataTable += '</table>';
			$("#datatable").html(dataTable);
		});
	}
	
	function showSubControlhead(){
		var caId = $("#cHead_1").val();
		var level = 2;
		$.post("showSubControlhead",{caId:caId} ,function(data){
			//alert(JSON.stringify(data));
		var dataTable = '<table class="table" id="accca"><tr><th><b>ID</th><th><b>NAME</b></th></tr>';
			
			for(var key in data){
				dataTable += '<tr><td>' + data[key].caId + '</td><td>' + data[key].caName+'</td><td><input type="button" id="update" onclick="getValue(' + data[key].caId +","+level + ",'" + data[key].caName + "'" + ')" value="Select" class="update">'+'</td></tr>';
			}
			
			dataTable += '</table>';
			$("#datatable").html(dataTable);
		});
	}
	function showSubSubControlhead(){
		var caId = $("#cHead_2").val();
		var level = 3;
		$.post("showSubSubControlhead",{caId:caId} ,function(data){
			//alert(JSON.stringify(data));
		var dataTable = '<table class="table" id="accca"><tr><th><b>ID</th><th><b>NAME</b></th></tr>';
			
			for(var key in data){
				dataTable += '<tr><td>' + data[key].caId + '</td><td>' + data[key].caName+'</td><td><input type="button" id="update" onclick="getValue(' + data[key].caId +","+level + ",'" + data[key].caName + "'" + ')" value="Select" class="update">'+'</td></tr>';
			}
			
			dataTable += '</table>';
			$("#datatable").html(dataTable);
		});
	}
	
	function getValue(id, level,name){
		if(level == 1){
			$("#cHead_1").val(id);
			$("#controlheadname_1").val(name);
		}
		
		else if(level == 2){
			$("#cHead_2").val(id);
			$("#controlheadname_2").val(name);
		}
		
		else if(level == 3){
			$("#cHead_3").val(id);
			$("#controlheadname_3").val(name);
		}

	
	}
	
</script>

</head>
<body>
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-8">
	
	<div class="card mx-auto text-center">
        <div class="card-header">
            <h1>Create Chart Of Account!</h1>
            <hr>
        </div>
        <div class="card-body text-center">
            <form action="">
            
            	<div class="form-group">
                	<label>Head Id </label>
                    <input required type="number" class="form-control form-control-lg" placeholder="Head ID" name="headid" id="headid">
                    <span class="error" id="erheadid"></span>
           		</div>
                <div class="form-group">
                	<label>Head Title</label>
                    <input required type="text" class="form-control form-control-lg" placeholder="Head name" name="headname" id="headname">
                    <span class="error" id="erheadname"></span>
                </div>
                
                <div class="form-group">
                	<label>Parent</label>
                	<select id="parent" class="form-control">
                	<option value="">Select Head</option>
                	<option value="">Assset</option>
                	<option>Owners Equity</option>
                	<option>Revenue</option>
                	<option>Expnse</option>
                	</select>
                    <span class="error" id="erparent"></span>
                </div>
                
                <div class="form-group">
                	<label>Type</label>
                	<select id="type" class="form-control">
                	<option value="">Select Type</option>
                	<option value="">Debit</option>
                	<option>Credit</option>
                	</select>
                    <span class="error" id="ertype"></span>
                </div>
                                      
                <input type="submit" class="btn btn-lg btn-acc" value="Create Head" id="createhead">
            </form>
        </div>
    </div>
	
	
	</div>
</div>

</body>
</html>