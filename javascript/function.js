// const greet = (name) => "Hello, " + name + "!";
// const add = (a, b) => a + b;
// const iseven = (num) => num%2 === 0;
// const name = "Riya";
// const age = 21;
// console.log('Hello,my name is ${name} and I am ${age} years old.');
// Take an array of [10,20,30,40,98,3,51]
// 1. find out maximum number and minimum number 
// 2. find sum of the maximum and minimum
// 3. find difference between maximum and minimum
// note: without use of loop 

let arr = [10, 20, 30, 40, 98, 3, 51];

let max = Math.max(...arr);
let min = Math.min(...arr);
let sum = max + min;
let diff = max - min;

console.log("Maximum number:", max);
console.log("Minimum number:", min);
console.log("Sum of max and min:", sum);
console.log("Difference between max and min:", diff);
