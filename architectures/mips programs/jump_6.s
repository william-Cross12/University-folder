# A Program that Calls a Function
	.data			# Data declaration section
enter:	.asciiz "\n Please Enter a Number: "
result: .asciiz "\n The result of adding the two numbers together is: "
	.text			# Text declaration section
main:				# Start of code section	
	jal userent		# Jump to address labelled 'userent'
	move $t1, $t0	
	jal userent
	move $t2, $t0
	add $t3, $t1, $t2
	li $v0, 4
	la $a0, result
	syscall	
	li $v0, 1
	move $a0, $t3
	syscall	
	li $v0, 10
	syscall
userent: 
	li $v0, 4
	la $a0, enter
	syscall	
	li $v0, 5
	syscall	
	move $t0, $v0	
	jr $ra			# Jump to contents of return address register
# END OF PROGRAM 