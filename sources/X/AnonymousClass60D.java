package X;

import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.60D  reason: invalid class name */
public class AnonymousClass60D implements C109295Rm {
    public final /* synthetic */ C35431lv A00;
    public final /* synthetic */ AnonymousClass62L A01;
    public final /* synthetic */ C16840tj A02;
    public final /* synthetic */ String A03;

    public AnonymousClass60D(C35431lv r1, AnonymousClass62L r2, C16840tj r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public void AXg() {
        AnonymousClass62L r1 = this.A01;
        r1.A00.Ac1();
        String str = this.A03;
        if (str == null) {
            r1.A01.AX1(this.A00);
            return;
        }
        r1.A02.A03.A00(new C1213965i(this.A00, r1.A01), str);
    }

    public void AXi() {
        C35251lc r0;
        AnonymousClass62L r1 = this.A01;
        C14530pL r9 = r1.A00;
        r9.Ac1();
        C16840tj r2 = this.A02;
        C16880tn AAt = r2.AAt();
        if (AAt != null && (r0 = AAt.A01) != null && r0.A05.A02 != null) {
            Resources resources = r9.getResources();
            Object[] A1b = C13680ns.A1b();
            long j2 = r2.AAt().A01.A05.A02.A00;
            AnonymousClass013 r6 = r1.A02.A0H;
            C110105dW.A0n(r9, resources, new SimpleDateFormat("HH:mm", C13690nt.A0m(r6)).format(new Date(j2 * 1000)), A1b);
        }
    }
}
