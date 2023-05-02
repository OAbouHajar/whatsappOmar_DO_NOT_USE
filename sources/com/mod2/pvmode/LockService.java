package com.mod2.pvmode;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.mod2.libs.Const;
import com.mod2.libs.TService;
import com.mod2.libs.TTR;
import com.mod2.libs.TTimer;

public class LockService extends TService implements TTimer.OnTimerEvent {
    private TTR TR;
    private Context context;
    private Intent intentAct;
    private Intent intentService;
    private TTimer timer = new TTimer(this);

    public void onServiceBind(Intent intent) {
    }

    public void onServiceCreate(Context context2) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.intentAct = new Intent(context2, LockActivity.class);
        this.intentAct.addFlags(268435456);
        this.intentAct.addFlags(67108864);
    }

    public void onStart(Intent intent, int i2, int i3) {
        this.intentService = intent;
        this.timer.InitTimer("", 1000);
        this.timer.StartTimer();
    }

    public void onTimer(String str) {
        if (this.TR.GetSharedBool(Const.ViewLocker).booleanValue()) {
            ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
            String trim = activityManager.getRunningTasks(1).get(0).topActivity.getPackageName().trim();
            String trim2 = getPackageName().trim();
            String trim3 = activityManager.getRunningTasks(1).get(0).topActivity.getClassName().trim();
            String trim4 = getClass().getName().trim();
            if (trim.equals(trim2) && !trim3.equals(trim4)) {
                startActivity(this.intentAct);
                return;
            }
            return;
        }
        stopService(this.intentService);
    }
}
