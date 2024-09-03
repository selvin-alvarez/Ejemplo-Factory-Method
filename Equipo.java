package equipoFutbol;

public class Equipo {

	public static void main(String[] args) {
		
		CreadorJugador creadorDelantero = new CreadorDelantero();
        Jugador delantero = creadorDelantero.crearJugador();
        delantero.jugar();

        CreadorJugador creadorMediocampista = new CreadorMediocampista();
        Jugador mediocampista = creadorMediocampista.crearJugador();
        mediocampista.jugar();

        CreadorJugador creadorDefensa = new CreadorDefensa();
        Jugador defensa = creadorDefensa.crearJugador();
        defensa.jugar();
    }
}