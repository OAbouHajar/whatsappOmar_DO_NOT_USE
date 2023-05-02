package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: X.0av  reason: invalid class name and case insensitive filesystem */
public final class C07290av implements AnonymousClass09J {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = 0;
    public int A04 = 4096;
    public int A05 = 4096;
    public int A06 = 0;
    public Intent A07;
    public ColorStateList A08 = null;
    public PorterDuff.Mode A09 = null;
    public Drawable A0A;
    public MenuItem.OnActionExpandListener A0B;
    public MenuItem.OnMenuItemClickListener A0C;
    public View A0D;
    public C016607w A0E;
    public AnonymousClass0Cw A0F;
    public C04760Nv A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;
    public boolean A0O = false;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;

    public C07290av(C016607w r3, CharSequence charSequence, int i2, int i3, int i4, int i5, int i6) {
        this.A0E = r3;
        this.A0R = i3;
        this.A0Q = i2;
        this.A0P = i4;
        this.A0S = i5;
        this.A0I = charSequence;
        this.A06 = i6;
    }

    public void A00(View view) {
        int i2;
        this.A0D = view;
        this.A0G = null;
        if (view != null && view.getId() == -1 && (i2 = this.A0R) > 0) {
            view.setId(i2);
        }
        C016607w r1 = this.A0E;
        r1.A0D = true;
        r1.A0F(true);
    }

    public boolean A01() {
        if ((this.A06 & 8) == 0) {
            return false;
        }
        if (this.A0D == null) {
            C04760Nv r0 = this.A0G;
            if (r0 == null) {
                return false;
            }
            View onCreateActionView = ((AnonymousClass0EM) r0).A00.onCreateActionView(this);
            this.A0D = onCreateActionView;
            return onCreateActionView != null;
        }
    }

    public C04760Nv AGL() {
        return this.A0G;
    }

    public AnonymousClass09J Adi(CharSequence charSequence) {
        this.A0H = charSequence;
        C016607w.A00(this);
        return this;
    }

    public AnonymousClass09J Aen(C04760Nv r3) {
        C04760Nv r1 = this.A0G;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A0D = null;
        this.A0G = r3;
        this.A0E.A0F(true);
        C04760Nv r12 = this.A0G;
        if (r12 != null) {
            C02560Cx r13 = (C02560Cx) r12;
            r13.A00 = new AnonymousClass0b3(this);
            r13.A00.setVisibilityListener(r13);
        }
        return this;
    }

    public AnonymousClass09J Aes(CharSequence charSequence) {
        this.A0K = charSequence;
        C016607w.A00(this);
        return this;
    }

