package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass04o;
import X.AnonymousClass1HB;
import X.AnonymousClass1Vt;
import X.AnonymousClass2H9;
import X.AnonymousClass2HJ;
import X.AnonymousClass4XO;
import X.AnonymousClass5kl;
import X.AnonymousClass5xE;
import X.C001500q;
import X.C005402i;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110505eJ;
import X.C110605eV;
import X.C110765en;
import X.C111345g2;
import X.C112265iD;
import X.C112355iM;
import X.C117765tW;
import X.C119455xu;
import X.C1215565y;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C16150sX;
import X.C16300so;
import X.C17190ug;
import X.C18280wR;
import X.C18310wU;
import X.C49132Rg;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.R;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class IndiaUpiPauseMandateActivity extends AnonymousClass5kl {
    public Button A00;
    public DatePicker A01;
    public DatePicker A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public AnonymousClass5xE A05;
    public C110605eV A06;
    public C117765tW A07;
    public AnonymousClass1HB A08;
    public boolean A09;

    public IndiaUpiPauseMandateActivity() {
        this(0);
    }

    public IndiaUpiPauseMandateActivity(int i2) {
        this.A09 = false;
        C110105dW.A0t(this, 56);
    }

    public static final long A02(DatePicker datePicker) {
        return new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()).getTime().getTime();
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1n(A0C, r1, this);
            this.A08 = C111345g2.A1R(A0C, r1, this);
            this.A05 = C16150sX.A0z(r1);
            this.A07 = (C117765tW) r1.ACL.get();
        }
    }

    public final DatePicker A3r(EditText editText, long j2) {
        DateFormat dateInstance = DateFormat.getDateInstance(2, C13690nt.A0m(this.A01));
        editText.setText(dateInstance.format(Long.valueOf(j2)));
        Calendar instance = Calendar.getInstance();
        C110505eJ r3 = new C110505eJ(new C119455xu(editText, this, dateInstance), this, instance.get(1), instance.get(2), instance.get(5));
        C110105dW.A0r(editText, r3, 49);
        return r3.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (android.text.TextUtils.isEmpty(r11.A03.getError()) == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3s() {
        /*
            r11 = this;
            android.widget.DatePicker r0 = r11.A02
            long r2 = A02(r0)
            com.google.android.material.textfield.TextInputLayout r5 = r11.A04
            X.5eV r4 = r11.A06
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.C42681yF.A00(r2, r0)
            if (r0 >= 0) goto L_0x00a9
            X.0tz r1 = r4.A06
            r0 = 2131892550(0x7f121946, float:1.9419851E38)
            java.lang.String r0 = r1.A02(r0)
        L_0x001d:
            r5.setError(r0)
            android.widget.DatePicker r0 = r11.A01
            long r0 = A02(r0)
            com.google.android.material.textfield.TextInputLayout r9 = r11.A03
            X.5eV r10 = r11.A06
            X.013 r4 = r10.A07
            java.util.Locale r5 = X.C13690nt.A0m(r4)
            r4 = 2
            java.text.DateFormat r8 = java.text.DateFormat.getDateInstance(r4, r5)
            int r2 = X.C42681yF.A00(r0, r2)
            if (r2 > 0) goto L_0x0069
            X.0tz r0 = r10.A06
            android.content.Context r1 = r0.A00
            r0 = 2131892548(0x7f121944, float:1.9419847E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0046:
            r9.setError(r0)
            android.widget.Button r2 = r11.A00
            com.google.android.material.textfield.TextInputLayout r0 = r11.A04
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0064
            com.google.android.material.textfield.TextInputLayout r0 = r11.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r2.setEnabled(r0)
            return
        L_0x0069:
            X.1Vt r2 = r10.A01
            X.5hW r2 = X.C110115dX.A0K(r2)
            X.5xC r2 = r2.A0B
            X.AnonymousClass00B.A06(r2)
            long r4 = r2.A01
            java.lang.String r2 = "Asia/Kolkata"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            int r2 = r2.getRawOffset()
            long r2 = (long) r2
            long r4 = r4 - r2
            int r0 = X.C42681yF.A00(r0, r4)
            if (r0 <= 0) goto L_0x00a7
            X.0tz r0 = r10.A06
            android.content.Context r7 = r0.A00
            r6 = 2131892547(0x7f121943, float:1.9419845E38)
            java.lang.Object[] r3 = X.C13680ns.A1b()
            r2 = 0
            X.0t3 r0 = r10.A05
            long r0 = r0.A02(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r8.format(r0)
            java.lang.String r0 = X.C13680ns.A0d(r7, r0, r3, r2, r6)
            goto L_0x0046
        L_0x00a7:
            r0 = 0
            goto L_0x0046
        L_0x00a9:
            r0 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity.A3s():void");
    }

    public void AX5(AnonymousClass2HJ r1) {
    }

    public boolean Afl() {
        return true;
    }

    public void onBackPressed() {
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14870pt r6 = this.A05;
        C16300so r5 = this.A03;
        AnonymousClass4XO r10 = this.A06;
        C17190ug r7 = this.A0H;
        C18280wR r13 = this.A0C;
        AnonymousClass1HB r14 = this.A08;
        C18310wU r11 = this.A0M;
        C112265iD r12 = this.A09;
        C112355iM r3 = new C112355iM(this, r5, r6, r7, this.A0C, this.A0K, r10, r11, r12, r13, r14);
        setContentView((int) R.layout.layout0324);
        C005402i A0r = C111345g2.A0r(this);
        if (A0r != null) {
            A0r.A0N(true);
        }
        TextInputLayout textInputLayout = (TextInputLayout) AnonymousClass00T.A05(this, R.id.start_date);
        this.A04 = textInputLayout;
        long currentTimeMillis = System.currentTimeMillis();
        EditText editText = textInputLayout.A0L;
        AnonymousClass00B.A04(editText);
        this.A02 = A3r(editText, currentTimeMillis);
        TextInputLayout textInputLayout2 = (TextInputLayout) AnonymousClass00T.A05(this, R.id.end_date);
        this.A03 = textInputLayout2;
        EditText editText2 = textInputLayout2.A0L;
        AnonymousClass00B.A04(editText2);
        this.A01 = A3r(editText2, currentTimeMillis);
        Button button = (Button) AnonymousClass00T.A05(this, R.id.continue_button);
        this.A00 = button;
        C110105dW.A0r(button, this, 50);
        C110605eV r2 = (C110605eV) new C006602z((AnonymousClass04o) new C110765en(r3, this.A07, C111345g2.A1b(this)), (C001500q) this).A01(C110605eV.class);
        this.A06 = r2;
        r2.A02.A0A(this, C110115dX.A07(this, 29));
        C110605eV r32 = this.A06;
        AnonymousClass1Vt r22 = ((AnonymousClass2H9) getIntent().getParcelableExtra("extra_transaction_detail_data")).A00;
        r32.A01 = r22;
        r32.A0D.Acl(new C1215565y(r22, r32));
    }
}
