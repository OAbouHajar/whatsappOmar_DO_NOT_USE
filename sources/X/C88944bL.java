package X;

import android.graphics.Paint;
import com.obwhatsapp.core.i18n.IDxWCacheShape10S0000000_2_I1;

/* renamed from: X.4bL  reason: invalid class name and case insensitive filesystem */
public abstract class C88944bL {
    public static final C88944bL A03 = new IDxWCacheShape10S0000000_2_I1(2);
    public static final C88944bL A04 = new IDxWCacheShape10S0000000_2_I1(0);
    public static final C88944bL A05 = new IDxWCacheShape10S0000000_2_I1(1);
    public Paint A00 = new Paint();
    public final AnonymousClass00O A01 = new AnonymousClass00O();
    public final Object A02 = C13690nt.A0Y();

    public final boolean A00(String str) {
        AnonymousClass00O r2;
        Boolean bool;
        Object obj = this.A02;
        synchronized (obj) {
            r2 = this.A01;
            bool = (Boolean) r2.get(str);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean A012 = A01(str);
        synchronized (obj) {
            r2.put(str, Boolean.valueOf(A012));
        }
        return A012;
    }

    public abstract boolean A01(String str);
}
