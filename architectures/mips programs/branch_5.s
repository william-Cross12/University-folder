# A Program to Count Up to 10
	.data			# Data declaration section
count:	.asciiz 	"\n Look, I can count to 10: "
end: 	.asciiz 	"\n Well done me!"
new: 	.asciiz 	"\n"
	.text			# Text declaration section
main:				# Start of code section
	addi 	$t0, $t0, 10
	addi 	$t1, $t1, 0
	li 	$v0, 4
	la 	$a0, count
	syscall
	li 	$v0, 4
	la 	$a0, new
	syscall
loop:	addi 	$t0, $t0, -1
	addi 	$t1, $t1, 1
	li 	$v0, 1
	move 	$a0, $t1
	syscall
	li 	$v0, 4
	la 	$a0, new
	syscall
	blez 	$t0, out	# Branch if t0 contents less than or equal to zero 
	b 	loop		# Branch always
out:	li 	$v0, 4
	la 	$a0, end
	syscall
	li 	$v0, 10
	syscall
# END OF PROGRAM