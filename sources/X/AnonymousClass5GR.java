package X;

/* renamed from: X.5GR  reason: invalid class name */
public abstract class AnonymousClass5GR extends C11340ia {
    public long A00;
    public AnonymousClass4LF A01;
    public boolean A02;

    public final C11340ia A02(int i2) {
        AnonymousClass487.A00(i2);
        return this;
    }

    public long A06() {
        AnonymousClass4LF r0 = this.A01;
        return (r0 == null || r0.A00 == r0.A01) ? Long.MAX_VALUE : 0;
    }

    public final void A07() {
        long j2 = this.A00 - 4294967296L;
        this.A00 = j2;
        if (j2 <= 0 && this.A02) {
            A08();
        }
    }

    public abstract void A08();

    public final void A09(C107205Gv r8) {
        AnonymousClass4LF r6 = this.A01;
        if (r6 == null) {
            r6 = new AnonymousClass4LF();
            this.A01 = r6;
        }
        Object[] objArr = r6.A02;
        int i2 = r6.A01;
        objArr[i2] = r8;
        int length = objArr.length;
        int i3 = (length - 1) & (i2 + 1);
        r6.A01 = i3;
        int i4 = r6.A00;
        if (i3 == i4) {
            Object[] objArr2 = new Object[(length << 1)];
            System.arraycopy(objArr, i4, objArr2, 0, length - i4);
            Object[] objArr3 = r6.A02;
            int length2 = objArr3.length;
            int i5 = r6.A00;
            System.arraycopy(objArr3, 0, objArr2, length2 - i5, i5);
            r6.A02 = objArr2;
            r6.A00 = 0;
            r6.A01 = length;
        }
    }

    public final boolean A0A() {
        AnonymousClass4LF r0 = this.A01;
        if (r0 == null) {
            return true;
        }
        return AnonymousClass000.A1R(r0.A00, r0.A01);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.5Gv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B() {
        /*
            r6 = this;
            X.4LF r5 = r6.A01
            r4 = 0
            if (r5 == 0) goto L_0x002d
            int r3 = r5.A00
            int r0 = r5.A01
            r1 = 0
            if (r3 == r0) goto L_0x001d
            java.lang.Object[] r0 = r5.A02
            r2 = r0[r3]
            r0[r3] = r1
            int r1 = r3 + 1
            int r0 = r0.length
            int r0 = r0 + -1
            r1 = r1 & r0
            r5.A00 = r1
            if (r2 == 0) goto L_0x0026
            r1 = r2
        L_0x001d:
            X.5Gv r1 = (X.C107205Gv) r1
            if (r1 == 0) goto L_0x002d
            r1.run()
            r0 = 1
            return r0
        L_0x0026:
            java.lang.String r0 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x002d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5GR.A0B():boolean");
    }
}
