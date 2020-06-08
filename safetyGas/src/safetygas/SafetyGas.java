package safetyGas;


public class SafetyGas {

    
    public static void main(String[] args) {
        //Teste dos métodos da classe Usuário
        Usuario u = new Usuario(1,"fulano@email.com","Fulano", "12345678910",19876543, 32123000, 33112244, "Rua dos bobos, nº 0", 1, "fulano", "fu123ano5");
        u.acrescentarFavorito(1);
        u.atualizarUsuario();
        System.out.println("\n");
        
        //Teste dos métodos da classe Contrato
        Contrato c = new Contrato(3124,"23/04/1986", (float) 100.00);
        c.ativarContrato();
        c.desativarContrato();
        System.out.println("\n");
        
        //Teste dos métodos da classe Detector
        Detector d = new Detector (24363656);
        d.abrir();
        d.fechar();
        System.out.println("\n");
        d.notificar();
        System.out.println("\n");
        d.setVazamento(true);
        d.notificar();          
        
        //Teste dos métodos da classe Suporte
        Suporte s = new Suporte();
        s.fechar(false);
        s.contato_Suporte_Tecnico(1,1);
        s.responder_Duvidas(1,1);
        System.out.println("\n");
    }
    
}
