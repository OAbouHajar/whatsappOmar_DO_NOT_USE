package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.18f  reason: invalid class name and case insensitive filesystem */
public class C225118f {
    public static final C29641ax A06 = new C29641ax(0, 0, false);
    public final C14710pd A00;
    public final C17420v3 A01;
    public volatile Boolean A02;
    public volatile Boolean A03;
    public volatile Long A04;
    public volatile ConcurrentHashMap A05;

    public C225118f(C14710pd r1, C17420v3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final void A00(ConcurrentHashMap concurrentHashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                int i3 = jSONArray2.getInt(0);
                int i4 = jSONArray2.getInt(1);
                long max = Math.max(jSONArray2.getLong(2), 0);
                long optLong = jSONArray2.optLong(3);
                boolean z2 = false;
                if (3 == i4) {
                    z2 = true;
                }
                concurrentHashMap.put(Integer.valueOf(i3), new C29641ax(max, optLong, z2));
            }
        }
    }

    public final C29641ax A01(int i2) {
        if (this.A05 == null) {
            synchronized (this) {
                if (this.A05 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    try {
                        C14710pd r6 = this.A00;
                        C16620tM r5 = C16620tM.A02;
                        JSONArray jSONArray = r6.A08(r5, 226).getJSONArray("sampling");
                        if (jSONArray.length() == 0) {
                            JSONObject A08 = r6.A08(r5, 1716);
                            JSONObject A082 = r6.A08(r5, 1717);
                            A00(concurrentHashMap, A08.getJSONArray("sampling"));
                            A00(concurrentHashMap, A082.getJSONArray("sampling"));
                        } else {
                            A00(concurrentHashMap, jSONArray);
                        }
                    } catch (Exception e2) {
                        this.A01.A8e(e2.getMessage());
                        concurrentHashMap.clear();
                    }
                    this.A05 = concurrentHashMap;
                }
            }
        }
        ConcurrentHashMap concurrentHashMap2 = this.A05;
        Integer valueOf = Integer.valueOf(i2);
        C29641ax r1 = (C29641ax) concurrentHashMap2.get(valueOf);
        if (r1 == null) {
            r1 = (C29641ax) this.A05.get(Integer.valueOf(i2 >> 16));
            if (r1 == null) {
                r1 = A06;
            }
            this.A05.put(valueOf, r1);
        }
        return r1;
    }

    public final void A02() {
        if (this.A03 == null || this.A04 == null) {
            synchronized (this) {
                if (this.A03 == null || this.A04 == null) {
                    C14710pd r2 = this.A00;
                    C16620tM r1 = C16620tM.A02;
                    this.A03 = Boolean.valueOf(r2.A0E(r1, 397));
                    this.A04 = Long.valueOf((long) r2.A03(r1, 398));
                }
            }
        }
    }

    public boolean A03() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(this.A00.A0E(C16620tM.A02, 212));
                }
            }
        }
        return this.A02.booleanValue();
    }
}
