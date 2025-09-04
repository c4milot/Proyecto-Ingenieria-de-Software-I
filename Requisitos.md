# Requisitos funcionales:

- El sistema debe permitir registrar las bases de reciclaje, puntos de retiro, usuarios y recolectores.
- El sistema debe permitir registrarse y autenticarse según el rol en la plataforma.
- El sistema debe permitir ingresar solicitudes de retiro.
- El sistema debe permitir agrupar solicitudes según ubicación
- El sistema debe permitir modificar/eliminar solicitudes
- El sistema debe permitir revisar el estado de retiro
- El sistema debe permitir anunciar cambios de fecha o ruta/anunciar problemas con solicitudes
- El sistema debe permitir asignar y mostrar la ruta a recolectores
- El sistema debe permitir anunciar a recolectores cuando una ruta esté completada
- El sistema debe permitir emitir y visualizar comprobantes de retiro
- El sistema debe permitir a los recolectores registrar el estado de cada retiro.
- El sistema debe permitir anunciar fecha y hora estimada de retiro
- El sistema debe permitir la opción de retiro presencial o dejar los materiales fuera del hogar.
- El sistema debe permitir notificar información relevante, como cambios de estados o estimación de retiro.

# Requisitos no funcionales:

### Seguridad:

- Restringir funcionalidades y acceso a datos según el rol asignado.
- Limitar la cantidad de solicitudes a un máximo de 2 diarias por usuario.
- Verificar al usuario antes de permitir el envío de solicitudes.
- Almacenar encriptados los datos sensibles.

### Eficiencia:

- Cada solicitud debe poder ser asignada y atendida por un solo recolector.
- Las solicitudes deben recibir respuesta en un plazo máximo de 2 días hábiles.

### Usabilidad:

- La creación de una solicitud no debe requerir más de 3 clics en la interfaz.

### Compatibilidad:

- La plataforma debe funcionar en navegadores web y dispositivos móviles.

### Disponibilidad:

- El sistema debe soportar al menos 100 solicitudes simultáneas sin pérdida de rendimiento.
- Debe poder soportar al menos 100 solicitudes simultáneas (Disponibilidad)
