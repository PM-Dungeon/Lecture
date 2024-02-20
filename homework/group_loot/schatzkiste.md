---
archetype: assignment
title: "Monster-Schatzkisten"
author: "André Matutat (HSBI)"
points: "5 Punkte"
weight: 5

hidden: true
---

## Ziel

In dieser Aufgabe implementieren Sie eine Monster-Schatzkiste, die der Spieler im Level
finden und plündern kann. Vor dem Plündern muss die Kiste aber erst besiegt werden!

## Voraussetzung

Um diese Aufgabe lösen zu können, müssen Sie vorher
`["Monster"]({{< ref "/assignments/group_monster/monster" >}})`{=markdown} und
`["Item"]({{< ref "/assignments/group_loot/item" >}})`{=markdown} gelöst haben.

## Monster-Schatzkiste

In den Vorgaben finden Sie die Implementierung einer
[Schatzkiste](https://github.com/Dungeon-CampusMinden/Dungeon/blob/master/game/src/ecs/entities/Chest.java).
Führen Sie eine Codeanalyse durch und erklären Sie die Funktionalität.

Konzipieren und implementieren Sie nun die "Monster-Schatzkiste" als einen neuen
Monster-Typ. Dieses Monster soll aussehen wie eine Schatzkiste, greift den Spieler jedoch
beim Versuch sie zu plündern an. Wenn der Spieler das Monster besiegt hat, soll das
Schatzkisten-Monster sich wie eine normale Schatzkiste verhalten und seine Beute preisgeben.
