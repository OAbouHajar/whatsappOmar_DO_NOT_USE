package X;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.4ft  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91424ft implements DialogInterface.OnClickListener {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ AnonymousClass1KO A01;
    public final /* synthetic */ AnonymousClass15W A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C91424ft(C14550pN r1, AnonymousClass1KO r2, AnonymousClass15W r3, Runnable runnable, String str, String str2) {
        this.A00 = r1;
        this.A03 = runnable;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C14550pN r6 = this.A00;
        Runnable runnable = this.A03;
        AnonymousClass1KO r5 = this.A01;
        AnonymousClass15W r3 = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        AnonymousClass29T.A00(r6, 124);
        if (runnable != null) {
            runnable.run();
        }
        boolean A002 = r3.A00();
        StringBuilder A0r = AnonymousClass000.A0r("blocked +");
        A0r.append(str);
        r6.startActivity(r5.A00(r6, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, AnonymousClass000.A0h(str2, A0r), (String) null, (ArrayList) null, (ArrayList) null, A002));
    }
}
