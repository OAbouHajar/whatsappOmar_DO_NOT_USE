package X;

import android.view.View;
import com.obwhatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.Set;

/* renamed from: X.4kB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94014kB implements View.OnClickListener {
    public final /* synthetic */ C30581cc A00;
    public final /* synthetic */ AnonymousClass34C A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Set A03;

    public /* synthetic */ C94014kB(C30581cc r1, AnonymousClass34C r2, String str, Set set) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = set;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        ((C14550pN) C19980zJ.A02(this.A01)).Afc(SuspiciousLinkWarningDialogFragment.A01(this.A02, this.A00.A11.A01, this.A03));
    }
}
