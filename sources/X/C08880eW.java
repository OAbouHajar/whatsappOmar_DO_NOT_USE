package X;

import android.util.SparseArray;

/* renamed from: X.0eW  reason: invalid class name and case insensitive filesystem */
public class C08880eW implements C13340ls {
    public C09110ev A00;
    public final SparseArray A01 = new SparseArray();
    public final C87404Wq A02;
    public final boolean A03;

    public C08880eW(C87404Wq r2, boolean z2) {
        this.A02 = r2;
        this.A03 = z2;
    }

    public static C09110ev A00(C09110ev r1) {
        C09110ev r0;
        AnonymousClass3TX r02;
        try {
            if (!C09110ev.A01(r1) || !(r1.A04() instanceof AnonymousClass3TX) || (r02 = (AnonymousClass3TX) r1.A04()) == null) {
                r0 = null;
            } else {
                r0 = r02.A02();
            }
            return r0;
        } finally {
            if (r1 != null) {
                r1.close();
            }
        }
    }

    public static C09110ev A01(C09110ev r2) {
        return C09110ev.A00(C09110ev.A05, new AnonymousClass3TX(r2, C88824b9.A00));
    }

    public synchronized boolean A6d(int i2) {
        return this.A02.A03(i2);
    }

    public synchronized C09110ev AA5(int i2, int i3, int i4) {
        return !this.A03 ? null : A00(this.A02.A00());
    }

    public synchronized C09110ev AAK(int i2) {
        return A00(this.A02.A01(i2));
    }

    public synchronized C09110ev ACA(int i2) {
        C09110ev r0;
        r0 = this.A00;
        return A00(r0 != null ? r0.A03() : null);
    }

    public synchronized void ARc(C09110ev r6, int i2, int i3) {
        C09110ev r4 = null;
        try {
            C09110ev A012 = A01(r6);
            if (A012 != null) {
                C09110ev A022 = this.A02.A02(A012, i2);
                if (C09110ev.A01(A022)) {
                    SparseArray sparseArray = this.A01;
                    C09110ev r0 = (C09110ev) sparseArray.get(i2);
                    if (r0 != null) {
                        r0.close();
                    }
                    sparseArray.put(i2, A022);
                    AnonymousClass0X1.A01(C08880eW.class, Integer.valueOf(i2), sparseArray, "cachePreparedFrame(%d) cached. Pending frames: %s");
                }
                A012.close();
            }
        } catch (Throwable th) {
            if (r4 != null) {
                r4.close();
            }
            throw th;
        }
    }

    public synchronized void ARe(C09110ev r6, int i2, int i3) {
        synchronized (this) {
            try {
                SparseArray sparseArray = this.A01;
                C09110ev r0 = (C09110ev) sparseArray.get(i2);
                if (r0 != null) {
                    sparseArray.delete(i2);
                    r0.close();
                    AnonymousClass0X1.A01(C08880eW.class, Integer.valueOf(i2), sparseArray, "removePreparedReference(%d) removed. Pending frames: %s");
                }
                C09110ev r1 = null;
                try {
                    C09110ev A012 = A01(r6);
                    if (A012 != null) {
                        C09110ev r02 = this.A00;
                        if (r02 != null) {
                            r02.close();
                        }
                        this.A00 = this.A02.A02(A012, i2);
                        A012.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (r1 != null) {
                        r1.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public synchronized void clear() {
        C09110ev r0 = this.A00;
        if (r0 != null) {
            r0.close();
        }
        this.A00 = null;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i2 < sparseArray.size()) {
                C09110ev r02 = (C09110ev) sparseArray.valueAt(i2);
                if (r02 != null) {
                    r02.close();
                }
                i2++;
            } else {
                sparseArray.clear();
            }
        }
    }
}
