package com.bala555.flames;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    counter boyObject = new counter();
    counter girlObject = new counter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        EditText boyName = (EditText) findViewById(R.id.editText1);
        EditText girlName = (EditText) findViewById(R.id.editText2);

        String BoyName = boyName.getText().toString().trim();
        String GirlName = girlName.getText().toString().trim();

        if ((BoyName.equals("")) || (GirlName.equals("")) || BoyName.length() == 0 || GirlName.length() == 0) {

            Toast.makeText(this, "Enter the Names Correctly", Toast.LENGTH_SHORT).show();

        } else {

            ProceedToFlames(BoyName, GirlName);

        }
    }

    public void ProceedToFlames(String Boy, String Girl) {

        boyObject.count(Boy);
        girlObject.count(Girl);
        int Result = FindNumber();
        Display(Result);
        free();
    }

    public void free() {
        boyObject.a = 0;
        girlObject.a = 0;
        boyObject.b = 0;
        girlObject.b = 0;
        boyObject.c = 0;
        girlObject.c = 0;
        boyObject.d = 0;
        girlObject.d = 0;
        boyObject.e = 0;
        girlObject.e = 0;
        boyObject.f = 0;
        girlObject.f = 0;
        boyObject.g = 0;
        girlObject.g = 0;
        boyObject.h = 0;
        girlObject.h = 0;
        boyObject.i = 0;
        girlObject.i = 0;
        boyObject.j = 0;
        girlObject.j = 0;
        boyObject.k = 0;
        girlObject.k = 0;
        boyObject.l = 0;
        girlObject.l = 0;
        boyObject.m = 0;
        girlObject.m = 0;
        boyObject.n = 0;
        girlObject.n = 0;
        boyObject.o = 0;
        girlObject.o = 0;
        boyObject.p = 0;
        girlObject.p = 0;
        boyObject.q = 0;
        girlObject.q = 0;
        boyObject.r = 0;
        girlObject.r = 0;
        boyObject.s = 0;
        girlObject.s = 0;
        boyObject.t = 0;
        girlObject.t = 0;
        boyObject.u = 0;
        girlObject.u = 0;
        boyObject.v = 0;
        girlObject.v = 0;
        boyObject.w = 0;
        girlObject.w = 0;
        boyObject.x = 0;
        girlObject.x = 0;
        boyObject.y = 0;
        girlObject.y = 0;
        boyObject.z = 0;
        girlObject.z = 0;
    }

    public int FindNumber() {
        int a = boyObject.a - girlObject.a;
        int b = boyObject.b - girlObject.b;
        int c = boyObject.c - girlObject.c;
        int d = boyObject.d - girlObject.d;
        int e = boyObject.e - girlObject.e;
        int f = boyObject.f - girlObject.f;
        int g = boyObject.g - girlObject.g;
        int h = boyObject.h - girlObject.h;
        int i = boyObject.i - girlObject.i;
        int j = boyObject.j - girlObject.j;
        int k = boyObject.k - girlObject.k;
        int l = boyObject.l - girlObject.l;
        int m = boyObject.m - girlObject.m;
        int n = boyObject.n - girlObject.n;
        int o = boyObject.o - girlObject.o;
        int p = boyObject.p - girlObject.p;
        int q = boyObject.q - girlObject.q;
        int r = boyObject.r - girlObject.r;
        int s = boyObject.s - girlObject.s;
        int t = boyObject.t - girlObject.t;
        int u = boyObject.u - girlObject.u;
        int v = boyObject.v - girlObject.v;
        int w = boyObject.w - girlObject.w;
        int x = boyObject.x - girlObject.x;
        int y = boyObject.y - girlObject.y;
        int z = boyObject.z - girlObject.z;

        return (Math.abs(a) + Math.abs(b) + Math.abs(c) + Math.abs(d) + Math.abs(e) + Math.abs(f) + Math.abs(g) + Math.abs(h) + Math.abs(i) + Math.abs(j) + Math.abs(k) + Math.abs(l) + Math.abs(m) + Math.abs(n) + Math.abs(o) + Math.abs(p) + Math.abs(q) + Math.abs(r) + Math.abs(s) + Math.abs(t) + Math.abs(u) + Math.abs(v) + Math.abs(w) + Math.abs(x) + Math.abs(y) + Math.abs(z));
    }

    public void Display(int Res) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        switch (Res) {
            case 0:
                alert.setTitle("Check Your Inputs");
                alert.setMessage("Both Names have same characters");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                break;
            case 3:
            case 5:
            case 14:
            case 16:
            case 18:

            case 21:
            case 23:
            case 27:
                alert.setTitle("ANSWER");
                alert.setMessage("Friends");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                break;
            case 10:
            case 12:
            case 19:

                alert.setTitle("ANSWER");
                alert.setMessage("Love");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                break;
            case 6:
            case 11:
            case 15:
            case 26:
                alert.setTitle("ANSWER");
                alert.setMessage("Marriage");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                break;
            case 8:
            case 13:
            case 28:
            case 30:
                alert.setTitle("ANSWER");
                alert.setMessage("Affection");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                break;
            case 2:
            case 4:
            case 7:
            case 9:
            case 20:
            case 22:
            case 24:
            case 25:
                alert.setTitle("ANSWER");
                alert.setMessage("Enemy");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                break;
            case 1:

            case 17:
            case 29:
                alert.setTitle("ANSWER");
                alert.setMessage("Sister");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                break;
            default:
                alert.setTitle("ALERT");
                alert.setMessage("Something Went Wrong");

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                break;
        }
        final AlertDialog dailog = alert.create();
        dailog.show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Alert");
        alert.setMessage("Do you want to exit");
        alert.setCancelable(false);

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        final AlertDialog dailog = alert.create();
        dailog.show();
    }
}

