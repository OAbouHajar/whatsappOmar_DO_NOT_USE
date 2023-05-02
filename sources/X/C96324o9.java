package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape1S0100100_I1;
import com.facebook.redex.RunnableRunnableShape1S0101200_I1;
import com.facebook.redex.RunnableRunnableShape1S0110000_I1;

/* renamed from: X.4o9  reason: invalid class name and case insensitive filesystem */
public final class C96324o9 implements AnonymousClass5TB {
    public final /* synthetic */ C65483Uy A00;

    public C96324o9(C65483Uy r1) {
        this.A00 = r1;
    }

    public void AMr(Exception exc) {
        AnonymousClass4TD r2 = this.A00.A09;
        Handler handler = r2.A00;
        if (handler != null) {
            C13700nu.A0O(handler, r2, exc, 8);
        }
    }

    public void AU7() {
        AnonymousClass5LA r0 = this.A00.A03;
        if (r0 != null) {
            ((C97684qO) ((C96234o0) r0).A00.A0Y).A00.sendEmptyMessage(2);
        }
    }

    public void AU8(long j2) {
        AnonymousClass5LA r3 = this.A00.A03;
        if (r3 != null) {
            C96234o0 r32 = (C96234o0) r3;
            if (j2 >= 2000) {
                r32.A00.A0G = true;
            }
        }
    }

    public void AUw(long j2) {
        AnonymousClass4TD r3 = this.A00.A09;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new RunnableRunnableShape1S0100100_I1(r3, j2, 0));
        }
    }

    public void AUx() {
        this.A00.A05 = true;
    }

    public void AXJ(boolean z2) {
        AnonymousClass4TD r3 = this.A00.A09;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new RunnableRunnableShape1S0110000_I1(r3, 0, z2));
        }
    }

    public void AZL(int i2, long j2, long j3) {
        AnonymousClass4TD r2 = this.A00.A09;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new RunnableRunnableShape1S0101200_I1(r2, i2, 0, j2, j3));
        }
    }
}
