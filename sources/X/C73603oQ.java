package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3oQ  reason: invalid class name and case insensitive filesystem */
public class C73603oQ extends C73573oN {
    public final /* synthetic */ AnonymousClass4K2 A00;
    public final /* synthetic */ AnonymousClass35w A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73603oQ(AnonymousClass4K2 r1, AnonymousClass35w r2, C16080sP r3, AnonymousClass013 r4) {
        super(r3, r4);
        this.A01 = r2;
        this.A00 = r1;
    }

    public int A00(C16010sH r6, C16010sH r7) {
        AnonymousClass4K2 r4 = this.A00;
        Class<UserJid> cls = UserJid.class;
        boolean contains = r4.A02.contains(r6.A08(cls));
        return contains == r4.A02.contains(r7.A08(cls)) ? super.A00(r6, r7) : contains ? -1 : 1;
    }
}
