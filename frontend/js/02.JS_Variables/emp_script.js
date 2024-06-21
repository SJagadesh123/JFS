/*declare employee details*/
let empno = 101
let empName = 'Sandy'
let sal = 25000

console.log(empno+' | '+empName+" | "+sal) //old style - ES5
console.log(`${empno} | ${empName} | ${sal}`) //new style - ES6

console.log(document.getElementById('emp_details').innerHTML)
document.getElementById('emp_details').innerHTML = `Emp No: ${empno}<br>
   Name: ${empName}<br>Salary: ${sal}`