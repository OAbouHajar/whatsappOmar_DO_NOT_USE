package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.5dt  reason: invalid class name and case insensitive filesystem */
public class C110325dt extends ArrayAdapter {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass2Ao A01;
    public final /* synthetic */ C1205662d A02;
    public final /* synthetic */ List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110325dt(Context context, Context context2, AnonymousClass2Ao r4, C1205662d r5, List list, List list2) {
        super(context, R.layout.layout053c, list);
        this.A02 = r5;
        this.A03 = list2;
        this.A00 = context2;
        this.A01 = r4;
    }

    public int getCount() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A03.get(i2);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        C16010sH r2 = (C16010sH) this.A03.get(i2);
        AnonymousClass00B.A06(r2);
        if (view == null) {
            view = C13680ns.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.layout0456);
        }
        C13680ns.A0L(view, R.id.contact_name).setText(this.A02.A0C.A08(r2));
        ImageView A0J = C13680ns.A0J(view, R.id.contact_row_photo);
        this.A01.A06(A0J, r2);
        C004601z.A0d(A0J, 2);
        C004601z.A0j(view, new IDxDCompatShape22S0100000_2_I0(new C54322hF[]{new C54322hF(1, R.string.str106a)}, 4));
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }
}
