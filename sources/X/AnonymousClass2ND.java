package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.2ND  reason: invalid class name */
public final class AnonymousClass2ND extends C28611Wu {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    public AnonymousClass2ND(byte[] bArr, int i2, int i3) {
        super(bArr);
        C28631Ww.A00(i2, i2 + i3, bArr.length);
        this.bytesOffset = i2;
        this.bytesLength = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public Object writeReplace() {
        return new C28611Wu(A04());
    }
}
