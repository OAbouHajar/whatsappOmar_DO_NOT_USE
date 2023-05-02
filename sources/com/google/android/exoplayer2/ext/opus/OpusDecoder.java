package com.google.android.exoplayer2.ext.opus;

import X.AnonymousClass000;
import X.AnonymousClass3UX;
import X.AnonymousClass3UY;
import X.AnonymousClass43X;
import X.AnonymousClass4OQ;
import X.C13680ns;
import X.C13690nt;
import X.C65313Ug;
import X.C804743z;
import X.C90524eJ;
import X.C96364oD;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import java.util.List;

public final class OpusDecoder extends C96364oD {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpusDecoder(List list, int i2, boolean z2) {
        super(new AnonymousClass3UX[16], new SimpleOutputBuffer[16]);
        int i3;
        boolean z3;
        List list2 = list;
        int size = list2.size();
        byte b2 = 1;
        if (size != 1 && size != 3) {
            throw new AnonymousClass3UY("Invalid initialization data size");
        } else if (size != 3 || (((byte[]) list2.get(1)).length == 8 && ((byte[]) list2.get(2)).length == 8)) {
            if (list2.size() == 3) {
                i3 = C96364oD.A04(list2, 1);
            } else {
                byte[] bArr = (byte[]) C13690nt.A0Z(list2);
                i3 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
            }
            this.A02 = i3;
            this.A03 = list2.size() == 3 ? C96364oD.A04(list2, 2) : 3840;
            byte[] bArr2 = (byte[]) list2.get(0);
            int length = bArr2.length;
            if (length >= 19) {
                byte b3 = bArr2[9] & 255;
                this.A01 = b3;
                if (b3 <= 8) {
                    short s2 = (short) (((bArr2[17] & 255) << 8) | (bArr2[16] & 255));
                    byte[] bArr3 = new byte[8];
                    if (bArr2[18] == 0) {
                        if (b3 <= 2) {
                            z3 = AnonymousClass000.A1R(b3, 2);
                            bArr3[0] = 0;
                            bArr3[1] = 1;
                        } else {
                            throw new AnonymousClass3UY("Invalid header, missing stream map");
                        }
                    } else if (length >= b3 + 21) {
                        b2 = bArr2[19] & 255;
                        z3 = bArr2[20] & true;
                        System.arraycopy(bArr2, 21, bArr3, 0, b3);
                    } else {
                        throw new AnonymousClass3UY("Invalid header length");
                    }
                    long opusInit = opusInit(48000, b3, b2, z3 ? 1 : 0, s2, bArr3);
                    this.A04 = opusInit;
                    if (opusInit != 0) {
                        int i4 = this.A00;
                        C90524eJ.A04(AnonymousClass000.A1R(i4, r2));
                        for (AnonymousClass3UX A012 : this.A0B) {
                            A012.A01(i2);
                        }
                        this.A05 = z2;
                        if (z2) {
                            opusSetFloatOutput();
                            return;
                        }
                        return;
                    }
                    throw new AnonymousClass3UY("Failed to initialize decoder");
                }
                throw new AnonymousClass3UY(C13680ns.A0c(b3, "Invalid channel count: "));
            }
            throw new AnonymousClass3UY("Invalid header length");
        } else {
            throw new AnonymousClass3UY("Invalid pre-skip or seek pre-roll");
        }
    }

    private native void opusClose(long j2);

    private native int opusDecode(long j2, long j3, ByteBuffer byteBuffer, int i2, SimpleOutputBuffer simpleOutputBuffer);

    private native int opusGetErrorCode(long j2);

    private native String opusGetErrorMessage(long j2);

    private native long opusInit(int i2, int i3, int i4, int i5, int i6, byte[] bArr);

    private native void opusReset(long j2);

    private native int opusSecureDecode(long j2, long j3, ByteBuffer byteBuffer, int i2, SimpleOutputBuffer simpleOutputBuffer, int i3, ExoMediaCrypto exoMediaCrypto, int i4, byte[] bArr, byte[] bArr2, int i5, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput();

    public /* bridge */ /* synthetic */ C804743z A05(AnonymousClass3UX r24, C65313Ug r25, boolean z2) {
        SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) r25;
        AnonymousClass3UX r3 = r24;
        if (z2) {
            opusReset(this.A04);
            this.A00 = r3.A00 == 0 ? this.A02 : this.A03;
        }
        ByteBuffer byteBuffer = r3.A01;
        AnonymousClass4OQ r6 = r3.A05;
        boolean A1R = AnonymousClass000.A1R(r3.flags & 1073741824, 1073741824);
        long j2 = this.A04;
        long j3 = r3.A00;
        int limit = byteBuffer.limit();
        int opusSecureDecode = A1R ? opusSecureDecode(j2, j3, byteBuffer, limit, simpleOutputBuffer, 48000, (ExoMediaCrypto) null, r6.A00, r6.A03, r6.A02, r6.A01, r6.A04, r6.A05) : opusDecode(j2, j3, byteBuffer, limit, simpleOutputBuffer);
        if (opusSecureDecode >= 0) {
            ByteBuffer byteBuffer2 = simpleOutputBuffer.data;
            byteBuffer2.position(0);
            byteBuffer2.limit(opusSecureDecode);
            int i2 = this.A00;
            if (i2 <= 0) {
                return null;
            }
            int i3 = this.A01 << 1;
            int i4 = i2 * i3;
            if (opusSecureDecode <= i4) {
                this.A00 = i2 - (opusSecureDecode / i3);
                simpleOutputBuffer.addFlag(Integer.MIN_VALUE);
                byteBuffer2.position(opusSecureDecode);
                return null;
            }
            this.A00 = 0;
            byteBuffer2.position(i4);
            return null;
        } else if (opusSecureDecode == -2) {
            String A0h = AnonymousClass000.A0h(opusGetErrorMessage(j2), AnonymousClass000.A0r("Drm error: "));
            return new AnonymousClass3UY(A0h, new AnonymousClass43X(opusGetErrorCode(j2), A0h));
        } else {
            return new AnonymousClass3UY(AnonymousClass000.A0h(opusGetErrorMessage((long) opusSecureDecode), AnonymousClass000.A0r("Decode error: ")));
        }
    }

    public String getName() {
        return AnonymousClass000.A0h(OpusLibrary.opusGetVersion(), AnonymousClass000.A0r("libopus"));
    }

    public void release() {
        super.release();
        opusClose(this.A04);
    }
}
