# IntentExample
Aplicación móvil muy simple para Android Nativa con Java que desarrolla un ejemplo de Intent.

Una moderna empresa que vende batidos de Fruta saludables quiere que desarrolles una aplicación
en la que los usuarios puedan hacer sus pedidos a domicilio desde su dispositivo móvil. 

Para realizar esta tarea he tenido que crear y diseñar 6 Activity o pantallas que son las
siguientes:
1. “Pantalla principal” que contiene el nombre de nuestra empresa, el logo de la misma y un botón
para que el usuario pueda hacer un pedido, además tiene un menú con las opciones de “Ayuda” y
“Acerca De”. Este activity contiene una Toolbar con un menú, un ImageView para el logo, un
TextView para el título de la empresa, y un botón para hacer el pedido. Las opciones del botón, de
“Ayuda y “Acerca De” llevan a otro ativity que veremos más adelante.

![image](https://user-images.githubusercontent.com/100787553/234544012-39318d6d-5cc8-41f9-90e2-23f998ad81b7.png)

![image](https://user-images.githubusercontent.com/100787553/234544041-c3a80727-a1c0-4ee9-a99f-b030612c7b19.png)

2. “Pantalla de Registro” que contiene campos de información de contacto que ingresará el
usuario, como es por ejemplo nombre, apellido, teléfono, dirección y tipo de recogida del producto.
Como componentes tiene varios TextView para la información, otro para el título de registro y 2
botones para volver al activity anterior y continuar con el siguiente activity. Todos los campos son
EditText menos el campo de Recogida que es un desplegable (Spinner). La opción de Dirección
sólo se muestra si en el Spinner está la opción de “A domicilio”, sino no se muestra.

![image](https://user-images.githubusercontent.com/100787553/234544090-91487fd9-f20d-407c-8b63-fec65de49b8f.png)

![image](https://user-images.githubusercontent.com/100787553/234544311-7af3101a-20b0-441b-8c7a-0ecdebaea655.png)

3. “Pantalla de Zumos” que contiene 4 opciones de posibles compras de zumos a elegir. Además
tenemos la imagen del zumo, el nombre y el precio, y un botón de volver para volver al activity
anterior. Este activity consta de un TextView para el título de la elección de zumos, y lo
anteriormente mencionado. Como complemento adicional tenemos un CheckBox para marcar si se
quiere el zumo sin lactosa. Para avanzar al siguiente activity tenemos que pinchar con el ratón en la
foto del zumo que queramos elegir.

![image](https://user-images.githubusercontent.com/100787553/234544378-7de51d83-fc83-4815-96be-e1180d3a76fc.png)

4. “Pantalla de Informes” que contiene el logo de la empresa, la información de contacto del
usuario y el zumo elegido como el precio determinado y un texto si es con lactosa o no. Este
activity consta de un TextView para el título de informe, el logo que es un ImageView, la
información que es un TextView y muchos TextViews para cada información, tanto como el zumo,
el precio y si es con lactosa o no. Además tiene un botón que te dirige a la pantalla principal. Al
abrirse el activity nos sale un Toast que nos confirma que nuestro pedido se ha realizado
correctamente.

![image](https://user-images.githubusercontent.com/100787553/234544471-4f15e618-ede9-4313-bf06-26274e610939.png)

Con lactosa y A domicilio:

![image](https://user-images.githubusercontent.com/100787553/234544597-db12191a-9aa4-43e8-90f9-9918f6a31a81.png)

![image](https://user-images.githubusercontent.com/100787553/234544720-7d376461-7bae-4f45-96ff-cc150a5fc6b2.png)

5. “Pantalla de Acerca De” que contiene un texto con el nombre de la aplicación, mi nombre como
autor, y el año en el que se desarrolla la aplicación, y un botón de volver para volver a la pantalla
principal. Este activity consta de varios TextView y un botón.

![image](https://user-images.githubusercontent.com/100787553/234544774-e57eae69-40d1-437c-8ae0-80b71f9f3f9f.png)

6. “Pantalla de Ayuda” que consisten en un texto bastante amplio y largo que no ocupa en la
pantalla por lo que le debemos poner un ScrollView para desplazar por la pantalla verticalmente.
Además, tiene un botón de volver para volver a la pantalla principal. En este activity se usa un
TextView, un ScrollView y un botón.

![image](https://user-images.githubusercontent.com/100787553/234544843-bca4f17e-d47d-4d7b-882d-3f1fde4789aa.png)

![image](https://user-images.githubusercontent.com/100787553/234544870-53ea350e-6f99-4784-98b1-960d9ab1f28e.png)

![image](https://user-images.githubusercontent.com/100787553/234544902-876c8526-447e-46e1-b3e8-8858a91bbdbd.png)

Esta aplicación consta de un icono que es el logo de la empresa, el nombre de la App es el nombre
de la empresa. Una clase ObjetoPedido para coger los datos del activity de zumos y de registro para
luego establecerlos y mostrarlos en el activity de informe (consta de constructores, getters y setters).
Si no completamos todos los campos nos sale un aviso.

![image](https://user-images.githubusercontent.com/100787553/234544972-141af43f-0bf1-454a-9924-bcbc73fe13a3.png)

El tipo de recogida es A domicilio y muestra la dirección, si lo cambiamos a Establecimiento no se
muestra la dirección

¡¡ GRACIAS, UN SALUDO !!
