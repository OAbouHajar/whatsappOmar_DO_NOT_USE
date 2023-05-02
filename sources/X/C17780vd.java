package X;

import com.facebook.redex.IDxRCallbackShape11S0300000_1_I0;
import com.facebook.redex.IDxRCallbackShape13S0300000_2_I0;
import com.facebook.redex.IDxRCallbackShape5S0400000_1_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0vd  reason: invalid class name and case insensitive filesystem */
public class C17780vd {
    public static final C35081lL[] A05 = new C35081lL[0];
    public final C16300so A00;
    public final C17760vb A01;
    public final C17190ug A02;
    public final C17770vc A03;
    public final AnonymousClass01D A04;

    public C17780vd(C16300so r1, C17760vb r2, C17190ug r3, C17770vc r4, AnonymousClass01D r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static final C28371Vv A00(String str, List list) {
        int size = list.size();
        C28371Vv[] r6 = new C28371Vv[size];
        for (int i2 = 0; i2 < size; i2++) {
            r6[i2] = new C28371Vv("participant", new C35081lL[]{new C35081lL((Jid) list.get(i2), "jid")});
        }
        return new C28371Vv(str, (C35081lL[]) null, r6);
    }

    public Future A01(C40871up r14, String str) {
        C17190ug r6 = this.A02;
        String A022 = r6.A02();
        C28371Vv r8 = new C28371Vv(new C28371Vv("invite", new C35081lL[]{new C35081lL("code", str)}), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "get"), new C35081lL((Jid) C34961l9.A00, "to")});
        C29951bV r1 = new C29951bV();
        r6.A0A(new IDxRCallbackShape11S0300000_1_I0(r1, this, r14, 0), r8, A022, 107, 32000);
        return r1;
    }

    public Future A02(C40901us r23, C16050sL r24, List list) {
        C28371Vv[] r7;
        C17190ug r15 = this.A02;
        String A022 = r15.A02();
        List list2 = list;
        if (list2.size() > 0) {
            int size = list2.size();
            r7 = new C28371Vv[size];
            for (int i2 = 0; i2 < size; i2++) {
                r7[i2] = new C28371Vv("participant", new C35081lL[]{new C35081lL((Jid) list2.get(i2), "jid")});
            }
        } else {
            r7 = null;
        }
        C16050sL r13 = r24;
        C28371Vv r0 = new C28371Vv(new C28371Vv("revoke", (C35081lL[]) null, r7), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "set"), new C35081lL((Jid) r13, "to")});
        C29951bV r10 = new C29951bV();
        r15.A0A(new IDxRCallbackShape5S0400000_1_I0(r10, this, r23, r13, 0), r0, A022, 210, 32000);
        return r10;
    }

    public Future A03(C40881uq r17, C40841um r18, String str) {
        C17190ug r9 = this.A02;
        String A022 = r9.A02();
        C28371Vv r11 = new C28371Vv(new C28371Vv("invite", new C35081lL[]{new C35081lL("code", str)}), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "set"), new C35081lL((Jid) C34961l9.A00, "to")});
        C29951bV r4 = new C29951bV();
        r9.A0A(new IDxRCallbackShape5S0400000_1_I0(r4, this, r17, r18, 1), r11, A022, AnonymousClass2EA.A03, 32000);
        return r4;
    }

    public void A04(C40811uj r14) {
        C40851un r7;
        C40811uj r8 = r14;
        C16050sL r3 = r14.A01;
        List list = r14.A05;
        AnonymousClass00B.A06(list);
        if (r14.A00) {
            StringBuilder sb = new StringBuilder("GroupIqResponseUtil/add-participants/timeout; groupId=");
            sb.append(r3);
            sb.append("; participants=");
            sb.append(list);
            Log.e(sb.toString());
            r7 = null;
        } else {
            r7 = new C40851un(r8, r14, this, r14, r14);
        }
        A09(r3, r7, "add", list, 15, false);
    }

    public void A05(C40821uk r19) {
        Log.i("GroupXmppMethod/sendLeaveGroup");
        C17190ug r11 = this.A02;
        String A022 = r11.A02();
        C40821uk r5 = r19;
        C16050sL r2 = r5.A01;
        if (r11.A0G(new C40891ur(this, r5, r5, r5.A06), new C28371Vv(new C28371Vv("leave", (C35081lL[]) null, new C28371Vv[]{new C28371Vv("group", new C35081lL[]{new C35081lL((Jid) r2, "id")})}), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "set"), new C35081lL((Jid) C34961l9.A00, "to")}), A022, 16, 32000)) {
            this.A01.A00(r2, 5);
        }
    }

    public void A06(C40821uk r13) {
        C17190ug r5 = this.A02;
        String A022 = r5.A02();
        C28371Vv r7 = new C28371Vv(new C28371Vv("subject", r13.A04, (C35081lL[]) null), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "set"), new C35081lL((Jid) r13.A01, "to")});
        IDxRCallbackShape13S0300000_2_I0 iDxRCallbackShape13S0300000_2_I0 = new IDxRCallbackShape13S0300000_2_I0(r13, r13, this, 2);
        Log.i("GroupXmppMethods/sendSetGroupSubject");
        r5.A0G(iDxRCallbackShape13S0300000_2_I0, r7, A022, 17, 32000);
    }

    public void A07(C40821uk r8, C16050sL r9, int i2) {
        C35081lL[] r5;
        int i3;
        String str;
        if (i2 > 0) {
            r5 = new C35081lL[]{new C35081lL("expiration", i2)};
            i3 = 224;
            str = "ephemeral";
        } else {
            r5 = null;
            i3 = 224;
            str = "not_ephemeral";
        }
        A08(r9, r8, r8, str, r5, i3);
        StringBuilder sb = new StringBuilder("GroupXmppMethods/set-ephemeral-setting; ephemeralDuration=");
        sb.append(i2);
        Log.i(sb.toString());
    }

    public final void A08(C16050sL r14, C40841um r15, Runnable runnable, String str, C35081lL[] r18, int i2) {
        C17190ug r6 = this.A02;
        String A022 = r6.A02();
        String str2 = str;
        C28371Vv r4 = new C28371Vv(str2, r18);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL("id", A022));
        arrayList.add(new C35081lL("xmlns", "w:g2"));
        arrayList.add(new C35081lL("type", "set"));
        arrayList.add(new C35081lL((Jid) r14, "to"));
        r6.A0G(new C40911ut(this, r15, runnable, str2), new C28371Vv(r4, "iq", (C35081lL[]) arrayList.toArray(A05)), A022, i2, 32000);
    }

    public final void A09(C16050sL r19, C19550yc r20, String str, List list, int i2, boolean z2) {
        StringBuilder sb = new StringBuilder("GroupXmppMethods/");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        C19550yc r12 = r20;
        if (r20 != null) {
            C17190ug r11 = this.A02;
            String A022 = r11.A02();
            List list2 = list;
            int size = list2.size();
            C28371Vv[] r7 = new C28371Vv[size];
            for (int i3 = 0; i3 < size; i3++) {
                r7[i3] = new C28371Vv("participant", new C35081lL[]{new C35081lL((Jid) list2.get(i3), "jid")});
            }
            C28371Vv r4 = new C28371Vv(str2, (C35081lL[]) null, r7);
            C35081lL[] r3 = {new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "set"), new C35081lL((Jid) r19, "to")};
            if (z2) {
                r4 = new C28371Vv(r4, "admin", (C35081lL[]) null);
            }
            r11.A0G(r12, new C28371Vv(r4, "iq", r3), A022, i2, 32000);
        }
    }

    public void A0A(C16050sL r15, String str, int i2) {
        if (!this.A03.A00.A02(r15)) {
            Log.w("GroupXmppMethods/skip sendGetGroupInfo");
            return;
        }
        String str2 = "GroupXmppMethods/sendGetGroupInfo";
        String str3 = str;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(str3);
            str2 = sb.toString();
        }
        Log.w(str2);
        C17190ug r7 = this.A02;
        String A022 = r7.A02();
        r7.A0G(new C40861uo(this, r15, i2), new C28371Vv(new C28371Vv("query", str == null ? null : new C35081lL[]{new C35081lL("request", str3)}), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "get"), new C35081lL((Jid) r15, "to")}), A022, 20, 32000);
    }
}
