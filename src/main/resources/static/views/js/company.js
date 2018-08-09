$(document).ready(function(){
	
	
//	--------------  Validation  -----------------
	function validation(){
	
		var cname = $.trim($('#cname').val());
		var cemail = $.trim($('#cemail').val());
		var caddress = $.trim($('#caddress').val());
		var cphone = $.trim($('#cphone').val());
		var cfax = $.trim($('#cfax').val());
		var cwebsite = $.trim($('#cwebsite').val());
		var clogo = $.trim($('#clogo').val());
		
		if(cname == ""){
			$("ercname").text("Please Enter a Name");
			return false;
		}else if(cemail == ""){
			$("ercemail").text("Please Enter an Email");
			return false;
		}else if(caddress == ""){
			$("eraddress").text("Please Enter an Address");
			return false;
		}else if(cphone == ""){
			$("ercphone").text("Please Enter a Phone Number");
			return false;
		}
		
		return true;
		
	}

//	------------------  Validation  --------------------
	
	$("#createcompany").click(function(event){
		if(validation()){
			var data = {};
			
			data["caId"] = $.trim($("#headid").val());
			data["caName"] = $.trim($("#headname").val());
			data["caParent"] = $.trim($("#parent").val());
			data["caType"] = $.trim($("#type").val());
			
			$.ajax({
				type: "POST",
				url: "/saveCompany",
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
		alert("Clicked");
	});
	
});