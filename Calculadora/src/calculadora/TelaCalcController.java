/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author isabe_2y5
 */
public class TelaCalcController implements Initializable {

    @FXML
    private Label lblResult;
    @FXML
    private Label lblCount;

    private String n = "";
    private String count = "";
    private float number = 0f;
    private float result = 0f;
    private String op = "";

    public void numberOne() {
        selectedNumber("1");
    }

    public void numberTwo() {
        selectedNumber("2");
    }

    public void numberThree() {
        selectedNumber("3");
    }

    public void numberFour() {
        selectedNumber("4");
    }

    public void numberFive() {
        selectedNumber("5");
    }

    public void numberSix() {
        selectedNumber("6");
    }

    public void numberSeven() {
        selectedNumber("7");
    }

    public void numberEight() {
        selectedNumber("8");
    }

    public void numberNine() {
        selectedNumber("9");
    }

    public void numberZero() {
        selectedNumber("0");
    }

    public void point() {
        selectedNumber(".");
    }

    public void opSum() {
        op = "sum";
        float numberOp = getNumber();
        if (result == 0) {
            result = numberOp;
            System.out.println("true");
        } else {
            result = result + numberOp;
        }
        count += " + ";
        lblCount.setText(count);
        setTextLabel(Float.toString(result));
        System.out.println(result);
    }

    public void opSub() {
        op = "sub";
        float numberOp = getNumber();
        if (result == 0) {
            result = numberOp;
        } else {
            result = result - numberOp;
        }
        count += " - ";
        lblCount.setText(count);
        lblResult.setText(Float.toString(result));
        System.out.println(result);
    }

    public void opDiv() {
        op = "div";
        float numberOp = getNumber();
        if(result==0){
            result = numberOp;
        }
        else{
            result = result / numberOp;
        }
        count += " / ";
        lblCount.setText(count);
        lblResult.setText(Float.toString(result));
        System.out.println(result);
    }

    public void opMult() {
        op = "mult";
        float numberOp = getNumber();
        if(result ==0){
            result = numberOp;
        }
        else{
            result = result * numberOp;
        }
        count += " * ";
        lblCount.setText(count);
        lblResult.setText(Float.toString(result));
        System.out.println(result);
    }

    public float getNumber() {
        number = Float.parseFloat(n);
        n = "";
        return number;
    }

    public void selectedNumber(String number) {
        n = n + number;
        count = count + number;
        System.out.println(n);
        lblCount.setText(count);
        setTextLabel(n);
    }

    public void setResult() {
        switch (op) {
            case "sum":
                opSum();
                break;
            case "sub":
                opSub();
                break;
            case "div":
                opDiv();
                break;
            case "mult":
                opMult();
                break;
        }
        lblCount.setText("0");
        n = "";
        lblResult.setText(Float.toString(result));
    }

    public void clearResults() {
        result = 0;
        n = "";
        count = "";
        lblCount.setText("0");
        lblResult.setText("0");
    }

    public void setTextLabel(String text) {
        lblResult.setText(text);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
