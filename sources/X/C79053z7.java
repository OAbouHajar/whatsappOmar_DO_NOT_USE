package X;

import android.os.SystemClock;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.3z7  reason: invalid class name and case insensitive filesystem */
public class C79053z7 extends C16690tT {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C16760tb A01;
    public final C15830rv A02;
    public final WeakReference A03;
    public final boolean A04;

    public C79053z7(C14550pN r3, C16760tb r4, C15830rv r5, boolean z2) {
        super(r3, true);
        this.A03 = C13690nt.A0h(r3);
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = z2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        this.A01.A0I(this.A02, this.A04);
        C14550pN.A0y(this.A00, 300);
        return null;
    }

    public void A09() {
        WeakReference weakReference = this.A03;
        if (weakReference.get() != null) {
            ((C14550pN) weakReference.get()).Afq(R.string.str13db);
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14550pN r2 = (C14550pN) this.A03.get();
        if (r2 != null) {
            r2.Ac1();
            r2.A2V(C14750ph.A02(r2.getApplicationContext()).addFlags(603979776));
        }
    }
}
