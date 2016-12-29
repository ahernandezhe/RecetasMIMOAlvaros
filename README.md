# RecetasMIMOAlvaros
API recetas utilizando Play Framework.
## Peticiones `POST`
### Crear receta
Ejemplo de la estructura del JSON de llamada: 

        {
             "nombre": "Ensalada de lechuga, cherrys y cebollino",
             "descripcion": "Sencilla ensalada de lechuga, tomates cherry y cebollino, perfecta para servir como guarnición.",
             "categoria": "categoria 1",
             "ingredientes": [{
              "nombre": "Lechuga",
              "descripcion": "descripcion lechuga",
              "tipo": "tipo 1"
             }, {
              "nombre": "tomates cherrys",
              "descripcion": "descripcion tomates",
              "tipo": "tipo 2"
             }, {
              "nombre": "cebollino",
              "descripcion": "descripcion cebollino",
              "tipo": "tipo 3"
             }]
        }
[http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/recetas](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/recetas)
### Crear ingrediente
Ejemplo de la estructura del JSON de llamada:

        {
             "nombre": "Carne",
             "descripcion": "descripcion carne",
             "tipo": "tipo 1"
        }
[http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/ingredientes](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/ingredientes)

## Peticiones `PUT`
Para actualizar una receta o un ingrediente tendremos que pasarle en el body de la petición un **JSON** con toda la información de la receta o del ingrediente, NO solo los campos a actualizar. 

Ejemplo de estructura del JSON para actualizar una receta:

        {  
           "id":"35",
           "nombre":"Ensalada actualizada",
           "descripcion":"Sencilla ensalada, perfecta para servir como guarnicion.",
           "categoria":"categoria 32",
           "ingredientes":[  
              {  
                 "nombre":"Lechuga actualizada",
                 "descripcion":"descripcion lechuga11",
                 "tipo":"tipo 11"
              },
              {  
                 "nombre":"cebollino actualizado",
                 "descripcion":"descripcion cebollino22",
                 "tipo":"tipo 22"
              }
           ]
        }
        
Ejemplo de estructura del JSON para actualizar un ingrediente:

        {  
           "id":"34",
           "nombre":"Carne actualizada",
           "descripcion":"descripcion carne actualizada",
           "tipo":"tipo 12"
        }
### Actualizar receta
[http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta)

### Actualizar ingrediente
[http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/ingrediente](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/ingrediente)

## Peticiones `GET`
Nuestros Peticiones GET devuelven resultados tanto de tipo **JSON** como **XML**.
### Resultado JSON:

        curl --verbose -X GET --header "Accept: application/json" 
        http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/nombre/:nombre
#### Ejemplo:

        {  
           "id":35,
           "nombre":"Tortilla de patata",
           "descripcion":"Rica tortilla casera",
           "categoria":"categoria 3",
           "ingredientes":[  
              {  
                 "id":33,
                 "nombre":"Huevos",
                 "descripcion":"descripcion huevos",
                 "tipo":"tipo 2"
              },
              {  
                 "id":34,
                 "nombre":"sal",
                 "descripcion":"descripcion sal",
                 "tipo":"tipo 2"
              },
              {  
                 "id":35,
                 "nombre":"cebolla",
                 "descripcion":"descripcion cebolla",
                 "tipo":"tipo 3"
              },
              {  
                 "id":36,
                 "nombre":"Patatas",
                 "descripcion":"descripcion patatas",
                 "tipo":"tipo 3"
              }
           ]
        }
### Resultado XML
        curl --verbose -X GET --header "Accept: application/xml" 
        http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/nombre/:nombre

#### Ejemplo:
        <receta id="35">
            <nombre>Tortilla de patata</nombre>
            <descripcion>Rica tortilla casera</descripcion>
            <categoria>categoria 3</categoria>
            <ingredientes>
                <ingrediente id="33">
                    <nombre>Huevos</nombre>
                    <descripcion>descripcion huevos</descripcion>
                    <tipo>tipo 2</tipo>
                </ingrediente>
                <ingrediente id="34">
                    <nombre>sal</nombre>
                    <descripcion>descripcion sal</descripcion>
                    <tipo>tipo 2</tipo>
                </ingrediente>
                <ingrediente id="35">
                    <nombre>cebolla</nombre>
                    <descripcion>descripcion cebolla</descripcion>
                    <tipo>tipo 3</tipo>
                </ingrediente>
                <ingrediente id="36">
                    <nombre>Patatas</nombre>
                    <descripcion>descripcion patatas</descripcion>
                    <tipo>tipo 3</tipo>
                </ingrediente>
            </ingredientes>
        </receta>
### Obtener una receta por id
[http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/id/:id](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/id/:id)
### Obtener recetas por nombre
 [http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/nombre/:nombre](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/nombre/:nombre) 
### Obtener recetas por categoría
 [http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/categoria/:categoria](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/categoria/:categoria) 
 
## Petición `DELETE`
### Eliminar una receta
[http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/:id](http://ec2-35-156-68-35.eu-central-1.compute.amazonaws.com/receta/:id) 


## Autores
Álvaro Hernández Hernández y Álvaro Armero López.