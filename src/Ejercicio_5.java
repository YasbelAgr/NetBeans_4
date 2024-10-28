import javax.swing.JOptionPane;
public class Ejercicio_5 {
    public static void main(String[] args){
        double Volumen, Area;
        short R=0, H=0;
            R= Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor de Radio"));
            H= Short.parseShort(JOptionPane.showInputDialog("ingresa el valor de Altura"));
            Volumen= ((3.1416)*((R)*(R))*(H));
            Area= (((2*3.1416)*(R))*(R+H));
            JOptionPane.showMessageDialog(null, "El volumen es de "+Volumen);
            JOptionPane.showMessageDialog(null, "El area es de "+Area);
             
    }
}

