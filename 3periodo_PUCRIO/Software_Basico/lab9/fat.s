.text
.globl fat
fat:
# inicio
    pushq %rbp
    movq %rsp, %rbp
    movl %edi, %eax

# Definindo caso base
    cmpl $1, %eax
    jle L2

# Passo recursivo
    pushq %rdi
    subl $1, %edi
    call fat

    popq %rdi
              
    imull %edi, %eax
    jmp end

# Caso base
L2:
    movl $1, %eax

# Final
end:
    leave
    ret
