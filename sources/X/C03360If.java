package X;

/* renamed from: X.0If  reason: invalid class name and case insensitive filesystem */
public class C03360If extends C10670hV {
    public final /* synthetic */ AnonymousClass0PH A00;

    public C03360If(AnonymousClass0PH r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0PH r0 = this.A00;
        AnonymousClass09Y r5 = r0.A0L;
        float f2 = r0.A09;
        float f3 = r0.A0A;
        AnonymousClass09W r52 = (AnonymousClass09W) r5;
        r52.A06();
        AnonymousClass0VB r02 = r52.A0O;
        if (r02 == null || !r02.A0B(f2, f3)) {
            AnonymousClass074 r2 = r52.A0M;
            AnonymousClass0VB r03 = r2.A0E;
            if (r03 != null) {
                r03.A04();
            }
            r2.A0E = null;
            AnonymousClass074 r04 = r52.A0M;
            C12800kz r1 = r04.A0B;
            if (r1 != null) {
                r1.ATG(r04.A0S.A05(f2, f3));
                return;
            }
            return;
        }
        AnonymousClass074 r22 = r52.A0M;
        AnonymousClass0VB r12 = r52.A0O;
        AnonymousClass0VB r05 = r22.A0E;
        if (!(r05 == null || r05 == r12)) {
            r05.A04();
        }
        r22.A0E = r12;
    }
}
