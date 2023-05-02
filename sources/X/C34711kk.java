package X;

import android.graphics.Bitmap;
import com.facebook.redex.IDxRListenerShape421S0100000_2_I0;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1kk  reason: invalid class name and case insensitive filesystem */
public class C34711kk extends C214614e {
    public AtomicInteger A00 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);
    public AtomicLong A01 = new AtomicLong(-1);
    public final C34731km A02;
    public final C17010u2 A03;
    public final String A04;

    public C34711kk(C17010u2 r4, C214414c r5, String str, int i2) {
        super(r5);
        this.A03 = r4;
        this.A04 = str;
        this.A02 = new C34731km(this, i2);
    }

    public Object A00(Object obj) {
        C447125f r3 = (C447125f) this.A02.A02(obj);
        if (r3 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.A01.set(currentTimeMillis);
        r3.A00 = currentTimeMillis;
        if (this instanceof C34701kj) {
            ((C34701kj) this).A04();
        }
        return r3.A01;
    }

    public void A01(int i2) {
        long currentTimeMillis = System.currentTimeMillis() - ((long) i2);
        C34731km r5 = this.A02;
        for (Map.Entry entry : r5.A04().entrySet()) {
            if (((C447125f) entry.getValue()).A00 < currentTimeMillis) {
                r5.A03(entry.getKey());
                entry.getKey();
                Object obj = ((C447125f) entry.getValue()).A01;
                if (this instanceof C34701kj) {
                    ((Bitmap) obj).getByteCount();
                }
            } else {
                return;
            }
        }
    }

    public void A02(C37681pY r4) {
        C34731km r2 = this.A02;
        IDxRListenerShape421S0100000_2_I0 iDxRListenerShape421S0100000_2_I0 = r4 == null ? null : new IDxRListenerShape421S0100000_2_I0(r4, 0);
        synchronized (r2) {
            r2.A00 = iDxRListenerShape421S0100000_2_I0;
        }
    }

    public void A03(Object obj, Object obj2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A01.set(currentTimeMillis);
        this.A02.A06(obj, new C447125f(obj2, currentTimeMillis));
        if (this instanceof C34701kj) {
            ((C34701kj) this).A04();
        }
    }
}
