
                                                  -------------------------
                                                    Generacion Automatica
                                                             de
                                                        Casos de Test
                                                  -------------------------
                                                    TP2 - Mauro Cherubini

Este trabajo consiste en analizar la efectividad de las herramientas de generacion automatica de test.
Particularmente se utilizo:

- Randoop
- EvoSuite

Para medir la efectividad se tomaron las siguientes metricas:

- Line Coverage (valor 0 a 1, siendo 1 la cobertura total de lineas)
- Branch Coverage (valor 0 a 1, siendo 1 la cobertura total de branches)
- Mutation Score (valor 0 a 1, siendo 1 el valor que representa la muerte de todos los mutantes)

Para obtener las metricas de Line y Branch Coverage se empleo JaCoCo, usandolo como Java Agent,
posteriormente se utilizo jacococli para extraer los datos del .exec.
Para las metricas de mutation se utilizo PiTest, el mismo genera un archivo CSV del cual se extrajeron los datos.
Una vez obtenidas todas la metricas para cada clase, se las fue agregando a un archivo CSV (el que esta en
csv/out.csv).
Finalmente, se armo la tabla de promedios con los datos del CSV generado. Los resultados fueron:

/-------------------------------------------------------------------------------------------------------------\
|                   CLASE                    | HERRAMIENTA | LINE COVERAGE | BRANCH COVERAGE | MUTATION SCORE |
|-------------------------------------------------------------------------------------------------------------|
|collections.comparators.FixedOrderComparator|   Randoop   |     0.763     |      0.493      |     0.528      |
|collections.comparators.FixedOrderComparator|  Evosutie   |     0.977     |      0.971      |     0.898      |
|    collections.iterators.FilterIterator    |   Randoop   |     0.519     |      0.075      |     0.393      |
|    collections.iterators.FilterIterator    |  Evosutie   |     0.796     |      0.564      |     0.814      |
|       collections.map.PredicatedMap        |   Randoop   |     0.366     |      0.263      |     0.206      |
|       collections.map.PredicatedMap        |  Evosutie   |      1.0      |       1.0       |     0.994      |
|   math.genetics.ElitisticListPopulation    |   Randoop   |     0.957     |      0.861      |     0.684      |
|   math.genetics.ElitisticListPopulation    |  Evosutie   |     0.992     |      0.983      |     0.869      |
\-------------------------------------------------------------------------------------------------------------/
