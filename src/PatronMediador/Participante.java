package PatronMediador;

public abstract class Participante {
    protected IMediador mediador;

    public Participante(IMediador mediador) {
        this.mediador = mediador;
    }

    public abstract void ejecutar(String mensaje);
}
