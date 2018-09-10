<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Schedule Database</title>
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
#schedule{
border: 2px solid red;
    border-radius: 12px;
  }
</style>
</head>
<body>
<form method="post" action="Schedule">
<div class="center">
<div class="center" id="schedule" style="border:thin solid black" >
  <h1><center> WELCOME TO SCHEDULE DATABASE </center></h1>
<h2>${fail }</h2>
<h2>${success }</h2>
<center><input type="text" id="t1" name="t1" placeholder="Enter team 1 name" required></center>
<br/>
  <center><input type="text" id="t2" name="t2" placeholder="Enter team 2 name" required></center>
  <br/>
  <center><input type="text" id="uuname" name="uuname" placeholder="Enter Umpire name" required></center>
  <br/>
  <center>Enter match date <input type="date" id="sdate" name="sdate" placeholder="Enter Match date" required></center>
  <br/>
  <center><input type="text" id="stadium" name="stadium" placeholder="Enter Stadium" required></center>
  <br/>
  <center><input type="reset" value="Reset">
<input type="submit" value="Submit"></center>

</div>
</div>
</form>
<span><a href="ScheduleRetrieve.jsp">Click here</a> to see ticket database</span>
</body>
</html>
