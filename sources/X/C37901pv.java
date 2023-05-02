package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1pv  reason: invalid class name and case insensitive filesystem */
public class C37901pv {
    public final long A00;
    public final C15830rv A01;
    public final UserJid A02;
    public final String A03;
    public final boolean A04;

    public C37901pv(C15830rv r1, UserJid userJid, String str, long j2, boolean z2) {
        this.A00 = j2;
        this.A04 = z2;
        this.A03 = str;
        this.A01 = r1;
        this.A02 = userJid;
    }

    public AnonymousClass2M4 A00() {
        UserJid userJid;
        C33241iG r7 = (C33241iG) C33231iF.A05.A0U();
        r7.A05(this.A03);
        boolean z2 = this.A04;
        r7.A08(z2);
        C15830rv r1 = this.A01;
        r7.A07(r1.getRawString());
        if (C16030sJ.A0L(r1) && !z2 && (userJid = this.A02) != null) {
            r7.A06(userJid.getRawString());
        }
        C28581Wr A0U = AnonymousClass2M4.A03.A0U();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        if (seconds > 0) {
            A0U.A03();
            AnonymousClass2M4 r12 = (AnonymousClass2M4) A0U.A00;
            r12.A00 |= 2;
            r12.A01 = seconds;
        }
        A0U.A03();
        AnonymousClass2M4 r13 = (AnonymousClass2M4) A0U.A00;
        r13.A02 = (C33231iF) r7.A02();
        r13.A00 |= 1;
        return (AnonymousClass2M4) A0U.A02();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C37901pv r5 = (C37901pv) obj;
            if (this.A04 != r5.A04 || !this.A03.equals(r5.A03) || !this.A01.equals(r5.A01) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A03, this.A01, this.A02});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncdMessage{timestamp=");
        sb.append(this.A00);
        sb.append(", isFromMe=");
        sb.append(this.A04);
        sb.append(", messageId=");
        sb.append(this.A03);
        sb.append(", remoteJid=");
        sb.append(this.A01);
        sb.append(", participant=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
