CREATE TABLE empleado(
  id_empleado NUMBER(10) NOT NULL,
  nombres VARCHAR2(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  nss VARCHAR(10) NOT NULL,
  estado_civil VARCHAR2(1) NOT NULL,
  genero VARCHAR2(1) NOT NULL,
  edad NUMBER(3) NOT NULL
);

ALTER TABLE empleado ADD CONSTRAINT id_empleado_pk PRIMARY KEY (id_empleado);
