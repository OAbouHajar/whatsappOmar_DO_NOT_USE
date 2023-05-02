package X;

import java.util.LinkedList;

/* renamed from: X.2QQ  reason: invalid class name */
public class AnonymousClass2QQ extends LinkedList<byte[]> {
    public int byteSize = 0;

    /* renamed from: A00 */
    public boolean add(byte[] bArr) {
        super.addFirst(bArr);
        int length = this.byteSize + bArr.length + 1;
        while (true) {
            this.byteSize = length;
            if (((long) length) <= 256) {
                return true;
            }
            length = this.byteSize - (((byte[]) super.removeLast()).length + 1);
        }
    }
}
