import javax.swing.JOptionPane;
// Unchecked acontecem por erros na logica do programa.
public class Unchecked {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador:");
        String b = JOptionPane.showInputDialog("Denominador:");
        boolean continueLooping = true;
        do{
            try{// trata da exceção no lugar onde pode ocorrer
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+ resultado);
                continueLooping = false;
            } catch(NumberFormatException e){// e é um objeto e recebo os metodos da exception
                JOptionPane.showMessageDialog(null,"Entrada invalida, infomre um numero inteiro.");
                //e.printStackTrace();
            }catch(ArithmeticException e){// e é um objeto e recebo os metodos da exception
                e.printStackTrace();//mostra no terminal a exception que deu
                JOptionPane.showMessageDialog(null,"Impossivel dividir por zero, infomre um numero inteiro diferente de zero.");
            }finally{
                System.out.println("Chegou no finally");
            }  
        }while(continueLooping);
    }
    public static int dividir(int a, int b){return a/b;}
}
