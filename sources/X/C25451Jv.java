package X;

import android.app.Activity;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Jv  reason: invalid class name and case insensitive filesystem */
public class C25451Jv extends C25251Jb {
    public final C25441Ju A00;

    public C25451Jv(C25441Ju r4) {
        super("wa.action.commerce.SendNFMReplyMessage", "wa.action.commerce.ActionWithCallback");
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ Object A8l(C14950q3 r8, C99354tt r9, C14970q5 r10) {
        C14960q4 r102 = (C14960q4) r10;
        String str = r9.A00;
        if (!str.equals("wa.action.commerce.SendNFMReplyMessage")) {
            if (str.equals("wa.action.commerce.ActionWithCallback")) {
                List list = r8.A00;
                String str2 = (String) list.get(0);
                Map map = (Map) list.get(1);
                C31421e9 r0 = ((C31411e8) list.get(2)).A00;
                AnonymousClass1Z6 r3 = new AnonymousClass1Z6();
                r3.A01 = r0;
                r3.A00 = r102;
                C25441Ju r2 = this.A00;
                Activity A002 = AnonymousClass1K6.A00(r102);
                C25301Jg r02 = (C25301Jg) r2.A05.get(str2);
                if (r02 != null) {
                    r02.AaS(A002, r3, map);
                } else {
                    r2.A01.A00(r3, str2).A00("unsupported_action");
                    return null;
                }
            }
            return null;
        }
        List list2 = r8.A00;
        this.A00.A00(AnonymousClass1K6.A00(r102), (String) list2.get(0), (String) list2.get(1), (Map) list2.get(2));
        return null;
    }
}
