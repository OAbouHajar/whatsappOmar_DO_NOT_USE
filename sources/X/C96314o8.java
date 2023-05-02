package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape1S0100100_I1;
import com.facebook.redex.RunnableRunnableShape1S0101200_I1;
import com.facebook.redex.RunnableRunnableShape1S0110000_I1;

/* renamed from: X.4o8  reason: invalid class name and case insensitive filesystem */
public final class C96314o8 implements AnonymousClass5TB {
    public final /* synthetic */ AnonymousClass3UK A00;

    public C96314o8(AnonymousClass3UK r1) {
        this.A00 = r1;
    }

    public void AMr(Exception exc) {
        AnonymousClass4TD r2 = this.A00.A0H;
        Handler handler = r2.A00;
        if (handler != null) {
            C13700nu.A0O(handler, r2, exc, 8);
        }
    }

    public /* synthetic */ void AU7() {
    }

    public /* synthetic */ void AU8(long j2) {
    }

    public void AUw(long j2) {
        AnonymousClass4TD r3 = this.A00.A0H;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new RunnableRunnableShape1S0100100_I1(r3, j2, 0));
        }
    }

    public void AUx() {
        this.A00.A0C = true;
    }

    public void AXJ(boolean z2) {
        AnonymousClass4TD r3 = this.A00.A0H;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new RunnableRunnableShape1S0110000_I1(r3, 0, z2));
        }
    }

    public void AZL(int i2, long j2, long j3) {
        AnonymousClass4TD r2 = this.A00.A0H;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new RunnableRunnableShape1S0101200_I1(r2, i2, 0, j2, j3));
        }
    }
}
