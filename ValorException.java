// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class ValorException extends Exception {
    public ValorException() {
        super("O valor deve ser menor que 250000. Por favor, insira outro valor.\nPressione ENTER para continuar.\n");
    }
}
