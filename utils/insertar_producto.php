<?php
include "./conexion.php";

$id=$_POST['id'];
$producto=$_POST['producto'];
$precio=$_POST['precio'];
$fabricante=$_POST['fabricante'];

$consulta = "INSERT INTO producto VALUES ('".$id."', '".$producto."', '".$precio."', '".$fabricante."')";

mysqli_query($conexion, $consulta) or die (mysqli_error());
mysqli_close($conexion);

?>
