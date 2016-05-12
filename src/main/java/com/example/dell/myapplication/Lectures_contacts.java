package com.example.dell.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.ImageView;

public class Lectures_contacts extends Activity {

    private ImageView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lectures_contacts);
        b = (ImageView) findViewById(R.id.phonenum1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8403"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });

        b = (ImageView) findViewById(R.id.phonenum2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8402"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });

        b = (ImageView) findViewById(R.id.phonenum3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#4802"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });

        b = (ImageView) findViewById(R.id.phonenum4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#4802"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });

        b = (ImageView) findViewById(R.id.phonenum5);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#4802"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum6);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8403"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum7);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#4802"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum8);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#4802"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum9);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8127"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum10);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8127"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum11);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8403"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum12);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#4802"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum13);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8978"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum14);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8978"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum15);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8127"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum16);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8978"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum17);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8403"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum18);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8402"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum19);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8402"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });
        b = (ImageView) findViewById(R.id.phonenum20);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 0060383178333"+PhoneNumberUtils.WAIT+"#8402"));
                if (ActivityCompat.checkSelfPermission(Lectures_contacts.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callintent);
            }
        });


    }

    public void process (View v){
        Intent i , chooser;
        String to= "null";

        switch (v.getId()) {

        case R.id.sendmessage:
            i = new Intent(Intent.ACTION_SEND);
            i.setData(Uri.parse("mailto: "));
            to = "mainul.khan@limkokwing.edu.my";
            i.putExtra(Intent.EXTRA_EMAIL, to);
            i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
            i.putExtra(Intent.EXTRA_TEXT, "e");
            i.setType("message/rfc822");
            chooser= Intent.createChooser(i, "Send Email");
            startActivity(chooser);
            break;

            case R.id.sendmessage2:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "nour.albitar@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;

            case R.id.sendmessage3:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "mutazbellah.itaiwi@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage4:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "daha.tijjani@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage5:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "marwan.aljemeli@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage6:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "aiman.said@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage7:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "hemant.singh@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage8:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "huda.jameel@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage9:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "kelvin.kimani@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage10:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "mahdi.babaei@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage11:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "sufyan.shakour@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage12:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "kahkeong.ng@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage13:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "noris@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage14:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "hayati.idrus@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage15:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "hidayah.kamarudin@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage16:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "izan@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage17:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "shaliken.tuerwahong@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage18:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "vinod.ramanathan@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage19:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "wael.fawkhiri@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
            case R.id.sendmessage20:
                i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto: "));
                to = "matthew@limkokwing.edu.my";
                i.putExtra(Intent.EXTRA_EMAIL, to);
                i.putExtra(Intent.EXTRA_SUBJECT, " from my phone");
                i.putExtra(Intent.EXTRA_TEXT, "e");
                i.setType("message/rfc822");
                chooser= Intent.createChooser(i, "Send Email");
                startActivity(chooser);
                break;
        }

    }


}
