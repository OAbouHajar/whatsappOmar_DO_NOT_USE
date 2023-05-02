package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.0Z4  reason: invalid class name */
public class AnonymousClass0Z4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass0PG A00;
    public final /* synthetic */ AlertController$RecycleListView A01;
    public final /* synthetic */ C06490Wi A02;

    public AnonymousClass0Z4(AnonymousClass0PG r1, AlertController$RecycleListView alertController$RecycleListView, C06490Wi r3) {
        this.A00 = r1;
        this.A01 = alertController$RecycleListView;
        this.A02 = r3;
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        AnonymousClass0PG r2 = this.A00;
        boolean[] zArr = r2.A0N;
        if (zArr != null) {
            zArr[i2] = this.A01.isItemChecked(i2);
        }
        r2.A09.onClick(this.A02.A0W, i2, this.A01.isItemChecked(i2));
    }
}
