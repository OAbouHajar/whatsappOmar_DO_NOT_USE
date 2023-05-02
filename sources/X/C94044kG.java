package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.4kG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94044kG implements View.OnClickListener {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ AnonymousClass1KO A01;
    public final /* synthetic */ AnonymousClass15W A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C94044kG(C14550pN r1, AnonymousClass1KO r2, AnonymousClass15W r3, Runnable runnable, String str, String str2) {
        this.A03 = runnable;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void onClick(View view) {
        Runnable runnable = this.A03;
        C14550pN r5 = this.A00;
        AnonymousClass1KO r4 = this.A01;
        AnonymousClass15W r0 = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        boolean A002 = r0.A00();
        StringBuilder A0r = AnonymousClass000.A0r("blocked +");
        A0r.append(str);
        r5.startActivity(r4.A00(r5, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, AnonymousClass000.A0h(str2, A0r), (String) null, (ArrayList) null, (ArrayList) null, A002));
        AnonymousClass29T.A00(r5, 124);
    }
}
