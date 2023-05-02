package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import com.facebook.redex.IDxLAdapterShape1S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0;
import com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.ConversationListView;
import java.util.Map;

/* renamed from: X.2Vb  reason: invalid class name and case insensitive filesystem */
public abstract class C49692Vb {
    public final int A00;
    public final AnonymousClass1yP A01;

    public C49692Vb(AnonymousClass1yP r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void A00() {
        C49692Vb r0;
        AnonymousClass2VZ r4 = ((Conversation) ((C42801yh) this.A01)).A00.A1j;
        Class<?> cls = getClass();
        Map map = r4.A00;
        C49692Vb r2 = (C49692Vb) map.get(cls);
        if (r2 != null && r4.A01 != cls) {
            if (!(r4.A01 == null || (r0 = (C49692Vb) map.get(r4.A01)) == null || r0.A00 >= r2.A00)) {
                Class cls2 = r4.A01;
                AnonymousClass00B.A06(cls2);
                C49692Vb r1 = (C49692Vb) r4.A00.get(cls2);
                if (cls2.equals(r4.A01) && r1 != null) {
                    r1.A01(new C82724Dx(r4), false);
                }
            }
            if (r4.A01 == null && r2.A03()) {
                if (r2 instanceof AnonymousClass309) {
                    AnonymousClass309 r22 = (AnonymousClass309) r2;
                    if (r22.A01 == null) {
                        r22.A01 = ((Activity) r22.A01).getLayoutInflater().inflate(R.layout.layout02de, r22.A04).findViewById(R.id.pending_requests_notification);
                        r22.A05();
                    }
                } else if (r2 instanceof C49682Va) {
                    C49682Va r23 = (C49682Va) r2;
                    if (r23.A00 == null) {
                        r23.A00 = ((Activity) r23.A01).getLayoutInflater().inflate(R.layout.layout00fd, r23.A04).findViewById(R.id.change_number_notification);
                        r23.A05();
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                        translateAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(r23, 8));
                        translateAnimation.setDuration(400);
                        View view = r23.A00;
                        AnonymousClass00B.A04(view);
                        view.startAnimation(translateAnimation);
                    }
                } else {
                    AnonymousClass308 r24 = (AnonymousClass308) r2;
                    ViewGroup viewGroup = r24.A01;
                    if (viewGroup.getVisibility() != 0) {
                        boolean z2 = false;
                        if (viewGroup.getChildCount() > 0) {
                            z2 = true;
                        }
                        if (r24 instanceof AnonymousClass306) {
                            AnonymousClass306 r9 = (AnonymousClass306) r24;
                            ViewGroup viewGroup2 = r9.A01;
                            if (viewGroup2.findViewById(R.id.group_description_text) == null) {
                                viewGroup2.removeAllViews();
                                ((Activity) r9.A01).getLayoutInflater().inflate(R.layout.layout0162, viewGroup2, true);
                                C34331k5.A03(viewGroup2.findViewById(R.id.group_description_close), r9, 1);
                            }
                            r9.A06();
                        } else {
                            AnonymousClass307 r7 = (AnonymousClass307) r24;
                            if (r7.A01 == null) {
                                ViewGroup viewGroup3 = r7.A01;
                                viewGroup3.removeAllViews();
                                ((Activity) r7.A01).getLayoutInflater().inflate(R.layout.layout015d, viewGroup3, true);
                                r7.A00 = C13680ns.A0K(viewGroup3, R.id.cag_png_banner_close);
                                r7.A01 = C13680ns.A0M(viewGroup3, R.id.cag_png_banner_content);
                                ImageView imageView = r7.A00;
                                if (imageView != null) {
                                    C34331k5.A01(imageView, r7, 48);
                                }
                            }
                            r7.A06();
                            Integer A0Y = C13680ns.A0Y();
                            C74443qY r12 = new C74443qY();
                            r12.A00 = A0Y;
                            r7.A08.A06(r12);
                        }
                        C005402i x2 = ((C000900k) r24.A01).x();
                        AnonymousClass00B.A06(x2);
                        x2.A08(0.0f);
                        C004601z.A0X(viewGroup, r24.A00);
                        viewGroup.setVisibility(0);
                        if (z2) {
                            viewGroup.postDelayed(new RunnableRunnableShape18S0100000_I1_1((Object) viewGroup, 1), 10);
                        }
                    }
                }
                r4.A01 = cls;
            }
        }
    }

