package com.obwhatsapp.writenfctag;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01S;
import X.AnonymousClass15O;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C42341xd;
import X.C49132Rg;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteNfcTagActivity extends C14530pL {
    public PendingIntent A00;
    public NfcAdapter A01;
    public AnonymousClass15O A02;
    public String A03;
    public String A04;
    public boolean A05;

    public WriteNfcTagActivity() {
        this(0);
    }

    public WriteNfcTagActivity(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 140);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A02 = (AnonymousClass15O) r1.A0k.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1ba3);
        C14530pL.A0Y(this);
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setText(R.string.str00f9);
        setContentView((View) textView);
        this.A04 = getIntent().getStringExtra("mime");
        this.A03 = getIntent().getStringExtra("data");
        this.A01 = NfcAdapter.getDefaultAdapter(this);
        Intent A09 = C13680ns.A09();
        A09.setClassName(getPackageName(), "com.obwhatsapp.writenfctag.WriteNfcTagActivity");
        A09.putExtra("mime", (String) null);
        A09.putExtra("data", (String) null);
        Intent addFlags = A09.addFlags(536870912);
        int i2 = 0;
        if (C42341xd.A01) {
            i2 = 33554432;
        }
        this.A00 = PendingIntent.getActivity(this, 0, addFlags, i2);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) || "android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{new NdefRecord(2, this.A04.getBytes(Charset.forName("US-ASCII")), (byte[]) null, this.A03.getBytes(Charset.forName("US-ASCII")))});
            int length = ndefMessage.toByteArray().length;
            try {
                Ndef ndef = Ndef.get(tag);
                if (ndef != null) {
                    ndef.connect();
                    if (!ndef.isWritable()) {
                        Log.e("writetag/failure/tag not writable");
                    } else if (ndef.getMaxSize() < length) {
                        Log.e("writetag/failure/tag too small");
                    } else {
                        ndef.writeNdefMessage(ndefMessage);
                    }
                    this.A05.A09(R.string.str0c26, 0);
                    return;
                }
                NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                if (ndefFormatable != null) {
                    try {
                        ndefFormatable.connect();
                        ndefFormatable.format(ndefMessage);
                    } catch (IOException e2) {
                        Log.e("writetag/failure/", e2);
                    }
                }
                this.A05.A09(R.string.str0c26, 0);
                return;
                Log.i("writetag/success");
                this.A05.A09(R.string.str0c27, 1);
                AnonymousClass15O r2 = this.A02;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(AnonymousClass01S.A04);
                r2.A01(Uri.parse(AnonymousClass000.A0l(A0o, R.raw.send_message)));
                Vibrator A0K = this.A08.A0K();
                AnonymousClass00B.A06(A0K);
                A0K.vibrate(75);
                finish();
            } catch (Exception e3) {
                Log.e("writetag/failure/", e3);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.A01.disableForegroundDispatch(this);
    }

    public void onResume() {
        super.onResume();
        IntentFilter[] intentFilterArr = new IntentFilter[2];
        C13690nt.A1L(new IntentFilter("android.nfc.action.TAG_DISCOVERED"), new IntentFilter("android.nfc.action.NDEF_DISCOVERED"), intentFilterArr);
        this.A01.enableForegroundDispatch(this, this.A00, intentFilterArr, (String[][]) null);
    }
}
