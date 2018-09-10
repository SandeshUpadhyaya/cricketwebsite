<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Ticket Database</title>
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
#ticket{
border: 2px solid red;
    border-radius: 12px;
  }
</style>
</head>
<body>
<form action="Tickets" method="post">
<div class="center">
<div class="center" id="ticket" style="border:thin solid black" >
  <h1><center> WELCOME TO TICKET DATABASE </center></h1>
  <h2>${fail}</h2>
  <h2>${success }</h2>
  <center><input type="text" id="ttype" name="ttype" placeholder="Enter ticket type" required></center>
  <br/>
<center>Match number <input type="number" id="mmno" name="mmno" placeholder="Enter Match Number" required></center>
<br/>

  <center>Tickets sold <input type="number" id="tsold" name="tsold" placeholder="Enter Tickets Sold" required></center>
  <br/>
  <center>Tickets Remaining<input type="number" id="trem" name="trem" placeholder="Enter Tickets Remaining" required></center>
  <br/>
  <center>Ticket price<input type="number" id="price" name="price" placeholder="Enter price" required></center>
  <br/>
  <center><input type="reset" value="Reset">
<input type="submit" value="Submit"></center>

</div>
</div>
</form>
<span><a href="TicketRetrieve.jsp">Click here</a> to see ticket database</span>
</body>
</html>
