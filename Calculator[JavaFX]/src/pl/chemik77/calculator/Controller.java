package pl.chemik77.calculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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
    
    @FXML
    private Button btnPlusMin;
    
    @FXML
    private Button btnFract;
    
    @FXML
    private Button btnPow;
    
    @FXML
    private Button btnSqrt;
    
    @FXML
    private Button btnPerc;
    
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
        assert btnPlusMin != null : "fx:id=\"btnPlusMin\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnFract != null : "fx:id=\"btnFract\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnPow != null : "fx:id=\"btnPow\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnSqrt != null : "fx:id=\"btnSqrt\" was not injected: check your FXML file 'Window.fxml'.";
        assert btnPerc != null : "fx:id=\"btnPerc\" was not injected: check your FXML file 'Window.fxml'.";
        
        
        btnBS.setText(Character.toString('\u2190'));
        btnMul.setText(Character.toString('\u2217'));
        btnDiv.setText(Character.toString('\u00f7'));
        btnSqrt.setText("" + '\u00B2' + '\u221A');
        btnPlusMin.setText(Character.toString('\u00B1'));
        btnPow.setText("x^y");
        
        
        
        clear();
	}
	
	private void clear() {
		textField.setText("0");
	}
    
	//--------------------------------initialize logic----------------------------------------------------

	//--------------------------------parameters----------------------------------------------------------
	
	BigDecimal a, b;
	String sNumber = "0";
	char operator;
	BigDecimal result;
	
	//--------------------------------methods FXML----------------------------------------------------------
	
	//--------- clear and backspace ------------------
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
	
	//--------- numbers and point ------------------

    @FXML
    public void pressBtn9() {
    	pressBtnNumber("" + 9);
    }

    @FXML
    public void pressBtn8() {
    	pressBtnNumber("" + 8);
    }

    @FXML
    public void pressBtn7() {
    	pressBtnNumber("" + 7);
    }
    
    @FXML
    public void pressBtn6() {
    	pressBtnNumber("" + 6);
    }

    @FXML
    public void pressBtn5() {
    	pressBtnNumber("" + 5);
    }

    @FXML
    public void pressBtn4() {
    	pressBtnNumber("" + 4);
    }

    @FXML
    public void pressBtn3() {
    	pressBtnNumber("" + 3);
    }

    @FXML
    public void pressBtn2() {
    	pressBtnNumber("" + 2);
    }

    @FXML
    public void pressBtn1() {
    	pressBtnNumber("" + 1);
    }

    @FXML
    public void pressBtn0() {
    	if(textField.getText().equals("0"))
    		return;
    	pressBtnNumber("" + 0);
    	
    }
    
    @FXML
    public void pressBtnPoi() {
    	if(textField.getText().contains("."))
    		return;
    	sNumber += ".";
    	textField.setText(sNumber);
    }
    
  //--------- operators ------------------
    
    @FXML
    public void pressBtnSub() {
    	operator = '-';
    	aSetNumber();
    	sNumber = "";
    }

    @FXML
    public void pressBtnAdd() {
    	operator = '+';
    	aSetNumber();
    	sNumber = "";
    }
    
    @FXML
    public void pressBtnMul() {
    	operator = '*';
    	aSetNumber();
    	sNumber = "";
    }
    
    @FXML
    public void pressBtnDiv() {
    	operator = '/';
    	aSetNumber();
    	sNumber = "";
    }
    
    @FXML
    public void pressBtnPlusMin() {
    	if(textField.getText().equals("0"))
    		return;
    	else 
    		sNumber = "-" + sNumber;
    	textField.setText(sNumber);
    }
    
    @FXML
    public void pressBtnFract() {
    	if(textField.getText().equals("0"))
    		return;
    	else {
    		BigDecimal num = new BigDecimal(textField.getText());
    		num = new BigDecimal("1").divide(num, MathContext.DECIMAL64);
    		sNumber = num.toString();
    	}
    	textField.setText(sNumber);
    	reset();
    }
    
    @FXML
    public void pressBtnPow() {
    	operator = '^';
    	aSetNumber();
    	sNumber = "";
    }

    @FXML
    public void pressBtnSqrt() {
    	if(textField.getText().equals("0"))
    		return;
    	else {
    		Double numD = Double.parseDouble(textField.getText());
    		numD = Math.sqrt(numD);
    		sNumber = numD.toString();
    		if(sNumber.endsWith(".0"))
        		sNumber = sNumber.replace(".0", "");
        	textField.setText(sNumber);
        	reset();
    	}
    }
    
    @FXML
    public void pressBtnPerc() {
    	//to do
    }
    
    //--------- result ------------------
    
    @FXML
    public void pressBtnRes() {
    	bSetNumber();
    	operations();
    	result = result.round(new MathContext(13, RoundingMode.HALF_UP));
    	String res = result.toString();
    	if(res.endsWith(".0"))
    		res = res.replace(".0", "");
    	textField.setText(res);
    	//checkVariables();
    	reset();
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
    	a = new BigDecimal(sNumber);
    }
    
    private void bSetNumber() {
    	b = new BigDecimal(sNumber);
    }
    
    private void reset() {
    	a = BigDecimal.valueOf(0);
    	b = BigDecimal.valueOf(0);
    	operator = 0;
    	sNumber = "0";
    	result = BigDecimal.valueOf(0);
    }
    
    private void operations() {
    	switch(operator) {
	    	case '+': 
	    		result = a.add(b);
	    		break;
	    	case '-':
	    		result = a.subtract(b);
	    		break;
	    	case '*':
	    		result = a.multiply(b);
	    		break;
	    	case '/':
	    		result = a.divide(b, MathContext.DECIMAL64);
	    		break;
	    	case '^':
	    		result = a.pow(b.intValue(), MathContext.DECIMAL64);
	    		break;
    	}
    }
    
    private void checkVariables() {
    	System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
