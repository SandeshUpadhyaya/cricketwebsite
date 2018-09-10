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
#security{
border: 2px solid red;
    border-radius: 12px;
  }
</style>
</head>
<body>
<form action="Security" method="post">
<div class="center">
<div class="center" id="security" style="border:thin solid black" >
  <h1><center> WELCOME TO SECURITY DATABASE </center></h1>
<h2>${fail }</h2>
<h2>${success }</h2>
<center><input type="text" id="scclass" name="scclass" placeholder="Enter security class" required></center>
<br/>
  <center><input type="text" id="tttype" name="tttype" placeholder="Enter ticket type" required></center>
  <br/>
  <center>Enter security strength for the class<input type="number" id="sccount" name="sccount" placeholder="Enter number of security in class" required></center>
  <br/>
  <center>Enter match number <input type="number" id="mmmno" name="mmmno" placeholder="Enter Match number" required></center>
  <br/>
  <center><input type="reset" value="Reset">
<input type="submit" value="Submit"></center>

</div>
</div>
<span><a href="SecurityRetrieve.jsp">Click here</a> to see security database</span>
</form>
</body>
</html>
