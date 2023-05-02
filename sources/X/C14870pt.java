package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.0pt  reason: invalid class name and case insensitive filesystem */
public class C14870pt implements C14880pu {
    public C14600pS A00;
    public C33861jJ A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C18260wP A03;
    public final C16980tz A04;
    public final C17120uZ A05;
    public final Executor A06 = new IDxExecutorShape280S0100000_2_I0(this, 1);

    public C14870pt(C18260wP r3, C16980tz r4, C17120uZ r5) {
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
    }

    public static void A00(C14870pt r1, Object obj, int i2) {
        r1.A0K(new RunnableRunnableShape17S0100000_I1(obj, i2));
    }

    public static void A01(C14870pt r1, Object obj, int i2) {
        r1.A0K(new RunnableRunnableShape19S0100000_I1_2(obj, i2));
    }

    public static void A02(C14870pt r1, Object obj, Object obj2, int i2) {
        r1.A0K(new RunnableRunnableShape13S0200000_I1_1(obj, i2, obj2));
    }

    public static void A03(C14870pt r1, Object obj, Object obj2, int i2) {
        r1.A0K(new RunnableRunnableShape14S0200000_I1_2(obj, i2, obj2));
    }

    @Deprecated
    public Toast A04(CharSequence charSequence) {
        Context context = this.A04.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout05b5, (ViewGroup) null);
        ((TextView) C004601z.A0E(inflate, 16908299)).setText(charSequence);
        Toast toast = new Toast(context);
        toast.setView(inflate);
        toast.setDuration(0);
        return toast;
    }

    public void A05() {
        StringBuilder sb = new StringBuilder("app/progress-spinner/remove dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        this.A01 = null;
        C14600pS r0 = this.A00;
        if (r0 != null) {
            r0.Ac1();
        } else {
            C33871jK.A02 = false;
        }
        Log.i("app/progress-spinner/remove done");
    }

    public final void A06(int i2) {
        A0K(new RunnableRunnableShape0S0101000_I0((Object) this, i2, 1));
    }

    public void A07(int i2, int i3) {
        C14600pS r0 = this.A00;
        if (r0 != null) {
            r0.Afg(i2);
        } else {
            A09(i2, i3);
        }
    }

    public void A08(int i2, int i3) {
        StringBuilder sb = new StringBuilder("app/progress-spinner/show dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        this.A01 = new C33861jJ(i2, i3);
        C14600pS r0 = this.A00;
        if (r0 != null) {
            r0.Afr(i2, i3);
        }
        Log.i("app/progress-spinner/show done");
    }

    public void A09(int i2, int i3) {
        A0H(this.A04.A00.getString(i2), i3);
    }

    public void A0A(int i2, int i3) {
        A0I(this.A04.A00.getString(i2), i3);
    }

    public void A0B(C14600pS r3) {
        StringBuilder sb = new StringBuilder("app/dt/clear dt=");
        sb.append(r3);
        sb.append(" dialog_toast=");
        sb.append(this.A00);
        Log.i(sb.toString());
        C14600pS r1 = this.A00;
        if (r1 == r3) {
            if (this.A01 != null) {
                r1.Ac1();
            }
            this.A00 = null;
        }
        Log.i("app/dt/clear done");
    }

    public void A0C(C14600pS r2) {
        if (r2 == null && (r2 = this.A00) == null) {
            AnonymousClass00B.A08("dialogToast == null");
            Log.w("app/removeProgressSpinner/ignore dialogToast == null");
            return;
        }
        r2.Ac1();
    }

    public void A0D(C14600pS r4) {
        StringBuilder sb = new StringBuilder("app/dt/set ");
        sb.append(r4);
        Log.i(sb.toString());
        this.A00 = r4;
        C33861jJ r2 = this.A01;
        if (r2 != null) {
            StringBuilder sb2 = new StringBuilder("app/dt/set show_progress_data=");
            sb2.append(r2);
            sb2.append(" dialog_toast=");
            sb2.append(this.A00);
            Log.i(sb2.toString());
            C14600pS r22 = this.A00;
            C33861jJ r0 = this.A01;
            r22.Afr(r0.A02, r0.A01);
            if (this.A01.A00 != null) {
                Log.i("app/dt/set/update");
                this.A00.AhY(this.A01.A00);
            }
        }
        Log.i("app/dt/set done");
    }

    public void A0E(C14600pS r4) {
        if (r4 == null && (r4 = this.A00) == null) {
            AnonymousClass00B.A08("dialogToast == null");
            A09(R.string.str13db, 0);
            return;
        }
        r4.Afr(0, R.string.str13db);
    }

    public void A0F(C14600pS r2, int i2) {
        if (r2 != null) {
            r2.Afg(i2);
        } else {
            A07(i2, 0);
        }
    }

    public void A0G(C14600pS r2, String str) {
        if (r2 != null) {
            r2.Afh(str);
        } else {
            A0N(str, 0);
        }
    }

    public void A0H(CharSequence charSequence, int i2) {
        View view;
        Context context = this.A04.A00;
        Toast makeText = Toast.makeText(context, charSequence, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 <= 28) {
            String str = Build.MANUFACTURER;
            if (("google".equalsIgnoreCase(str) || "oneplus".equalsIgnoreCase(str)) && (view = makeText.getView()) != null) {
                Drawable background = view.getBackground();
                TextView textView = (TextView) view.findViewById(16908299);
                if (!(background == null || textView == null)) {
                    background.setColorFilter(AnonymousClass00T.A00(context, R.color.color0781), PorterDuff.Mode.SRC_IN);
                    int A002 = AnonymousClass00T.A00(context, R.color.color0782);
                }
            }
        }
        makeText.show();
    }

    public void A0I(CharSequence charSequence, int i2) {
        if (AnonymousClass01E.A01()) {
            A0H(charSequence, i2);
        } else {
            A0K(new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) charSequence, 3));
        }
    }

    public void A0J(Runnable runnable) {
        this.A02.removeCallbacks(runnable);
    }

    public void A0K(Runnable runnable) {
        this.A02.post(runnable);
    }

    public void A0L(Runnable runnable, long j2) {
        this.A02.postDelayed(runnable, j2);
    }

    public void A0M(String str) {
        StringBuilder sb = new StringBuilder("app/progress-spinner/update-message dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        C33861jJ r0 = this.A01;
        if (r0 != null) {
            r0.A00 = str;
        } else {
            Log.w("app/progress-spinner/update-message no progress data");
        }
        C14600pS r02 = this.A00;
        if (r02 != null) {
            r02.AhY(str);
        }
        Log.i("app/progress-spinner/update-message done");
    }

    public void A0N(String str, int i2) {
        C14600pS r0 = this.A00;
        if (r0 != null) {
            r0.Afh(str);
        } else {
            A0H(str, i2);
        }
    }

    public boolean A0O() {
        if (this.A03.A0A()) {
            return true;
        }
        boolean A022 = C18260wP.A02(this.A04.A00);
        int i2 = R.string.str0dc2;
        if (A022) {
            i2 = R.string.str0dc3;
        }
        A09(i2, 0);
        return false;
    }

    public void Acq(Runnable runnable) {
        if (AnonymousClass01E.A01()) {
            runnable.run();
        } else {
            A0K(runnable);
        }
    }
}
