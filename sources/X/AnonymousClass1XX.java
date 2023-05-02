package X;

import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;

/* renamed from: X.1XX  reason: invalid class name */
public class AnonymousClass1XX implements AnonymousClass023 {
    public AnonymousClass024 A00;
    public final AnonymousClass1WA A01;
    public final /* synthetic */ AnonymousClass025 A02;
    public final /* synthetic */ AnonymousClass026 A03;
    public final /* synthetic */ C23131Ap A04;

    public AnonymousClass1XX(AnonymousClass025 r4, AnonymousClass026 r5, C23131Ap r6) {
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = new AnonymousClass1WA(r6.A00, true);
    }

    public void AOH(Object obj) {
        AnonymousClass024 r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        RunnableRunnableShape11S0200000_I0_9 runnableRunnableShape11S0200000_I0_9 = new RunnableRunnableShape11S0200000_I0_9(this, obj);
        this.A00 = ((AnonymousClass1XY) runnableRunnableShape11S0200000_I0_9.A00).A00;
        AnonymousClass1WA r02 = this.A01;
        r02.A00();
        r02.execute(runnableRunnableShape11S0200000_I0_9);
    }
}
