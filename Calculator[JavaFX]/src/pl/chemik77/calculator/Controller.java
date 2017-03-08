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

	
	double a, b;
	String s = "";
	char operator;
	double result;
	
	@FXML
    public void pressBtnAC() {
		clear();
		reset();
	}

    @FXML
    public void pressBtnDiv() {
    	operator = '/';
    	s = "";
    }

    @FXML
    public void pressBtn8() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 8);
    	} else {
    		b = pressBtnNum("" + 8);
    	}
    }

    @FXML
    public void pressBtn9() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 9);
    	} else {
    		b = pressBtnNum("" + 9);
    	}
    	
    }

    @FXML
    public void pressBtn6() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 6);
    	} else {
    		b = pressBtnNum("" + 6);
    	}
    }

    @FXML
    public void pressBtnSub() {
    	operator = '-';
    	s = "";
    }

    @FXML
    public void pressBtn7() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 7);
    	} else {
    		b = pressBtnNum("" + 7);
    	}
    }

    @FXML
    public void pressBtnAdd() {
    	operator = '+';
    	s = "";
    }

    @FXML
    public void pressBtn4() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 4);
    	} else {
    		b = pressBtnNum("" + 4);
    	}
    }

    @FXML
    public void pressBtn5() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 5);
    	} else {
    		b = pressBtnNum("" + 5);
    	}
    }

    @FXML
    public void pressBtn2() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 2);
    	} else {
    		b = pressBtnNum("" + 2);
    	}
    }

    @FXML
    public void pressBtnMul() {
    	operator = '*';
    	s = "";
    }

    @FXML
    public void pressBtn3() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 3);
    	} else {
    		b = pressBtnNum("" + 3);
    	}
    }

    @FXML
    public void pressBtn0() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 0);
    	} else {
    		b = pressBtnNum("" + 0);
    	}
    	
    }
    

    @FXML
    public void pressBtn1() {
    	if(isaNum()) {
    		a = pressBtnNum("" + 1);
    	} else {
    		b = pressBtnNum("" + 1);
    	}
    }

    @FXML
    public void pressBtnPoi() {
    	s += ".";
    	textField.setText(s);
    }
    
    @FXML
    public void pressBtnRes() {
    	dzialanie();
    	String rS = Double.toString(result);
    	textField.setText("" + rS);
    	System.out.println("" + a + operator + b);
    	reset();
    }
    
    //dzialania
    
    private boolean isaNum() {
    	return operator == 0;
    }

    private double pressBtnNum(String number) {
    	s += number;
    	Double liczba;
		liczba = Double.parseDouble(s);
		String st = liczba.toString();
		textField.setText(st);
		return liczba;
    }
    
    private void reset() {
    	a = 0;
    	b = 0;
    	operator = 0;
    	s = "";
    	result = 0;
    }
    private void dzialanie() {
    	switch(operator) {
	    	case '+': 
	    		result = a + b;
	    		break;
	    	case '-':
	    		result = a - b;
	    		break;
	    	case '*':
	    		result = a * b;
	    		break;
	    	case '/':
	    		result = a / b;
	    		break;
    	}
    }
    
}
