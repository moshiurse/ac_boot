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
			$("#erheadid").val("Please Enter a Id");
			return false;
		}else if(headId <= 0){
			$("#erheadid").val("No Negetive value accepted");
			return false;
		}else if(headName == ""){
			$("#erheadname").val("Please Enter Head Name");
			return false;
		}else if(type == 0){
			alert("Plz select a type");
			return false;
		}else{
			return true;	
		}
		
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
				alert(JSON.stringify(data));
				
				$.ajax({
					type: "POST",
					url: "saveCa",
					data: JSON.stringify(data),
					contentType: "application/json; charset=utf-8",
					success: function(){
						$("#successmsg").removeClass("hidden");
						$("#errormsg").addClass("hidden");
						alert(JSON.stringify(data));
					},
					error: function(error){
						$("#errormsg").removeClass("hidden");
						$("#successmsg").addClass("hidden");
						alert(error);
						
					}
				});
		
				
			}
				
	});
	
	
//	-------------  Save Button Click ---------------- 
	
});