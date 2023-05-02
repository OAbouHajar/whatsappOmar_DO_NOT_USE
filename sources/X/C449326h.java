package X;

import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;

/* renamed from: X.26h  reason: invalid class name and case insensitive filesystem */
public class C449326h implements C449426i {
    public final /* synthetic */ AnonymousClass26F A00;

    public C449326h(AnonymousClass26F r1) {
        this.A00 = r1;
    }

    public void AP2(VideoPort videoPort) {
        AnonymousClass26F r2 = this.A00;
        AnonymousClass00B.A06(r2.A06);
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A06);
        sb.append("onConnected ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        sb.append(r2.A06);
        Log.i(sb.toString());
        if (r2.A03 == null) {
            videoPort.setCornerRadius((float) r2.A00);
        }
        AnonymousClass5SU r1 = r2.A04;
        if (r1 != null) {
            r1.AXW(r2.A06, videoPort);
        }
    }

    public void APq(VideoPort videoPort) {
        AnonymousClass26F r2 = this.A00;
        AnonymousClass00B.A06(r2.A06);
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A06);
        sb.append("onDisconnecting ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        sb.append(r2.A06);
        Log.i(sb.toString());
        AnonymousClass5SU r1 = r2.A04;
        if (r1 != null) {
            r1.AXy(r2.A06, videoPort);
        }
    }

    public void AUv(VideoPort videoPort) {
        AnonymousClass26F r2 = this.A00;
        AnonymousClass00B.A06(r2.A06);
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A06);
        sb.append("onPortWindowSizeChanged ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        sb.append(r2.A06);
        Log.i(sb.toString());
        AnonymousClass5SU r1 = r2.A04;
        if (r1 != null) {
            r1.AZp(r2.A06, videoPort);
        }
    }

    public void AW2(VideoPort videoPort) {
        AnonymousClass26F r2 = this.A00;
        r2.A07 = true;
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A06);
        sb.append("onRenderStarted ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        sb.append(r2.A06);
        Log.i(sb.toString());
        r2.A0G.post(new RunnableRunnableShape4S0100000_I0_3(this, 49));
    }
}
