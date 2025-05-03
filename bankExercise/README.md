
# Projeto de Conta Bancária em Java

Este projeto é uma aplicação simples em Java que simula o gerenciamento de uma conta bancária utilizando conceitos de **orientação a objetos**, incluindo **encapsulamento**, **getters e setters** e **métodos** para manipulação de dados.

## Funcionalidades
- Criação de uma conta com número e titular.
- Opção para depósito inicial (ou saldo zerado se não houver depósito).
- Realização de depósitos para adicionar saldo.
- Realização de saques para retirar saldo (considerando um possível saldo negativo).

## Estrutura do Projeto
O projeto utiliza:
- **Encapsulamento**: Atributos como número da conta, titular e saldo são privados, acessados e modificados apenas por métodos públicos (getters e setters).
- **Getters e Setters**: Métodos para acessar e alterar os valores dos atributos de forma controlada.
- **Métodos**: Implementação de operações como `depositar` e `sacar` para gerenciar o saldo da conta.