    public void A01(C82724Dx r13, boolean z2) {
        if (this instanceof AnonymousClass309) {
            AnonymousClass309 r2 = (AnonymousClass309) this;
            if (z2) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                translateAnimation.setAnimationListener(new IDxLAdapterShape12S0200000_2_I1(r13, 4, r2));
                translateAnimation.setDuration(400);
                View view = r2.A01;
                AnonymousClass00B.A04(view);
                view.startAnimation(translateAnimation);
            } else {
                View view2 = r2.A01;
                AnonymousClass00B.A04(view2);
                view2.setVisibility(8);
                r2.A04.removeView(r2.A01);
                r2.A01 = null;
                r13.A00.A01 = null;
            }
            r2.A03 = true;
            r2.A07.Acl(new RunnableRunnableShape18S0100000_I1_1((Object) r2, 4));
        } else if (this instanceof C49682Va) {
            C49682Va r22 = (C49682Va) this;
            if (z2) {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                translateAnimation2.setAnimationListener(new IDxLAdapterShape11S0200000_2_I0(r13, 0, r22));
                translateAnimation2.setDuration(400);
                View view3 = r22.A00;
                AnonymousClass00B.A04(view3);
                view3.startAnimation(translateAnimation2);
                return;
            }
            View view4 = r22.A00;
            AnonymousClass00B.A04(view4);
            view4.setVisibility(8);
            r22.A04.removeView(r22.A00);
            r22.A00 = null;
            r13.A00.A01 = null;
        } else {
            AnonymousClass308 r23 = (AnonymousClass308) this;
            if (z2) {
                AnonymousClass1yP r5 = r23.A01;
                ConversationListView conversationListView = ((Conversation) r5).A00.A1n;
                if (conversationListView == null ? false : conversationListView.A0C()) {
                    TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation3.setDuration(220);
                    translateAnimation3.setInterpolator(new AccelerateInterpolator());
                    r23.A01.startAnimation(translateAnimation3);
                } else {
                    ViewGroup viewGroup = r23.A01;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", new float[]{0.0f, (float) (-viewGroup.getHeight())});
                    ListView ADA = r5.ADA();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(ADA, "Top", new int[]{ADA.getTop(), ADA.getTop() - viewGroup.getHeight()});
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofInt});
                    animatorSet.addListener(new IDxLAdapterShape1S0200000_2_I1(r23, 0, r13));
                    animatorSet.setDuration(220).start();
                    return;
                }
            }
            r23.A05(r13);
        }
    }

    public final void A02(boolean z2) {
        AnonymousClass2VZ r3 = ((Conversation) ((C42801yh) this.A01)).A00.A1j;
        Class<?> cls = getClass();
        C49692Vb r1 = (C49692Vb) r3.A00.get(cls);
        if (cls.equals(r3.A01) && r1 != null) {
            r1.A01(new C82724Dx(r3), z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass309
            if (r0 == 0) goto L_0x0016
            r1 = r7
            X.309 r1 = (X.AnonymousClass309) r1
            X.0sL r0 = r1.A02
            if (r0 == 0) goto L_0x0014
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0014
            int r0 = r1.A00
            r1 = 1
            if (r0 > 0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        L_0x0016:
            boolean r0 = r7 instanceof X.AnonymousClass306
            if (r0 == 0) goto L_0x0055
            r3 = r7
            X.306 r3 = (X.AnonymousClass306) r3
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0014
            X.0s5 r1 = r3.A01
            X.0tC r0 = X.C15910s6.A1F
            int r0 = r1.A02(r0)
            if (r0 <= 0) goto L_0x0014
            X.0rt r2 = r3.A03
            X.0sH r1 = r3.A00
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r1.A08(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0C()
            java.lang.Object r0 = r0.get(r1)
            X.0rx r0 = (X.C15840rx) r0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x0014
            X.0sH r0 = r3.A00
            X.1cF r0 = r0.A0H
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0015
            goto L_0x0014
        L_0x0055:
            boolean r0 = r7 instanceof X.AnonymousClass307
            if (r0 == 0) goto L_0x007d
            r3 = r7
            X.307 r3 = (X.AnonymousClass307) r3
            X.0rz r0 = r3.A06
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "pnh_cag_future_proof_banner_closed"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0014
            X.0pd r2 = r3.A07
            r1 = 2433(0x981, float:3.41E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            goto L_0x0014
        L_0x007d:
            r5 = r7
            X.2Va r5 = (X.C49682Va) r5
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0014
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x0014
            X.1Rr r2 = r5.A08
            X.0sH r0 = r5.A01
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r0.A08(r6)
            X.AnonymousClass00B.A06(r1)
            X.0rv r1 = (X.C15830rv) r1
            X.0rt r0 = r2.A03
            X.0rx r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x0014
            long r3 = r0.A0A
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0014
            com.whatsapp.jid.UserJid r0 = r5.A02
            if (r0 == 0) goto L_0x0014
            X.0sH r0 = r5.A01
            com.whatsapp.jid.Jid r1 = r0.A08(r6)
            X.AnonymousClass00B.A06(r1)
            com.whatsapp.jid.UserJid r0 = r5.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0014
            X.0sG r1 = r5.A06
            com.whatsapp.jid.UserJid r0 = r5.A02
            X.0sH r0 = r1.A0A(r0)
            X.1ko r0 = r0.A0D
            r1 = 1
            if (r0 == 0) goto L_0x0015
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49692Vb.A03():boolean");
    }

    public final boolean A04() {
        AnonymousClass2VZ r2 = ((Conversation) ((C42801yh) this.A01)).A00.A1j;
        return r2.A01 != null && r2.A00.get(r2.A01) == this;
    }
}
