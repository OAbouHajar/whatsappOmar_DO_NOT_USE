package X;

import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3BD  reason: invalid class name */
public final class AnonymousClass3BD {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public final C84104Jg A07;
    public final C107825Lo A08;
    public final List A09;
    public final Map A0A;

    public AnonymousClass3BD(AnonymousClass3BD r6) {
        this.A07 = r6.A07;
        this.A08 = r6.A08;
        this.A00 = r6.A00;
        this.A01 = r6.A01;
        this.A02 = r6.A02;
        this.A03 = r6.A03;
        this.A04 = r6.A04;
        this.A09 = C13680ns.A0n(r6.A09);
        this.A0A = new HashMap(r6.A0A.size());
        Iterator A0y = AnonymousClass000.A0y(r6.A0A);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            C32381gG A002 = A00((Class) A0z.getKey());
            ((C32381gG) A0z.getValue()).zzc(A002);
            this.A0A.put(A0z.getKey(), A002);
        }
    }

    public AnonymousClass3BD(C84104Jg r3, C107825Lo r4) {
        C13710nw.A01(r4);
        this.A07 = r3;
        this.A08 = r4;
        this.A03 = 1800000;
        this.A04 = 3024000000L;
        this.A0A = AnonymousClass000.A0x();
        this.A09 = AnonymousClass000.A0u();
    }

    public static C32381gG A00(Class cls) {
        try {
            return (C32381gG) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            if (e2 instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e2);
            } else if (e2 instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e2);
            } else if (Build.VERSION.SDK_INT < 19 || !(e2 instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e2);
            } else {
                throw new IllegalArgumentException("Linkage exception", e2);
            }
        }
    }

    public final C32381gG A01(Class cls) {
        Map map = this.A0A;
        C32381gG r0 = (C32381gG) map.get(cls);
        if (r0 != null) {
            return r0;
        }
        C32381gG A002 = A00(cls);
        map.put(cls, A002);
        return A002;
    }

    public final void A02(C32381gG r4) {
        C13710nw.A01(r4);
        Class<?> cls = r4.getClass();
        if (cls.getSuperclass() == C32381gG.class) {
            r4.zzc(A01(cls));
            return;
        }
        throw new IllegalArgumentException();
    }
}
