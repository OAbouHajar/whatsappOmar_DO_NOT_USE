package X;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;

/* renamed from: X.3Uy  reason: invalid class name and case insensitive filesystem */
public class C65483Uy extends AnonymousClass3UH implements AnonymousClass5SP {
    public int A00;
    public long A01;
    public C32491gT A02;
    public AnonymousClass5LA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final AnonymousClass4TD A09;
    public final AnonymousClass5TO A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65483Uy(Context context, Handler handler, C90094dU r7, AnonymousClass5TI r8, C109725Ti r9, C109765Tm... r10) {
        super(AnonymousClass5TR.A00, r9, 44100.0f, 1);
        C96334oA r3 = new C96334oA(r7, new C96354oC(r10));
        this.A08 = context.getApplicationContext();
        this.A0A = r3;
        this.A09 = new AnonymousClass4TD(handler, r8);
        r3.A0G = new C96324o9(this);
    }

    public C65483Uy(Context context, Handler handler, AnonymousClass5TI r6, AnonymousClass5TO r7, C109725Ti r8) {
        super(AnonymousClass5TR.A00, r8, 44100.0f, 1);
        this.A08 = context.getApplicationContext();
        this.A0A = r7;
        this.A09 = new AnonymousClass4TD(handler, r6);
        ((C96334oA) r7).A0G = new C96324o9(this);
    }

    public void A07() {
        try {
            super.A07();
        } finally {
            if (this.A06) {
                this.A06 = false;
                this.A0A.reset();
            }
        }
    }

    public void A08() {
        this.A06 = true;
        try {
            this.A0A.flush();
            super.A08();
        } catch (Throwable th) {
            super.A08();
            throw th;
        } finally {
            this.A09.A00(this.A0K);
        }
    }

    public void A09(long j2, boolean z2) {
        super.A09(j2, z2);
        this.A0A.flush();
        this.A01 = j2;
        this.A04 = true;
        this.A05 = true;
    }

    public void A0A(boolean z2, boolean z3) {
        super.A0A(z2, z3);
        AnonymousClass4TD r3 = this.A09;
        C85484Oq r2 = this.A0K;
        Handler handler = r3.A00;
        if (handler != null) {
            C13700nu.A0O(handler, r3, r2, 7);
        }
        boolean z4 = this.A04.A00;
        C96334oA r32 = (C96334oA) this.A0A;
        if (z4) {
            C90524eJ.A04(AnonymousClass3K3.A1P(AnonymousClass3C1.A01, 21));
            C90524eJ.A04(r32.A0Q);
            if (!r32.A0X) {
                r32.A0X = true;
            } else {
                return;
            }
        } else if (r32.A0X) {
            r32.A0X = false;
        } else {
            return;
        }
        r32.flush();
    }

    public C86944Ut A0C(AnonymousClass4G5 r7) {
        C86944Ut A0C = super.A0C(r7);
        AnonymousClass4TD r4 = this.A09;
        C32491gT r3 = r7.A00;
        Handler handler = r4.A00;
        if (handler != null) {
            handler.post(new RunnableRunnableShape3S0300000_I1(r4, r3, A0C, 1));
        }
        return A0C;
    }

    public final int A0W(C32491gT r3, C90714eg r4) {
        int i2;
        UiModeManager uiModeManager;
        if (!"OMX.google.raw.decoder".equals(r4.A03) || (i2 = AnonymousClass3C1.A01) >= 24 || (i2 == 23 && (uiModeManager = (UiModeManager) this.A08.getApplicationContext().getSystemService("uimode")) != null && uiModeManager.getCurrentModeType() == 4)) {
            return r3.A0A;
        }
        return -1;
    }

    public final void A0X() {
        long ABR = this.A0A.ABR(AIm());
        if (ABR != Long.MIN_VALUE) {
            if (!this.A05) {
                ABR = Math.max(this.A01, ABR);
            }
            this.A01 = ABR;
            this.A05 = false;
        }
    }

    public C89214bm AF4() {
        return ((C96334oA) this.A0A).A08().A02;
    }

    public long AFA() {
        if (this.A01 == 2) {
            A0X();
        }
        return this.A01;
    }

    public boolean AJY() {
        return this.A0A.AHd() || super.AJY();
    }

    public void AeL(C89214bm r2) {
        this.A0A.AeL(r2);
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }
}
