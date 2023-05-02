package X;

import android.view.ViewTreeObserver;
import java.io.File;

/* renamed from: X.4ku  reason: invalid class name and case insensitive filesystem */
public class C94434ku implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00 = true;
    public final /* synthetic */ C30211bx A01;
    public final /* synthetic */ AnonymousClass1ZL A02;
    public final /* synthetic */ File A03;

    public C94434ku(C30211bx r2, AnonymousClass1ZL r3, File file) {
        this.A02 = r3;
        this.A03 = file;
        this.A01 = r2;
    }

    public void onGlobalLayout() {
        AnonymousClass1ZL r3 = this.A02;
        double floor = Math.floor((double) (((float) r3.A03.getWidth()) / r3.A03.A0D));
        if (floor != 0.0d || !this.A00) {
            this.A00 = true;
            AnonymousClass3K2.A0z(r3.A0H.A02(), this);
            r3.A0I.Aco(new C63343Hi(this.A01, this, this.A03, floor));
            return;
        }
        this.A00 = false;
    }
}
