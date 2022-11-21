# Trabajo Final
Fundamentos de Programación
2022-2-Módulo
***Nombre del Proyecto : Reporte estadístico de costos de fundición***
***Presentada por:***     
* Gutierrez Tacora, Anali Morelia 
* Vargas Portugal, Paul Martin
* Vigo Berrospi, Edson Armando
* Zúñiga Danessi, Pablo Felipe
# LIMA – PERÚ   
# 2022

# Definiciones.
* **Colada:** mezcla química de la cual se obtiene un metal al enfriarse en una caja de moldeo.
* **Molde:** es un repositorio donde se vierte el metal líquido y se genera una pieza metálica
* **Materia prima:** producto que se utiliza directamente para la fabricación de una pieza final.
* **Orden de Trabajo:** Documento donde se establece las necesidades de fabricación, la lista de materiales requerida y la ruta de fabricación 
con la finalidad de producir un producto final.
* **Lista de materiales:** receta donde se establecen los productos (materiales hijos) y las cantidades a ser utilizados para la fabricación
* **Ruta de fabricación:** operaciones requeridas para producir un producto
* **Centros de trabajo:** es costo y lugares donde se realiza las operaciones establecidas en la ruta de fabricación.
* **Tarifa de fabricación:** establece el costo por hora centro de trabajo y ante una operación determinada.
* **Elementos de Costo:** son las categorías por la cual se divide un cálculo de costo y que sirve para implementar el método de costeo.
* **Ferroaleaciones:** aleaciones cuyo principal componente es el hierro. A su vez se pueden clasificar en aceros (con un porcentaje de carbono 
menor del 1,7%) y fundiciones (con un porcentaje de carbono superior al 2%).
* **Colado o Vaciado:** proceso que da forma a un objeto al hacer entrar material liquido en un agujero o cavidad formado que se llama molde y 
dejar que se solidifique el líquido. Cuando el material se solidifica en la cavidad retiene la forma deseada.

 
# A. Situación Actual
##¿Quiénes son?
***La empresa ABC,*** realiza aplicación de alta tecnología y un enfoque ***volcado hacia la manufactura*** nos convierten en líderes regionales 
**en procesos de fabricación, instalación y mantenimiento de equipos, piezas industriales y productos para la transformación industrial, mecanizado,
soldaduras y construcciones metálicas** en los sectores industrial, agrario, de construcción y proyectos estatales.
ABC presta sus servicios a la industria en general, el éxito y sostenibilidad en el sector, está dado por el estricto cumplimiento de las normas de 
calidad en metalmecánica y fundición. El poder generar nuevos productos gracias a tener un área de investigación y desarrollo (I+D), que permite 
ofrecer una variedad de alternativas a los diferentes sectores de la industria. Estos productos pueden ser parte de bombas, blowers, hidrantes, 
válvulas, poleas, bujes, ejes, carcasas, tapas para cilindros, impulsores, tapas	de motor, puertas, escotillas, bridas, tapas y cajas de medidores 
de agua, rejillas, bitas, bolardos, cornamusas, propelas y anclas, entre otros.

Las instalaciones cuentan con áreas industriales, planta, almacenes para albergar la materia prima, con lo cual se pueden realizar actividades como: 
generar los modelos, administrar los hornos, realizar las coladas, operar los acabados, trabajar el torneado y realizar la soldadura. Debido a lo 
anteriormente expuesto, se garantiza un servicio completo y una producción continua, cumpliendo con las necesidades de consumo de los clientes.

Como roles principales dentro de los procesos evaluados se han identificado los siguientes:
●	Analistas de I+D (investigación y Desarrollo) encargados de generar los artículos padres y sus listas de componentes y rutas de fabricación.
●	Analistas de costos que establecen las tarifas por centros de trabajo a valor de hora de trabajo.
●	Analista de planificación el cual genera las ordenes de trabajo y las cantidades a ser fabricadas.
●	Operadores de planta que realizan la asignación de las materias primas y asignación de tiempos de tarea, finalmente analizas las estadísticas para la mejora de los procesos.

Dentro de sus políticas de calidad para el sistema integral de gestión (SIG) se tiene la siguiente cita: 
>Realizar nuestros procesos con programas viables técnica y económicamente y que cumplan con la legislación vigente y otros requisitos, de modo que 
sean adecuados para el medioambiente, salud y seguridad de nuestros clientes, colaboradores y la comunidad. -ABC, 2021

