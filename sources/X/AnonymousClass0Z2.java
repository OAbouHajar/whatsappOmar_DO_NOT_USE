package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.0Z2  reason: invalid class name */
public class AnonymousClass0Z2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass0PG A00;
    public final /* synthetic */ C06490Wi A01;

    public AnonymousClass0Z2(AnonymousClass0PG r1, C06490Wi r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        AnonymousClass0PG r3 = this.A00;
        DialogInterface.OnClickListener onClickListener = r3.A05;
        C005802m r1 = this.A01.A0W;
        onClickListener.onClick(r1, i2);
        if (!r3.A0L) {
            r1.dismiss();
        }
    }
}
