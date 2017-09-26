function myFunction(name, age) {

    var table = document.getElementById("tfoot");

    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);

    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    cell1.innerHTML = name;
    cell2.innerHTML = age;
}
var i = 0;
var t;
var j = 0

function clickbtn() {
    t = setInterval(createTable, 4000);

}

function createTable() {
    console.log(user.length)
    if (user.length > 0) {

        myFunction(user[j].name, ageVerify(user[j].age));

        //user.splice(0, 1);
        j++;
        i++;
    } else {
        clearInterval(t);
    }
}

function ageVerify(age) {
    var rage = "" + age;
    var res = rage.split("").reverse().join("");
    console.log(res);
    return res;
}

var user = [
    { name: "Raj", age: 25 },
    { name: "Raju", age: 36 },
    { name: "rajiv", age: 43 },
    { name: "ranjan", age: 18 }
]

/* 
// To Add more User
var user1 = user[0];
user.push(user1); */

var text = '';
for (var a = 0; a < user.length; a++) {
    text = text + "<tr><td>" + user[a].name + "</td><td>" + user[a].age + "</td></tr>";
    text.innerHTML;
}
document.getElementById("tbody").innerHTML = text;