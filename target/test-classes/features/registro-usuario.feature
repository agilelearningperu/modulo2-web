#language:es
  Característica: Registro de cliente

    Escenario: Creación de cuenta exitosa
      Dado que la web esta disponible
      E ingreso a la opción de inicio de sesión
      E ingreso un correo "aavila3@mail.com"
      Cuando valido el correo
      Y selecciono el titulo "señora"
      E ingreso nombre "Alexander"
      E ingreso apellido "Avila"
      Y valido correo "aavila3@mail.com"
      E ingreso la clave "123456"
      Y selecciono el dia de nacimiento "1"
      Y selecciono el mes de nacimiento "4"
      Y Selecciono el año de nacimiento "1990"
      Y selecciono el envio de correos
      Y selecciono el envio de ofertas
      Y valido el nombre "Alexander"
      Y valido el apellido "Avila"
      E ingreso el nombre de la empresa "my company"
      E ingreso la primera dirección "mi empresa 123"
      E ingreso la segunda dirección "empresa 123"
      E ingreso la ciudad "Lima"
      Y selecciono el estado "Kansas"
      E ingreso el codigo postal "12345"
      Y selecciono el país "United States"
      E ingreso información adicional "otros comentarios"
      E ingreso numero de telefono "4561237"
      E ingreso numero de celular "987654321"
      E ingreso el alias "mi primer registro"
      Y registro de los datos
      Entonces validar que se registro los datos