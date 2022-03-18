package EjemploPractico;

import PatronMediador.IMediador;
import PatronMediador.Participante;

public class Jose extends Participante {
    public Jose(IMediador mediador) {
        super(mediador);
    }

    @Override
    public void ejecutar(String mensaje) {
        this.mediador.notificarEvento(mensaje, this);
    }
}
