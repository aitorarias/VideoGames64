<?php
include "./conexion.php";

$id=$_POST['id'];
$producto=$_POST['producto'];
$precio=$_POST['precio'];
$fabricante=$_POST['fabricante'];

$consulta = "UPDATE producto SET producto = '".$producto."', precio = '".$precio."', fabricante = '".$fabricante."' WHERE id = '".$id."'";

mysqli_query($conexion, $consulta) or die (mysqli_error());
mysqli_close($conexion);

?>
