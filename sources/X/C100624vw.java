package X;

/* renamed from: X.4vw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100624vw implements C108575On {
    public final /* synthetic */ C32191fn A00;
    public final /* synthetic */ C32201fo A01;
    public final /* synthetic */ C59652yh A02;
    public final /* synthetic */ AnonymousClass5RY A03;

    public /* synthetic */ C100624vw(C32191fn r1, C32201fo r2, C59652yh r3, AnonymousClass5RY r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void AVX(long j2) {
        String str;
        String str2;
        C59652yh r3 = this.A02;
        C32191fn r0 = this.A00;
        C32201fo r2 = this.A01;
        AnonymousClass5RY r4 = this.A03;
        int i2 = r3.A06;
        if (i2 == -1) {
            i2 = r3.A05;
        }
        C35701mM AFE = r0.AFE(i2);
        String str3 = null;
        if (r2 != null) {
            int i3 = r3.A06;
            if (i3 == -1) {
                i3 = r3.A05;
            }
            AnonymousClass4K6 AAj = r2.AAj(i3);
            if (AAj != null) {
                str3 = AAj.A01;
                str = AAj.A02;
                str2 = AAj.A00;
                r4.AVY(AFE, str3, str, str2, i2, j2);
            }
        }
        str = null;
        str2 = null;
        r4.AVY(AFE, str3, str, str2, i2, j2);
    }
}
