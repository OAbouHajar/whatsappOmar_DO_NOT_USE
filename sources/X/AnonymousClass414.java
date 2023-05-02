package X;

/* renamed from: X.414  reason: invalid class name */
public enum AnonymousClass414 {
    ;
    
    public final int id;
    public final AnonymousClass411 zzix;
    public final C796940x zziy;
    public final Class zziz;
    public final boolean zzja;

    /* access modifiers changed from: public */
    AnonymousClass414(String str, int i2, int i3) {
        int i4;
        this.id = i3;
        this.zziy = r5;
        this.zzix = r6;
        int i5 = AnonymousClass4AW.A00[r5.ordinal()];
        boolean z2 = true;
        this.zziz = (i5 == 1 || i5 == 2) ? r6.zzli : null;
        this.zzja = (r5 != C796940x.A01 || (i4 = AnonymousClass4AW.A01[r6.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : z2;
    }

    public static AnonymousClass414 A00(C796940x r2, AnonymousClass411 r3, String str, int i2) {
        return new AnonymousClass414(r2, r3, str, i2, i2);
    }
}
