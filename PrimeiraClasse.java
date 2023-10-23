/* Primeira Classe = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo de classe
 */
public class PrimeiraClasse {

    // Todo conteudo deverá ser inserido aqui dentro
    /*
     * Valores: (int, float, double, long)
     * Texto: (String, char)
     * Booleano: (boolean)
     */
    public static void main(String[] args) {
        int dadoTipoInteiro = 10;
        float dadoTipoFloat = 10.5f;
        double dadoTipoDouble = 10.55555;
        long dadoTipoLong = 101874546516213L;
        String dadoTipoString = "Texto";
        char dadoTipoChar = 'T';
        boolean dadoTipoBoolean = true;

        System.out.println("Inteiro: " + dadoTipoInteiro);
        System.out.println("Float: " + dadoTipoFloat);
        System.out.println("Double: " + dadoTipoDouble);
        System.out.println("Long: " + dadoTipoLong);
        System.out.println("String: " + dadoTipoString);
        System.out.println("Char: " + dadoTipoChar);
        System.out.println("Boolean: " + dadoTipoBoolean);

    }
}

// fora do escopo da classe