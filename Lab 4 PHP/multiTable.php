<?php
echo "<table>";

  for ($r =1; $r < 101; $r++){
      echo"<tr>";

      for ($c = 1; $c < 101; $c++) {
            echo "<td> .$c*$r. "</td>";
      }
      echo "</tr>";

  }

        echo"</table>";

?>
