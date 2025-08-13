.text
.globl addnum

addnum:
pushq %rbp
movq %rsp, %rbp

movl %edi ,%eax
addl %esi, %eax
addl %edx, %eax


leave
ret
