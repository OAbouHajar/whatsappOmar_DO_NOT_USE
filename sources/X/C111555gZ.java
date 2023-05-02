package X;

import android.view.Menu;
import android.view.MenuItem;
import com.facebook.redex.IDxEWrapperShape176S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5gZ  reason: invalid class name and case insensitive filesystem */
public abstract class C111555gZ extends C19530ya implements AnonymousClass2AL {
    public final AnonymousClass013 A00;
    public final WaBloksActivity A01;

    public C111555gZ(AnonymousClass013 r1, WaBloksActivity waBloksActivity) {
        this.A00 = r1;
        this.A01 = waBloksActivity;
    }

    public void A00(C108615Or r6) {
        if (this instanceof C114775oY) {
            ((C114775oY) this).A00 = new AnonymousClass4NW(r6.A9T().A0G(40)).A02;
            return;
        }
        C114765oX r4 = (C114765oX) this;
        List<C31201dg> A0M = r6.A9T().A0M(45);
        ArrayList A0u = AnonymousClass000.A0u();
        for (C31201dg r1 : A0M) {
            A0u.add(new C119955zt(r1));
        }
        r4.A01 = A0u;
    }

    public void APE(Menu menu) {
        MenuItem menuItem;
        C447725m A002;
        if (this instanceof C114775oY) {
            C114775oY r6 = (C114775oY) this;
            List list = r6.A00;
            if (list != null && !list.isEmpty()) {
                int i2 = 0;
                for (AnonymousClass4LC r8 : r6.A00) {
                    MenuItem add = menu.add(0, i2, 0, r8.A02);
                    if (r8.A00 != null) {
                        r6.A01.put(Integer.valueOf(i2), new IDxEWrapperShape176S0100000_3_I1(r8, 4));
                    }
                    String str = r8.A01;
                    if (str != null) {
                        if ("lock".equals(str)) {
                            A002 = C110105dW.A0E(r6.A01, r6.A00, R.drawable.ic_fbpay_lock);
                        } else if ("search".equals(str)) {
                            A002 = C447725m.A00(r6.A01, r6.A00, R.drawable.ic_action_search);
                        } else if ("open_in_browser".equals(str) || "share".equals(str) || "copy_link".equals(str)) {
                            add.setShowAsAction(0);
                        }
                        add.setIcon(A002);
                        add.setShowAsAction(1);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        C114765oX r3 = (C114765oX) this;
        MenuItem add2 = menu.add(0, 56, 0, "");
        r3.A00 = add2;
        add2.setShowAsAction(0);
        r3.A00.setTitle(R.string.str1613);
        r3.A00.setIcon(R.drawable.vec_ic_more_vertical);
        r3.A00.setVisible(false);
        if (r3.A01 != null && (menuItem = r3.A00) != null) {
            menuItem.setVisible(true);
        }
    }

    public boolean AUD(MenuItem menuItem) {
        if (this instanceof C114775oY) {
            C114775oY r1 = (C114775oY) this;
            int itemId = menuItem.getItemId();
            Map map = r1.A01;
            Integer valueOf = Integer.valueOf(itemId);
            if (!map.containsKey(valueOf)) {
                return false;
            }
            AnonymousClass22A AH1 = r1.A01.AH1();
            Object obj = map.get(valueOf);
            AnonymousClass00B.A06(obj);
            AnonymousClass1K6.A0A(AH1, (C29671b0) obj);
            return true;
        } else if (!(this instanceof C114765oX)) {
            return false;
        } else {
            C114765oX r4 = (C114765oX) this;
            if (r4.A01 != null && menuItem.getItemId() == 56) {
                AnonymousClass1K6.A0A(r4.A01.AH1(), new IDxEWrapperShape176S0100000_3_I1(r4, 3));
            }
            return false;
        }
    }

    public boolean AVB(Menu menu) {
        return false;
    }
}
