package X;

import android.view.View;
import android.view.ViewStub;
import java.util.LinkedHashMap;

/* renamed from: X.1j5  reason: invalid class name and case insensitive filesystem */
public final class C33741j5 {
    public static boolean A05;
    public View.OnClickListener A00;
    public View A01;
    public ViewStub A02;
    public AnonymousClass2NR A03;
    public LinkedHashMap A04;

    public C33741j5(View view) {
        AnonymousClass00B.A04(view);
        if (view instanceof ViewStub) {
            this.A02 = (ViewStub) view;
        } else {
            this.A01 = view;
        }
        if (A05) {
            A02();
        }
    }

    public static C33741j5 A00(View view, int i2) {
        return new C33741j5(C004601z.A0E(view, i2));
    }

    public int A01() {
        View view = this.A01;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public View A02() {
        View view;
        ViewStub viewStub;
        View view2 = this.A01;
        if (view2 == null && (viewStub = this.A02) != null) {
            view2 = viewStub.inflate();
            this.A01 = view2;
            this.A02 = null;
        }
        AnonymousClass00B.A07(view2, "View must be inflated in ViewStubHolder.getView()");
        AnonymousClass2NR r0 = this.A03;
        if (!(r0 == null || view2 == null)) {
            r0.ASD(view2);
            this.A03 = null;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (!(linkedHashMap == null || this.A01 == null)) {
            for (AnonymousClass2NR ASD : linkedHashMap.values()) {
                ASD.ASD(this.A01);
            }
            this.A04 = null;
        }
        View.OnClickListener onClickListener = this.A00;
        if (!(onClickListener == null || (view = this.A01) == null)) {
            view.setOnClickListener(onClickListener);
            this.A00 = null;
        }
        return this.A01;
    }

    public void A03(int i2) {
        View A022;
        if (i2 == 8) {
            A022 = this.A01;
            if (A022 == null) {
                return;
            }
        } else {
            A022 = A02();
        }
        A022.setVisibility(i2);
    }

    public void A04(View.OnClickListener onClickListener) {
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        } else {
            this.A00 = onClickListener;
        }
    }

    public void A05(AnonymousClass2NR r2) {
        View view = this.A01;
        if (view != null) {
            r2.ASD(view);
        } else {
            this.A03 = r2;
        }
    }

    public void A06(AnonymousClass2NR r2, String str) {
        View view = this.A01;
        if (view != null) {
            r2.ASD(view);
            return;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.A04 = linkedHashMap;
        }
        if (linkedHashMap.containsKey(str)) {
            this.A04.remove(str);
        }
        this.A04.put(str, r2);
    }
}
