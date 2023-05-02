package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import com.facebook.redex.IDxCListenerShape42S0000000_2_I0;
import com.google.android.exoplayer2.Timeline;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import java.io.File;

/* renamed from: X.29D  reason: invalid class name */
public abstract class AnonymousClass29D {
    public C108945Qc A00;
    public C108955Qd A01;
    public C108965Qe A02;
    public C108975Qf A03;
    public C108985Qg A04;

    public static AnonymousClass29D A00(Context context, C14870pt r14, AnonymousClass01V r15, AnonymousClass013 r16, C14710pd r17, C16320sq r18, File file, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z2;
        boolean z6 = z4;
        if (z3) {
            if (!C41971wz.A0B(r17.A06(C16620tM.A02, 2917))) {
                AnonymousClass29C r3 = new AnonymousClass29C(C19980zJ.A00(context), r14, r15, r16, r18, (AnonymousClass4FM) null, (AnonymousClass2PV) null, true, z6);
                r3.A07 = Uri.fromFile(file);
                r3.A0I = z5;
                r3.A0G();
                r3.A0F = true;
                return r3;
            }
        }
        String absolutePath = file.getAbsolutePath();
        return !z4 ? new C79183zL(context, absolutePath, z5) : new C79173zK(context, absolutePath, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = (X.AnonymousClass29C) r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AnonymousClass29C
            if (r0 == 0) goto L_0x0075
            r1 = r9
            X.29C r1 = (X.AnonymousClass29C) r1
            X.2PV r6 = r1.A0D
            if (r6 == 0) goto L_0x0075
            int r0 = r1.A04
            r6.A00 = r0
            int r1 = r1.A02
            boolean r0 = r6 instanceof X.C610537d
            if (r0 == 0) goto L_0x0076
            X.37d r6 = (X.C610537d) r6
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0075
            X.3sU r5 = new X.3sU
            r5.<init>()
            java.lang.Integer r0 = r6.A00
            r5.A03 = r0
            int r0 = r6.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A02 = r0
            X.4Wp r4 = r6.A08
            long r0 = r4.A00
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A07 = r0
            X.4Wp r0 = r6.A07
            long r0 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A06 = r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.A04
            long r2 = r2 - r0
            long r2 = r2 / r7
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A04 = r0
            long r0 = r6.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A05 = r0
            long r2 = r6.A02
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.A00 = r0
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            X.0t9 r0 = r6.A06
            r0.A06(r5)
            r0 = 0
            r6.A01 = r0
            r4.A01()
        L_0x0075:
            return
        L_0x0076:
            X.37e r6 = (X.C610637e) r6
            X.4Wp r2 = r6.A0D
            r2.A00()
            X.4Wp r0 = r6.A0C
            r0.A00()
            X.4Wp r8 = r6.A0B
            r8.A00()
            X.4Wp r7 = r6.A0A
            r7.A00()
            long r0 = (long) r1
            r6.A03 = r0
            X.321 r5 = new X.321
            r5.<init>()
            X.1cs r1 = r6.A04
            if (r1 == 0) goto L_0x00b7
            java.lang.Long r0 = r1.A04()
            r5.A09 = r0
            long r3 = r1.A02()
            double r0 = (double) r3
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.A02 = r0
            X.1cs r0 = r6.A04
            int r0 = r0.A03
            long r0 = (long) r0
            r3 = 1
            long r0 = r0 + r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0A = r0
        L_0x00b7:
            long r3 = r6.A02
            double r0 = (double) r3
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.A01 = r0
            long r0 = r8.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A07 = r0
            long r0 = r7.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0D = r0
            int r0 = r6.A01
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0C = r0
            long r7 = r2.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r5.A08 = r0
            int r3 = r6.A00
            r2 = 1
            if (r3 == 0) goto L_0x0143
            r0 = 2
            if (r3 == r2) goto L_0x013e
            r1 = 3
            if (r3 == r0) goto L_0x00f4
            r0 = 3
            r1 = 4
            if (r3 == r0) goto L_0x00f4
            r0 = 5
            if (r3 != r0) goto L_0x0143
            r1 = 6
        L_0x00f4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x00f8:
            r5.A06 = r0
            long r0 = r6.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0B = r0
            r2 = 0
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x010a
            r0 = 1
        L_0x010a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            int r0 = r6.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A05 = r0
            X.1rK r4 = r6.A0E
            int r0 = r4.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0E = r0
            long r2 = r4.A01
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.A03 = r0
            X.0w2 r0 = r6.A08
            int r0 = X.C18020w1.A02(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A04 = r0
            X.0t9 r0 = r6.A09
            r0.A06(r5)
            return
        L_0x013e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00f8
        L_0x0143:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass29D.A01():void");
    }

    public final void A02(String str, String str2, boolean z2) {
        C108965Qe r0 = this.A02;
        if (r0 != null) {
            r0.AQg(str, str2, z2);
        }
    }

    public int A03() {
        if (this instanceof C610737f) {
            throw new UnsupportedOperationException("not implemented yet");
        }
        AnonymousClass2PR r0 = ((AnonymousClass29C) this).A08;
        if (r0 != null) {
            return (int) r0.ABQ();
        }
        return 0;
    }

    public int A04() {
        if (this instanceof C610737f) {
            return ((C610737f) this).A03.A01.getDuration();
        }
        AnonymousClass2PR r0 = ((AnonymousClass29C) this).A08;
        if (r0 != null) {
            return (int) r0.ABq();
        }
        return 0;
    }

    public Bitmap A05() {
        if (this instanceof C610737f) {
            C610737f r4 = (C610737f) this;
            Drawable current = r4.A01.getCurrent();
            if (current instanceof BitmapDrawable) {
                return ((BitmapDrawable) current).getBitmap();
            }
            Bitmap bitmap = r4.A00;
            if (bitmap == null || bitmap.isRecycled()) {
                r4.A00 = Bitmap.createBitmap(Math.max(current.getIntrinsicWidth(), 1), Math.max(current.getIntrinsicHeight(), 1), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(r4.A00);
            current.draw(canvas);
            current.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            return r4.A00;
        }
        AnonymousClass29C r1 = (AnonymousClass29C) this;
        if (r1.A0M || r1.A08 == null || !r1.A0L) {
            return null;
        }
        return r1.A0Y.getCurrentFrame();
    }

    public View A06() {
        return this instanceof C610737f ? ((C610737f) this).A02 : ((AnonymousClass29C) this).A0Y;
    }

    public void A07() {
        if (this instanceof C610737f) {
            ((C610737f) this).A01.stop();
            return;
        }
        AnonymousClass2PR r1 = ((AnonymousClass29C) this).A08;
        if (r1 != null) {
            r1.AeK(false);
        }
    }

    public void A08() {
        if (this instanceof C610737f) {
            ((C610737f) this).A01.start();
            return;
        }
        AnonymousClass29C r2 = (AnonymousClass29C) this;
        r2.hashCode();
        if (r2.A08 != null) {
            r2.A0J();
            r2.A08.AeK(true);
            return;
        }
        r2.A0O = true;
        r2.A0G();
    }

    public void A09() {
        AudioManager A0G;
        if (this instanceof C610737f) {
            C610737f r1 = (C610737f) this;
            r1.A03.close();
            r1.A01.stop();
            return;
        }
        AnonymousClass29C r3 = (AnonymousClass29C) this;
        r3.hashCode();
        r3.A0N = false;
        r3.A0G = false;
        AnonymousClass2PR r0 = r3.A08;
        if (r0 != null) {
            r3.A0O = r0.AF3();
            r3.A08.AeK(false);
            r3.A0P = false;
            Timeline ABV = r3.A08.ABV();
            if (ABV != null && !ABV.A0C()) {
                int ABW = r3.A08.ABW();
                r3.A01 = ABW;
                C89324by A0A = ABV.A0A(new C89324by(), ABW, 0);
                if (!A0A.A0A) {
                    r3.A0P = true;
                    r3.A05 = A0A.A0D ? r3.A08.ABQ() : -9223372036854775807L;
                }
            }
            r3.A08.A0A(false);
            AnonymousClass2PR r02 = r3.A08;
            r02.A03();
            r02.A02();
            r02.A07((Surface) null, false);
            r02.A05(0, 0);
            r3.A08.Aby(r3.A0S);
            r3.A08.A01();
            r3.A08 = null;
            C108985Qg r03 = r3.A04;
            if (r03 != null) {
                r03.AUt(false, 1);
            }
            C56852oj r04 = r3.A0Y;
            r04.A01 = null;
            AnonymousClass4WY r05 = r04.A03;
            if (r05 != null) {
                r05.A00();
            }
            r3.A09 = null;
            ExoPlaybackControlView exoPlaybackControlView = r3.A0C;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayer((AnonymousClass2PU) null);
                ExoPlaybackControlView exoPlaybackControlView2 = r3.A0C;
                exoPlaybackControlView2.removeCallbacks(exoPlaybackControlView2.A0O);
                exoPlaybackControlView2.removeCallbacks(exoPlaybackControlView2.A0P);
            }
            if (!r3.A0F && (A0G = r3.A0U.A0G()) != null) {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r3.A06;
                if (onAudioFocusChangeListener == null) {
                    onAudioFocusChangeListener = new IDxCListenerShape42S0000000_2_I0(2);
                    r3.A06 = onAudioFocusChangeListener;
                }
                A0G.abandonAudioFocus(onAudioFocusChangeListener);
            }
        }
    }

    public void A0A(int i2) {
        if (this instanceof C610737f) {
            throw new UnsupportedOperationException("not implemented yet");
        }
        AnonymousClass29C r0 = (AnonymousClass29C) this;
        AnonymousClass2PR r2 = r0.A08;
        if (r2 != null) {
            r2.AdF((long) i2);
        } else {
            r0.A03 = i2;
        }
    }

    public void A0B(boolean z2) {
        if (!(this instanceof C610737f)) {
            AnonymousClass29C r0 = (AnonymousClass29C) this;
            r0.A0J = z2;
            AnonymousClass2PR r1 = r0.A08;
            if (r1 != null) {
                float f2 = 1.0f;
                if (z2) {
                    f2 = 0.0f;
                }
                r1.A04(f2);
            }
        }
    }

    public boolean A0C() {
        if (this instanceof C610737f) {
            return ((C610737f) this).A01.isRunning();
        }
        AnonymousClass29C r3 = (AnonymousClass29C) this;
        AnonymousClass2PR r1 = r3.A08;
        if (r1 == null || r3.A0M) {
            return false;
        }
        int AF5 = r1.AF5();
        return (AF5 == 3 || AF5 == 2) && r3.A08.AF3();
    }

    public boolean A0D() {
        if (!(this instanceof C610737f)) {
            return ((AnonymousClass29C) this).A0N;
        }
        throw new UnsupportedOperationException("not implemented yet");
    }

    public boolean A0E() {
        if (this instanceof C610737f) {
            return false;
        }
        return ((AnonymousClass29C) this).A0H;
    }
}
