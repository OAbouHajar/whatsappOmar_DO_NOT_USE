package X;

import android.widget.RadioButton;
import com.obwhatsapp.R;

/* renamed from: X.4Uv  reason: invalid class name and case insensitive filesystem */
public class C86964Uv {
    public final C57002pe A00;
    public final AnonymousClass013 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C86964Uv(C57002pe r1, AnonymousClass013 r2, String str, String str2, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = z2;
        this.A02 = str;
        this.A03 = str2;
    }

    public void A00(int i2) {
        RadioButton radioButton;
        C57002pe r2 = this.A00;
        r2.A00();
        if (i2 == 0) {
            radioButton = r2.A03;
        } else if (i2 == 1) {
            radioButton = r2.A01;
        } else if (i2 == 2) {
            radioButton = r2.A02;
        } else {
            throw AnonymousClass000.A0V("unknown status distribution mode");
        }
        radioButton.setChecked(true);
    }

    public void A01(int i2, int i3) {
        AnonymousClass013 r6 = this.A01;
        String A0J = r6.A0J(new Object[]{Integer.valueOf(i2)}, R.plurals.plurals0143, (long) i2);
        C57002pe r4 = this.A00;
        r4.A06.setText(A0J);
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, i3, 0);
        r4.A04.setText(r6.A0J(objArr, R.plurals.plurals0144, (long) i3));
    }
}
