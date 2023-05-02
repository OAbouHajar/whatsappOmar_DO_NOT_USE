package X;

import com.whatsapp.util.Log;

/* renamed from: X.1rQ  reason: invalid class name and case insensitive filesystem */
public class C38791rQ extends C16740tZ {
    public int A00;
    public int A01;

    public C38791rQ(C28381Vw r2, long j2) {
        super(r2, (byte) 12, j2);
    }

    public C38791rQ(C28381Vw r3, byte[] bArr, int i2, long j2) {
        this(r3, j2);
        StringBuilder sb = new StringBuilder("FMessageFuture/futureproof/size=");
        sb.append(Integer.valueOf(bArr.length));
        Log.w(sb.toString());
        A0v(bArr);
        this.A01 = i2;
    }
}
