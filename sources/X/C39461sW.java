package X;

import com.whatsapp.jid.GroupJid;
import java.util.Arrays;

/* renamed from: X.1sW  reason: invalid class name and case insensitive filesystem */
public class C39461sW {
    public int A00;
    public final long A01;
    public final GroupJid A02;
    public final String A03;

    public C39461sW(GroupJid groupJid, String str, int i2, long j2) {
        this.A02 = groupJid;
        this.A03 = str;
        this.A01 = j2;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C39461sW r7 = (C39461sW) obj;
            if (this.A01 != r7.A01 || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Subgroup{groupJid=");
        sb.append(this.A02);
        sb.append(", subject='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", subjectTime=");
        sb.append(this.A01);
        sb.append(", groupType=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
