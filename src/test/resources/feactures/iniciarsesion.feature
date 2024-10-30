# autor: Emanuel López
# language: es

@authenticationLogin
Característica: Inicio de sesión en la página de OrangeHRM
  Yo como usuario,
  Quiero iniciar sesión en la página "OrangeHRM" mediante el siguiente enlace "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  Para hacer uso de la aplicación de manera correcta.

Antecedentes:
  Dado "Emanuel" inicia sesión en OrangeHRM

@authenticationSuccess
  Escenario: auteticación exitosa
    Cuando ingresa las credenciales
    Entonces visualizará a la página de inicio del dashboard

