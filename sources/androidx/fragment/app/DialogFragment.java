package androidx.fragment.app;

import X.AnonymousClass01A;
import X.AnonymousClass023;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass05Z;
import X.AnonymousClass062;
import X.AnonymousClass0bq;
import X.AnonymousClass0fW;
import X.C02750Eu;
import X.C02760Ev;
import X.C06670Xf;
import X.C06690Xh;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.obwhatsapp.R;

public class DialogFragment extends AnonymousClass01A implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public Dialog A03;
    public DialogInterface.OnCancelListener A04 = new C06670Xf(this);
    public DialogInterface.OnDismissListener A05 = new C06690Xh(this);
    public Handler A06;
    public AnonymousClass023 A07 = new AnonymousClass0bq(this);
    public Runnable A08 = new AnonymousClass0fW(this);
    public boolean A09 = true;
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F;

    public AnonymousClass062 A0E() {
        return new C02760Ev(this, new C02750Eu(this));
    }

    public void A0U(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle bundle2;
        super.A0U(bundle, layoutInflater, viewGroup);
        if (this.A0A == null && this.A03 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A03.onRestoreInstanceState(bundle2);
        }
    }

    public void A0k() {
        this.A0V = true;
        if (!this.A0D && !this.A0C) {
            this.A0C = true;
        }
        this.A0L.A08(this.A07);
    }

    public void A0l(Bundle bundle) {
        Bundle bundle2;
        this.A0V = true;
        if (this.A03 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A03.onRestoreInstanceState(bundle2);
        }
    }

    public void A0q() {
        this.A0V = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0F = false;
            dialog.show();
            View decorView = this.A03.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AnonymousClass05Z.A00(decorView, this);
        }
    }

    public void A0s(Bundle bundle) {
        Dialog dialog = this.A03;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.A01;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.A02;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.A09;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.A0E;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.A00;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater A0v(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater A0v = super.A0v(bundle);
        if (this.A0E && !this.A0A) {
            if (!this.A0B) {
                try {
                    this.A0A = true;
                    Dialog A1B = A1B(bundle);
                    this.A03 = A1B;
                    if (this.A0E) {
                        A1F(this.A01, A1B);
                        Context A0u = A0u();
                        if (A0u instanceof Activity) {
                            this.A03.setOwnerActivity((Activity) A0u);
                        }
                        this.A03.setCancelable(this.A09);
                        this.A03.setOnCancelListener(this.A04);
                        this.A03.setOnDismissListener(this.A05);
                        this.A0B = true;
                    } else {
                        this.A03 = null;
                    }
                    this.A0A = false;
                } catch (Throwable th) {
                    this.A0A = false;
                    throw th;
                }
            }
            if (AnonymousClass02C.A02(2)) {
                StringBuilder sb2 = new StringBuilder("get layout inflater for DialogFragment ");
                sb2.append(this);
                sb2.append(" from dialog context");
                Log.d("FragmentManager", sb2.toString());
            }
            Dialog dialog = this.A03;
            if (dialog != null) {
                return A0v.cloneInContext(dialog.getContext());
            }
        } else if (AnonymousClass02C.A02(2)) {
            StringBuilder sb3 = new StringBuilder("getting layout inflater for DialogFragment ");
            sb3.append(this);
            String obj = sb3.toString();
            if (!this.A0E) {
                str = "mShowsDialog = false: ";
            } else {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            }
            sb.append(str);
            sb.append(obj);
            Log.d("FragmentManager", sb.toString());
        }
        return A0v;
    }

    public void A13() {
        this.A0V = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0F = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.A03.dismiss();
            if (!this.A0C) {
                onDismiss(this.A03);
            }
            this.A03 = null;
            this.A0B = false;
        }
    }

    public void A15() {
        this.A0V = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void A16(Context context) {
        super.A16(context);
        this.A0L.A07(this.A07);
        if (!this.A0D) {
            this.A0C = false;
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A06 = new Handler();
        boolean z2 = false;
        if (this.A01 == 0) {
            z2 = true;
        }
        this.A0E = z2;
        if (bundle != null) {
            this.A01 = bundle.getInt("android:style", 0);
            this.A02 = bundle.getInt("android:theme", 0);
            this.A09 = bundle.getBoolean("android:cancelable", true);
            this.A0E = bundle.getBoolean("android:showsDialog", this.A0E);
            this.A00 = bundle.getInt("android:backStackId", -1);
        }
    }

    public int A19() {
        return this.A02;
    }

    public final Dialog A1A() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public Dialog A1B(Bundle bundle) {
        if (AnonymousClass02C.A02(3)) {
            StringBuilder sb = new StringBuilder("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new Dialog(A02(), A19());
    }

    public void A1C() {
        A1I(false, false);
    }

    public void A1D() {
        A1I(true, false);
    }

    public void A1E(int i2, int i3) {
        if (AnonymousClass02C.A02(2)) {
            StringBuilder sb = new StringBuilder("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            Log.d("FragmentManager", sb.toString());
        }
        this.A01 = i2;
        if (i2 == 2) {
            this.A02 = 16973913;
        }
        if (i3 != 0) {
            this.A02 = i3;
        }
    }

    public void A1F(int i2, Dialog dialog) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void A1G(AnonymousClass02C r3, String str) {
        this.A0C = false;
        this.A0D = true;
        AnonymousClass050 r1 = new AnonymousClass050(r3);
        r1.A0C(this, str);
        r1.A00(false);
    }

    public void A1H(boolean z2) {
        this.A09 = z2;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setCancelable(z2);
        }
    }

    public final void A1I(boolean z2, boolean z3) {
        if (!this.A0C) {
            this.A0C = true;
            this.A0D = false;
            Dialog dialog = this.A03;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.A03.dismiss();
                if (!z3) {
                    if (Looper.myLooper() == this.A06.getLooper()) {
                        onDismiss(this.A03);
                    } else {
                        this.A06.post(this.A08);
                    }
                }
            }
            this.A0F = true;
            if (this.A00 >= 0) {
                A0G().A0N(this.A00);
                this.A00 = -1;
                return;
            }
            AnonymousClass050 r1 = new AnonymousClass050(A0G());
            r1.A07(this);
            if (z2) {
                r1.A00(true);
            } else {
                r1.A00(false);
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0F) {
            if (AnonymousClass02C.A02(3)) {
                StringBuilder sb = new StringBuilder("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            A1I(true, true);
        }
    }
}
