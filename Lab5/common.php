<?php 

    // These variables define the connection information for your MySQL database 
    $username = ""; 
    $password = ""; 
    $host = "mysql.eecs.ku.edu"; 
    $dbname = "vnguyen42"; 
    
        // Opens a connection to your database
        $conn = new mysqli("$host", "$username", "$password", "$dbname"); 
    
    if($conn->connect_error) { 
        die("Failed to connect to the database: " . $conn->connect_error);
    } 
    
    
    session_start(); 

    