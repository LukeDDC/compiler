# Antlr

## Visitors

Sâo de dois tipos:

1. Listeners: disparam notificações ao encontrarem algum tipo de nó e executam um callback
2. Visitors:

### Listeners

Para andar pela ávore utilizamos a classe ```ParseTreeWalker``` e passamos para ela uma implementação de ```ParseTreeListener``` contendo código da aplicação.

```ParseTreeListener``` vai ter dois métodos enter() e exit() que são trigados quando o walker entra ou saí de um nó.

### Visitor

Modo mais manual de se percorrer a árvore onde é possível visitar manualmente cada um dos nós.
