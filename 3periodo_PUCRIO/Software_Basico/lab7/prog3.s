.data
S2:    .int 1    /* Variável que começa com 1 */
Sf:    .string "%d\n"
Sf2:   .string "\n"

.text
.globl main
main:

/********************************************************/
/* mantenha este trecho aqui e nao mexa - prologo !!!   */
  pushq   %rbp
  movq    %rsp, %rbp
  subq    $16, %rsp
  movq    %rbx, -8(%rbp)  /* guarda rbx */
  movq    %r12, -16(%rbp)  /* guarda r12 */
/********************************************************/

  movq  $S2, %r12  /* r12 = &S2 (endereço de S2) */

L1:
  movl  (%r12), %eax   /* eax = valor em S2 */
  cmpl  $11, %eax      /* Se o valor for 11, saia do loop */
  je  L2

  imull  %eax, %eax    /* Calcula o quadrado de %eax */

/*************************************************************/
/* este trecho imprime o valor de %eax (estraga %eax)  */
  movq    $Sf, %rdi    /* primeiro parâmetro (ponteiro) */
  movl    %eax, %esi   /* segundo parâmetro (inteiro) */
  movl    $0, %eax     /* limpa eax para a chamada de função */
  call    printf       /* chama a função da biblioteca */
/*************************************************************/

  /* Incrementa o valor em S2 */
  addl $1, (%r12)   /* Soma 1 ao valor armazenado em S2 */
  jmp  L1           /* Repete o loop */

L2:
/*************************************************************/
/* este trecho imprime o \n (estraga %eax)                  */
  movq    $Sf2, %rdi    /* primeiro parâmetro (ponteiro) */
  movl    $0, %eax      /* limpa eax para a chamada de função */
  call    printf        /* chama a função da biblioteca */
/*************************************************************/

/***************************************************************/
/* mantenha este trecho aqui e nao mexa - finalização!!!!      */
  movq    $0, %rax      /* rax = 0 (valor de retorno) */
  movq    -16(%rbp), %r12 /* recupera r12 */
  movq    -8(%rbp), %rbx  /* recupera rbx */
  leave
  ret
/***************************************************************/
