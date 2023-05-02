package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2bq  reason: invalid class name and case insensitive filesystem */
public class C51542bq {
    public static final C35081lL[] A0D = new C35081lL[0];
    public int A00;
    public long A01;
    public long A02;
    public Map A03;
    public final C16300so A04;
    public final C15900s5 A05;
    public final C16980tz A06;
    public final C15860rz A07;
    public final C14710pd A08;
    public final AnonymousClass2H7 A09;
    public final AnonymousClass17L A0A;
    public final C207811o A0B;
    public final C46842Gl A0C;

    public C51542bq(C16300so r1, C15900s5 r2, C16980tz r3, C15860rz r4, C14710pd r5, AnonymousClass2H7 r6, AnonymousClass17L r7, C207811o r8, C46842Gl r9, Map map) {
        this.A08 = r5;
        this.A04 = r1;
        this.A06 = r3;
        this.A05 = r2;
        this.A0A = r7;
        this.A0B = r8;
        this.A07 = r4;
        this.A09 = r6;
        this.A03 = map;
        this.A0C = r9;
    }

    public static final C35081lL[] A00(C15830rv r3, C15830rv r4, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL((Jid) r3, "to"));
        arrayList.add(new C35081lL("id", str));
        arrayList.add(new C35081lL("type", str3));
        if (r4 != null) {
            arrayList.add(new C35081lL((Jid) r4, "participant"));
        }
        if (str2 != null) {
            arrayList.add(new C35081lL("category", str2));
        }
        return (C35081lL[]) arrayList.toArray(A0D);
    }

    public static final C35081lL[] A01(Jid jid, Jid jid2, UserJid userJid, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL(jid, "to"));
        arrayList.add(new C35081lL("id", str));
        if (str2 != null) {
            arrayList.add(new C35081lL("type", str2));
        }
        if (jid2 != null) {
            arrayList.add(new C35081lL(jid2, "participant"));
        }
        if (userJid != null) {
            arrayList.add(new C35081lL((Jid) userJid, "recipient"));
        }
        if (str3 != null) {
            arrayList.add(new C35081lL("category", str3));
        }
        return (C35081lL[]) arrayList.toArray(A0D);
    }

    public static final C28371Vv[] A02(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        C28371Vv[] r6 = new C28371Vv[length];
        for (int i2 = 0; i2 < length; i2++) {
            r6[i2] = new C28371Vv("item", new C35081lL[]{new C35081lL("id", strArr[i2])});
        }
        return new C28371Vv[]{new C28371Vv("list", (C35081lL[]) null, r6)};
    }

    public void A03() {
        C32461gQ r2 = new C32461gQ("presence");
        r2.A09("available", "type", C51672c3.A00);
        this.A0C.A04(r2.A01(), 1);
    }

    public final void A04(C15830rv r14, C15830rv r15, Integer num, String str, String str2, String str3, String str4) {
        C15830rv r8 = r14;
        C15830rv r7 = r15;
        if (!C16030sJ.A0I(r15)) {
            r7 = r14;
            r8 = r15;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL("type", str3));
        if (num != null) {
            arrayList.add(new C35081lL("reason", String.valueOf(num)));
        }
        String str5 = str2;
        if (str2 != null) {
            arrayList.add(new C35081lL("sub-type", str5));
        }
        ArrayList arrayList2 = new ArrayList();
        C28371Vv r0 = new C28371Vv("error", (C35081lL[]) arrayList.toArray(A0D));
        C35081lL[] A012 = A01(r7, r8, (UserJid) null, str, "error", (String) null);
        arrayList2.add(r0);
        String str6 = str4;
        if (str4 != null) {
            arrayList2.add(new C28371Vv("biz", new C35081lL[]{new C35081lL("reason", str6)}));
        }
        this.A0C.A04(new C28371Vv("receipt", A012, (C28371Vv[]) arrayList2.toArray(new C28371Vv[0])), 1);
    }

    public final void A05(C15830rv r11, DeviceJid deviceJid, UserJid userJid, C28381Vw r14, String str, String[] strArr, long j2) {
        Pair A0K = C41071vB.A0K(deviceJid, r14.A00, r11);
        A07(new C28371Vv("receipt", A01((Jid) A0K.first, (Jid) A0K.second, userJid, r14.A01, str, (String) null), A02(strArr)), j2);
    }

    public final void A06(DeviceJid deviceJid, DeviceJid deviceJid2, String str, String str2, String str3, long j2) {
        C28371Vv[] r3 = {new C28371Vv(str3, new C35081lL[]{new C35081lL("call-id", str2), new C35081lL((Jid) deviceJid2, "call-creator")})};
        A07(new C28371Vv("receipt", new C35081lL[]{new C35081lL((Jid) deviceJid, "to"), new C35081lL("id", str)}, r3), j2);
    }

    public final void A07(C28371Vv r7, long j2) {
        C30831d2 A012 = this.A0B.A01(j2);
        if (A012 != null) {
            synchronized (A012) {
                int i2 = A012.A00;
                if (i2 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Processing is already done for ");
                    sb.append(A012.A0B);
                    String obj = sb.toString();
                    C16300so r2 = A012.A05;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A012.A03());
                    sb2.append("/failed processing done check");
                    r2.AcB(sb2.toString(), obj, true);
                } else {
                    A012.A01(i2, SystemClock.uptimeMillis() - A012.A01);
                    A012.A00 = 0;
                    A012.A01(0, SystemClock.uptimeMillis() - A012.A04);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A012.A03());
                    sb3.append("/onProcessingDone/stanzaId = ");
                    sb3.append(A012.A0B);
                    Log.i(sb3.toString());
                    C207811o r3 = A012.A08;
                    synchronized (r3) {
                        r3.A02(A012.A02).remove(Long.valueOf(A012.A03));
                    }
                }
            }
        }
        this.A0C.A04(r7, 1);
    }

    public void A08(C28371Vv r11, C30641ci r12) {
        C207811o r3 = this.A0B;
        long j2 = r12.A00;
        C30831d2 A002 = r3.A00(2, j2);
        if (!(A002 == null || A002.A0A == null)) {
            AnonymousClass17L r32 = this.A0A;
            synchronized (r32) {
                r32.A01.add(r12);
            }
        }
        Jid jid = r12.A01;
        String str = r12.A05;
        String str2 = (!"receipt".equals(str) || !"delivery".equals(r12.A08)) ? r12.A08 : null;
        ArrayList arrayList = new ArrayList();
        String str3 = r12.A07;
        if (str3 != null) {
            arrayList.add(new C35081lL("id", str3));
        } else {
            AnonymousClass00B.A0B("received stanza with null id", false);
        }
        if (jid != null) {
            arrayList.add(new C35081lL(jid, "to"));
        }
        if (str != null) {
            arrayList.add(new C35081lL("class", str));
        } else {
            AnonymousClass00B.A0B("received stanza with null class", false);
        }
        if (str2 != null) {
            arrayList.add(new C35081lL("type", str2));
        }
        Jid jid2 = r12.A02;
        if (jid2 != null) {
            arrayList.add(new C35081lL(jid2, "participant"));
        }
        UserJid userJid = r12.A03;
        if (userJid != null) {
            arrayList.add(new C35081lL((Jid) userJid, "recipient"));
        }
        String str4 = r12.A06;
        if (!TextUtils.isEmpty(str4) && !"0".equals(str4)) {
            arrayList.add(new C35081lL("edit", str4));
        }
        List list = r12.A09;
        if (list != null) {
            arrayList.addAll(list);
        }
        A07(new C28371Vv("ack", (C35081lL[]) arrayList.toArray(new C35081lL[0]), r11 == null ? null : new C28371Vv[]{r11}), j2);
    }

    public void A09(boolean z2) {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        String hexString = Integer.toHexString(i2);
        this.A03.put(hexString, new IDxRHandlerShape97S0100000_2_I0(this, 2));
        String string = this.A05.A00.getString("server_props:config_hash", (String) null);
        if (string == null || z2) {
            string = "";
        }
        this.A0C.A04(new C28371Vv(new C28371Vv("props", new C35081lL[]{new C35081lL("protocol", "2"), new C35081lL("hash", string)}), "iq", new C35081lL[]{new C35081lL("id", hexString), new C35081lL("xmlns", "w"), new C35081lL("type", "get"), new C35081lL((Jid) C34791ks.A00, "to")}), 1);
    }
}
