package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1XD  reason: invalid class name */
public final class AnonymousClass1XD extends C28541Wm implements C28561Wp {
    public static final AnonymousClass1XD A01;
    public static volatile C47872Kz A02;
    public AnonymousClass1XE A00 = AnonymousClass2NE.A01;

    static {
        AnonymousClass1XD r0 = new AnonymousClass1XD();
        A01 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00.size(); i4++) {
            i3 += CodedOutputStream.A05((AnonymousClass1Wo) this.A00.get(i4), 1);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A00.get(i2), 1);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
