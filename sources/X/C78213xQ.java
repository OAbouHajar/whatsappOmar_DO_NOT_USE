package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

/* renamed from: X.3xQ  reason: invalid class name and case insensitive filesystem */
public abstract class C78213xQ extends AnonymousClass3O7 {
    public ViewGroup A00 = ((ViewGroup) C004601z.A0E(this, R.id.search_message_attachment_container_content));
    public ViewGroup A01 = ((ViewGroup) C004601z.A0E(this, R.id.search_message_attachment_container_icon));

    public C78213xQ(Context context) {
        super(context);
        FrameLayout.inflate(getContext(), R.layout.layout0528, this);
    }

    public abstract View A01();

    public abstract View A02();

    public void A03() {
        View A02 = A02();
        if (A02 != null) {
            this.A01.addView(A02);
        }
        View A012 = A01();
        if (A012 != null) {
            this.A00.addView(A012);
        }
    }
}
