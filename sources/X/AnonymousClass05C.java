package X;

/* renamed from: X.05C  reason: invalid class name */
public class AnonymousClass05C extends C004902d {
    public final AnonymousClass00O A00;

    public AnonymousClass05C(AnonymousClass058 r3) {
        AnonymousClass00O r1 = new AnonymousClass00O();
        this.A00 = r1;
        r1.A08(r3.A00);
    }

    public /* bridge */ /* synthetic */ C005102f A01() {
        AnonymousClass04W r6 = new AnonymousClass04W();
        AnonymousClass00O r5 = this.A00;
        int size = r5.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object[] objArr = r5.A02;
            int i3 = i2 << 1;
            Object obj = objArr[i3];
            r6.mMetricsMap.put(obj, ((C004902d) objArr[i3 + 1]).A01());
            r6.mMetricsValid.put(obj, Boolean.FALSE);
        }
        return r6;
    }

    public /* bridge */ /* synthetic */ boolean A02(C005102f r9) {
        AnonymousClass04W r92 = (AnonymousClass04W) r9;
        if (r92 != null) {
            AnonymousClass00O r7 = r92.mMetricsMap;
            int size = r7.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                Class cls = (Class) r7.A02[i2 << 1];
                C004902d r1 = (C004902d) this.A00.get(cls);
                boolean A02 = r1 != null ? r1.A02(r92.A03(cls)) : false;
                r92.mMetricsValid.put(cls, A02 ? Boolean.TRUE : Boolean.FALSE);
                z2 |= A02;
            }
            return z2;
        }
        throw new IllegalArgumentException("Null value passed to getSnapshot!");
    }
}
