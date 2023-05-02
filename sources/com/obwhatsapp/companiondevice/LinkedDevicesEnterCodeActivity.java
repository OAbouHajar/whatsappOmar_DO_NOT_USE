package com.obwhatsapp.companiondevice;

import X.AnonymousClass00T;
import X.AnonymousClass10J;
import X.AnonymousClass1ZW;
import X.AnonymousClass47N;
import X.AnonymousClass51Q;
import X.AnonymousClass5QD;
import X.C004601z;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17110uY;
import X.C208311t;
import X.C208511v;
import X.C30531cW;
import X.C49132Rg;
import X.C49602Uf;
import X.C50212Yk;
import X.C50762aP;
import X.C615639k;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class LinkedDevicesEnterCodeActivity extends C14530pL implements AnonymousClass5QD {
    public C50762aP A00;
    public C208311t A01;
    public C208511v A02;
    public C17110uY A03;
    public boolean A04;
    public final C49602Uf A05;

    public LinkedDevicesEnterCodeActivity() {
        this(0);
        this.A05 = new AnonymousClass51Q(this);
    }

    public LinkedDevicesEnterCodeActivity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 43);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A03 = C16150sX.A1A(r1);
            this.A00 = (C50762aP) A1T.A0j.get();
            this.A02 = (C208511v) r1.A4b.get();
            this.A01 = (C208311t) r1.A4c.get();
        }
    }

    public void AOm(String str) {
        Afq(R.string.str0c99);
        this.A05.Aco(new RunnableRunnableShape1S1100000_I1(4, str, this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C208511v r2 = this.A02;
        r2.A01 = r2.A00.A00(this.A05);
        setTitle(R.string.str0c2e);
        setContentView((int) R.layout.layout0387);
        C14530pL.A0Y(this);
        C13700nu.A09(this, R.id.enter_code_description).setText(AnonymousClass1ZW.A01(getString(R.string.str0c2c), new Object[0]));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.enter_code_link_camera);
        C30531cW.A02(textEmojiLabel);
        C30531cW.A03(textEmojiLabel, this.A08);
        textEmojiLabel.setText(this.A03.A06(new RunnableRunnableShape17S0100000_I1((Object) this, 44), getString(R.string.str0c31), "%s"));
        C50762aP r0 = this.A00;
        AnonymousClass47N r4 = new AnonymousClass47N();
        C50212Yk r1 = r0.A00;
        Activity activity = r1.A01.A1p;
        C16150sX r12 = r1.A03;
        new C615639k(activity, C16150sX.A0Z(r12), (AnonymousClass10J) r12.A02.get(), r4).A02((LinearLayout) C004601z.A0E(this.A00, R.id.enter_code_boxes), this, 8);
    }

    public void onDestroy() {
        this.A02.A01 = null;
        super.onDestroy();
    }
}
