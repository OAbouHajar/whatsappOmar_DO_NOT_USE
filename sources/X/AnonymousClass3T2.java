package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.components.SelectionCheckView;

/* renamed from: X.3T2  reason: invalid class name */
public class AnonymousClass3T2 extends C005602k implements View.OnClickListener {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ C30151bp A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3T2(View view, C30151bp r3) {
        super(view);
        this.A05 = r3;
        this.A01 = view;
        this.A00 = view.findViewById(R.id.filter_thumb);
        this.A02 = C13680ns.A0K(view, R.id.filter_thumb_image);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = C13680ns.A0M(view, R.id.filter_name);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        int A002 = A00();
        if (A002 == -1) {
            return;
        }
        if (A002 <= 0 || this.A05.A01[A002 - 1] != null) {
            C30141bo r3 = this.A05.A09;
            if (A002 != r3.A01) {
                r3.A05(new RunnableRunnableShape1S0101000_I1((Object) this, A002, 8), new RunnableRunnableShape1S0101000_I1((Object) this, A002, 9), A002);
            }
        }
    }
}
