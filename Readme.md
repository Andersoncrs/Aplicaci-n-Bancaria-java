# Aplicación Bancaria en Java

Este proyecto es una **aplicación bancaria simple** desarrollada en **Java**, que permite a los usuarios realizar operaciones básicas de manejo de cuentas bancarias de manera intuitiva y eficiente.

## **Funcionalidades Principales**
- **Consultar saldo**: Permite visualizar el saldo actual de la cuenta.
- **Retirar fondos**: Realiza retiros con validación para evitar operaciones no válidas.
- **Depositar fondos**: Permite realizar depósitos asegurando que el monto ingresado sea válido.
- **Interfaz de usuario basada en consola**: Interacción mediante un menú sencillo y directo.
- **Código modular y organizado**: Facilita la lectura y el mantenimiento del código.

## **Estructura del Proyecto**
El proyecto está organizado en las siguientes clases:

1. **`Main.java`**:
    - Contiene el método principal `main`.
    - Se encarga de la inicialización de la aplicación, mostrando el menú y gestionando la interacción con el usuario.

2. **`Cuenta.java`**:
    - Representa una cuenta bancaria.
    - Incluye los métodos `consultarSaldo`, `retirarFondos` y `depositarFondos`, encapsulando la lógica y los datos relevantes.

## **Cómo Ejecutar el Proyecto**

1. **Requisitos previos**:
    - Instala [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) en tu sistema.
    - Configura correctamente la variable de entorno `JAVA_HOME`.

2. **Pasos**:
    - Clona el repositorio o descarga los archivos del proyecto.
      ```bash
      git clone <URL del repositorio>
      cd <directorio del proyecto>
      ```
    - Compila los archivos fuente:
      ```bash
      javac Main.java Cuenta.java
      ```
    - Ejecuta la aplicación:
      ```bash
      java Main
      ```

## **Ejemplos de Uso**
1. Al iniciar la aplicación:
    - El usuario debe ingresar su **nombre** y el **saldo inicial** de la cuenta.

2. Operaciones disponibles:
    - **Consultar saldo**: Muestra el saldo actual.
    - **Retirar fondos**: Solicita el monto a retirar. Valida que no se supere el saldo disponible.
    - **Depositar fondos**: Solicita el monto a depositar. Valida que sea mayor a cero.
    - **Salir**: Finaliza la ejecución con un mensaje de despedida.

### **Ejemplo del menú en consola**
```plaintext
Seleccione una opción:
1. Consultar saldo
2. Retirar fondos
3. Depositar fondos
9. Salir
```

## **Consideraciones Futuras**
- Implementar una **interfaz gráfica de usuario (GUI)** para mayor accesibilidad.
- Agregar la funcionalidad de **transferencias entre cuentas**.
- Incorporar un **historial de transacciones** para seguimiento detallado.
- Implementar **persistencia de datos** usando archivos o bases de datos.

## **Contribuciones**
¡Las contribuciones son bienvenidas! Si encuentras un error o tienes ideas para mejorar la aplicación:
1. Abre un **issue** para discutir el problema o la mejora.
2. Envía un **pull request** con tus cambios.

Por favor, asegúrate de seguir las mejores prácticas de codificación.

## **Licencia**
Este proyecto se distribuye bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

## **Autor**
Desarrollado por Anderson Camilo Rodríguez Salvador.  
¡Gracias por probar esta aplicación y ayudar a mejorarla!