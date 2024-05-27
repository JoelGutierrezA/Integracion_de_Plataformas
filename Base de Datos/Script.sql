SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- -----------------------------------------------------
-- Schema db_ferremas
-- -----------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `db_ferremas` DEFAULT CHARACTER SET utf8 ;
USE `db_ferremas` ;

-- -----------------------------------------------------
-- Table `db_ferremas`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`usuario` (
  `id_usuario` INT(10) NOT NULL,
  `nombre_usuario` VARCHAR(45) NOT NULL,
  `correo_usuario` VARCHAR(45) NOT NULL,
  `contrasena` VARCHAR(45) NOT NULL,
  `tipo_usuario` VARCHAR(45) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `db_ferremas`.`cliente`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `db_ferremas`.`cliente` (
  `id_cliente` INT(10) NOT NULL,
  `direccion_cliente` VARCHAR(100) NOT NULL,
  `telefono` INT(10) NOT NULL,
  `id_usuario` INT NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `db_ferremas`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`categoria` (
  `id_categoria` INT(10) NOT NULL,
  `nombre_categoria` VARCHAR(45) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`despacho`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`despacho` (
  `id_despacho` INT(10) NOT NULL,
  `estado_despacho` VARCHAR(45) NOT NULL,
  `tarifa_despacho` INT(10) NOT NULL,
  `fecha_despacho` DATE NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `db_ferremas`.`sucursal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`sucursal` (
  `id_sucursal` INT(10) NOT NULL,
  `nombre_sucursal` VARCHAR(45) NOT NULL,
  `comuna` VARCHAR(45) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`vendedor` (
  `id_vendedor` INT(10) NOT NULL,
  `area_vendedor` VARCHAR(45) NOT NULL,
  `id_sucursal` INT(10) NOT NULL,
  `id_usuario` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`venta` (
  `id_venta` INT(10) NOT NULL,
  `fecha_venta` DATE NOT NULL,
  `id_despacho` INT(10) NOT NULL,
  `id_cliente` INT(10) NOT NULL,
  `id_vendedor` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`producto` (
  `id_producto` INT(10) NOT NULL,
  `nombre_producto` VARCHAR(45) NOT NULL,
  `precio_producto` INT(10) NOT NULL,
  `marca_producto` VARCHAR(45) NOT NULL,
  `fecha_agregado` DATE NOT NULL,
  `codigo_producto` INT(10) NOT NULL,
  `id_categoria` INT(10) NOT NULL,
  `id_venta` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`detalle_venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`detalle_venta` (
  `id_detalle` INT(10) NOT NULL,
  `cantidad_dv` INT(10) NOT NULL,
  `precio_total` INT(10) NOT NULL,
  `id_producto` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`reporte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`reporte` (
  `id_reporte` INT(10) NOT NULL,
  `fecha_reporte` DATE NOT NULL,
  `id_detalle` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`mensaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`mensaje` (
  `id_mensaje` INT(10) NOT NULL,
  `mensaje` VARCHAR(45) NOT NULL,
  `id_cliente` INT(10) NOT NULL,
  `id_vendedor` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`inventario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`inventario` (
  `id_inventario` INT(10) NOT NULL,
  `stock` INT(10) NOT NULL,
  `id_producto` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`administrador` (
  `id_administrador` INT(10) NOT NULL,
  `fecha_registro` DATE NOT NULL,
  `id_usuario` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`bodeguero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`bodeguero` (
  `id_bodeguero` INT(10) NOT NULL,
  `area_bodeguero` VARCHAR(45) NOT NULL,
  `id_inventario` INT(10) NOT NULL,
  `id_usuario` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
  -- -----------------------------------------------------
-- Table `db_ferremas`.`contador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferremas`.`contador` (
  `id_contador` INT(10) NOT NULL,
  `area_contador` VARCHAR(45) NOT NULL,
  `id_reporte` INT(10) NOT NULL,
  `id_usuario` INT(10) NOT NULL
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
  
--
-- Indices de la tabla `usuario`
--
  
  ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);
  
--
-- Indices de la tabla `cliente`
--

ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `usuario_id_usuario` (`id_usuario`);

--
-- Indices de la tabla `categoria`
--

ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);
  
--
-- Indices de la tabla `despacho`
--

ALTER TABLE `despacho`
  ADD PRIMARY KEY (`id_despacho`);
  
--
-- Indices de la tabla `sucursal`
--

ALTER TABLE `sucursal`
  ADD PRIMARY KEY (`id_sucursal`);
  
--
-- Indices de la tabla `vendedor`
--

ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id_vendedor`),
  ADD KEY `id_sucursal` (`id_sucursal`),
  ADD KEY `id_usuario` (`id_usuario`);
  
--
-- Indices de la tabla `venta`
--

ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `id_despacho` (`id_despacho`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_vendedor` (`id_vendedor`);

--
-- Indices de la tabla `producto`
--

ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `id_venta` (`id_venta`);
  
--
-- Indices de la tabla `detalle_venta`
--

ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `id_producto` (`id_producto`);
  
--
-- Indices de la tabla `reporte`
--

ALTER TABLE `reporte`
  ADD PRIMARY KEY (`id_reporte`),
  ADD KEY `id_detalle` (`id_detalle`);
  
--
-- Indices de la tabla `mensaje`
--

ALTER TABLE `mensaje`
  ADD PRIMARY KEY (`id_mensaje`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_vendedor` (`id_vendedor`);
  
--
-- Indices de la tabla `inventario`
--

ALTER TABLE `inventario`
  ADD PRIMARY KEY (`id_inventario`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `administrador`
--

ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_administrador`),
  ADD KEY `id_usuario` (`id_usuario`);
  
--
-- Indices de la tabla `bodeguero`
--

ALTER TABLE `bodeguero`
  ADD PRIMARY KEY (`id_bodeguero`),
  ADD KEY `id_inventario` (`id_inventario`),
  ADD KEY `id_usuario` (`id_usuario`);
  
--
-- Indices de la tabla `contador`
--

ALTER TABLE `contador`
  ADD PRIMARY KEY (`id_contador`),
  ADD KEY `id_reporte` (`id_reporte`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- AUTO_INCREMENT de la tabla `despacho`
--
ALTER TABLE `despacho`
  MODIFY `id_despacho` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  MODIFY `id_sucursal` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id_vendedor` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id_venta` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `id_detalle` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reporte`
--
ALTER TABLE `reporte`
  MODIFY `id_reporte` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `id_inventario` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id_administrador` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- AUTO_INCREMENT de la tabla `bodeguero`
--
ALTER TABLE `bodeguero`
  MODIFY `id_bodeguero` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- AUTO_INCREMENT de la tabla `contador`
--
ALTER TABLE `contador`
  MODIFY `id_contador` int(10) NOT NULL AUTO_INCREMENT;
  
--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `usuario_id_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD CONSTRAINT `sucursal_id_sucursal` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursal` (`id_sucursal`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuario_id_usuario2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `despacho_id_despacho` FOREIGN KEY (`id_despacho`) REFERENCES `despacho` (`id_despacho`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cliente_id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vendedor_id_vendedor` FOREIGN KEY (`id_vendedor`) REFERENCES `vendedor` (`id_vendedor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `categoria_id_categoria` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `venta_id_venta` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id_venta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD CONSTRAINT `producto_id_producto` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reporte`
--
ALTER TABLE `reporte`
  ADD CONSTRAINT `detalle_venta_id_detalle` FOREIGN KEY (`id_detalle`) REFERENCES `detalle_venta` (`id_detalle`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD CONSTRAINT `cliente_id_cliente2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vendedor_id_vendedor2` FOREIGN KEY (`id_vendedor`) REFERENCES `vendedor` (`id_vendedor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD CONSTRAINT `producto_id_producto2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `usuario_id_usuario3` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `bodeguero`
--
ALTER TABLE `bodeguero`
  ADD CONSTRAINT `inventario_id_inventario` FOREIGN KEY (`id_inventario`) REFERENCES `inventario` (`id_inventario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuario_id_usuario4` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `contador`
--
ALTER TABLE `contador`
  ADD CONSTRAINT `reporte_id_reporte` FOREIGN KEY (`id_reporte`) REFERENCES `reporte` (`id_reporte`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuario_id_usuario5` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
  COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
