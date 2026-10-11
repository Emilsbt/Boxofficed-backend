# Boxofficed – Backend

Studentisches Projekt im Modul **Webtechnologien** an der HTW Berlin.

## Worum geht's?

**Boxofficed** ist eine Film-Watchlist als Website. 
Nutzer:innen können Filme sammeln, als gesehen markieren, nach Genre sortieren sowie eine Bewertung und eine kurze Review hinterlegen.

## Technik

- Java 25
- Spring Boot (Spring Web MVC)
- Gradle als Build-Tool

## Starten

```bash
./gradlew bootRun
```

Die Anwendung läuft danach unter `http://localhost:8080`.

## Aktueller Stand (Meilenstein 1)

- Spring-Boot-Projekt mit GET-Route aufgesetzt
- Entity Klasse `WatchlistEntry` (Name, Genre, Bewertung, Review, gesehen/nicht gesehen)
- Gibt Liste von Beispielentitäten aus


