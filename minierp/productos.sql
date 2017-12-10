create database minierp;

use minierp; 

create table cliente (
	codigo varchar(6), 
	estado int, 
	ruc varchar(20), 
	nombres varchar(50), 
	direccion varchar(60), 
	ciudad varchar(30), 
	fecha_registro date, 
	tipo int, 
	limiteCredito decimal(15, 2), 
	correo varchar(50), 
	telefono varchar(15)
); 

create table articulo (
	codigo varchar(16), 
	descripcion varchar(40), 
	stock numeric(15, 0), 
	precio numeric(15, 2)
);
