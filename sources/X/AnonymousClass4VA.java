package X;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.4VA  reason: invalid class name */
public final class AnonymousClass4VA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C32491gT A07;
    public final C109765Tm[] A08;

    public AnonymousClass4VA(C32491gT r12, C109765Tm[] r13, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        this.A07 = r12;
        this.A01 = i2;
        this.A04 = i3;
        this.A05 = i4;
        int i10 = i5;
        this.A06 = i10;
        int i11 = i6;
        this.A02 = i11;
        int i12 = i7;
        this.A03 = i12;
        this.A08 = r13;
        if (i3 != 0) {
            long j2 = i3 != 1 ? 250000 : 50000000;
            switch (i7) {
                case 5:
                    i9 = 160000;
                    break;
                case 6:
                case 18:
                    i9 = 768000;
                    break;
                case 7:
                    i9 = 192000;
                    break;
                case 8:
                    i9 = 2250000;
                    break;
                case 9:
                    i9 = 40000;
                    break;
                case 10:
                    i9 = 100000;
                    break;
                case 11:
                    i9 = 16000;
                    break;
                case 12:
                    i9 = 7000;
                    break;
                case 14:
                    i9 = 3062500;
                    break;
                case 15:
                    i9 = 8000;
                    break;
                case 16:
                    i9 = 256000;
                    break;
                case 17:
                    i9 = 336000;
                    break;
                default:
                    throw AnonymousClass3K3.A0f();
            }
            i8 = (int) AnonymousClass3K3.A0S(j2, (long) i9);
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
            C90524eJ.A04(AnonymousClass3K2.A1X(minBufferSize, -2));
            long j3 = (long) i10;
            int i13 = this.A05;
            i8 = AnonymousClass3K3.A0C(minBufferSize << 2, Math.max(minBufferSize, ((int) ((750000 * j3) / SearchActionVerificationClientService.MS_TO_NS)) * i13), ((int) ((250000 * j3) / SearchActionVerificationClientService.MS_TO_NS)) * i13);
        }
        this.A00 = i8;
    }

    public final AudioTrack A00(C89164bh r9, int i2, boolean z2) {
        return new AudioTrack(z2 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : r9.A00(), C96334oA.A03(this.A06, this.A02, this.A03), this.A00, 1, i2);
    }

    public final AudioTrack A01(C89164bh r4, int i2, boolean z2) {
        boolean z3 = true;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(z2 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : r4.A00()).setAudioFormat(C96334oA.A03(this.A06, this.A02, this.A03)).setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i2);
        if (this.A04 != 1) {
            z3 = false;
        }
        return sessionId.setOffloadedPlayback(z3).build();
    }
}
