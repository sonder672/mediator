package EjemploMalo;

public class CanalChat {
    public void enviar(String mensaje, Object to){
        System.out.println(mensaje+" de "+to.getClass().getName());
    }
}
