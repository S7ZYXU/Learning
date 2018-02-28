package com.s7zyxu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView editView;
    private String op;
    private double num1,num2,result;
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
            DecimalFormat format = new DecimalFormat("###.##");

            try{
                switch (button.getId()){
                    case R.id.num0:{

                        break;
                    }
                    case R.id.num1:{

                        break;
                    }
                    case R.id.num2:{

                        break;
                    }
                    case R.id.num3:{

                        break;
                    }
                    case R.id.num4:{

                        break;
                    }
                    case R.id.num5:{

                        break;
                    }
                    case R.id.num6:{

                        break;
                    }
                    case R.id.num7:{

                        break;
                    }
                    case R.id.num8:{

                        break;
                    }
                    case R.id.num9:{

                        break;
                    }

                    case R.id.opposite:{

                        break;
                    }
                    case R.id.division:{

                        break;
                    }
                    case R.id.multi:{

                        break;
                    }
                    case R.id.sub:{

                        break;
                    }
                    case R.id.add:{

                        break;
                    }

                    case R.id.point:{

                        break;
                    }

                    case R.id.C:{

                        break;
                    }
                    case R.id.CE:{

                        break;
                    }

                    case R.id.result:{

                        break;
                    }
                }
            }catch(Exception e){}
        }
    };
}
