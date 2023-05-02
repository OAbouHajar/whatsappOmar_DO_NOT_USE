package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.inappsupport.ui.SupportTopicsActivity;
import java.util.ArrayList;

/* renamed from: X.2oK  reason: invalid class name and case insensitive filesystem */
public class C56682oK extends BaseAdapter {
    public SupportTopicsActivity A00;
    public ArrayList A01;

    public C56682oK(SupportTopicsActivity supportTopicsActivity, ArrayList arrayList) {
        this.A00 = supportTopicsActivity;
        this.A01 = arrayList;
    }

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A01.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        C84424Km r0;
        AnonymousClass3CN r5 = (AnonymousClass3CN) this.A01.get(i2);
        if (view == null) {
            r0 = new C84424Km(this);
            view = LayoutInflater.from(this.A00).inflate(R.layout.layout05a3, viewGroup, false);
            r0.A01 = (WaTextView) view.findViewById(R.id.topic_title);
            r0.A00 = view.findViewById(R.id.topic_divider);
            view.setTag(r0);
        } else {
            r0 = (C84424Km) view.getTag();
        }
        WaTextView waTextView = r0.A01;
        waTextView.setText(r5.A03);
        C13680ns.A1C(waTextView, this, r5, 34);
        if (this.A00.A01 == 2) {
            int i3 = (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f);
            waTextView.setPadding(i3, i3, i3, i3);
            r0.A00.setVisibility(0);
            return view;
        }
        r0.A00.setVisibility(8);
        return view;
    }
}
