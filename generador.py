from fuzzer import RandomFuzzer

# Aumentamos los límites para generar una sesión de juego masiva equivalente a miles de trials
fuzzer = RandomFuzzer(min_length=15000, max_length=25000)

# Imprimimos la secuencia gigante que terminará con una única 'q' al final
print(fuzzer.fuzz(), end="")
