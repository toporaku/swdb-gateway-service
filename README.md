# Puerta de Enlace (API Gateway) - SWDB 2026

Este repositorio contiene el microservicio de **Puerta de Enlace (API Gateway)** como un componente independiente del ecosistema SWDB 2026.

---

## 📝 Descripción

Punto de entrada unificado para todas las solicitudes del cliente al ecosistema, implementado con Spring Cloud Gateway. Se encarga de ruteo dinámico hacia los microservicios correspondientes y manejo de CORS.

---

## 🛠️ Stack Tecnológico

*   **Lenguaje de Programación:** Java 17
*   **Framework Principal:** Spring Boot 3
*   **Gestor de Dependencias:** Maven
*   **Base de Datos:** MySQL 8+
*   **Componente en el Ecosistema:** Descubre y se configura dinámicamente mediante Eureka Registry e interactúa con el resto del ecosistema mediante llamadas balanceadas.

---

## 🚀 Guía de Ejecución Independiente

Si desea arrancar este microservicio por separado para depuración o pruebas locales, siga estas instrucciones:

### Prerrequisitos
1. Asegúrese de que el **Config Server** (`puerto 8888`) y el **Registry Service** (`puerto 8761`) estén activos.
2. Asegúrese de que la base de datos MySQL esté activa y cuente con los permisos de usuario correspondientes configurados en `setup.sql` global.

### Comando de Arranque
Navegue a la carpeta raíz de este servicio y ejecute:
```bash
mvn spring-boot:run
```
*El servicio se desplegará localmente escuchando en el puerto `8080`.*

---

## 📖 Documentación del Servicio

Este componente es un servicio interno de infraestructura (no expone APIs directas de negocio al cliente final). Su estado y métricas de salud pueden monitorearse a través de:
*   **Eureka Registry:** `http://localhost:8761`
*   **Spring Boot Admin Panel:** `http://localhost:9090`

