package equipoFutbol;

class CreadorDefensa extends CreadorJugador {

	@Override
	public Jugador crearJugador() {
		
		return new Defensa();

	}

}
