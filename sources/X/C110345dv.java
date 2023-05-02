package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5dv  reason: invalid class name and case insensitive filesystem */
public class C110345dv extends BaseAdapter {
    public final Context A00;
    public final C113875ml A01;

    public C110345dv(Context context, C113875ml r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public int getCount() {
        return this.A01.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A01.A00.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout0478, (ViewGroup) null);
        C117505t6 r4 = (C117505t6) this.A01.A00.get(i2);
        ImageView A0J = C13680ns.A0J(inflate, R.id.status_icon);
        A0J.setColorFilter(context.getResources().getColor(r4.A00), PorterDuff.Mode.SRC_IN);
        A0J.setImageResource(r4.A01);
        TextView A0L = C13680ns.A0L(inflate, R.id.transaction_status);
        A0L.setText(r4.A05);
        C13690nt.A0w(context.getResources(), A0L, r4.A03);
        TextView A0L2 = C13680ns.A0L(inflate, R.id.status_subtitle);
        A0L2.setText(r4.A04);
        C13690nt.A0w(context.getResources(), A0L2, r4.A02);
        View A0E = C004601z.A0E(inflate, R.id.line);
        if (i2 == getCount() - 1) {
            A0E.setVisibility(8);
        }
        return inflate;
    }
}
