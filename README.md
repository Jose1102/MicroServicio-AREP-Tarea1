# Microservicio

## Autores ✒️

* **Jose María Castro Ortega** - *Estudiante de ingeniería de sistemas* - [Jose1102](https://github.com/Jose1102)

## Despliegue Heroku 


[![Heroku](https://www.herokucdn.com/deploy/button.png)](https://microservicio-tarea1.herokuapp.com/)


## Tabla de contenido

- [Circleci](#circleci).
- [Requisitos](#requisitos-).
- [Enunciado](#enunciado).
- [Comenzando](#comenzando-).
- [Ejecutando las pruebas](#ejecutando-las-pruebas)
- [Diagrama de clases](#diagrama-de-clases-).
- [Productividad](#productividad).
- [Javadoc](#javaDoc-).
- [Licencia](#licencia-)

## Circleci

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Jose1102/MicroServicio-AREP-Tarea1)

## Requisitos 📋
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java](https://www.oracle.com/java/) - Lenguaje de programación

## Enunciado


Su compañía lo ha seleccionado para construir una aplicación que demuestre una simple arquitectura de Microservicios desplegada en Heroku para uno de los clientes más importantes.

Así, han decidido que usted debe construir una aplicación para consultar el mercado de valores de las acciones negociadas en Bolsa.  La aplicación recibirá el identificador de una acción, por ejemplo “MSFT” para Microsoft  y deberá mostrar el histórico de la valoración intra-día, diaria, semanal y mensual. Para esto utilice el API gratuito de https://www.alphavantage.co/documentation (Puede crear una cuenta para obtener la llave para realizar consultas). Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un Caché que permita evitar hacer consultas repetidas al API externo. Finalmente se le pide que muestre como se puede enlazar con otro proveedor de servicios, en este caso utilice llamados como los siguientes (https://api.iextrading.com/1.0/stock/aapl/chart) y revisé la documentación en  https://iextrading.com/developer/docs/#chart.


![Contexto](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/blob/master/images/contexto.PNG)


## Comenzando 🚀
1. Clonar el repositorio
```
git clone https://github.com/Jose1102/MicroServicio-AREP-Tarea1
```

2. Compilar el proyecto

```
mvn package
```

3. Ejecutar el proyecto 

Al momento de ejecutar el proyecto y abrir el despliegue podremos buscar por medio del identificador symbol. Por ejemplo podriamos buscar por:

```
MSFT
```
![MSFT](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/blob/master/images/msft.PNG)

```
fb
```
![fb](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/blob/master/images/fb.PNG)

```
GOOG
```
![fb](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/blob/master/images/GOOG.PNG)


## Ejecutando las pruebas




1. Compilar pruebas

```
mvn test
```

![Test](https://github.com/Jose1102/PicasYFamasGame/blob/master/images/tests.PNG)

## Diagrama de clases 📖


* Se tiene una clase principal donde se hace el llamado a metodos como conexion que hace el llamado a la URL que conecta a un JSON. También se tiene metodos como inputData que nos retorna un string de un formulario realizado en html y por último resultsPage que nos muestra el nombre y apellido colocado en el formulario


![Main](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/blob/master/images/diagrama/App.PNG)


* Por otro lado, se tiene una clase abstracta HttpSocketService donde implementa la conexión a una URL que nos retorna un objeto de tipo JSON, la clase que lo implementa AlphaHttpStockService realiza un get y set de esta URL

![Main](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/blob/master/images/diagrama/HttpService.PNG)


## Productividad
La productividad de este proyecto fue:
* 309 loc / 33 hours

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/tree/master/doc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/MicroServicio-AREP-Tarea1/blob/master/LICENSE.txt) para obtener más detalles.
