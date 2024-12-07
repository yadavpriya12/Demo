try
{
  let data = fs.readFileSync("F1.txt","utf8")
  console.log("data is successfully read")


  fs.writeFile("./Copy.txt",data)
  console.log("data is succesfully copied")

}
catch(err)
{
    console.log("Error is occured")
}