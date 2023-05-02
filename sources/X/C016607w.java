package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.07w  reason: invalid class name and case insensitive filesystem */
public class C016607w implements C016707x {
    public static final int[] A0P = {1, 4, 5, 3, 2, 0};
    public int A00 = 0;
    public Drawable A01;
    public View A02;
    public AnonymousClass06H A03;
    public C07290av A04;
    public CharSequence A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A;
    public CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = false;
    public final Context A0N;
    public final Resources A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005c, code lost:
        if (X.AnonymousClass0XB.A04(r1, android.view.ViewConfiguration.get(r1)) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C016607w(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            r1 = 0
            r4.A00 = r1
            r4.A0J = r1
            r4.A0G = r1
            r4.A0M = r1
            r4.A0H = r1
            r4.A0E = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A09 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.A0B = r0
            r4.A0C = r1
            r4.A0N = r5
            android.content.res.Resources r3 = r5.getResources()
            r4.A0O = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A07 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A0A = r0
            r1 = 1
            r4.A0F = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A06 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A08 = r0
            r4.A0D = r1
            r2 = 1
            android.content.res.Configuration r0 = r3.getConfiguration()
            int r0 = r0.keyboard
            if (r0 == r1) goto L_0x0061
            android.content.Context r1 = r4.A0N
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            boolean r0 = X.AnonymousClass0XB.A04(r1, r0)
            if (r0 == 0) goto L_0x0061
        L_0x005e:
            r4.A0L = r2
            return
        L_0x0061:
            r2 = 0
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016607w.<init>(android.content.Context):void");
    }

    public static void A00(C07290av r1) {
        r1.A0E.A0F(false);
    }

    public MenuItem A01(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = i4;
        int i7 = (-65536 & i4) >> 16;
        if (i7 >= 0) {
            int[] iArr = A0P;
            if (i7 < iArr.length) {
                int i8 = (i4 & 65535) | (iArr[i7] << 16);
                C07290av r3 = new C07290av(this, charSequence, i2, i3, i6, i8, this.A00);
                ArrayList arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((C07290av) arrayList.get(size)).A0S <= i8) {
                            i5 = size + 1;
                            break;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                arrayList.add(i5, r3);
                A0F(true);
                return r3;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public C016607w A02() {
        return this;
    }

    public C07290av A03(KeyEvent keyEvent, int i2) {
        ArrayList arrayList = this.A09;
        arrayList.clear();
        A0C(keyEvent, arrayList, i2);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (C07290av) arrayList.get(0);
            }
            boolean A0I2 = A0I();
            for (int i3 = 0; i3 < size; i3++) {
                C07290av r2 = (C07290av) arrayList.get(i3);
                char alphabeticShortcut = A0I2 ? r2.getAlphabeticShortcut() : r2.getNumericShortcut();
                char[] cArr = keyData.meta;
                if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (A0I2 && alphabeticShortcut == 8 && i2 == 67))) {
                    return r2;
                }
            }
        }
        return null;
    }

    public String A04() {
        return "android:menu:actionviewstates";
    }

