package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3OA  reason: invalid class name */
public class AnonymousClass3OA extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final Context A02;
    public final ViewGroup.MarginLayoutParams A03;
    public final TextView A04;

    public AnonymousClass3OA(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = context;
        FrameLayout.inflate(getContext(), R.layout.layout051d, this);
        this.A04 = C13680ns.A0L(this, R.id.title);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A03 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        setBackgroundResource(R.color.color065f);
    }

    public void A00(String str, boolean z2, int i2) {
        this.A04.setText(str);
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A03;
        marginLayoutParams.bottomMargin = z2 ? 0 : getResources().getDimensionPixelSize(R.dimen.dimen06b3) - C87594Xo.A00(this.A02, (float) i2);
        setLayoutParams(marginLayoutParams);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
