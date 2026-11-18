import java.util.Stack;

public class Cliente{

    public static void main(String[] args) {
        Stack<String> Cli = new Stack<>();

        Cli.push("Turno 6");
        Cli.push("Turno 5");
        Cli.push("Turno 4");
        Cli.push("Turno 3");
        Cli.push("Turno 2");
        Cli.push("Turno 1");

        System.out.println(" El orden de los turnos de los clientes son :" + Cli);
        System.out.println("El primer numero de turno de los clientes" + Cli.peek());

        String eliminado1 = Cli.pop();
        String eliminado2 = Cli.pop();
        String eliminado3 = Cli.pop();
        String eliminado4 = Cli.pop();
        String eliminado5 = Cli.pop();
        String eliminado6 = Cli.pop();

        System.out.println("El primer cliente en ser atendido fue : " + eliminado1);
        System.out.println("El segundo cliente en ser atendido fue  " + eliminado2);
        System.out.println("El tercer cliente en ser atendido fue  " + eliminado3);
        System.out.println("El cuarto cliente en ser atendido fue  " + eliminado4);
        System.out.println("El quinto cliente en ser atendido fue  " + eliminado5);
        System.out.println("El sexto cliente en ser atendido fue  " + eliminado6);
         System.out.println("----No quedan clientes por atender----");


    }
}