    public ArrayList A05() {
        if (this.A0F) {
            ArrayList arrayList = this.A0A;
            arrayList.clear();
            ArrayList arrayList2 = this.A07;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C07290av r1 = (C07290av) arrayList2.get(i2);
                if (r1.isVisible()) {
                    arrayList.add(r1);
                }
            }
            this.A0F = false;
            this.A0D = true;
        }
        return this.A0A;
    }

    public void A06() {
        ArrayList A052 = A05();
        if (this.A0D) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C13350lt r0 = (C13350lt) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z2 |= r0.A97();
                }
            }
            if (z2) {
                ArrayList arrayList = this.A06;
                arrayList.clear();
                ArrayList arrayList2 = this.A08;
                arrayList2.clear();
                int size = A052.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C07290av r3 = (C07290av) A052.get(i2);
                    ArrayList arrayList3 = arrayList2;
                    if ((r3.A02 & 32) == 32) {
                        arrayList3 = arrayList;
                    }
                    arrayList3.add(r3);
                }
            } else {
                this.A06.clear();
                ArrayList arrayList4 = this.A08;
                arrayList4.clear();
                arrayList4.addAll(A05());
            }
            this.A0D = false;
        }
    }

    public void A07() {
        this.A0J = false;
        if (this.A0G) {
            this.A0G = false;
            A0F(this.A0M);
        }
    }

    public void A08() {
        if (!this.A0J) {
            this.A0J = true;
            this.A0G = false;
            this.A0M = false;
        }
    }

    public void A09(Context context, C13350lt r4) {
        this.A0B.add(new WeakReference(r4));
        r4.AIA(context, this);
        this.A0D = true;
    }

    public void A0A(Bundle bundle) {
        MenuItem findItem;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(A04());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C016607w) item.getSubMenu()).A0A(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 > 0 && (findItem = findItem(i3)) != null) {
            findItem.expandActionView();
        }
    }

    public void A0B(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C016607w) item.getSubMenu()).A0B(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(A04(), sparseArray);
        }
    }

    public void A0C(KeyEvent keyEvent, List list, int i2) {
        char numericShortcut;
        int numericModifiers;
        boolean A0I2 = A0I();
        KeyEvent keyEvent2 = keyEvent;
        int modifiers = keyEvent2.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        int i3 = i2;
        if (keyEvent2.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList = this.A07;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C07290av r2 = (C07290av) arrayList.get(i4);
                List list2 = list;
                if (r2.hasSubMenu()) {
                    ((C016607w) r2.getSubMenu()).A0C(keyEvent2, list2, i3);
                }
                if (A0I2) {
                    numericShortcut = r2.getAlphabeticShortcut();
                    numericModifiers = r2.getAlphabeticModifiers();
                } else {
                    numericShortcut = r2.getNumericShortcut();
                    numericModifiers = r2.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (A0I2 && numericShortcut == 8 && i3 == 67)) && r2.isEnabled()) {
                        list2.add(r2);
                    }
                }
            }
        }
    }

    public void A0D(AnonymousClass06H r1) {
        this.A03 = r1;
    }

    public void A0E(C13350lt r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == r5) {
                copyOnWriteArrayList.remove(reference);
            }
        }
    }

    public void A0F(boolean z2) {
        if (!this.A0J) {
            if (z2) {
                this.A0F = true;
                this.A0D = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
            if (!copyOnWriteArrayList.isEmpty()) {
                A08();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    C13350lt r0 = (C13350lt) reference.get();
                    if (r0 == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        r0.AhS(z2);
                    }
                }
                A07();
                return;
            }
            return;
        }
        this.A0G = true;
        if (z2) {
            this.A0M = true;
        }
    }

    public final void A0G(boolean z2) {
        if (!this.A0E) {
            this.A0E = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C13350lt r0 = (C13350lt) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    r0.AOk(this, z2);
                }
            }
            this.A0E = false;
        }
    }

    public boolean A0H() {
        return this.A0C;
    }

    public boolean A0I() {
        return this.A0K;
    }

    public boolean A0J() {
        return this.A0L;
    }

    public boolean A0K(MenuItem menuItem, C016607w r4) {
        AnonymousClass06H r0 = this.A03;
        return r0 != null && r0.ATe(menuItem, r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (((X.AnonymousClass0EM) r4).A00.hasSubMenu() == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r7 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if ((r11 & 1) == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r7 == false) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MenuItem r9, X.C13350lt r10, int r11) {
        /*
            r8 = this;
            X.0av r9 = (X.C07290av) r9
            r3 = 0
            if (r9 == 0) goto L_0x00d5
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00d5
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.A0C
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto L_0x00a7
        L_0x0015:
            r7 = 1
        L_0x0016:
            X.0Nv r4 = r9.A0G
            r6 = 1
            if (r4 == 0) goto L_0x0027
            r0 = r4
            X.0EM r0 = (X.AnonymousClass0EM) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.hasSubMenu()
            r2 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0039
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L_0x0038
        L_0x0035:
            r8.A0G(r6)
        L_0x0038:
            return r7
        L_0x0039:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0046
            if (r2 != 0) goto L_0x0046
            r0 = r11 & 1
            if (r0 != 0) goto L_0x0038
            goto L_0x0035
        L_0x0046:
            r0 = r11 & 4
            if (r0 != 0) goto L_0x004d
            r8.A0G(r3)
        L_0x004d:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0063
            android.content.Context r0 = r8.A0N
            X.0Cw r1 = new X.0Cw
            r1.<init>(r0, r8, r9)
            r9.A0F = r1
            java.lang.CharSequence r0 = r9.getTitle()
            r1.setHeaderTitle((java.lang.CharSequence) r0)
        L_0x0063:
            android.view.SubMenu r5 = r9.getSubMenu()
            X.0Cw r5 = (X.AnonymousClass0Cw) r5
            if (r2 == 0) goto L_0x0072
            X.0EM r4 = (X.AnonymousClass0EM) r4
            android.view.ActionProvider r0 = r4.A00
            r0.onPrepareSubMenu(r5)
        L_0x0072:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.A0B
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00a3
            if (r10 == 0) goto L_0x0080
            boolean r3 = r10.AY0(r5)
        L_0x0080:
            java.util.Iterator r2 = r4.iterator()
        L_0x0084:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.0lt r0 = (X.C13350lt) r0
            if (r0 != 0) goto L_0x009c
            r4.remove(r1)
            goto L_0x0084
        L_0x009c:
            if (r3 != 0) goto L_0x0084
            boolean r3 = r0.AY0(r5)
            goto L_0x0084
        L_0x00a3:
            r7 = r7 | r3
            if (r7 != 0) goto L_0x0038
            goto L_0x0035
        L_0x00a7:
            X.07w r2 = r9.A0E
            boolean r0 = r2.A0K(r9, r2)
            if (r0 != 0) goto L_0x0015
            android.content.Intent r1 = r9.A07
            if (r1 == 0) goto L_0x00c2
            android.content.Context r0 = r2.A0N     // Catch:{ ActivityNotFoundException -> 0x00ba }
            r0.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x00ba }
            goto L_0x0015
        L_0x00ba:
            r2 = move-exception
            java.lang.String r1 = "MenuItemImpl"
            java.lang.String r0 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r1, r0, r2)
        L_0x00c2:
            X.0Nv r0 = r9.A0G
            if (r0 == 0) goto L_0x00d2
            X.0EM r0 = (X.AnonymousClass0EM) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto L_0x00d2
            goto L_0x0015
        L_0x00d2:
            r7 = 0
            goto L_0x0016
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016607w.A0L(android.view.MenuItem, X.0lt, int):boolean");
    }

    public boolean A0M(C07290av r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.A04 == r6) {
            A08();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C13350lt r0 = (C13350lt) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z2 = r0.A6P(this, r6);
                    if (z2) {
                        break;
                    }
                }
            }
            A07();
            if (z2) {
                this.A04 = null;
            }
        }
        return z2;
    }

    public boolean A0N(C07290av r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty()) {
            A08();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C13350lt r0 = (C13350lt) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z2 = r0.A8s(this, r6);
                    if (z2) {
                        break;
                    }
                }
            }
            A07();
            if (z2) {
                this.A04 = r6;
            }
        }
        return z2;
    }

    public MenuItem add(int i2) {
        return A01(0, 0, 0, this.A0O.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return A01(i2, i3, i4, this.A0O.getString(i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return A01(i2, i3, i4, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return A01(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.A0N.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.A0O.getString(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.A0O.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C07290av r2 = (C07290av) A01(i2, i3, i4, charSequence);
        AnonymousClass0Cw r1 = new AnonymousClass0Cw(this.A0N, this, r2);
        r2.A0F = r1;
        r1.setHeaderTitle(r2.getTitle());
        return r1;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void clear() {
        C07290av r0 = this.A04;
        if (r0 != null) {
            A0M(r0);
        }
        this.A07.clear();
        A0F(true);
    }

    public void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0F(false);
    }

    public void close() {
        A0G(true);
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C07290av r1 = (C07290av) this.A07.get(i3);
            if (r1.getItemId() == i2) {
                return r1;
            }
            if (r1.hasSubMenu() && (findItem = r1.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i2) {
        return (MenuItem) this.A07.get(i2);
    }

    public boolean hasVisibleItems() {
        if (!this.A0I) {
            int size = size();
            int i2 = 0;
            while (i2 < size) {
                if (!((C07290av) this.A07.get(i2)).isVisible()) {
                    i2++;
                }
            }
            return false;
        }
        return true;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return A03(keyEvent, i2) != null;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return A0L(findItem(i2), (C13350lt) null, i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        C07290av A032 = A03(keyEvent, i2);
        boolean A0L2 = A032 != null ? A0L(A032, (C13350lt) null, i3) : false;
        if ((i3 & 2) != 0) {
            A0G(true);
        }
        return A0L2;
    }

    public void removeGroup(int i2) {
        int i3 = 0;
        int size = size();
        while (i3 < size) {
            ArrayList arrayList = this.A07;
            if (((C07290av) arrayList.get(i3)).getGroupId() != i2) {
                i3++;
            } else if (i3 >= 0) {
                int size2 = arrayList.size() - i3;
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 >= size2 || ((C07290av) arrayList.get(i3)).getGroupId() != i2) {
                        A0F(true);
                    } else {
                        if (i3 < arrayList.size()) {
                            arrayList.remove(i3);
                        }
                        i4 = i5;
                    }
                }
                A0F(true);
                return;
            } else {
                return;
            }
        }
    }

    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (i3 < size) {
            ArrayList arrayList = this.A07;
            if (((C07290av) arrayList.get(i3)).getItemId() != i2) {
                i3++;
            } else if (i3 >= 0 && i3 < arrayList.size()) {
                arrayList.remove(i3);
                A0F(true);
                return;
            } else {
                return;
            }
        }
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C07290av r2 = (C07290av) arrayList.get(i3);
            if (r2.getGroupId() == i2) {
                int i4 = r2.A02 & -5;
                int i5 = 0;
                if (z3) {
                    i5 = 4;
                }
                r2.A02 = i5 | i4;
                r2.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.A0C = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C07290av r1 = (C07290av) arrayList.get(i3);
            if (r1.getGroupId() == i2) {
                r1.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C07290av r3 = (C07290av) arrayList.get(i3);
            if (r3.getGroupId() == i2) {
                int i4 = r3.A02;
                int i5 = i4 & -9;
                int i6 = 8;
                if (z2) {
                    i6 = 0;
                }
                int i7 = i6 | i5;
                r3.A02 = i7;
                if (i4 != i7) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            A0F(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.A0K = z2;
        A0F(false);
    }

    public int size() {
        return this.A07.size();
    }
}
