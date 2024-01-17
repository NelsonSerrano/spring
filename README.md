# spring-boot-h2-apirest
Este proyecto fue creado con In-Memory Database (H2 Database), 


Se debe tener instalado y configurado MAVEN APACHE, 


Se ocupo IDE IntelliJ IDEA 2023.3.2 (Community Edition)


End Point, 

Se crearon dos tablas de Users y comentarios

los enpoint son 

POST http://localhost:8080/api/comentarios Crea los comentarios al enviar Json

{
    "comentario": "este es un comentario ",
    "user_id": "ejemplo@gmail.com"
}

GET http://localhost:8080/api/comentarios Lista todos los comentarios al enviar Json

DELETE http://localhost:8080/api/comentarios/{id}  elimina un comentario en especifico


POST http://localhost:8080/api/users Crea usuario al enviar Json

{
    "firstName": "Nelson",
    "lastName" : "Serrano",
    "email": "ejemplo@gmail.com",
    "region": "metropolitana"
}

GET http://localhost:8080/api/users Lista todos los usuarios al enviar Json

DELETE http://localhost:8080/api/users/{id}  elimina un usuario en especifico
