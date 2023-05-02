package X;

import java.util.List;

/* renamed from: X.1zK  reason: invalid class name and case insensitive filesystem */
public class C43091zK {
    public final /* synthetic */ C43081zJ A00;

    public C43091zK(C43081zJ r1) {
        this.A00 = r1;
    }

    public byte[] A00() {
        C43081zJ r2 = this.A00;
        AnonymousClass00B.A0G(r2.A02);
        List<Object> list = r2.A07;
        if (list.size() == 0) {
            return null;
        }
        int size = list.size();
        int i2 = r2.A03;
        byte[] bArr = new byte[(size * i2)];
        int i3 = 0;
        for (Object arraycopy : list) {
            System.arraycopy(arraycopy, 0, bArr, i3, i2);
            i3 += i2;
        }
        return bArr;
    }
}
