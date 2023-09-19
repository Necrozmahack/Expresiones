/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresiones;

/**
 *
 * @author celso
 */
public class EnumEjemplo {

    public enum CategoriaTenis {
        PUMA,
        ADIDAS,
        JORDAN,
        SPORTLINE,
        SKECHERS,
        NIKE,
        CONVERSE
        
    }

    public static class Tenis {

        private String Proveedor;
        private String Tienda;
        private CategoriaTenis categoria;

        public Tenis(String Proveedor, String Tienda, CategoriaTenis categoria) {
            this.Proveedor = Proveedor;
            this.Tienda = Tienda;
            this.categoria = categoria;
        }

        @Override
        public String toString() {
            return "Proveedor: " + Proveedor + ", Tienda: " + Tienda + ", Categoría: " + categoria;
        }
    }

    public static void main(String[] args) {
        Tenis Tenis1 = new Tenis("NIKE", "COMALCALCO", CategoriaTenis.NIKE);
        Tenis Tenis2 = new Tenis("PUMA", "CUNDUACAN", CategoriaTenis.PUMA);
        Tenis Tenis3 = new Tenis("CONVERSE","VILLAHERMOSA",CategoriaTenis.CONVERSE);

        System.out.println(Tenis1);
        System.out.println(Tenis2);
        System.out.println(Tenis3);
    }
}
