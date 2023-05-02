package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2;

/* renamed from: X.312  reason: invalid class name */
public class AnonymousClass312 extends C602830u {
    public int A00 = 0;
    public ImageView A01;
    public final View.OnClickListener A02 = new ViewOnClickCListenerShape17S0100000_I1_2(this, 23);
    public final Runnable A03 = new RunnableRunnableShape18S0100000_I1_1((Object) this, 8);

    public AnonymousClass312(Context context, AnonymousClass1YG r4, C16730tY r5) {
        super(context, r4, r5);
        A1R();
    }

    public void A0z() {
        AnonymousClass00B.A08("ConversationRowViewOnceMedia/senders can not view their own media");
    }

    public Drawable getPopupDrawable() {
        return this.A19.A05(getResources(), new C434420a(new int[]{129323}), -1);
    }
}
