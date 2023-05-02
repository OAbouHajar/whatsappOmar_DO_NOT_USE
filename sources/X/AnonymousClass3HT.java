package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3HT  reason: invalid class name */
public class AnonymousClass3HT implements Cloneable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C16010sH A05;
    public AnonymousClass2Wj A06;
    public CharSequence A07 = "";
    public String A08 = "";
    public ArrayList A09 = AnonymousClass000.A0u();
    public List A0A = AnonymousClass000.A0u();
    public List A0B = AnonymousClass000.A0u();
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3HT)) {
            return false;
        }
        AnonymousClass3HT r4 = (AnonymousClass3HT) obj;
        return r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A07 == this.A07 && r4.A02 == this.A02 && r4.A03 == this.A03 && r4.A04 == this.A04 && "".equals("") && r4.A0C == this.A0C && r4.A0D == this.A0D && r4.A0E == this.A0E && r4.A0F == this.A0F && r4.A08.equals(this.A08) && C34901l3.A00(r4.A05, this.A05) && C34901l3.A00(r4.A0A, this.A0A) && C34901l3.A00(r4.A06, this.A06) && r4.A0B.equals(this.A0B) && r4.A09.equals(this.A09);
    }

    public int hashCode() {
        int hashCode = (((((((((((217 + this.A00) * 31) + this.A01) * 31) + this.A07.hashCode()) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31;
        C16010sH r0 = this.A05;
        int hashCode2 = (((hashCode + (r0 != null ? r0.hashCode() : 0)) * 31) + this.A0A.hashCode()) * 31 * 31;
        AnonymousClass2Wj r02 = this.A06;
        return ((((((((((((hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + this.A0B.hashCode()) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + this.A08.hashCode();
    }
}
