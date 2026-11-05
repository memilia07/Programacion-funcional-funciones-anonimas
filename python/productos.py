from dataclasses import dataclass

@dataclass
class Producto:
    nombre: str
    categoria: str
    precio: float
    stock: int


productos = [
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
]

# Selección
productos_caros = list(
    filter(lambda p: p.precio > 30, productos)
)

print("Productos con precio mayor a $30:")

for p in productos_caros:
    print(p.nombre)