# Jacoco - Reporte de cobertura

![Reporte de Cobertura](images/covertura_pierini.jpeg)

# Benchmark

![Pruebas Benchmark](images/pruebas_benchmark_pierini.jpeg)

La conclusión a la que puedo llegar en base a los resultados obtenidos de la ejecución de las pruebas benckmark para la clase StreamBenchmark es que en este caso específico es más rápido cuando se utiliza Stream en comparación con ParallelStream. 
El rendimiento de stream es superior, con un tiempo promedio de 132,532,975.490 nanosegundos, en comparación con 156,471,661.978 nanosegundos para parallelStream. 
También es importante recordar que los resultados pueden variar dependiendo de las características exactas de la tarea y del entorno de ejecución ya que, aunque parallelStream puede ser más rápido, también puede tener un mayor costo de configuración y coordinación, lo que puede hacerlo menos eficiente para operaciones más pequeñas o más simples. 
Entonces puedo concluir que no hay una alternativa que sea mejor en todos los casos sino que siempre es importante realizar pruebas de rendimiento para determinar la mejor opción para cada caso específico.
