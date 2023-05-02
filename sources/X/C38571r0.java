package X;

import com.whatsapp.jid.GroupJid;
import java.util.Arrays;

/* renamed from: X.1r0  reason: invalid class name and case insensitive filesystem */
public class C38571r0 {
    public long A00;
    public GroupJid A01;
    public boolean A02;
    public final String A03;
    public final boolean A04;

    public C38571r0(GroupJid groupJid, String str, long j2, boolean z2) {
        this.A03 = str;
        this.A00 = j2;
        this.A04 = z2;
        this.A01 = groupJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C38571r0 r7 = (C38571r0) obj;
            if (!(r7.A03.equals(this.A03) && r7.A00 == this.A00 && r7.A04 == this.A04 && C34901l3.A00(r7.A01, this.A01) && r7.A02 == this.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Long.valueOf(this.A00), Boolean.valueOf(this.A04), this.A01, Boolean.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JoinableCallLog[callId=");
        sb.append(this.A03);
        sb.append(", callLogRowId=");
        sb.append(this.A00);
        sb.append(", videoCall=");
        sb.append(this.A04);
        sb.append(", groupJid=");
        sb.append(this.A01);
        sb.append(", needsCommit=");
        sb.append(this.A02);
        sb.append("]");
        return sb.toString();
    }
}
