---
archetype: lecture-cg
title: "Ressourcen"
author: "Carsten Gips (FH Bielefeld)"
weight: 2
nocite: |
  @Ullenboom2021,@Chacon2014,@Fowler2011,@Bloch2018,@Martin2009,@Passig2013,@Urma2014

hidden: true
---


## Was brauche ich? Literatur ...

### Basics ("Must Have"!)

1.  "**Java ist auch eine Insel**": @Ullenboom2021
2.  "**Pro Git**": @Chacon2014
3.  "**Java Core Libraries Developer Guide**": @JDK-Doc
4.  "**The Java Tutorials**": @Java-SE-Tutorial

### Weitere empfohlene Literatur

Joshua Bloch, einer der "Väter" von Java, hat eine interessante Sammlung von Rezepten für
typische Probleme und wie man diese am sinnvollsten in Java lösen kann gesammelt: @Bloch2018
bzw. @Bloch2011 (ältere Version). Mit @Inden2013 gibt es ein extrem umfangreiches Nachschlagewerk
zu (fast) allen Themen in Java (wird gelegentlich aktualisiert).

Mit Java 8 wurden einige interessante Features eingeführt wie etwa Lambda-Ausdrücke und
Funktionsinterfaces. Hierzu ist @Urma2014 eine gute Quelle. Für das Update auf Java 9 kann
man sich @Juneau2017 anschauen.

Mit @Passig2013 ist ein wunderbar launiges Buch erschienen, wo typische Code-Smells diskutiert
werden (wobei man manche Standpunkte hinterfragen sollte). Ein Standardwerk zu diesem Thema
ist @Martin2009.

Zum Thema Refactoring ist @Fowler2011 _DIE_ Referenz. Auf @RefactoringGuru finden Sie eine nett
aufbereitete Übersicht zum Thema Refactoring, aber auch eine Einbettung in die Zusammenhänge mit
den Themen Bad Smells und Clean Code.

Wer Interesse an UML und/oder Designpattern hat, sollte in @Oestereich2012 sowie @UML25 und
@Gamma2011 sowie @Eilebrecht2013 schauen.

Zum Thema Unit-Test seien @vogellaJUnit, @junit4, @Osherove2014 und @Beck2014 empfohlen.

Zum Thema Coding Conventions sind @SunMicrosystems1997 und @googlestyleguide gute Referenzen.

Hier noch eine Sammlung von Gedanken zum Berufsverständnis von Informatikern: @AtlassianHelloWorld.

**Hinweis**: Am Ende einer Vorlesung wird noch einmal spezifisch zum Thema passende Literatur empfohlen.


## Was brauche ich noch? Tools ...

### Tools

*   JDK: Java SE 17 (LTS) ([Oracle](https://www.oracle.com/java/technologies/downloads/) oder [Alternativen](https://code.visualstudio.com/docs/languages/java#_install-a-java-development-kit-jdk))
*   IDE: [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/)
    oder [IntelliJ IDEA (Community Edition)](https://www.jetbrains.com/idea/)
    oder [Visual Studio Code](https://code.visualstudio.com/)
    oder [Vim](https://www.vim.org/)
*   [Git](https://git-scm.com/)

### Vorgaben für die Aufgaben

*   [GitHub](https://github.com/Programmiermethoden/Dungeon)
*   Alternative: [Gitlab im SW-Labor](http://git03-ifm-min.ad.fh-bielefeld.de/cagix/Dungeon) (**nur aus dem FH-Netz/VPN**)

::: notes
Wir stellen die Unterlagen und Vorgaben komplett auf GitHub zur Verfügung.
Sie können sich dort einen kostenfreien und anonymen Account einrichten. Wenn Sie dies nicht möchten, können
Sie alternativ unseren Gitlab-Server im Software-Labor nutzen. Dieser ist nur aus dem FH-Netz bzw. VPN heraus
erreichbar und Sie können sich dort mit Ihren _FH-Zugangsdaten_ anmelden (im Reiter "LDAP" geben Sie Ihren
Benutzernamen ohne das `@fh-bielefeld.de` plus Ihr Passwort ein). Bitte loggen Sie sich auf einem der beiden
Systeme mind. einmal ein, bevor Sie uns Ihre Usernamen mitteilen.

Die Aufgaben werden ebenfalls über GitHub oder den internen Gitlab-Server abgegeben (Ausnahmen siehe Aufgabenblätter).
Dafür richten Sie sich ein privates Repo ein, welches mit dem Vorgabe-Repo verknüpft ist (vgl. erstes Aufgabenblatt).
:::
