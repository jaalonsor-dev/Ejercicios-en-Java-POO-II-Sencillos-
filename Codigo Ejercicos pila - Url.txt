import java.util.Stack;

public class Urlclientes {

    public static void main(String[] args) {
        Stack<String> Url = new Stack<>();

        Url.push("Google.com");
        Url.push("Youtube.com");
        Url.push("Gemini.com");
        Url.push("Gmail.com");
        Url.push("BBVA.com");
        Url.push("Tiktok.com");

        System.out.println("Las Urls de los clientes iniciales son: " + Url);
        System.out.println("Mayor número de búsquedas: " + Url.peek());

        String eliminado1 = Url.pop();
        String eliminado2 = Url.pop();
        System.out.println("URL eliminada (última buscada): " + eliminado1);
        System.out.println("URL menos buscada (menos buscada): " + eliminado2);
        System.out.println("URLs restantes después de eliminar: " + Url);
    }
}