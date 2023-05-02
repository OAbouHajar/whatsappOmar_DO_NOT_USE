package X;

import java.util.Arrays;

/* renamed from: X.1qz  reason: invalid class name and case insensitive filesystem */
public class C38561qz {
    public final C15830rv A00;
    public final C15830rv A01;
    public final Long[] A02;
    public final String[] A03;

    public C38561qz(C15830rv r1, C15830rv r2, Long[] lArr, String[] strArr) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = lArr;
        this.A03 = strArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("toJid=");
        sb.append(this.A01);
        sb.append("; participant=");
        sb.append(this.A00);
        sb.append("; rowIds=");
        sb.append(Arrays.toString(this.A02));
        sb.append("; ids=");
        sb.append(Arrays.toString(this.A03));
        return sb.toString();
    }
}
