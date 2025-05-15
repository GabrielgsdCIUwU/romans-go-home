# romans-go-home

¿De qué trata este proyecto?
----------------------------
Este proyecto es una aplicación sencilla hecha en Java que te permite convertir números romanos (como los que ves en relojes antiguos o monumentos) a números normales (decimales, como 1, 2, 3, etc.).

Por ejemplo, si escribes el número romano "XIV", la aplicación te dirá que su valor es 14.

¿Para qué sirve?
----------------
Sirve para ayudarte a entender y trabajar con los números romanos, que se usaban en la antigua Roma y todavía aparecen en algunos lugares hoy en día.

¿Cómo se usa?
-------------
1. Descarga o clona este proyecto en tu computadora.
2. Abre una terminal o consola de comandos en la carpeta del proyecto.
3. Ejecuta el programa siguiendo las instrucciones de la siguiente sección.
4. Cuando el programa te lo pida, escribe un número romano (por ejemplo: IX, XXIV, LXXX).
5. El programa te mostrará el número decimal correspondiente.

Estructura del proyecto
-----------------------
- src/             → Carpeta donde está el código fuente de la aplicación.
    - main/java/edu/estatuas/ → Código principal (App.java, RomanNumber.java, RomanNumbersValue.java)
    - test/java/edu/estatuas/ → Pruebas automáticas (NumeroRomanoTest.java)
- pom.xml          → Archivo de configuración de Maven.
- LICENSE          → Licencia del proyecto.
- .gitignore, .gitattributes, .vscode/ → Archivos de configuración y control de versiones.

Requisitos
----------
- Tener instalado Java (versión 21 o superior recomendada).
- Tener instalado Maven (para compilar y ejecutar fácilmente).
- Acceso a una terminal o consola de comandos.

Cómo compilar y ejecutar el programa
------------------------------------
1. Abre la terminal en la carpeta del proyecto.
2. Compila el proyecto con Maven:
   mvn clean package
3. Ejecuta el programa con el siguiente comando:
   java -cp target/romans-1.0.0.jar edu.estatuas.App
4. Sigue las instrucciones que aparecen en pantalla.

Cómo ejecutar las pruebas automáticas
-------------------------------------
1. En la terminal, ejecuta:
   mvn test

