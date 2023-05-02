package X;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.1zJ  reason: invalid class name and case insensitive filesystem */
public abstract class C43081zJ extends FilterInputStream {
    public int A00 = 0;
    public Mac A01;
    public boolean A02 = false;
    public final int A03 = 10;
    public final C43091zK A04;
    public final AnonymousClass4KW A05 = new AnonymousClass4KW();
    public final C43061zH A06;
    public final List A07;
    public final byte[] A08;

    public C43081zJ(C43061zH r3, InputStream inputStream) {
        super(inputStream);
        this.A06 = r3;
        this.A07 = new ArrayList();
        this.A01 = C61873At.A02(r3.A01, r3.A02);
        this.A08 = new byte[8192];
        this.A04 = new C43091zK(this);
    }

    public int A00() {
        return ((C43071zI) this).A00;
    }

    public void A01() {
    }

    public boolean A02() {
        return false;
    }

    public final byte[] A03(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[16];
        if (i2 < 16) {
            AnonymousClass4KW r5 = this.A05;
            int i3 = 16 - i2;
            boolean z2 = false;
            if (i3 <= r5.A00) {
                z2 = true;
            }
            AnonymousClass00B.A0G(z2);
            byte[] bArr3 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = (r5.A01 - i3) + i4;
                if (i5 < 0) {
                    i5 += 16;
                }
                bArr3[i4] = r5.A02[i5];
            }
            System.arraycopy(bArr3, 0, bArr2, 0, i3);
            System.arraycopy(bArr, 0, bArr2, i3, i2);
            return bArr2;
        }
        System.arraycopy(bArr, i2 - 16, bArr2, 0, 16);
        return bArr2;
    }

    public void close() {
        super.close();
        if (this.A00 > 0) {
            byte[] doFinal = this.A01.doFinal();
            int i2 = this.A03;
            byte[] bArr = new byte[i2];
            System.arraycopy(doFinal, 0, bArr, 0, i2);
            this.A07.add(bArr);
        }
        this.A02 = true;
    }

    public int read() {
        int read;
        byte[] bArr = new byte[1];
        do {
            read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return bArr[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = super.read(bArr, i2, i3);
        if (read > 0) {
            if (A02()) {
                this.A00 += read;
                this.A01.update(bArr, 0, read);
            } else {
                int A002 = A00();
                int i4 = this.A00;
                int i5 = i4 + read;
                if (i5 <= A002) {
                    this.A00 = i5;
                    this.A01.update(bArr, 0, read);
                    if (this.A00 == A002) {
                        this.A00 = 0;
                        byte[] doFinal = this.A01.doFinal();
                        int i6 = this.A03;
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(doFinal, 0, bArr2, 0, i6);
                        this.A07.add(bArr2);
                        this.A01 = C61873At.A02(A03(bArr, read), this.A06.A02);
                        A01();
                    }
                } else if (i5 > A002) {
                    this.A01.update(bArr, 0, A002 - i4);
                    byte[] doFinal2 = this.A01.doFinal();
                    int i7 = this.A03;
                    byte[] bArr3 = new byte[i7];
                    System.arraycopy(doFinal2, 0, bArr3, 0, i7);
                    List list = this.A07;
                    list.add(bArr3);
                    byte[] A032 = A03(bArr, A002 - this.A00);
                    byte[] bArr4 = this.A06.A02;
                    this.A01 = C61873At.A02(A032, bArr4);
                    int i8 = this.A00;
                    int i9 = (i8 + read) - A002;
                    int i10 = A002 - i8;
                    this.A00 = 0;
                    while (true) {
                        A01();
                        if (i9 <= 0) {
                            break;
                        }
                        int A003 = A00();
                        if (A02() || i9 < A003) {
                            this.A01.update(bArr, i10, i9);
                            this.A00 = i9;
                        } else {
                            this.A01.update(bArr, i10, A003);
                            byte[] bArr5 = new byte[i7];
                            System.arraycopy(this.A01.doFinal(), 0, bArr5, 0, i7);
                            list.add(bArr5);
                            i10 += A003;
                            this.A01 = C61873At.A02(A03(bArr, i10), bArr4);
                            i9 -= A003;
                        }
                    }
                    this.A01.update(bArr, i10, i9);
                    this.A00 = i9;
                }
            }
            for (int max = Math.max(0, read - 16); max < read; max++) {
                AnonymousClass4KW r4 = this.A05;
                byte b2 = bArr[max];
                int i11 = r4.A01;
                if (i11 >= 16) {
                    r4.A01 = 0;
                    i11 = 0;
                }
                r4.A02[i11] = b2;
                r4.A01 = i11 + 1;
                int i12 = r4.A00;
                if (i12 < 16) {
                    r4.A00 = i12 + 1;
                }
            }
        }
        return read;
    }

    public long skip(long j2) {
        byte[] bArr = this.A08;
        return (long) read(bArr, 0, (int) Math.min((long) bArr.length, j2));
    }
}
