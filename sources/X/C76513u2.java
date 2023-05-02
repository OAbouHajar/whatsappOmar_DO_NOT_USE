package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.3u2  reason: invalid class name and case insensitive filesystem */
public class C76513u2 extends C40821uk {
    public final /* synthetic */ AnonymousClass1Y7 A00;
    public final /* synthetic */ C25931Lr A01;
    public final /* synthetic */ C16010sH A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76513u2(AnonymousClass1Y7 r9, C25931Lr r10, AnonymousClass11A r11, C16010sH r12, C17240ul r13, C16050sL r14, boolean z2) {
        super(r11, r13, r14, (String) null, (List) null, 16, false);
        this.A01 = r10;
        this.A03 = z2;
        this.A02 = r12;
        this.A00 = r9;
    }

    public void A01(Integer num) {
        if (this.A03) {
            C16760tb r2 = this.A01.A01;
            Jid A08 = this.A02.A08(C15830rv.class);
            AnonymousClass00B.A06(A08);
            r2.A0I((C15830rv) A08, true);
        }
        AnonymousClass1Y7 r1 = this.A00;
        if (r1 != null) {
            r1.ARx(this.A02);
        }
    }
}
