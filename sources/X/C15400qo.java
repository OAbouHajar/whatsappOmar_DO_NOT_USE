package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import java.io.File;

/* renamed from: X.0qo  reason: invalid class name and case insensitive filesystem */
public class C15400qo implements C15240qY {
    public final C15250qZ A00;
    public final C15340qi A01;

    public C15400qo(C15340qi r2) {
        this.A01 = r2;
        this.A00 = ((C27311Rg) r2).AGI("stale_removal");
    }

    public /* bridge */ /* synthetic */ void AUR(C29711b4 r8, C15270qb r9, File file) {
        ((C27301Rf) this.A01).AC5(C47742Kf.CONCURRENT).execute(new RunnableRunnableShape0S0400000_I0(this, r8, r9, file, 2));
    }
}