    public boolean collapseActionView() {
        if ((this.A06 & 8) != 0) {
            if (this.A0D == null) {
                return true;
            }
            MenuItem.OnActionExpandListener onActionExpandListener = this.A0B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
                return this.A0E.A0M(this);
            }
        }
        return false;
    }

    public boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if (!A01() || ((onActionExpandListener = this.A0B) != null && !onActionExpandListener.onMenuItemActionExpand(this))) {
            return false;
        }
        return this.A0E.A0N(this);
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A0D;
        if (view != null) {
            return view;
        }
        C04760Nv r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        View onCreateActionView = ((AnonymousClass0EM) r0).A00.onCreateActionView(this);
        this.A0D = onCreateActionView;
        return onCreateActionView;
    }

    public int getAlphabeticModifiers() {
        return this.A04;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    public CharSequence getContentDescription() {
        return this.A0H;
    }

    public int getGroupId() {
        return this.A0Q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getIcon() {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r1 = r2.A0A
            if (r1 != 0) goto L_0x0017
            int r1 = r2.A03
            if (r1 == 0) goto L_0x0041
            X.07w r0 = r2.A0E
            android.content.Context r0 = r0.A0N
            android.graphics.drawable.Drawable r1 = X.AnonymousClass06L.A01(r0, r1)
            r0 = 0
            r2.A03 = r0
            r2.A0A = r1
            if (r1 == 0) goto L_0x0040
        L_0x0017:
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x0023
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0040
        L_0x0023:
            android.graphics.drawable.Drawable r0 = X.C018208n.A03(r1)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0034
            android.content.res.ColorStateList r0 = r2.A08
            X.C018208n.A04(r0, r1)
        L_0x0034:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x003d
            android.graphics.PorterDuff$Mode r0 = r2.A09
            X.C018208n.A07(r0, r1)
        L_0x003d:
            r0 = 0
            r2.A0O = r0
        L_0x0040:
            return r1
        L_0x0041:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07290av.getIcon():android.graphics.drawable.Drawable");
    }

    public ColorStateList getIconTintList() {
        return this.A08;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A09;
    }

    public Intent getIntent() {
        return this.A07;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.A0R;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.A05;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return this.A0P;
    }

    public SubMenu getSubMenu() {
        return this.A0F;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.A0I;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0J;
        if (charSequence == null) {
            charSequence = this.A0I;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.A0K;
    }

    public boolean hasSubMenu() {
        return AnonymousClass000.A1V(this.A0F);
    }

    public boolean isActionViewExpanded() {
        return this.A0N;
    }

    public boolean isCheckable() {
        return (this.A02 & 1) == 1;
    }

    public boolean isChecked() {
        return AnonymousClass000.A1R(this.A02 & 2, 2);
    }

    public boolean isEnabled() {
        return AnonymousClass000.A1O(this.A02 & 16);
    }

    public boolean isVisible() {
        C04760Nv r0 = this.A0G;
        return (r0 == null || !((AnonymousClass0EM) r0).A00.overridesItemVisibility()) ? (this.A02 & 8) == 0 : (this.A02 & 8) == 0 && ((AnonymousClass0EM) this.A0G).A00.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        Context context = this.A0E.A0N;
        A00(LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false));
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A00(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.A00 != c2) {
            this.A00 = Character.toLowerCase(c2);
            C016607w.A00(this);
        }
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.A00 == c2 && this.A04 == i2) {
            return this;
        }
        this.A00 = Character.toLowerCase(c2);
        this.A04 = KeyEvent.normalizeMetaState(i2);
        C016607w.A00(this);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.A02;
        boolean z3 = z2 | (i2 & true);
        this.A02 = z3 ? 1 : 0;
        if (i2 != z3) {
            C016607w.A00(this);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        int i2 = this.A02;
        if ((i2 & 4) != 0) {
            C016607w r9 = this.A0E;
            int groupId = getGroupId();
            ArrayList arrayList = r9.A07;
            int size = arrayList.size();
            r9.A08();
            for (int i3 = 0; i3 < size; i3++) {
                C07290av r10 = (C07290av) arrayList.get(i3);
                if (r10.getGroupId() == groupId && (r10.A02 & 4) != 0 && r10.isCheckable()) {
                    boolean A1Y = AnonymousClass000.A1Y(r10, this);
                    int i4 = r10.A02;
                    int i5 = i4 & -3;
                    int i6 = 0;
                    if (A1Y) {
                        i6 = 2;
                    }
                    int i7 = i6 | i5;
                    r10.A02 = i7;
                    if (i4 != i7) {
                        r10.A0E.A0F(false);
                    }
                }
            }
            r9.A07();
        } else {
            int i8 = i2 & -3;
            int i9 = 0;
            if (z2) {
                i9 = 2;
            }
            int i10 = i9 | i8;
            this.A02 = i10;
            if (i2 != i10) {
                this.A0E.A0F(false);
                return this;
            }
        }
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        Adi(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        int i2 = this.A02;
        this.A02 = z2 ? i2 | 16 : i2 & -17;
        C016607w.A00(this);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.A0A = null;
        this.A03 = i2;
        this.A0O = true;
        C016607w.A00(this);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A03 = 0;
        this.A0A = drawable;
        this.A0O = true;
        this.A0E.A0F(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A08 = colorStateList;
        this.A0L = true;
        this.A0O = true;
        C016607w.A00(this);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A09 = mode;
        this.A0M = true;
        this.A0O = true;
        C016607w.A00(this);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A07 = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.A01 != c2) {
            this.A01 = c2;
            C016607w.A00(this);
        }
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.A01 == c2 && this.A05 == i2) {
            return this;
        }
        this.A01 = c2;
        this.A05 = KeyEvent.normalizeMetaState(i2);
        C016607w.A00(this);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0C = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.A01 = c2;
        this.A00 = Character.toLowerCase(c3);
        C016607w.A00(this);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.A01 = c2;
        this.A05 = KeyEvent.normalizeMetaState(i2);
        this.A00 = Character.toLowerCase(c3);
        this.A04 = KeyEvent.normalizeMetaState(i3);
        C016607w.A00(this);
        return this;
    }

    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.A06 = i2;
            C016607w r1 = this.A0E;
            r1.A0D = true;
            r1.A0F(true);
            return;
        }
        throw AnonymousClass000.A0T("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.A0E.A0N.getString(i2));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A0I = charSequence;
        C016607w.A00(this);
        AnonymousClass0Cw r0 = this.A0F;
        if (r0 != null) {
            r0.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0J = charSequence;
        C016607w.A00(this);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        Aes(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        int i2 = this.A02;
        int i3 = i2 & -9;
        int i4 = 8;
        if (z2) {
            i4 = 0;
        }
        int i5 = i4 | i3;
        this.A02 = i5;
        if (i2 != i5) {
            C016607w r1 = this.A0E;
            r1.A0F = true;
            r1.A0F(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
