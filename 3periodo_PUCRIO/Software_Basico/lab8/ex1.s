.data
  s1: .string "ls -ls"

.text
  .globl main
main:
  /* prólogo */gy
    pushq %rbp
    movq  %rsp, %rbp

  /* coloque seu código aqui */
  
  /* Chamar a função system() */
    movq $s1, %rdi           # Coloca o endereço da string "ls -ls" no registrador %rdi (primeiro argumento)
    call system              # Chama a função system

  /* finalização */
    leave
    ret
