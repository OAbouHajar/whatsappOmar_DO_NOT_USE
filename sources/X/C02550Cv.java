package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.0Cv  reason: invalid class name and case insensitive filesystem */
public class C02550Cv extends AnonymousClass0PO implements MenuItem {
    public Method A00;
    public final AnonymousClass09J A01;

    public C02550Cv(Context context, AnonymousClass09J r3) {
        super(context);
        if (r3 != null) {
            this.A01 = r3;
            return;
        }
        throw AnonymousClass000.A0T("Wrapped Object can not be null.");
    }

    public void A01() {
        try {
            Method method = this.A00;
            if (method == null) {
                method = AnonymousClass000.A0t(this.A01.getClass(), Boolean.TYPE, "setExclusiveCheckable", new Class[1], 0);
                this.A00 = method;
            }
            method.invoke(this.A01, new Object[]{true});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean collapseActionView() {
        return this.A01.collapseActionView();
    }

    public boolean expandActionView() {
        return this.A01.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C04760Nv AGL = this.A01.AGL();
        if (AGL instanceof AnonymousClass0EM) {
            return ((AnonymousClass0EM) AGL).A00;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.A01.getActionView();
        return actionView instanceof AnonymousClass0CG ? (View) ((AnonymousClass0CG) actionView).A00 : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.A01.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.A01.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.A01.getContentDescription();
    }

    public int getGroupId() {
        return this.A01.getGroupId();
    }

    public Drawable getIcon() {
        return this.A01.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.A01.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A01.getIconTintMode();
    }

    public Intent getIntent() {
        return this.A01.getIntent();
    }

    public int getItemId() {
        return this.A01.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.A01.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.A01.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.A01.getNumericShortcut();
    }

    public int getOrder() {
        return this.A01.getOrder();
    }

    public SubMenu getSubMenu() {
        return this.A01.getSubMenu();
    }

    public CharSequence getTitle() {
        return this.A01.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.A01.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.A01.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.A01.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.A01.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.A01.isCheckable();
    }

    public boolean isChecked() {
        return this.A01.isChecked();
    }

    public boolean isEnabled() {
        return this.A01.isEnabled();
    }

    public boolean isVisible() {
        return this.A01.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C02560Cx r1 = new C02560Cx(this.A01, actionProvider, this);
        AnonymousClass09J r0 = this.A01;
        if (actionProvider == null) {
            r1 = null;
        }
        r0.Aen(r1);
        return this;
    }

    public MenuItem setActionView(int i2) {
        AnonymousClass09J r2 = this.A01;
        r2.setActionView(i2);
        View actionView = r2.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            r2.setActionView((View) new AnonymousClass0CG(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new AnonymousClass0CG(view);
        }
        this.A01.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.A01.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.A01.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.A01.setCheckable(z2);
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        this.A01.setChecked(z2);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.A01.Adi(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.A01.setEnabled(z2);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.A01.setIcon(i2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A01.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A01.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A01.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.A01.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.A01.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A01.setOnActionExpandListener(onActionExpandListener != null ? new AnonymousClass0YW(onActionExpandListener, this) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A01.setOnMenuItemClickListener(onMenuItemClickListener != null ? new AnonymousClass0YX(onMenuItemClickListener, this) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.A01.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.A01.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.A01.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.A01.setShowAsActionFlags(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.A01.setTitle(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A01.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A01.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.A01.Aes(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        return this.A01.setVisible(z2);
    }
}
