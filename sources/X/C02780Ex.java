package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape96S0200000_I1;
import com.facebook.redex.IDxECallbackShape6S0200000_I1;
import java.util.ArrayList;

/* renamed from: X.0Ex  reason: invalid class name and case insensitive filesystem */
public class C02780Ex extends AnonymousClass0WS {
    public Object A02(Object obj) {
        if (obj != null) {
            return ((C015707n) obj).clone();
        }
        return null;
    }

    public Object A03(Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass0GD r0 = new AnonymousClass0GD();
        r0.A0a((C015707n) obj);
        return r0;
    }

    public Object A04(Object obj, Object obj2, Object obj3) {
        C015707n r2 = (C015707n) obj;
        C015707n r4 = (C015707n) obj3;
        if (r2 == null) {
            r2 = null;
        }
        if (r4 == null) {
            return r2;
        }
        AnonymousClass0GD r0 = new AnonymousClass0GD();
        if (r2 != null) {
            r0.A0a(r2);
        }
        r0.A0a(r4);
        return r0;
    }

    public Object A05(Object obj, Object obj2, Object obj3) {
        AnonymousClass0GD r0 = new AnonymousClass0GD();
        if (obj != null) {
            r0.A0a((C015707n) obj);
        }
        r0.A0a((C015707n) obj2);
        return r0;
    }

    public void A06(Rect rect, Object obj) {
        ((C015707n) obj).A0O(new IDxECallbackShape6S0200000_I1(rect, this, 1));
    }

    public void A07(View view, Object obj) {
        ((C015707n) obj).A06(view);
    }

    public void A08(View view, Object obj) {
        if (view != null) {
            Rect A0J = AnonymousClass000.A0J();
            AnonymousClass0WS.A00(view, A0J);
            ((C015707n) obj).A0O(new IDxECallbackShape6S0200000_I1(A0J, this, 0));
        }
    }

    public void A09(View view, Object obj, ArrayList arrayList) {
        ((C015707n) obj).A08(new C07830cX(view, this, arrayList));
    }

    public void A0A(View view, Object obj, ArrayList arrayList) {
        C015707n r6 = (C015707n) obj;
        ArrayList arrayList2 = r6.A0H;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0WS.A01(AnonymousClass000.A0N(arrayList, i2), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        A0E(r6, arrayList);
    }

    public void A0B(ViewGroup viewGroup, Object obj) {
        C015807o.A02(viewGroup, (C015707n) obj);
    }

    public void A0C(AnonymousClass024 r3, AnonymousClass01A r4, Object obj, Runnable runnable) {
        C015707n r5 = (C015707n) obj;
        r3.A03(new IDxCListenerShape96S0200000_I1(r5, 1, this));
        r5.A08(new C07820cW(this, runnable));
    }

    public void A0D(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((C015707n) obj).A08(new AnonymousClass0GI(this, obj2, obj4, arrayList, arrayList3));
    }

    public void A0E(Object obj, ArrayList arrayList) {
        Object obj2;
        C015707n r5 = (C015707n) obj;
        if (r5 != null) {
            int i2 = 0;
            if (r5 instanceof AnonymousClass0GD) {
                AnonymousClass0GD r52 = (AnonymousClass0GD) r5;
                int size = r52.A02.size();
                while (i2 < size) {
                    if (i2 >= 0) {
                        ArrayList arrayList2 = r52.A02;
                        if (i2 < arrayList2.size()) {
                            obj2 = arrayList2.get(i2);
                            A0E(obj2, arrayList);
                            i2++;
                        }
                    }
                    obj2 = null;
                    A0E(obj2, arrayList);
                    i2++;
                }
                return;
            }
            ArrayList arrayList3 = r5.A0G;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                ArrayList arrayList4 = r5.A0H;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        r5.A06(AnonymousClass000.A0N(arrayList, i2));
                        i2++;
                    }
                }
            }
        }
    }

    public void A0F(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C015707n r2 = (C015707n) obj;
        if (r2 != null) {
            ArrayList arrayList3 = r2.A0H;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            A0H(r2, arrayList, arrayList2);
        }
    }

    public boolean A0G(Object obj) {
        return obj instanceof C015707n;
    }

    public void A0H(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Object obj2;
        C015707n r5 = (C015707n) obj;
        int i2 = 0;
        if (r5 instanceof AnonymousClass0GD) {
            AnonymousClass0GD r52 = (AnonymousClass0GD) r5;
            int size = r52.A02.size();
            while (i2 < size) {
                if (i2 >= 0) {
                    ArrayList arrayList3 = r52.A02;
                    if (i2 < arrayList3.size()) {
                        obj2 = arrayList3.get(i2);
                        A0H(obj2, arrayList, arrayList2);
                        i2++;
                    }
                }
                obj2 = null;
                A0H(obj2, arrayList, arrayList2);
                i2++;
            }
            return;
        }
        ArrayList arrayList4 = r5.A0G;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            ArrayList arrayList5 = r5.A0H;
            if (arrayList5.size() == arrayList.size() && arrayList5.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        r5.A06(AnonymousClass000.A0N(arrayList2, i2));
                        i2++;
                    }
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        r5.A07(AnonymousClass000.A0N(arrayList, size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
