package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3RU  reason: invalid class name */
public class AnonymousClass3RU extends C005602k {
    public AnonymousClass3RU(View view, C17110uY r6, Runnable runnable) {
        super(view);
        TextView A0L = C13680ns.A0L(view, R.id.e2ee_main_text);
        A0L.setText(r6.A07(runnable, view.getContext().getString(R.string.str1279), "%s", R.color.color0659));
        A0L.setMovementMethod(new AnonymousClass3MF());
    }
}
