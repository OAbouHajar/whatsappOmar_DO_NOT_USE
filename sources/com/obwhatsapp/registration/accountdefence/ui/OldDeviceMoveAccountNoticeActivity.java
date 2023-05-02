package com.obwhatsapp.registration.accountdefence.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass2FK;
import X.AnonymousClass5MP;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17110uY;
import X.C17190ug;
import X.C18990xa;
import X.C19380yL;
import X.C19670yo;
import X.C30531cW;
import X.C46052Cd;
import X.C49132Rg;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaImageButton;
import com.whatsapp.util.Log;

public class OldDeviceMoveAccountNoticeActivity extends C14530pL implements AnonymousClass2FK, AnonymousClass5MP {
    public TextEmojiLabel A00;
    public WaButton A01;
    public WaButton A02;
    public WaImageButton A03;
    public C19670yo A04;
    public C19380yL A05;
    public C17190ug A06;
    public C18990xa A07;
    public C17110uY A08;
    public String A09;
    public boolean A0A;

    public OldDeviceMoveAccountNoticeActivity() {
        this(0);
    }

    public OldDeviceMoveAccountNoticeActivity(int i2) {
        this.A0A = false;
        C13680ns.A1G(this, 110);
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A08 = C16150sX.A1A(r1);
            this.A07 = (C18990xa) r1.ADh.get();
            this.A06 = C16150sX.A0t(r1);
            this.A05 = (C19380yL) r1.AQd.get();
            this.A04 = (C19670yo) r1.AB4.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("server_token");
        AnonymousClass00B.A06(stringExtra);
        this.A09 = stringExtra;
        setContentView((int) R.layout.layout002d);
        WaButton waButton = (WaButton) AnonymousClass00T.A05(this, R.id.stay_button);
        this.A02 = waButton;
        C13680ns.A15(waButton, this, 38);
        WaImageButton waImageButton = (WaImageButton) AnonymousClass00T.A05(this, R.id.close_button);
        this.A03 = waImageButton;
        C13680ns.A15(waImageButton, this, 36);
        WaButton waButton2 = (WaButton) AnonymousClass00T.A05(this, R.id.move_button);
        this.A01 = waButton2;
        C13680ns.A15(waButton2, this, 37);
        this.A00 = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.backup_description);
        SpannableStringBuilder A062 = this.A08.A06(new RunnableRunnableShape19S0100000_I1_2(this, 30), getString(R.string.str0063), "create-backup");
        C30531cW.A02(this.A00);
        C30531cW.A03(this.A00, this.A08);
        this.A00.setText(A062);
    }

    public void onResume() {
        super.onResume();
        if (this.A07.A00 || C13680ns.A0B(this.A09).getBoolean("show_post_reg_logged_out_dialog", false)) {
            Log.i("OldDeviceMoveAccountNoticeActivity/show-login-failed");
            SharedPreferences.Editor A0K = this.A09.A0K();
            A0K.remove("show_post_reg_logged_out_dialog");
            A0K.apply();
            this.A05.A03(20, (String) null);
            C46052Cd.A00(this);
        }
    }
}
