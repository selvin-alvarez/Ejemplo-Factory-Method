package equipoFutbol;

class CreadorDelantero extends CreadorJugador {

	@Override
	public Jugador crearJugador() {
		
		return new Delantero();

	}

}
