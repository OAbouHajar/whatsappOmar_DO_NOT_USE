package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape24S0300000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;

/* renamed from: X.1w0  reason: invalid class name and case insensitive filesystem */
public final class C41481w0 implements C41491w1 {
    public C41521w4 A00;
    public AnonymousClass2U6 A01;
    public C30211bx A02;
    public Runnable A03 = new RunnableRunnableShape15S0100000_I0_14(this, 42);
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final AnonymousClass028 A05;
    public final AnonymousClass027 A06;
    public final AnonymousClass027 A07;
    public final AnonymousClass027 A08;
    public final AnonymousClass023 A09;
    public final AnonymousClass023 A0A;
    public final C16300so A0B;
    public final C14870pt A0C;
    public final C16980tz A0D;
    public final C14710pd A0E;
    public final AnonymousClass1L1 A0F;
    public final C811747d A0G;
    public final AnonymousClass2U2 A0H;
    public final C23231Az A0I;
    public final File A0J;

    public C41481w0(C16300so r11, C14870pt r12, C16980tz r13, C14710pd r14, AnonymousClass1L1 r15, C811747d r16, AnonymousClass2U2 r17, C23231Az r18, File file) {
        AnonymousClass2U2 r3 = r17;
        C18450wi.A0H(r13, 1);
        C18450wi.A0H(r14, 2);
        C18450wi.A0H(r12, 3);
        C18450wi.A0H(r11, 4);
        C23231Az r1 = r18;
        C18450wi.A0H(r1, 6);
        C18450wi.A0H(r15, 7);
        this.A0D = r13;
        this.A0E = r14;
        this.A0C = r12;
        this.A0B = r11;
        this.A0G = r16;
        this.A0I = r1;
        this.A0F = r15;
        this.A0H = r3;
        File file2 = file;
        this.A0J = file2;
        AnonymousClass027 r9 = new AnonymousClass027(0);
        this.A07 = r9;
        AnonymousClass027 r8 = new AnonymousClass027(Integer.valueOf((int) C17970vw.A04(file2)));
        this.A06 = r8;
        AnonymousClass027 r6 = new AnonymousClass027(new AnonymousClass2U5(this));
        this.A08 = r6;
        IDxObserverShape115S0100000_2_I0 iDxObserverShape115S0100000_2_I0 = new IDxObserverShape115S0100000_2_I0((Object) this, 296);
        this.A09 = iDxObserverShape115S0100000_2_I0;
        C811847e r7 = new C811847e();
        AnonymousClass026 r4 = new AnonymousClass026();
        r4.A0D(C05730St.A01(r9), new IDxObserverShape24S0300000_2_I0(r4, r8, r7, 6));
        r4.A0D(C05730St.A01(r8), new IDxObserverShape24S0300000_2_I0(r4, r9, r7, 5));
        this.A05 = r4;
        IDxObserverShape115S0100000_2_I0 iDxObserverShape115S0100000_2_I02 = new IDxObserverShape115S0100000_2_I0((Object) this, 297);
        this.A0A = iDxObserverShape115S0100000_2_I02;
        ((VoiceRecordingView) r3).A0D = this;
        r6.A07(iDxObserverShape115S0100000_2_I0);
        r4.A07(iDxObserverShape115S0100000_2_I02);
    }

    public final int A00() {
        Object A012 = this.A07.A01();
        if (A012 != null) {
            return ((Number) A012).intValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void A01() {
        C30211bx r0 = this.A02;
        if (r0 != null) {
            r0.A04();
        }
        C30211bx r02 = this.A02;
        if (r02 != null) {
            this.A07.A0B(Integer.valueOf(r02.A02()));
        }
        C30211bx r03 = this.A02;
        if (r03 != null) {
            r03.A02();
            Number number = (Number) this.A07.A01();
            if (number != null) {
                this.A0H.setSeekbarContentDescription((long) number.intValue());
            }
        }
        this.A08.A0B(new AnonymousClass2U9(this));
        this.A0I.A00();
    }

    public final void A02() {
        C30211bx r0 = this.A02;
        if (r0 != null) {
            r0.A09();
        }
        C30211bx r02 = this.A02;
        if (r02 != null) {
            r02.A06();
        }
        this.A02 = null;
        this.A08.A0B(new AnonymousClass2U5(this));
        this.A07.A0B(0);
        this.A0I.A00();
    }

    public final void A03(int i2, boolean z2) {
        Number number;
        Number number2 = (Number) this.A06.A01();
        if (number2 != null) {
            int intValue = number2.intValue();
            float f2 = (((float) i2) / 1000.0f) * ((float) intValue);
            if (!Float.isNaN(f2)) {
                int round = Math.round(f2);
                int i3 = (intValue - 50) - 1;
                if (round > i3) {
                    round = i3;
                }
                if (round < 0) {
                    round = 0;
                }
                AnonymousClass027 r1 = this.A07;
                r1.A0B(Integer.valueOf(round));
                if (z2 && (number = (Number) r1.A01()) != null) {
                    this.A0H.setSeekbarContentDescription((long) number.intValue());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
    }
}
