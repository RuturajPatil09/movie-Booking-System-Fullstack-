var user = {
        username: "admin",
        mail: "securityboat@gmail.com",
        password: "securityboat"
    };



function checkPass(){
    var pass1 = document.getElementById('psw');
    var pass2 = document.getElementById('pswagain');
    var message = document.getElementById('confirmMessage');

    if(pass1.value!="" && pass1.value == pass2.value)
    {
        console
        document.querySelector(".registerbtn").disabled = false;
        pass2.style.backgroundColor = "#fff";
        message.style.color = "#087a08";
        message.innerHTML = "<i class='fa fa-check'> passwords match </i>";
        return true;
    }
    else{
        document.querySelector(".registerbtn").disabled = true;
        pass2.style.backgroundColor = "#ff0000";
        message.style.color = "#ed0b0b";
        message.innerHTML = "<i class='fa fa-close'> passwords does not match reenter the password correctly </i>";
        return false;
    }

}



/*function bookTicket(){
    
    const selectedSeats = document.querySelectorAll('input[name="seats"]:checked').length;
    
    if(selectedSeats==0)
    {
        alert(' You need to select the seats for booking !!!!!!!!!!!!!!  ');
        return;
    }
    else{
        alert(' Movie ticket booked');
        window.location.reload();
    }

}*/