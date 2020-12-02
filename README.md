![tec](https://i.imgur.com/DKIVS3c.png)

<center>

### TECNOLÓGICO NACIONAL DE MÉXICO

### INSTITUTO TECNOLÓGICO DE TIJUANA

### SUBDIRECCIÓN ACADÉMICA

### DEPARTAMENTO DE SISTEMAS Y COMPUTACIÓN

### SEMESTRE

### SEPTIEMBRE 2020 - ENERO 2021

### Datos Masivos

### BDD-1704TI9A

### REPOSITORIO DE LA MATERIA

## EQUIPO: 7

## TEMA: ONE VS REST

### SAÑUDO CAMACHO LEONARDO DANIEL 15212166

### OSUNA ENCISO PABLO ALEJANDRO 16210279

### ORTIZ SANCHEZ MARTHA REBECA 15212340

### SUSANO SANCHEZ IVAN ALFONSO 16210580

## DOCENTE:

### JOSE CHRISTIAN ROMERO HERNANDEZ

### TIJUANA, BAJA CALIFORNIA, MÉXICO

<div align="justify">

# Uno contra todos 
## Introducción

También conocida como uno contra todos, esta estrategia consiste en ajustar un clasificador por clase. Para cada clasificador, la clase se ajusta a todas las demás clases. Además de su eficiencia computacional (solo se necesitan clasificadores n_classes), una ventaja de este enfoque es su interpretabilidad. Dado que cada clase está representada por uno y solo un clasificador, es posible obtener conocimiento sobre la clase inspeccionando su clasificador correspondiente. Ésta es la estrategia más utilizada para la clasificación multiclase y es una opción justa por defecto.
 
OneVsRest es un ejemplo de una reducción de aprendizaje automático para realizar una clasificación multiclase dado un clasificador base que puede realizar una clasificación binaria de manera eficiente.

OneVsRest se implementa como un Estimador. Para el clasificador base, toma instancias de Classifier y crea un problema de clasificación binaria para cada una de las k clases. El clasificador de la clase i está entrenado para predecir si la etiqueta es i o no, distinguiendo la clase i de todas las demás clases.

Las predicciones se realizan evaluando cada clasificador binario y el índice del clasificador más seguro se genera como etiqueta.

## Desarrollo 

En la clasificación uno-vs-All, para el conjunto de datos de instancias de clase N, tenemos que generar los modelos de clasificador binario N. El número de etiquetas de clase presentes en el conjunto de datos y el número de clasificadores binarios generados deben ser los mismos.

![1_RElrybCZ4WPsUfRwDl7fqA](https://i.imgur.com/2yrOfE3.png)

Tal y como se muestra en de la imagen anterior, consideremos que tenemos tres clases, por ejemplo, el tipo 1 para el verde, el tipo 2 para el azul, y el tipo 3 para el rojo.

Ahora, como se menciono anteriormente que tenemos que generar el mismo número de clasificadores que las etiquetas de clase están presentes en el conjunto de datos, así que tenemos que crear tres clasificadores aquí para tres clases respectivas.

Clasificador 1:- [Verde] vs [Rojo, Azul]
Clasificador 2:- [Azul] vs [Verde, Rojo]
Clasificador 3:- [Rojo] vs [Azul, Verde]

Ahora, para entrenar a estos tres clasificadores, necesitamos crear tres conjuntos de datos de entrenamiento. Así que vamos a considerar que nuestro conjunto de datos principal es el siguiente,

![1_1BX5o_mIzPoVI1ad2xbyEg](https://i.imgur.com/GbNs3vL.png)

Se puede ver que hay tres etiquetas de clase, **Verde, Azul y Rojo**  presentes en el conjunto de datos. 


## Ejemplo



## Conclusión 
Este metodo de clsaificacion nos ayuda bastante cuando tenemos un modelo de pocas clases, pero puede presentar errores de prediccion cuando la cantidad de clases es muy grande, pudimos observar como trabaja este algoritmo realizando clasificacion binaria cuando es un algoritmo de multiclase y ahora podemos conocer sus ventajas, como sus desventajas en su uso. 
