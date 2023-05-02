package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.1Re  reason: invalid class name and case insensitive filesystem */
public final class C27291Re implements C27301Rf, C15340qi, C27311Rg, C15370ql, C15350qj, C27321Rh {
    public Executor A00;
    public Executor A01;
    public Executor A02;
    public final Context A03;
    public final SharedPreferences A04;

    public C27291Re(Context context) {
        this.A03 = context.getApplicationContext();
        this.A04 = context.getSharedPreferences("default-cask-metadata", 0);
    }

    public static void A00(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A00(file2);
                }
                file2.delete();
            }
        }
    }

    public boolean A7o(File file) {
        if (file.isDirectory()) {
            A00(file);
        }
        return file.delete();
    }

    public C15360qk A9x() {
        C15360qk r0;
        Context context = this.A03;
        synchronized (C15360qk.class) {
            r0 = C15360qk.A03;
            if (r0 == null) {
                r0 = new C15360qk(context);
                C15360qk.A03 = r0;
            }
        }
        return r0;
    }

    public Context A9y() {
        return this.A03;
    }

    public synchronized Executor AC5(C47742Kf r3) {
        Executor executor;
        int ordinal = r3.ordinal();
        switch (ordinal) {
            case 0:
                executor = this.A00;
                if (executor == null) {
                    executor = Executors.newCachedThreadPool(new AnonymousClass58U(r3));
                    this.A00 = executor;
                    break;
                }
                break;
            case 1:
                executor = this.A02;
                if (executor == null) {
                    executor = Executors.newSingleThreadExecutor(new AnonymousClass58U(r3));
                    this.A02 = executor;
                    break;
                }
                break;
            default:
                executor = this.A01;
                if (executor == null) {
                    AnonymousClass58U r0 = new AnonymousClass58U(r3);
                    executor = 1 - ordinal != 0 ? Executors.newCachedThreadPool(r0) : Executors.newSingleThreadExecutor(r0);
                    this.A01 = executor;
                    break;
                }
                break;
        }
        return executor;
    }

    public C15250qZ AGI(String str) {
        return new C15250qZ(this.A04, str);
    }

    public boolean AJ8() {
        AnonymousClass0WB r1;
        synchronized (AnonymousClass0WB.class) {
            r1 = AnonymousClass0WB.A07;
            if (r1 == null) {
                r1 = new AnonymousClass0WB();
                AnonymousClass0WB.A07 = r1;
            }
        }
        return r1.A01(AnonymousClass0JE.A00) < 419430400;
    }

    public boolean AJv() {
        AnonymousClass0WB r1;
        synchronized (AnonymousClass0WB.class) {
            r1 = AnonymousClass0WB.A07;
            if (r1 == null) {
                r1 = new AnonymousClass0WB();
                AnonymousClass0WB.A07 = r1;
            }
        }
        return r1.A01(AnonymousClass0JE.A00) < 104857600;
    }
}
