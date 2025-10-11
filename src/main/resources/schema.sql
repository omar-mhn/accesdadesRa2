DROP TABLE IF EXISTS students;

-- Crea una nueva tabla llamada 'students' para almacenar información de los estudiantes.

CREATE TABLE students(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,  
    name VARCHAR(100) NOT NULL,            
    age INT DEFAULT 0                  
);
