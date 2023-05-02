package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.CountDownTimer;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDTimerShape0S0300000_2_I1;
import com.facebook.redex.IDxSupplierShape104S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3Tx  reason: invalid class name and case insensitive filesystem */
public abstract class C65253Tx extends AnonymousClass3BJ implements C108195Na {
    public C31201dg A00;
    public final long A01;

    public C65253Tx(C14990q7 r4, C31201dg r5) {
        super(AnonymousClass416.VIEW);
        this.A01 = (long) r5.A00;
        this.A00 = r5;
        A06(new C88574aj(new C96064nj(r4, this), this), new C88574aj(new C96074nk(r4, this), this));
    }

    public long A03() {
        return this.A01;
    }

    public void A07(View view, C14990q7 r19, C31201dg r20, Object obj) {
        C14930q1 A0H;
        int i2;
        View view2 = view;
        if (this instanceof C69873fk) {
            C69873fk r13 = (C69873fk) this;
            C31201dg r3 = r13.A00;
            r13.A01.A5b(view2, r3.A0J(36), r3.A0P(35, false));
            return;
        }
        C14990q7 r12 = r19;
        if (this instanceof C69863fj) {
            C69863fj r132 = (C69863fj) this;
            C31201dg r32 = r132.A00;
            String A0J = r32.A0J(38);
            String A0K = r32.A0K(45, "image");
            String A0J2 = r32.A0J(43);
            String A0J3 = r32.A0J(46);
            String A0J4 = r32.A0J(42);
            r132.A01.A5W(r12.A00, view2, new IDxSupplierShape104S0200000_2_I1(C13690nt.A0h(r32), 0, C13690nt.A0h(r12)), new AnonymousClass4HD(r12, r32), A0J, A0K, A0J2, A0J3, A0J4);
            return;
        }
        C31201dg r1 = r20;
        if (this instanceof C69853fi) {
            C69853fi r133 = (C69853fi) this;
            AnonymousClass02Z r4 = (AnonymousClass02Z) view2;
            AnonymousClass386.A00(r4, r12, r1, r133.A01);
            C31201dg A0G = r133.A00.A0G(46);
            if (A0G != null) {
                int A012 = C87564Xk.A01(r12, A0G, 0);
            }
            C30531cW.A02((TextEmojiLabel) r4);
            return;
        }
        if (this instanceof C69783fb) {
            A0H = r1.A0H(35);
            if (A0H != null) {
                i2 = 12;
            } else {
                return;
            }
        } else if (this instanceof C69773fa) {
            A0H = r1.A0H(35);
            if (A0H != null) {
                i2 = 11;
            } else {
                return;
            }
        } else if (this instanceof C69823ff) {
            AnonymousClass02Z r42 = (AnonymousClass02Z) view2;
            C61933Az.A01(C61933Az.A00(r42, r12, r1, ((C69823ff) this).A00), r42, r1);
            r42.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        } else if (this instanceof C69843fh) {
            C69843fh r134 = (C69843fh) this;
            int A0A = r1.A0A(40, -1);
            int A0A2 = r1.A0A(38, -1);
            int A0A3 = r1.A0A(42, -1);
            int A0A4 = r1.A0A(35, -1);
            C31201dg r2 = r134.A00;
            float A08 = r2.A08(36, 1.0f);
            C14930q1 A0H2 = r2.A0H(41);
            r134.A01.A5a(view2, A0H2 != null ? new AnonymousClass4KC(r12, r2, A0H2) : null, A08, A0A, A0A2, A0A3, A0A4);
            return;
        } else if (this instanceof C69813fe) {
            ProgressBar progressBar = (ProgressBar) C004601z.A0E(view2, R.id.progress_bar);
            C31201dg A0G2 = r1.A0G(35);
            if (progressBar != null && A0G2 != null) {
                progressBar.getIndeterminateDrawable().setColorFilter(C87564Xk.A01(r12, A0G2, 0), PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        } else if (this instanceof C69803fd) {
            C808645w.A00(view2, r12, r1, ((C69803fd) this).A00);
            return;
        } else if (this instanceof C69833fg) {
            C69833fg r135 = (C69833fg) this;
            C31201dg r33 = r135.A00;
            long A002 = C808545v.A00(r33);
            if (A002 > 0) {
                C13680ns.A0L(view2, R.id.start_message).setText(r33.A0J(38));
                ((AnonymousClass4DG) C62183Bz.A05(r12, r33)).A00 = new IDxDTimerShape0S0300000_2_I1(view2, r12, r135, 0, A002).start();
                return;
            }
            return;
        } else if (this instanceof C69793fc) {
            AnonymousClass385.A00(view2, r12, r1, ((C69793fc) this).A00);
            return;
        } else {
            return;
        }
        view2.post(new RunnableRunnableShape3S0300000_I1(r1, A0H, r12, i2));
    }

    public void A08(View view, C14990q7 r2, C31201dg r3, Object obj) {
    }

    public void A09(View view, C14990q7 r5, C31201dg r6, Object obj) {
        if (this instanceof C69873fk) {
            ((C69873fk) this).A01.Ah9(view);
        } else if (this instanceof C69863fj) {
            C69863fj r2 = (C69863fj) this;
            r2.A01.Ah7((AnonymousClass5MV) C62183Bz.A05(r5, r2.A00));
        } else if (this instanceof C69853fi) {
            C13700nu.A0T((TextView) view);
        } else if (!(this instanceof C69783fb) && !(this instanceof C69773fa)) {
            if (this instanceof C69823ff) {
                AnonymousClass02Z r4 = (AnonymousClass02Z) view;
                C13700nu.A0T(r4);
                r4.setGravity(8388659);
                r4.setMovementMethod((MovementMethod) null);
                ((TextEmojiLabel) r4).A07 = null;
            } else if (!(this instanceof C69843fh) && !(this instanceof C69813fe)) {
                if (this instanceof C69803fd) {
                    ((RecyclerView) C004601z.A0E(view, R.id.recycler_view)).setAdapter((AnonymousClass01X) null);
                } else if (this instanceof C69833fg) {
                    C69833fg r22 = (C69833fg) this;
                    AnonymousClass4DG r1 = (AnonymousClass4DG) C62183Bz.A05(r5, r22.A00);
                    CountDownTimer countDownTimer = r1.A00;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                        r1.A00 = null;
                    }
                    r22.A01.Ah8(view);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        int i2;
        if (this instanceof C69873fk) {
            i2 = R.layout.layout00a0;
        } else if (this instanceof C69863fj) {
            i2 = R.layout.layout009d;
        } else {
            if (!(this instanceof C69853fi)) {
                if ((this instanceof C69783fb) || (this instanceof C69773fa)) {
                    View view = new View(context);
                    view.setVisibility(8);
                    return view;
                } else if (!(this instanceof C69823ff)) {
                    if (this instanceof C69843fh) {
                        i2 = R.layout.layout04e7;
                    } else if (this instanceof C69813fe) {
                        i2 = R.layout.layout05fe;
                    } else if (this instanceof C69803fd) {
                        i2 = R.layout.layout060e;
                    } else if (this instanceof C69833fg) {
                        i2 = R.layout.layout01f7;
                    } else if (!(this instanceof C69793fc)) {
                        return new ProgressBar(context);
                    } else {
                        i2 = R.layout.layout05fc;
                    }
                }
            }
            return new TextEmojiLabel(context);
        }
        return View.inflate(context, i2, (ViewGroup) null);
    }
}
