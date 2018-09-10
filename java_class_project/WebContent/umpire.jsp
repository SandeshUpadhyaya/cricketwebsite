<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Umpires Database</title>
</head>
<style>
input[type=text] {
    width: 30%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 2px solid;
    border-radius: 4px;
}

input[type=submit], input[type=reset] {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 16px 32px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
}
#umpire{
border: 2px solid red;
    border-radius: 12px;
  }
</style>
</head>
<body>
<form action="Umpire" method="post">
<div class="center">
<div class="center" id="umpire" style="border:thin solid black" >
  <h1><center> WELCOME TO UMPIRE DATABASE </center></h1>
<h2>${fail }</h2>
<h2>${success }</h2>

  <center><input type="text" id="uname" name="uname" placeholder="Enter Umpire name" required></center>
  <br/>
  <center><input type="number" id="rating" name="rating" placeholder="Enter Rating" required></center>
  <br/>
  <center>Enter umpire age: <input type="number" id="uage" name="uage" placeholder="Enter umpire age" required></center>
  <br/>
  <center><input type="reset" value="Reset">
<input type="submit" value="Submit"></center>

</div>
</div>
</form>
<span><a href="UmpireRetrieve.jsp">Click here</a> to see umpire database</span>
</body>
</html>
