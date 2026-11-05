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

## CASO 2: Pandas en Python


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

### 2.1 ¿Qué es una función anónima y de dónde viene el nombre lambda?

- Una función anónima es una función que no tiene un nombre propio y que permite realizar una operación directamente. Se utiliza para ejecutar instrucciones sin necesidad de declarar una función por separado.
- El nombre lambda viene del cálculo lambda, un modelo matemático creado por Alonzo Church, que utiliza la letra griega λ (lambda) para representar funciones.

  **Ejemplo en Scala:**

  <img width="1165" height="127" alt="image" src="https://github.com/user-attachments/assets/19106c58-9160-495b-800d-a5b0aadd1c65" />

  En este ejemplo, x => x * 2 es una función anónima que recibe cada número y lo multiplica por 2.

### 2.2 ¿En qué se diferencia de una función nombrada? Escribe la misma lógica de ambas formas.

- La diferencia es que una función nombrada tiene un nombre que permite identificarla y llamarla cuando sea necesario, mientras que una función anónima no tiene un nombre propio y normalmente se utiliza directamente en una operación.

  **Ejemplo en Scala:**

<img width="1342" height="235" alt="image" src="https://github.com/user-attachments/assets/1440d5e4-b86f-4b7c-9be9-5fa1bb8b6342" />

Las dos realizan la misma operación, que es multiplicar un número por 2. La diferencia está en la forma en que se escriben y se utilizan.

### 2.3 ¿Qué significa que las funciones sean ciudadanos de primera clase? ¿Por qué eso permite pasar una lambda a map o filter?

- Significa que las funciones se pueden utilizar como cualquier otro valor. Es decir, se pueden guardar en variables, enviar como argumentos a otras funciones y devolver como resultados.
  Esto permite pasar funciones anónimas directamente a operaciones como map y filter, porque estas reciben una función para realizar su trabajo.

    **Ejemplo en Scala:**
  
<img width="1158" height="90" alt="image" src="https://github.com/user-attachments/assets/98223df6-5f16-4b42-ac4f-acbd0e0d5485" />

En este ejemplo, map utiliza una función anónima para multiplicar los números por 2, mientras que filter utiliza otra para seleccionar solamente los números pares.

### 2.4 ¿Qué es un closure? Muestra una lambda que use una variable definida fuera de ella.

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

  ## Parte 4 – Ampliar: cuatro operaciones nuevas

  ### 4.1 Operaciones elegidas

Para esta parte elegí cuatro operaciones de las colecciones de Scala:

1. **sortBy:** pertenece a la familia de ordenar.
2. **groupBy:** pertenece a la familia de agrupar.
3. **partition:** pertenece a la familia de dividir una lista.
4. **find:** pertenece a la familia de buscar.

 ### 4.2 Fichas de cada operación

#### 1. sortBy – Ordenar

**¿Qué hace?**

- Ordena los elementos de una lista según una característica, como el precio de los productos.

**¿Qué función anónima recibe?**

- Recibe una función anónima que devuelve el valor por el cual se desea ordenar. En este caso, devuelve el precio del producto, que es un número decimal (`Double`).

**Ejemplo en Scala:**

```scala
productos.sortBy(p => p.precio)
```

**Salida:**

<img width="1012" height="312" alt="image" src="https://github.com/user-attachments/assets/18f92792-2a20-4a87-ba09-2438eaa5d153" />

Los productos aparecen ordenados desde el de menor precio hasta el de mayor precio.

**Problema que resuelve:**

- Permite organizar los productos por precio para identificar los más económicos y los más costosos. Se relaciona con la transformación y organización de datos.
  
---

### 2. groupBy – Agrupar

**¿Qué hace?**

Agrupa los elementos de una lista según una característica que tengan en común, por ejemplo, la categoría de los productos.

**¿Qué función anónima recibe?**

Recibe una función anónima que devuelve el valor que se utilizará para agrupar los elementos. En este caso, devuelve la categoría del producto, que es un texto (`String`).

**Ejemplo en Scala:**

```scala
productos.groupBy(p => p.categoria)
```

**Salida:**

scala

<img width="1195" height="181" alt="image" src="https://github.com/user-attachments/assets/f19044d2-cf8e-48da-a80b-74ff9a9af115" />


**Problema que resuelve:**

Permite organizar los productos por categorías para conocer qué artículos pertenecen a cada grupo. Se relaciona con la organización de datos.

