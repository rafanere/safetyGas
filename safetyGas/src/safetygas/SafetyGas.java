package safetyGas;


public class SafetyGas {

    
    public static void main(String[] args) {
   
        Usuario u = new Usuario(1,"fulano@email.com","Fulano", "12345678910",19876543, 32123000, 33112244, "Rua dos bobos, nº 0", 1, "fulano", "fu123ano5");
        
        Contrato c = new Contrato(3124,"23/04/1986", (float) 100.00);
        c.ativarContrato();
        c.desativarContrato();
        System.out.println("\n");
        
        Detector d = new Detector (24363656);
        d.abrir();
        d.fechar();
        System.out.println("\n");
        d.notificar();
        System.out.println("\n");
        d.setVazamento(true);
        d.notificar();
        
        
    }
    
}
