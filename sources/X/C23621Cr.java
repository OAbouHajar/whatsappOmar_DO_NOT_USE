package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.1Cr  reason: invalid class name and case insensitive filesystem */
public class C23621Cr extends C18940xV {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C23601Cp A01;
    public final C23611Cq A02;
    public final Map A03 = new LinkedHashMap();
    public final Executor A04;

    public C23621Cr(C23601Cp r4, C23611Cq r5, C16320sq r6) {
        AnonymousClass1WA r2 = new AnonymousClass1WA(r6, false);
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r2;
    }

    public void A06(C16740tZ r1, int i2) {
        A0A(r1, i2);
    }

    public void A07(C16740tZ r2, int i2) {
        if (r2 instanceof C16730tY) {
            A0A(r2, i2);
        }
    }

    public final void A09() {
        boolean z2;
        C23601Cp r1 = this.A01;
        ArrayList arrayList = new ArrayList(this.A03.values());
        for (AnonymousClass4FC r0 : r1.A01()) {
            C49892Wl r2 = r0.A00;
            if (arrayList.isEmpty()) {
                z2 = false;
            } else if (!r2.A04.A00) {
                z2 = true;
            }
            C83954Ir r02 = r2.A04;
            r02.A00 = z2;
            r02.A01 = z2;
            r2.A00();
        }
    }

    public final void A0A(C16740tZ r4, int i2) {
        C16750ta r1;
        C28381Vw r12 = r4.A11;
        if (C16030sJ.A0Q(r12.A00) && r12.A02) {
            if ((r4 instanceof C16730tY) && (i2 != 1 || (r1 = ((C16730tY) r4).A02) == null || !r1.A0O || r1.A0Z || !r1.A0P)) {
                return;
            }
            if (!(r4 instanceof C38831rU) || ((C38831rU) r4).A01 != null) {
                this.A04.execute(new RunnableRunnableShape10S0200000_I0_8(this, 33, r4));
            }
        }
    }
}
