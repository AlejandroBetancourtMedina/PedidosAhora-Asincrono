# PedidosAhora-Asincrono

-	Primero ingreso a consola comando y me posiciono en la siguiente ruta para ejecutar Activemq
  ![image](https://github.com/user-attachments/assets/8044250e-49f7-4a92-864c-9892b330acac)
 	
-	Ejecuto archivo Activemq.bat para activar el gestor de mensajería:
  ![image](https://github.com/user-attachments/assets/262e7b6a-de82-4855-81df-c2954627ffe1)
 
-	Sin cerrar consola valido conexión y funcionamiento de ActiveMQ en: http://localhost:8161/admin donde User: admin y pass: admin:

  ![image](https://github.com/user-attachments/assets/27b2fe1c-f863-4aee-b341-0bbbee2f012f)


##	Proyecto IntelliJ

Arquitectura utilizada: Arquitectura en capas.

###Control de Versiones:
+	Java 22
+	Maven 3.9.9
+	Spring Boot 3.3.4
+	ActiveMQ 6.1.3

###Dependencias relevantes:
+ Activemq: Para integrar a nuestro proyecto funcionalidad de mensajería asíncrona usando ActiveMQ.

+ Javax.jms: Utilizada para otorgar herramientas de desarrollo relacionado a mensajería asíncrona.

##Proceso a ejecutar mi proyecto en IntelliJ, log muestra con éxito lo siguiente:
![image](https://github.com/user-attachments/assets/df03938d-ec8c-41bd-b3e5-60f23b19b236)

###	Testeo de endpoint
Para ello utilizo software “Insomnia”, con la siguiente url local para ejecutar POST proporcionando además el “body” de JSON:
![image](https://github.com/user-attachments/assets/2ba7b61a-7dc2-4acf-8fe2-9c71adbd611c)

Tras hacer la consulta, visualizo “200 OK” que verifica que la conexión fue exitosa, el id es incrementable, en mi caso realice 5 pruebas.

![image](https://github.com/user-attachments/assets/954c3241-3c4f-4578-9a28-bb3301e9d3e2)


Ahora si deseo probar funcionalidad del endpoint GET, en mi caso de la solicitud “id 2”, visualizo:

![image](https://github.com/user-attachments/assets/6169444e-4c44-4b48-83cb-339e2727afd4)

 
Lo anterior responde al controlador (controller) “OrderController

 ![image](https://github.com/user-attachments/assets/1ba07a7a-6d74-480a-afa7-bf573ef65deb)


Valido la Cola en ActiveMQ del localhost:

![image](https://github.com/user-attachments/assets/a48412b5-1c8b-4c0b-a614-966b98598b14)


