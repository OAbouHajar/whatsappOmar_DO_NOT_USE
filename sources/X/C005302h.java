package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.02h  reason: invalid class name and case insensitive filesystem */
public class C005302h {
    public final int A00;
    public final AnonymousClass0PG A01;

    public C005302h(Context context) {
        this(context, C005702l.A00(context, 0));
    }

    public C005302h(Context context, int i2) {
        this.A01 = new AnonymousClass0PG(new ContextThemeWrapper(context, C005702l.A00(context, i2)));
        this.A00 = i2;
    }

    public C005702l A00() {
        C005702l create = create();
        create.show();
        return create;
    }

    public void A01(int i2) {
        AnonymousClass0PG r1 = this.A01;
        r1.A0E = r1.A0O.getText(i2);
    }

    public void A02(int i2) {
        AnonymousClass0PG r1 = this.A01;
        r1.A0I = r1.A0O.getText(i2);
    }

    public void A03(DialogInterface.OnCancelListener onCancelListener) {
        this.A01.A02 = onCancelListener;
    }

    public void A04(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        AnonymousClass0PG r0 = this.A01;
        r0.A0D = listAdapter;
        r0.A05 = onClickListener;
    }

    public void A05(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i2) {
        AnonymousClass0PG r1 = this.A01;
        r1.A0M = charSequenceArr;
        r1.A05 = onClickListener;
        r1.A00 = i2;
        r1.A0L = true;
    }

    public void A06(CharSequence charSequence) {
        this.A01.A0E = charSequence;
    }

    public void A07(boolean z2) {
        this.A01.A0J = z2;
    }

    public C005302h A08(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        AnonymousClass0PG r0 = this.A01;
        r0.A0F = charSequence;
        r0.A03 = onClickListener;
        return this;
    }

    public C005302h A09(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        AnonymousClass0PG r0 = this.A01;
        r0.A0H = charSequence;
        r0.A06 = onClickListener;
        return this;
    }

    public C005702l create() {
        ListAdapter listAdapter;
        AnonymousClass0PG r7 = this.A01;
        Context context = r7.A0O;
        C005702l r4 = new C005702l(context, this.A00);
        C06490Wi r3 = r4.A00;
        View view = r7.A0B;
        if (view != null) {
            r3.A0C = view;
        } else {
            CharSequence charSequence = r7.A0I;
            if (charSequence != null) {
                r3.A0R = charSequence;
                TextView textView = r3.A0L;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = r7.A0A;
            if (drawable != null) {
                r3.A07 = drawable;
                ImageView imageView = r3.A0H;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    r3.A0H.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = r7.A0E;
        if (charSequence2 != null) {
            r3.A0Q = charSequence2;
            TextView textView2 = r3.A0K;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = r7.A0H;
        if (charSequence3 != null) {
            DialogInterface.OnClickListener onClickListener = r7.A06;
            Message message = null;
            if (onClickListener != null) {
                message = r3.A08.obtainMessage(-1, onClickListener);
            }
            r3.A0P = charSequence3;
            r3.A0B = message;
        }
        CharSequence charSequence4 = r7.A0F;
        if (charSequence4 != null) {
            DialogInterface.OnClickListener onClickListener2 = r7.A03;
            Message message2 = null;
            if (onClickListener2 != null) {
                message2 = r3.A08.obtainMessage(-2, onClickListener2);
            }
            r3.A0N = charSequence4;
            r3.A09 = message2;
        }
        CharSequence charSequence5 = r7.A0G;
        if (charSequence5 != null) {
            DialogInterface.OnClickListener onClickListener3 = r7.A04;
            Message message3 = null;
            if (onClickListener3 != null) {
                message3 = r3.A08.obtainMessage(-3, onClickListener3);
            }
            r3.A0O = charSequence5;
            r3.A0A = message3;
        }
        if (!(r7.A0M == null && r7.A0D == null)) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) r7.A0P.inflate(r3.A03, (ViewGroup) null);
            if (r7.A0K) {
                listAdapter = new AnonymousClass0C2(context, r7, alertController$RecycleListView, r7.A0M, r3.A04);
            } else {
                int i2 = r7.A0L ? r3.A05 : r3.A02;
                listAdapter = r7.A0D;
                if (listAdapter == null) {
                    listAdapter = new AnonymousClass0C3(context, r7.A0M, i2);
                }
            }
            r3.A0I = listAdapter;
            r3.A01 = r7.A00;
            if (r7.A05 != null) {
                alertController$RecycleListView.setOnItemClickListener(new AnonymousClass0Z2(r7, r3));
            } else if (r7.A09 != null) {
                alertController$RecycleListView.setOnItemClickListener(new AnonymousClass0Z4(r7, alertController$RecycleListView, r3));
            }
            if (r7.A0L) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (r7.A0K) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            r3.A0J = alertController$RecycleListView;
        }
        View view2 = r7.A0C;
        if (view2 != null) {
            r3.A0D = view2;
            r3.A06 = 0;
        } else {
            int i3 = r7.A01;
            if (i3 != 0) {
                r3.A0D = null;
                r3.A06 = i3;
            }
        }
        r4.setCancelable(r7.A0J);
        if (r7.A0J) {
            r4.setCanceledOnTouchOutside(true);
        }
        r4.setOnCancelListener(r7.A02);
        r4.setOnDismissListener(r7.A07);
        DialogInterface.OnKeyListener onKeyListener = r7.A08;
        if (onKeyListener != null) {
            r4.setOnKeyListener(onKeyListener);
        }
        return r4;
    }

    public Context getContext() {
        return this.A01.A0O;
    }

    public C005302h setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0PG r1 = this.A01;
        r1.A0F = r1.A0O.getText(i2);
        r1.A03 = onClickListener;
        return this;
    }

    public C005302h setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0PG r1 = this.A01;
        r1.A0H = r1.A0O.getText(i2);
        r1.A06 = onClickListener;
        return this;
    }

    public C005302h setTitle(CharSequence charSequence) {
        this.A01.A0I = charSequence;
        return this;
    }

    public C005302h setView(View view) {
        AnonymousClass0PG r1 = this.A01;
        r1.A0C = view;
        r1.A01 = 0;
        return this;
    }
}
