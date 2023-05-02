package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: X.2Ov  reason: invalid class name and case insensitive filesystem */
public class C48742Ov extends C48752Ow {
    public boolean A00 = false;
    public final AnonymousClass2PD A01;
    public final String A02;

    public C48742Ov(C15860rz r8, AnonymousClass1CI r9, AnonymousClass2I6 r10, AnonymousClass1CK r11, RandomAccessFile randomAccessFile, String str, int i2) {
        super(r10, r11, randomAccessFile, i2, 2);
        this.A01 = new AnonymousClass2PD(r8, r9, r11);
        this.A02 = str;
    }

    public void A01(ByteBuffer byteBuffer, boolean z2) {
        StringBuilder sb;
        String str;
        int i2;
        boolean A022;
        ByteBuffer byteBuffer2 = byteBuffer;
        int limit = byteBuffer2.limit();
        AnonymousClass2PD r8 = this.A01;
        r8.A03 = new byte[10240];
        r8.A00 = 0;
        byteBuffer2.position(0);
        byteBuffer2.position(AnonymousClass2PK.A06.length);
        byte[] bArr = new byte[2048];
        try {
            int position = byteBuffer2.position();
            String str2 = null;
            boolean z3 = false;
            int i3 = 0;
            boolean z4 = false;
            int i4 = 0;
            while (true) {
                if (position < limit) {
                    AnonymousClass056 A06 = AnonymousClass02K.A06(byteBuffer2);
                    int i5 = A06.A01;
                    if (i5 == 0) {
                        if (A06.A00 == 6005) {
                            str2 = (String) A06.A02;
                            int position2 = byteBuffer2.position() - position;
                            byteBuffer2.position(position);
                            byteBuffer2.get(bArr, 0, position2);
                            z3 = r8.A02(bArr, position2, str2);
                        } else {
                            int position3 = byteBuffer2.position() - position;
                            byteBuffer2.position(position);
                            byteBuffer2.get(bArr, 0, position3);
                            for (Map.Entry value : r8.A02.entrySet()) {
                                ((AnonymousClass2PF) value.getValue()).A01(bArr, position3);
                            }
                            if (position3 > 2048) {
                                position3 = 2048;
                            }
                            int i6 = r8.A00;
                            if (position3 > 10240 - i6) {
                                Log.e("privatestatsuploadqueue/writetoCommonAttrBuffer too many common attributes");
                                z3 = false;
                            } else {
                                System.arraycopy(bArr, 0, r8.A03, i6, position3);
                                r8.A00 += position3;
                                z3 = true;
                            }
                        }
                        i3 = position;
                    } else {
                        if (i5 == 1) {
                            i2 = byteBuffer2.position();
                            if ((byteBuffer2.get(position) & 4) != 0) {
                                int i7 = i2 - position;
                                byteBuffer2.position(position);
                                byteBuffer2.get(bArr, 0, i7);
                                A022 = r8.A02(bArr, i7, str2);
                            } else {
                                i4 = position;
                                z4 = true;
                            }
                        } else if (i5 == 2 && (byteBuffer2.get(position) & 4) != 0 && z4) {
                            i2 = byteBuffer2.position();
                            int i8 = i2 - i4;
                            byteBuffer2.position(i4);
                            if (i8 <= 2048) {
                                byteBuffer2.get(bArr, 0, i8);
                                A022 = r8.A02(bArr, i8, str2);
                            } else {
                                byte[] bArr2 = new byte[i8];
                                byteBuffer2.get(bArr2, 0, i8);
                                A022 = r8.A02(bArr2, i8, str2);
                            }
                        }
                        byteBuffer2.position(i2);
                        i3 = i4;
                        z4 = false;
                    }
                    if (!z3) {
                        break;
                    }
                    position = byteBuffer2.position();
                } else if (z3) {
                    r8.A03 = null;
                    r8.A00 = 0;
                    return;
                }
            }
            if (!z2) {
                r8.A03 = null;
                r8.A00 = 0;
            } else {
                C29191aB A002 = A00(1);
                try {
                    int i9 = r8.A00;
                    if (i9 > 0) {
                        A002.A04(r8.A03, i9);
                        r8.A03 = null;
                        r8.A00 = 0;
                    }
                    int limit2 = byteBuffer2.limit() - i3;
                    byteBuffer2.position(i3);
                    if (limit2 <= 2048) {
                        byteBuffer2.get(bArr, 0, limit2);
                        A002.A04(bArr, limit2);
                    } else {
                        byte[] bArr3 = new byte[limit2];
                        byteBuffer2.get(bArr3, 0, limit2);
                        A002.A04(bArr3, limit2);
                    }
                    try {
                        A002.A02();
                        this.A00 = true;
                        return;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("privatestatseventbuffermanager/splitBuffer: ioexception while flushing back buffer");
                        sb2.append(e2.toString());
                        Log.e(sb2.toString());
                        return;
                    }
                } catch (IndexOutOfBoundsException e3) {
                    StringBuilder sb3 = new StringBuilder("privatestatseventbuffermanager/splitBuffer: unexpected runtime exception when writing to back buffer ");
                    sb3.append(e3.toString());
                    Log.e(sb3.toString());
                    try {
                        A002.A01();
                        A002.A02();
                    } catch (Exception e4) {
                        StringBuilder sb4 = new StringBuilder("privatestatseventbuffermanager/splitBuffer see exception when clearing the back buffer ");
                        sb4.append(e4.toString());
                        Log.e(sb4.toString());
                    }
                }
            }
            this.A00 = false;
        } catch (BufferUnderflowException unused) {
            throw new AnonymousClass2PY("Incomplete buffer");
        } catch (AnonymousClass2PY e5) {
            th = e5;
            sb = new StringBuilder();
            str = "privatestatseventbuffermanager/splitbuffer invalid buf content";
            sb.append(str);
            sb.append(th.toString());
            Log.e(sb.toString());
        } catch (Throwable th) {
            th = th;
            sb = new StringBuilder();
            str = "privateStatseventbuffermanager/splitbuffer unexpected errors ";
            sb.append(str);
            sb.append(th.toString());
            Log.e(sb.toString());
        }
    }

    public void AI9() {
        super.AI9();
        this.A01.A00(this.A02);
    }

    public void AIL() {
        super.AIL();
        this.A01.A00(this.A02);
    }
}
