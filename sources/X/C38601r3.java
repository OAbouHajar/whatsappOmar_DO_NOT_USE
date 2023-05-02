package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.mod.bomfab.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1r3  reason: invalid class name and case insensitive filesystem */
public abstract class C38601r3 extends C16740tZ {
    public boolean A00 = false;
    public boolean A01;
    public final List A02 = new ArrayList();

    public C38601r3(C28381Vw r2, byte b2, long j2) {
        super(r2, b2, j2);
        A0W(6);
    }

    public void A0W(int i2) {
        super.A0W(6);
    }

    public C37831po A12() {
        C37831po r0;
        int i2;
        C37831po r02;
        if (this instanceof C38771rO) {
            C38771rO r2 = (C38771rO) this;
            synchronized (r2.A12) {
                r02 = r2.A00;
                if (r02 == null) {
                    r02 = C37831po.A01(r2, 0, 2, 0, r2.A01, true);
                    r2.A00 = r02;
                }
            }
            return r02;
        }
        C38761rN r22 = (C38761rN) this;
        synchronized (r22.A12) {
            r0 = r22.A03;
            if (r0 == null) {
                boolean z2 = r22.A01;
                int i3 = r22.A00;
                if (i3 <= 0) {
                    if (r22.A11.A02) {
                        switch (r22.A01) {
                            case 1:
                                break;
                            case 2:
                            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                i2 = 4;
                                break;
                            case 3:
                            case 6:
                            case 7:
                            case 8:
                            case 10:
                            case 15:
                            case 16:
                            case 17:
                            case 19:
                                i2 = 3;
                                break;
                            case 4:
                            case 5:
                            case 9:
                                break;
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 18:
                                i2 = 1;
                                break;
                            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                i2 = 6;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    }
                    i2 = 2;
                    r0 = C37831po.A01(r22, i3, i2, r22.A02, z2, false);
                    r22.A03 = r0;
                }
                i2 = 5;
                r0 = C37831po.A01(r22, i3, i2, r22.A02, z2, false);
                r22.A03 = r0;
            }
        }
        return r0;
    }

    public List A13() {
        C37831po A12;
        List list = this.A02;
        if (list.isEmpty() && this.A00 && (A12 = A12()) != null) {
            list.add(A12);
        }
        return new ArrayList(list);
    }

    public void A14(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new IDxComparatorShape19S0000000_2_I0(37));
    }
}
