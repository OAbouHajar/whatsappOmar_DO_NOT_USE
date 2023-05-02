package X;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickCListenerShape2S0500000_I1;
import com.obwhatsapp.R;

/* renamed from: X.3RZ  reason: invalid class name */
public class AnonymousClass3RZ extends C005602k {
    public AnonymousClass3RZ(Activity activity, View view, AnonymousClass1L3 r15, AnonymousClass1L4 r16, C17750va r17, C218115n r18, C17800vf r19) {
        super(view);
        View view2 = this.A0H;
        AnonymousClass1UP.A06(C13680ns.A0L(view2, R.id.community_subject));
        ImageView A0J = C13680ns.A0J(view2, R.id.community_icon);
        C49752Vp r3 = C49752Vp.A00;
        C218115n r6 = r18;
        A0J.setImageDrawable(r6.A00(activity.getTheme(), activity.getResources(), r3, R.drawable.avatar_parent_large));
        C004601z.A0E(view2, R.id.community_mark).setVisibility(0);
        view.setOnClickListener(new ViewOnClickCListenerShape2S0500000_I1(activity, r15, r16, r17, r19));
    }
}
