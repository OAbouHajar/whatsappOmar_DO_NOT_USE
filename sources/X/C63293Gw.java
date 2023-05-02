package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Gw  reason: invalid class name and case insensitive filesystem */
public class C63293Gw implements AnonymousClass5QM {
    public final long A00;
    public final /* synthetic */ StatusesFragment A01;

    public C63293Gw(StatusesFragment statusesFragment, long j2) {
        this.A01 = statusesFragment;
        this.A00 = j2;
    }

    public View AGx(Context context, View view, ViewGroup viewGroup, AnonymousClass2Ao r14, List list, List list2, List list3, List list4, boolean z2) {
        int i2;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.layout0399, viewGroup, false);
            C004601z.A0d(view, 1);
        }
        TextView A0M = C13680ns.A0M(view, R.id.title);
        AnonymousClass1UP.A06(A0M);
        others.statusViewSeparator(view, A0M);
        long j2 = this.A00;
        if (j2 == 0) {
            i2 = R.string.str1359;
        } else if (j2 == 1) {
            i2 = R.string.str1a1c;
        } else {
            if (j2 != 2) {
                Log.e(C13680ns.A0j(AnonymousClass000.A0r("statusesFragment/invalid id: "), j2));
            }
            i2 = R.string.str0daa;
        }
        A0M.setText(i2);
        ImageView A0K = C13680ns.A0K(view, R.id.muted_statuses_icon);
        C004601z.A0d(A0K, 2);
        StatusesFragment statusesFragment = this.A01;
        if (!statusesFragment.A18 || j2 != 2 || statusesFragment.A16) {
            A0K.setVisibility(4);
            C004601z.A0j(view, (AnonymousClass05M) null);
            view.setOnClickListener((View.OnClickListener) null);
            view.setClickable(false);
        } else {
            A0K.setVisibility(0);
            boolean z3 = statusesFragment.A15;
            int i3 = R.string.str0032;
            if (z3) {
                i3 = R.string.str003f;
            }
            AnonymousClass2JP.A03(view, i3);
            boolean z4 = statusesFragment.A15;
            Resources A03 = statusesFragment.A03();
            int i4 = R.drawable.ic_chevron_up;
            if (z4) {
                i4 = R.drawable.ic_chevron_down;
            }
            A0K.setImageDrawable(A03.getDrawable(i4));
            view.setClickable(true);
            C13690nt.A1A(view, this, A0K, 11);
        }
        AnonymousClass2JP.A05(view, true);
        return view;
    }
}
