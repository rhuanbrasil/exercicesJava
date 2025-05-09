
# Sistema de Gerenciamento de Funcionários

## Visão Geral
Este programa em Java foi projetado para gerenciar informações de funcionários, incluindo seu ID, nome e salário. Ele permite que os usuários insiram detalhes dos funcionários, apliquem aumentos salariais com base em uma porcentagem especificada para um ID de funcionário específico e exibam a lista de funcionários atualizada. O programa demonstra o uso de princípios de **Programação Orientada a Objetos (POO)**, **listas** e **loops** para lidar com dados dinâmicos de funcionários.

## Funcionalidades
- **Entrada de Tamanho Dinâmico**: Os usuários podem especificar o número de funcionários a serem registrados.
- **Gerenciamento de Dados de Funcionários**: Armazena detalhes dos funcionários, como ID, nome e salário, usando uma classe `Employee` personalizada.
- **Aumento de Salário**: Permite atualizações de salário para um funcionário específico por ID com uma porcentagem de aumento definida pelo usuário.
- **Validação de Entrada**: Verifica se o ID do funcionário é válido antes de aplicar alterações salariais.
- **Exibição da Lista**: Exibe a lista de funcionários com detalhes de salário formatados.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Conceitos de POO**: Encapsulamento (por meio da classe `Employee`), modularidade e abstração de dados.
- **Listas**: Utiliza `ArrayList` para armazenar e gerenciar objetos de funcionários de forma dinâmica.
- **Loops**: Implementa loops para coleta de entrada, validação e exibição de saída.
- **Scanner**: Gerencia entradas do usuário para operações interativas no console.

## Como Funciona
1. **Entrada do Tamanho da Lista**: O usuário especifica o número de funcionários a serem registrados.
2. **Entrada de Dados dos Funcionários**: Para cada funcionário, o usuário insere:
   - ID (inteiro)
   - Nome (string)
   - Salário (double)
3. **Solicitação de Aumento de Salário**:
   - O usuário insere um ID de funcionário para aplicar um aumento de salário.
   - Se o ID for válido, o usuário insere a porcentagem de aumento, e o salário é atualizado.
   - Se o ID for inválido, uma mensagem de erro é exibida.
4. **Exibição da Lista**: O programa exibe a lista de funcionários com ID, nome e salário formatado.

## Exemplo de Uso
### Entrada 1:
```
Digite o tamanho da lista: 2
Funcionário #1
ID: 333
Nome: MARIE BROWN
Salário: 3000
Funcionário #2
ID: 536
Nome: ALEX GREEN
Salário: 5000
Digite o ID do funcionário que receberá aumento: 736
ID inválido
Lista de funcionários:
333, MARIE BROWN, 3000.00
536, ALEX GREEN, 5000.00
```

### Entrada 2:
```
Digite o tamanho da lista: 1
Funcionário #1
ID: 333
Nome: maria
Salário: 3000
Digite o ID do funcionário que receberá aumento: 333
Digite a porcentagem: 10
Lista de funcionários:
333, maria, 3300.00
```

## Estrutura do Código
- **Classe `util`**: Encapsula os atributos (ID, nome, salário) e métodos (como aplicar aumento de salário).
- **Classe Principal**: Contém a lógica para entrada de dados, validação, manipulação da lista de funcionários e exibição.
- **ArrayList**: Armazena instâncias da classe `util` para gerenciamento dinâmico.
- **Loops**: Usados para iterar sobre a entrada de dados e a exibição da lista.
