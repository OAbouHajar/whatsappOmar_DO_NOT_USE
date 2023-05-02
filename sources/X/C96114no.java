package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import java.io.File;

/* renamed from: X.4no  reason: invalid class name and case insensitive filesystem */
public class C96114no implements C15240qY {
    public final C15250qZ A00;
    public final C15340qi A01;

    public C96114no(C15340qi r2) {
        this.A01 = r2;
        this.A00 = ((C27311Rg) r2).AGI("version");
    }

    public /* bridge */ /* synthetic */ void AUR(C29711b4 r3, C15270qb r4, File file) {
        ((C27301Rf) this.A01).AC5(C47742Kf.CONCURRENT).execute(new RunnableRunnableShape12S0200000_I1(this, file));
    }
}
