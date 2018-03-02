package com.s7zyxu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView editView;
    private String op="+";
    private BigDecimal num = BigDecimal.valueOf(0),result = BigDecimal.valueOf(0);
    private Button btnum0,btnum1,btnum2,btnum3,btnum4,btnum5,btnum6,btnum7,btnum8,btnum9;
    private Button btopposite,btdivision,btmulti,btsub,btadd,btresult;
    private Button btpoint;
    private Button btC,btCE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnum0 = (Button)findViewById(R.id.num0);
        btnum0.setOnClickListener(listener);
        btnum1 = (Button)findViewById(R.id.num1);
        btnum1.setOnClickListener(listener);
        btnum2 = (Button)findViewById(R.id.num2);
        btnum2.setOnClickListener(listener);
        btnum3 = (Button)findViewById(R.id.num3);
        btnum3.setOnClickListener(listener);
        btnum4 = (Button)findViewById(R.id.num4);
        btnum4.setOnClickListener(listener);
        btnum5 = (Button)findViewById(R.id.num5);
        btnum5.setOnClickListener(listener);
        btnum6 = (Button)findViewById(R.id.num6);
        btnum6.setOnClickListener(listener);
        btnum7 = (Button)findViewById(R.id.num7);
        btnum7.setOnClickListener(listener);
        btnum8 = (Button)findViewById(R.id.num8);
        btnum8.setOnClickListener(listener);
        btnum9 = (Button)findViewById(R.id.num9);
        btnum9.setOnClickListener(listener);
        btopposite = (Button)findViewById(R.id.opposite);
        btopposite.setOnClickListener(listener);
        btdivision = (Button)findViewById(R.id.division);
        btdivision.setOnClickListener(listener);
        btmulti = (Button)findViewById(R.id.multi);
        btmulti.setOnClickListener(listener);
        btsub = (Button)findViewById(R.id.sub);
        btsub.setOnClickListener(listener);
        btadd = (Button)findViewById(R.id.add);
        btadd.setOnClickListener(listener);
        btresult = (Button)findViewById(R.id.result);
        btresult.setOnClickListener(listener);
        btpoint = (Button)findViewById(R.id.point);
        btpoint.setOnClickListener(listener);
        btC = (Button)findViewById(R.id.C);
        btC.setOnClickListener(listener);
        btCE = (Button)findViewById(R.id.CE);
        btCE.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            textView = (TextView) findViewById(R.id.textView);
            editView = (TextView)findViewById(R.id.editView);
            String str;
            Button button = (Button)view;

            try{
                switch (button.getId()){
                    case R.id.num0:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "0";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "0";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num1:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "1";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "1";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "1";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num2:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "2";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "2";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "2";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num3:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "3";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "3";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "3";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num4:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "4";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "4";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "4";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num5:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "5";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "5";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "5";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num6:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "6";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "6";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "6";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num7:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "7";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "7";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "7";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num8:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "8";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "8";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "8";
                            }
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.num9:{
                        str = editView.getText().toString();
                        if(str.equals("") || str.equals("错误")){
                            str = "9";
                        }else{
                            if(!str.equals("0")){
                                if(Character.isDigit(str.charAt(str.length()-1)) || str.charAt(str.length()-1)=='.'){
                                    str += "9";
                                }else{
                                    str = "";
                                    textView.setText(String.valueOf(result));
                                }
                            }else{
                                str = "9";
                            }
                        }
                        editView.setText(str);
                        break;
                    }

                    case R.id.opposite:{
                        str = editView.getText().toString();
                        if(Character.isDigit(str.charAt(str.length()-1))){
                            BigDecimal decimal = new BigDecimal(str);
                            decimal = decimal.multiply(new BigDecimal(-1));
                            str = String.valueOf(decimal);
                        }
                        editView.setText(str);
                        break;
                    }
                    case R.id.division:{
                        boolean flag = true;
                        str = editView.getText().toString();
                        num = new BigDecimal(str);
                        switch(op){
                            case "+":
                                result = result.add(num);
                                break;
                            case "-":
                                result = result.subtract(num);
                                break;
                            case "*":
                                result = result.multiply(num);
                                break;
                            case "/":
                                if(num.compareTo(new BigDecimal(0))==0){
                                    flag = false;
                                }else{
                                    result = result.divide(num,10,4);
                                }
                                break;
                        }
                        if(flag){
                            textView.setText(subZeroAndDot(String.valueOf(result)));
                            editView.setText("");
                            op = "/";
                        }else {
                            textView.setText("");
                            editView.setText("错误");
                            num = BigDecimal.valueOf(0);
                            result = BigDecimal.valueOf(0);
                            op = "+";
                        }
                        break;
                    }
                    case R.id.multi:{
                        boolean flag = true;
                        str = editView.getText().toString();
                        num = new BigDecimal(str);
                        switch(op){
                            case "+":
                                result = result.add(num);
                                break;
                            case "-":
                                result = result.subtract(num);
                                break;
                            case "*":
                                result = result.multiply(num);
                                break;
                            case "/":
                                if(num.compareTo(new BigDecimal(0))==0){
                                    flag = false;
                                }else{
                                    result = result.divide(num,10,4);
                                }
                                break;
                        }
                        if(flag){
                            textView.setText(subZeroAndDot(String.valueOf(result)));
                            editView.setText("");
                            op = "*";
                        }else {
                            textView.setText("");
                            editView.setText("错误");
                            num = BigDecimal.valueOf(0);
                            result = BigDecimal.valueOf(0);
                            op = "+";
                        }
                        break;
                    }
                    case R.id.sub:{
                        boolean flag = true;
                        str = editView.getText().toString();
                        num = new BigDecimal(str);
                        switch(op){
                            case "+":
                                result = result.add(num);
                                break;
                            case "-":
                                result = result.subtract(num);
                                break;
                            case "*":
                                result = result.multiply(num);
                                break;
                            case "/":
                                if(num.compareTo(new BigDecimal(0))==0){
                                    flag = false;
                                }else{
                                    result = result.divide(num,10,4);
                                }
                                break;
                        }
                        if(flag){
                            textView.setText(subZeroAndDot(String.valueOf(result)));
                            editView.setText("");
                            op = "-";
                        }else {
                            textView.setText("");
                            editView.setText("错误");
                            num = BigDecimal.valueOf(0);
                            result = BigDecimal.valueOf(0);
                            op = "+";
                        }
                        break;
                    }
                    case R.id.add:{
                        boolean flag = true;
                        str = editView.getText().toString();
                        num = new BigDecimal(str);
                        switch(op){
                            case "+":
                                result = result.add(num);
                                break;
                            case "-":
                                result = result.subtract(num);
                                break;
                            case "*":
                                result = result.multiply(num);
                                break;
                            case "/":
                                if(num.compareTo(new BigDecimal(0))==0){
                                    flag = false;
                                }else{
                                    result = result.divide(num,10,4);
                                }
                                break;
                        }
                        if(flag){
                            textView.setText(subZeroAndDot(String.valueOf(result)));
                            editView.setText("");
                            op = "+";
                        }else {
                            textView.setText("");
                            editView.setText("错误");
                            num = BigDecimal.valueOf(0);
                            result = BigDecimal.valueOf(0);
                            op = "+";
                        }
                        break;
                    }

                    case R.id.point:{
                        str = editView.getText().toString();
                        if(str.indexOf('.')==-1) {
                            str += '.';
                            editView.setText(str);
                        }
                        break;
                    }

                    case R.id.C:{
                        textView.setText("");
                        editView.setText("");
                        num = BigDecimal.valueOf(0);
                        result = BigDecimal.valueOf(0);
                        op = "+";
                        break;
                    }
                    case R.id.CE:{
                        editView.setText("");
                        break;
                    }

                    case R.id.result:{
                        str = editView.getText().toString();
                        boolean flag = true;
                        if(!str.equals("")){
                            num = new BigDecimal(str);
                            switch(op){
                                case "+":
                                    result = result.add(num);
                                    break;
                                case "-":
                                    result = result.subtract(num);
                                    break;
                                case "*":
                                    result = result.multiply(num);
                                    break;
                                case "/":
                                    if(num.compareTo(new BigDecimal(0))==0){
                                        flag = false;
                                    }else{
                                        result = result.divide(num,10,4);
                                    }
                                    break;
                            }
                        }
                        if(flag){
                            editView.setText(subZeroAndDot(String.valueOf(result)));
                        }else {
                            editView.setText("错误");
                        }
                        textView.setText("");
                        num = BigDecimal.valueOf(0);
                        result = BigDecimal.valueOf(0);
                        op = "+";
                        break;
                    }
                }
            }catch(Exception e){}
        }
    };
    public static String subZeroAndDot(String s){
        if(s.indexOf(".") > 0){
            s = s.replaceAll("0+?$", "");//去掉多余的0
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return s;
    }
}
