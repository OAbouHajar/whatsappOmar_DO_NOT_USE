package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.1VA  reason: invalid class name */
public class AnonymousClass1VA extends AnonymousClass1VB implements AnonymousClass1VC {
    public AnonymousClass2SX A00;

    public void A1V() {
        AnonymousClass2SX r3 = this.A00;
        View findViewById = r3.A02.findViewById(16908292);
        AnonymousClass1VC r1 = r3.A02;
        AnonymousClass00B.A06(r1);
        ListView listView = (ListView) r1.findViewById(16908298);
        r3.A01 = listView;
        if (listView != null) {
            if (findViewById != null) {
                listView.setEmptyView(findViewById);
            }
            if (r3.A03) {
                r3.A00(r3.A00);
            }
            r3.A04.post(r3.A05);
            r3.A03 = true;
            return;
        }
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
    }

    public synchronized void A35(ListAdapter listAdapter) {
        this.A00.A00(listAdapter);
    }

    public ListView ADA() {
        AnonymousClass2SX r2 = this.A00;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        ListView listView = r2.A01;
        AnonymousClass00B.A04(listView);
        return listView;
    }

    public void AYU(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A02 = this;
    }

    public void onDestroy() {
        AnonymousClass2SX r0 = this.A00;
        r0.A04.removeCallbacks(r0.A05);
        super.onDestroy();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass2SX r2 = this.A00;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        AnonymousClass1VC r0 = r2.A02;
        AnonymousClass00B.A06(r0);
        r0.AYU(bundle);
    }
}
