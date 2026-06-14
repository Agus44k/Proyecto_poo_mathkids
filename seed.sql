-- seed.sql
-- Minimal example data for Proyecto_poo_mathkids

INSERT INTO students (name, email) VALUES ('Alumno Ejemplo', 'alumno@example.com');

-- If you want a score for that student (student_id = 1 assuming empty DB):
INSERT INTO scores (student_id, score, difficulty) VALUES (1, 100, 1);

-- Usage:
-- sqlite3 mathkids.db < schema.sql
-- sqlite3 mathkids.db < seed.sql
