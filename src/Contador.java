import java.util.Scanner ;
/**
 *
 * @author Smart
 */
public class Contador {

        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (Exception exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }finally{
                terminal.close();
            }

        }

        static void contar(int parametroUm, int parametroDois) {
            if (parametroUm > parametroDois) {

                throw new RuntimeException("Erro: Parametro um deve ser menor que parametro dois.");
                
            }
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            System.out.println("Comeco da contagem");
            for (int i = 0; i <= contagem; i++) {
                System.out.print(i+ " ");
            }
            System.out.println("");
        }
    }

