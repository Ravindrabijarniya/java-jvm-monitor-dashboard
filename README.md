# 🚀 JVM Monitor Dashboard

A professional Java console application that monitors the running JVM in real time using **Java Management Extensions (JMX)** and **MXBeans**.

This project demonstrates how tools like **VisualVM** and **JConsole** collect JVM statistics by accessing the JVM's built-in management interfaces.

The application continuously monitors the JVM, displays important runtime information, and exports monitoring reports in **TXT** and **CSV** formats.

---

# 📸 Screenshots

> Add screenshots here after completing the project.

```
Screenshots/
├── dashboard.png
├── monitoring-report.png
├── csv-report.png
└── architecture.png
```

---

# ✨ Features

## Runtime Monitoring

- JVM Name
- JVM Vendor
- JVM Version
- JVM Uptime
- JVM Start Time

---

## Memory Monitoring

- Heap Usage
- Non-Heap Usage
- Used Memory
- Committed Memory
- Maximum Heap Size
- Memory Usage Progress Bar

---

## Thread Monitoring

- Current Threads
- Peak Threads
- Daemon Threads

---

## Garbage Collection Monitoring

- GC Name
- Collection Count
- Collection Time

---

## Operating System Monitoring

- Operating System Name
- Version
- Architecture
- Available Processors
- System Load Average

---

## Class Loading Monitoring

- Loaded Classes
- Total Loaded Classes
- Unloaded Classes

---

## Memory Pool Monitoring

- Eden Space
- Survivor Space
- Old Generation
- Metaspace
- Code Cache

---

## Dashboard

- Live Console Dashboard
- Auto Refresh
- Human Readable Memory
- Progress Bars
- Timestamp
- Formatted Uptime

---

## Export Reports

- TXT Report
- CSV Report

---

# 🏗 Project Architecture

```
                          Main
                            │
                            ▼
                  MonitoringService
                            │
     ┌──────────────────────┼────────────────────────┐
     ▼                      ▼                        ▼
 RuntimeCollector     MemoryCollector        ThreadCollector
     │                      │                        │
     ▼                      ▼                        ▼
 RuntimeInfo          MemoryInfo              ThreadInfo

     ▼
 GCCollector
     │
     ▼
 GCInfo

     ▼
 OSCollector
     │
     ▼
 OSInfo

     ▼
 ClassLoadingCollector
     │
     ▼
 ClassLoadingInfo

     ▼
 MemoryPoolCollector
     │
     ▼
 MemoryPoolInfo

                ▼
        DashboardSnapshot
                │
       ┌────────┴────────┐
       ▼                 ▼
DashboardRenderer    Exporters
```

---

# 📂 Project Structure

```
src
└── com
    └── ravindra
        └── jvmmonitor

            ├── dashboard
            │      DashboardRenderer.java
            │
            ├── exporter
            │      CSVExporter.java
            │      TextExporter.java
            │
            ├── metrics
            │      RuntimeCollector.java
            │      MemoryCollector.java
            │      ThreadCollector.java
            │      GCCollector.java
            │      OSCollector.java
            │      ClassLoadingCollector.java
            │      MemoryPoolCollector.java
            │
            ├── model
            │      RuntimeInfo.java
            │      MemoryInfo.java
            │      ThreadInfo.java
            │      GCInfo.java
            │      OSInfo.java
            │      ClassLoadingInfo.java
            │      MemoryPoolInfo.java
            │      DashboardSnapshot.java
            │
            ├── service
            │      MonitoringService.java
            │
            ├── util
            │      ConsoleUtil.java
            │      MemoryUtil.java
            │      ProgressBarUtil.java
            │      TimeUtil.java
            │
            └── Main.java
```

---

# 🛠 Technologies Used

- Java 17
- Maven
- Java Management API (JMX)
- Java MXBeans
- File I/O
- Object-Oriented Programming
- Git
- GitHub

---

# 🧠 JVM Concepts Covered

| MXBean | Purpose |
|----------|----------------------------------|
| RuntimeMXBean | JVM Information |
| MemoryMXBean | Heap & Non-Heap Memory |
| ThreadMXBean | Thread Statistics |
| GarbageCollectorMXBean | Garbage Collection Monitoring |
| OperatingSystemMXBean | CPU & Operating System Information |
| ClassLoadingMXBean | Class Loading Statistics |
| MemoryPoolMXBean | Individual Memory Pool Usage |

---

# 🔄 Application Flow

```
Application Starts

        │

        ▼

MonitoringService

        │

        ▼

Collect JVM Metrics

        │

        ▼

DashboardSnapshot

        │

        ▼

Dashboard Renderer

        │

        ▼

Display Dashboard

        │

        ▼

Export Reports
```

---

# 📊 Sample Dashboard Output

```text
==========================================================
                JVM MONITOR DASHBOARD
==========================================================

Time      : 01-07-2026 22:45:20
Uptime    : 00h 12m 18s

----------------------------------------------------------

Heap Used : 18.42 MB
Heap Max  : 2.00 GB

[=====                     ] 12%

----------------------------------------------------------

Threads

Current   : 7
Peak      : 7
Daemon    : 6

----------------------------------------------------------

Operating System

Windows 11

Processors : 12

----------------------------------------------------------

Garbage Collectors

G1 Young Generation

Collections : 2

Time : 18 ms
```

---

# 📄 Exported Reports

The application generates two reports automatically.

## TXT Report

```
MonitoringReport.txt
```

Contains

- JVM Information
- Memory Information
- Thread Information
- Processor Information
- Garbage Collection Information

---

## CSV Report

```
MonitoringReport.csv
```

Can be opened directly in

- Microsoft Excel
- Google Sheets
- LibreOffice Calc

---

# ▶️ How to Run

Clone the repository

```bash
git clone https://github.com/<your-username>/java-jvm-monitor-dashboard.git
```

Open the project in your IDE.

Run

```
Main.java
```

The dashboard will start monitoring the current JVM.

---

# 🎯 What I Learned

Building this project helped me understand:

- Java Management Extensions (JMX)
- JVM Monitoring
- Runtime Information
- Heap & Non-Heap Memory
- Thread Monitoring
- Garbage Collection
- Operating System Monitoring
- Class Loading
- Memory Pools
- Layered Project Architecture
- Clean Code
- Utility Class Design
- Report Generation
- Object-Oriented Programming
- Git & GitHub Workflow

---

# 🚀 Future Improvements

- ANSI Color Dashboard
- Interactive Menu
- JSON Export
- REST API using Spring Boot
- Web Dashboard
- Docker Support
- Prometheus Integration
- Grafana Dashboard
- Email Report Generation
- Historical Monitoring Logs

---

# 📚 Related JVM Topics

This project complements the following Java concepts:

- JVM Architecture
- Heap Memory
- Stack Memory
- Metaspace
- Class Loaders
- Garbage Collection
- Memory Management
- JVM Performance Monitoring

---

# 👨‍💻 Author

**Ravindra Bijarniya**

Java Backend Developer (Learning Journey)

This project is part of my **Java Mastery Course**, where I am building production-quality Java applications while deeply understanding JVM internals, clean architecture, and backend development.

---

# ⭐ If You Like This Project

If you found this project useful:

- Star ⭐ the repository
- Fork 🍴 the repository
- Share 📢 with other Java learners

Happy Coding! 🚀