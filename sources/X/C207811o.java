package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.11o  reason: invalid class name and case insensitive filesystem */
public class C207811o {
    public final C16440t3 A00;
    public final C14710pd A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final int[] A06 = {0, 1, 2, 3};

    public C207811o(C16440t3 r2, C14710pd r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = new HashMap();
        this.A05 = new HashMap();
        this.A04 = new HashMap();
        this.A02 = new HashMap();
    }

    public final synchronized C30831d2 A00(int i2, long j2) {
        return (C30831d2) A02(i2).get(Long.valueOf(j2));
    }

    public C30831d2 A01(long j2) {
        for (int A002 : this.A06) {
            C30831d2 A003 = A00(A002, j2);
            if (A003 != null) {
                return A003;
            }
        }
        return null;
    }

    public Map A02(int i2) {
        if (i2 == 0) {
            return this.A03;
        }
        if (i2 == 1) {
            return this.A05;
        }
        if (i2 == 2) {
            return this.A04;
        }
        if (i2 == 3) {
            return this.A02;
        }
        throw new RuntimeException("LoggableStanzaCache/getStanzaMap not expected stanza type");
    }

    public void A03(long j2) {
        int i2 = 4;
        if (A00(1, j2) == null) {
            if (A00(0, j2) != null) {
                i2 = 6;
            } else if (A00(2, j2) != null) {
                i2 = 5;
            } else if (A00(3, j2) == null) {
                i2 = -1;
            }
        }
        C30831d2 A012 = A01(j2);
        if (i2 != -1 && A012 != null) {
            A012.A00(i2);
        }
    }

    public synchronized void A04(C30831d2 r4, long j2) {
        if (this.A01.A0E(C16620tM.A02, 296)) {
            Map A022 = A02(r4.A02);
            Long valueOf = Long.valueOf(j2);
            if (A022.containsKey(valueOf)) {
                StringBuilder sb = new StringBuilder();
                sb.append("LoggableStanzaCache/skipped caching loggable stanza:");
                sb.append(r4);
                Log.w(sb.toString());
            } else {
                A022.put(valueOf, r4);
            }
        }
    }
}
