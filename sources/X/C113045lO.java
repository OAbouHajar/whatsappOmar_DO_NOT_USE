package X;

import android.content.Context;
import android.widget.Button;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.5lO  reason: invalid class name and case insensitive filesystem */
public class C113045lO extends C1205662d {
    public C113045lO(C16000sG r1, C16080sP r2, C17200uh r3, String str, boolean z2) {
        super(r1, r2, r3, str, z2);
    }

    public void A00(Context context, List list) {
        Button button;
        int i2;
        super.A00(context, list);
        String str = this.A0E;
        if ("chat".equals(str) || "payment_composer_icon".equals(str)) {
            this.A05.setText(R.string.str14f5);
            button = this.A05;
            i2 = 0;
        } else {
            button = this.A05;
            i2 = 8;
        }
        button.setVisibility(i2);
    }
}
