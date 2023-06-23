# A Program to Divide 10 by 3
	.data			# Data declaration section
result:	.asciiz "\n We Divide 10 by 3 \n and the Result is: "
remain: .asciiz "\n Remainder: "
	.text			# Text declaration section
main:				# Start of code section
	addi $t0, $t0, 10
	addi $t1, $t1, 3	
	div $t0, $t1		# Divide the contents of t0 by t1 
	mfhi $t2
	mflo $t3	
	li $v0, 4
	la $a0, result
	syscall	
	li $v0, 1
	move $a0, $t3
	syscall	
	li $v0, 4
	la $a0, remain
	syscall	
	li $v0, 1
	move $a0, $t2
	syscall
	li $v0, 10
	syscall
# END OF PROGRAM