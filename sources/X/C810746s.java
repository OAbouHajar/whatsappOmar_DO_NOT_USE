package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.46s  reason: invalid class name and case insensitive filesystem */
public class C810746s {
    public static C28371Vv A00(GroupJid groupJid, GroupJid groupJid2, String str, String str2, String str3, String str4, String str5) {
        int i2;
        String str6;
        C28371Vv r10;
        Jid jid;
        boolean A1V = AnonymousClass000.A1V(str2);
        String str7 = str4;
        boolean A1V2 = AnonymousClass000.A1V(str7);
        String str8 = str5;
        boolean A1V3 = AnonymousClass000.A1V(str8);
        C35081lL[] r5 = new C35081lL[((A1V ? 1 : 0) + true + (A1V2 ? 1 : 0) + (A1V3 ? 1 : 0))];
        if (A1V) {
            C35081lL.A02("query", str2, r5, 0);
            i2 = 1;
        } else {
            i2 = 0;
        }
        C35081lL.A02("type", str3, r5, i2);
        int i3 = i2 + 1;
        if (A1V2) {
            C35081lL.A02("id", str7, r5, i3);
            i3++;
        }
        if (A1V3) {
            C35081lL.A02("invite", str8, r5, i3);
            r10 = new C28371Vv(FacebookFacade.RequestParameter.PICTURE, r5);
            jid = C34961l9.A00;
        } else {
            AnonymousClass00B.A06(groupJid);
            if (groupJid2 == null) {
                str6 = "parent_group";
                groupJid2 = groupJid;
            } else {
                str6 = "sub_group";
            }
            C35081lL[] r2 = new C35081lL[2];
            C35081lL.A02("type", str6, r2, 0);
            r2[1] = new C35081lL((Jid) groupJid2, "jid");
            r10 = new C28371Vv(new C28371Vv("query_linked", r2), FacebookFacade.RequestParameter.PICTURE, r5);
            jid = groupJid;
        }
        C35081lL[] r3 = new C35081lL[4];
        C35081lL.A02("id", str, r3, 0);
        C35081lL.A02("xmlns", "w:g2", r3, 1);
        C35081lL.A02("type", "get", r3, 2);
        r3[3] = new C35081lL(jid, "to");
        return new C28371Vv(r10, "iq", r3);
    }
}