class counter {

    public
    String ch = "";
    int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

    public void count(String name) {
        String bname[] = name.split("");

        int inc = 1;
        do {
            ch = bname[inc];
            switch (ch) {
                case "a":
                case "A":
                    a = a + 1;
                    break;

                case "b":
                case "B":
                    b = b + 1;
                    break;

                case "c":
                case "C":
                    c = c + 1;
                    break;

                case "d":
                case "D":
                    d = d + 1;
                    break;

                case "e":
                case "E":
                    e = e + 1;
                    break;

                case "f":
                case "F":
                    f = f + 1;
                    break;

                case "g":
                case "G":
                    g = g + 1;
                    break;

                case "h":
                case "H":
                    h = h + 1;
                    break;

                case "i":
                case "I":
                    i = i + 1;
                    break;

                case "j":
                case "J":
                    j = j + 1;
                    break;

                case "k":
                case "K":
                    k = k + 1;
                    break;

                case "l":
                case "L":
                    l = l + 1;
                    break;

                case "m":
                case "M":
                    m = m + 1;
                    break;

                case "n":
                case "N":
                    n = n + 1;
                    break;

                case "o":
                case "O":
                    o = o + 1;
                    break;

                case "p":
                case "P":
                    p = p + 1;
                    break;

                case "q":
                case "Q":
                    q = q + 1;
                    break;

                case "r":
                case "R":
                    r = r + 1;
                    break;

                case "s":
                case "S":
                    s = s + 1;
                    break;

                case "t":
                case "T":
                    t = t + 1;
                    break;

                case "u":
                case "U":
                    u = u + 1;
                    break;

                case "v":
                case "V":
                    v = v + 1;
                    break;

                case "w":
                case "W":
                    w = w + 1;
                    break;

                case "x":
                case "X":
                    x = x + 1;
                    break;

                case "y":
                case "Y":
                    y = y + 1;
                    break;

                case "z":
                case "Z":
                    z = z + 1;
                    break;

                default:
                    break;
            }
            inc++;
        } while (inc < bname.length);
    }
}
