package com.obwhatsapp;

import X.AnonymousClass008;
import X.AnonymousClass00B;
import X.AnonymousClass00D;
import X.AnonymousClass013;
import X.AnonymousClass01G;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass0rB;
import X.AnonymousClass104;
import X.AnonymousClass10L;
import X.AnonymousClass1U5;
import X.AnonymousClass1U7;
import X.AnonymousClass1U8;
import X.AnonymousClass1U9;
import X.AnonymousClass1UA;
import X.AnonymousClass1UG;
import X.AnonymousClass1UK;
import X.AnonymousClass1UN;
import X.AnonymousClass1UP;
import X.AnonymousClass1UQ;
import X.C003701q;
import X.C003901s;
import X.C004201v;
import X.C004301w;
import X.C14730pf;
import X.C15860rz;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C18260wP;
import X.C18450wi;
import X.C18880xP;
import X.C19560yd;
import X.C19730yu;
import X.C19870z8;
import X.C20020zN;
import X.C20320zr;
import X.C20350zu;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.obwhatsapp.yo.yo;
import com.whatsapp.breakpad.BreakpadManager;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.security.Security;

public class AbstractAppShellDelegate implements ApplicationLike {
    public static final String COMPRESSED_LIBS_ARCHIVE_NAME = "libs.spk.zst";
    public final Context appContext;
    public final AnonymousClass008 appStartStat;
    public C19560yd applicationCreatePerfTracker;
    public boolean asyncInitStarted;
    public AnonymousClass013 whatsAppLocale;

    public AbstractAppShellDelegate(Context context, AnonymousClass008 r2) {
        this.appContext = context;
        this.appStartStat = r2;
    }

