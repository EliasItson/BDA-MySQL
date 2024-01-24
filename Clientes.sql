CREATE TABLE IF NOT EXISTS `netbeans`.`clientes` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `apellidoPaterno` VARCHAR(50) NOT NULL,
  `apellidoMaterno` VARCHAR(50) NOT NULL,
  `isDeleted` BIT(1) NOT NULL,
  `fechaHoraRegistro` DATETIME NOT NULL,
  PRIMARY KEY (`idCliente`))