// ================= FLIGHT CRUD =================


// ADD FLIGHT

function addFlight(){

let flight={

flightName:document.getElementById("flightName").value,

source:document.getElementById("source").value,

destination:document.getElementById("destination").value,

price:document.getElementById("price").value

};


fetch("/flights",{

method:"POST",

headers:{

"Content-Type":"application/json"

},

body:JSON.stringify(flight)

})


.then(res=>res.json())

.then(()=>{

alert("Flight Added Successfully");

clearFlightForm();

loadFlights();

});

}




// LOAD FLIGHTS

function loadFlights(){


fetch("/flights")

.then(res=>res.json())

.then(data=>{


let rows="";


data.forEach(f=>{


rows+=`

<tr>

<td>${f.id}</td>

<td>${f.flightName}</td>

<td>${f.source}</td>

<td>${f.destination}</td>

<td>${f.price}</td>


<td>

<button onclick="editFlight(
${f.id},
'${f.flightName}',
'${f.source}',
'${f.destination}',
${f.price}
)">
Edit
</button>


<button onclick="deleteFlight(${f.id})">
Delete
</button>


</td>


</tr>

`;

});


document.getElementById("flightTable").innerHTML=rows;


});


}





// EDIT FLIGHT

function editFlight(id,name,source,destination,price){


document.getElementById("flightId").value=id;

document.getElementById("flightName").value=name;

document.getElementById("source").value=source;

document.getElementById("destination").value=destination;

document.getElementById("price").value=price;


}





// UPDATE FLIGHT

function updateFlight(){


let flight={


id:document.getElementById("flightId").value,

flightName:document.getElementById("flightName").value,

source:document.getElementById("source").value,

destination:document.getElementById("destination").value,

price:document.getElementById("price").value


};



fetch("/flights",{

method:"PUT",

headers:{

"Content-Type":"application/json"

},

body:JSON.stringify(flight)

})


.then(res=>res.json())

.then(()=>{


alert("Flight Updated Successfully");

clearFlightForm();

loadFlights();


});


}





// DELETE FLIGHT

function deleteFlight(id){


fetch("/flights/"+id,{

method:"DELETE"

})


.then(res=>res.text())

.then(data=>{


alert(data);

loadFlights();


});


}





// CLEAR FLIGHT FORM

function clearFlightForm(){


document.getElementById("flightId").value="";

document.getElementById("flightName").value="";

document.getElementById("source").value="";

document.getElementById("destination").value="";

document.getElementById("price").value="";


}





// ================= FLIGHT RECORD CRUD =================




// ADD RECORD

function addRecord(){


let record={


flightId:document.getElementById("flightIdRecord").value,

passengerName:document.getElementById("passengerName").value,

seatNo:document.getElementById("seatNo").value,

travelDate:document.getElementById("travelDate").value


};



fetch("/records",{

method:"POST",

headers:{

"Content-Type":"application/json"

},

body:JSON.stringify(record)

})


.then(res=>res.json())

.then(()=>{


alert("Record Added Successfully");

clearRecordForm();

loadRecords();


});


}






// LOAD RECORDS


function loadRecords(){


fetch("/records")

.then(res=>res.json())

.then(data=>{


let rows="";


data.forEach(r=>{


rows+=`

<tr>

<td>${r.id}</td>

<td>${r.flightId}</td>

<td>${r.passengerName}</td>

<td>${r.seatNo}</td>

<td>${r.travelDate}</td>


<td>


<button onclick="deleteRecord(${r.id})">

Delete

</button>


</td>


</tr>

`;


});


document.getElementById("recordTable").innerHTML=rows;


});


}





// DELETE RECORD


function deleteRecord(id){


fetch("/records/"+id,{

method:"DELETE"

})


.then(res=>res.text())

.then(data=>{


alert(data);

loadRecords();


});


}





// CLEAR RECORD FORM


function clearRecordForm(){


document.getElementById("recordId").value="";

document.getElementById("flightIdRecord").value="";

document.getElementById("passengerName").value="";

document.getElementById("seatNo").value="";

document.getElementById("travelDate").value="";


}





// LOGOUT

function logout(){

window.location="login.html";

}





// LOAD EVERYTHING WHEN PAGE OPENS

window.onload=function(){


loadFlights();

loadRecords();


};