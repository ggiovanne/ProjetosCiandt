public class Programa {

    public static void main(String[] args) {
        Administrativos a1 = new Administrativos("André", 88888888, 1500, 0);
        a1.informarHorasExtras(70);
        a1.pagarHorasExtras();
        a1.holerite();
        
        Vendedores v1 = new Vendedores("Gustavo", 2394836, 2000, 50);
        v1.informaTotalVendas(3000);
        v1.informarSalario();
        v1.informaTotalVendas(5000);
        v1.receberComissao();
        v1.holerite();
        
        
    }

}