# 💻 Projeto de pilares do POO em Java

Este simples projeto de estudos e o uso de **encapsulamento**, **Herança**, **Polimorfismo** e **Abstração/Interfaces** e para testar como os mecanismos podem ser reutilizados para suas classes filhas,em Java com diferentes serviços de mensagens simulados: MSN, Facebook Messenger.

## 📁 Estrutura de Pastas

```
Estudos-DIO.JAVA/
| src/
│      encapsulamento/
│           ComputadorUsuario.java
│           ServicoMensage.java
│           aplicativos/
│               FaceBook.java
│               MSNMensage.java
│               Telegram.java
```

## ▶️ Como Compilar e Executar

### Requisitos:
- Java 17 o Java 8 nativo e melhor(ou outra versão compatível)

### Passo 1: Compilar

```bash
javac -d bin src/encapsulamento/*.java src/encapsulamento/aplicativos/*.java
```

### Passo 2: Executar

```bash
java -cp bin encapsulamento.ComputadorUsuario
```

---

Desenvolvido para fins educacionais, como parte dos estudos de Programação Orientada a Objetos (POO) com Java.
