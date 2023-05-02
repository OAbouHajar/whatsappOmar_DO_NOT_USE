package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2MG  reason: invalid class name */
public final class AnonymousClass2MG extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2MG A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public String A03 = "";
    public String A04 = "";
    public boolean A05;

    static {
        AnonymousClass2MG r0 = new AnonymousClass2MG();
        A06 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A04) : 0;
        if ((this.A00 & 2) == 2) {
            A062 += 1 + CodedOutputStream.A06(this.A03);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += CodedOutputStream.A06((String) this.A02.get(i4));
        }
        int size = A062 + i3 + this.A02.size();
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            size += CodedOutputStream.A01(4, this.A01);
        }
        if ((i5 & 8) == 8) {
            size += 2;
        }
        int A002 = size + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A03);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0D(3, (String) this.A02.get(i2));
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A09(4, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0E(5, this.A05);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
