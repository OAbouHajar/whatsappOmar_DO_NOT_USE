package X;

import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.21H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass21H implements AnonymousClass1WE {
    public final /* synthetic */ C18220wL A00;
    public final /* synthetic */ AnonymousClass1XP A01;
    public final /* synthetic */ C31771f0 A02;
    public final /* synthetic */ C31681er A03;

    public /* synthetic */ AnonymousClass21H(C18220wL r1, AnonymousClass1XP r2, C31771f0 r3, C31681er r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void accept(Object obj) {
        C16490t9 r6;
        int i2;
        C18220wL r4 = this.A00;
        C31771f0 r0 = this.A02;
        AnonymousClass1XP r3 = this.A01;
        C31681er r5 = this.A03;
        AnonymousClass21B r8 = (AnonymousClass21B) obj;
        int i3 = r8.A00;
        if ("express".equals(r0.A02.A09)) {
            if (C87644Xx.A01(i3)) {
                Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload failed, fallback to normal upload");
                r6 = r4.A06;
                i2 = 24;
            } else if (27 == i3) {
                Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload no primary host, skip and fallback to normal upload");
                r6 = r4.A06;
                i2 = 26;
            }
            Integer valueOf = Integer.valueOf(i2);
            AnonymousClass21I r1 = new AnonymousClass21I();
            r1.A0G = 8;
            r1.A0H = null;
            r1.A0I = valueOf;
            r1.A0E = null;
            r6.A06(r1);
            C16320sq r52 = r4.A0J;
            C43251zh r12 = r3.A0K;
            AnonymousClass00B.A06(r12);
            r12.A04(0);
            r3.A0U = "mms";
            r52.Acl(new RunnableRunnableShape1S0300000_I0_1(r4, r3, new C31771f0(r3, r3.A00()), 19));
            return;
        }
        C43251zh r13 = r3.A0K;
        AnonymousClass00B.A06(r13);
        synchronized (r13) {
            r13.A0C = true;
        }
        r4.A0J.Acl(new RunnableRunnableShape1S0300000_I0_1(r4, r3, r8, 20));
        r5.A04();
    }
}
