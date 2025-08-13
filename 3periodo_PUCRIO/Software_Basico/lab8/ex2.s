  .data
    nums:  .int 3, -5, 7, 8, -2       # Array de inteiros
    s1:    .string "%d\n"             # Formato para o printf

  .text
  .globl main
main:
  # Prólogo
  pushq   %rbp                       # Salva o valor do frame pointer anterior
  movq    %rsp, %rbp                 # Atualiza o frame pointer
  subq    $32, %rsp                  # Aloca espaço na pilha
  movq    %rbx, -8(%rbp)             # Salva %rbx
  movq    %r12, -16(%rbp)            # Salva %r12

  # Inicializando ponteiro para nums
  movq    $nums, %rbx                # Carrega o endereço de nums em %rbx
  movl    $0, %r12d                  # Inicializa contador i

loop:
  cmpl    $5, %r12d                  # Compara i com 5
  jge     fim_loop                   # Se i >= 5, sai do loop

  # Carrega o valor atual de nums[i] em %eax
  movl    (%rbx), %eax               # Carrega o valor apontado por %rbx em %eax

  # Chama a função filtro
  movl    $1, %edi                   # Define o limite (LIM) em %edi
  movl    %eax, %esi                 # Passa o valor de nums[i] em %esi
  call    filtro                     # Chama a função filtro

  # Chama printf
  movq    $s1, %rdi                  # Passa o endereço de s1 diretamente para %rdi
  movl    %eax, %esi                 # Coloca o valor filtrado em %esi
  call    printf                     # Chama printf

  # Incrementa o ponteiro para nums
  addq    $4, %rbx                   # Avança para o próximo elemento (4 bytes por inteiro)

  # Incrementa o contador i (substituindo incq)
  addq    $1, %r12                   # i++

  jmp     loop                       # Volta para o início do loop

fim_loop:
  # Finalização
  movq    -8(%rbp), %rbx             # Restaura %rbx
  movq    -16(%rbp), %r12            # Restaura %r12
  leave                              # Libera a pilha e retorna
  ret

filtro:
  # Prólogo da função filtro
  pushq   %rbp
  movq    %rsp, %rbp

  # Lógica da função filtro
  cmpl    %edi, %esi                 # Compara x (em %esi) com lim (em %edi)
  jge     ret_x                      # Se x >= lim, retorna x
  movl    $0, %eax                   # Se x < lim, retorna 0
  jmp     fim_filtro

ret_x:
  movl    %esi, %eax                 # Retorna x

fim_filtro:
  # Finalização da função filtro
  popq    %rbp
  ret
