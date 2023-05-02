package X;

import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.3EY  reason: invalid class name */
public final class AnonymousClass3EY implements C109615Sw {
    public AnonymousClass424 A00;
    public Object A01;
    public String A02;
    public final C99254tj A03 = new C99254tj();
    public final C14970q5 A04;
    public final Stack A05;
    public final Stack A06;

    public AnonymousClass3EY(C14970q5 r4, Iterator it) {
        Stack stack = new Stack();
        this.A06 = stack;
        Stack stack2 = new Stack();
        this.A05 = stack2;
        this.A04 = r4;
        stack.add(it);
        stack2.add(C798341m.ReadObject);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        r1 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r1 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        r0 = X.AnonymousClass424.NULL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        r5.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        r0 = X.AnonymousClass424.BOOLEAN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        if ((r1 instanceof java.lang.Number) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r0 = X.AnonymousClass424.NUMBER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if ((r1 instanceof X.C31411e8) == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r0 = X.AnonymousClass424.EXPRESSION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        r0 = X.AnonymousClass424.STRING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if ((r1 instanceof java.util.List) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        r3.push(((java.util.List) r1).iterator());
        r2.push(X.C798341m.A01);
        r0 = X.AnonymousClass424.START_ARRAY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        if ((r1 instanceof java.util.Map) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        r3.push(X.AnonymousClass000.A0y((java.util.Map) r1));
        r2.push(X.C798341m.A02);
        r0 = X.AnonymousClass424.START_OBJECT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        throw X.AnonymousClass000.A0V(X.AnonymousClass000.A0g("unknown value type", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        return r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass424 ALo() {
        /*
            r5 = this;
            r4 = 0
            r5.A02 = r4
            r5.A00 = r4
            java.util.Stack r2 = r5.A05
            java.lang.Object r0 = r2.peek()
            X.41m r0 = (X.C798341m) r0
            java.util.Stack r3 = r5.A06
            java.lang.Object r1 = r3.peek()
            java.util.Iterator r1 = (java.util.Iterator) r1
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x001f;
                case 2: goto L_0x0056;
                case 3: goto L_0x005f;
                case 4: goto L_0x006c;
                default: goto L_0x001c;
            }
        L_0x001c:
            X.424 r0 = r5.A00
            return r0
        L_0x001f:
            r5.A01 = r4
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0041
            java.util.Map$Entry r1 = X.AnonymousClass000.A0z(r1)
            java.lang.String r0 = X.C13690nt.A0f(r1)
            r5.A02 = r0
            java.lang.Object r0 = r1.getValue()
            r5.A01 = r0
            X.424 r0 = X.AnonymousClass424.NAME
            r5.A00 = r0
            r2.pop()
            X.41m r0 = X.C798341m.ObjectReadValue
            goto L_0x0068
        L_0x0041:
            X.424 r0 = X.AnonymousClass424.END_OBJECT
            r5.A00 = r0
            r2.pop()
            r3.pop()
            goto L_0x001c
        L_0x004c:
            X.424 r0 = X.AnonymousClass424.START_OBJECT
            r5.A00 = r0
            r2.pop()
            X.41m r0 = X.C798341m.ObjectReadName
            goto L_0x0068
        L_0x0056:
            r2.pop()
            X.41m r0 = X.C798341m.ObjectReadName
            r2.push(r0)
            goto L_0x007a
        L_0x005f:
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            r5.A00 = r0
            r2.pop()
            X.41m r0 = X.C798341m.ArrayReadValue
        L_0x0068:
            r2.push(r0)
            goto L_0x001c
        L_0x006c:
            r5.A01 = r4
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r1.next()
            r5.A01 = r0
        L_0x007a:
            java.lang.Object r1 = r5.A01
            if (r1 != 0) goto L_0x0083
            X.424 r0 = X.AnonymousClass424.NULL
        L_0x0080:
            r5.A00 = r0
            goto L_0x001c
        L_0x0083:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x008a
            X.424 r0 = X.AnonymousClass424.BOOLEAN
            goto L_0x0080
        L_0x008a:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0091
            X.424 r0 = X.AnonymousClass424.NUMBER
            goto L_0x0080
        L_0x0091:
            boolean r0 = r1 instanceof X.C31411e8
            if (r0 == 0) goto L_0x0098
            X.424 r0 = X.AnonymousClass424.EXPRESSION
            goto L_0x0080
        L_0x0098:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x009f
            X.424 r0 = X.AnonymousClass424.STRING
            goto L_0x0080
        L_0x009f:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x00b4
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r0 = r1.iterator()
            r3.push(r0)
            X.41m r0 = X.C798341m.ArrayReadValue
            r2.push(r0)
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            goto L_0x0080
        L_0x00b4:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00d5
            java.util.Map r1 = (java.util.Map) r1
            java.util.Iterator r0 = X.AnonymousClass000.A0y(r1)
            r3.push(r0)
            X.41m r0 = X.C798341m.ObjectReadName
            r2.push(r0)
            X.424 r0 = X.AnonymousClass424.START_OBJECT
            goto L_0x0080
        L_0x00c9:
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            r5.A00 = r0
            r3.pop()
            r2.pop()
            goto L_0x001c
        L_0x00d5:
            java.lang.String r0 = "unknown value type"
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3EY.ALo():X.424");
    }

    public String AaN() {
        return this.A02;
    }

    public AnonymousClass424 AaO() {
        return this.A00;
    }

    public C109625Sx AaP() {
        C99254tj r1 = this.A03;
        r1.A00 = this.A01;
        return r1;
    }

    public void Afy() {
        AnonymousClass424 r1 = this.A00;
        AnonymousClass424 r3 = AnonymousClass424.START_ARRAY;
        if (r1 == r3 || r1 == AnonymousClass424.START_OBJECT) {
            int i2 = 1;
            while (true) {
                AnonymousClass424 ALo = ALo();
                if (ALo == r3 || ALo == AnonymousClass424.START_OBJECT) {
                    i2++;
                } else if (ALo == AnonymousClass424.END_ARRAY || ALo == AnonymousClass424.END_OBJECT) {
                    i2--;
                }
                if (i2 == 0) {
                    return;
                }
            }
        }
    }
}
