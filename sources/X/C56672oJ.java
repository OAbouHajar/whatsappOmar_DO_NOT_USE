package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.group.NewGroup;
import java.util.List;

/* renamed from: X.2oJ  reason: invalid class name and case insensitive filesystem */
public class C56672oJ extends ArrayAdapter {
    public final LayoutInflater A00;
    public final /* synthetic */ NewGroup A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56672oJ(Context context, NewGroup newGroup, List list) {
        super(context, R.layout.layout053c, list);
        this.A01 = newGroup;
        this.A00 = LayoutInflater.from(newGroup);
    }

    public int getCount() {
        return this.A01.A0W.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A01.A0W.get(i2);
    }

    public long getItemId(int i2) {
        return (long) (i2 << 10);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        NewGroup newGroup = this.A01;
        C16010sH r2 = (C16010sH) newGroup.A0W.get(i2);
        AnonymousClass00B.A06(r2);
        if (view == null) {
            view = C13680ns.A0H(this.A00, viewGroup, R.layout.layout053c);
        }
        C13680ns.A0L(view, R.id.contact_name).setText(newGroup.A09.A08(r2));
        C004601z.A0E(view, R.id.close).setVisibility(8);
        ImageView A0J = C13680ns.A0J(view, R.id.contact_row_photo);
        newGroup.A0C.A06(A0J, r2);
        C004601z.A0d(A0J, 2);
        C004601z.A0j(view, new IDxDCompatShape22S0100000_2_I0(new C54322hF[]{new C54322hF(1, R.string.str1d26)}, 4));
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }
}
