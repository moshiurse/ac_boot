$(document).ready(function(){
	
	
//	--------------  Validation  -----------------
	function validation(){
	
		var cname = $.trim($('#cname').val());
		var cemail = $.trim($('#cemail').val());
		var caddress = $.trim($('#caddress').val());
		var cphone = $.trim($('#cphone').val());
		var cfax = $.trim($('#cfax').val());
		var cwebsite = $.trim($('#cwebsite').val());

        var pattern = /^\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b$/i;
		
		if(cname == ""){
            $('#cname').addClass("invalid");
            $('#cname').removeClass("valid");
			$(".errormsg").text("Please Enter a Name");
			return false;
		}else if(cemail == ""){
            $('#ceamil').addClass("invalid");
            $('#ceamil').removeClass("valid");
			$(".errormsg").text("Please Enter an Email");
			return false;
		}else if(!pattern.test(cemail)){
            $('#ceamil').addClass("invalid");
            $('#ceamil').removeClass("valid");
            $(".errormsg").text("Please Enter a Valid Email");
            return false;
        }else if(caddress == ""){
            $('#caddress').addClass("invalid");
            $('#caddress').removeClass("valid");
			$(".errormsg").text("Please Enter an Address");
			return false;
		}else if(cphone == ""){
            $('#cphone').addClass("invalid");
            $('#cphone').removeClass("valid");
			$(".errormsg").text("Please Enter a Phone Number");
			return false;
		}else{
            alert("Validation True");
            return true;
		}
	}

//	------------------End Validation  --------------------
	
	$("#createcompany").click(function(event){
		if(validation()){
			var data = {};

			data["companyName"] = $.trim($('#cname').val());
			data["companyAddress"] = $.trim($('#caddress').val());
			data["companyEmail"] = $.trim($('#cemail').val());
			data["companyPhone "] = $.trim($('#cphone').val());
			data["companyFax"] = $.trim($('#cfax').val());
			data["companyWebsite"] = $.trim($('#cwebsite').val());

			alert(JSON.stringify(data));
			$.ajax({
				type: "POST",
				url: "/company/save",
				data: JSON.stringify(data),
				contentType: "application/json; charset=utf-8",
				success: function(){
					alert("Successfully Created Company");
					window.location.replace("/companycreated");
				},
				error: function(){
                    $("#errormsg").text("Failed to create company");
					// alert("Error" +JSON.stringify(data));
				}
			});
			
		}
	});
	
});