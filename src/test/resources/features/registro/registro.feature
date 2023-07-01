#language: es
Característica: Registro de usuario nuevo Alkomprar
  Como   profesional en electronica
  Quiero registrarme en la pagina web Alkomprar
  Para   ver y poder comprar articulos tecnologicos ofertados

  @RegistroExito
  Escenario: Registro Usuario en Alkomprar
    Dado      abro la pagina web Alkomprar
    Cuando    hago click en MiCuenta e ingreso la informacion solicitada en los formularios siguientes
    Entonces  visualizo el tablero de control MiCuenta
