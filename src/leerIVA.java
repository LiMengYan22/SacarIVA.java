import javax.swing.JOptionPane;
public class leerIVA {
public static void main(String[] args) {
       
      final double IVA=0.21;//Declaramos una constante
          
      String texto=JOptionPane.showInputDialog("Mete precio de Producto");
      double precio=Double.parseDouble(texto);  //Pasamos el String a double

      double precioFinal=precio+(precio*IVA); //Obtenemos el precio final (precio+(precio*IVA))
      System.out.println("El precio final es: "+precioFinal);
}
}