<?php
include "./conexion.php";

$id=$_POST['id'];


$consulta = "DELETE FROM producto WHERE id = '".$id."'";

mysqli_query($conexion, $consulta) or die (mysqli_error());
mysqli_close($conexion);

?>
