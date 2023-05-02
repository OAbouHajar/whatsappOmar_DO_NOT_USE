package X;

import java.util.List;

/* renamed from: X.2GE  reason: invalid class name */
public final class AnonymousClass2GE {
    public C53822gM A00;
    public Integer A01;
    public String A02;
    public final String A03;
    public final List A04;

    public AnonymousClass2GE(C53822gM r1, Integer num, String str, String str2, List list) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A01 = num;
        this.A04 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2GE) {
                AnonymousClass2GE r8 = (AnonymousClass2GE) obj;
                if (AnonymousClass1ZW.A0F(this.A03, r8.A03) && AnonymousClass1ZW.A0F(this.A02, r8.A02) && this.A00.equals(r8.A00)) {
                    Integer num = this.A01;
                    Integer num2 = r8.A01;
                    if (num == null ? num2 == null : num.equals(num2)) {
                        List list = this.A04;
                        int size = list.size();
                        List list2 = r8.A04;
                        if (size == list2.size()) {
                            if (list != list2) {
                                int i2 = 0;
                                while (i2 < list.size()) {
                                    if (list.get(i2).equals(list2.get(i2))) {
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((217 + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31;
        Integer num = this.A01;
        int intValue = ((hashCode + (num == null ? 0 : num.intValue())) * 31) + this.A00.hashCode();
        for (C35701mM r0 : this.A04) {
            intValue = (intValue * 31) + r0.A0D.hashCode();
        }
        return intValue;
    }
}
