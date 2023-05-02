package X;

import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.3yH  reason: invalid class name and case insensitive filesystem */
public class C78553yH extends AnonymousClass3Tu {
    public final /* synthetic */ CreationModeBottomBar A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78553yH(CreationModeBottomBar creationModeBottomBar) {
        super(creationModeBottomBar, 2.0f, 0.0f);
        this.A00 = creationModeBottomBar;
    }

    public void AXO(AnonymousClass4X6 r8) {
        super.AXO(r8);
        CreationModeBottomBar creationModeBottomBar = this.A00;
        creationModeBottomBar.A04.setAlpha((float) A00(r8, 0.0f, 1.0f));
        float A002 = (float) A00(r8, 1.0f, 0.0f);
        creationModeBottomBar.A05.setScaleX(A002);
        creationModeBottomBar.A05.setScaleY(A002);
        if (r8.A07.A00 >= ((double) this.A00)) {
            creationModeBottomBar.A04.setVisibility(4);
        }
    }
}
