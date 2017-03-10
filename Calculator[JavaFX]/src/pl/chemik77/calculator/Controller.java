package pl.chemik77.calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable{

    @FXML
    private Button btnAC;

    @FXML
    private Button btnDiv;

    @FXML
    private TextField textField;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn6;

    @FXML
    private Button btnSub;

    @FXML
    private Button btnRes;

    @FXML
    private Button btn7;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn2;

    @FXML
    private Button btnMul;

    @FXML
    private Button btn3;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btnPoi;
    
    @Override
	public void initialize(URL link, ResourceBundle resource) {
		assert btnAC != null : "fx:id=\"btnAC\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnDiv != null : "fx:id=\"btnDiv\" was not injected: check your FXML file 'Window.fxml'.";
        assert textField != null : "fx:id=\"textField\" was not injected: check your FXML file 'Window.fxml'.";
        assert menuBar != null : "fx:id=\"menuBar\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn8 != null : "fx:id=\"btn8\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn9 != null : "fx:id=\"btn9\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn6 != null : "fx:id=\"btn6\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnSub != null : "fx:id=\"btnSub\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnRes != null : "fx:id=\"btnRes\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn7 != null : "fx:id=\"btn7\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn4 != null : "fx:id=\"btn4\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn5 != null : "fx:id=\"btn5\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn2 != null : "fx:id=\"btn2\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnMul != null : "fx:id=\"btnMul\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn3 != null : "fx:id=\"btn3\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn0 != null : "fx:id=\"btn0\" was not injected: check your FXML file 'Window.fxml'.";
        assert btn1 != null : "fx:id=\"btn1\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnPoi != null : "fx:id=\"btnPoi\" was not injected: check your FXML file 'Window.fxml'.";
        
        clear();
        
	}
	
	private void clear() {
		textField.setText("0");
		
	}
    
	//--------------------------------initialize logic----------------------------------------------------

	//--------------------------------składowe----------------------------------------------------------
	
	double aD, bD;
	int aI, bI;
	String sNumber = "";
	char operator;
	double resultD;
	int resultI;
	
	//--------------------------------metody FXML----------------------------------------------------------
	
	@FXML
    public void pressBtnAC() {
		clear();
		reset();
	}

    @FXML
    public void pressBtnDiv() {
    	operator = '/';
    	aSetNumber();
    	sNumber = "";
    }

    @FXML
    public void pressBtn8() {
    	pressBtnNumber("" + 8);
    }

    @FXML
    public void pressBtn9() {
    	pressBtnNumber("" + 9);
    }

    @FXML
    public void pressBtn6() {
    	pressBtnNumber("" + 6);
    }

    @FXML
    public void pressBtnSub() {
    	operator = '-';
    	aSetNumber();
    	sNumber = "";
    }

    @FXML
    public void pressBtn7() {
    	pressBtnNumber("" + 7);
    }

    @FXML
    public void pressBtnAdd() {
    	operator = '+';
    	aSetNumber();
    	sNumber = "";
    }

    @FXML
    public void pressBtn4() {
    	pressBtnNumber("" + 4);
    }

    @FXML
    public void pressBtn5() {
    	pressBtnNumber("" + 5);
    }

    @FXML
    public void pressBtn2() {
    	pressBtnNumber("" + 2);
    }

    @FXML
    public void pressBtnMul() {
    	operator = '*';
    	aSetNumber();
    	sNumber = "";
    }

    @FXML
    public void pressBtn3() {
    	pressBtnNumber("" + 3);
    }

    @FXML
    public void pressBtn0() {
    	pressBtnNumber("" + 0);
    	
    }

    @FXML
    public void pressBtn1() {
    	pressBtnNumber("" + 1);
    }

    @FXML
    public void pressBtnPoi() {
    	if(textField.getText().contains("."))
    		return;
    	sNumber += ".";
    	textField.setText(sNumber);
    }
    
    @FXML
    public void pressBtnRes() {
    	bSetNumber();
    	String a = Double.toString(aI + aD);
    	String b = Double.toString(bI + bD);
    	if(a.endsWith(".0") && b.endsWith(".0") && operator != '/') {
    		dzialanieInteger();
    	} else {
    		dzialanieDouble();
    	}
    	String result = Double.toString(resultI + resultD);
    	if(result.endsWith(".0"))
    		result = result.replace(".0", "");
    	textField.setText(result);
    	sprawdzZmienne();
    	reset();
    }
    
    //--------------------------------metody----------------------------------------------------------
    
    private void pressBtnNumber(String btnNumber) {
    	sNumber += btnNumber;
    	textField.setText(sNumber);
    }
    
    private boolean isInteger() {
    	return (!textField.getText().contains("."));
    }
    
    private void sprawdzZmienne() {
    	System.out.println("aI: " + aI + " aD: " + aD + " " + operator + " " + " bI: " + bI + " bD: " + bD + " = "+ " resultI: " + resultI + " resultD: " + resultD);
    }
    
    private void aSetNumber() {
    	if(isInteger())
    		aI = Integer.parseInt(sNumber);
    	else 
    		aD = Double.parseDouble(sNumber);
    }
    
    private void bSetNumber() {
    	if(isInteger())
    		bI = Integer.parseInt(sNumber);
    	else 
    		bD = Double.parseDouble(sNumber);
    }
    
    
    
    private void reset() {
    	aI = 0;
    	aD = 0;
    	bI = 0;
    	bD = 0;
    	operator = 0;
    	sNumber = "";
    	resultI = 0;
    	resultD = 0;
    }
    private void dzialanieInteger() {
    	switch(operator) {
	    	case '+': 
	    		resultI = aI + bI;
	    		break;
	    	case '-':
	    		resultI = aI - bI;
	    		break;
	    	case '*':
	    		resultI = aI * bI;
	    		break;
	    	case '/':
	    		resultD = aI / bI;
	    		break;
    	}
    }
    private void dzialanieDouble() {
    	switch(operator) {
	    	case '+': 
	    		resultD = (aI + aD) + (bI + bD);
	    		break;
	    	case '-':
	    		resultD = (aI + aD) - (bI + bD);
	    		break;
	    	case '*':
	    		resultD = (aI + aD) * (bI + bD);
	    		break;
	    	case '/':
	    		resultD = (aI + aD) / (bI + bD);
	    		break;
    	}
    }
}
