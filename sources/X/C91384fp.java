package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.redex.RunnableRunnableShape1S0400000_I1;
import java.util.HashSet;

/* renamed from: X.4fp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91384fp implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C14870pt A01;
    public final /* synthetic */ C16760tb A02;
    public final /* synthetic */ C16740tZ A03;
    public final /* synthetic */ C16320sq A04;

    public /* synthetic */ C91384fp(Activity activity, C14870pt r2, C16760tb r3, C16740tZ r4, C16320sq r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C16740tZ r1 = this.A03;
        C16320sq r0 = this.A04;
        C16760tb r2 = this.A02;
        C14870pt r4 = this.A01;
        Activity activity = this.A00;
        HashSet A0o = C13680ns.A0o();
        A0o.add(r1);
        r0.Acl(new RunnableRunnableShape1S0400000_I1(r2, A0o, r4, activity, 8));
        dialogInterface.dismiss();
    }
}
