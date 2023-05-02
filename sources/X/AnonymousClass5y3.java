package X;

import android.content.DialogInterface;
import com.facebook.redex.IDxCallbackShape65S0200000_3_I1;
import com.obwhatsapp.R;

/* renamed from: X.5y3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14530pL A01;
    public final /* synthetic */ C119165we A02;

    public /* synthetic */ AnonymousClass5y3(C14530pL r1, C119165we r2, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C119165we r3 = this.A02;
        C14530pL r2 = this.A01;
        AnonymousClass29T.A00(r2, this.A00);
        r2.Afq(R.string.str13db);
        r3.A0F.A00(new IDxCallbackShape65S0200000_3_I1(r2, 4, r3));
    }
}
