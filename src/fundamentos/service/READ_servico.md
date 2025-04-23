# Serviço - Escolha de Produto ou Plano de Telefone

## Descrição
Este é um programa simples em Java que permite ao usuário escolher entre dois serviços:
1. **Compra de Camisa** - O usuário informa o tamanho desejado.
2. **Escolha de Plano de Telefone** - O usuário seleciona um plano entre três opções disponíveis.

## Tecnologias Utilizadas
- **Java** - Linguagem de programação utilizada para desenvolver o programa.
- **Scanner** - Para capturar entradas do usuário.
- **Estruturas Condicionais** (`if-else`, `switch-case`) - Para fazer as escolhas do usuário.

## Como Executar o Programa
1. Olhe se tem o **Java** instalado no seu computador.
2. Copie o código-fonte para um arquivo chamado `Servico.java`.
3. Compile o programa utilizando o seguinte comando no terminal:
   ```bash
   javac Servico.java
   ```
4. Execute o programa:
   ```bash
   java Servico
   ```

## Funcionalidades
- O programa solicita que o usuário escolha entre "CAMISA" ou "TELEFONE".
- Se escolher **CAMISA**, o usuário deve informar o tamanho (P, M ou G) e recebe a descrição correspondente.
- Se escolher **TELEFONE**, o usuário deve selecionar um dos três planos disponíveis.
- Caso o usuário informe um valor inválido, o programa exibe uma mensagem de "SERVIÇO NÃO ENCONTRADO".

## Exemplo de Uso
### Entrada:
```
Digite qual serviço deseja acessar: CAMISA ou TELEFONE
CAMISA
Digite o tamanho da camisa que você quer (P, M, G):
M
```
### Saída:
```
Obrigado por comprar conosco!
```

---
**Autor:** *Ricardo*

