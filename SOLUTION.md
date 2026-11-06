# Solución — Examen Práctico

## Qué se implementó
- Adaptación del backend Spring Boot para trabajar con PostgreSQl
- Configuracion de la conexion en el properties
- Adaptación de las consultas del repositorio para utilizar los nombres de las tablas y columnas
- Implementacion del endpoint DELETE api/cliente/{1}
- Manejo de las respuestas 204, 404
- Incorporación de la documentación mediante SWAGGER
- 
## Cómo se implementó
- Se conservo la estructura original del proyecto, separando responsabilidades entre capas
  - Repository
  - Service
  - Controller
- Se uso postman apra validar el funcionamiento del endpoint
- Documentación

## Cambios en base de datos / configuración
- Se utilizo PostgreSQL
- Se creo la bse de datos test_fullstack
- Se creo la tabla cliente
- Se adapto la conexión
- Se incorporo el driver
- Se ajusto la consulta
- Documentación

## Dificultades encontradas
- Configuracion de ambiente por las versiones
- Cambio en el script de creación
- Inconsistencias en las consultas
- 
## Mejoras que podrían aplicarse
- Mejorar la documentación
- Conectar frontend
- Validaciones
