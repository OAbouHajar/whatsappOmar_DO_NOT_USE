package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.Set;

/* renamed from: X.3gr  reason: invalid class name and case insensitive filesystem */
public class C70463gr extends C59142uk {
    public final C16740tZ A00;
    public final Set A01;

    public C70463gr(Context context, C17100uX r8, C14870pt r9, AnonymousClass01V r10, C16740tZ r11, String str, Set set) {
        super(context, r8, r9, r10, str);
        this.A01 = set;
        this.A00 = r11;
    }

    public void onClick(View view) {
        Set set = this.A01;
        if (set != null) {
            ((C14550pN) C19980zJ.A02(view)).Afc(SuspiciousLinkWarningDialogFragment.A01(this.A09, this.A00.A11.A01, set));
            return;
        }
        super.onClick(view);
    }
}
