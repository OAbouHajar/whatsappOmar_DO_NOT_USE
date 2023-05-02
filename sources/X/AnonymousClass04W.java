package X;

/* renamed from: X.04W  reason: invalid class name */
public class AnonymousClass04W extends C005102f {
    public final AnonymousClass00O mMetricsMap = new AnonymousClass00O();
    public final AnonymousClass00O mMetricsValid = new AnonymousClass00O();

    public static boolean A00(AnonymousClass00O r7, AnonymousClass00O r8) {
        boolean equals;
        if (r7 != r8) {
            int size = r7.size();
            if (size == r8.size()) {
                int i2 = 0;
                while (i2 < size) {
                    Object[] objArr = r7.A02;
                    int i3 = i2 << 1;
                    Object obj = objArr[i3];
                    Object obj2 = objArr[i3 + 1];
                    Object obj3 = r8.get(obj);
                    if (obj2 != null) {
                        equals = obj2.equals(obj3);
                    } else if (obj3 == null) {
                        equals = r8.containsKey(obj);
                    }
                    if (equals) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ C005102f A01(C005102f r1) {
        A04((AnonymousClass04W) r1);
        return this;
    }

    public /* bridge */ /* synthetic */ C005102f A02(C005102f r8, C005102f r9) {
        boolean z2;
        AnonymousClass04W r82 = (AnonymousClass04W) r8;
        AnonymousClass04W r92 = (AnonymousClass04W) r9;
        if (r92 != null) {
            if (r82 == null) {
                r92.A04(this);
            } else {
                int size = this.mMetricsMap.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Class cls = (Class) this.mMetricsMap.A02[i2 << 1];
                    if (!A05(cls) || !r82.A05(cls)) {
                        z2 = false;
                    } else {
                        z2 = true;
                        C005102f A03 = r92.A03(cls);
                        if (A03 != null) {
                            A03(cls).A02(r82.A03(cls), A03);
                        }
                    }
                    r92.mMetricsValid.put(cls, z2 ? Boolean.TRUE : Boolean.FALSE);
                }
            }
            return r92;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    public C005102f A03(Class cls) {
        return (C005102f) cls.cast(this.mMetricsMap.get(cls));
    }

    public void A04(AnonymousClass04W r6) {
        AnonymousClass00O r1;
        Boolean bool;
        int size = this.mMetricsMap.size();
        for (int i2 = 0; i2 < size; i2++) {
            Class cls = (Class) this.mMetricsMap.A02[i2 << 1];
            C005102f A03 = r6.A03(cls);
            if (A03 != null) {
                A03(cls).A01(A03);
                boolean A05 = r6.A05(cls);
                r1 = this.mMetricsValid;
                if (A05) {
                    bool = Boolean.TRUE;
                }
                bool = Boolean.FALSE;
            } else {
                r1 = this.mMetricsValid;
                bool = Boolean.FALSE;
            }
            r1.put(cls, bool);
        }
    }

    public boolean A05(Class cls) {
        Boolean bool = (Boolean) this.mMetricsValid.get(cls);
        return bool != null && bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass04W r5 = (AnonymousClass04W) obj;
            if (!A00(this.mMetricsValid, r5.mMetricsValid) || !A00(this.mMetricsMap, r5.mMetricsMap)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.mMetricsMap.hashCode() * 31) + this.mMetricsValid.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Composite Metrics{\n");
        int size = this.mMetricsMap.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 << 1;
            sb.append(this.mMetricsMap.A02[i3 + 1]);
            sb.append(A05((Class) this.mMetricsMap.A02[i3]) ? " [valid]" : " [invalid]");
            sb.append(10);
        }
        sb.append("}");
        return sb.toString();
    }
}
