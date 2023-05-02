package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape317S0100000_I1;
import com.facebook.redex.IDxLListenerShape143S0100000_I1;
import com.obwhatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Cy  reason: invalid class name and case insensitive filesystem */
public final class C02570Cy extends AnonymousClass0ZU implements C13350lt, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public ViewTreeObserver A07;
    public PopupWindow.OnDismissListener A08;
    public C12940lD A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final Handler A0J;
    public final View.OnAttachStateChangeListener A0K = new IDxCListenerShape317S0100000_I1(this, 0);
    public final ViewTreeObserver.OnGlobalLayoutListener A0L = new IDxLListenerShape143S0100000_I1(this, 0);
    public final C12970lG A0M = new AnonymousClass0ZY(this);
    public final List A0N = AnonymousClass000.A0u();
    public final List A0O = AnonymousClass000.A0u();
    public final boolean A0P;

    public C02570Cy(Context context, View view, int i2, int i3, boolean z2) {
        this.A0I = context;
        this.A05 = view;
        this.A0G = i2;
        this.A0H = i3;
        this.A0P = z2;
        this.A0A = false;
        this.A01 = C004601z.A06(view) == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0F = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(R.dimen.dimen0017));
        this.A0J = new Handler();
    }

    public void A01(int i2) {
        if (this.A02 != i2) {
            this.A02 = i2;
            this.A00 = C05570Sc.A00(i2, C004601z.A06(this.A05));
        }
    }

    public void A02(int i2) {
        this.A0B = true;
        this.A03 = i2;
    }

    public void A03(int i2) {
        this.A0C = true;
        this.A04 = i2;
    }

    public void A04(View view) {
        if (this.A05 != view) {
            this.A05 = view;
            this.A00 = C05570Sc.A00(this.A02, C004601z.A06(view));
        }
    }

    public void A05(PopupWindow.OnDismissListener onDismissListener) {
        this.A08 = onDismissListener;
    }

    public void A06(C016607w r2) {
        r2.A09(this.A0I, this);
        if (AJh()) {
            A0A(r2);
        } else {
            this.A0N.add(r2);
        }
    }

    public void A07(boolean z2) {
        this.A0A = z2;
    }

    public void A08(boolean z2) {
        this.A0E = z2;
    }

    public boolean A09() {
        return false;
    }

    public final void A0A(C016607w r18) {
        AnonymousClass0OK r2;
        View view;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        AnonymousClass0C5 r14;
        int i6;
        int firstVisiblePosition;
        Context context = this.A0I;
        LayoutInflater from = LayoutInflater.from(context);
        C016607w r7 = r18;
        AnonymousClass0C5 r10 = new AnonymousClass0C5(from, r7, R.layout.layout000b, this.A0P);
        if (!AJh() && this.A0A) {
            r10.A02 = true;
        } else if (AJh()) {
            int size = r7.size();
            boolean z3 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                MenuItem item = r7.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i7++;
            }
            r10.A02 = z3;
        }
        int A002 = AnonymousClass0ZU.A00(context, r10, this.A0F);
        AnonymousClass0DE r4 = new AnonymousClass0DE(context, this.A0G, this.A0H);
        r4.A00 = this.A0M;
        r4.A08 = this;
        PopupWindow popupWindow = r4.A0A;
        popupWindow.setOnDismissListener(this);
        r4.A07 = this.A05;
        r4.A00 = this.A00;
        r4.A0E = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        r4.AdW(r10);
        r4.A01(A002);
        r4.A00 = this.A00;
        List list = this.A0O;
        if (list.size() > 0) {
            r2 = (AnonymousClass0OK) list.get(list.size() - 1);
            C016607w r12 = r2.A01;
            int size2 = r12.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size2) {
                    break;
                }
                MenuItem item2 = r12.getItem(i8);
                if (!item2.hasSubMenu() || r7 != item2.getSubMenu()) {
                    i8++;
                } else {
                    AnonymousClass0CV r13 = r2.A02.A0B;
                    ListAdapter adapter = r13.getAdapter();
                    int i9 = 0;
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i6 = headerViewListAdapter.getHeadersCount();
                        r14 = (AnonymousClass0C5) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        r14 = (AnonymousClass0C5) adapter;
                        i6 = 0;
                    }
                    int count = r14.getCount();
                    while (true) {
                        if (i9 >= count) {
                            break;
                        } else if (item2 != r14.getItem(i9)) {
                            i9++;
                        } else if (i9 != -1 && (firstVisiblePosition = (i9 + i6) - r13.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r13.getChildCount()) {
                            view = r13.getChildAt(firstVisiblePosition);
                        }
                    }
                }
            }
            view = null;
        } else {
            r2 = null;
            view = null;
        }
        if (view != null) {
            r4.A04();
            r4.A02();
            AnonymousClass0CV r142 = ((AnonymousClass0OK) list.get(list.size() - 1)).A02.A0B;
            int[] iArr = new int[2];
            r142.getLocationOnScreen(iArr);
            Rect A0J2 = AnonymousClass000.A0J();
            this.A06.getWindowVisibleDisplayFrame(A0J2);
            if (this.A01 != 1 ? iArr[0] - A002 >= 0 : iArr[0] + r142.getWidth() + A002 > A0J2.right) {
                i2 = 0;
                z2 = false;
            } else {
                i2 = 1;
                z2 = true;
            }
            this.A01 = i2;
            if (Build.VERSION.SDK_INT >= 26) {
                r4.A07 = view;
                i4 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.A05.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.A00 & 7) == 5) {
                    iArr2[0] = iArr2[0] + this.A05.getWidth();
                    iArr3[0] = iArr3[0] + view.getWidth();
                }
                i3 = iArr3[0] - iArr2[0];
                i4 = iArr3[1] - iArr2[1];
            }
            if ((this.A00 & 5) == 5) {
                if (!z2) {
                    A002 = view.getWidth();
                }
                i5 = i3 + A002;
                r4.A01 = i5;
                r4.A0G = true;
                r4.A0F = true;
                r4.Aex(i4);
            } else if (z2) {
                A002 = view.getWidth();
                i5 = i3 + A002;
                r4.A01 = i5;
                r4.A0G = true;
                r4.A0F = true;
                r4.Aex(i4);
            }
            i5 = i3 - A002;
            r4.A01 = i5;
            r4.A0G = true;
            r4.A0F = true;
            r4.Aex(i4);
        } else {
            if (this.A0B) {
                r4.A01 = this.A03;
            }
            if (this.A0C) {
                r4.Aex(this.A04);
            }
            Rect rect = this.A00;
            r4.A06 = rect != null ? new Rect(rect) : null;
        }
        list.add(new AnonymousClass0OK(r7, r4, this.A01));
        r4.AfT();
        AnonymousClass0CV r3 = r4.A0B;
        r3.setOnKeyListener(this);
        if (r2 == null && this.A0E && r7.A05 != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.layout0012, r3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(r7.A05);
            r3.addHeaderView(frameLayout, (Object) null, false);
            r4.AfT();
        }
    }

    public boolean A97() {
        return false;
    }

    public ListView ADA() {
        List list = this.A0O;
        if (list.isEmpty()) {
            return null;
        }
        return ((AnonymousClass0OK) list.get(list.size() - 1)).A02.A0B;
    }

    public boolean AJh() {
        List list = this.A0O;
        return list.size() > 0 && ((AnonymousClass0OK) list.get(0)).A02.A0A.isShowing();
    }

    public void AOk(C016607w r7, boolean z2) {
        List list = this.A0O;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            if (r7 != ((AnonymousClass0OK) list.get(i2)).A01) {
                i2++;
            } else if (i2 >= 0) {
                int i3 = i2 + 1;
                if (i3 < list.size()) {
                    ((AnonymousClass0OK) list.get(i3)).A01.A0G(false);
                }
                AnonymousClass0OK r1 = (AnonymousClass0OK) list.remove(i2);
                r1.A01.A0E(this);
                if (this.A0D) {
                    AnonymousClass0DE r0 = r1.A02;
                    r0.A03();
                    r0.A0A.setAnimationStyle(0);
                }
                r1.A02.dismiss();
                int size2 = list.size();
                if (size2 > 0) {
                    this.A01 = ((AnonymousClass0OK) list.get(size2 - 1)).A00;
                } else {
                    int i4 = 1;
                    if (C004601z.A06(this.A05) == 1) {
                        i4 = 0;
                    }
                    this.A01 = i4;
                    if (size2 == 0) {
                        dismiss();
                        C12940lD r12 = this.A09;
                        if (r12 != null) {
                            r12.AOk(r7, true);
                        }
                        ViewTreeObserver viewTreeObserver = this.A07;
                        if (viewTreeObserver != null) {
                            if (viewTreeObserver.isAlive()) {
                                this.A07.removeGlobalOnLayoutListener(this.A0L);
                            }
                            this.A07 = null;
                        }
                        this.A06.removeOnAttachStateChangeListener(this.A0K);
                        this.A08.onDismiss();
                        return;
                    }
                }
                if (z2) {
                    ((AnonymousClass0OK) list.get(0)).A01.A0G(false);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public boolean AY0(AnonymousClass0Cw r5) {
        Iterator it = this.A0O.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass0OK r1 = (AnonymousClass0OK) it.next();
                if (r5 == r1.A01) {
                    r1.A02.A0B.requestFocus();
                    break;
                }
            } else if (!r5.hasVisibleItems()) {
                return false;
            } else {
                A06(r5);
                C12940lD r0 = this.A09;
                if (r0 != null) {
                    r0.AUB(r5);
                    return true;
                }
            }
        }
        return true;
    }

    public void Ade(C12940lD r1) {
        this.A09 = r1;
    }

    public void AfT() {
        if (!AJh()) {
            List<C016607w> list = this.A0N;
            for (C016607w A0A2 : list) {
                A0A(A0A2);
            }
            list.clear();
            View view = this.A05;
            this.A06 = view;
            if (view != null) {
                boolean A1W = AnonymousClass000.A1W(this.A07);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A07 = viewTreeObserver;
                if (A1W) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0L);
                }
                this.A06.addOnAttachStateChangeListener(this.A0K);
            }
        }
    }

    public void AhS(boolean z2) {
        for (AnonymousClass0OK r0 : this.A0O) {
            ListAdapter adapter = r0.A02.A0B.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((AnonymousClass0C5) adapter).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        List list = this.A0O;
        int size = list.size();
        if (size > 0) {
            AnonymousClass0OK[] r2 = (AnonymousClass0OK[]) list.toArray(new AnonymousClass0OK[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    AnonymousClass0OK r1 = r2[size];
                    if (r1.A02.A0A.isShowing()) {
                        r1.A02.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void onDismiss() {
        List list = this.A0O;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0OK r1 = (AnonymousClass0OK) list.get(i2);
            if (!r1.A02.A0A.isShowing()) {
                r1.A01.A0G(false);
                return;
            }
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
