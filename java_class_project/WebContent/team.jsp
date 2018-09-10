<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Team Database</title>
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
#team,#team1{
border: 2px solid red;
    border-radius: 12px;
  }
</style>
</head>
<body>
<form method="post" action="Team" >
<div class="center">
<div class="center" id="team" style="border:thin solid black" >
  <h1><center> WELCOME TO TEAM DATABASE </center></h1>
<h2> ${fail }</h2>
<h2> ${success }</h2>
  <center><input type="text" id="tname" name="tname" placeholder="Enter Team name" required></center>
  <br/>
  <center><input type="number" id="raking" name="ranking" placeholder="Enter Ranking"required></center>
  <br/>
  <center><input type="text" id="sname" name="sname" placeholder="Enter Sponser name" required></center>
  <br/>
  <center><input type="text" id="coach" name="coach" placeholder="Enter coach name" required></center>
  <br/>
  <center><input type="reset" value="Reset">
<input type="submit" value="Submit"></center>
</div>
</div>
</form>
 
<span><a href="TeamRetrieve.jsp">Click here</a> to see team database</span>
</body>
</html>
