package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1o3  reason: invalid class name and case insensitive filesystem */
public final class C36751o3 extends C28541Wm implements C28561Wp {
    public static final C36751o3 A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public C36761o4 A02;
    public C36761o4 A03;

    static {
        C36751o3 r0 = new C36751o3();
        A04 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A02(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            C36761o4 r0 = this.A02;
            if (r0 == null) {
                r0 = C36761o4.A03;
            }
            i3 += CodedOutputStream.A05(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            C36761o4 r02 = this.A03;
            if (r02 == null) {
                r02 = C36761o4.A03;
            }
            i3 += CodedOutputStream.A05(r02, 3);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C36761o4 r0 = this.A02;
            if (r0 == null) {
                r0 = C36761o4.A03;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            C36761o4 r02 = this.A03;
            if (r02 == null) {
                r02 = C36761o4.A03;
            }
            codedOutputStream.A0G(r02, 3);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
