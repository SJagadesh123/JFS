let empno = 101
let empName = 'Sunil Joseph'
let sal = 25000

/*function definition*/
function showEmpDetails()
{
  let emp_details = document.getElementById('dt')

  let data = `Emp No : ${empno} | ${typeof(empno)}<br>Name: ${empName} | ${typeof empName}<br>
  Salary: ${sal} | ${typeof sal}`

  emp_details.innerHTML = data
}