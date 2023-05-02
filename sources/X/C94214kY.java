package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4kY  reason: invalid class name and case insensitive filesystem */
public class C94214kY implements View.OnLongClickListener {
    public final C14870pt A00;
    public final AnonymousClass01V A01;
    public final String A02;

    public C94214kY(C14870pt r1, AnonymousClass01V r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public boolean onLongClick(View view) {
        ClipboardManager A0B = this.A01.A0B();
        if (A0B == null) {
            return true;
        }
        try {
            String str = this.A02;
            A0B.setPrimaryClip(ClipData.newPlainText(str, str));
            this.A00.A09(R.string.str127e, 0);
            return true;
        } catch (NullPointerException | SecurityException e2) {
            Log.e("contactinfo/copy", e2);
            this.A00.A09(R.string.str19d7, 0);
            return true;
        }
    }
}
