package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.4dR  reason: invalid class name and case insensitive filesystem */
public class C90064dR {
    public static final Charset A05 = Charset.forName(DefaultCrypto.UTF_8);
    public final String A00;
    public final ByteBuffer A01;
    public final AtomicReferenceArray A02;
    public final AtomicReferenceArray A03;
    public final AnonymousClass4K1[] A04;

    public C90064dR(String str, ByteBuffer byteBuffer, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2, AnonymousClass4K1[] r5) {
        this.A01 = byteBuffer;
        this.A04 = r5;
        this.A00 = str;
        this.A02 = atomicReferenceArray;
        this.A03 = atomicReferenceArray2;
    }

    public AnonymousClass4RT A00(int i2) {
        AtomicReferenceArray atomicReferenceArray = this.A02;
        AnonymousClass4RT r4 = (AnonymousClass4RT) atomicReferenceArray.get(i2);
        if (r4 == null) {
            int i3 = this.A04[0].A02 + (i2 << 4);
            ByteBuffer byteBuffer = this.A01;
            int i4 = byteBuffer.getInt(i3);
            int i5 = byteBuffer.getInt(i3 + 4);
            short s2 = byteBuffer.getShort(i3 + 8);
            byteBuffer.getShort(i3 + 10);
            r4 = new AnonymousClass4RT(this, i4, i5, s2);
            if (!atomicReferenceArray.compareAndSet(i2, (Object) null, r4)) {
                return (AnonymousClass4RT) atomicReferenceArray.get(i2);
            }
        }
        return r4;
    }

    public Object A01(int i2) {
        AtomicReferenceArray atomicReferenceArray = this.A03;
        Object obj = atomicReferenceArray.get(i2);
        if (obj == null) {
            int i3 = this.A04[1].A02 + (i2 << 4);
            ByteBuffer byteBuffer = this.A01;
            int i4 = byteBuffer.getInt(i3);
            int i5 = byteBuffer.getInt(i3 + 4);
            byteBuffer.getInt(i3 + 8);
            byteBuffer.getInt();
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.position(i4);
            duplicate.limit(i4 + i5);
            byte[] bArr = new byte[duplicate.remaining()];
            duplicate.get(bArr);
            obj = new String(bArr, A05);
            if (!atomicReferenceArray.compareAndSet(i2, (Object) null, obj)) {
                return atomicReferenceArray.get(i2);
            }
        }
        return obj;
    }
}
