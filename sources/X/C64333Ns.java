package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

/* renamed from: X.3Ns  reason: invalid class name and case insensitive filesystem */
public class C64333Ns extends FrameLayout {
    public AnonymousClass15U A00;
    public final C78203xP A01;

    public C64333Ns(Context context, AnonymousClass15U r5) {
        super(context);
        this.A00 = r5;
        C13680ns.A0G(this).inflate(R.layout.layout0516, this, true);
        C13680ns.A0L(this, R.id.title).setText(R.string.str01ac);
        C78203xP r0 = new C78203xP(context);
        this.A01 = r0;
        ((ViewGroup) C004601z.A0E(this, R.id.chips_container)).addView(r0);
    }
}
