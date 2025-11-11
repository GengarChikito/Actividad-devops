# 🚀 Microservicio Saludo: Spring Boot & DevOps Pipeline

[![Build and Scan Status](https://github.com/GengarChikito/Actividad-devops/actions/workflows/maven.yml/badge.svg)](https://github.com/GengarChikito/Actividad-devops/actions/workflows/maven.yml)

Este proyecto es un microservicio RESTful simple desarrollado con **Spring Boot** y **Java 17**, diseñado para demostrar una implementación completa de una canalización de Integración Continua y Despliegue Continuo (CI/CD) con un enfoque en la seguridad, calidad y orquestación.

---

## 🛠️ Stack Tecnológico

| Componente | Tecnología | Propósito |
| :--- | :--- | :--- |
| **Backend** | Spring Boot 3.x, Java 17 | Desarrollo del API REST. |
| **Persistencia** | H2 Database (In-Memory) | Base de datos para desarrollo y entorno simulado. |
| **Construcción** | Maven | Gestión de dependencias y empaquetado (`.jar`). |
| **Contenerización** | Docker (`eclipse-temurin:17-jdk-alpine`) | Imagen optimizada, ligera y segura. |
| **Orquestación (IE5)** | Docker Compose | Definición y ejecución del entorno de un solo contenedor. |
| **Seguridad (IE3)** | Snyk & GitHub Code Scanning | Escaneo de vulnerabilidades (SCA/SAST) y bloqueo de pipeline. |
| **CI/CD (IE2/IE4)** | GitHub Actions | Automatización de pruebas, seguridad y despliegue. |

---

## 🏃 ¿Cómo correr el microservicio localmente?

Para ejecutar el proyecto localmente, debe utilizar la orquestación de Docker Compose.

**Pre-requisitos:**
* **Java 17** (o superior)
* **Maven**
* **Docker Desktop** (Debe estar instalado y en ejecución)

PASO 1 :El `Dockerfile` necesita el archivo JAR compilado (`target/*.jar`). Este paso compila el código, ejecuta las pruebas unitarias y genera el artefacto ejecutable.

Paso 2: Desplegar la Aplicación (Orquestación con Docker Compose)
Una vez que el JAR está generado, Docker Compose construirá la imagen (saludo-app:latest) e iniciará el contenedor.

Paso 3: Verificar el Servicio
El microservicio estará disponible en el puerto 8080.

Verificar contenedores: Confirme que el contenedor está activo.

Acceder al API: Visite el endpoint en su navegador o use curl.

Endpoint: http://localhost:8080/

🔒 Pipeline CI/CD: Trazabilidad y Seguridad
El workflow (.github/workflows/maven.yml) automatiza la calidad y seguridad en cada push a las ramas principales.

Los resultados detallados de los escaneos de Snyk se registran en la pestaña Security de GitHub (Code Scanning) para su revisión continua.

DEME UN 7