

insert into `faztty`.`tipo_negocio` (id, nombre, descripcion) values (1,'Bodega','Productos del día a día. Diferentes tipos de producto');
insert into `faztty`.`tipo_negocio` (id, nombre, descripcion) values (2,'Dulcería','Productos de consumo rápido. Dulces, snacks, etc.');


insert into `faztty`.`usuario` (tipo, id, email, password, dni,first_name, last_name) values ('C',1, 'rosa@unmsm.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', 'kstrauss0', 'Rosa', 'Strauss');
insert into `faztty`.`usuario` (tipo, id, email, password, dni,first_name, last_name) values ('C',2, 'cfeldstern1@ucoz.ru', '$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', 'ekornel3','Elliott', 'Kornel');
insert into `faztty`.`usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',3, 'alex@listo.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', '21604816111','Bodega Margarita', "Av Marina 123",'bdm.jpg', 76,1);
insert into `faztty`.`usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',4, 'mcastro2@utmo.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', '11604816111','Cicala y Catita', "Calle Las Flores 33", 'ccc.jpg', 87,1);
insert into `faztty`.`usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',5, 'osstern100@bing.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC','21604812111', 'Minimarket Casimiro', "Av Marina 445" ,'mnmcasim.jpg', 98,2);
insert into `faztty`.`usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',6, 'mariciell0@bing.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', '21654816121','Repostera Maricielo', "Av Marina 411" ,'bdmc.jpg', 67,2);


insert into `faztty`.`categoria` (id, nombre, descripcion) values (1,'Lacteo','Productos derivados de la leche');
insert into `faztty`.`categoria` (id, nombre, descripcion) values (2,'Galleta','Galletas empaquetadas');
insert into `faztty`.`categoria` (id, nombre, descripcion) values (3,'Snack','Snacks empaquetadas, pequeños o grandes');

insert into `faztty`.`producto` (id, nombre, marca,precio,imagen,puntuacion,id_categoria,id_negocio) values (1,'Tarro de Leche Gloria Azul','Gloria', 3.50, 'gloriaazul.jpg', 78,1,3 );
insert into `faztty`.`producto` (id, nombre, marca,precio,imagen,puntuacion,id_categoria,id_negocio) values (2,'Tarro de Leche Gloria Roja','Gloria', 3.80, 'gloriaroja.jpg', 75,1,3 );
insert into `faztty`.`producto` (id, nombre, marca,precio,imagen,puntuacion,id_categoria,id_negocio) values (3,'Empaque Queso Crema','Philadelphia', 7.50 ,'quesophil.jpg', 68,1,3 );

insert into `faztty`.`producto` (id, nombre, marca,precio,imagen,puntuacion,id_categoria,id_negocio) values (4,'Tarro de Leche Gloria','Gloria', 3.50, 'gloriaazul.jpg', 78,1,4 );
insert into `faztty`.`producto` (id, nombre, marca,precio,imagen,puntuacion,id_categoria,id_negocio) values (5,'Leche Condensada','Gloria', 5.00, 'condensada.jpg', 89,1,4 );

