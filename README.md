# Farmatodo technical test.

Este proyecto resuelve la prueba tecnica solicitada.

## Contenido

- [Pruebas](#requerimientos)
- [Instalación](#instalación)
- [Bonus](#Bonus)


## Pruebas
#### Nota: Todos los enpoints se pueden consultar con la colección de postman que esta aqui: (static/postman/Farmatodo technical test.postman_collection.json)

- Prueba 1: Tomando como insumo los servicios web documentados en la pagina
https://rickandmortyapi.com/documentation/
Cree una API REST con Spring Boot que cumpla con los siguientes requisitos:
  - La petición debe recibir el número del episodio.
  - GET - http://localhost:8080/technical/test/rickandmorty/{episodeId}
- Prueba 2: Modelo entidad de relación del punto 1. 
![Modelo relacional](https://github.com/danielvargass97/Farmatodo-prueba-tecnica/blob/master/static/img/Modelo%20relacional.png?raw=true)

Se encuentra el la ruta indicada:  /static/img/Modelo relacional.png
- Prueba 3: Consultar y entender que es un número feliz, implemente una API que reciba un listado de números y responda
para cada número si es feliz o no.
  - POST - http://localhost:8080/technical/test/happynumber/list
- Prueba 4: Cree otra API REST que permita calcular el resultado de la suma de números naturales hasta N, donde N es el parámetro hasta el cual debe calcular la sumatoria
  - GET - http://localhost:8080//technical/test/addition/{n}
  
## Instalación

Para instalar este proyecto, siga estos pasos:

1. Clone este repositorio.
2. Cree una base de datos MySql y ejecute los scripts create_tables.sql y insert_location_table.sql alojados en static/sql
3. Ejecute la clase TechnicalTestApplication.java

## Bonus

1. Pruebas unitarias - No solucionado
2. Modelo no relacional - static/img/Modelo no relacional.txt
3. Api desplegada - No solucionado

