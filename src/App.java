public class App {
    public static void main(String[] args) {
        int vitorias = 109;
        int derrotas = 25;
        
        String fiim = calcularNivel(vitorias, derrotas);
        System.out.println(fiim);
    }


    public static String calcularNivel(int vitorias, int derrotas) {

        int saldoVitoria = vitorias - derrotas;
        
       
        String nivel = "";
        if (saldoVitoria < 11) {
            nivel = "Ferro";
        } else if (saldoVitoria < 21) {
            nivel = "Bronze";
        } else if (saldoVitoria < 51) {
            nivel = "Prata";
        } else if (saldoVitoria < 81) {
            nivel = "Ouro";
        } else if (saldoVitoria < 91) {
            nivel = "Diamante";
        } else if (saldoVitoria < 101) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }
        

        return "O Herói tem de saldo de " + saldoVitoria + " e está no nível de " + nivel;
    }

}
