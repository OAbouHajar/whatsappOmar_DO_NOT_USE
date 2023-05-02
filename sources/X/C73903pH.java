package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3pH  reason: invalid class name and case insensitive filesystem */
public abstract class C73903pH extends AnonymousClass3O6 {
    public ViewGroup A00 = ((ViewGroup) findViewById(R.id.content));
    public ViewGroup A01 = ((ViewGroup) findViewById(R.id.negative_btn));
    public ViewGroup A02 = ((ViewGroup) findViewById(R.id.positive_btn));
    public TextView A03 = C13680ns.A0M(this, R.id.header);
    public AnonymousClass013 A04;

    public C73903pH(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.layout0160, this);
        C13680ns.A0K(this, R.id.positive_btn_icon).setImageResource(getPositiveButtonIconResId());
        TextView A0M = C13680ns.A0M(this, R.id.positive_btn_text);
        AnonymousClass1UP.A06(A0M);
        A0M.setText(getPositiveButtonTextResId());
        TextView A0M2 = C13680ns.A0M(this, R.id.negative_btn_text);
        AnonymousClass1UP.A06(A0M2);
        A0M2.setText(getNegativeButtonTextResId());
    }

    public abstract int getNegativeButtonTextResId();

    public abstract int getPositiveButtonIconResId();

    public abstract int getPositiveButtonTextResId();
}
