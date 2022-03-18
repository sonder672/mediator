package EjemploPractico;

import PatronMediador.IMediador;
import PatronMediador.Participante;

public class Maria extends Participante {

    public Maria(IMediador mediador) {
        super(mediador);
    }

    @Override
    public void ejecutar(String mensaje) {
        if (mensaje == null)
        {
            throw new RuntimeException();
        }
        System.out.println(mensaje);
    }
}
