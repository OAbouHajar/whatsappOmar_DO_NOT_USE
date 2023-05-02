package com.obwhatsapp.youbasha.ui.lockV2;

import a.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import c.c;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.c1;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.y0;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;

/* compiled from: XFMFile */
public abstract class LockBaseActivity extends Activity {
    public static String lockWallPath = a.f(new StringBuilder(), yo.datafolder, "files/lock_w.jpg");
    protected LockOptions mLockOptions;

    public static void StartClass(Activity activity, Class<?> cls) {
        activity.startActivity(new Intent(yo.getCtx(), cls));
    }

    public static void a(LockBaseActivity lockBaseActivity, EditText editText) {
        lockBaseActivity.getClass();
        String obj = editText.getText().toString();
        if (!obj.isEmpty()) {
            if (!obj.isEmpty() && shp.getStringPriv(Deobfuscator$app$Custom.getString(-25948538109377L)).equals(utils.bsf(obj, 2))) {
                if (lockBaseActivity.mLockOptions.isJIDset()) {
                    LockUtils.disableLockForJID(lockBaseActivity.mLockOptions.getJID());
                } else {
                    LockUtils.disableAppLock();
                    StartClass(lockBaseActivity, HomeActivity.class);
                }
                Toast.makeText(lockBaseActivity, yo.getString("done"), 1).show();
                lockBaseActivity.finish();
                return;
            }
        }
        Toast.makeText(lockBaseActivity, "Incorrect", 0).show();
    }

    public static void auth_success_actions(Activity activity, LockOptions lockOptions) {
        if (lockOptions == null && hasLockOptionsBundle(activity)) {
            lockOptions = new LockOptions(activity.getIntent().getBundleExtra("lockoptions"));
        } else if (lockOptions == null) {
            return;
        }
        activity.setResult(-11);
        if (lockOptions.f1285a.getBoolean("isDisableLock")) {
            if (lockOptions.isJIDset()) {
                LockUtils.disableLockForJID(lockOptions.getJID());
            } else {
                LockUtils.disableAppLock();
            }
        }
        Bundle bundle = lockOptions.f1285a;
        boolean z2 = false;
        if (bundle.getBoolean("isConversation")) {
            String jid = lockOptions.getJID();
            activity.setResult(jid == null ? 0 : jid.hashCode());
        }
        if (bundle.getBoolean("JCAS")) {
            activity.finish();
            return;
        }
        if (((Intent) bundle.getParcelable("passedIntent")) != null) {
            z2 = true;
        }
        if (z2) {
            activity.startActivity((Intent) bundle.getParcelable("passedIntent"));
        } else {
            StartClass(activity, HomeActivity.class);
        }
    }

    public static Drawable getWall() {
        try {
            if (!new File(lockWallPath).exists() || !shp.getBooleanPriv("customlockwV2")) {
                return null;
            }
            return utils.buffWallp(lockWallPath, (Drawable) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean hasLockOptionsBundle(Activity activity) {
        return activity.getIntent().hasExtra("lockoptions");
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(yo.getCtx());
    }

    public abstract /* synthetic */ void auth_failed();

    public void auth_success() {
        auth_success_actions(this, this.mLockOptions);
        finish();
    }

    public abstract /* synthetic */ void authenticate();

    public abstract /* synthetic */ void change_pass(String str);

    public abstract /* synthetic */ boolean check_lock_is_set();

    @SuppressLint({"SourceLockedOrientationActivity"})
    public void init(String str) {
        String str2;
        String str3;
        try {
            setRequestedOrientation(1);
        } catch (Exception unused) {
        }
        super.setContentView(yo.getID(str, "layout"));
        this.mLockOptions = new LockOptions(getIntent().getBundleExtra("lockoptions"));
        View findViewById = findViewById(others.getID("relmain", "id"));
        if (findViewById != null) {
            findViewById.setBackground(getWall());
        }
        Toolbar toolbar = (Toolbar) findViewById(others.getID("acjtoolbar", "id"));
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new c(this, 12));
            if (this.mLockOptions.f1285a.getBoolean("isDisableLock")) {
                str3 = "disable";
            } else if (this.mLockOptions.f1285a.getBoolean("isConversation")) {
                str3 = LockUtils.PATTERN_LOCK;
            } else {
                str2 = yo.pname;
                toolbar.setTitle((CharSequence) str2);
                int primaryTextColor = ColorStore.getPrimaryTextColor();
                toolbar.setTitleTextColor(primaryTextColor);
                toolbar.setNavigationOnClickListener(new y0(this, 1));
                toolbar.setBackgroundColor(ColorStore.getPrimaryColor());
                toolbar.setNavigationIcon(others.coloredDrawable("ic_back_gray", primaryTextColor, PorterDuff.Mode.SRC_ATOP));
            }
            str2 = yo.getString(str3);
            toolbar.setTitle((CharSequence) str2);
            int primaryTextColor2 = ColorStore.getPrimaryTextColor();
            toolbar.setTitleTextColor(primaryTextColor2);
            toolbar.setNavigationOnClickListener(new y0(this, 1));
            toolbar.setBackgroundColor(ColorStore.getPrimaryColor());
            toolbar.setNavigationIcon(others.coloredDrawable("ic_back_gray", primaryTextColor2, PorterDuff.Mode.SRC_ATOP));
        }
        others.setStatusNavBar(this);
    }

    public abstract /* synthetic */ void load_lock_values();

    public void reset_lock() {
        if (!RecoveryQuestion.isRecoveryQSet()) {
            Toast.makeText(this, yo.getString("First_set") + yo.getString("yoRecoveryQ") + yo.getString("Security_lock"), 1).show();
            return;
        }
        EditText editText = new EditText(this);
        editText.setInputType(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        CustomAlertDialogBuilder customAlertDialogBuilder = new CustomAlertDialogBuilder(this);
        customAlertDialogBuilder.setTitle((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-25862638763457L)));
        customAlertDialogBuilder.setMessage((CharSequence) RecoveryQuestion.b(Deobfuscator$app$Custom.getString(-25888408567233L), RecoveryQuestion.c()));
        customAlertDialogBuilder.setView((View) editText);
        customAlertDialogBuilder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new c1(this, editText, 3));
        customAlertDialogBuilder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(26));
        customAlertDialogBuilder.show();
    }
}
