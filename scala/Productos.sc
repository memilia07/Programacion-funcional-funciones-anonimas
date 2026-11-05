case class Producto(
                     nombre: String,
                     categoria: String,
                     precio: Double,
                     stock: Int
                   )

val productos = List(
  Producto("Laptop", "Tecnología", 800, 5),
  Producto("Mouse", "Tecnología", 15, 20),
  Producto("Teclado", "Tecnología", 30, 12),
  Producto("Silla", "Muebles", 120, 8),
  Producto("Mesa", "Muebles", 200, 4),
  Producto("Cuaderno", "Papelería", 3, 50),
  Producto("Lápiz", "Papelería", 1, 100),
  Producto("Mochila", "Accesorios", 25, 15),
  Producto("Audífonos", "Tecnología", 45, 10),
  Producto("Lámpara", "Hogar", 35, 7)
)

// Selección
val productosCaros = productos.filter(p => p.precio > 30)
println("Productos con precio mayor a $30:")
productosCaros.foreach(p => println(p.nombre))

val nombres = productos.map(p => p.nombre)
println("Nombres de los productos:")
nombres.foreach(println)

val sinStock = productos.exists(p => p.stock == 0)
println("¿Existe algún producto sin stock?")
println(sinStock)

val cantidad = productos.count(p => p.precio > 30)
println("Cantidad de productos con precio mayor a $30:")
println(cantidad)