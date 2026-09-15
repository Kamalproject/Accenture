function validateForm(){
    var pass=document.getElementById("pass").value;
    var email=document.getElementById("email").value;
    var error=document.getElementById("error");
    if(!email.includes('@')){
        error.innerHTML="Email must contain @";
        
    }
    else if(pass.length<6){
        error.innerHTML="Password length should be greater then 6";
    }
}