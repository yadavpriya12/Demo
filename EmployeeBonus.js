function emp()
{

let bonus;

let arr=[1000,2000,3000,4000,5000]
let arr1=[]
for(let a of arr)
{
    bonus=a*10/100
    arr1.push(bonus+a)
}
document.writeln(arr1)
}

emp()