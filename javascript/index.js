console.log("hello world");
function add(){
}
add()
let a=10;
let b=20;
console.log(a+b);
console.log(2+2);
console.log(2+"2");
console.log(2+45+""+"3");

//array

let arr=[2,10,4,20,34]
for(let i=0; i<arr.length;i++){
    console.log(i); //index of array
    console.log(arr[i]); //prints the numbers in array
}
let rows = 5;
let pattern = "";

for (let i = 1; i <= rows; i++) {
  pattern += "*";          
  console.log(pattern);    
}
for (let i=5;i>=1;i++){
    pattern +="*";
    console.log(pattern);
}
