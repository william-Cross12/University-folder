# A Program to Multiply 10 by 10
	.data			# Data declaration section
result:	.asciiz "\n We Multiply 10 by 10 \n and the Result is: "
	.text			# Text declaration section
main:				# Start of code section
	addi $t0, $t0, 10
	mult $t0, $t0		# Multiply t0 by t0
	mfhi $t1		# Move contents of Hi register to t1
	mflo $t2		# Move contents of Lo register to t2
	li $v0, 4
	la $a0, result
	syscall
	li $v0, 1
	move $a0, $t2
	syscall
	li $v0, 10
	syscall
# END OF PROGRAM 