package REVISION_DOCUMENTOS;

import java.util.Stack;

public class Revision_documentos {

    public static void main(String[] args) {
        Stack<String> documento = new Stack<>();
        Stack<String> archivados = new Stack<>();

        
        documento.push("INFORME #1");
        documento.push("FACTURA #1");
        documento.push("FACTURA #2");
        documento.push("PARAFISCAL DEL MES 09");
        documento.push("Solicitud #23");

        System.out.println("------MENU GESTION DE DOCUMENTACION EMPRESARIAL------");
        System.out.println("Todos los documentos ingresados para ser gestionados por el sistema:");
        System.out.println(documento);

        
        String revisado = documento.pop();  
        String archivado = documento.pop();  

        
        archivados.push(revisado);
        archivados.push(archivado);

        
    
        System.out.println("Documento ultimo revisado: " + revisado);
        System.out.println("Documento ultimo archivado: " + archivado);
        System.out.println("Documentos aún pendientes de gestionar:");
        System.out.println(documento);
        System.out.println("Documento más reciente pendiente por revisar: " + documento.peek());
        System.out.println("Documento más reciente gestionado: " + archivados.peek());
    }
}
