package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallLogInfo;
import java.util.List;

/* renamed from: X.1fV  reason: invalid class name and case insensitive filesystem */
public class C32011fV {
    public final int A00;
    public final int A01;
    public final GroupJid A02;
    public final CallLogInfo A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;

    public C32011fV(CallLogInfo callLogInfo, String str, String str2, String str3, List list, int i2, int i3, boolean z2, boolean z3) {
        this.A01 = i2;
        this.A04 = str;
        this.A00 = i3;
        this.A06 = list;
        this.A02 = GroupJid.getNullable(str2);
        this.A08 = z2;
        this.A03 = callLogInfo;
        this.A07 = z3;
        this.A05 = str3;
    }
}
