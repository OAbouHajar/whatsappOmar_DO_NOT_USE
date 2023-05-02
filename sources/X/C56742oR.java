package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.location.PlaceInfo;
import java.util.List;

/* renamed from: X.2oR  reason: invalid class name and case insensitive filesystem */
public class C56742oR extends BaseAdapter {
    public PlaceInfo A00;
    public List A01;
    public final Context A02;
    public final C38411qk A03;
    public final boolean A04 = true;

    public C56742oR(Context context, C38411qk r3) {
        this.A02 = context;
        this.A03 = r3;
    }

    public int getCount() {
        return C13680ns.A07(this.A01);
    }

    public Object getItem(int i2) {
        List list = this.A01;
        if (list == null || i2 >= list.size()) {
            return null;
        }
        return this.A01.get(i2);
    }

    public long getItemId(int i2) {
        return 0;
    }

    public int getItemViewType(int i2) {
        return 0;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.A02).inflate(R.layout.layout03b2, (ViewGroup) null);
        }
        TextView A0M = C13680ns.A0M(view, R.id.location_name);
        TextView A0M2 = C13680ns.A0M(view, R.id.location_description);
        ImageView A0K = C13680ns.A0K(view, R.id.location_icon);
        if (this.A04) {
            C018808t.A00(AnonymousClass00T.A03(this.A02, R.color.color065f), A0K);
        }
        List list = this.A01;
        if (list != null && i2 < list.size()) {
            PlaceInfo placeInfo = (PlaceInfo) this.A01.get(i2);
            A0M.setText(placeInfo.A06);
            int i3 = 0;
            if (!TextUtils.isEmpty(placeInfo.A0B)) {
                A0M2.setVisibility(0);
                A0M2.setText(placeInfo.A0B);
                A0M2.setSingleLine(true);
            } else {
                A0M2.setVisibility(8);
            }
            if (placeInfo == this.A00) {
                A0M.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.pin_location_red, 0);
            } else {
                A0M.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (placeInfo.A03 == 3) {
                i3 = this.A02.getResources().getDimensionPixelSize(R.dimen.dimen061a);
            }
            A0K.setPadding(i3, i3, i3, i3);
            String str = placeInfo.A05;
            if (str != null) {
                this.A03.A01(A0K, str);
            } else {
                A0K.setImageDrawable((Drawable) null);
                return view;
            }
        }
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }
}
