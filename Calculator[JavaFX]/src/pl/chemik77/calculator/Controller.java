package pl.chemik77.calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;

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
    
    @FXML
    private Button btnBS;
    
    @Override
	public void initialize(URL link, ResourceBundle resource) {
		assert btnAC != null : "fx:id=\"btnAC\" was not injected: check your FXML file 'Window.fxml'.";
		assert btnBS != null : "fx:id=\"btnBS\" was not injected: check your FXML file 'Window.fxml'.";
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
        
        btnBS.setText(Character.toString('\u2190'));
        btnMul.setText(Character.toString('\u2217'));
        btnDiv.setText(Character.toString('\u00f7'));
        
        clear();
	}
	
	private void clear() {
		textField.setText("0");
	}
    
	//--------------------------------initialize logic----------------------------------------------------

	//--------------------------------parameters----------------------------------------------------------
	
	double a, b;
	String sNumber = "0";
	char operator;
	double result;
	
	//--------------------------------methods FXML----------------------------------------------------------
	
	@FXML
    public void pressBtnAC() {
		clear();
		reset();
	}
	
	@FXML
    public void pressBtnBS() {
		if(sNumber.equals("0")) {
			return;
		} else if(sNumber.length() > 0) {
			sNumber = sNumber.substring(0, sNumber.length()-1);
		}
		if(sNumber.equals("")) {
			sNumber = "0";
		}
		textField.setText(sNumber);
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
    	if(textField.getText().equals("0"))
    		return;
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
    	operations();
    	String res = Double.toString(result);
    	if(res.endsWith(".0"))
    		res = res.replace(".0", "");
//		***to correction***
//    	if(res.length() > 16)
//    		res = String.format("%.16f", result);
    	textField.setText(res);
    	checkVariables();
//		***to correction***
    	double temp = result;
    	reset();
    	a = temp;
    	test();
    }
    
    //--------------------------------methods----------------------------------------------------------
    
    private void pressBtnNumber(String btnNumber) {
    	if(sNumber.length() == 17)
    		return;
    	if(sNumber.equals("0"))
    		sNumber = "";
    	sNumber += btnNumber;
    	textField.setText(sNumber);
    }
    
    private void aSetNumber() {
    	if(sNumber.isEmpty())
    		return;
    	a = Double.parseDouble(sNumber);
    }
    
    private void bSetNumber() {
    	b = Double.parseDouble(sNumber);
    }
    
    private void reset() {
    	a = 0;
    	b = 0;
    	operator = 0;
    	sNumber = "0";
    	result = 0;
    }
    
    private void operations() {
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
    
    private void checkVariables() {
    	System.out.println(a + " " + operator + " " + b + " = " + result);
    }
    private void test() {
    	System.out.println();
    }
}
