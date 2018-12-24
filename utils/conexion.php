<?php

$hostname="localhost";
$database="examen_producto";
$username="root";
$password="";

$conexion = new mysqli($hostname, $username, $password, $database);
if ($conexion -> connect_errno){
    echo "error al conectar";
}

?>