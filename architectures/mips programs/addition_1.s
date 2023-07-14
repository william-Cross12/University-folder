# A Program to Add 10 to 10
	.data			# Data declaration section
result:	.asciiz "\n We Added 10 to 10 \n and the Result is: " #Memory location
	.text			# Text declaration section
main:				# Start of code section
	addi	$t0, $t0, 10	# Place immediate number 10 into t0 register 
	addi	$t1, $t1, 10	# Place immediate number 10 into t1 register
	add	$t3, $t0, $t1	# Add the contents of t1 to t0 and place the result in t3 
	li 	$v0, 4		# Load immediate number 4 into v0 register (Print String) 
	la 	$a0, result	# Load memory address labelled 'result' and place into a0 
	syscall			# System call to carry out operation
	li 	$v0, 1		# Load immediate number 1 into v0 register 
	move 	$a0, $t3	# Copy contents of register t3 to a0
	syscall			# System call to carry out operation
	li 	$v0, 10		# Load immediate number 10 into v0 register (10 ends program)
	syscall			# System call to carry out operation
# END OF PROGRAM