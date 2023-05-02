package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.2At  reason: invalid class name and case insensitive filesystem */
public class C45742At {
    public final int A00;
    public final UserJid A01;
    public final C16740tZ A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C45742At(UserJid userJid, C16740tZ r2, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A02 = r2;
        this.A06 = z2;
        this.A08 = z3;
        this.A04 = z4;
        this.A05 = z5;
        this.A07 = z6;
        this.A03 = z7;
        this.A00 = i2;
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C45742At r5 = (C45742At) obj;
            if (!(this.A06 == r5.A06 && this.A08 == r5.A08 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A07 == r5.A07 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02.equals(r5.A02) && C34901l3.A00(this.A01, r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Boolean.valueOf(this.A06), Boolean.valueOf(this.A08), Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), Boolean.valueOf(this.A07), Boolean.valueOf(this.A03), false, Integer.valueOf(this.A00), this.A01});
    }
}
