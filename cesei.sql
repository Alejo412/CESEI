CREATE DATABASE ceseci;
USE ceseci;


CREATE TABLE rol(
    id_rol INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30)
);

INSERT INTO rol (nombre) VALUES ('Administrador');
INSERT INTO rol (nombre) VALUES ('Vigilante');


CREATE TABLE administrador(
    id_administrador VARCHAR(30) PRIMARY KEY,
    nombres VARCHAR(20),
    apellidos VARCHAR(20),
    correo VARCHAR(50),
    telefono VARCHAR(21),
    f_nacimiento DATE,
    rol INT,
    FOREIGN KEY (rol) REFERENCES rol(id_rol)
);

CREATE TABLE sede(
    id_sede VARCHAR(30) PRIMARY KEY,
    direccion VARCHAR(50),
    contacto VARCHAR(45),
    id_administrador VARCHAR(30),
    FOREIGN KEY (id_administrador) REFERENCES administrador(id_administrador)
);

CREATE TABLE vigilante(
    id_vigilante VARCHAR(30),
    nombre VARCHAR(15),
    apellidos VARCHAR(20),
    correo VARCHAR(50),
    f_nacimiento DATE,
    rol INT,
    PRIMARY KEY (id_vigilante),
    FOREIGN KEY (rol) REFERENCES rol(id_rol)
);

CREATE TABLE vigilante_sede(
    id_vigilante VARCHAR(30),
    id_sede VARCHAR(30),
    fecha_i DATE,
    fecha_f DATE,
    PRIMARY KEY (id_vigilante, id_sede),
    FOREIGN KEY (id_vigilante) REFERENCES vigilante(id_vigilante),
    FOREIGN KEY (id_sede) REFERENCES sede(id_sede)
);

CREATE TABLE modulo(
    id_modulo VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(30),
    descripcion VARCHAR(50)
);

CREATE TABLE permisos(
    id_rol INT,
    id_modulo VARCHAR(20),
    permiso_select TINYINT(1), 
    permiso_insert TINYINT(1),
    permiso_update TINYINT(1), 
    permiso_delete TINYINT(1),
    PRIMARY KEY (id_rol, id_modulo),
    FOREIGN KEY (id_rol) REFERENCES rol(id_rol),
    FOREIGN KEY (id_modulo) REFERENCES modulo(id_modulo)
);

CREATE TABLE computador(
    codigo VARCHAR(20) PRIMARY KEY,
    marca VARCHAR(15)
);

CREATE TABLE usuario(
    id_usuario VARCHAR(30) PRIMARY KEY,
    nombres VARCHAR(20),
    apellidos VARCHAR(20),
    telefono VARCHAR(20)
);

CREATE TABLE usuario_computador(
    id_usuario VARCHAR(30),
    codigo_computador VARCHAR(20),
    fecha_ingreso DATE,
    fecha_salida DATE,
    PRIMARY KEY (id_usuario, codigo_computador),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (codigo_computador) REFERENCES computador(codigo)
);
