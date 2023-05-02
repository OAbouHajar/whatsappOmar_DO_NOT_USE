package X;

import java.util.Arrays;

/* renamed from: X.2L7  reason: invalid class name */
public class AnonymousClass2L7 implements AnonymousClass2L6 {
    public static final AnonymousClass2L7 A00 = new AnonymousClass2L7();

    public boolean Ahm(boolean z2, boolean z3, boolean z4, boolean z5) {
        return z4 ? z5 : z3;
    }

    public C28631Ww Ahn(C28631Ww r1, C28631Ww r2, boolean z2, boolean z3) {
        return z3 ? r2 : r1;
    }

    public double Aho(double d2, double d3, boolean z2, boolean z3) {
        return z3 ? d3 : d2;
    }

    public float Ahp(float f2, float f3, boolean z2, boolean z3) {
        return z3 ? f3 : f2;
    }

    public int Ahq(int i2, int i3, boolean z2, boolean z3) {
        return z3 ? i3 : i2;
    }

    public AnonymousClass27P Ahr(AnonymousClass27P r4, AnonymousClass27P r5) {
        int size = r4.size();
        int size2 = r5.size();
        if (size <= 0) {
            return r5;
        }
        if (size2 > 0) {
            if (!((AnonymousClass1XF) r4).A00) {
                r4 = r4.ALd(size2 + size);
            }
            r4.addAll(r5);
        }
        return r4;
    }

    public AnonymousClass1XE Ahs(AnonymousClass1XE r4, AnonymousClass1XE r5) {
        int size = r4.size();
        int size2 = r5.size();
        if (size <= 0) {
            return r5;
        }
        if (size2 > 0) {
            if (!((AnonymousClass1XF) r4).A00) {
                r4 = r4.ALe(size2 + size);
            }
            r4.addAll(r5);
        }
        return r4;
    }

    public long Aht(long j2, long j3, boolean z2, boolean z3) {
        return z3 ? j3 : j2;
    }

    public AnonymousClass1Wo Ahu(AnonymousClass1Wo r3, AnonymousClass1Wo r4) {
        if (r3 == null) {
            return r4;
        }
        if (r4 == null) {
            return r3;
        }
        C28581Wr A0U = ((C28541Wm) r3).A0U();
        if (A0U.A02.getClass().isInstance(r4)) {
            A0U.A04((C28541Wm) ((C28551Wn) r4));
            return A0U.A02();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public Object Ahv(Object obj, Object obj2, boolean z2) {
        return obj2;
    }

    public Object Ahw(Object obj, Object obj2, boolean z2) {
        return z2 ? Ahu((AnonymousClass1Wo) obj, (AnonymousClass1Wo) obj2) : obj2;
    }

    public void Ahx(boolean z2) {
    }

    public Object Ahy(Object obj, Object obj2, boolean z2) {
        return obj2;
    }

    public String Ahz(String str, String str2, boolean z2, boolean z3) {
        return z3 ? str2 : str;
    }

    public AnonymousClass2L0 Ai0(AnonymousClass2L0 r8, AnonymousClass2L0 r9) {
        if (r9 == AnonymousClass2L0.A04) {
            return r8;
        }
        int i2 = r8.count + r9.count;
        int[] copyOf = Arrays.copyOf(r8.A02, i2);
        System.arraycopy(r9.A02, 0, copyOf, r8.count, r9.count);
        Object[] copyOf2 = Arrays.copyOf(r8.A03, i2);
        System.arraycopy(r9.A03, 0, copyOf2, r8.count, r9.count);
        return new AnonymousClass2L0(copyOf, copyOf2, i2, true);
    }
}
