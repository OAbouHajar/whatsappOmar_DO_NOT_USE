package X;

import android.content.DialogInterface;
import com.obwhatsapp.R;

/* renamed from: X.61Q  reason: invalid class name */
public class AnonymousClass61Q implements AnonymousClass694 {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ AnonymousClass1Z7 A01;
    public final /* synthetic */ AnonymousClass5xF A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass61Q(C14530pL r1, AnonymousClass1Z7 r2, AnonymousClass5xF r3, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = z2;
        this.A01 = r2;
    }

    public void AQY(AnonymousClass5wP r5) {
        AnonymousClass2HJ r0 = r5.A00;
        if (r0 == null) {
            r0 = C110115dX.A0N();
        }
        int i2 = r0.A00;
        AnonymousClass5xF r1 = this.A02;
        C14530pL r2 = this.A00;
        if (i2 == 25554) {
            r1.A03(r2, this.A03);
        } else {
            AnonymousClass5xE.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.str1363)).show();
        }
    }

    public void AWP(Object obj) {
        this.A02.A03(this.A00, this.A03);
    }
}
