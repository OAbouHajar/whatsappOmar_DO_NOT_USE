package X;

/* renamed from: X.238  reason: invalid class name */
public final class AnonymousClass238 {
    public String A00;
    public String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass238(String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A04 = str5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass238) {
                AnonymousClass238 r5 = (AnonymousClass238) obj;
                if (!C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31;
        String str = this.A02;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A01;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtensionIdLinks(flowId=");
        sb.append(this.A03);
        sb.append(", flowMessageVersion=");
        sb.append(this.A00);
        sb.append(", dataApiVersion=");
        sb.append(this.A02);
        sb.append(", state=");
        sb.append(this.A01);
        sb.append(", flowVersionIds=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }
}
