-- INSERT PARA TABLA usuario
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('1', 'Juan', 'jperez@gmail.com', 'pass123', 'admin');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('2', 'Maria', 'mlopez@gmail.com', 'pass456', 'vendedor');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('3', 'Carlos', 'cmartinez@gmail.com', 'pass789', 'cliente');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('4', 'Ana', 'asanchez@gmail.com', 'pass012', 'bodeguero');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('5', 'Luis', 'lgomez@gmail.com', 'pass345', 'contador');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('6', 'Javiera', 'jazua@gmail.com', 'pass123', 'vendedor');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('7', 'Sebasthian', 'ssilva@gmail.com', 'pass456', 'vendedor');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('8', 'Joel', 'jgutierrez@gmail.com', 'pass789', 'cliente');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('9', 'Miguel', 'mochoa@gmail.com', 'pass012', 'bodeguero');
-- INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, contrasena, tipo_usuario) VALUES ('10', 'Andrea', 'agonzalez@gmail.com', 'pass345', 'contador');

-- INSERT PARA TABLA administrador
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (1, '2023-01-15', 1);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (2, '2023-01-15', 2);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (3, '2023-01-15', 3);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (4, '2023-01-15', 4);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (5, '2023-01-15', 5);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (6, '2023-01-15', 6);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (7, '2023-01-15', 7);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (8, '2023-01-15', 8);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (9, '2023-01-15', 9);
-- INSERT INTO administrador (id_administrador, fecha_registro, id_usuario) VALUES (10, '2023-01-15', 10);

-- INSERT PARA TABLA cliente
-- INSERT INTO cliente (id_cliente, direccion_cliente, telefono, id_usuario) VALUES (1, 'Calle Falsa 123', 123456789, 3);
-- INSERT INTO cliente (id_cliente, direccion_cliente, telefono, id_usuario) VALUES (2, 'Calle Feliz 123', 1235896789, 8);

-- INSERT PARA TABLA sucursal
-- INSERT INTO sucursal (id_sucursal, nombre_sucursal, comuna) VALUES (1, 'Sucursal 1', 'Maipú');
-- INSERT INTO sucursal (id_sucursal, nombre_sucursal, comuna) VALUES (2, 'Sucursal 2', 'Santiago Centro');

-- INSERT PARA TABLA vendedor
-- INSERT INTO vendedor (id_vendedor, area_vendedor, id_sucursal, id_usuario) VALUES (1, 'Maquinaria Pesada', 1, 2);
-- INSERT INTO vendedor (id_vendedor, area_vendedor, id_sucursal, id_usuario) VALUES (2, 'Construcción', 1, 6);
-- INSERT INTO vendedor (id_vendedor, area_vendedor, id_sucursal, id_usuario) VALUES (3, 'Construcción', 2, 7);

-- INSERT PARA TABLA despacho
-- INSERT INTO despacho (id_despacho, estado_despacho, tarifa_despacho, fecha_despacho) VALUES (1, 'En camino', 1000, '2023-05-01');
-- INSERT INTO despacho (id_despacho, estado_despacho, tarifa_despacho, fecha_despacho) VALUES (2, 'Entregado', 1500, '2023-05-02');
-- INSERT INTO despacho (id_despacho, estado_despacho, tarifa_despacho, fecha_despacho) VALUES (3, 'Pendiente', 2000, '2023-05-03');
-- INSERT INTO despacho (id_despacho, estado_despacho, tarifa_despacho, fecha_despacho) VALUES (4, 'Cancelado', 5000, '2023-05-04');
-- INSERT INTO despacho (id_despacho, estado_despacho, tarifa_despacho, fecha_despacho) VALUES (5, 'En preparación', 1000, '2023-05-05');

-- INSERT PARA TABLA venta
-- INSERT INTO venta (id_venta, fecha_venta, id_despacho, id_cliente, id_vendedor) VALUES (1, '2023-05-01', 1, 1, 1);
-- INSERT INTO venta (id_venta, fecha_venta, id_despacho, id_cliente, id_vendedor) VALUES (2, '2023-05-02', 2, 1, 1);
-- INSERT INTO venta (id_venta, fecha_venta, id_despacho, id_cliente, id_vendedor) VALUES (3, '2023-05-03', 3, 1, 1);
-- INSERT INTO venta (id_venta, fecha_venta, id_despacho, id_cliente, id_vendedor) VALUES (4, '2023-05-04', 4, 2, 2);
-- INSERT INTO venta (id_venta, fecha_venta, id_despacho, id_cliente, id_vendedor) VALUES (5, '2023-05-05', 5, 2, 2);

