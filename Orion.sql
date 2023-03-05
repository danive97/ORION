create database orion;
use orion;
CREATE TABLE clientes(
    `Id_cliente` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Nombre` VARCHAR(50),
    `Apellido` VARCHAR(50),
    `FechaNaci` DATETIME,
    `Correo` VARCHAR(50),
    `Contraseña` VARCHAR(50),
	`Tlfno` INT,
    `IdDireccion` VARCHAR(50)
);
CREATE TABLE empleados(
    `Id_empleado` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Nombre` VARCHAR(50),
    `Apellido` VARCHAR(50),
    `FechaNac` DATETIME,
    `Correo` VARCHAR(50),
    `Contraseña` VARCHAR(50),
    `IdFiscal` int,
    `NSS` int, 
    `IBAN` int,
    `Direc_compl` varchar(50),
	`Tlfno` INT,
    `Horario` VARCHAR(50)
);
/*REVISAR DESDE AQUI*/
CREATE TABLE productos(
    `Id_producto` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Id_proveedor` int,
    `Nombre` VARCHAR(50),
    `Cant_Picking` int,
    `Cant_Stock` int,
    `Precio_bruto` float,
	`Precio_neto` float,
    `SeccionAlm` int
);
CREATE TABLE proveedores(
    `Id_proveedor` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Nombre` VARCHAR(50),
    `Tlfno` INT,
    `Correo` VARCHAR(50),
    `Contraseña` VARCHAR(50),
	`Producto` varchar(50),
    `Direcc` VARCHAR(50)
);
CREATE TABLE pedido_cliente(
    `Id_pedido_cliente` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Id_cliente` int,
    `Productos` varchar(200),
    `Cantidad_prod` int,
    `Precio` float,
	`Pago` float,
    `Direc_envio` VARCHAR(50),
    `Fecha_pedido` datetime,
    `Fecha_salida_almacen`datetime,
    `Estado` int
);
CREATE TABLE pedido_proveedor(
    `Id_pedido_proveedor` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Id_proveedor` int,
    `Id_producto` INT,
    `Cantidad` int,
    `Fecha_pedidoprov` datetime,
	`Estado` int
);
CREATE TABLE direcciones_cliente(
    `Id_direccion` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Id_cliente` int,
    `Direccion` varchar(50),
    `Numero_calle` int,
    `Codigo_postal` int,
	`Localidad` varchar(50),
    `Municipio` varchar(50),
    `Otros` varchar(50),
    `Principal` boolean
);
CREATE TABLE fichaje(
    `Id_fichaje` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Id_empleado` int,
    `Dia` varchar(50),
    `Hora_entrada` datetime,
    `Hora_salida` datetime,
	`Horas_trabajadas` int,
    `Horas_extras` int,
    `Horas_extras_total` int
);