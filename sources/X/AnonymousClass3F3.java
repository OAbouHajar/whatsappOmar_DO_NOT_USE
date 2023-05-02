package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape0S1200100_I0;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3F3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3F3 implements C108575On {
    public final /* synthetic */ AnonymousClass2W7 A00;
    public final /* synthetic */ C59592yX A01;
    public final /* synthetic */ CartFragment A02;

    public /* synthetic */ AnonymousClass3F3(AnonymousClass2W7 r1, C59592yX r2, CartFragment cartFragment) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = cartFragment;
    }

    public final void AVX(long j2) {
        List A0k;
        C59592yX r1 = this.A01;
        AnonymousClass2W7 r3 = this.A00;
        CartFragment cartFragment = this.A02;
        String str = ((C50092Xx) r3.ABo(r1.A00())).A00.A01.A0D;
        AnonymousClass2RP r4 = cartFragment.A0R;
        long j3 = j2;
        if (j2 == 0) {
            AnonymousClass2RR r5 = r4.A0I;
            UserJid userJid = r4.A0P;
            C17170ue r32 = r5.A0G;
            C31481eG r2 = new C31481eG();
            r2.A09 = r32.A00;
            AtomicInteger atomicInteger = r32.A08;
            r2.A04 = Integer.valueOf(atomicInteger.get());
            AtomicInteger atomicInteger2 = r32.A09;
            r2.A08 = C13690nt.A0W(atomicInteger2.getAndIncrement());
            r2.A05 = 30;
            r2.A03 = 54;
            r2.A0D = str;
            r2.A00 = userJid;
            r32.A03(r2);
            AnonymousClass027 r0 = r5.A00;
            if (r0 != null && (A0k = C13690nt.A0k(r0)) != null && A0k.size() == 1 && str.equals(((C50102Xy) C13690nt.A0Z(A0k)).A01.A0D)) {
                C31481eG r22 = new C31481eG();
                r22.A09 = r32.A00;
                r22.A04 = Integer.valueOf(atomicInteger.get());
                r22.A08 = C13690nt.A0W(atomicInteger2.getAndIncrement());
                r22.A05 = 31;
                r22.A03 = 55;
                r22.A00 = userJid;
                r32.A03(r22);
            }
            r5.A0L.Acl(new RunnableRunnableShape0S1200000_I0(userJid, str, r5, 10));
        } else {
            AnonymousClass2RR r7 = r4.A0I;
            UserJid userJid2 = r4.A0P;
            C17170ue r33 = r7.A0G;
            C31481eG A002 = C17170ue.A00(r33);
            A002.A08 = C13690nt.A0W(r33.A09.getAndIncrement());
            A002.A05 = 29;
            A002.A03 = 53;
            A002.A0D = str;
            A002.A00 = userJid2;
            A002.A07 = Long.valueOf(j2);
            r33.A03(A002);
            r7.A0L.Acl(new RunnableRunnableShape0S1200100_I0(r7, userJid2, str, 1, j3));
        }
        int i2 = 0;
        if (j2 == 0) {
            i2 = 4;
        }
        r1.A08.setVisibility(i2);
    }
}
