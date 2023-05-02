package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1oq  reason: invalid class name and case insensitive filesystem */
public final class C37241oq extends C28541Wm implements C28561Wp {
    public static final C37241oq A01;
    public static volatile C47872Kz A02;
    public AnonymousClass1XE A00 = AnonymousClass2NE.A01;

    static {
        C37241oq r0 = new C37241oq();
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
            i3 += CodedOutputStream.A06((String) this.A00.get(i4));
        }
        int size = 0 + i3 + this.A00.size() + this.unknownFields.A00();
        this.A00 = size;
        return size;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            codedOutputStream.A0D(1, (String) this.A00.get(i2));
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
