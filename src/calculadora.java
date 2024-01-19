import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Se hereda las propiedades*/
public class calculadora  extends JFrame{
    private JLabel VAL1;
    private JTextField txtVal1;
    private JButton saludar_b;
    private JTextField textVal2;
    private JButton CONCATENARButton;
    private JButton cerrar_B;
    private JPanel Jpanel1;
    private JButton LIMPIARButton;
    private JTextField resultado;
    private JButton UNIRButton;


    public calculadora(){

        super("OPERACIONES");
        setContentPane(Jpanel1);

        /*Para dar acciones al botón*/
        cerrar_B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        LIMPIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVal1.setText("");
                textVal2.setText("");
            }
        });


        CONCATENARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double txtVal1 = Double.parseDouble(txtVal1.getText());
                    double textVal2 = Double.parseDouble(textVal2.getText());
                    double recibirR= txtVal1+textVal2;
                    resultado.setText(Double.toString(recibirR));
                    try{
                        JOptionPane.showMessageDialog(null,resultado);
                    }
                    catch(NumberFormatException ex){
                        System.out.println("El ingreso es inválido");

                }




            }
        });


       /* resultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double txtVal1 = Double.parseDouble(txtVal1.getText());
                double textVal2 = Double.parseDouble(textVal2.getText());
                double recibirR= txtVal1+textVal2;
                resultado.setText(Double.toString(recibirR));
            }
        });*/
        saludar_b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    String txtVal1 = calculadora.this.txtVal1.getText();
                    String saludo =" Hola " + txtVal1;
                    JOptionPane.showMessageDialog(null,saludo);
                }
        });
    }


}