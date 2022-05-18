---
type: lecture-cg
title: "Swing: Layout-Manager"
menuTitle: "Swing: Layout-Manager"
author: "Carsten Gips (FH Bielefeld)"
weight: 4
readings:
  - key: "Java-SE-Tutorial"
    comment: "Creating Graphical User Interfaces > Creating a GUI With Swing"
  - key: "Ullenboom2021"
    comment: "Kap. 18: Einführung in grafische Oberflächen"
tldr: |
  TODO

    *   Fortgeschrittenes Layout mit `GridBagLayout`

outcomes:
  - k3: "Komplexe Layouts mit GridBagLayout"
quizzes:
  - link: "XYZ"
    name: "Quiz XXX (ILIAS)"
youtube:
  - link: ""
    name: "VL Swing: Layout-Manager"
  - link: ""
    name: "Demo Swing: Layout-Manager"
  - link: ""
    name: "Demo Swing: Layout-Manager"
fhmedia:
  - link: ""
    name: "VL Swing: Layout-Manager"
---


# Swing: Layout-Manager

## Überblick

todo

## Grid

todo

## Border

todo

## Flow

todo


## Komplexer Layoutmanager: _GridBagLayout_

*   Layoutmanager mit gitterartiger Grundstruktur
*   Erzeugung/Verwendung ähnlich zu `GridLayout`
*   Zusätzlich **Constraints**, beschreiben Verhalten des
    Layouts bei Größenveränderungen: `GridBagConstraints`

| Constraint   | Bedeutung                                                                                                    |
|:-------------|:-------------------------------------------------------------------------------------------------------------|
| `gridx`      | **Spalte** für Komponente (linke obere Ecke)                                                                 |
| `gridy`      | **Zeile** für Komponente (linke obere Ecke)                                                                  |
| `gridwidth`  | **Anzahl der Spalten** für Komponente                                                                        |
| `gridheight` | **Anzahl der Zeilen** für Komponente                                                                         |
| `fill`       | Vergrößert **Komponente** (wenn Platz ist) in angegebene  Richtung: `NONE`, `HORIZONTAL`, `VERTICAL`, `BOTH` |
| `weightx`    | Freier Platz in x-Richtung wird unter den **Grid-Slots** entsprechend ihrem "Gewicht" aufgeteilt             |
| `weighty`    | Freier Platz in y-Richtung wird unter den **Grid-Slots** entsprechend ihrem "Gewicht" aufgeteilt             |

::: notes
Selbststudium: Machen Sie sich mit Hilfe der Literatur mit dem `GridBagLayout`
vertraut. Nutzen Sie den Beispielcode und variieren Sie die verschiedenen
Parameter/Constraints, um sich mit dem Verhalten und den Auswirkungen vertraut
zu machen!

[Beispiel: java2d.swing.MultiListenerGridBagDemo]{.bsp}
:::


## Wrap-Up

*   Fortgeschrittene Swing-Komponenten
    *   Fortgeschrittenes Layout mit `GridBagLayout`







<!-- DO NOT REMOVE - THIS IS A LAST SLIDE TO INDICATE THE LICENSE AND POSSIBLE EXCEPTIONS (IMAGES, ...). -->
::: slides
## LICENSE
![](https://licensebuttons.net/l/by-sa/4.0/88x31.png)

Unless otherwise noted, this work is licensed under CC BY-SA 4.0.
:::