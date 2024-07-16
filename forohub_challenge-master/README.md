# Foro Hub

## Descripción
El challenge Foro Hub consiste en una API REST para la gestión de un foro que permite la creación de dudas llamadas tópicos. De acuerdo al challenge del programa Oracle Next Education y AluraLatam, el foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos.

![Insignia Spring](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/Badge-Spring.png)

## Características
- La API se centra específicamente en los tópicos y permite realizar las operaciones CRUD: Crear, Consultar, Actualizar y Eliminar tópicos.
- Los datos se guardan en una base de datos relacional llamada `foro_hub` para la persistencia de la información, la cual incluye las siguientes tablas:
  - `Topicos`
  - `Respuesta`
  - `Curso`
  - `Usuario`
- Se implementa la autenticación de JWT (JSON Web Token) para validar usuarios con correo y contraseña, los cuales están registrados en la base de datos de usuarios.
- Se implementan las validaciones de negocio para no recibir solicitudes con campos nulos y para no permitir el registro de tópicos duplicados con el mismo título y mensaje.
- Se siguen las mejores prácticas y se sigue el modelo de desarrollo SOLID, permitiendo continuar con el desarrollo y la implementación de nuevas funcionalidades en la API Foro Hub.

## Tecnologías Usadas
- Java 17
- Spring Boot 3.0
- Spring Data JPA
- Hibernate
- Maven
- Lombok

## Dependencias
- `spring-boot-starter-data-jpa`: Para la integración de JPA con Spring Boot.
- `spring-boot-starter-security`: Para la seguridad y autenticación.
- `spring-boot-starter-validation`: Para la validación de datos.
- `spring-boot-starter-web`: Para crear aplicaciones web, incluyendo RESTful services.
- `flyway-core` y `flyway-mysql`: Para la migración y gestión de la base de datos.
- `spring-boot-devtools`: Para el desarrollo, con reinicio automático.
- `mysql-connector-j`: Para la conexión con la base de datos MySQL.
- `lombok`: Para reducir el código boilerplate.
- `spring-boot-starter-test`: Para pruebas unitarias y de integración.
- `spring-security-test`: Para pruebas de seguridad.
- `java-jwt`: Para trabajar con JSON Web Tokens.

## Imágenes
### Autenticación exitosa
![Autenticación](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/autenticacion.png)

### Eliminación de un tópico
![Eliminar Tópico](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/eliminar_topico.png)

### Modificación del título de un tópico
![Modificar Título](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/modificar_titulo.png)

### Error de autenticación
![Error de Autenticación](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/error_autenticacion.png)

### Registro exitoso de un tópico
![Registrar Tópico Correcto](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/registrar_topico_ok.png)

### Intento de inicio de sesión fallido
![Bad Login](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/bad_loging.png)

### Error de recurso no encontrado
![Error Not Found](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/error_not_found.png)

### Tópico duplicado
![Tópico Duplicado](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/topico_duplicado.png)

### Detalle de un tópico
![Detallar Tópico](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/detallar_topico.png)

### Listado de tópicos
![Listar Tópicos](https://github.com/user-name-c/forohub_challenge/blob/master/imagenes/listar_topicos.png)


## Instalación y Ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/user-name-c/forohub_challenge.git

2. Navegar al directorio del proyecto:
    ```bash
    cd forohub_challenge

3. Configurar las propiedades de la base de datos en application.properties.

4. Ejecutar la aplicación:

## Uso

2. Autenticarse y obtener un token JWT desde el endpoint /login.
3. Usar el token para acceder a los endpoints protegidos como /topicos.

## Estado del Proyecto

El proyecto se encuentra en estado de finalización con los requisitos básicos completados, incluyendo la autenticación de usuario usando JWT y los endpoints de la ruta /topicos con sus respectivas validaciones de negocio propuestas en el Challenge.

## Contribuciones

Las contribuciones son bienvenidas. Siéntete libre de hacer un fork del proyecto y enviar pull requests.

## Licencia

Este proyecto está bajo la licencia MIT.
