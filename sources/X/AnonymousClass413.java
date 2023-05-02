package X;

/* renamed from: X.413  reason: invalid class name */
public enum AnonymousClass413 {
    ;
    
    public final AnonymousClass412 zzaz;
    public final int zzba;
    public final C797040y zzbb;
    public final Class zzbc;
    public final boolean zzbd;

    /* access modifiers changed from: public */
    AnonymousClass413(String str, int i2, int i3) {
        int i4;
        this.zzba = i3;
        this.zzbb = r5;
        this.zzaz = r6;
        int i5 = C81874Ab.A00[r5.ordinal()];
        boolean z2 = true;
        this.zzbc = (i5 == 1 || i5 == 2) ? r6.zzl : null;
        this.zzbd = (r5 != C797040y.A01 || (i4 = C81874Ab.A01[r6.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : z2;
    }

    public static AnonymousClass413 A00(C797040y r2, AnonymousClass412 r3, String str, int i2) {
        return new AnonymousClass413(r2, r3, str, i2, i2);
    }
}
