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

### ORTIZ SANCHEZ REBECA 

### SUSANO SANCHEZ IVAN ALFONSO 16210580

## DOCENTE:

### JOSE CHRISTIAN ROMERO HERNANDEZ

### TIJUANA, BAJA CALIFORNIA, MÉXICO

</center>

# Uno contra todos 

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