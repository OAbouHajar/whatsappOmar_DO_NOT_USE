package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.21V  reason: invalid class name */
public class AnonymousClass21V extends AnonymousClass21W {
    public static final long A05 = TimeUnit.DAYS.toMillis(7);
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass21V(UserJid userJid, String str, String str2, String str3, int i2, long j2) {
        super(userJid);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = j2;
        this.A04 = str3;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass21V r7 = (AnonymousClass21V) obj;
            if (this.A00 != r7.A00 || !this.A00.getRawString().equals(r7.A00.getRawString()) || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03) || this.A01 != r7.A01 || !this.A04.equals(r7.A04) || this.A00 != r7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A00.getRawString(), this.A02, this.A03, Long.valueOf(this.A01), this.A04, Integer.valueOf(this.A00)});
    }
}
