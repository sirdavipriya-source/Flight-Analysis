function signup(){

let user={

username:document.getElementById("username").value,

email:document.getElementById("email").value,

password:document.getElementById("password").value

};


fetch("/users/signup",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify(user)

})

.then(res=>res.json())

.then(data=>{

alert("Account Created Successfully");

window.location="login.html";

});

}



function login(){


let user={

email:document.getElementById("email").value,

password:document.getElementById("password").value

};



fetch("/users/login",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify(user)

})


.then(res=>res.text())


.then(data=>{


if(data=="SUCCESS"){

alert("Login Successful");

window.location="index.html";

}

else{

alert("Invalid Email or Password");

}


});


}