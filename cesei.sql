CREATE DATABASE cesei;
USE cesei;



CREATE TABLE usuario(
    id_usuario VARCHAR(30) PRIMARY KEY,
    tipo VARCHAR(20),
    nombres VARCHAR(20),
    apellidos VARCHAR(20),
    correo VARCHAR(50),
    password VARCHAR(255),
    telefono VARCHAR(21),
    f_nacimiento DATE,
    foto LONGBLOB DEFAULT NULL
);

CREATE TABLE sede(
    id_sede VARCHAR(30) PRIMARY KEY,
    direccion VARCHAR(50),
    contacto VARCHAR(45),
    id_usuario VARCHAR(30),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE usuario_sede(
    numero_adjuntar INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario VARCHAR(30),
    id_sede VARCHAR(30),
    fecha_inicio DATETIME DEFAULT NULL,
    fecha_fin DATETIME DEFAULT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_sede) REFERENCES sede(id_sede)
);

CREATE TABLE persona(
    id_persona VARCHAR(30) PRIMARY KEY,
    nombres VARCHAR(20),
    apellidos VARCHAR(20),
    telefono VARCHAR(20)
);


CREATE TABLE computador(
    codigo VARCHAR(30) PRIMARY KEY,
    marca VARCHAR(15),
    id_persona VARCHAR(30),
    FOREIGN KEY (id_persona) REFERENCES persona(id_persona)
);



CREATE TABLE persona_computador(
    id_ingreso INT AUTO_INCREMENT PRIMARY KEY,
    id_persona VARCHAR(30),
    codigo_equipo VARCHAR(30),
    fecha_ingreso DATETIME DEFAULT NULL,
    fecha_salida DATETIME DEFAULT NULL,
    id_usuario VARCHAR(30),
    FOREIGN KEY (id_persona) REFERENCES persona(id_persona),
    FOREIGN KEY (codigo_equipo) REFERENCES computador(codigo),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

DELIMITER //
CREATE TRIGGER actualizar_tipo BEFORE INSERT ON usuario 
    FOR EACH ROW
    BEGIN 
        IF NEW.correo LIKE '%@vigilante%' THEN
            SET NEW.tipo = 'Vigilante';
        ELSEIF NEW.correo LIKE '%@admin%' THEN
            SET NEW.tipo = 'Administrador';
        END IF;
    END;
//
DELIMITER ;


