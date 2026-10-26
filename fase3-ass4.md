# Assignment 4: Fase 3
## Invariantes de la clase `Board`

`ar.edu.unrc.game2048.Board:::OBJECT`
- `this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class`
    - **Clasificación:** Correcto y útil
    - Garantiza que el atributo `grid` sea siempre una matriz bidimensional de la clase `Cell`.
- `ar.edu.unrc.game2048.Board.MAX_SIZE >= this.size`
	- **Clasificación:** Correcto y útil
	- Marca un limite máximo para evitar que el tamaño actual del board no exceda el limite máximo permitido.
- `ar.edu.unrc.game2048.Board.WINNING_VALUE != this.score`
	- **Clasificación:** Demasiado fuerte
	- Infiere que el puntaje nunca es igual a 2048. En las ejecuciones de prueba los test no llegaron a ese puntaje o no se cubrio esa condición de victoria. Muestra falta de cobertura para ese caso puntual.
- `ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`
	- **Clasificación:** Correcto pero trivial
	- No aporta información sobre el comportamiento del juego
`ar.edu.unrc.game2048.Board.moveDown():::EXIT`
- `ar.edu.unrc.game2048.Board.MAX_SIZE != this.score`
	- **Clasificación:** Espurio.
	- Se infiere que el puntaje nunca es igual al tamaño máximo. Se cumple por la baja cobertura de los test actuales, pero es espurio porque en una partida real el puntaje puede crecer y coincidir con limites pequeños en partidas avanzadas. 

