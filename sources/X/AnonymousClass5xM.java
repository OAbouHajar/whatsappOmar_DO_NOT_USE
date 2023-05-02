package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.5xM  reason: invalid class name */
public class AnonymousClass5xM {
    public Image A00;
    public ImageReader A01;
    public AnonymousClass5zJ A02;
    public C111185fT A03;
    public C119355wx A04;
    public boolean A05;
    public final ImageReader.OnImageAvailableListener A06 = new AnonymousClass5yQ(this);
    public final C117845te A07 = new C117845te(this);
    public final C118855vM A08 = new C118855vM();
    public final C118895va A09 = new C118895va();
    public final Callable A0A = new IDxCallableShape150S0100000_3_I1(this, 14);

    public static /* synthetic */ void A02(AnonymousClass5xM r14) {
        C111185fT r1;
        C119155wd A002;
        C119355wx r0 = r14.A04;
        if (r0 == null) {
            return;
        }
        if (!r0.A09()) {
            throw new AnonymousClass67O("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        } else if (r14.A00 != null && r14.A03 != null) {
            C118855vM r4 = r14.A08;
            if (!r4.A00.isEmpty()) {
                AnonymousClass5zJ r3 = r14.A02;
                if (r3 == null || (r1 = r14.A03) == null || !AnonymousClass000.A1X(r1.A05(AnonymousClass5wI.A0R))) {
                    C118895va r5 = r14.A09;
                    r5.A02(r14.A00, r14.A05, false);
                    List list = r4.A00;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((AnonymousClass688) list.get(i2)).AVF(r5);
                    }
                } else {
                    long timestamp = r14.A00.getTimestamp();
                    C118665v3 r02 = r3.A05;
                    if (r02 != null && (A002 = r02.A00(timestamp)) != null) {
                        try {
                            C118895va r52 = r14.A09;
                            Image image = r14.A00;
                            boolean z2 = r14.A05;
                            Pair pair = (Pair) A002.A00(C119155wd.A0N);
                            Long l2 = (Long) A002.A00(C119155wd.A0O);
                            r52.A01(image, pair, (Float) A002.A00(C119155wd.A0M), l2, (Long) A002.A00(C119155wd.A0K), (float[]) A002.A00(C119155wd.A0Q), z2, false);
                            List list2 = r4.A00;
                            int size2 = list2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                ((AnonymousClass688) list2.get(i3)).AVF(r52);
                            }
                        } catch (RuntimeException unused) {
                        }
                    } else {
                        return;
                    }
                }
                C118895va r42 = r14.A09;
                if (r42.A0C != null) {
                    int i4 = 0;
                    while (true) {
                        C118125uB[] r12 = r42.A0C;
                        if (i4 >= r12.length) {
                            break;
                        }
                        C118125uB r13 = r12[i4];
                        ByteBuffer byteBuffer = r13.A02;
                        if (byteBuffer != null) {
                            byteBuffer.clear();
                            r13.A02 = null;
                        }
                        i4++;
                    }
                    r42.A0C = null;
                }
                r42.A0A = null;
                r42.A0B = null;
                r42.A05 = null;
                r42.A08 = null;
                r42.A06 = null;
                r42.A07 = null;
                r14.A00.close();
                r14.A00 = null;
            }
        }
    }

    public Surface A03() {
        ImageReader imageReader = this.A01;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        throw AnonymousClass000.A0V("Getting image reader surface without initialize.");
    }

    public void A04() {
        ImageReader imageReader = this.A01;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A01.close();
            this.A01 = null;
        }
        Image image = this.A00;
        if (image != null) {
            image.close();
            this.A00 = null;
        }
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public void A05(C1223469f r15, C111185fT r16, AnonymousClass5wJ r17, AnonymousClass5vQ r18, C119355wx r19) {
        int i2;
        AnonymousClass5vQ r8 = r18;
        this.A04 = r19;
        AnonymousClass5wJ r1 = r17;
        this.A05 = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0N, r1);
        C111185fT r2 = r16;
        this.A03 = r2;
        int A022 = AnonymousClass5wI.A02(AnonymousClass5wI.A0i, r2);
        if (AnonymousClass000.A1X(r15.A9Z(C1223469f.A0B))) {
            List A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0h, r1);
            int i3 = r8.A02;
            int i4 = r8.A01;
            int i5 = i3 * i4;
            int size = A012.size();
            for (int i6 = 0; i6 < size; i6++) {
                AnonymousClass5vQ r22 = (AnonymousClass5vQ) A012.get(i6);
                int i7 = r22.A02;
                int i8 = r22.A01;
                if (Math.abs((((float) Math.max(i7, i8)) / ((float) Math.min(i7, i8))) - (((float) Math.max(i3, i4)) / ((float) Math.min(i3, i4)))) <= 1.0E-4f && (i2 = r22.A02 * r22.A01) < i5 && i2 >= 180000) {
                    r8 = r22;
                    i5 = i2;
                }
            }
        }
        ImageReader newInstance = ImageReader.newInstance(r8.A02, r8.A01, A022, 1);
        this.A01 = newInstance;
        newInstance.setOnImageAvailableListener(this.A06, (Handler) null);
    }
}
