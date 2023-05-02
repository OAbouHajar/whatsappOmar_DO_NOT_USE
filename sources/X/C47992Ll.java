package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2Ll  reason: invalid class name and case insensitive filesystem */
public final class C47992Ll extends C28541Wm implements C28561Wp {
    public static final C47992Ll A04;
    public static volatile C47872Kz A05;
    public int A00;
    public C48002Lm A01;
    public C48042Lq A02;
    public C48022Lo A03;

    static {
        C47992Ll r0 = new C47992Ll();
        A04 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C48042Lq r0 = this.A02;
            if (r0 == null) {
                r0 = C48042Lq.A04;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 2);
        }
        if ((this.A00 & 2) == 2) {
            C48022Lo r02 = this.A03;
            if (r02 == null) {
                r02 = C48022Lo.A04;
            }
            i3 += CodedOutputStream.A05(r02, 3);
        }
        if ((this.A00 & 4) == 4) {
            C48002Lm r03 = this.A01;
            if (r03 == null) {
                r03 = C48002Lm.A03;
            }
            i3 += CodedOutputStream.A05(r03, 4);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C48042Lq r0 = this.A02;
            if (r0 == null) {
                r0 = C48042Lq.A04;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 2) == 2) {
            C48022Lo r02 = this.A03;
            if (r02 == null) {
                r02 = C48022Lo.A04;
            }
            codedOutputStream.A0G(r02, 3);
        }
        if ((this.A00 & 4) == 4) {
            C48002Lm r03 = this.A01;
            if (r03 == null) {
                r03 = C48002Lm.A03;
            }
            codedOutputStream.A0G(r03, 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
