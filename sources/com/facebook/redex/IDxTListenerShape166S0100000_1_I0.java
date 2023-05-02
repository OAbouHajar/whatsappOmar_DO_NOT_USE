package com.facebook.redex;

import X.AnonymousClass02W;
import X.AnonymousClass29N;
import X.AnonymousClass2JH;
import X.AnonymousClass2JI;
import X.AnonymousClass2S8;
import X.AnonymousClass329;
import X.AnonymousClass3BH;
import X.AnonymousClass4IK;
import X.C108715Pb;
import X.C109375Rw;
import X.C13680ns;
import X.C41631wI;
import X.C456029n;
import X.C456629y;
import X.C56972pY;
import X.C616839w;
import X.C64623Ra;
import X.C85234Nq;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.obwhatsapp.gallerypicker.PhotoViewPager;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.Iterator;

public class IDxTListenerShape166S0100000_1_I0 implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public IDxTListenerShape166S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void A00() {
        NumberEntryKeyboard numberEntryKeyboard = (NumberEntryKeyboard) this.A00;
        numberEntryKeyboard.A05 = null;
        if (numberEntryKeyboard.A0E) {
            C85234Nq r1 = (C85234Nq) numberEntryKeyboard.A0D.get(Long.valueOf(numberEntryKeyboard.A02));
            if (r1.A02.isRunning()) {
                r1.A05 = true;
                return;
            }
            ValueAnimator valueAnimator = r1.A03;
            if (!valueAnimator.isRunning()) {
                valueAnimator.start();
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        Rect rect;
        int i3;
        int i4;
        float f2;
        AnonymousClass02W layoutManager;
        AnonymousClass29N r2;
        View view2;
        int i5;
        int i6;
        VideoCallParticipantView videoCallParticipantView;
        switch (this.A01) {
            case 0:
                AnonymousClass2JH r5 = (AnonymousClass2JH) this.A00;
                if (!(motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    Point point = new Point(((int) x2) + iArr[0], ((int) y2) + iArr[1]);
                    WaEditText waEditText = r5.A0K;
                    if (waEditText != null && waEditText.isShown() && AnonymousClass2JI.A02(point, waEditText) && ((rect = waEditText.A00) == null || ((i3 = point.x) >= rect.left && i3 <= rect.right && (i4 = point.y) >= rect.top && i4 <= rect.bottom))) {
                        r5.A08(waEditText);
                        return true;
                    } else if (motionEvent.getY() < 0.0f) {
                        return true;
                    }
                }
                AnonymousClass3BH r1 = r5.A07;
                C56972pY r0 = r1.A04;
                if (r0 == null || !r0.isShowing()) {
                    return false;
                }
                C56972pY r6 = r1.A04;
                int x3 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                ViewGroup viewGroup = (ViewGroup) r6.getContentView();
                int[] iArr2 = r6.A01;
                view.getLocationOnScreen(iArr2);
                int i7 = x3 + iArr2[0];
                int i8 = y3 + iArr2[1];
                int childCount = viewGroup.getChildCount();
                View view3 = r6.A00;
                r6.A00 = null;
                int i9 = 0;
                while (true) {
                    if (i9 < childCount) {
                        View childAt = viewGroup.getChildAt(i9);
                        childAt.getLocationOnScreen(iArr2);
                        int i10 = iArr2[0];
                        if (i7 <= i10 || i7 >= i10 + childAt.getWidth() || i8 <= (i2 = iArr2[1]) || i8 >= i2 + childAt.getHeight()) {
                            i9++;
                        } else {
                            childAt.setPressed(true);
                            r6.A00 = childAt;
                        }
                    } else {
                        i9 = 0;
                    }
                }
                if (!(view3 == null || view3 == r6.A00)) {
                    view3.setPressed(false);
                }
                if (motionEvent.getAction() != 1 || r6.A00 == null) {
                    return false;
                }
                int[] iArr3 = r6.A04[i9];
                C108715Pb r02 = r6.A03;
                if (r02 != null) {
                    r02.AXI(iArr3);
                }
                r6.dismiss();
                return false;
            case 1:
                C456029n r8 = (C456029n) ((C456629y) this.A00).A0D;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            AnonymousClass2S8 r13 = r8.A09;
                            if (r13.A06 != null || (layoutManager = r8.A06.getLayoutManager()) == null) {
                                return false;
                            }
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            float y4 = r8.A01 - motionEvent.getY();
                            float x4 = r8.A00 - motionEvent.getX();
                            float f3 = 0.0f;
                            if (x4 <= 0.0f ? linearLayoutManager.A18() > 0 : linearLayoutManager.A1A() < r8.A02.A0C() - 1) {
                                f3 = Math.abs(x4);
                            }
                            float dimension = r8.A05.getResources().getDimension(R.dimen.dimen00bb);
                            if (f3 >= dimension) {
                                f2 = -1.0f;
                                r8.A00 = -1.0f;
                            } else if (y4 <= dimension) {
                                return false;
                            } else {
                                AnonymousClass329 r15 = (AnonymousClass329) view;
                                PhotoViewPager photoViewPager = r8.A08;
                                float x5 = motionEvent.getX();
                                float y5 = motionEvent.getY();
                                r13.A06 = r15;
                                r13.A04 = r15.A05.A0G;
                                ImageView imageView = r13.A09;
                                imageView.setImageDrawable(r15.getDrawable());
                                imageView.setMaxWidth(r15.getWidth());
                                imageView.setMaxHeight(r15.getHeight());
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(r15.getWidth(), r15.getHeight()));
                                r13.A00 = x5;
                                r13.A01 = y5;
                                r13.A06.invalidate();
                                Handler handler = r13.A0C;
                                Runnable runnable = r13.A0D;
                                handler.removeCallbacks(runnable);
                                handler.postDelayed(runnable, 100);
                                View view4 = r13.A05;
                                view4.setBackgroundColor(0);
                                TextView textView = r13.A0A;
                                textView.setTextColor(0);
                                r13.A03.setAlpha(0);
                                ViewGroup viewGroup2 = r13.A08;
                                viewGroup2.setVisibility(0);
                                ViewGroup viewGroup3 = r13.A07;
                                int[] iArr4 = r13.A0E;
                                viewGroup3.getLocationOnScreen(iArr4);
                                int i11 = iArr4[0];
                                int i12 = iArr4[1];
                                r13.A06.getLocationOnScreen(iArr4);
                                viewGroup3.setPadding(iArr4[0] - i11, iArr4[1] - i12, 0, 0);
                                view4.setPadding(0, 0, 0, viewGroup2.getHeight() - photoViewPager.getHeight());
                                textView.getLocationOnScreen(iArr4);
                                C64623Ra r03 = r15.A07;
                                if (r03 == null || (r2 = r8.A04) == null) {
                                    return false;
                                }
                                int A002 = r03.A00();
                                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r2;
                                if (mediaComposerActivity.A35() == A002) {
                                    return false;
                                }
                                mediaComposerActivity.A0l.A04(A002);
                                mediaComposerActivity.A0o.A08.A02.A01();
                                return false;
                            }
                        } else if (action != 3) {
                            return false;
                        }
                    }
                    AnonymousClass2S8 r04 = r8.A09;
                    r04.A0C.removeCallbacks(r04.A0D);
                    return false;
                }
                r8.A00 = motionEvent.getX();
                f2 = motionEvent.getY();
                r8.A01 = f2;
                return false;
            case 2:
                NumberEntryKeyboard numberEntryKeyboard = (NumberEntryKeyboard) this.A00;
                if (numberEntryKeyboard.A06 != null) {
                    float x6 = motionEvent.getX();
                    float y6 = motionEvent.getY();
                    int i13 = 0;
                    while (true) {
                        view2 = null;
                        if (i13 < numberEntryKeyboard.A0H.length) {
                            int i14 = 0;
                            while (true) {
                                AnonymousClass4IK[][] r82 = numberEntryKeyboard.A0H;
                                if (i14 >= r82[0].length) {
                                    i13++;
                                } else if (r82[i13][i14] == null || !r82[i13][i14].A01.contains(x6, y6)) {
                                    i14++;
                                } else {
                                    View view5 = numberEntryKeyboard.A0G[i13][i14];
                                    if (!(view5.getId() == R.id.custom_key_container && numberEntryKeyboard.A0A == null)) {
                                        view2 = view5;
                                    }
                                }
                            }
                        }
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        if (action2 != 1) {
                            if (action2 == 2) {
                                View view6 = numberEntryKeyboard.A05;
                                if (view6 == null || view6 == view2) {
                                    return true;
                                }
                                A00();
                                return false;
                            } else if (action2 != 3) {
                                return true;
                            }
                        }
                        View view7 = numberEntryKeyboard.A05;
                        if (view7 == null) {
                            return true;
                        }
                        if (action2 == 1) {
                            if (view7.getId() != R.id.custom_key_container) {
                                View view8 = numberEntryKeyboard.A05;
                                if (view8.getId() == R.id.one_key) {
                                    i5 = 8;
                                } else if (view8.getId() == R.id.two_key) {
                                    i5 = 9;
                                } else if (view8.getId() == R.id.three_key) {
                                    i5 = 10;
                                } else if (view8.getId() == R.id.four_key) {
                                    i5 = 11;
                                } else if (view8.getId() == R.id.five_key) {
                                    i5 = 12;
                                } else if (view8.getId() == R.id.six_key) {
                                    i5 = 13;
                                } else if (view8.getId() == R.id.seven_key) {
                                    i5 = 14;
                                } else if (view8.getId() == R.id.eight_key) {
                                    i5 = 15;
                                } else if (view8.getId() == R.id.nine_key) {
                                    i5 = 16;
                                } else {
                                    i5 = 67;
                                    if (view8.getId() == R.id.zero_key) {
                                        i5 = 7;
                                    }
                                }
                                numberEntryKeyboard.A06.dispatchKeyEvent(new KeyEvent(0, 0, 0, i5, 0));
                                numberEntryKeyboard.A06.dispatchKeyEvent(new KeyEvent(0, 0, 1, i5, 0));
                            } else {
                                C109375Rw r22 = numberEntryKeyboard.A0A;
                                if (r22 != null) {
                                    r22.AVD(numberEntryKeyboard.A06);
                                }
                            }
                        }
                        A00();
                        return true;
                    } else if (numberEntryKeyboard.A05 == null && view2 != null) {
                        numberEntryKeyboard.A05 = view2;
                        numberEntryKeyboard.A02 = System.currentTimeMillis();
                        if (numberEntryKeyboard.A0E) {
                            PointF pointF = ((AnonymousClass4IK) numberEntryKeyboard.A0C.get(view2)).A00;
                            float f4 = pointF.x;
                            float f5 = pointF.y;
                            long j2 = numberEntryKeyboard.A02;
                            if (numberEntryKeyboard.A0E) {
                                PointF pointF2 = new PointF(f4, f5);
                                int i15 = NumberEntryKeyboard.A0J;
                                C85234Nq r3 = new C85234Nq(pointF2, numberEntryKeyboard.A09, (float) numberEntryKeyboard.A01, (float) numberEntryKeyboard.A00, i15, j2);
                                numberEntryKeyboard.A0D.put(Long.valueOf(j2), r3);
                                r3.A05 = false;
                                ValueAnimator valueAnimator = r3.A02;
                                if (!valueAnimator.isRunning()) {
                                    valueAnimator.start();
                                }
                            }
                        }
                        Vibrator A0K = numberEntryKeyboard.A07.A0K();
                        if (A0K == null) {
                            return true;
                        }
                        C41631wI.A00(A0K, 80);
                        return true;
                    }
                }
                return view.performClick();
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                VideoCallParticipantView videoCallParticipantView2 = (VideoCallParticipantView) view;
                if (!videoCallParticipantView2.A08()) {
                    return false;
                }
                UserJid userJid = videoCallParticipantView2.A0F;
                int action3 = motionEvent.getAction();
                boolean z2 = true;
                if (action3 != 0) {
                    if (action3 != 1) {
                        return false;
                    }
                    z2 = false;
                }
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
                if (z2) {
                    int dimensionPixelSize = videoCallParticipantView2.getResources().getDimensionPixelSize(R.dimen.dimen042d);
                    int width = videoCallParticipantView2.getWidth();
                    int height = videoCallParticipantView2.getHeight();
                    if (width > dimensionPixelSize && height > dimensionPixelSize) {
                        videoCallParticipantView2.animate().setDuration((long) VideoCallParticipantView.A0Q).setInterpolator(decelerateInterpolator).scaleX(((float) (width - dimensionPixelSize)) / ((float) width)).scaleY(((float) (height - dimensionPixelSize)) / ((float) height));
                    }
                    i6 = videoCallParticipantView2.getResources().getDimensionPixelSize(R.dimen.dimen042c);
                } else {
                    videoCallParticipantView2.animate().setDuration((long) VideoCallParticipantView.A0Q).scaleX(1.0f).scaleY(1.0f).setInterpolator(decelerateInterpolator);
                    i6 = 0;
                }
                videoCallParticipantView2.A03(i6);
                Iterator A0q = C13680ns.A0q(voipActivityV2.A1h);
                while (A0q.hasNext()) {
                    C616839w r12 = (C616839w) A0q.next();
                    if (!r12.A04.equals(userJid) && (videoCallParticipantView = r12.A00) != null) {
                        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
                        ViewPropertyAnimator duration = videoCallParticipantView.A0H.animate().setDuration((long) VideoCallParticipantView.A0Q);
                        float f6 = 0.0f;
                        if (z2) {
                            f6 = 1.0f;
                        }
                        duration.alpha(f6).setInterpolator(accelerateInterpolator);
                    }
                }
                return false;
        }
    }
}
