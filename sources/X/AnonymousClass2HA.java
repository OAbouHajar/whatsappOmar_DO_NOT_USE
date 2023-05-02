package X;

import android.content.Context;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2HA  reason: invalid class name */
public abstract class AnonymousClass2HA implements C19550yc {
    public final Context A00;
    public final C18340wX A01;
    public final C14880pu A02;

    public AnonymousClass2HA(Context context, C18340wX r2, C14880pu r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static List A00(C28371Vv r6) {
        ArrayList arrayList = new ArrayList();
        for (C28371Vv r4 : r6.A0O("error")) {
            if (r4 != null) {
                String A0N = r4.A0N("code", (String) null);
                String A0N2 = r4.A0N("text", (String) null);
                r4.A0N("display_title", (String) null);
                String A0N3 = r4.A0N("display_text", (String) null);
                if (A0N != null) {
                    int parseInt = Integer.parseInt(A0N);
                    AnonymousClass2HJ r1 = new AnonymousClass2HJ();
                    r1.A00 = parseInt;
                    r1.A08 = A0N2;
                    r1.A07 = A0N3;
                    arrayList.add(r1);
                    if (parseInt == 454) {
                        r1.A05 = r4.A0J("step_up");
                    }
                }
            }
        }
        return arrayList;
    }

    public List A01(C28371Vv r2) {
        return A00(r2);
    }

    public abstract void A03(AnonymousClass2HJ r1);

    public abstract void A04(AnonymousClass2HJ r1);

    public abstract void A05(C28371Vv r1);

    public void APb(String str) {
        AnonymousClass2HJ r3 = new AnonymousClass2HJ();
        int i2 = 6;
        if (C18260wP.A02(this.A00)) {
            i2 = -2;
        }
        r3.A00 = i2;
        this.A02.Acq(new RunnableRunnableShape9S0200000_I0_7(this, 15, r3));
    }

    public void AQe(C28371Vv r6, String str) {
        for (AnonymousClass2HJ r3 : A01(r6)) {
            C18340wX r0 = this.A01;
            int i2 = r3.A00;
            C18320wV r2 = r0.A00;
            if (r2 != null && (i2 == 404 || i2 == 440 || i2 == 449)) {
                r2.A01(true, false);
            }
            this.A02.Acq(new RunnableRunnableShape9S0200000_I0_7(this, 14, r3));
        }
    }

    public void AYG(C28371Vv r4, String str) {
        this.A02.Acq(new RunnableRunnableShape9S0200000_I0_7(this, 16, r4));
    }
}
