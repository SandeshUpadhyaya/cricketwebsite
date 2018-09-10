<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>

<style>
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn,.signupbtn {
    float: left;
    width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>
<head>

</head>
<body background="images/background1.jpg">

<h2><center>WELCOME TO THE REGISTRATION PAGE</center></h2>

<form action="registration" style="border:1px solid #ccc" method="post" name="form1">
  <h3>${fail}</h3>
  <div class="container">
    <table>
      <tr>
         <td> Username </td>
         <td><label><input type="text" name="name" value="${name }"></label></td>
         <td><p color:"lightblue">${error['name'] } </p></td>
       </tr>
       <tr>
         <td> Password </td>
         <td><label><input type="password" name="passw" value="${passw }" id="myInput" onkeyup='CheckPasswordStrength(this.value);'></label></td>
         <td><p color:"lightblue">${error['passw'] } </p></td>
          <td><span id="password_strength"></span>
<script type="text/javascript">
    function CheckPasswordStrength(password) {
        var password_strength = document.getElementById("password_strength");
 
        //TextBox left blank.
        if (password.length == 0) {
            password_strength.innerHTML = "";
            return;
        }
 
        //Regular Expressions.
        var regex = new Array();
        regex.push("[A-Z]"); //Uppercase Alphabet.
        regex.push("[a-z]"); //Lowercase Alphabet.
        regex.push("[0-9]"); //Digit.
        regex.push("[$@$!%*#?&]"); //Special Character.
 
        var passed = 0;
 
        //Validate for each Regular Expression.
        for (var i = 0; i < regex.length; i++) {
            if (new RegExp(regex[i]).test(password)) {
                passed++;
            }
        }
 
        //Validate for length of Password.
        if (passed > 2 && password.length > 8) {
            passed++;
        }
 
        //Display status.
        var color = "";
        var strength = "";
        switch (passed) {
            case 0:
            case 1:
                strength = "Weak";
                color = "red";
                break;
            case 2:
                strength = "Good";
                color = "darkorange";
                break;
            case 3:
            case 4:
                strength = "Strong";
                color = "green";
                break;
            case 5:
                strength = "Very Strong";
                color = "darkgreen";
                break;
        }
        password_strength.innerHTML = strength;
        password_strength.style.color = color;
    }
</script></td>
       </tr>
       <tr>
         <td> Confirm Password </td>
         <td><input type="password" name="cpassw" value="${cpassw }"></td>
         <td><p color:"lightblue">${error['cpassw'] }
              <span id='message'></span>
               </p></td>
         
       </tr>
       <tr>
         <td> Age </td>
         <td><input type="text" name="age" value="${age }" ></td>
         <td><p color:"lightblue"> ${error['age'] }</p></td>
       </tr>
       <tr>
       <td> <input type="checkbox" onClick="myFunction()">Show Password </td>
       </table>

    <div class="clearfix">
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>
<span >If already an existing user  <a href="login.jsp">click here</a></span>

</body>
<script>
function myFunction() {
    var x = document.getElementById("myInput");
    console.log(x);
    if (x.type === 'password') {
    	
        x.type = 'text';
    } else {
        x.type = 'password';
    }
}
</script>
</html>
