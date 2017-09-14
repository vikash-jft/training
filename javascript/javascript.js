
// That is the program of create object first type and acess them all data avalaible in object. 

var person = {name:"vikash", age:25};
//document.getElementById("txt").innerHTML = "Name : " +person;
var txt= "";
for (var i in person){
    txt+=i+" ";
    document.getElementById("txt").innerHTML =txt;
}
// If you want to get all variables then you have to get like new variable name of for loop but you want to get all data //available in object then write like objectname[newVariablename]
// new variable is that who is define in the for loop.









//This is the second type of creating object and accessing their variables and data.
var txt = "";
var i;
//var txt;
var person = new Object();
    person.name = "vikash";
    person.age = 25;
//document.getElementById("txt").innerHTML = result;
    for (i in person) {
       txt += person[i] + " ";
    }
        document.write(txt);





//This is the third type of creating object and accessing their variables and data.
var i;
function datails(name,age,id)
{
    this.name=name;
    this.age=age;
    this.id=id;
}

var person1 = new datails("ram",25,101);

for(i in person1){
    document.write(person1[i] +" ");
}







// This is the way to break each character of the String.
var name = ["ram","shyam"];
var ch;
for(ch of name){
    document.write(ch +" ");
}





 
let recipeMap = new Map([
  ['cucumber', 500],
  ['tomatoes', 350],
  ['onion',    50]
]);

// iterate over keys (vegetables)
for(let vegetable of recipeMap.keys()) {
  alert(vegetable); // cucumber, tomateos, onion
}

// iterate over values (amounts)
for(let amount of recipeMap.values()) {
  alert(amount); // 500, 350, 50
}

// iterate over [key, value] entries
for(let entry of recipeMap) { // the same as of recipeMap.entries()
  alert(entry); // cucumber,50 (and so on)
}







//Iterate over the kay ,value and entries of the Object
var obj={
    "ram": 250,
    "shyam":200,
    "mohan":300
}
for(let k of Object.keys(obj)){
    document.write(k +" ");
}
for(let k of Object.values(obj)){
    document.write(k +" ");
}

for(let k of Object.entries(obj)){
    document.write(k +" ");
}



// Iteration over the Array
var arr=[
    'ram','shyam','mohan'
]
for (let i in arr){
    document.write(arr[i] +" ");
}






// w.a.p to create a object with the help of constructor and make key like name and salary and find out the total salary
var totalSalary=0;
var maximumSalary;
function person(name,salary) {
    this.name=name;
    this.salary=salary;
}
var users =[ 
    user1 = new person("rakesh",12500),
    user2 = new person("viresh",13500),
    user3 = new person("Bhuwan",14500)
]
function calculation(){
for(let i in users){
    totalSalary +=users[i].salary;
    document.write(users[i].salary+" ");
}
}
calculation();
document.write("Total Salary : "+totalSalary);
//document.write(user1.salary);







// Write a program to find sum of all number 1 to that number whose number is given by user like if User Entered 10 then //sum of 1 to 10 ( 1+2+3+4+5+6+7+8+9+10) is 55. 
function sumValue(n){
    if(n<=1){
        return 1;
    }
    return n +sumValue(n-1);

}
var no=parseInt(prompt("Enter a Number to calculate sum of 1 to that number"));
alert(sumValue(no));












