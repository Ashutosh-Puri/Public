<?php 
 print <<< FORM
     <form method="post">
      1 st Number : <input type="text" name="fno" > <br>
      2 nd Number : <input type="text" name="sno" > <br>
      <input type="submit" name="mod" value="MOD">
      <input type="submit" name="pow" value="POW">
      <input type="submit" name="sum" value="SUM  1">
      <input type="submit" name="fact" value="FACT 2">
     </form>
FORM ;

$a=$_POST['fno'];
$b=$_POST['sno'];
global $r;
 if(isset($_POST['mod']))
 {
    $r=fmod($a,$b);
 }
 if(isset($_POST['pow']))
 {
    $r=pow($a,$b);
 }
 if(isset($_POST['fact']))
 {
    $r=fact($b);
 }
if(isset($_POST['sum']))
 {
    $r=sum($a);
 }

 function fact($b)
 {
    $f = 1;
    for ($i = 1; $i <= $b; $i++)
    {
      $f = $f * $i;
    }
    return $f;
 }
 function sum($a)
 {
    $s=0;
    for ($i = 1; $i <= $a; $i++)
    {
      $s = $s + $i;
    }
    return $s;
 }
 echo "Result :".$r;
?>