Actualmente, la empresa ha implementado un sistema integrado de gestión (ERP), el cual le permite integrar las diferentes áreas de la empresa. 
Al ser muy amplio los diferentes procesos dentro de la misma, tomaron como premisa realizar una completa implementación en el área de mecánica 
por ser un área cuyo costo es alto en lo que a mano de obra y maquinaria se refiere. El proceso de fundición fue relegado a un seguimiento manual y 
que alimenta al sistema periódicamente. La acción de llevar un seguimiento y realizar cálculos manuales, trae como consecuencia demasiados errores al 
momento de migrar la información al sistema. Para finalizar, esta información exige tener que alimentar los elementos de costos, debido a que hay dos 
procesos requeridos por el ERP que son: el ingreso de consumo de producto y la asignación de horas de operación en las diferentes zonas de la planta.

Debido a lo anteriormente expuesto, se realizará un análisis de hechos del área de fundición, estableciendo para ello primero un organigrama de la empresa, 
y al cual se han marcado los puntos a ser estudiados en dicho estudio.

# Organigrama e identificación del área a sistematizar
!["Organigrama de la Empresa identificando el área a sistematizar"]()

# Análisis de hechos del Área de Fundición
## Hechos
La empresa ABC, ante la implementación del sistema de gestión empresarial (ERP), presenta la necesidad de llevar toda la información a dicho programa. 
Ante ello se presenta la dificultad en el Área de fundición que mantiene procedimientos de trabajo que no se ajustan a los estándares del ERP, esta situación 
ha generado que se tenga que se solicite una evaluación de la problemática.

## **Problemática en la migración de información del Área de Fundición al Sistema de ERP.**
Al realizar una implementación de sistemas a nivel corporativo el proceso presenta como consecuencias cambios a nivel organizacional. Algunas áreas de la 
empresa son core de negocio y tiene por consecuencia no cambiar sus procesos, debido al impacto que esto conlleva. Estas situaciones presentan retos en los 
ingresos de datos a los nuevos sistemas, en donde hay que mantener un proceso, pero al mismo tiempo cumplir con lo que solicita la organización. 
En primer lugar, la información se genera según como se realiza el trabajo y no hay un estándar para poder trabajar, esto trae como consecuencia que los 
programas sean actualizados de manera periódica y con redundancia de información porque hay que ingresar de manera manual. Además, el ERP requiera la 
información de consumos de materias primas y la asignación de tiempos por operación, que son variables debido a las características finales del material y lo 
que solicite el cliente. Los controles de seguimiento son llevados a cabo por supervisores, que están mas involucrados en la parte operativa que administrativa, 
lo que trae como consecuencia que toda información se vuelque a hojas de trabajo manual. En segundo lugar, los costos de los productos fabricados en fundición a 
nivel de la colada son realizados manualmente con el correspondiente caso de error de ingreso. Para ello, las evaluaciones de los cálculos de costos han demostrado 
que no toman en cuenta los valores reales, sino que utiliza una evaluación de la plantilla de trabajo que se tiene. Por no contar con la carga de información en 
el sistema con el detalle correcto, este no brinda retroalimentación del proceso realizado en el área. Adicionalmente, ningún modelo de costos del ERP permite hacer 
el costeo en modo estándar y considerando los retornos de producto, debido a los excesos de material al momento de la fabricación.
 
# B. Propuesta de innovación
Establecidos los problemas por los que atraviesa la información del Área de Fundición, se plantean las siguientes propuestas.
1. Realizar un programa que realice el ingreso de información de cada orden de trabajo. el objetivo es poder migrar dicha información de manera directa 
y con validaciones que el programa pueda establecer. Para ello, se propone tener información precargada de artículos, listas y operaciones para que la 
información sea validada y ajustada a los valores reales. Con este sistema, se espera recopilar la información de tal manera que se reduzcan las fallas al 
momento de migrar la información.
2. Generar un programa que realice el cálculo de costos y un análisis estadístico de la orden de trabajo. El propósito es que se migren los costos del 
producto fabricado, tomando en cuenta las devoluciones de materiales procesados. Para tal efecto, se deberá generar un programa que cumpla con el modelo de 
costos real y que adicionalmente devuelva información estadística (datos de costos promedios, información de numero de ordenes de trabajo generadas en el día y 
costos totales por elementos de costos). De esta forma, se podrá mejorar los procesos en el área y evaluar cambios en algunas tareas, pero no modificar su core 
de negocio. 
