<?php
	echo '<link rel="stylesheet" href="style.css">';
	$shippingMethod = array("7 day", "Overnight", "3 day");
	$shippingCost = array(0, 50, 5);
	
      $shipping = $_POST["shipOption"];
      $item1 = $_POST['item1'];
      $item2 = $_POST['item2'];
      $item3 = $_POST['item3'];
      $total = $item1 * 82.50 + $item2 * 19.69 + $item3 * 45.55 + $shippingCost[$shipping];
      echo '<table class="table" id="receipt"><tr><th></th><th> Quantity </th><th> Cost Per Item </th><th> Sub Total </th></tr>';
      echo '<tr><th>New Mens Casual Shoes</th><td>' . $item1 . '</td><td> 82.50</td><td>' . $item1 * 82.50 . '</td></tr>';
      echo '<tr><th>V-neck Casual Cardigan Sweater</th><td>' . $item2 . '</td><td> 19.69</td><td>' . $item2 * 19.69 . '</td></tr>';
      echo '<tr><th>Mens Harem pants</th><td>' . $item3 . '</td><td> 45.55 </td><td>' . $item3 * 45.55 . '</td></tr>';
      echo '<tr><th>Shipping</th><td>' . $shippingMethod[$shipping] . '</td><td>' . ' costs ' .$shippingCost[$shipping] . '</td></tr>';
      echo '<tr><th>Total Cost:</th><th>$' . $total . '</th></tr></form>';

?>
