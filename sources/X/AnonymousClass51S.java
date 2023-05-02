package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.51S  reason: invalid class name */
public class AnonymousClass51S implements C31031dM {
    public final /* synthetic */ AnonymousClass39M A00;
    public final /* synthetic */ C16010sH A01;

    public AnonymousClass51S(AnonymousClass39M r1, C16010sH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A8B(C30191bu r4) {
        String str;
        C16010sH r1 = this.A01;
        if (r1.A0J()) {
            Jid A08 = r1.A08(C16050sL.class);
            AnonymousClass00B.A06(A08);
            int A012 = this.A00.A04.A01((C16060sN) A08);
            str = A012 < 32 ? "GROUP_32" : A012 < 64 ? "GROUP_64" : A012 < 128 ? "GROUP_128" : A012 < 256 ? "GROUP_256" : A012 < 512 ? "GROUP_512" : "GROUP_MORE_512";
        } else {
            str = "one_to_one";
        }
        r4.A00(str.length(), "type_of_chat", str);
    }

    public String ADD() {
        return "type_of_chat";
    }
}
