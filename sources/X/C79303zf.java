package X;

import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.3zf  reason: invalid class name and case insensitive filesystem */
public class C79303zf extends C111555gZ {
    public MenuItem A00;
    public MenuItem A01;
    public AnonymousClass4FV A02;

    public C79303zf(AnonymousClass013 r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }

    public void A00(C108615Or r3) {
        this.A02 = new AnonymousClass4FV(r3.A9T());
        A01();
    }

    public final void A01() {
        MenuItem menuItem;
        MenuItem menuItem2;
        AnonymousClass4FV r0 = this.A02;
        if (r0 != null) {
            if (r0.A00.A0P(41, false) && (menuItem2 = this.A00) != null) {
                menuItem2.setVisible(true);
            }
            if (this.A02.A00.A0P(44, false) && (menuItem = this.A01) != null) {
                menuItem.setVisible(true);
            }
        }
    }

    public void APE(Menu menu) {
        MenuItem add = menu.add(0, 55, 0, "cart");
        this.A00 = add;
        add.setShowAsAction(1);
        this.A00.setIcon(R.drawable.ic_action_view_shop);
        this.A00.setVisible(false);
        MenuItem add2 = menu.add(0, 56, 0, "more");
        this.A01 = add2;
        add2.setShowAsAction(1);
        this.A01.setIcon(R.drawable.vec_ic_more_vertical);
        this.A01.setVisible(false);
        A01();
    }

    public boolean AUD(MenuItem menuItem) {
        if (menuItem.getItemId() != 56) {
            return false;
        }
        AnonymousClass1K6.A0A(this.A01.AH1(), new C100754w9(new C100724w6(this), this));
        return false;
    }
}
