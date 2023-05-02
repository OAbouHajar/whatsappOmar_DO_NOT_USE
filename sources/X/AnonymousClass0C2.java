package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.0C2  reason: invalid class name */
public class AnonymousClass0C2 extends ArrayAdapter {
    public final /* synthetic */ AnonymousClass0PG A00;
    public final /* synthetic */ AlertController$RecycleListView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0C2(Context context, AnonymousClass0PG r3, AlertController$RecycleListView alertController$RecycleListView, CharSequence[] charSequenceArr, int i2) {
        super(context, i2, 16908308, charSequenceArr);
        this.A00 = r3;
        this.A01 = alertController$RecycleListView;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        boolean[] zArr = this.A00.A0N;
        if (zArr != null && zArr[i2]) {
            this.A01.setItemChecked(i2, true);
        }
        return view2;
    }
}
