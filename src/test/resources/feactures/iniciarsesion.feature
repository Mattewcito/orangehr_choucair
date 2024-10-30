# autor: Emanuel López
# language: es

Característica: Inicio de sesión en la página de OrangeHRM
  Yo como usuario,
  Quiero iniciar sesión en la página "OrangeHRM" mediante el siguiente enlace "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  Para hacer uso de la aplicación de manera correcta.

  @successful
  Escenario: Iniciar sesión con credenciales válidas
    Dado Que el usuario está en la página de inicio de sesión de OrangeHRM
    Cuando el usuario ingresa las credenciales
    Entonces el usuario debería ser redirigido a la página de inicio del dashboard

