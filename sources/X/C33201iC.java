package X;

import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.1iC  reason: invalid class name and case insensitive filesystem */
public class C33201iC {
    public final int A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final MappedByteBuffer A03;
    public final Charset A04;

    public C33201iC(MappedByteBuffer mappedByteBuffer, List list) {
        int i2;
        this.A03 = mappedByteBuffer;
        int A002 = A00(0);
        int A012 = A01(2);
        byte b2 = mappedByteBuffer.get(6);
        Charset[] charsetArr = C33171i9.A02;
        if (b2 >= charsetArr.length && C33561im.A00.get() != null) {
            Log.e("MMappedStringPack: unrecognized encoding");
        }
        this.A04 = charsetArr[b2];
        this.A00 = A01(7);
        if (!list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            int i3 = 11;
            int i4 = 0;
            for (int i5 = 0; i5 < A002; i5++) {
                MappedByteBuffer mappedByteBuffer2 = this.A03;
                mappedByteBuffer2.position(i3);
                int position = mappedByteBuffer2.position();
                int i6 = 5;
                if (mappedByteBuffer2.get(position + 2) == 0) {
                    i6 = 2;
                } else if (mappedByteBuffer2.get(position + 5) != 0) {
                    i6 = 7;
                }
                byte[] bArr = new byte[i6];
                mappedByteBuffer2.get(bArr, 0, i6);
                int indexOf = list.indexOf(new String(bArr, 0, i6, C33171i9.A01));
                if (indexOf != -1) {
                    i4++;
                    iArr[indexOf] = i3;
                    if (i4 >= list.size()) {
                        break;
                    }
                }
                i3 += 11;
            }
            for (int i7 = 0; i7 < size; i7++) {
                int i8 = iArr[i7];
                if (i8 != 0) {
                    this.A03.position(i8 + 7);
                    int A013 = A01(this.A03.position()) + A012;
                    int A003 = A00(A013);
                    int i9 = A013 + 2;
                    int A004 = A00(i9);
                    int i10 = i9 + 2;
                    for (int i11 = 0; i11 < A003; i11++) {
                        int i12 = i2 + 2;
                        this.A02.append(A00(i2), i12);
                        i10 = i12 + 6;
                    }
                    for (int i13 = 0; i13 < A004; i13++) {
                        int i14 = i2 + 2;
                        this.A01.append(A00(i2), i14);
                        i2 = i14 + 1;
                        for (int i15 = 0; i15 < this.A03.get(i14); i15++) {
                            i2 += 7;
                        }
                    }
                }
            }
        } else if (C33561im.A00.get() != null) {
            Log.e("MMappedStringPack: parentLocales is empty");
        }
    }

    public final int A00(int i2) {
        MappedByteBuffer mappedByteBuffer = this.A03;
        return ((mappedByteBuffer.get(i2 + 1) & 255) << 8) | (mappedByteBuffer.get(i2) & 255);
    }

    public final int A01(int i2) {
        MappedByteBuffer mappedByteBuffer = this.A03;
        return ((mappedByteBuffer.get(i2 + 3) & 255) << 24) | (mappedByteBuffer.get(i2) & 255) | ((mappedByteBuffer.get(i2 + 1) & 255) << 8) | ((mappedByteBuffer.get(i2 + 2) & 255) << 16);
    }

    public synchronized String A02(int i2) {
        String str;
        int i3 = this.A02.get(i2);
        if (i3 == 0) {
            str = null;
        } else {
            MappedByteBuffer mappedByteBuffer = this.A03;
            mappedByteBuffer.position(i3);
            int position = mappedByteBuffer.position();
            int A012 = A01(position);
            int A002 = A00(position + 4);
            byte[] bArr = new byte[A002];
            mappedByteBuffer.position(this.A00 + A012);
            mappedByteBuffer.get(bArr, 0, A002);
            str = new String(bArr, this.A04);
        }
        return str;
    }
}