-- INSERT PARA TABLA mensaje
-- INSERT INTO mensaje (id_mensaje, mensaje, id_cliente, id_vendedor) VALUES (1, 'Mensaje 1', 1, 1);
-- INSERT INTO mensaje (id_mensaje, mensaje, id_cliente, id_vendedor) VALUES (2, 'Mensaje 2', 1, 1);
-- INSERT INTO mensaje (id_mensaje, mensaje, id_cliente, id_vendedor) VALUES (3, 'Mensaje 3', 1, 1);
-- INSERT INTO mensaje (id_mensaje, mensaje, id_cliente, id_vendedor) VALUES (4, 'Mensaje 4', 2, 2);
-- INSERT INTO mensaje (id_mensaje, mensaje, id_cliente, id_vendedor) VALUES (5, 'Mensaje 5', 2, 2);

-- INSERT PARA TABLA categoria
-- INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (1, 'Categoria 1');
-- INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (2, 'Categoria 2');
-- INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (3, 'Categoria 3');
-- INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (4, 'Categoria 4');
-- INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (5, 'Categoria 5');

-- INSERT PARA TABLA producto
-- INSERT INTO producto (id_producto, nombre_producto, precio_producto, marca_producto, fecha_agregado, codigo_producto, id_categoria, id_venta) VALUES (1, 'Martillo', 5000, 'Marca A', '2023-01-01', '1001', 1, 1);
-- INSERT INTO producto (id_producto, nombre_producto, precio_producto, marca_producto, fecha_agregado, codigo_producto, id_categoria, id_venta) VALUES (2, 'Serrucho', 7500, 'Marca B', '2023-02-01', '2001', 2, 2);
-- INSERT INTO producto (id_producto, nombre_producto, precio_producto, marca_producto, fecha_agregado, codigo_producto, id_categoria, id_venta) VALUES (3, 'Clavos', 1500, 'Marca C', '2023-03-01', '3001', 3, 3);
-- INSERT INTO producto (id_producto, nombre_producto, precio_producto, marca_producto, fecha_agregado, codigo_producto, id_categoria, id_venta) VALUES (4, 'Atornillador', 2500, 'Marca D', '2023-04-01', '4001', 4, 4);
-- INSERT INTO producto (id_producto, nombre_producto, precio_producto, marca_producto, fecha_agregado, codigo_producto, id_categoria, id_venta) VALUES (5, 'Taladro', 30000, 'Marca E', '2023-05-01', '5001', 5, 5);

-- INSERT PARA TABLA inventario
-- INSERT INTO inventario (id_inventario, stock, id_producto) VALUES (1, 100, 1);
-- INSERT INTO inventario (id_inventario, stock, id_producto) VALUES (2, 200, 2);
-- INSERT INTO inventario (id_inventario, stock, id_producto) VALUES (3, 150, 3);
-- INSERT INTO inventario (id_inventario, stock, id_producto) VALUES (4, 250, 4);
-- INSERT INTO inventario (id_inventario, stock, id_producto) VALUES (5, 300, 5);

-- INSERT PARA TABLA bodeguero
-- INSERT INTO bodeguero (id_bodeguero, area_bodeguero, id_inventario, id_usuario) VALUES (1, 'Area 1', 1, 4);
-- INSERT INTO bodeguero (id_bodeguero, area_bodeguero, id_inventario, id_usuario) VALUES (2, 'Area 2', 2, 9);

-- INSERT PARA TABLA detalle_venta
-- INSERT INTO detalle_venta (id_detalle, cantidad_dv, precio_total, id_producto) VALUES (1, 2, 10000, 1);
-- INSERT INTO detalle_venta (id_detalle, cantidad_dv, precio_total, id_producto) VALUES (2, 1, 7500, 2);
-- INSERT INTO detalle_venta (id_detalle, cantidad_dv, precio_total, id_producto) VALUES (3, 2, 3000, 3);
-- INSERT INTO detalle_venta (id_detalle, cantidad_dv, precio_total, id_producto) VALUES (4, 1, 2500, 4);
-- INSERT INTO detalle_venta (id_detalle, cantidad_dv, precio_total, id_producto) VALUES (5, 1, 30000, 5);

-- INSERT PARA TABLA reporte
-- INSERT INTO reporte (id_reporte, fecha_reporte, id_detalle) VALUES (1, '2023-05-06', 1);
-- INSERT INTO reporte (id_reporte, fecha_reporte, id_detalle) VALUES (2, '2023-05-07', 2);
-- INSERT INTO reporte (id_reporte, fecha_reporte, id_detalle) VALUES (3, '2023-05-08', 3);
-- INSERT INTO reporte (id_reporte, fecha_reporte, id_detalle) VALUES (4, '2023-05-09', 4);
-- INSERT INTO reporte (id_reporte, fecha_reporte, id_detalle) VALUES (5, '2023-05-10', 5);

-- INSERT PARA TABLA contador
-- INSERT INTO contador (id_contador, area_contador, id_reporte, id_usuario) VALUES (1, 'Finanzas', 1, 5);
-- INSERT INTO contador (id_contador, area_contador, id_reporte, id_usuario) VALUES (2, 'Auditoría', 2, 10);













