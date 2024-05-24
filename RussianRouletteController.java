import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RussianRouletteController {

   @FXML
   private Button buttonBack;

   @FXML
   private TextField participantName1;

   @FXML
   private TextField participantName2;

   @FXML
   private TextField participantName4;

   @FXML
   private TextField participantName3;

   @FXML
   private TextField participantName6;

   @FXML
   private TextField participantName5;

   @FXML
   private Button buttonLucky;

   @FXML
   private Button buttonHelp;

   @FXML
   void backHome(ActionEvent event) {

   }

   @FXML
   void help(ActionEvent event) {
      Alert helpAlert = new Alert(Alert.AlertType.INFORMATION);
         helpAlert.setTitle("Como funciona a Roleta Russa?");
         helpAlert.setHeaderText(null);
         helpAlert.setContentText("Os participantes colocam seus nomes nos campos vazios, haverá um sorteio e um deles será premiado e terá que pagar a conta sozinho.");
         helpAlert.showAndWait();
   }

   @FXML
   void luckyName(ActionEvent event) {
      List<String> participantsNames = new ArrayList<>();
      // VERIFICA SE OS NOMES ESTÃO NA LISTA E ADICIONA NA LISTA
      if (!participantName1.getText().isEmpty())
      {
         participantsNames.add(participantName1.getText());
      }
      if (!participantName2.getText().isEmpty())
      {
         participantsNames.add(participantName2.getText());
      }
      if (!participantName3.getText().isEmpty())
      {
         participantsNames.add(participantName3.getText());
      }
      if (!participantName4.getText().isEmpty())
      {
         participantsNames.add(participantName4.getText());
      }
      if (!participantName5.getText().isEmpty())
      {
         participantsNames.add(participantName5.getText());
      }
      if (!participantName6.getText().isEmpty())
      {
         participantsNames.add(participantName6.getText());
      }
      // VERIFICA SE OS CAMPOS ESTÃO PREENCHIDOS
      if (!participantsNames.isEmpty())
      {
         Random prizeDrawn = new Random();
         int winName = prizeDrawn.nextInt(participantsNames.size());

         System.out.println("O(a) " + participantsNames.get(winName) + " pagará a conta sozinho(a).");
      }
      else
      {
         System.out.println("Você deve preencher um dos campos antes de sortear.");
      }
   }

}