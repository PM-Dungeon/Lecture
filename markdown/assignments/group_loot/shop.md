---
archetype: assignment
title: "Shop"
author: "André Matutat (FH Bielefeld)"
points: 10
weight: 4

hidden: true
---

## Ziel

In dieser Aufgabe implementieren Sie einen Shop, in dem der Spieler Items wie Gegenstände und Verbesserungen kaufen und verkaufen kann.

## Voraussetungen

Um diese Aufgabe lösen zu können, sollten Sie vorher folgende Aufgaben gelöst haben:
-   `["Item"]({{< ref "/assignments/group_loot/item" >}})`{=markdown}
-   `["Dialogsystem"]({{< ref "/assignments/group_loot/dialogsystem" >}})`{=markdown}

## Shop

Implementieren Sie einen Shop, in dem der Spieler Items kaufen und verkaufen kann.

-   Items kosten etwas. Implementieren Sie daher eine Währung und ein System, um an Zahlungsmittel zu kommen.
-   Items gibt es nur in begrenzter Anzahl im Shop.
-   Items sind im Einkauf teurer als im Verkauf.

Der Kauf bzw. Verkauf soll mithilfe von RexExp und dem Dialogsystem erfolgen. Implementieren Sie eine Mechanik zum Feilschen per Texteingabe. Preise sollen ebenfalls über das Dialogsystem angefragt/vorgeschlagen werden.