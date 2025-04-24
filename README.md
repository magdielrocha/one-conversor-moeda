# Conversor de Moedas em Java 💱

Este é um projeto simples em Java que consome a [ExchangeRate-API](https://www.exchangerate-api.com/) para 
converter valores entre diferentes moedas usando o dólar americano como base. Esse projeto foi desenvolvido
para completar o desafio da especialização backend do programa ONE - Oracle Next Education.

## 🔧 Tecnologias utilizadas

- Java 24
- API HTTP nativa (`java.net.http`)
- GSON para manipulação de JSON
- ExchangeRate-API (gratuita)

## 📦 Funcionalidades

- Conversão de:
    - Dólar → Peso argentino
    - Peso argentino → Dólar
    - Dólar → Real brasileiro
    - Real brasileiro → Dólar
    - Dólar → Peso colombiano
    - Peso colombiano → Dólar

- Validação de entrada para garantir que o usuário selecione uma opção válida
- Interface no console com menu interativo

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/magdielrocha/one-conversor-moeda
   ```

2. Compile e execute com o terminal:
   ```bash
   javac Main.java
   java Main
   ```

> Certifique-se de que você tenha o Java instalado corretamente e uma conexão com a internet para que a API funcione.

## 📌 Observações

- A taxa de câmbio é obtida a partir da base USD (dólar americano).
- Para converter de outras moedas para o dólar, o valor é **dividido** pela taxa.
- Para converter do dólar para outra moeda, o valor é **multiplicado** pela taxa.

## 📁 Estrutura esperada

```bash
.
├── Main.java
├── ConsultaMoedas.java
├── Moedas.java
└── README.md
```

## 📃 Exemplo de uso

```bash
*******************************************
Seja bem vindo(a) ao Conversor de Moeda =]

Escolha uma opção de conversão:

1) Dólar =>> Peso argentino
2) Peso argetino ==> Dólar
...

Digite uma opção entre 1 e 7:
```

---

Feito com ☕ por Magdiel Rocha

