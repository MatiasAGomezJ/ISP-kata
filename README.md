# ISP

En este ejercicio nos interesa que los usuarios de la clase ProcesadorTexto que 
no necesiten la funcionalidad de corregir textos no tengan ninguna dependencia con
el tipo Idioma

Para ello, debereis descomponer la funcionalidad de la clase ProcesadorTexto en dos interfaces, 
una basica (con los metodos nueva() y texto() y otra mas "compleja" con funcionalidad para la correccion.

Una vez descompuesta, adaptad el test para ver que cada uno puede usar el tipo que debe 
(es decir, el test_simple no necesita el tipo de procesador con idioma)