package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.5yr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119675yr implements View.OnLongClickListener {
    public final /* synthetic */ C111855hW A00;
    public final /* synthetic */ C114175nF A01;

    public /* synthetic */ C119675yr(C111855hW r1, C114175nF r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C114175nF r4 = this.A01;
        C111855hW r3 = this.A00;
        ClipboardManager A0B = r4.A0N.A0B();
        if (A0B == null) {
            r4.A0H.A09(R.string.str19d7, 0);
            return true;
        }
        try {
            C35301lh r0 = r3.A0B.A08;
            CharSequence charSequence = (CharSequence) (r0 == null ? null : r0.A00);
            A0B.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
            r4.A0H.A09(R.string.str1905, 0);
            return true;
        } catch (NullPointerException | SecurityException unused) {
            r4.A0H.A09(R.string.str19d7, 0);
            return true;
        }
    }
}
