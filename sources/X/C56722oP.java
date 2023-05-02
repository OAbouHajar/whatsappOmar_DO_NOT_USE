package X;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import java.util.List;

/* renamed from: X.2oP  reason: invalid class name and case insensitive filesystem */
public class C56722oP extends BaseAdapter {
    public List A00 = AnonymousClass000.A0u();
    public final /* synthetic */ CallLogActivity A01;

    public C56722oP(CallLogActivity callLogActivity) {
        this.A01 = callLogActivity;
    }

    public int getCount() {
        return C13680ns.A07(this.A00);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A00.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4O8 r0;
        int i3;
        int i4;
        if (view == null) {
            CallLogActivity callLogActivity = this.A01;
            view = C13680ns.A0H(callLogActivity.getLayoutInflater(), viewGroup, R.layout.layout00db);
            r0 = new AnonymousClass4O8(view, callLogActivity);
            view.setTag(r0);
            C004601z.A0d(view, 2);
            C004601z.A0d(view.findViewById(R.id.row_content), 1);
        } else {
            r0 = (AnonymousClass4O8) view.getTag();
        }
        C37831po r5 = (C37831po) this.A00.get(i2);
        C35011lE r4 = r5.A0C;
        boolean z2 = r4.A03;
        int i5 = R.drawable.vec_ic_call_incoming_or_missed;
        if (z2) {
            i5 = R.drawable.vec_ic_call_outgoing;
        }
        int A002 = C62043Bk.A00(r5);
        ImageView imageView = r0.A00;
        imageView.setImageResource(i5);
        AnonymousClass2SR.A07(imageView.getContext(), imageView, A002);
        TextView textView = r0.A04;
        if (z2) {
            i3 = R.string.str0ee2;
        } else {
            int i6 = r5.A00;
            i3 = R.string.str0b62;
            if (i6 != 5) {
                i3 = R.string.str0d73;
                if (i6 == 6) {
                    i3 = R.string.str000f;
                }
            }
        }
        textView.setText(i3);
        TextView textView2 = r0.A02;
        Context context = textView2.getContext();
        CallLogActivity callLogActivity2 = r0.A06;
        textView2.setText(DateUtils.formatDateTime(context, callLogActivity2.A05.A02(r5.A0A), 1));
        int i7 = r5.A00;
        if (i7 == 5) {
            TextView textView3 = r0.A03;
            textView3.setText(C28961Zl.A04(callLogActivity2.A01, (long) r5.A01));
            textView3.setVisibility(0);
            long j2 = r5.A02;
            if (j2 > 0) {
                TextView textView4 = r0.A01;
                textView4.setText(AnonymousClass2GQ.A04(callLogActivity2.A01, j2));
                textView4.setVisibility(0);
            }
            r0.A01.setVisibility(8);
        } else {
            if (z2) {
                if (i7 == 2) {
                    i4 = R.string.str1af3;
                } else if (i7 != 3) {
                    i4 = R.string.str1a8f;
                    if (i7 != 4) {
                        i4 = R.string.str033b;
                    }
                } else {
                    i4 = R.string.str1b14;
                }
                TextView textView5 = r0.A03;
                textView5.setText(i4);
                textView5.setVisibility(0);
            } else {
                r0.A03.setVisibility(8);
            }
            r0.A01.setVisibility(8);
        }
        if (r5.A0A() && !z2) {
            String A0d = C13680ns.A0d(callLogActivity2, callLogActivity2.A0E.A0C(callLogActivity2.A0J.A01(r4.A01)), new Object[1], 0, R.string.str0c4f);
            TextView textView6 = r0.A05;
            textView6.setText(AnonymousClass1ZW.A07(callLogActivity2.A01, "", A0d));
            textView6.setContentDescription(A0d);
        }
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }
}
