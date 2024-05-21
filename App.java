import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.stage.Stage;

public class App extends Application {

    private TextField ValorDaConta;
    private TextField NumPessoas;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ThigasLayout.fxml"));
        Parent root = fxmlLoader.load();

        // Atributo onde o usuário insere o valor da conta a ser dividido
        ValorDaConta = (TextField) fxmlLoader.getNamespace().get("ValorDaConta");
        // Atributo onde o usuário insere a quantidade de pessoas
        NumPessoas = (TextField) fxmlLoader.getNamespace().get("NumPessoas");
        
        // Pattern para aceitar apenas números inteiros na quantidade de pessoas (NumPessoas)
        Pattern validEditingStateNumPessoas = Pattern.compile("\\d*");
        TextFormatter<Integer> numPessoasFormatter = new TextFormatter<>(change -> {
            String newText = change.getControlNewText();
            if (validEditingStateNumPessoas.matcher(newText).matches()) {
                return change;
            } else {
                return null;
            }
        });
        NumPessoas.setTextFormatter(numPessoasFormatter);

        // Pattern para aceitar números tipo "float" no ValorDaConta
        Pattern validEditingState = Pattern.compile("-?\\d*\\.?\\d*");
        TextFormatter<Double> textFormatter = new TextFormatter<>(change -> {
            String newText = change.getControlNewText();
            if (validEditingState.matcher(newText).matches()) {
                return change;
            } else {
                return null;
            }
        });
        ValorDaConta.setTextFormatter(textFormatter);

        // Formato da tela para o Scene Builder
        Scene scene = new Scene(root, 1029, 584);
        stage.setTitle("Divisão Justa");
        stage.setScene(scene);
        stage.show();
    }
}