    public static final void A00(C18880xP r3, C20350zu r4) {
        C18450wi.A0H(r4, 0);
        C18450wi.A0H(r3, 1);
        AnonymousClass1UK.A00(new AsyncInitCoroutineKt$runAsyncInit$1(r3, r4, (AnonymousClass1UG) null), AnonymousClass1UA.A00);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean decompressAsset(X.AnonymousClass10L r12, X.C16440t3 r13, boolean r14, X.C16490t9 r15, X.C14730pf r16, X.C15860rz r17, X.C16300so r18) {
        /*
            r11 = this;
            long r3 = android.os.SystemClock.uptimeMillis()
            r10 = r14
            android.content.Context r6 = r11.appContext     // Catch:{ Exception -> 0x002c }
            java.lang.String r7 = "libs.spk.zst"
            r8 = 0
            r9 = 0
            r5 = r12
            boolean r0 = r5.A04(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x002a
            X.1U4 r2 = new X.1U4     // Catch:{ Exception -> 0x002c }
            r2.<init>()     // Catch:{ Exception -> 0x002c }
            r2.A01 = r7     // Catch:{ Exception -> 0x002c }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x002c }
            long r0 = r0 - r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x002c }
            r2.A00 = r0     // Catch:{ Exception -> 0x002c }
            r15.A06(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ Exception -> 0x002c }
        L_0x002a:
            r0 = 1
            return r0
        L_0x002c:
            r2 = move-exception
            java.lang.String r1 = "AbstractAppShellDelegate/decompressLibraries: Error decompressing archive libs.spk.zst, usingLegacyMethod: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r2)
            r3 = r16
            r1 = r17
            r0 = r18
            r11.maybeReportDecompressionFailure(r3, r2, r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.AbstractAppShellDelegate.decompressAsset(X.10L, X.0t3, boolean, X.0t9, X.0pf, X.0rz, X.0so):boolean");
    }

    private void decompressLibraries(WhatsAppLibLoader whatsAppLibLoader, AnonymousClass10L r11, C16440t3 r12, C16300so r13, C16490t9 r14, C14730pf r15, C15860rz r16) {
        if (whatsAppLibLoader.A04(this.appContext)) {
            AnonymousClass10L r2 = r11;
            r11.A01(this.appContext);
            C16440t3 r3 = r12;
            C16300so r8 = r13;
            C16490t9 r5 = r14;
            C14730pf r6 = r15;
            C15860rz r7 = r16;
            if (!decompressAsset(r2, r3, false, r5, r6, r7, r8) && decompressAsset(r2, r3, true, r5, r6, r7, r8)) {
                r13.AcB("AbstractAppShellDelegate/decompressLibraries/fallback", (String) null, false);
                return;
            }
            return;
        }
        Log.e("AbstractAppShellDelegate/decompressLibraries: Could not load decompressor libraries");
    }

    private void initCrashHandling(C20020zN r1, C19870z8 r2) {
        r1.A04(r2);
        C003701q.A01(r1);
    }

    private void initLogging(C18260wP r2) {
        Log.connectivityInfoProvider = new AnonymousClass1U5(r2);
    }

    private void initStartupPathPerfLogging(AnonymousClass01G r4) {
        C19560yd A50 = r4.A50();
        this.applicationCreatePerfTracker = A50;
        A50.A02(this.appStartStat.A02);
        this.applicationCreatePerfTracker.A01();
    }

    private void installAnrDetector(AnonymousClass104 r4, WhatsAppLibLoader whatsAppLibLoader, AnonymousClass0rB r6, C20320zr r7) {
        this.applicationCreatePerfTracker.A04("InstallAnrDetector");
        if (whatsAppLibLoader.A05(this.appContext)) {
            new RunnableRunnableShape1S0100000_I0((Object) this, 25);
            r4.A02(new RunnableRunnableShape0S0000000_I0(0), "abort_hook");
            new RunnableRunnableShape1S0100000_I0((Object) r6, 26);
        }
        JniBridge.setDependencies(r7);
        this.applicationCreatePerfTracker.A03("InstallAnrDetector");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$installAnrDetector$0() {
        BreakpadManager.A00(this.appContext);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$onCreate$2() {
        return this.appContext.getString(R.string.gcm_defaultSenderId);
    }

    public static /* synthetic */ void lambda$queueAsyncInit$3(C20350zu r2, AnonymousClass01G r3) {
        AnonymousClass1U7 A00 = r2.A00(C20350zu.A01, "async-init");
        try {
            r3.A4y().A00();
        } finally {
            A00.A00();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$queueAsyncInit$4(AnonymousClass01G r5) {
        Log.i("app-init main thread idle");
        synchronized (this) {
            if (!this.asyncInitStarted) {
                this.asyncInitStarted = true;
                C16320sq Ai4 = r5.Ai4();
                C20350zu AaQ = r5.AaQ();
                C19730yu.A01(this.appContext);
                if (r5.A4I().A0C(2483)) {
                    A00(r5.A4y(), AaQ);
                } else {
                    Ai4.Acl(new RunnableRunnableShape2S0200000_I0(r5, 11, AaQ));
                }
            }
        }
        return false;
    }

    private void logDebugInfo() {
        StringBuilder sb = new StringBuilder("AbstractAppShellDelegate/debug_info: pkg=");
        String packageName = this.appContext.getPackageName();
        sb.append("com.whatsapp");
        sb.append("; v=");
        sb.append(C003901s.A00());
        sb.append("; vc=");
        sb.append(230176001);
        sb.append("; p=");
        sb.append("consumer");
        sb.append("; e=");
        sb.append(170);
        sb.append("; g=");
        sb.append("smb-v2.23.1.75");
        sb.append("; t=");
        sb.append(1673975929000L);
        sb.append("; d=");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append("; os=Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; abis=");
        sb.append(TextUtils.join(",", AnonymousClass1U8.A03()));
        Log.i(sb.toString());
    }

    private void maybeReportDecompressionFailure(C14730pf r5, Exception exc, C15860rz r7, C16300so r8) {
        StringBuilder sb = new StringBuilder("AbstractAppShellDelegate/maybeReportDecompressionFailure: available internal storage: ");
        sb.append(r5.A02());
        Log.i(sb.toString());
        Log.e("AbstractAppShellDelegate/maybeReportDecompressionFailure", exc);
        if (r7.A1n("decompression_failure_reported_timestamp", 86400000)) {
            r8.AcB("AbstractAppShellDelegate/maybeReportDecompressionFailure", "superpack decompression failed", true);
            r7.A0x("decompression_failure_reported_timestamp");
        }
    }

    private void queueAsyncInit(AnonymousClass01G r3) {
        Looper.myQueue().addIdleHandler(new AnonymousClass1U9(r3, this));
    }

    private void setBouncyCastleProvider() {
        this.applicationCreatePerfTracker.A04("SetBouncyCastleProvider");
        AnonymousClass1UN r2 = new AnonymousClass1UN();
        if (Build.VERSION.SDK_INT < 19) {
            Security.insertProviderAt(r2, 1);
        } else {
            Security.addProvider(r2);
        }
        this.applicationCreatePerfTracker.A03("SetBouncyCastleProvider");
    }

    private void setStrictModePolicyForAppInit() {
        this.applicationCreatePerfTracker.A04("SetStrictModePolicyForAppInit");
        this.applicationCreatePerfTracker.A03("SetStrictModePolicyForAppInit");
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass013 r0 = this.whatsAppLocale;
        AnonymousClass00B.A06(r0);
        r0.A0R(configuration);
        AnonymousClass013 r02 = this.whatsAppLocale;
        AnonymousClass00B.A06(r02);
        r02.A0M();
        AnonymousClass1UP.A04();
    }

    /* JADX INFO: finally extract failed */
    public void onCreate() {
        AnonymousClass01G r2 = (AnonymousClass01G) AnonymousClass01I.A00(this.appContext, AnonymousClass01G.class);
        initLogging(r2.A6a());
        Log.i("AbstractAppShellDelegate/onCreate");
        C16300so A6q = r2.A6q();
        AnonymousClass00D r1 = Log.LOGGER_THREAD;
        synchronized (r1) {
            r1.A00 = A6q;
        }
        initCrashHandling(r2.A6r(), r2.A5n());
        initStartupPathPerfLogging(r2);
        logDebugInfo();
        this.applicationCreatePerfTracker.A04("DecompressLibraries");
        decompressLibraries(r2.Ai8(), r2.Ai7(), r2.Agj(), r2.A6q(), r2.Ai6(), r2.AgR(), r2.Ai3());
        this.applicationCreatePerfTracker.A03("DecompressLibraries");
        installAnrDetector(r2.Acs(), r2.Ai8(), r2.A4x(), r2.AJz());
        r2.AgI().A01();
        r2.AgI().A08("app_creation_on_create");
        r2.A9M().A00(new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(this, 0)));
        setBouncyCastleProvider();
        setStrictModePolicyForAppInit();
        C004201v.A01("AppShell/onCreate");
        try {
            AnonymousClass1UQ.A02(r2.A4I().A0C(334));
            AnonymousClass013 Ai9 = r2.Ai9();
            this.whatsAppLocale = Ai9;
            yo.setWALocaleManager(Ai9);
            C15860rz Ai3 = r2.Ai3();
            this.applicationCreatePerfTracker.A04("MainThreadInit");
            C19730yu.A00(this.appContext);
            this.applicationCreatePerfTracker.A03("MainThreadInit");
            AnonymousClass00B.A0H(false);
            AnonymousClass00B.A00.open();
            queueAsyncInit(r2);
            C004201v.A00();
            C004301w.A00(Ai3.A0A());
            this.applicationCreatePerfTracker.A00();
            r2.AgI().A07("app_creation_on_create");
        } catch (Throwable th) {
            C004201v.A00();
            throw th;
        }
    }
}
