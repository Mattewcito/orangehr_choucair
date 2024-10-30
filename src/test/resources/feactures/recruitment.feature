# autor: Emanuel López
# language: es


Característica: Proceso de contratación
  Como usuario
  Quiero añadir un nuevo empleado
  Para poder gestionar los procesos de contratación

  @successful
  Escenario: Añadir un nuevo empleado
    Dado que he iniciado sesión
    Cuando navego a la sección "Reclutamiento"
    Y hago clic en el botón "+Añadir"
    Y Relleno los datos del candidato
    Y envío el formulario
    Entonces debería ver un mensaje de confirmación