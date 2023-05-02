package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.09I  reason: invalid class name */
public class AnonymousClass09I implements AnonymousClass09J {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = 4096;
    public int A04 = 4096;
    public Context A05;
    public Intent A06;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public Drawable A09;
    public MenuItem.OnMenuItemClickListener A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F = false;
    public boolean A0G = false;

    public AnonymousClass09I(Context context, CharSequence charSequence) {
        this.A05 = context;
        this.A0C = charSequence;
    }

    public final void A00() {
        Drawable drawable = this.A09;
        if (drawable == null) {
            return;
        }
        if (this.A0F || this.A0G) {
            Drawable A032 = C018208n.A03(drawable);
            this.A09 = A032;
            Drawable mutate = A032.mutate();
            this.A09 = mutate;
            if (this.A0F) {
                C018208n.A04(this.A07, mutate);
            }
            if (this.A0G) {
                C018208n.A07(this.A08, this.A09);
            }
        }
    }

    public C04760Nv AGL() {
        return null;
    }

    public AnonymousClass09J Adi(CharSequence charSequence) {
        this.A0B = charSequence;
        return this;
    }

    public AnonymousClass09J Aen(C04760Nv r2) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass09J Aes(CharSequence charSequence) {
        this.A0E = charSequence;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.A03;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    public CharSequence getContentDescription() {
        return this.A0B;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.A09;
    }

    public ColorStateList getIconTintList() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public Intent getIntent() {
        return this.A06;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.A04;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.A0C;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0D;
        return charSequence == null ? this.A0C : charSequence;
    }

    public CharSequence getTooltipText() {
        return this.A0E;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.A02 & 1) != 0;
    }

    public boolean isChecked() {
        return (this.A02 & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.A02 & 16) != 0;
    }

    public boolean isVisible() {
        return (this.A02 & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.A00 = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.A00 = Character.toLowerCase(c2);
        this.A03 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.A02 = z2 | (this.A02 & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        int i2 = this.A02 & -3;
        int i3 = 0;
        if (z2) {
            i3 = 2;
        }
        this.A02 = i3 | i2;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.A0B = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        int i2 = this.A02 & -17;
        int i3 = 0;
        if (z2) {
            i3 = 16;
        }
        this.A02 = i3 | i2;
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.A09 = AnonymousClass00T.A04(this.A05, i2);
        A00();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A09 = drawable;
        A00();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0F = true;
        A00();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A08 = mode;
        this.A0G = true;
        A00();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A06 = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.A01 = c2;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.A01 = c2;
        this.A04 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0A = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.A01 = c2;
        this.A00 = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.A01 = c2;
        this.A04 = KeyEvent.normalizeMetaState(i2);
        this.A00 = Character.toLowerCase(c3);
        this.A03 = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.A0C = this.A05.getResources().getString(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A0C = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0D = charSequence;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.A0E = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        int i2 = 8;
        int i3 = this.A02 & 8;
        if (z2) {
            i2 = 0;
        }
        this.A02 = i3 | i2;
        return this;
    }
}
