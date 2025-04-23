# 📘 Enums e toUpperCase() em Java

Este e parte dos meus estudos sobre como usar **enums**, em Java para representar valores fixos, como:

- 🌎 Estados: `RJ`, `SP`, `CE`, `GO`
- 🌍 Países: `BR`, `USA`, `UK`
- ❤️ Status: `SOLTEIRO`, `CASADO`

Enums ajudam a manter os dados organizados e seguros.

## 🔤 toUpperCase()

Usamos `toUpperCase()` para padronizar entradas do usuário, evitando erros ao comparar com enums, captando letras maiusculas:

```java
String entrada = scanner.nextLine();
Estado estado = Estado.valueOf(entrada.toUpperCase());
```

---

Essas branchs são apenas para estudos proprios
