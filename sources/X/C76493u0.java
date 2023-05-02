package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3u0  reason: invalid class name and case insensitive filesystem */
public class C76493u0 extends C40821uk {
    public final /* synthetic */ AnonymousClass39X A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Integer A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76493u0(AnonymousClass11A r8, AnonymousClass39X r9, C17240ul r10, C16050sL r11, UserJid userJid, Integer num, List list) {
        super(r8, r10, r11, (String) null, list, 91);
        this.A00 = r9;
        this.A01 = userJid;
        this.A02 = num;
    }

    public void A01(Integer num) {
        AnonymousClass39X r1 = this.A00;
        r1.A01.A2Q();
        AnonymousClass4RA r3 = r1.A00;
        if (r3 != null && num != null) {
            r3.A00(this.A01, this.A02, 1);
        }
    }
}
