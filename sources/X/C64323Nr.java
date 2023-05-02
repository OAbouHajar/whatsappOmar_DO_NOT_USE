package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3Nr  reason: invalid class name and case insensitive filesystem */
public class C64323Nr extends FrameLayout {
    public final ViewGroup.MarginLayoutParams A00;
    public final TextView A01 = C13680ns.A0L(this, R.id.title);

    public C64323Nr(Context context) {
        super(context);
        FrameLayout.inflate(getContext(), R.layout.layout0114, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A00 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
    }
}
