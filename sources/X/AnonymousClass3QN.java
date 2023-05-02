package X;

import java.util.List;

/* renamed from: X.3QN  reason: invalid class name */
public class AnonymousClass3QN extends AnonymousClass07A {
    public final List A00;
    public final List A01;

    public AnonymousClass3QN(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i2, int i3) {
        C108505Og r3 = (C108505Og) this.A01.get(i2);
        C108505Og r2 = (C108505Og) this.A00.get(i3);
        int type = r3.getType();
        if (type != r2.getType()) {
            return false;
        }
        if (type == 0) {
            return ((C100414vb) r3).A00.equals(((C100414vb) r2).A00);
        }
        if (type == 1) {
            return ((C100404va) r3).A00.equals(((C100404va) r2).A00);
        }
        return true;
    }

    public boolean A04(int i2, int i3) {
        String str;
        String str2;
        C108505Og r3 = (C108505Og) this.A01.get(i2);
        C108505Og r2 = (C108505Og) this.A00.get(i3);
        int type = r3.getType();
        if (type != r2.getType()) {
            return false;
        }
        if (type == 0) {
            str = ((C100414vb) r3).A00.A0D;
            str2 = ((C100414vb) r2).A00.A0D;
        } else if (type != 1) {
            return true;
        } else {
            str = ((C100404va) r3).A00;
            str2 = ((C100404va) r2).A00;
        }
        return str.equals(str2);
    }
}
