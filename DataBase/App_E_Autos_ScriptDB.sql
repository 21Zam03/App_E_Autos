use app_e_autos_db;

create table Autos (
	cod_auto int not null auto_increment,
    brand varchar(45) not null,
    model varchar(45) not null,
    engine_e varchar(45) not null,
	color varchar(45) not null,
    license_plate varchar(45) not null,
    car_door varchar (3) not null,
    primary key (cod_auto)
);

DELIMITER $$
create procedure sp_insert_car(brand varchar(45),  model varchar(45), engine_e varchar(45), color varchar(45), 
license_plate varchar(45), car_door varchar(45))
BEGIN
    insert into Autos (brand, model, engine_e, color, license_plate, car_door) values
    (brand, model, engine_e, color, license_plate, car_door);
END$$

DELIMITER $$
create procedure sp_listar_autos()
BEGIN
    select * from autos;
END$$

DELIMITER $$
create procedure sp_eliminar_auto(cod int)
BEGIN
    delete from autos where cod_auto = cod;
END$$

DELIMITER $$
create procedure sp_traer_auto(cod int)
BEGIN
    select * from autos where cod_auto = cod;
END$$

DELIMITER $$
create procedure sp_actualizar_auto(cod int, modelo varchar(45), marca varchar(45), motor varchar(45), 
color_c varchar(45), placa varchar(45), puerta varchar(3))
BEGIN
    update autos set brand = marca where cod_auto = cod;
    update autos set model = modelo where cod_auto = cod;
    update autos set engine_e = motor where cod_auto = cod;
    update autos set color = color_c where cod_auto = cod;
    update autos set license_plate = placa where cod_auto = cod;
    update autos set car_door = puerta where cod_auto = cod;
END$$

select * from autos;
call sp_traer_auto(2);