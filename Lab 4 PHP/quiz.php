<?php

$pointCount = 0;

//question 1
echo "Question 1: " ;
$answer1 = $_POST["answer1"];
echo "Your answer is " . $answer1 . "<br>";
echo "Correct answer is A.";
if ($answer1 == A) {
    $pointCount ++;
    echo " Good job!" . "<br>" . "<br>";
} else {
	echo "<br>" . "<br>";
}

//question 2
echo "Question 2: ";
$answer2 = $_POST["answer2"];
echo "Your answer is " . $answer2 . "<br>";
echo "Correct answer is D.";
if ($answer2 == D) {
    $pointCount ++;
    echo " Good job!" . "<br>" . "<br>";
} else {
	echo "<br>" . "<br>";
}

//question 3
echo "Question 3: ";
$answer3 = $_POST["answer3"];
echo "Your answer is " . $answer3 . "<br>";
echo "Correct answer is C.";
if ($answer3 == C) {
    $pointCount ++;
    echo " Good job!" . "<br>" . "<br>";
} else {
	echo "<br>" . "<br>";
}

//question 4
echo "Question 4: ";
$answer4 = $_POST["answer4"];
echo "Your answer is " . $answer4 . "<br>";
echo "Correct answer is B.";
if ($answer4 == B) {
    $pointCount ++;
    echo " Good job!" . "<br>" . "<br>";
} else {
	echo "<br>" . "<br>";
}

//question 5
echo "Question 5: ";
$answer5 = $_POST["answer5"];
echo "Your answer is " . $answer5 . "<br>";
echo "Correct answer is D.";
if ($answer5 == D) {
    $pointCount ++;
    echo " Good job!" . "<br>" . "<br>";
} else {
	echo "<br>" . "<br>";
}


echo "Your total points: " . $pointCount . " /5";

?>
