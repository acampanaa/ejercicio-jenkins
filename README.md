# Actividad 2 — Integración Jenkins + SonarQube

Proyecto Java/Maven analizado mediante análisis estático en un pipeline de CI.

## Estructura
- `Jenkinsfile` — pipeline con etapas: Checkout, Build, Análisis SonarQube, Quality Gate
- `pom.xml` — Maven con JUnit 5, JaCoCo (cobertura) y sonar-maven-plugin
- `src/main/java/com/ejemplo/app/App.java` — código fuente
- `src/test/java/com/ejemplo/app/AppTest.java` — pruebas unitarias

## Entorno
Jenkins, SonarQube y PostgreSQL levantados con Docker Compose en red compartida.

## Resultados del análisis
| Métrica | Valor |
|---|---|
| Bugs | 0 |
| Vulnerabilidades | 0 |
| Code Smells | 7 |
| Deuda técnica | 30 min |
| Cobertura | 55.6% |
| Duplicaciones | 0.0% |
