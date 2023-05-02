package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.B58works.B58;
import com.assem.Cint;
import com.obwhatsapp.AbstractAppShellDelegate;
import com.obwhatsapp.ApplicationLike;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.004  reason: invalid class name */
public class AnonymousClass004 extends Application implements AnonymousClass005 {
    public static final AnonymousClass008 appStartStat = AnonymousClass008.A03;
    public ApplicationLike delegate;
    public volatile C008804a waResourcesWrapper;

    private void configureCrashLogging(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new AnonymousClass00M(context, this));
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AnonymousClass00B.A0H(true);
        File file = new File(getFilesDir(), "Logs");
        if (!Log.logDirRef.compareAndSet((Object) null, file)) {
            throw new IllegalStateException("log application context already assigned");
        }
        Log.logFile = new File(file, "whatsapp.log");
        Log.logTempFile = new File(file, "whatsapp.tmp");
        Log.logFileLatch.countDown();
        Log.level = 3;
        StringBuilder sb = new StringBuilder("==== logfile version=");
        sb.append("2.23.1.76");
        sb.append(" level=");
        sb.append(3);
        sb.append("====");
        Log.log("LL_I ", sb.toString());
        AnonymousClass00G.A00();
        AnonymousClass00H.A01(this);
        configureCrashLogging(this);
        com.OM7753.Gold.Context.A01.A00 = this;
    }

    public ApplicationLike createDelegate() {
        return new AbstractAppShellDelegate(this, appStartStat);
    }

    public Resources getResources() {
        if (Boolean.TRUE.equals(AnonymousClass00B.A01)) {
            return super.getResources();
        }
        if (this.waResourcesWrapper == null) {
            synchronized (this) {
                if (this.waResourcesWrapper == null) {
                    this.waResourcesWrapper = C008804a.A00(super.getResources(), ((AnonymousClass01F) AnonymousClass01I.A00(this, AnonymousClass01F.class)).Ai9());
                }
            }
        }
        return this.waResourcesWrapper;
    }

    public AnonymousClass0Pz getWorkManagerConfiguration() {
        Log.i("work-manager/configuration/created");
        AnonymousClass0O3 r1 = new AnonymousClass0O3();
        r1.A01 = 1000;
        r1.A00 = 2;
        return new AnonymousClass0Pz(r1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ApplicationLike applicationLike = this.delegate;
        AnonymousClass00B.A06(applicationLike);
        applicationLike.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        B58.init(this);
        Cint.init(this);
        yo.yo(this);
        AbstractAppShellDelegate abstractAppShellDelegate = new AbstractAppShellDelegate(this, appStartStat);
        this.delegate = abstractAppShellDelegate;
        abstractAppShellDelegate.onCreate();
    }
}
