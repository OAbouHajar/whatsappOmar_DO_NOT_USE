package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: X.0Cu  reason: invalid class name */
public class AnonymousClass0Cu extends AnonymousClass0PO implements Menu {
    public final C016707x A00;

    public AnonymousClass0Cu(Context context, C016707x r3) {
        super(context);
        if (r3 != null) {
            this.A00 = r3;
            return;
        }
        throw AnonymousClass000.A0T("Wrapped Object can not be null.");
    }

    public MenuItem add(int i2) {
        return A00(this.A00.add(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return A00(this.A00.add(i2, i3, i4, i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return A00(this.A00.add(i2, i3, i4, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return A00(this.A00.add(charSequence));
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.A00.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = A00(menuItemArr2[i6]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i2) {
        return this.A00.addSubMenu(i2);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return this.A00.addSubMenu(i2, i3, i4, i5);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return this.A00.addSubMenu(i2, i3, i4, charSequence);
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.A00.addSubMenu(charSequence);
    }

    public void clear() {
        AnonymousClass00O r0 = this.A00;
        if (r0 != null) {
            r0.clear();
        }
        this.A00.clear();
    }

    public void close() {
        this.A00.close();
    }

    public MenuItem findItem(int i2) {
        return A00(this.A00.findItem(i2));
    }

    public MenuItem getItem(int i2) {
        return A00(this.A00.getItem(i2));
    }

    public boolean hasVisibleItems() {
        return this.A00.hasVisibleItems();
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.A00.isShortcutKey(i2, keyEvent);
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return this.A00.performIdentifierAction(i2, i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.A00.performShortcut(i2, keyEvent, i3);
    }

    public void removeGroup(int i2) {
        if (this.A00 != null) {
            int i3 = 0;
            while (true) {
                AnonymousClass00O r1 = this.A00;
                if (i3 >= r1.size()) {
                    break;
                }
                if (((MenuItem) r1.A02[i3 << 1]).getGroupId() == i2) {
                    this.A00.A06(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.A00.removeGroup(i2);
    }

    public void removeItem(int i2) {
        if (this.A00 != null) {
            int i3 = 0;
            while (true) {
                AnonymousClass00O r1 = this.A00;
                if (i3 >= r1.size()) {
                    break;
                } else if (((MenuItem) r1.A02[i3 << 1]).getItemId() == i2) {
                    this.A00.A06(i3);
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.A00.removeItem(i2);
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.A00.setGroupCheckable(i2, z2, z3);
    }

    public void setGroupEnabled(int i2, boolean z2) {
        this.A00.setGroupEnabled(i2, z2);
    }

    public void setGroupVisible(int i2, boolean z2) {
        this.A00.setGroupVisible(i2, z2);
    }

    public void setQwertyMode(boolean z2) {
        this.A00.setQwertyMode(z2);
    }

    public int size() {
        return this.A00.size();
    }
}
