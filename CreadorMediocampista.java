package equipoFutbol;

class CreadorMediocampista extends CreadorJugador {

	@Override
	public Jugador crearJugador() {
		
		return new Mediocampista();

	}

}
