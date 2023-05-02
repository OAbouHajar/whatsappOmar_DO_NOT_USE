package com.mod2.popup;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.mod2.libs.Const;
import com.mod2.libs.TService;
import com.mod2.libs.TTR;
import com.mod2.libs.TTimer;

public class PopupService extends TService implements TTimer.OnTimerEvent {
    private TTR TR;
    private Context context;
    private Intent intentAct;
    private Intent intentPopup;
    private TTimer timerDelayExec = new TTimer(this);
    private TTimer timerMonMsg = new TTimer(this);
    private TTimer timerMonPopup = new TTimer(this);

    public void onServiceBind(Intent intent) {
    }

    public void onServiceCreate(Context context2) {
        this.TR = new TTR(context2);
        this.context = context2;
        this.intentAct = this.context.getPackageManager().getLaunchIntentForPackage(getPackageName().trim());
        this.intentAct.addCategory("android.intent.category.LAUNCHER");
        this.intentAct.addFlags(268435456);
        this.intentAct.addFlags(67108864);
        this.timerMonMsg.InitTimer("monMsgIn", 500);
        this.timerMonMsg.StartTimer();
        this.timerDelayExec.InitTimer("delayExec", 2000);
        this.timerMonPopup.InitTimer("monPopup", 500);
        this.timerMonPopup.StartTimer();
        this.intentPopup = new Intent(context2, PopupActivity.class);
        this.intentPopup.addFlags(268435456);
        this.intentPopup.addFlags(67108864);
    }

    public void onStart(Intent intent, int i2, int i3) {
        this.TR.SetSharedIntent(Const.PopupService, intent);
    }

    public void onTimer(String str) {
        if (str.equals("monMsgIn") && this.TR.GetSharedBool(Const.flagMsgIn).booleanValue()) {
            this.TR.SetSharedBool(Const.flagMsgIn, false);
            this.timerDelayExec.StartTimerOnce();
        }
        if (str.equals("delayExec")) {
            this.TR.SetSharedBool(Const.flagExecApp, true);
            getApplication().startActivity(this.intentAct);
        }
        if (str.equals("monPopup") && this.TR.GetSharedBool(Const.flagExecApp).booleanValue() && !((ActivityManager) this.context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity.getClassName().trim().equals(getClass().getName().trim())) {
            startActivity(this.intentPopup);
        }
    }
}
