package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: X.0YT  reason: invalid class name */
public class AnonymousClass0YT implements ActionMode.Callback {
    public Class A00;
    public Method A01;
    public boolean A02;
    public boolean A03 = false;
    public final ActionMode.Callback A04;
    public final TextView A05;

    public AnonymousClass0YT(ActionMode.Callback callback, TextView textView) {
        this.A04 = callback;
        this.A05 = textView;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.A04.onActionItemClicked(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.A04.onCreateActionMode(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.A04.onDestroyActionMode(actionMode);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method A0t;
        boolean z2;
        String str;
        TextView textView = this.A05;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.A03) {
            this.A03 = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.A00 = cls;
                this.A01 = AnonymousClass000.A0t(cls, Integer.TYPE, "removeItemAt", new Class[1], 0);
                this.A02 = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.A00 = null;
                this.A01 = null;
                this.A02 = false;
            }
        }
        try {
            if (!this.A02 || !this.A00.isInstance(menu)) {
                A0t = AnonymousClass000.A0t(menu.getClass(), Integer.TYPE, "removeItemAt", new Class[1], 0);
            } else {
                A0t = this.A01;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, size, 0);
                    A0t.invoke(menu, objArr);
                }
            }
            ArrayList A0u = AnonymousClass000.A0u();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    String packageName = context.getPackageName();
                    ActivityInfo activityInfo = next.activityInfo;
                    if (packageName.equals(activityInfo.packageName) || (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0))) {
                        A0u.add(next);
                    }
                }
            }
            for (int i2 = 0; i2 < A0u.size(); i2++) {
                ResolveInfo resolveInfo = (ResolveInfo) A0u.get(i2);
                MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor()) {
                    z2 = true;
                    if (textView.isEnabled()) {
                        Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z2);
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                    }
                }
                z2 = false;
                Intent putExtra2 = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z2);
                ActivityInfo activityInfo22 = resolveInfo.activityInfo;
                add.setIntent(putExtra2.setClassName(activityInfo22.packageName, activityInfo22.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.A04.onPrepareActionMode(actionMode, menu);
    }
}
