package EjemploMalo;

public class Test {
    public static void main(String[] args) {

        CanalChat chat = new CanalChat();
        Jose jose = new Jose();
        Maria maria = new Maria();

        chat.enviar("hola", jose);
        chat.enviar("chao", maria);
    }
}
