package com.nerminekrem.proje1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnArti, btnEksi, btnCarp, btnBolme, btnTekSil, btnSifirla, btnEsit;
    Button btnKüp, btnKare, btnCos, btnSin, btnÜs, btnTan, btnKök;

    double a;
    double ans = 0;
    double sayi1 = 0, sayi2 = 0;

    boolean mSin, mCos, mTan, mArti, mCikar, mCarpma, mBolme, mAritmetik, mKok, mKare, mKüp, mLog;

    EditText islemEkrani;

    String islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        operator();
    }

    private void operator() {

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);


        btnArti = (Button) findViewById(R.id.btnArti);
        btnEksi = (Button) findViewById(R.id.btnEksi);
        btnCarp = (Button) findViewById(R.id.btnCarp);
        btnBolme = (Button) findViewById(R.id.btnBolme);
        btnKare = (Button) findViewById(R.id.btnKare);
        btnKüp = (Button) findViewById(R.id.btnKüp);
        btnÜs = (Button) findViewById(R.id.btnÜs);
        btnCos = (Button) findViewById(R.id.btnCos);
        btnSin = (Button) findViewById(R.id.btnSin);
        btnTan = (Button) findViewById(R.id.btnTan);
        btnKök = (Button) findViewById(R.id.btnKök);


        btnTekSil = (Button) findViewById(R.id.btnTekSil);
        btnEsit = (Button) findViewById(R.id.btnEsit);
        btnSifirla = (Button) findViewById(R.id.btnSifirla);
        islemEkrani = (EditText) findViewById(R.id.islemekran);


        btnTekSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String str;
                    str = islemEkrani.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    islemEkrani.setText(str);
                } catch (Exception e) {

                }
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sin(Double.parseDouble(islemEkrani.getText().toString()));
                    islemEkrani.setText("");
                    islemEkrani.setText(islemEkrani.getText().toString() + a);
                } catch (Exception e) {

                }
                islemEkrani.setText("sin");
                mSin = true;
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.cos(Double.parseDouble(islemEkrani.getText().toString()));
                    islemEkrani.setText("");
                    islemEkrani.setText(islemEkrani.getText().toString() + a);
                } catch (Exception e) {
                }
                islemEkrani.setText("cos");
                mCos = true;
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.tan(Double.parseDouble(islemEkrani.getText().toString()));
                    islemEkrani.setText("");
                    islemEkrani.setText(islemEkrani.getText().toString() + a);
                } catch (Exception e) {

                }
                islemEkrani.setText("tan");
                mTan = true;
            }
        });
        btnSifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islemEkrani.setText("");
            }
        });
        btnBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islemEkrani.setText("/");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "1");

                mAritmetik = true;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "2");
                mAritmetik = true;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "3");
                mAritmetik = true;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "4");
                mAritmetik = true;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "5");
                mAritmetik = true;
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "6");
                mAritmetik = true;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "7");
                mAritmetik = true;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "8");
                mAritmetik = true;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "9");
                mAritmetik = true;
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islemEkrani.setText(islemEkrani.getText() + "0");
                mAritmetik = true;
            }
        });

        btnArti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    sayi1 = Float.parseFloat(islemEkrani.getText() + "");
                    mArti = true;
                    islemEkrani.setText(null);
                } catch (Exception e) {

                }
            }
        });

        btnEksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sayi1 = Float.parseFloat(islemEkrani.getText() + "");
                    mCikar = true;
                    islemEkrani.setText(null);
                } catch (Exception e) {

                }
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sayi1 = Float.parseFloat(islemEkrani.getText() + "");
                    mCarpma = true;
                    islemEkrani.setText(null);
                } catch (Exception e) {

                }
            }
        });

        btnBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sayi1 = Float.parseFloat(islemEkrani.getText() + "");
                    mBolme = true;
                    islemEkrani.setText(null);
                } catch (Exception e) {

                }
            }
        });
        btnKök.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sqrt(Double.parseDouble(islemEkrani.getText().toString()));
                    islemEkrani.setText("");
                    islemEkrani.setText(islemEkrani.getText().toString() + a);
                } catch (Exception e) {

                }
            }
        });
        btnKare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.pow(Double.parseDouble(islemEkrani.getText().toString()), 2);
                    islemEkrani.setText("");
                    islemEkrani.setText(islemEkrani.getText().toString() + a + "");
                } catch (Exception e) {

                }
            }
        });
        btnKüp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.pow(Double.parseDouble(islemEkrani.getText().toString()), 3);
                    islemEkrani.setText("");
                    islemEkrani.setText(islemEkrani.getText().toString() + a);
                } catch (Exception e) {

                }
            }
        });
        btnÜs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.log(Double.parseDouble(islemEkrani.getText().toString()));
                    islemEkrani.setText("");
                    islemEkrani.setText(islemEkrani.getText().toString() + a);
                } catch (Exception e) {

                }
            }
        });

        btnEsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mSin == true) {
                    if (mAritmetik == true) {
                        String str;
                        str = islemEkrani.getText().toString();
                        str = str.substring(3);
                        a = Math.sin(Double.parseDouble(str));
                        islemEkrani.setText(a + "");
                        mAritmetik = false;
                        mSin = false;
                    }

                }
                if (mCos == true) {
                    if (mAritmetik == true) {
                        String str;
                        str = islemEkrani.getText().toString();
                        str = str.substring(3);
                        a = Math.cos(Double.parseDouble(str));
                        islemEkrani.setText(a + "");
                        mAritmetik = false;
                        mCos = false;
                    }
                }
                if (mTan == true) {
                    if (mAritmetik == true) {
                        String str;
                        str = islemEkrani.getText().toString();
                        str = str.substring(3);
                        a = Math.sin(Double.parseDouble(str));
                        islemEkrani.setText(a + "");
                        mAritmetik = false;
                        mTan = false;
                    }
                }
                if (mKok == true) {
                    if (mAritmetik == true) {
                        String str;
                        str = islemEkrani.getText().toString();
                        str = str.substring(3);
                        a = Math.sqrt(Double.parseDouble(str));
                        islemEkrani.setText(a + "");
                        mAritmetik = false;
                        mKok = false;
                    }
                }

                if (mKare == true) {
                    if (mAritmetik == true) {
                        String str;
                        str = islemEkrani.getText().toString();
                        str = str.substring(3);
                        a = Math.pow(Double.parseDouble(str), Double.parseDouble(str));
                        islemEkrani.setText(a + "");
                        mAritmetik = false;
                        mKare = false;
                    }
                }
                if (mKüp == true) {
                    if (mAritmetik == true) {
                        String str;
                        str = islemEkrani.getText().toString();
                        str = str.substring(3);
                        a = Math.pow(Double.parseDouble(str), Double.parseDouble(str));
                        islemEkrani.setText(a + "");
                        mAritmetik = false;
                        mKüp = false;
                    }
                }
                if (mLog == true) {
                    if (mAritmetik == true) {
                        String str;
                        str = islemEkrani.getText().toString();
                        str = str.substring(3);
                        a = Math.log(Double.parseDouble(str));
                        islemEkrani.setText(a + "");
                        mAritmetik = false;
                        mLog = false;
                    }
                }


                if (mArti == true) {
                    sayi2 = Float.parseFloat(islemEkrani.getText() + "");
                    islemEkrani.setText(sayi1 + sayi2 + "");
                    mArti = false;
                }

                if (mCikar == true) {
                    sayi2 = Float.parseFloat(islemEkrani.getText() + "");
                    islemEkrani.setText(sayi1 - sayi2 + "");
                    mCikar = false;
                }

                if (mCarpma == true) {
                    sayi2 = Float.parseFloat(islemEkrani.getText() + "");
                    islemEkrani.setText(sayi1 * sayi2 + "");
                    boolean mMultiplication = false;
                }

                if (mBolme == true) {
                    sayi2 = Float.parseFloat(islemEkrani.getText() + "");
                    islemEkrani.setText(sayi1 / sayi2 + "");
                    mBolme = false;
                }

                ans = Double.parseDouble(islemEkrani.getText().toString());
            }
        });


    }


}