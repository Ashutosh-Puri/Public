
<?php 
 print <<< FORM
     <form method="post">
      Enter String : <input type="text" name="string" > <br>    
      <input type="radio" checked name="r" value="tcase" > Title Case  <br>
      <input type="radio" name="r" value="pad" > Pad * <br>
      <input type="radio" name="r" value="rsp" > Remove L Space <br>
      <input type="radio" name="r" value="vowel" > Vowels <br>
      <input type="radio" name="r" value="len" > Length <br>
      <input type="radio" name="r" value="rev" > Reverse <br>
      <input type="submit" name="submit" value="Submit" > 
     </form>
FORM ;

$s=$_POST['string'];

global $r;

 if($_POST['r']=="tcase")
 {
    $r=ucwords(strtolower($s)); 
 }

 if($_POST['r']=="pad")
 {
    $r=str_pad($s,strlen($s)+2,"*",STR_PAD_BOTH);
 }

 if($_POST['r']=="rsp")
 {
    $r=ltrim($s);
 }

if($_POST['r']=="rev")
 {
    $r=strrev($s);
 }

 if($_POST['r']=="len")
 {
    $r=len($s);
 }

 if($_POST['r']=="vowel")
 {
    $r=preg_match_all('/[aeiou]/i',$s,$m);
 }
function len($s)
{
    $i = 0;
    while (@$s[$i++] != NULL);
        $i--;
    return $i;
}


 echo "Result :".$r;
?>
