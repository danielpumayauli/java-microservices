# Java Microservices  
Este proyecto implementa una arquitectura basada en microservicios desarrollados con Spring Boot. Cada módulo cumple una función de dominio específica (cuentas, tarjetas, préstamos) junto con un servidor de configuración y está preparado para ser orquestado con contenedores para mostrar servicios desacoplados y un despliegue modular.

## Estructura del proyecto  
El repositorio incluye los siguientes módulos/principales directorios:  
- `accounts/` — módulo de microservicio para gestión de cuentas.  
- `cards/` — módulo de microservicio para gestión de tarjetas.  
- `loans/` — módulo de microservicio para gestión de préstamos.  
- `configserver/` — módulo que actúa como servidor de configuración centralizada.  
- `docker-compose/` — archivos para despliegue con Docker Compose.  

## Características principales  
- Arquitectura por dominio (cuentas, tarjetas, préstamos) en microservicios.  
- Servidor de configuración (`configserver`) para externalizar configuración.  
- Soporte para despliegue local mediante `docker-compose`.  
- Uso de tecnologías Java/Spring Boot (100% Java en el repositorio).  
- Modularidad: cada servicio puede evolucionar por separado.

## Requisitos  
Para ejecutar el proyecto se recomienda tener instalado:  
- Java 17 (o superior)  
- Maven 3.6+  
- Docker & Docker Compose  
- (Opcional) Postman para probar los endpoints REST

## Instalación & Ejecución
1. Clona este repositorio:  
   ```bash  
   git clone https://github.com/danielpumayauli/java-microservices.git  
   cd java-microservices  

2. Revisa los ficheros application.yml o application.properties en cada módulo para ajustes de configuración.

3. Ejecuta la orquestación con Docker:
   ```bash  
    cd docker-compose  
    docker-compose up --build  

4. Servir endpoints bajo los dominios:

- /accounts/** — gestionar cuentas
- /cards/** — gestionar tarjetas
- /loans/** — gestionar préstamos

## Oportunidades de mejora
Para mejorar este proyecto se podrían considerar las siguientes adiciones y mejoras:

1. Autenticación y autorización:
  Implementar seguridad con Spring Security para proteger los endpoints con autenticación (JWT, OAuth2, etc.).
  Añadir roles de usuario y permisos para controlar el acceso a recursos sensibles.

2. Servicio de descubrimiento:
  Integrar un servidor de descubrimiento como Eureka para permitir que los microservicios se registren y encuentren dinámicamente.

3. API Gateway:
  Introducir un API Gateway como Spring Cloud Gateway para gestionar la comunicación entre los microservicios, implementar balanceo de carga y gestión centralizada de rutas.

4. Mensajería asíncrona:
  Añadir soporte para mensajería asíncrona con Kafka o RabbitMQ para manejar eventos y comunicación entre microservicios de forma no bloqueante.

5. Despliegue y monitoreo en producción:
  Mejorar la configuración para el despliegue en producción utilizando Kubernetes o Docker Swarm.
  Implementar herramientas de monitoreo como Prometheus y Grafana para supervisar el estado de los microservicios y la infraestructura.

6. Testing:
  Añadir pruebas unitarias y pruebas de integración para asegurar la calidad del código.

7. Escalabilidad y rendimiento:
  Ajustar los servicios para soportar una carga de tráfico más alta, aplicando técnicas como el circuit breaker y configuraciones de autoescalado en Kubernetes.