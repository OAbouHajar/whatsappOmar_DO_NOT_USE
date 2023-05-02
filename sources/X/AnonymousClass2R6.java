package X;

import com.whatsapp.jid.GroupJid;
import java.util.LinkedHashMap;

/* renamed from: X.2R6  reason: invalid class name */
public class AnonymousClass2R6 {
    public long A00 = -1;
    public final int A01;
    public final int A02;
    public final GroupJid A03;
    public final C37831po A04;
    public final String A05;
    public final LinkedHashMap A06;
    public final boolean A07;

    public AnonymousClass2R6(C37831po r3, int i2) {
        this.A05 = C30341cC.A0A(r3.A0C.A02);
        this.A06 = new LinkedHashMap();
        this.A07 = r3.A0I;
        this.A03 = r3.A04;
        this.A01 = 0;
        this.A04 = r3;
        this.A02 = i2;
    }

    public AnonymousClass2R6(GroupJid groupJid, String str, LinkedHashMap linkedHashMap, int i2, boolean z2) {
        this.A05 = str;
        this.A06 = linkedHashMap;
        this.A07 = z2;
        this.A03 = groupJid;
        this.A01 = i2;
        this.A04 = null;
        this.A02 = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("callId=");
        sb.append(this.A05);
        sb.append(" isVideoCall=");
        sb.append(this.A07);
        sb.append(" groupJid=");
        sb.append(this.A03);
        sb.append(" jids=[ ");
        for (Object append : this.A06.keySet()) {
            sb.append(append);
            sb.append(" ");
        }
        sb.append("]");
        sb.append(" callLog=");
        sb.append(this.A04);
        sb.append(" entryPoint=");
        sb.append(this.A02);
        return sb.toString();
    }
}
