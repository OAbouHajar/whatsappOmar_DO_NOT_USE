package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.obwhatsapp.WaTextView;

/* renamed from: X.4jt  reason: invalid class name and case insensitive filesystem */
public class C93864jt implements LayoutInflater.Factory2 {
    public final C004301w A00;

    public C93864jt(C004301w r1) {
        this.A00 = r1;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return "TextView".equals(str) ? new WaTextView(context, attributeSet) : this.A00.A04((View) null, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
