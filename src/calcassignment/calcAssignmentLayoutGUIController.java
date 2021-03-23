package calcassignment;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class calcAssignmentLayoutGUIController implements Initializable {
    private String crrntArthOp="DEFAULT";
    private String opd1="0";
    @FXML
    private TextField txtBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private void addDigit(ActionEvent event) {
        Button btn =(Button)event.getSource();
        switch(btn.getText()){
            case"1": txtBox.setText(txtBox.getText()+"1");break;
            case"2": txtBox.setText(txtBox.getText()+"2");break;
            case"3": txtBox.setText(txtBox.getText()+"3");break;
            case"4": txtBox.setText(txtBox.getText()+"4");break;
            case"5": txtBox.setText(txtBox.getText()+"5");break;
            case"6": txtBox.setText(txtBox.getText()+"6");break;
            case"7": txtBox.setText(txtBox.getText()+"7");break;
            case"8": txtBox.setText(txtBox.getText()+"8");break;
            case"9": txtBox.setText(txtBox.getText()+"9");break;
    }
}
        
    @FXML
    private void arthOp(ActionEvent event) {
        if( ((Button)event.getSource()).getText().equals("+")){
          if(crrntArthOp.equals("DEFAULT")){
              opd1= txtBox.getText();
              crrntArthOp="ADD";
              txtBox.clear();
          }  
        }else{
          if(crrntArthOp.equals("DEFAULT")){
              opd1= txtBox.getText();
              crrntArthOp="MULTI";
              txtBox.clear(); 
        }
        else{
                if(crrntArthOp.equals("DEFAULT")){
              opd1= txtBox.getText();
              crrntArthOp="DIVIDE";
              txtBox.clear();
                }
                else{
                    if(crrntArthOp.equals("DEFAULT")){
              opd1= txtBox.getText();
              crrntArthOp="SUBTR";
              txtBox.clear();
                }
    }
          }
          @FXML
           private void processResult(ActionEvent event) {
            int num1=Integer.parseInt(opd1);
            int num2=Integer.parseInt(txtBox.getText());
          if(crrntArthOp.equals("ADD")) { 
              txtBox.setText("" +(num1+num2));v
          }else{
              txtBox.setText("" +(num1*num2));
          }
        }
        }
    }
}