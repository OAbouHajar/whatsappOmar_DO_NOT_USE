package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1zC  reason: invalid class name and case insensitive filesystem */
public class C43011zC {
    public static List A07 = new ArrayList();
    public static List A08;
    public static List A09 = new ArrayList();
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = 0;
    public boolean A06;

    static {
        ArrayList arrayList = new ArrayList();
        A08 = arrayList;
        arrayList.add("image/jpg");
        arrayList.add("image/jpeg");
        arrayList.add("image/png");
        A08.add("image/webp");
        A07.add("image/gif");
        A09.add("video/x.looping_mp4");
        A09.add("video/mp4");
    }

    public C43011zC(int i2, int i3, int i4, boolean z2) {
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A06 = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("container: ");
        sb.append(this.A01);
        sb.append(", video: ");
        sb.append(this.A02);
        sb.append(", audio: ");
        sb.append(this.A00);
        sb.append(", problems: ");
        sb.append(this.A06);
        return sb.toString();
    }
}
