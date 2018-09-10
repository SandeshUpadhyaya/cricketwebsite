<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Squad Database</title>
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
#squad{
border: 2px solid red;
    border-radius: 12px;
  }
</style>
</head>
<form action="Squad" method="post">
<div class="center">
<div class="center" id="squad" style="border:thin solid black" >
  <h1><center> WELCOME TO SQUAD DATABASE </center></h1>
<h2>${fail }</h2>
<h2>${success }</h2>
<center><input type="text" id="ttname" name="ttname" placeholder="Enter team name" required></center>
<br/>
  <center><input type="text" id="pname" name="pname" placeholder="Enter player name" required></center>
  <br/>
  <center><input type="text" id="specialization" name="specialization" placeholder="Enter Specialization" required></center>
  <br/>
  <center>Enter player age: <input type="number" id="page" name="page" placeholder="Enter player age" required></center>
  <br/>
  <center><input type="reset" value="Reset">
<input type="submit" value="Submit"></center>

</div>
</div>
</form>
<span><a href="SquadRetrieve.jsp">Click here</a> to see squad database</span>
</body>
</html>
