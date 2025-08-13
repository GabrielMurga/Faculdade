.data
  nums: .int 3, -5, 7, 8, -2
  s1:   .string "%d\n"
   
.text
  .globl main
main:
  /* Prologo */
  pushq %rbp
  movq  %rsp, %rbp
  subq  $16, %rsp
  movq  %rbx, -8(%rbp)
  movq  %r12, -16(%rbp)

  /* Inicializa o ponteiro para nums */
  movq $nums, %r12

L1:
  /* Carrega o valor de nums */
  movl (%r12), %eax

  /* Verifica se o valor é negativo */
  cmpl $0, %eax
  jl L2
  
  /* Imprime o valor */
PRINT:
  movq $s1, %rdi
  movl %eax, %esi
  movl $0, %eax
  call printf

  /* Avança para o próximo inteiro */
  addq $4, %r12
  /* Checa se chegou ao fim do array */
  cmpq $nums_end, %r12
  jne L1

  jmp DONE

L2:
  /* Se necessário, lógica para valores negativos */
  jmp DONE

DONE:
  /* Finalizacao */
  movq -8(%rbp), %rbx
  movq -16(%rbp), %r12
  leave
  ret

  .data
  nums_end: .quad nums + 20  /* 20 bytes = 5 inteiros de 4 bytes */
