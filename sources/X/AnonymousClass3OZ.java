package X;

import android.content.Context;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3OZ  reason: invalid class name */
public class AnonymousClass3OZ extends RelativeLayout {
    public WaTextView A00 = C13680ns.A0S(this, R.id.category_thumbnail_text);

    public AnonymousClass3OZ(Context context) {
        super(context);
        C13680ns.A0G(this).inflate(R.layout.layout00fa, this, true);
    }

    public void setText(String str) {
        this.A00.setText(str);
    }
}
