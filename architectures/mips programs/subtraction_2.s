# A Program to Subtract 10 from 20
	.data			# Data declaration section
result:	.asciiz "\n We Subtracted 10 from 20 \n and the Result is: "
	.text			# Text declaration section
main:				# Start of code section
	addi 	$t0, $t0, 20	 
	addi 	$t1, $t1, 10	 
	sub 	$t3, $t0, $t1	# Subtract contents of t1 from t0 and place result in t3
	li 	$v0, 4
	la 	$a0, result
	syscall
	li 	$v0, 1
	move 	$a0, $t3
	syscall
	li 	$v0, 10
	syscall
# END OF PROGRAM