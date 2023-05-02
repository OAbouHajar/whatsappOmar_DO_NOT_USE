package X;

import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.3Tu  reason: invalid class name */
public class AnonymousClass3Tu extends C95784nH {
    public final float A00;
    public final float A01;
    public final /* synthetic */ CreationModeBottomBar A02;

    public AnonymousClass3Tu(CreationModeBottomBar creationModeBottomBar, float f2, float f3) {
        this.A02 = creationModeBottomBar;
        this.A01 = f2;
        this.A00 = f3;
    }

    public double A00(AnonymousClass4X6 r11, float f2, float f3) {
        float f4 = this.A01;
        float f5 = this.A00;
        float min = Math.min(f4, f5);
        float max = Math.max(f4, f5);
        double d2 = (double) min;
        double d3 = (double) f2;
        return d3 + (((r11.A07.A00 - d2) / (((double) max) - d2)) * (((double) f3) - d3));
    }

    public void AXO(AnonymousClass4X6 r6) {
        float f2 = (float) r6.A07.A00;
        CreationModeBottomBar creationModeBottomBar = this.A02;
        creationModeBottomBar.A04.setScaleX(f2);
        creationModeBottomBar.A04.setScaleY(f2);
        creationModeBottomBar.A03(Math.max((int) A00(r6, 0.0f, 76.0f), 0));
    }
}
