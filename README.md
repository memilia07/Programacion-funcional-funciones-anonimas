# Programacion-funcional-funciones-anonimas
## CASO 1: Apache Spark

**Problema que resuelve:** 

- Apache Spark es una herramienta que permite procesar grandes cantidades de datos de manera rápida. Se utiliza cuando se necesita analizar información que puede estar distribuida en diferentes computadoras, por ejemplo, registros de ventas, información de usuarios o archivos de gran tamaño.

**Lenguaje o herramienta:** 

- Utiliza Apache Spark, que permite desarrollar aplicaciones en diferentes lenguajes, entre ellos Scala, Python y Java. En Scala se pueden utilizar operaciones como map y reduce, que reciben funciones anónimas para procesar los datos.

**Ventaja del enfoque funcional:** 

- Permite transformar y procesar grandes cantidades de información mediante funciones pequeñas, sin tener que escribir manualmente todos los ciclos. Además, Spark puede distribuir el trabajo entre varios equipos, haciendo que el procesamiento sea más eficiente.

**Fragmento de código:**

<img width="702" height="91" alt="image" src="https://github.com/user-attachments/assets/fbb7a26f-1d9a-4a97-9bcc-c949f043aa6b" />

- En este ejemplo, map calcula la cantidad de caracteres de cada línea del archivo y reduce suma todos los resultados para obtener el total de caracteres. Las expresiones s => s.length y (a, b) => a + b son funciones anónimas.


**Fuente consultada:**

[ Documentación oficial de Apache Spark (spark.apache.org)](https://spark.apache.org/docs/latest/rdd-programming-guide).

**CASO 2: Pandas en Python**


**Problema que resuelve:**

- Pandas es una biblioteca de Python que permite trabajar con grandes conjuntos de datos organizados en tablas. Se utiliza para analizar, organizar, limpiar y transformar información, por ejemplo, datos financieros, estadísticas o registros de diferentes actividades.

**Lenguaje o herramienta:**

- Utiliza Python mediante la biblioteca pandas. Esta herramienta cuenta con operaciones como map y apply, que permiten utilizar funciones anónimas para modificar o transformar los datos.

**Ventaja del enfoque funcional:**

- Permite realizar operaciones sobre muchos datos de una manera sencilla, sin tener que recorrer cada elemento manualmente. Las funciones anónimas facilitan la aplicación de cálculos y transformaciones directamente sobre los datos.

**Fragmento de código:**

<img width="405" height="157" alt="image" src="https://github.com/user-attachments/assets/104906f9-4d47-470f-8b16-36a3c725dd76" />

- En este ejemplo se utiliza la función apply() de pandas junto con una función anónima para elevar al cuadrado cada uno de los valores de una serie. La expresión lambda x: x**2 recibe cada número y lo multiplica por sí mismo. Finalmente, se muestran los resultados manteniendo los nombres de las ciudades.


**Fuente consultada:**

[https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.Series.apply.html](https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.Series.apply.html)


## PARTE 2 – Entender: ¿qué es una función anónima?

**2.1 ¿Qué es una función anónima y de dónde viene el nombre lambda?**

- Una función anónima es una función que no tiene un nombre propio y que permite realizar una operación directamente. Se utiliza para ejecutar instrucciones sin necesidad de declarar una función por separado.
- El nombre lambda viene del cálculo lambda, un modelo matemático creado por Alonzo Church, que utiliza la letra griega λ (lambda) para representar funciones.

  **Ejemplo en Scala:**

  <img width="1165" height="127" alt="image" src="https://github.com/user-attachments/assets/19106c58-9160-495b-800d-a5b0aadd1c65" />

  En este ejemplo, x => x * 2 es una función anónima que recibe cada número y lo multiplica por 2.

  **2.2 ¿En qué se diferencia de una función nombrada? Escribe la misma lógica de ambas formas.**

- La diferencia es que una función nombrada tiene un nombre que permite identificarla y llamarla cuando sea necesario, mientras que una función anónima no tiene un nombre propio y normalmente se utiliza directamente en una operación.

  **Ejemplo en Scala:**

<img width="1342" height="235" alt="image" src="https://github.com/user-attachments/assets/1440d5e4-b86f-4b7c-9be9-5fa1bb8b6342" />

Las dos realizan la misma operación, que es multiplicar un número por 2. La diferencia está en la forma en que se escriben y se utilizan.

**2.3 ¿Qué significa que las funciones sean ciudadanos de primera clase? ¿Por qué eso permite pasar una lambda a map o filter?**

- Significa que las funciones se pueden utilizar como cualquier otro valor. Es decir, se pueden guardar en variables, enviar como argumentos a otras funciones y devolver como resultados.
  Esto permite pasar funciones anónimas directamente a operaciones como map y filter, porque estas reciben una función para realizar su trabajo.

    **Ejemplo en Scala:**
  
<img width="1158" height="90" alt="image" src="https://github.com/user-attachments/assets/98223df6-5f16-4b42-ac4f-acbd0e0d5485" />

En este ejemplo, map utiliza una función anónima para multiplicar los números por 2, mientras que filter utiliza otra para seleccionar solamente los números pares.

**2.4 ¿Qué es un closure? Muestra una lambda que use una variable definida fuera de ella.**

- Un closure es una función que utiliza una variable que fue definida fuera de ella. La función puede acceder a esa variable y utilizarla aunque no forme parte de sus parámetros.

    **Ejemplo en Scala:**

  <img width="1318" height="126" alt="image" src="https://github.com/user-attachments/assets/1a610c12-29d9-4ba1-9f45-744d465132e7" />

  En este ejemplo, la variable factor está definida fuera de la función anónima. Sin embargo, la función puede utilizarla para multiplicar el número recibido por 3. Esto es un ejemplo de closure.


  ## Parte 3: Problemas prácticos

### 3.1 Selección

**Pregunta:** ¿Qué productos tienen un precio mayor a $30?

- Se utiliza `filter` para recorrer la lista y seleccionar solamente los productos que cumplen con la condición de tener un precio mayor a $30.

**Resultado:** Laptop, Silla, Mesa, Audífonos y Lámpara.

### 3.2 Transformación

**Pregunta:** ¿Cuáles son los nombres de todos los productos?

- Se utiliza `map` para transformar cada producto y obtener únicamente su nombre.

**Resultado:** Laptop, Mouse, Teclado, Silla, Mesa, Cuaderno, Lápiz, Mochila, Audífonos y Lámpara.

### 3.3 Validación

**Pregunta:** ¿Existe algún producto que no tenga stock?

- Se utiliza `exists` para comprobar si al menos un producto cumple con la condición de tener stock igual a cero. Devuelve un valor booleano.

**Resultado:** `false`, porque todos los productos tienen unidades disponibles.

### 3.4 Conteo

**Pregunta:** ¿Cuántos productos tienen un precio mayor a $30?

- Se utiliza `count` para contar cuántos productos cumplen con la condición establecida.

**Resultado:** 5 productos.

  


  


  

