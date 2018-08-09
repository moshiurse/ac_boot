$(document).ready(function(){
	
//	-----------  Called Function --------------
	showParent();
	
	
//	----------- End Called Function ------------
	
	
//	-------------  Show Parent Method ------------------
	function showParent(){
		
		$.post("showChartOfAccount", function(ca){
			
			var option = '<select id="parent" name="parent" class="form-control"><option value="0">Select Head</option>';
			
			for(var key in ca){
				option += '<option value="'+ca[key].caId+'"> '+ca[key].caName+'</option>';
			}
			
			option += '</select>';
			
			$("#cadiv").html(option);
		});
	}
	
//	-----------  End show parent --------------
	
//	------------ Validation Method  ------------------
	
	function validation(){
		
//		----------- Variable Declaration   ---------------
		var headId = $.trim($("#headid").val());
		var headName = $.trim($("#headname").val());
		var parent = $.trim($("#parent").val());
		var type = $.trim($("#type").val());
		
//		-------------  End Variable Declaration ---------------
	
		if(headId == ""){
			alert("head id required");
			return false;
		}else if(headingId <= 0){
			alert("id must be positive");
			return false;
		}else if(headName == ""){
			alert("heading name required");
			return false;
		}else if(type == 0){
			alert("Plz select a type");
			return false;
		}
		return true;
	}
	
	
//	------------ End Validation -------------
	
//	-------------  Save Button Click ---------------- 
	$("#createhead").click(function(){
		event.preventDefault();
			if(validation()){
				
				var data = {};
				data["caId"] = $.trim($("#headid").val());
				data["caName"] = $.trim($("#headname").val());
				data["caParent"] = $.trim($("#parent").val());
				data["caType"] = $.trim($("#type").val());
				
				
				$.ajax({
					type: "POST",
					url: "/saveCa",
					data: JSON.stringify(data),
					contentType: "application/json; charset=utf-8",
					success: function(){
						$("#successmsg").removeClass("hidden");
						$("#errormsg").addClass("hidden");
					},
					error: function(){
						$("#errormsg").removeClass("hidden");
						$("#successmsg").addClass("hidden");
						alert(JSON.stringify(data));
					}
				});
				alert("Successfull");
		
				
			}
				
	});
	
	
//	-------------  Save Button Click ---------------- 
	
});