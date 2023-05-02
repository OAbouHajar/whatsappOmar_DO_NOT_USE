package X;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.4fq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91394fq implements DialogInterface.OnClickListener {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ AnonymousClass1KO A01;
    public final /* synthetic */ AnonymousClass15W A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C91394fq(C14550pN r1, AnonymousClass1KO r2, AnonymousClass15W r3, String str, String str2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C14550pN r5 = this.A00;
        AnonymousClass1KO r4 = this.A01;
        AnonymousClass15W r3 = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        AnonymousClass29T.A00(r5, 125);
        boolean A002 = r3.A00();
        StringBuilder A0r = AnonymousClass000.A0r("blocked +");
        A0r.append(str);
        r5.startActivity(r4.A00(r5, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, AnonymousClass000.A0h(str2, A0r), (String) null, (ArrayList) null, (ArrayList) null, A002));
    }
}
