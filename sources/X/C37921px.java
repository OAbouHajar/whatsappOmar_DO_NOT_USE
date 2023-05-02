package X;

import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1px  reason: invalid class name and case insensitive filesystem */
public class C37921px {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public Pair A05;
    public AnonymousClass2Wj A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C16010sH A0T;
    public final UserJid A0U;

    public C37921px(C16010sH r1, UserJid userJid) {
        this.A0U = userJid;
        this.A0T = r1;
    }

    public boolean A00() {
        Pair pair = this.A05;
        return ((Number) pair.first).intValue() == -1 && ((Number) pair.second).intValue() != -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C37921px)) {
            return false;
        }
        C37921px r4 = (C37921px) obj;
        return this.A0U.equals(r4.A0U) && r4.A0T.equals(this.A0T) && C34901l3.A00(r4.A05, this.A05) && r4.A0E == this.A0E && r4.A0C == this.A0C && r4.A08 == this.A08 && r4.A0F == this.A0F && r4.A0D == this.A0D && r4.A01 == this.A01 && r4.A09 == this.A09 && r4.A00 == this.A00 && r4.A0O == this.A0O && r4.A0J == this.A0J && r4.A0I == this.A0I && C34901l3.A00(r4.A06, this.A06) && r4.A0M == this.A0M && r4.A0P == this.A0P && r4.A07 == this.A07 && r4.A02 == this.A02 && C34901l3.A00(r4.A04, this.A04) && r4.A0K == this.A0K && r4.A0L == this.A0L && r4.A0B == this.A0B && r4.A0R == this.A0R && r4.A0H == this.A0H && r4.A03 == this.A03 && r4.A0S == this.A0S && r4.A0A == this.A0A && r4.A0G == this.A0G && r4.A0Q == this.A0Q && r4.A0N == this.A0N;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((((((((((217 + this.A0U.hashCode()) * 31) + this.A0T.hashCode()) * 31) + this.A05.hashCode()) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + this.A01) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A00) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0J ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31;
        AnonymousClass2Wj r0 = this.A06;
        int hashCode2 = (((((((((hashCode + (r0 == null ? 0 : r0.hashCode())) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + this.A02) * 31;
        Bitmap bitmap = this.A04;
        return ((((((((((((((((((((((hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + (this.A0K ? 1 : 0)) * 31) + (this.A0L ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0R ? 1 : 0)) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0S ? 1 : 0)) * 31) + this.A03) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0N ? 1 : 0);
    }

    public final String toString() {
        return this.A0U.toString();
    }
}