---

#### 3. partition – Dividir una lista

**¿Qué hace?**

Divide una lista en dos grupos: los elementos que cumplen una condición y los que no la cumplen.

**¿Qué función anónima recibe?**

Recibe una función anónima que devuelve un valor booleano (`true` o `false`), dependiendo de si el producto cumple con la condición.

**Ejemplo en Scala:**

```scala
productos.partition(p => p.precio > 30)
```

**Salida:**

scala

<img width="417" height="287" alt="image" src="https://github.com/user-attachments/assets/f394d1d7-74d2-402e-9a80-3f270520f931" />



**Problema que resuelve:**

Permite separar los productos costosos de los económicos para analizar sus precios. Se relaciona con el problema de selección.

---

#### 4. find – Buscar

**¿Qué hace?**

Busca el primer elemento de una lista que cumple con una condición y devuelve ese elemento.

**¿Qué función anónima recibe?**

Recibe una función anónima que devuelve un valor booleano (`true` o `false`) para comprobar si el elemento cumple con la condición.

**Ejemplo en Scala:**

```scala
productos.find(p => p.nombre == "Audífonos")
```

**Salida:**

scala

<img width="851" height="80" alt="image" src="https://github.com/user-attachments/assets/33686309-8428-418e-998c-6baf3fb7024f" />


**Problema que resuelve:**

Permite encontrar un producto específico dentro de un inventario sin tener que revisar manualmente toda la lista. Se relaciona con el problema de búsqueda.

---

### 4.3 Combinar operaciones

**Pregunta:** ¿Cómo podemos separar los productos tecnológicos según si cuestan más de $40, después de ordenarlos por precio?

**Código en Scala:**

```scala
val resultadoCombinado = productos
  .filter(p => p.categoria == "Tecnología")
  .sortBy(p => p.precio)
  .partition(p => p.precio > 40.0)

resultadoCombinado
```

**Explicación de cada paso:**

1. `filter`: selecciona los productos que pertenecen a la categoría Tecnología.
2. `sortBy`: ordena los productos seleccionados de menor a mayor precio.
3. `partition`: divide los productos en dos listas, los que cuestan más de $40 y los que cuestan $40 o menos.

**Operaciones utilizadas:**

- `filter`: operación vista en clase.
- `sortBy`: operación nueva.
- `partition`: operación nueva.

**Resultado:**


<img width="1191" height="107" alt="image" src="https://github.com/user-attachments/assets/43fc2996-1131-4d4c-9b5f-3fe0a2dbd52a" />


<img width="1200" height="97" alt="image" src="https://github.com/user-attachments/assets/109e8406-d39c-4c4b-914b-ea21272ea28b" />


Se obtienen dos listas de productos tecnológicos, separadas según su precio.


## Parte 5 – Comparar y concluir 

### 5.1 Scala, Java y Python frente a frente


<img width="942" height="427" alt="Captura de pantalla 2026-11-05 030636" src="https://github.com/user-attachments/assets/e1a8c7bf-cc98-40e6-ad12-c44d7e218aab" />



**¿En qué lenguaje fue más natural resolver los problemas?**

- Para mí, Scala fue el lenguaje más natural porque sus operaciones permiten trabajar directamente con listas y las funciones anónimas tienen una sintaxis sencilla. Además, el código queda más corto y fácil de entender.

**¿En qué tipo de problema encontraste más diferencias entre lenguajes y por qué?**

- Encontré más diferencias en el problema de validación, porque en Scala se utiliza exists, en Java anyMatch y en Python any. Aunque los tres permiten comprobar si algún producto cumple una condición, cada lenguaje utiliza una función diferente para hacerlo.


### 5.2 Conclusion

Las funciones anónimas son importantes porque permiten realizar operaciones sobre listas de una manera más sencilla, sin necesidad de crear funciones adicionales para cada tarea. Con ellas podemos seleccionar, transformar, buscar y comprobar información de los elementos de una lista, haciendo que el código sea más corto y fácil de mantener.

Un ejemplo de su utilidad se puede observar en los sistemas de inventario, donde es necesario revisar los productos, conocer sus precios, identificar cuáles no tienen stock y organizarlos por categorías. Gracias a las funciones anónimas podemos realizar estas operaciones de forma rápida y eficiente, facilitando el manejo de la información.


 


  


  


  

