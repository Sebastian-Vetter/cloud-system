# ☁️ CloudSystem

Ein modulares Cloud-System in **Kotlin**, entwickelt nach **Clean Architecture** und **Domain-Driven Design (DDD)**.  
Das Projekt besteht aus mehreren eigenständigen Anwendungen (Core & Worker) sowie gemeinsamen Modulen.

## 🔹 Architektur
Die Struktur orientiert sich an **Clean Architecture**:
- **Core** → Zentrale Steuerung & Orchestrierung (Domain-Logik, Management von Servern, Events, etc.)
- **Worker** → Führt Instanzen aus (Starten/Stoppen von Servern, Ressourcenverwaltung, Heartbeats)
- **Common** → Gemeinsame Klassen, Datenmodelle und Utility-Funktionen (z. B. Events, Messages, DTOs)
- **CloudAPI** → Gemeinsame API-Interfaces für Core und Worker

Jedes Modul ist nach DDD in folgende Layer aufgeteilt:
- **API** → Eingangs-/Ausgangslogik (z. B. JSON, CLI, REST, Sockets)
- **Domain** → Reine Business-Logik (Services, Entities, Interfaces)
- **Infrastructure** → Implementierungen für externe Systeme (z. B. Datenbanken, Netzwerk, Filesystem)

## 🔹 Features
- 🧩 Modular aufgebaut (Core & Worker können getrennt exportiert werden)
- 🧪 Voll testbar dank **TDD** und **Mocks**
- 🔌 Klare Trennung von **Domain** und **Infrastructure**
- ⚡ Event-basiert (z. B. `WorkerEvents` für Start/Stop/Heartbeat)
- 🌐 Erweiterbar über gemeinsame **CloudAPI**

## 🔹 Technologien
- **Kotlin** (JVM)
- **Gradle Kotlin DSL**
- **MockK** für Unit Tests
- **JUnit 5** für TDD
- **Clean Architecture** & **DDD**

## 🔹 Getting Started
```bash
# Repo klonen
git clone https://github.com/Sebastian-Vetter/cloud-system.git

# In Projektordner wechseln
cd cloud-system

# Alle Module bauen
./gradlew build
