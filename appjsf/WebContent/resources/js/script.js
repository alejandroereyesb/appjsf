function validateName(cname) {
    
    var elem = cname.id;
    var name = document.getElementById(elem);
    var len = name.value.length;
     
    if(len < 4 ) {
        document.getElementById("mesg").textContent = "Nombre muy corto";
    }
    else {
        document.getElementById("mesg").textContent ="Nombre válido"
        name.value = name.value.toUpperCase();
    }
}

function validateEmail(data) {
	var elem = data.id;
    var email = document.getElementById(elem).value;
	
    if(/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(email)) {
        document.getElementById("mesg").textContent = "Email correcto";
    }
    else {
        document.getElementById("mesg").textContent ="Email  incorrecto. Introduce .com y @"
    }
}