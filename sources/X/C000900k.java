package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape119S0100000_I0;
import com.facebook.redex.IDxSProviderShape316S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.youbasha.others;
import java.util.ArrayList;

/* renamed from: X.00k  reason: invalid class name and case insensitive filesystem */
public class C000900k extends C001000l implements C002300y, C002400z, AnonymousClass010 {
    public static final String A02 = "androidx:appcompat";
    public Resources A00;
    public C004301w A01;

    public C000900k() {
        A02();
    }

    public C000900k(int i2) {
        super(i2);
        A02();
    }

    public static Intent A00(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String A002 = C015407k.A00(activity.getComponentName(), activity);
            if (A002 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, A002);
            try {
                return C015407k.A00(componentName, activity) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
                sb.append(A002);
                sb.append("' in manifest");
                Log.e("NavUtils", sb.toString());
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent A01(ComponentName componentName, Context context) {
        String A002 = C015407k.A00(componentName, context);
        if (A002 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A002);
        return C015407k.A00(componentName2, context) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    private void A02() {
        this.A07.A01.A05(new IDxSProviderShape316S0100000_I0(this, 1), A02);
        A0T(new IDxAListenerShape119S0100000_I0(this, 1));
    }

    private void A03() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        AnonymousClass05Z.A00(getWindow().getDecorView(), this);
    }

    public static void A04() {
    }

    public static void A05() {
    }

    @Deprecated
    public static void A06() {
    }

    @Deprecated
    public static void A07() {
    }

    @Deprecated
    public static void A08() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A09(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x003d
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003d
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003d
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003d
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003d
            android.view.Window r1 = r2.getWindow()
            if (r1 == 0) goto L_0x003d
            android.view.View r0 = r1.getDecorView()
            if (r0 == 0) goto L_0x003d
            android.view.View r0 = r1.getDecorView()
            boolean r1 = r0.dispatchKeyShortcutEvent(r3)
            r0 = 1
            if (r1 != 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000900k.A09(android.view.KeyEvent):boolean");
    }

    public void A0a() {
        A1S().A07();
    }

    public C004301w A1S() {
        C004301w r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass06G r02 = new AnonymousClass06G(this, (Window) null, this, this);
        this.A01 = r02;
        return r02;
    }

    public void A1T() {
        new AnonymousClass0ZG((AnonymousClass06G) A1S());
    }

    public void A1U() {
        A00(this);
    }

    @Deprecated
    public void A1V() {
    }

    public void A1W() {
    }

    public void A1X(int i2) {
        AnonymousClass06G r4 = (AnonymousClass06G) A1S();
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = AnonymousClass2EA.A03;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (!r4.A0h || i2 != 108) {
            if (r4.A0Y && i2 == 1) {
                r4.A0Y = false;
            } else if (i2 != 1) {
                if (i2 == 2) {
                    r4.A0P();
                    r4.A0X = true;
                    return;
                } else if (i2 == 5) {
                    r4.A0P();
                    r4.A0W = true;
                    return;
                } else if (i2 == 10) {
                    r4.A0P();
                    r4.A0e = true;
                    return;
                } else if (i2 == 108) {
                    r4.A0P();
                    r4.A0Y = true;
                    return;
                } else if (i2 != 109) {
                    r4.A08.requestFeature(i2);
                    return;
                } else {
                    r4.A0P();
                    r4.A0d = true;
                    return;
                }
            }
            r4.A0P();
            r4.A0h = true;
        }
    }

    public void A1Y(Intent intent) {
        navigateUpTo(intent);
    }

    public void A1Z(Intent intent) {
        shouldUpRecreateTask(intent);
    }

    public void A1a(C09210f7 r6) {
        Intent intent;
        if (((this instanceof AnonymousClass010) && (intent = A00(this)) != null) || (intent = A00(this)) != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(r6.A00.getPackageManager());
            }
            ArrayList arrayList = r6.A01;
            int size = arrayList.size();
            try {
                Context context = r6.A00;
                for (Intent A012 = A01(component, context); A012 != null; A012 = A01(A012.getComponent(), context)) {
                    arrayList.add(size, A012);
                }
                arrayList.add(intent);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e2);
            }
        }
    }

    @Deprecated
    public void A1b(boolean z2) {
    }

    public boolean A1c() {
        Intent A002 = A00(this);
        if (A002 == null) {
            return false;
        }
        if (shouldUpRecreateTask(A002)) {
            C09210f7 r5 = new C09210f7(this);
            A1a(r5);
            ArrayList arrayList = r5.A01;
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                r5.A00.startActivities(intentArr, (Bundle) null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(A002);
            return true;
        }
    }

    public C005402i AGK() {
        AnonymousClass06G r0 = (AnonymousClass06G) A1S();
        r0.A0O();
        return r0.A0B;
    }

    public void AYX(AnonymousClass05J r1) {
    }

    public void AYY(AnonymousClass05J r1) {
    }

    public void Aem(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        AnonymousClass06G r3 = (AnonymousClass06G) A1S();
        Object obj = r3.A0l;
        if (obj instanceof Activity) {
            r3.A0O();
            C005402i r1 = r3.A0B;
            if (!(r1 instanceof C02480Cg)) {
                r3.A05 = null;
                if (r1 != null) {
                    r1.A05();
                }
                if (toolbar != null) {
                    AnonymousClass09B r0 = new AnonymousClass09B(r3.A0D, toolbar, ((Activity) obj).getTitle());
                    r3.A0B = r0;
                    window = r3.A08;
                    callback = r0.A00;
                } else {
                    r3.A0B = null;
                    window = r3.A08;
                    callback = r3.A0D;
                }
                window.setCallback(callback);
                r3.A07();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public AnonymousClass05J AgA(C009804r r2) {
        return A1S().A05(r2);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A03();
        A1S().A0F(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(A1S().A03(context));
    }

    public void closeOptionsMenu() {
        C005402i x2 = x();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (x2 == null || !x2.A0S()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C005402i x2 = x();
        if (keyCode != 82 || x2 == null || !x2.A0X(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public View findViewById(int i2) {
        AnonymousClass06G r0 = (AnonymousClass06G) A1S();
        r0.A0M();
        return r0.A08.findViewById(i2);
    }

    public MenuInflater getMenuInflater() {
        AnonymousClass06G r2 = (AnonymousClass06G) A1S();
        MenuInflater menuInflater = r2.A05;
        if (menuInflater != null) {
            return menuInflater;
        }
        r2.A0O();
        C005402i r0 = r2.A0B;
        C02350Bg r1 = new C02350Bg(r0 != null ? r0.A02() : r2.A0j);
        r2.A05 = r1;
        return r1;
    }

    public Resources getResources() {
        Resources resources = this.A00;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        A1S().A07();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A00 != null) {
            this.A00.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        A1S().A0C(configuration);
    }

    public void onContentChanged() {
        A1V();
    }

    public void onDestroy() {
        super.onDestroy();
        A1S().A08();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (A09(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        C005402i x2 = x();
        if (menuItem.getItemId() != 16908332 || x2 == null || (x2.A01() & 4) == 0) {
            return false;
        }
        return A1c();
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AnonymousClass06G) A1S()).A0M();
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass06G r0 = (AnonymousClass06G) A1S();
        r0.A0O();
        C005402i r1 = r0.A0B;
        if (r1 != null) {
            r1.A0R(true);
        }
    }

    public void onStart() {
        super.onStart();
        AnonymousClass06G r1 = (AnonymousClass06G) A1S();
        r1.A0f = true;
        r1.A0V(true);
    }

    public void onStop() {
        super.onStop();
        A1S().A09();
    }

    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        A1S().A0H(charSequence);
    }

    public void openOptionsMenu() {
        C005402i x2 = x();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (x2 == null || !x2.A0U()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i2) {
        A03();
        A1S().A0A(i2);
    }

    public void setContentView(View view) {
        A03();
        A1S().A0E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A03();
        A1S().A0G(view, layoutParams);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        ((AnonymousClass06G) A1S()).A02 = i2;
    }

    public C005402i x() {
        return others.ModContPick(AGK());
    }
}
