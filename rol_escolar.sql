use rol_escolar;

create table Persona(
	idPersona INT AUTO_INCREMENT PRIMARY KEY,
    codigoMatricula INT NOT NULL,
    nombre VARCHAR(50),
    paterno VARCHAR(50),
    materno VARCHAR(50),
    telefono VARCHAR(20),
    email VARCHAR(100),
    fecha_nacimiento DATE,
    fecha_ingreso DATE
);

create table Estudiante(
	idEstudiante INT PRIMARY KEY,
    becado VARCHAR(50),
    carrera VARCHAR(100),
    promedio_Actual DECIMAL(4,2),
    FOREIGN KEY (idEstudiante) REFERENCES Persona(idPersona)
);

create table Profesor(
	idProfesor INT PRIMARY KEY,
    salario_hora DECIMAL(4,2),
    ultimoGradoAcademico VARCHAR(100),
    horasImparte INT,
    FOREIGN KEY (idProfesor) REFERENCES Persona(idPersona)
);

CREATE TABLE Domicilio (
    idDomicilio INT PRIMARY KEY AUTO_INCREMENT,
    calle VARCHAR(100),
    ciudad VARCHAR(50),
    estado VARCHAR(50),
    codigo_postal INT,
    pais VARCHAR(50),
    idPersona INT UNIQUE,
    FOREIGN KEY (idPersona) REFERENCES Persona(idPersona)
);

CREATE TABLE Materia (
    idMateria INT PRIMARY KEY AUTO_INCREMENT,
    cve_materia INT NOT NULL,
    nombreMateria VARCHAR(100),
    vigente VARCHAR(10)
);

CREATE TABLE PersonaMateria (
    idPersona INT NOT NULL,
    idMateria INT NOT NULL,
    PRIMARY KEY (idPersona, idMateria),
    FOREIGN KEY (idPersona) REFERENCES Persona(idPersona) ON DELETE CASCADE,
    FOREIGN KEY (idMateria) REFERENCES Materia(idMateria)
);
