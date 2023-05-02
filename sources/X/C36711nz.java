package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1nz  reason: invalid class name and case insensitive filesystem */
public final class C36711nz extends C28541Wm implements C28561Wp {
    public static final C36711nz A01;
    public static volatile C47872Kz A02;
    public AnonymousClass1XE A00 = AnonymousClass2NE.A01;

    static {
        C36711nz r0 = new C36711nz();
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
