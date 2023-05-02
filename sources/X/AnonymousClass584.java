package X;

import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Callable;

/* renamed from: X.584  reason: invalid class name */
public final /* synthetic */ class AnonymousClass584 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass2Qx A02;

    public /* synthetic */ AnonymousClass584(AnonymousClass2Qx r1, int i2, int i3) {
        this.A02 = r1;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final Object call() {
        int i2;
        AnonymousClass2Qx r1 = this.A02;
        int i3 = this.A00;
        int i4 = this.A01;
        if (!r1.A09()) {
            i2 = -6;
        } else {
            r1.A02(AnonymousClass2Qx.A0J);
            GlVideoRenderer glVideoRenderer = r1.A0C;
            i2 = 0;
            glVideoRenderer.setWindow(0, 0, i3, i4);
        }
        return Integer.valueOf(i2);
    }
}
