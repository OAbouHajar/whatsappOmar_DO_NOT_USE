package X;

import android.view.View;

/* renamed from: X.5Fe  reason: invalid class name and case insensitive filesystem */
public final class C106785Fe extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass47K $entryPoint;
    public final /* synthetic */ C86254Rw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106785Fe(AnonymousClass47K r2, C86254Rw r3) {
        super(1);
        this.this$0 = r3;
        this.$entryPoint = r2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        int i2;
        boolean A1X = AnonymousClass000.A1X(obj);
        View view = this.this$0.A01;
        int i3 = 0;
        if (A1X) {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (!A1X) {
            C86254Rw r2 = this.this$0;
            AnonymousClass47K r1 = this.$entryPoint;
            if (C18450wi.A0R(r1, C78073x3.A00)) {
                i2 = 14;
            } else if (C18450wi.A0R(r1, C78083x4.A00)) {
                i2 = 9;
            } else {
                throw new AnonymousClass2Xe();
            }
            r2.A05.A02(i2);
        }
        return AnonymousClass22M.A00;
    }
}
