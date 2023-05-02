package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: X.0ZT  reason: invalid class name */
public class AnonymousClass0ZT implements C13350lt, AdapterView.OnItemClickListener {
    public Context A00;
    public LayoutInflater A01;
    public ExpandedMenuView A02;
    public AnonymousClass0C4 A03;
    public C016607w A04;
    public C12940lD A05;

    public AnonymousClass0ZT(Context context) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
    }

    public boolean A6P(C016607w r2, C07290av r3) {
        return false;
    }

    public boolean A8s(C016607w r2, C07290av r3) {
        return false;
    }

    public boolean A97() {
        return false;
    }

    public void AIA(Context context, C016607w r3) {
        if (this.A00 != null) {
            this.A00 = context;
            if (this.A01 == null) {
                this.A01 = LayoutInflater.from(context);
            }
        }
        this.A04 = r3;
        AnonymousClass0C4 r0 = this.A03;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void AOk(C016607w r2, boolean z2) {
        C12940lD r0 = this.A05;
        if (r0 != null) {
            r0.AOk(r2, z2);
        }
    }

    public boolean AY0(AnonymousClass0Cw r8) {
        if (!r8.hasVisibleItems()) {
            return false;
        }
        AnonymousClass0ZR r3 = new AnonymousClass0ZR(r8);
        C016607w r6 = r3.A02;
        Context context = r6.A0N;
        C005302h r4 = new C005302h(context);
        AnonymousClass0PG r2 = r4.A01;
        AnonymousClass0ZT r0 = new AnonymousClass0ZT(r2.A0O);
        r3.A01 = r0;
        r0.A05 = r3;
        r6.A09(context, r0);
        AnonymousClass0ZT r1 = r3.A01;
        AnonymousClass0C4 r02 = r1.A03;
        if (r02 == null) {
            r02 = new AnonymousClass0C4(r1);
            r1.A03 = r02;
        }
        r4.A04(r3, r02);
        View view = r6.A02;
        if (view != null) {
            r2.A0B = view;
        } else {
            r2.A0A = r6.A01;
            r4.setTitle(r6.A05);
        }
        r2.A08 = r3;
        C005702l create = r4.create();
        r3.A00 = create;
        create.setOnDismissListener(r3);
        WindowManager.LayoutParams attributes = r3.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        r3.A00.show();
        C12940lD r03 = this.A05;
        if (r03 == null) {
            return true;
        }
        r03.AUB(r8);
        return true;
    }

    public void Ade(C12940lD r1) {
        this.A05 = r1;
    }

    public void AhS(boolean z2) {
        AnonymousClass0C4 r0 = this.A03;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.A04.A0L(this.A03.getItem(i2), this, 0);
    }
}
