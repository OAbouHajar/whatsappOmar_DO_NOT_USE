package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3u1  reason: invalid class name and case insensitive filesystem */
public class C76503u1 extends C40821uk {
    public final /* synthetic */ AnonymousClass39X A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Integer A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76503u1(AnonymousClass11A r8, AnonymousClass39X r9, C17240ul r10, C16050sL r11, UserJid userJid, Integer num, List list) {
        super(r8, r10, r11, (String) null, list, 92);
        this.A00 = r9;
        this.A01 = userJid;
        this.A02 = num;
    }

    public void A01(Integer num) {
        C87084Vh r2;
        C74803r8 A002;
        int i2;
        AnonymousClass39X r1 = this.A00;
        r1.A01.A2Q();
        AnonymousClass4RA r4 = r1.A00;
        if (r4 == null) {
            return;
        }
        if (num != null) {
            r4.A00(this.A01, this.A02, 2);
            return;
        }
        UserJid userJid = this.A01;
        Integer num2 = this.A02;
        C86224Rt r22 = r4.A02;
        if (r22.A02.A0I(userJid) && num2 != null) {
            int intValue = num2.intValue();
            if (intValue == 3) {
                r2 = r22.A04;
                A002 = C74803r8.A00(r2);
                i2 = C13680ns.A0Y();
            } else if (intValue == 4) {
                r2 = r22.A04;
                A002 = C74803r8.A00(r2);
                i2 = 4;
            } else {
                return;
            }
            A002.A02 = i2;
            A002.A00 = Boolean.FALSE;
            r2.A01.A06(A002);
        }
    }
}
