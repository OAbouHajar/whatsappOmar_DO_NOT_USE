package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxPListenerShape314S0100000_2_I1;
import com.facebook.redex.IDxRListenerShape462S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3GL  reason: invalid class name */
public abstract class AnonymousClass3GL implements AnonymousClass5S4 {
    public int A00;
    public int A01;
    public int A02;
    public GridLayoutManager A03;
    public RecyclerView A04;
    public C34151jm A05 = null;
    public C57482rF A06;
    public boolean A07 = false;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final LayoutInflater A0B;
    public final C14710pd A0C;
    public final AnonymousClass4FI A0D = new AnonymousClass4FI(this);

    public AnonymousClass3GL(Context context, LayoutInflater layoutInflater, C14710pd r5, int i2) {
        this.A0C = r5;
        this.A0A = context;
        this.A0B = layoutInflater;
        this.A09 = i2;
        int i3 = C87594Xo.A01(AnonymousClass01V.A02(context)).x / i2;
        if (this.A00 != i3) {
            this.A00 = i3;
            GridLayoutManager gridLayoutManager = this.A03;
            if (gridLayoutManager != null) {
                gridLayoutManager.A1g(i3);
            }
            C57482rF r0 = this.A06;
            if (r0 != null) {
                r0.A01();
            }
        }
        this.A08 = context.getResources().getDimensionPixelSize(R.dimen.dimen07b2);
    }

    public C57482rF A00() {
        C57482rF r3 = this.A06;
        if (r3 == null) {
            if (this instanceof AnonymousClass35B) {
                AnonymousClass35B r0 = (AnonymousClass35B) this;
                r3 = new C57482rF(r0.A0A, r0.A05, r0.A07, 6, r0.A04.A04);
                r3.A02 = new IDxPListenerShape314S0100000_2_I1(r0, 4);
            } else if (this instanceof AnonymousClass35C) {
                AnonymousClass35C r02 = (AnonymousClass35C) this;
                r3 = new C57482rF(r02.A0A, r02.A05, r02.A07, C13690nt.A0T(), (List) null);
                r3.A02 = new IDxPListenerShape314S0100000_2_I1(r02, 3);
            } else if (this instanceof AnonymousClass35D) {
                AnonymousClass35D r03 = (AnonymousClass35D) this;
                r3 = r03.A05;
                if (r3 == null) {
                    r3 = new C57482rF(r03.A0A, r03.A0B, r03.A0C, C13680ns.A0a(), (List) null);
                    r03.A05 = r3;
                    r3.A02 = new IDxPListenerShape314S0100000_2_I1(r03, 2);
                }
            } else if (this instanceof AnonymousClass35A) {
                AnonymousClass35A r04 = (AnonymousClass35A) this;
                r3 = new C57482rF(r04.A0A, r04.A03, r04.A04, C13690nt.A0U(), r04.A01);
                r3.A02 = new IDxPListenerShape314S0100000_2_I1(r04, 1);
            } else {
                AnonymousClass359 r05 = (AnonymousClass359) this;
                r3 = new C57482rF(r05.A0A, r05.A00, r05.A01, 7, C13690nt.A0k(r05.A02.A03));
                r3.A02 = new IDxPListenerShape314S0100000_2_I1(r05, 0);
            }
            this.A06 = r3;
            boolean z2 = this.A07;
            r3.A04 = z2;
            r3.A00 = C13690nt.A00(z2 ? 1 : 0);
        }
        return r3;
    }

    public void A01() {
        if (this instanceof AnonymousClass35B) {
            AnonymousClass35B r1 = (AnonymousClass35B) this;
            r1.A00().A01();
            r1.A04();
        } else if (this instanceof AnonymousClass35C) {
            AnonymousClass35C r2 = (AnonymousClass35C) this;
            AnonymousClass1CX r4 = r2.A06;
            int i2 = r2.A04;
            r4.A0Y.Ack(new C78903ys(new IDxRListenerShape462S0100000_2_I1(r2, 1), r4, i2), new Void[0]);
        } else if (this instanceof AnonymousClass35D) {
            AnonymousClass35D r12 = (AnonymousClass35D) this;
            C212613k r42 = r12.A0A;
            r42.A09.execute(new RunnableRunnableShape10S0200000_I0_8(r42, 38, new IDxRListenerShape462S0100000_2_I1(r12, 0)));
        } else if (this instanceof AnonymousClass35A) {
            AnonymousClass35A r3 = (AnonymousClass35A) this;
            r3.A00().A01();
            if (r3.A00 != null) {
                int i3 = 0;
                int A072 = C13680ns.A07(r3.A01);
                View view = r3.A00;
                if (A072 != 0) {
                    i3 = 8;
                }
                view.setVisibility(i3);
            }
        } else {
            AnonymousClass359 r22 = (AnonymousClass359) this;
            r22.A00().A0E(C13690nt.A0k(r22.A02.A03));
            r22.A00().A01();
        }
    }

    public void A02(int i2, int i3) {
        if (i2 != 0 && i3 != 0) {
            int dimensionPixelSize = i3 - this.A0A.getResources().getDimensionPixelSize(R.dimen.dimen0610);
            if (dimensionPixelSize != this.A01) {
                this.A01 = dimensionPixelSize;
                int i4 = this.A09;
                int i5 = (i4 * 3) >> 2;
                int i6 = dimensionPixelSize % i4;
                if (i6 >= (i4 >> 2) && i6 <= i5) {
                    i5 = i6;
                }
                int max = Math.max(0, dimensionPixelSize - i5);
                this.A02 = (max % i4) / ((max / i4) + 1);
            }
            int i7 = i2 / this.A09;
            if (this.A00 != i7) {
                this.A00 = i7;
                GridLayoutManager gridLayoutManager = this.A03;
                if (gridLayoutManager != null) {
                    gridLayoutManager.A1g(i7);
                }
                C57482rF r0 = this.A06;
                if (r0 != null) {
                    r0.A01();
                }
            }
        }
    }

    public abstract void A03(View view);

    public void APc(View view, ViewGroup viewGroup, int i2) {
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            AnonymousClass0PR recycledViewPool = recyclerView.getRecycledViewPool();
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = recycledViewPool.A01;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                ((C04850Oe) sparseArray.valueAt(i3)).A03.clear();
                i3++;
            }
            recyclerView.setAdapter((AnonymousClass01X) null);
            this.A04 = null;
        }
        this.A03 = null;
        this.A06 = null;
    }

    public String getId() {
        return this instanceof AnonymousClass35B ? ((AnonymousClass35B) this).A04.A0F : this instanceof AnonymousClass35C ? "starred" : this instanceof AnonymousClass35D ? "recents" : this instanceof AnonymousClass35A ? AnonymousClass000.A0l(AnonymousClass000.A0r("reaction_"), ((AnonymousClass35A) this).A02) : "contextual_suggestion";
    }
}
