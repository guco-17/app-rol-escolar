# Sistema de Gestión Escolar
## 🗣️ Español:
The following content is in Spanish, if you want to read the readme in English, scroll down to the English section.
El siguiente contenido está en Español, si desea leer el readme en Inglés, desplace hacia abajo a la sección en Inglés.
## 📝 Descripción:
Este repositorio contiene la implementación de un sistema básico de Gestión Escolar desarrollado en Java para la clase de "Diseño y Arquitectura de Software".
El proyecto sigue un diseño estructurado usando el patrón Data Access Object (DAO) para la persistencia de datos.
Se incluyen la capa de modelo (POO) la capa DAO (acceso a los datos) y una GUI en Swing para la implementación del usuario.
## 🎯 Objetivo:
El objetivo principal de este proyecto es:
- Aplicar los conocimientos adquiridos en la materia.
- Modelar las entidades clave de un sistema escolar (Persona, Estudiante, Profesor, Materia) mediante Programación Orientada a Objetos (POO).
- Implementar el patrón DAO para asegurar una separación limpia de responsabilidades entre la lógica de negocio y la gestión de la base de datos.
- Garantizar el manejo correcto de los recursos de conexión JDBC, evitando fugas de memoria y errores con la base de datos.
## 🚀 Características principales:
- Patrón DAO: Abstracción completa de las operaciones de la base de datos para la capa de negocio.
- Conexión Segura: Implementación de la clase ConexionDB para obtener y gestionar la conexión.
- CRUD Completo: Métodos para Crear, Leer (con Listado General), Actualizar y Eliminar (CRUD) en las entidades principales.
- Manejo de Relaciones: Gestión eficiente de las materias asociadas a un estudiante, resolviendo la lectura de datos anidados.
- Interfaz Gráfica (GUI): Formularios en Java Swing para el registro y la visualización de datos de estudiantes.
## 💻 Tecnologías Usadas:
- Java (Versión superior a la 8).
- JDBC (Java Database Connectivity): para la comunicación con la base de datos.
- MySQL: Sistema gestor de base de datos.
- Java Swing: Para construír la GUI.
- IDE: Netbeans.
## 🏗️ Estructura del Proyecto:
El proyecto está organizado en capas lógicas separadas en paquetes:
- rol_escolar:
  -  Clases del modelo POO (Estudiante, Profesor, Persona, Materia, Domicilio).
- modelo:
  - Clases de acceso a datos: (EstudianteDAO, MateriaDAO, ConexionBD).
- vista:
  - Clases de la interfaz gra´fica (registroMaterias, registroEstudiantes, Inicio, TablaEstudiantes).
## ❗Uso:
Continuará...
