package com.obwhatsapp.youbasha.ui.views;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.i0;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class FloatingActionsMenu extends ViewGroup {
    public static final int EXPAND_DOWN = 1;
    public static final int EXPAND_LEFT = 2;
    public static final int EXPAND_RIGHT = 3;
    public static final int EXPAND_UP = 0;
    public static final int LABELS_ON_LEFT_SIDE = 0;
    public static final int LABELS_ON_RIGHT_SIDE = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final OvershootInterpolator f1362o = new OvershootInterpolator();

    /* renamed from: p  reason: collision with root package name */
    public static final DecelerateInterpolator f1363p = new DecelerateInterpolator(3.0f);

    /* renamed from: q  reason: collision with root package name */
    public static final DecelerateInterpolator f1364q = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public int f1365a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1366b;

    /* renamed from: c  reason: collision with root package name */
    public int f1367c;

    /* renamed from: d  reason: collision with root package name */
    public int f1368d;

    /* renamed from: e  reason: collision with root package name */
    public int f1369e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1370f;

    /* renamed from: g  reason: collision with root package name */
    public final AnimatorSet f1371g;

    /* renamed from: h  reason: collision with root package name */
    public final AnimatorSet f1372h;

    /* renamed from: i  reason: collision with root package name */
    public g f1373i;

    /* renamed from: j  reason: collision with root package name */
    public RotatingDrawable f1374j;

    /* renamed from: k  reason: collision with root package name */
    public int f1375k;

    /* renamed from: l  reason: collision with root package name */
    public int f1376l;

    /* renamed from: m  reason: collision with root package name */
    public TouchDelegateGroup f1377m;

    /* renamed from: n  reason: collision with root package name */
    public OnFloatingActionsMenuUpdateListener f1378n;

    public interface OnFloatingActionsMenuUpdateListener {
        void onMenuCollapsed();

        void onMenuExpanded();
    }

    class RotatingDrawable extends LayerDrawable {

        /* renamed from: a  reason: collision with root package name */
        public float f1379a;

        public RotatingDrawable(Drawable drawable) {
            super(new Drawable[]{drawable});
        }

        public final void draw(Canvas canvas) {
            String str = "ۗۦۙۦۘۜۢۜۨۧۡۦۘ۬۬ۙۛۗۤۛۚۤۖۧ۬ۢ";
            while (true) {
                switch ((str.hashCode() ^ 851) ^ 268942412) {
                    case -1077120348:
                        canvas.save();
                        str = "ۚۜۤۧۧۘ۬ۨۢ۫ۜۖۨۦۦۘۤۡۤ";
                        break;
                    case -900570456:
                        canvas.restore();
                        str = "ۜ۠ۧۥۘۚ۟ۢ۫ۤ۫ۘۦۜۨۦۚۤ۫ۛ";
                        break;
                    case -874421572:
                        str = "ۧۜ۫ۥۘۜۘۜۨۘۜۤۨۚ۠ۦۖۢۡ";
                        break;
                    case -838708015:
                        str = "ۢۘۙۨۡۛۘ۠ۙ۬۠ۦ۫۟ۗۗۤ۫";
                        break;
                    case -798556163:
                        canvas.rotate(this.f1379a, (float) getBounds().centerX(), (float) getBounds().centerY());
                        str = "۫ۖ۬ۜۚۨۘۚۘۘۚۘۡۘ۠۠۠ۘۘۘۖۢۨۘ";
                        break;
                    case 390240907:
                        super.draw(canvas);
                        str = "ۧ۟ۥ۬۠ۘۘۢۛۘۚۗۗ۠ۛ۬ۤۦ";
                        break;
                    case 707662820:
                        return;
                }
            }
        }

        public float getRotation() {
            String str = "ۖۤۡۘۗۡۜ۬ۗۨۘۨۨۜۨۨ۬۫ۥۡۘۢ۫ۦ";
            while (true) {
                switch ((str.hashCode() ^ 759) ^ -1277097885) {
                    case -853999587:
                        return this.f1379a;
                    case -607381440:
                        str = "۠ۚۘۤۧۚۛ۫۟ۘۢۙۙ۫ۗ۫ۖ۠";
                        break;
                }
            }
        }

        @Keep
        public void setRotation(float f2) {
            String str = "۬۠ۤۖۥۘۙۖۦۜۦۘ۠۠۠ۧ۫ۦۘ۫ۧۨ";
            while (true) {
                switch ((str.hashCode() ^ 13) ^ 1360465353) {
                    case -1943648604:
                        this.f1379a = f2;
                        str = "ۚۖ۠ۜ۫ۘۙ۫ۦۘ۫ۨۥ۠ۗۨۦۦ۠ۡ۠ۥۘ";
                        break;
                    case -1790650041:
                        str = "ۤۚۨۗ۫ۘۘۤۖۦۘۙ۬ۛۗۖۘۥۢۦۘۙۜۨۜۥۤ";
                        break;
                    case -1325056499:
                        return;
                    case -276172732:
                        invalidateSelf();
                        str = "ۤۙۨۦۖۡۘۢۘ۬۠۠ۘۘۚۘۖۖ۫ۥۢ۟ۘۘۤۦۦ۟۫ۨ";
                        break;
                    case 715384784:
                        str = "ۤۚۥ۬ۢۦ۬ۢۦۨۥۘۛۘ۬";
                        break;
                }
            }
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new i0(3);
        public boolean mExpanded;

        static {
            String str = "ۢۥۛ۟ۨۘۘۗۛۛۦۤۢۚۨۘۜۥۘۘ";
            while (true) {
                switch ((str.hashCode() ^ 765) ^ -106424035) {
                    case 214668298:
                        return;
                    case 253753349:
                        str = "ۚۚۡۘۦۛۢۛۨۦۙۤۘ۠۫ۗۦۖۜ";
                        break;
                }
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z2;
            int readInt = parcel.readInt();
            String str = "۟ۢ۟ۡ۬ۡۚۦۥۘۙۛۜۘۜ۟ۨ";
            while (true) {
                switch (str.hashCode() ^ -861092306) {
                    case -1841065184:
                        str = "ۜۗۖۤۥۜۥۙۖۢۖۡۢۜۗۖۡۖ";
                        continue;
                    case -1116473176:
                        z2 = false;
                        break;
                    case 1755865472:
                        if (readInt == 1) {
                            str = "ۛۦۜۨۙۤ۫ۧۚۦۦۡۘۦۢۚۨ۟ۡ۬ۥۦ";
                            break;
                        } else {
                            str = "۬ۧۚۥ۬ۙۥۨۘۢۧۤ۠ۨ۫";
                            continue;
                        }
                    case 2085901079:
                        z2 = true;
                        break;
                }
            }
            this.mExpanded = z2;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            String str = "ۨۜۜۘۖ۠ۢۢۙۛ۫ۚۙ۬ۧ۟ۚۜۘۦۘۚ۬ۤۚۘۥۢ";
            while (true) {
                switch ((str.hashCode() ^ 210) ^ 1476380382) {
                    case -1531938844:
                        str = "ۖۜۨۤ۟ۘۙۧۢۘۨۦۚۙۖ۬ۖۦ";
                        break;
                    case -1064085766:
                        return;
                    case -825714701:
                        super.writeToParcel(parcel, i2);
                        str = "ۙۚۖۘۦ۟ۨۤۧۡۘۛۡۜۘۖۘۘ";
                        break;
                    case 49365719:
                        str = "ۛۘۘۘ۫ۧۜ۠ۧۨۧۡۜ۟۟۫ۚۖۘۘۘۚۡۜۨ";
                        break;
                    case 695494722:
                        parcel.writeInt(this.mExpanded ? 1 : 0);
                        str = "۟ۘ۫۟۟ۡۘۡ۬ۤ۬ۚۦ۠۬ۙۖۧ۫ۖۘۘۘۢۡ";
                        break;
                    case 1856521582:
                        str = "ۥ۟ۙۗۡۜۥۗۘۘۧۘۘۘۡۘۦۘ";
                        break;
                }
            }
        }
    }

    static {
        String str = "ۥ۠ۦۘۗ۠ۦۛ۫ۘۘ۬ۚۧۥۨۜۗۧۨۨ۟ۘ";
        while (true) {
            switch ((str.hashCode() ^ 401) ^ 622569614) {
                case -1701351208:
                    str = "ۦۛۥۘۤۢ۠ۥۦۙۦۛۙۚۥۨۙۥ۟";
                    break;
                case 45295635:
                    str = "ۘۨۧۘ۬ۤۥۘۗۨۗۗۥۙۙۢۘۜۘۡۢۢ";
                    break;
                case 643763843:
                    return;
                case 1891638134:
                    str = "۫ۨۡۦۤۡۘ۟۬ۤۗۥۡۗۘۙۗۗۜۘۙۤۖۘ";
                    break;
            }
        }
    }

    public FloatingActionsMenu(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionsMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1371g = new AnimatorSet().setDuration(300);
        this.f1372h = new AnimatorSet().setDuration(300);
        b(context);
    }

    public FloatingActionsMenu(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1371g = new AnimatorSet().setDuration(300);
        this.f1372h = new AnimatorSet().setDuration(300);
        b(context);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = "ۘۜۨۘ۠ۘۛۢۘۘۖ۬ۢۦۧۡۛۡۘۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r2 = 0
            r12 = 0
            r6 = 0
            java.lang.String r0 = "ۧۤۘۤۙۡۙۘۦۘ۟۬ۢۘۖۚ۫ۖۥۘ۟ۨۡۘۙ۫۠ۡۨۨ"
            r1 = r2
            r3 = r2
            r4 = r6
            r8 = r6
        L_0x000a:
            int r2 = r0.hashCode()
            r10 = 183(0xb7, float:2.56E-43)
            r11 = 688596515(0x290b2623, float:3.089728E-14)
            r2 = r2 ^ r10
            r2 = r2 ^ r11
            switch(r2) {
                case -1923007277: goto L_0x006c;
                case -1688028652: goto L_0x0078;
                case -1474814086: goto L_0x006f;
                case -1390932855: goto L_0x00c2;
                case -610270322: goto L_0x0019;
                case -461562594: goto L_0x007c;
                case -433041307: goto L_0x0040;
                case -294022691: goto L_0x009e;
                case -159364113: goto L_0x00bb;
                case 335838851: goto L_0x008f;
                case 362324308: goto L_0x0098;
                case 1116598357: goto L_0x004d;
                case 1276468254: goto L_0x0088;
                case 1849671905: goto L_0x001c;
                case 1949000657: goto L_0x0073;
                case 1949576427: goto L_0x0082;
                case 2034231609: goto L_0x00c6;
                case 2083202107: goto L_0x0045;
                case 2127686461: goto L_0x001f;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "ۥۢۢۘۜۜۘۧۗۡۘۨ۫ۜۘۚۡۖ۟۫ۥ"
            goto L_0x000a
        L_0x001c:
            java.lang.String r0 = "ۖۥۖۘ۬ۥ۬ۘۧ۫ۦۗۨۘۧۦۛ۫ۖۦۘۙۖۤ"
            goto L_0x000a
        L_0x001f:
            r2 = 1367630892(0x5184642c, float:7.1077036E10)
            java.lang.String r0 = "ۗۚۨۚ۬ۚۙ۟ۙۦۨۖۨۖ۬ۧۗۗۙۖۘ"
        L_0x0024:
            int r10 = r0.hashCode()
            r10 = r10 ^ r2
            switch(r10) {
                case -2009904296: goto L_0x003a;
                case 273305517: goto L_0x003d;
                case 653797762: goto L_0x0033;
                case 997599777: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            java.lang.String r0 = "ۘۜۨۘ۠ۘۛۢۘۘۖ۬ۢۦۧۡۛۡۘۘ"
            goto L_0x000a
        L_0x0030:
            java.lang.String r0 = "۠ۢۜۘ۟ۤۥۘۚۧۡۘ۬ۛۦ۠ۜۦۛۘۜ۫ۦۢۗۥۘۙۗ۠"
            goto L_0x0024
        L_0x0033:
            boolean r0 = r13.f1370f
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "ۧۢۡۨ۬ۜۘ۬ۜۖۘۘۙۖۧۗۧۢۖۘۙۤۚۚۢۡ"
            goto L_0x0024
        L_0x003a:
            java.lang.String r0 = "۠ۦۜۚۦۜۘۛۤۤۢۖۡۗۨۢ"
            goto L_0x0024
        L_0x003d:
            java.lang.String r0 = "ۤۢۜۚۨۜۘۨۥ۬ۖۢ۫ۢ۟۬ۡ۫ۜ۬"
            goto L_0x000a
        L_0x0040:
            r13.f1370f = r12
            java.lang.String r0 = "۠ۜۗۥ۬ۦۘۖۜۨ۬ۚۙۨۛ۟"
            goto L_0x000a
        L_0x0045:
            com.obwhatsapp.youbasha.ui.views.TouchDelegateGroup r0 = r13.f1377m
            r0.setEnabled(r12)
            java.lang.String r0 = "۠ۜۢ۬ۙۧ۫ۨۘۤۚ۠ۢ۠۫ۤۗ۬۫۟ۨ۟ۥۘۚۥۙ"
            goto L_0x000a
        L_0x004d:
            r2 = 2134735408(0x7f3d7a30, float:2.5185852E38)
            java.lang.String r0 = "ۙۘۥ۬۫ۜۡ۬ۜ۫ۙۥۜۚۦۛۥۖ"
        L_0x0052:
            int r10 = r0.hashCode()
            r10 = r10 ^ r2
            switch(r10) {
                case -1678159567: goto L_0x0061;
                case -920575854: goto L_0x0066;
                case -910073164: goto L_0x005b;
                case 669375410: goto L_0x0069;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x0052
        L_0x005b:
            java.lang.String r0 = "ۖۗۜۗۦۘۘۗۗۨۗۘ۟ۗۙۧۖۖ"
            goto L_0x000a
        L_0x005e:
            java.lang.String r0 = "ۨۜۢ۬ۘۧۗۧۖۘۨۡۧۖۚۗ"
            goto L_0x0052
        L_0x0061:
            if (r14 == 0) goto L_0x005e
            java.lang.String r0 = "ۨۡۧۚ۠۟ۛۙۙۤۘۗ۫۟ۘۧۖۤۦۘۘ"
            goto L_0x0052
        L_0x0066:
            java.lang.String r0 = "۟ۛ۬ۜۤۘۘۥۨۗ۬ۖۖۘۡۚۧۥۗۙ۠ۢۥ"
            goto L_0x0052
        L_0x0069:
            java.lang.String r0 = "ۤۨۘۜۙۙۦۛۧۗۗۢۢ۬ۜۘۧۚ۟۫ۘۜۘۖ۫ۘ۫ۜۤ"
            goto L_0x000a
        L_0x006c:
            java.lang.String r0 = "ۚ۬ۥۗۤۧۘۖۨۜۡۥۜۨۗ"
            goto L_0x000a
        L_0x006f:
            java.lang.String r0 = "ۨۧۜۘۜۛۖۘۤ۫ۜۘۜۥۥۜ۠ۖۘۚۖۦۧۙ۟۬۬ۡۘ"
            r8 = r6
            goto L_0x000a
        L_0x0073:
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.String r0 = "ۚۡۜۘۖ۫۫ۥۙۚ۬ۘۦۘ۬ۧ۬"
            goto L_0x000a
        L_0x0078:
            java.lang.String r0 = "۠ۘۖۘ۟ۘ۠۟ۤۛ۫ۢ۬ۛ۬ۧ"
            r8 = r4
            goto L_0x000a
        L_0x007c:
            android.animation.AnimatorSet r2 = r13.f1372h
            java.lang.String r0 = "۟ۢۚۛۧۦۧۦۤۧۘۥۙۥۘۙ۟۟"
            r3 = r2
            goto L_0x000a
        L_0x0082:
            r3.setDuration(r8)
            java.lang.String r0 = "۠ۚۙۢۜۦۚۢۗۖ۟ۖۘۖۡۦۘ"
            goto L_0x000a
        L_0x0088:
            r3.start()
            java.lang.String r0 = "۫۠ۨۘ۬ۖۥۧ۟ۘۗۡ۟۟ۢۘ۠۫ۖۦ۫ۡۘۥۨۜۘۛۖ"
            goto L_0x000a
        L_0x008f:
            android.animation.AnimatorSet r0 = r13.f1371g
            r0.cancel()
            java.lang.String r0 = "۠ۨ۠ۨ۠ۨۙۥۡۘۡۜۢۥۘۘ۬ۖۘۘۚۢۛۚۨۨۘ۠۬ۚ"
            goto L_0x000a
        L_0x0098:
            com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu$OnFloatingActionsMenuUpdateListener r1 = r13.f1378n
            java.lang.String r0 = "ۘۢۦۚۙۜۦۘ۬ۢۚۘ۟ۤۦۘۥۜۜۘۚۖۖ"
            goto L_0x000a
        L_0x009e:
            r2 = 721763270(0x2b053bc6, float:4.7334044E-13)
            java.lang.String r0 = "ۢۛ۟ۛۥۘۘ۠ۥۚۚۢۡۗۖۜۥۖۗۚ۫ۢۜۢۥ"
        L_0x00a3:
            int r10 = r0.hashCode()
            r10 = r10 ^ r2
            switch(r10) {
                case -222269736: goto L_0x00b4;
                case 597912354: goto L_0x002d;
                case 1500783853: goto L_0x00ac;
                case 1863434260: goto L_0x00b7;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            goto L_0x00a3
        L_0x00ac:
            if (r1 == 0) goto L_0x00b1
            java.lang.String r0 = "ۗۗۥۘۨۜۘۘۜۨۛۥۤۜۘۖ۠ۦۤۥ۟ۢۨۥۘ"
            goto L_0x00a3
        L_0x00b1:
            java.lang.String r0 = "ۡۧۛۥۨ۬ۡۨۘۧۛ۬۟ۙۙ"
            goto L_0x00a3
        L_0x00b4:
            java.lang.String r0 = "۠ۤۜۜۗۘۘ۟ۙۦۘۦۗۘۘ۫ۗ۟۫ۜۡۘ۟ۧ۬۬۬۫"
            goto L_0x00a3
        L_0x00b7:
            java.lang.String r0 = "ۨ۬ۗۦۘۦۘۡ۟ۖۘۤۜۘۘ۫ۙۜۘ۟ۢۨۘ۠۫ۘۘۚۘۘۘۡ۬ۛ"
            goto L_0x000a
        L_0x00bb:
            r1.onMenuCollapsed()
            java.lang.String r0 = "ۘۜۨۘ۠ۘۛۢۘۘۖ۬ۢۦۧۡۛۡۘۘ"
            goto L_0x000a
        L_0x00c2:
            java.lang.String r0 = "۠ۘۖۘ۟ۘ۠۟ۤۛ۫ۢ۬ۛ۬ۧ"
            goto L_0x000a
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu.a(boolean):void");
    }

    public void addButton(FloatingActionButton floatingActionButton) {
        String str = "۠۠ۤۧۡۦۘۚۘۤۡۚۜۘۦ۫ۥۢ۟ۧۛ۟ۘۧۢۨۧ۟ۦ";
        while (true) {
            switch ((str.hashCode() ^ 471) ^ -1049169853) {
                case -1377512717:
                    return;
                case -525007343:
                    this.f1376l++;
                    str = "ۨۚۘۘۗۨۘۢۡۧ۟۫ۨۘۜۘ۫ۛۙۦۘۧۦ۠۟ۢۥۘ";
                    break;
                case -488388161:
                    str = "ۦ۠ۜۥۢۤۨ۟ۙ۬ۚۥۘۦۧۜۘ";
                    break;
                case -42034225:
                    addView(floatingActionButton, this.f1376l - 1);
                    str = "ۚۨۚۤۢۖۘۢۖۛۚ۠ۦ۟ۘۧۧۥۦۤۘۘ";
                    break;
                case 587730836:
                    str = "۟ۖۢۡۥۘۜۖۖ۫ۘۛۙۧۨۦۙ۫ۥۜۛ";
                    break;
            }
        }
    }

    public final void b(Context context) {
        String str = "ۧۢۡۘ۟ۥۤ۬ۚۨۘۥۙۘۘۥۙۨۘۘۨۧ۟ۜۘۘۡۥۘۘ";
        g gVar = null;
        TouchDelegateGroup touchDelegateGroup = null;
        while (true) {
            switch ((str.hashCode() ^ 370) ^ -1336149355) {
                case -2114435449:
                    this.f1365a = FloatingActionButton.getFABIconsColor();
                    str = "ۢ۠ۖۗۡۙۖ۫ۖ۬۬ۢۧۜۜۘ۟ۥۛۗ۫۫۠ۧۜۘ۬۟۠";
                    break;
                case -2042443706:
                    gVar = new g(this, context);
                    str = "ۖ۬ۢۧۘۨۘۗ۬ۨۖۢۖۤۢۗ۠ۧۡ۫ۥۘۖۖۧۛ";
                    break;
                case -1157011464:
                    this.f1366b = true;
                    str = "ۦ۠۫ۜ۬ۜۛۖ۫ۖ۫ۤۚۦۡۖۚ۠";
                    break;
                case -1087506147:
                    setTouchDelegate(touchDelegateGroup);
                    str = "ۜۚ۠ۧ۫ۘ۫ۘۘۛۦۦ۟ۛۦۘ۫۟۫۬ۥ";
                    break;
                case -870322681:
                    str = "ۛ۬ۦۘۙۖۤۛۡۡۛۜۖۦۚۜۨۦۖۦۥۥۘۨۙۧ";
                    break;
                case -828008195:
                    this.f1376l++;
                    str = "۫ۦۦۡۛۨۥۧۗۗۘۛۧۡ۠ۦۗ۫ۘ۟ۢ";
                    break;
                case -590837064:
                    this.f1373i.setOnClickListener(new f(this, 0));
                    str = "ۨۡۨۘ۟ۨۦۘۢۘۘۨ۟ۚۙۘۡۘ۠۟ۖۘۚۖ";
                    break;
                case -563875606:
                    this.f1373i = gVar;
                    str = "ۡۖۤ۠ۜ۫۬ۘۘۘۦۡۚۦۤۥۢۜۛ۠ۜۛ";
                    break;
                case -86301242:
                    str = "ۗ۠ۡ۟ۙ۫ۙ۫ۚۦۡ۫ۨ۟ۧ۫ۛ۬ۥۘ";
                    touchDelegateGroup = new TouchDelegateGroup(this);
                    break;
                case 398453511:
                    others.getColor("ModFabNormalColor", ColorStore.getFabColorNormal());
                    str = "ۙۥۖۨۖۜ۫۠ۧۖۜۤ۫ۗۦ۬ۙۦۘ";
                    break;
                case 492989443:
                    this.f1368d = getResources().getDimensionPixelSize(yo.getID("fab_labels_margin", "dimen"));
                    str = "ۘۛۤۦۜۙ۬ۤۡۘۤ۬ۖۘ۠ۜۙ۬۠ۥ۟ۡۘ";
                    break;
                case 523969639:
                    this.f1377m = touchDelegateGroup;
                    str = "ۙۚۡۘ۬ۨ۟۟ۚۦۘ۠ۡ۠ۡ";
                    break;
                case 834420497:
                    this.f1367c = (int) ((getResources().getDimension(yo.getID("fab_actions_spacing", "dimen")) - getResources().getDimension(yo.getID("fab_shadow_radius", "dimen"))) - getResources().getDimension(yo.getID("fab_shadow_offset", "dimen")));
                    str = "ۗۗۦۘۨ۟ۡۜۧۙۖۢۛۦۚۥۜ";
                    break;
                case 1348805816:
                    return;
                case 1398577009:
                    str = "ۖۢۙۧۛۦۛۘۡۗۢۦۘۢۤۥۘۦۗۢ";
                    break;
                case 1505359493:
                    this.f1373i.setSize(0);
                    str = "ۤۦۥۥۖۜۘۘۥۨۘۖ۬ۢۨۗۘۘۙۨۖۘۚۚ";
                    break;
                case 1616011967:
                    addView(this.f1373i, super.generateDefaultLayoutParams());
                    str = "ۢۘۧۘۙۨۦۘۧ۬۠ۦۖۛۦۖۡۘۜۡۥۙۙۛ";
                    break;
                case 1633881877:
                    gVar.setId(yo.getID("fab_expand_menu_button", "id"));
                    str = "ۥ۫ۤۜ۫ۢ۟ۗۢ۟ۖۥۘۚۢۢۜۨ۫ۜۖۨۤ۫ۦۘۚۙۤ";
                    break;
                case 1899679648:
                    this.f1369e = getResources().getDimensionPixelSize(yo.getID("fab_shadow_offset", "dimen"));
                    str = "ۘ۟ۚۥۤ۟ۘۦ۠ۦۤ۟۫ۘۜۢۤۖۘۥۦۙ";
                    break;
                case 2038626222:
                    others.getColor("ModFabPressedColor", ColorStore.getFabColorPressed());
                    str = "ۤ۫ۧۙ۫ۜۘۡۧۨۘۜۦۗۙۤۖۚۡۛ۠ۥۛۨۤ";
                    break;
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        String str = "ۢۥۚۚ۠ۧ۬۬ۢۖۡۘۚ۬ۡۘۥۗۖۘ۬ۥۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 867) ^ -2059743838) {
                case -1180274060:
                    str = "ۦۢۡۛ۫ۗۖ۫ۜۘۙۗۖۡۙۨۘۙۢۥۘ۫ۚ۬ۗ۫ۨۘ۟ۧۘۘ";
                    break;
                case -160927156:
                    str = "ۜۦۤۥۨۜۨ۟ۢۡۨ۟ۘۙۗ۠۬ۦۘۙۗۚ۫ۜۨۘ";
                    break;
                case 1450224257:
                    return super.checkLayoutParams(layoutParams);
            }
        }
    }

    public void collapse() {
        String str = "ۦۥۡۘۛۙۛۙۨۥۨۚۨ۟";
        while (true) {
            switch ((str.hashCode() ^ 377) ^ 430661975) {
                case -105868025:
                    return;
                case 463116182:
                    str = "ۨ۫ۨ۫ۘۧۚۦۥۨ۬ۖۖۨۚ۬ۙ۬ۛۜۘ";
                    break;
                case 879437404:
                    a(false);
                    str = "ۘۡۚۘۜۗ۟ۦۖۛۙۜۘ۫ۛۧۨۧۘ";
                    break;
            }
        }
    }

    public void collapseImmediately() {
        String str = "ۗۤ۟ۦۢ۬۟ۜۦۘۢۛ۫ۜۜ۬ۤۡ۫ۘۨۘۜ۬ۜۘ۟ۛۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 627) ^ 2030505177) {
                case -1803800587:
                    return;
                case 1068468822:
                    str = "ۚۥۛۙۗۨۤۛۖۦۡۘۘۙۢ۫ۘۖ۠۫ۚ۠";
                    break;
                case 1551731131:
                    a(true);
                    str = "ۧ۠۟ۦۘۜۤۦۨۘ۠ۦۧۜۧۦۘۤۧ۫ۗۨۗۜۗ۠";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        r0 = "ۜۤۨۘۥۦۜۤۛۘ۫ۨۖۘۥۦۦۘۗ۟ۜۜ۫۠";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void expand() {
        /*
            r6 = this;
            r5 = 1
            r1 = 0
            java.lang.String r0 = "ۡۨۙۤۛۦۘۙۨۚۤۙۖۢۙۡ"
        L_0x0004:
            int r2 = r0.hashCode()
            r3 = 406(0x196, float:5.69E-43)
            r4 = 1660658024(0x62fba168, float:2.3208817E21)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -2041627580: goto L_0x0059;
                case -1884811808: goto L_0x0016;
                case -1260609147: goto L_0x0075;
                case -1115421855: goto L_0x0044;
                case -736578640: goto L_0x0054;
                case -95261739: goto L_0x003c;
                case 177137255: goto L_0x0013;
                case 420021587: goto L_0x007b;
                case 647047032: goto L_0x004c;
                case 838508010: goto L_0x0037;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r0 = "ۖ۬ۖۙۗۨۧۘ۬ۦۧۤ۠ۡۜ۠ۢۗۙ۠ۘۘ۫ۦ۟۟ۘۨ"
            goto L_0x0004
        L_0x0016:
            r2 = -460562950(0xffffffffe48c5dfa, float:-2.0714527E22)
            java.lang.String r0 = "ۚۦۥۘ۟ۘۧۘۧۥ۬ۧۦۛۥۡ"
        L_0x001b:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -815668196: goto L_0x0024;
                case -58716356: goto L_0x0031;
                case 1323043822: goto L_0x0034;
                case 1883995337: goto L_0x002a;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x001b
        L_0x0024:
            java.lang.String r0 = "ۜۤۨۘۥۦۜۤۛۘ۫ۨۖۘۥۦۦۘۗ۟ۜۜ۫۠"
            goto L_0x0004
        L_0x0027:
            java.lang.String r0 = "۫۟ۛۤۦۘۛۨۢ۫ۦۙۛ۟ۥۙ۫ۡ"
            goto L_0x001b
        L_0x002a:
            boolean r0 = r6.f1370f
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "ۘ۫ۥۨۡۧۘۡ۬۬ۛۡۡۘۧۛۤۘۚۖۜۡ۬ۜۛۦ"
            goto L_0x001b
        L_0x0031:
            java.lang.String r0 = "ۡ۫۫ۥ۫ۜۘۤۡۨۧ۟۬۟ۚۥ۫ۡۤ۠۬۫ۙۢۦۛۤ۫"
            goto L_0x001b
        L_0x0034:
            java.lang.String r0 = "ۤۜۡۗۗۛۗۨ۟۠۠ۜۘۙۦۙۛۛۨ"
            goto L_0x0004
        L_0x0037:
            r6.f1370f = r5
            java.lang.String r0 = "ۘۗۗۡۗ۠ۙۡۘۘۨۜۖۡۜۘۘۘۜۦۘۚۦۨۘۖۡۘ۫ۧ۟"
            goto L_0x0004
        L_0x003c:
            com.obwhatsapp.youbasha.ui.views.TouchDelegateGroup r0 = r6.f1377m
            r0.setEnabled(r5)
            java.lang.String r0 = "ۛۢۖۘۛۛۨۘۦۗۡۛۤۖ۠ۢۗ"
            goto L_0x0004
        L_0x0044:
            android.animation.AnimatorSet r0 = r6.f1372h
            r0.cancel()
            java.lang.String r0 = "۫ۨۙۗۘۖۗۡۘۚۘۨۘۥۛۘۘۧۥۗۢۘ۠ۗۧ۠"
            goto L_0x0004
        L_0x004c:
            android.animation.AnimatorSet r0 = r6.f1371g
            r0.start()
            java.lang.String r0 = "ۛۢۘ۫ۖ۬ۘۡۖۢ۠ۗۥۗۜۡۙ۬۠ۘۨۘ"
            goto L_0x0004
        L_0x0054:
            com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu$OnFloatingActionsMenuUpdateListener r1 = r6.f1378n
            java.lang.String r0 = "۠ۘۜۘۗۖۨۘۛۡۖۘۥ۫ۨۘۦۖۡۡۧۛ۠ۧۙۜۛۦ"
            goto L_0x0004
        L_0x0059:
            r2 = -583304863(0xffffffffdd3b7961, float:-8.4430845E17)
            java.lang.String r0 = "ۖۢۗۛۜۧۘۗۙۡۘۦ۠ۜۘۗ۠۫"
        L_0x005e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -822923263: goto L_0x0024;
                case -785879129: goto L_0x0072;
                case -116326505: goto L_0x006d;
                case 1809753839: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x005e
        L_0x0067:
            java.lang.String r0 = "ۚۦۦۙ۠ۤۚۘۛۨۨ۠ۜۛۜۘۦ۬ۦۘ۬ۙ۟ۢۛۘ"
            goto L_0x005e
        L_0x006a:
            java.lang.String r0 = "ۢ۬ۖۡۙ۟۫ۛۤ۫ۦۤ۟ۙۨۙۖۛ"
            goto L_0x005e
        L_0x006d:
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "ۙ۠ۙۧۥۦۢۚ۫ۥۨۨۡۥۘۡۙۤۘ۬ۢۚۦۖۥ۠ۡۘ"
            goto L_0x005e
        L_0x0072:
            java.lang.String r0 = "ۜۢۥۗۘۖۘۨۚۙۖ۠ۨۘۥۘۖۘۡۦۜۘ۫ۛۙۢ۟ۨۛۢۙ"
            goto L_0x0004
        L_0x0075:
            r1.onMenuExpanded()
            java.lang.String r0 = "ۜۤۨۘۥۦۜۤۛۘ۫ۨۖۘۥۦۦۘۗ۟ۜۜ۫۠"
            goto L_0x0004
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu.expand():void");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        String str = "ۡۗۖۤۧۛ۟ۥۥ۫ۧۗۥ۠ۡۘۚۜۘۚۥۘۙۛۤ۫ۨۗ";
        while (true) {
            switch ((str.hashCode() ^ 111) ^ 1241592971) {
                case -477307887:
                    str = "۠۠ۥۘۘ۟ۜۘۗ۬ۥۙ۟۬ۚۜۧ۠ۦۤ";
                    break;
                case 35538689:
                    return new h(this, super.generateDefaultLayoutParams());
            }
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        String str = "ۡۗ۬ۖۧۡۡۖۧۘۧۗۡۘۦۚۧ";
        while (true) {
            switch ((str.hashCode() ^ 896) ^ 2058659428) {
                case -504742136:
                    str = "ۦ۬ۢۥۢۡۢۜۖ۠۫ۨۨ۫۠ۤۛۖۗۥۡۘ";
                    break;
                case 1761551476:
                    str = "۟ۧ۫ۖ۠ۥۙۗۨۘۨۗۙۖۜۖۗۖۦۨۧۥۘ";
                    break;
                case 2138901641:
                    return new h(this, super.generateLayoutParams(attributeSet));
            }
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        String str = "ۘۨۚۤۖۛۥۥۤۢۢ۠ۖۜۦۘۛۛۤ";
        while (true) {
            switch ((str.hashCode() ^ 857) ^ 1260695888) {
                case -1504927911:
                    str = "ۥۙۜۦۖۖ۠ۛۢ۠۫۟ۛ۠ۡۨۨۡۛۘۧ۫ۛۧۤۖۛ";
                    break;
                case -1083787528:
                    str = "۫ۧۤۛۢ۫۠ۘۛ۟۠۠ۘۨۡۙۨۨۘ۬ۛۗ";
                    break;
                case 330136805:
                    return new h(this, super.generateLayoutParams(layoutParams));
            }
        }
    }

    public boolean isExpanded() {
        String str = "۠ۘۗۥۢۢۗۨۧۢۙۘۛۧۗ۬ۡ۫ۙۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 565) ^ -1944467856) {
                case -1093849732:
                    str = "۫ۚۖۘۚۥۨۛۘۘۜۚ۫ۢۜۨۡۦۨۘ۬ۖۘۥۦۖ";
                    break;
                case 239536553:
                    return this.f1370f;
            }
        }
    }

    public void onFinishInflate() {
        String str = "۠۬ۛۚۢۜۗۡۤۧۦ۬ۖۗۘۘۦۦ۠ۥ۟ۨۖ۬۟ۙۦۤ";
        while (true) {
            switch ((str.hashCode() ^ 684) ^ -1005778260) {
                case -258026805:
                    bringChildToFront(this.f1373i);
                    str = "ۡۚۗۘ۬۫۬ۚۘۘۤۧۤۚۚۤۢۡ۫ۢۥۘ";
                    break;
                case 97499696:
                    super.onFinishInflate();
                    str = "ۥۦۡۘۘ۟ۥۘۡۛۙۡۡۛۗۤۨۘ";
                    break;
                case 1445576083:
                    this.f1376l = getChildCount();
                    str = "ۙۨۛۧۥۜۢ۟ۨۖۜۘۘ۟۬ۜ۠ۢۤۚۡۙۗ۫ۧۚۖ";
                    break;
                case 1515039439:
                    return;
                case 1925798773:
                    str = "ۤۧۖۤۡۨۘۡۦۛۘۧ۬ۧۛۥۘ۬ۛۥۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r48, int r49, int r50, int r51, int r52) {
        /*
            r47 = this;
            r44 = 0
            r43 = 0
            r42 = 0
            r41 = 0
            r40 = 0
            r37 = 0
            r39 = 0
            r36 = 0
            r35 = 0
            r34 = 0
            r15 = 0
            r33 = 0
            r31 = 0
            r32 = 0
            r30 = 0
            r28 = 0
            r29 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r14 = 0
            r16 = 0
            r13 = 0
            r11 = 0
            r12 = 0
            r10 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r9 = 0
            r38 = 0
            java.lang.String r4 = "۟۬ۥۧ۟ۥۘۗۘۦۘۢ۫ۧۤۙۜۘۨۘ۠ۦ۟ۤ"
            r5 = r4
        L_0x0047:
            int r4 = r5.hashCode()
            r45 = 59
            r46 = 1091282220(0x410ba52c, float:8.727825)
            r4 = r4 ^ r45
            r4 = r4 ^ r46
            switch(r4) {
                case -2077297419: goto L_0x0289;
                case -1964640170: goto L_0x011d;
                case -1944764659: goto L_0x0181;
                case -1824642569: goto L_0x005c;
                case -1745219691: goto L_0x01e2;
                case -1713876375: goto L_0x045b;
                case -1608460941: goto L_0x0307;
                case -1551762586: goto L_0x0271;
                case -1481905057: goto L_0x048d;
                case -1326177637: goto L_0x04ca;
                case -1304425095: goto L_0x01da;
                case -1302793561: goto L_0x0070;
                case -1123210658: goto L_0x04a0;
                case -1050883322: goto L_0x03e2;
                case -952382485: goto L_0x0064;
                case -951326652: goto L_0x0068;
                case -937506873: goto L_0x0444;
                case -733964324: goto L_0x0472;
                case -666139871: goto L_0x0112;
                case -654021495: goto L_0x0365;
                case -610977519: goto L_0x020a;
                case -551387923: goto L_0x00bb;
                case -517681160: goto L_0x0092;
                case -446459716: goto L_0x0060;
                case -383905496: goto L_0x025c;
                case -381179618: goto L_0x01c0;
                case -276787100: goto L_0x0354;
                case -141637464: goto L_0x0124;
                case -101585377: goto L_0x012b;
                case -96261346: goto L_0x0255;
                case -93661476: goto L_0x02fc;
                case 5644231: goto L_0x0487;
                case 187498103: goto L_0x02c7;
                case 190287387: goto L_0x0232;
                case 200505733: goto L_0x04bb;
                case 253141981: goto L_0x04cf;
                case 382807037: goto L_0x04d4;
                case 409939918: goto L_0x036e;
                case 455644261: goto L_0x027d;
                case 456954534: goto L_0x0439;
                case 477365779: goto L_0x04a7;
                case 486018826: goto L_0x0107;
                case 491895907: goto L_0x0058;
                case 510573596: goto L_0x042f;
                case 511931471: goto L_0x0493;
                case 527229820: goto L_0x0263;
                case 542080342: goto L_0x039f;
                case 566496546: goto L_0x04c0;
                case 574918434: goto L_0x041d;
                case 614081330: goto L_0x009d;
                case 694115156: goto L_0x026a;
                case 726777235: goto L_0x02a2;
                case 740384973: goto L_0x0312;
                case 794581962: goto L_0x047c;
                case 813891074: goto L_0x0326;
                case 983569632: goto L_0x03ce;
                case 1004119246: goto L_0x0423;
                case 1017332921: goto L_0x0226;
                case 1138843403: goto L_0x03db;
                case 1241109562: goto L_0x015c;
                case 1245191764: goto L_0x01a8;
                case 1252165392: goto L_0x014f;
                case 1270905676: goto L_0x038a;
                case 1275507683: goto L_0x04d9;
                case 1306441058: goto L_0x049a;
                case 1308433230: goto L_0x04b1;
                case 1346969441: goto L_0x03c7;
                case 1409398245: goto L_0x0349;
                case 1414943773: goto L_0x0218;
                case 1419821269: goto L_0x00f5;
                case 1508237977: goto L_0x00cc;
                case 1520545911: goto L_0x03d5;
                case 1525242983: goto L_0x04c5;
                case 1578970912: goto L_0x01b5;
                case 1600750166: goto L_0x02bb;
                case 1644459264: goto L_0x03ee;
                case 1682562264: goto L_0x021f;
                case 1760931149: goto L_0x0211;
                case 1807721138: goto L_0x006c;
                case 1887615879: goto L_0x033c;
                case 2023119540: goto L_0x0429;
                case 2031480975: goto L_0x00d7;
                case 2037788657: goto L_0x02dd;
                case 2055063025: goto L_0x0416;
                case 2092755674: goto L_0x00ad;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0047
        L_0x0058:
            java.lang.String r4 = "ۛۜۛۤ۫ۦۘ۬ۨۨۘۡۧۨۘۚ۫ۢۨۗ۫"
            r5 = r4
            goto L_0x0047
        L_0x005c:
            java.lang.String r4 = "۠ۘۦۘۘۡۘۡ۬ۨ۠ۚۡ۠ۨۙۦۛۛۧۛۥۘ"
            r5 = r4
            goto L_0x0047
        L_0x0060:
            java.lang.String r4 = "۟ۦۨ۟ۦۤ۬ۚ۟ۛۡۘۘۦۢۘۘۙ۫ۖۘۜ۬ۦ۠ۤ۫"
            r5 = r4
            goto L_0x0047
        L_0x0064:
            java.lang.String r4 = "ۨۙ۫ۗۦۡۘ۟ۛۗۡۡۧ۬ۤۧ۠۬ۢ"
            r5 = r4
            goto L_0x0047
        L_0x0068:
            java.lang.String r4 = "۫ۥۘۚۢ۟ۨۢۚۥۢ۟ۚۢۖۘ"
            r5 = r4
            goto L_0x0047
        L_0x006c:
            java.lang.String r4 = "ۦ۬۟۬ۚۡ۟ۦۨۘ۫ۦۧۦۥۡۜ۬۠ۛۥۖۛ۠ۧۗۨ"
            r5 = r4
            goto L_0x0047
        L_0x0070:
            r5 = -1530424009(0xffffffffa4c79537, float:-8.655527E-17)
            java.lang.String r4 = "ۦ۫ۥۚۘۘ۟ۜۜۘۜ۠ۡۦ۟۫ۧۨۜۥۛ"
        L_0x0075:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -828982147: goto L_0x008e;
                case -463420359: goto L_0x008b;
                case -349966467: goto L_0x007f;
                case -297017826: goto L_0x0086;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x0075
        L_0x007f:
            java.lang.String r4 = "ۦۨۛۢ۫ۡۗۙۜۧۨۙۤۘ۟ۗۡۛۚۚ۟ۥۨۤ"
            r5 = r4
            goto L_0x0047
        L_0x0083:
            java.lang.String r4 = "ۙۜۙ۬ۘۦ۟ۗۘۗۢۧۖ۠"
            goto L_0x0075
        L_0x0086:
            if (r48 == 0) goto L_0x0083
            java.lang.String r4 = "ۚۢۙۜۦۜ۠ۦۨۙۙۡۥ۫ۖۥۦۡۘ۬ۘۢ"
            goto L_0x0075
        L_0x008b:
            java.lang.String r4 = "ۨۢۙۨۥ۠ۙۦۙۧۦۚ۠ۗ"
            goto L_0x0075
        L_0x008e:
            java.lang.String r4 = "ۧۦ۬۟ۨۘۘۦۜۨۘۘ۫ۡ۬ۧۖۘۧۡۘ"
            r5 = r4
            goto L_0x0047
        L_0x0092:
            r0 = r47
            com.obwhatsapp.youbasha.ui.views.TouchDelegateGroup r4 = r0.f1377m
            r4.clearTouchDelegates()
            java.lang.String r4 = "ۦۨۛۢ۫ۡۗۙۜۧۨۙۤۘ۟ۗۡۛۚۚ۟ۥۨۤ"
            r5 = r4
            goto L_0x0047
        L_0x009d:
            int r4 = r52 - r50
            r0 = r47
            com.obwhatsapp.youbasha.ui.views.g r5 = r0.f1373i
            int r5 = r5.getMeasuredHeight()
            int r44 = r4 - r5
            java.lang.String r4 = "ۧۦۘۘۨۥۗۗۜۘۘۢ۠ۚۦۜۜ۠ۜۘۘۚ۫ۤ"
            r5 = r4
            goto L_0x0047
        L_0x00ad:
            int r4 = r51 - r49
            r0 = r47
            int r5 = r0.f1375k
            int r5 = r5 / 2
            int r43 = r4 - r5
            java.lang.String r4 = "ۧۚۖۘۖۤۧۗۗۦۘ۫ۜۢۜۧۜۘ۬۠ۖۖۘۜ"
            r5 = r4
            goto L_0x0047
        L_0x00bb:
            r0 = r47
            com.obwhatsapp.youbasha.ui.views.g r4 = r0.f1373i
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 / 2
            int r42 = r43 - r4
            java.lang.String r4 = "ۗۙۜۢۘۖۘۘۖۥۢۡۚۙ۫ۦ"
            r5 = r4
            goto L_0x0047
        L_0x00cc:
            r0 = r47
            com.obwhatsapp.youbasha.ui.views.g r0 = r0.f1373i
            r41 = r0
            java.lang.String r4 = "ۘۜۢۚۖۘ۟ۨۧ۬ۙۦۘۥۛۚۗۗ۠ۥۚۨ"
            r5 = r4
            goto L_0x0047
        L_0x00d7:
            int r4 = r41.getMeasuredWidth()
            int r4 = r4 + r42
            r0 = r47
            com.obwhatsapp.youbasha.ui.views.g r5 = r0.f1373i
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r44
            r0 = r41
            r1 = r42
            r2 = r44
            r0.layout(r1, r2, r4, r5)
            java.lang.String r4 = "ۚۧۥۛۙ۬ۜۜۘۤ۠۟ۚۙۢ"
            r5 = r4
            goto L_0x0047
        L_0x00f5:
            r0 = r47
            int r4 = r0.f1375k
            int r4 = r4 / 2
            r0 = r47
            int r5 = r0.f1368d
            int r4 = r4 + r5
            int r40 = r43 - r4
            java.lang.String r4 = "ۤۢۛۗۨۧۘۨۡۘۘۜۚۚ۠ۗۡۘۗۧۚۖۡۚۙ۠ۛۨۨ"
            r5 = r4
            goto L_0x0047
        L_0x0107:
            r0 = r47
            int r4 = r0.f1367c
            int r37 = r44 - r4
            java.lang.String r4 = "ۦۢۡۧۘ۠ۧۗۥۘ۟ۚۡۘۢۛۦۘۤۚۖ"
            r5 = r4
            goto L_0x0047
        L_0x0112:
            r0 = r47
            int r4 = r0.f1376l
            int r39 = r4 + -1
            java.lang.String r4 = "ۨۥۢۙۡۚۨۨۙۗۨۨۡۛۦ"
            r5 = r4
            goto L_0x0047
        L_0x011d:
            java.lang.String r4 = "ۡۚ۟ۖۚۡۘۙۨۦ۠ۗۙۥۥۗ۫ۘۨۘۖۧۘ"
            r5 = r4
            r38 = r39
            goto L_0x0047
        L_0x0124:
            java.lang.String r4 = "ۥ۠ۗۥۛۜۘۤ۟ۘۘ۬ۖۧۘ۟ۧۘۘۖ۬ۙۗ۟ۖۤۧۢ"
            r5 = r4
            r9 = r37
            goto L_0x0047
        L_0x012b:
            r5 = 1994595146(0x76e31b4a, float:2.3031345E33)
            java.lang.String r4 = "۠ۜۢۢۗۥۚۘ۬ۢۛۨۦ۠ۨۗۡۙۤۗۥۘۨۚۦۘ"
        L_0x0130:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -2075340044: goto L_0x014a;
                case -1402049732: goto L_0x0142;
                case -761404900: goto L_0x0147;
                case -310653795: goto L_0x013a;
                default: goto L_0x0139;
            }
        L_0x0139:
            goto L_0x0130
        L_0x013a:
            java.lang.String r4 = "ۤ۫۫ۦۖۨۛۖ۠ۙ۫ۖۛ۠۬"
            r5 = r4
            goto L_0x0047
        L_0x013f:
            java.lang.String r4 = "ۦۜۘۥۤۨۘۖۙۜۘۧۚۡۘ۫ۦ۬"
            goto L_0x0130
        L_0x0142:
            if (r38 < 0) goto L_0x013f
            java.lang.String r4 = "ۡ۬ۗۚۜۘۧۖۚۛۘۥۘۤۥۨ"
            goto L_0x0130
        L_0x0147:
            java.lang.String r4 = "ۛۤ۠ۦ۬ۙ۠ۙۥ۠ۨۘۙ۟ۗۖۙۦۘۚۛ۫ۧ۫ۥۘۘۛۘۘ"
            goto L_0x0130
        L_0x014a:
            java.lang.String r4 = "ۜ۫ۦۘۥۛۧۤ۫ۨۤۧۘۙۦۘ"
            r5 = r4
            goto L_0x0047
        L_0x014f:
            r0 = r47
            r1 = r38
            android.view.View r36 = r0.getChildAt(r1)
            java.lang.String r4 = "ۤ۫ۤۚ۫ۥۙۢۨۘۛ۫ۚۧۧ۟ۖۥۢۧۦ"
            r5 = r4
            goto L_0x0047
        L_0x015c:
            r5 = -197369440(0xfffffffff43c61a0, float:-5.970043E31)
            java.lang.String r4 = "ۙ۠ۛۗۙۙ۟ۗ۬ۛۖ۟ۧۨۘ"
        L_0x0161:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -753573029: goto L_0x04cf;
                case -585263246: goto L_0x016b;
                case -378811743: goto L_0x017e;
                case 819893668: goto L_0x0173;
                default: goto L_0x016a;
            }
        L_0x016a:
            goto L_0x0161
        L_0x016b:
            java.lang.String r4 = "ۧۖ۠۫ۚۖۢۤۘۘ۬۠۫ۗۦۨ"
            r5 = r4
            goto L_0x0047
        L_0x0170:
            java.lang.String r4 = "ۨۢۘۘۡۨۖۘۢۘۜۡۖۡۘ۟ۧۦۘۛۙۖۤۗۚ۠ۧۜۘ"
            goto L_0x0161
        L_0x0173:
            r0 = r47
            com.obwhatsapp.youbasha.ui.views.g r4 = r0.f1373i
            r0 = r36
            if (r0 == r4) goto L_0x0170
            java.lang.String r4 = "۠۫ۛۡۦۥۡۙۡ۫۠ۛۙۛۙۙ۟۫ۡۗۥۘۛ۬ۖ"
            goto L_0x0161
        L_0x017e:
            java.lang.String r4 = "ۚۧ۬ۜۗ۠ۚۢۥۖۘۡۘۚۗ۠ۗۖ"
            goto L_0x0161
        L_0x0181:
            r5 = 437717690(0x1a170aba, float:3.1234733E-23)
            java.lang.String r4 = "ۡۥۛۦۨۘۜۥۖۦۨۘۦۥۗ"
        L_0x0186:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -1479847359: goto L_0x01a3;
                case -1257911542: goto L_0x0190;
                case -1231602157: goto L_0x01a0;
                case 1158670508: goto L_0x04ac;
                default: goto L_0x018f;
            }
        L_0x018f:
            goto L_0x0186
        L_0x0190:
            int r4 = r36.getVisibility()
            r45 = 8
            r0 = r45
            if (r4 != r0) goto L_0x019d
            java.lang.String r4 = "ۜۜۥۧۧۘۘۡۤۚۨ۟ۖۘۘۛ۫ۥۤۦۦۥۨ۫ۢۥۘ"
            goto L_0x0186
        L_0x019d:
            java.lang.String r4 = "ۚۤۙۧ۠ۜۗ۟۫ۦۦۘۛۨ۟ۗۛۦۗۢۚ"
            goto L_0x0186
        L_0x01a0:
            java.lang.String r4 = "۬۟ۖۘۗ۟۫ۢۧۘ۟۟ۛۘۖ۬ۜۥۧۥۘۙۗۛ۟"
            goto L_0x0186
        L_0x01a3:
            java.lang.String r4 = "ۤۦۥۡۙ۠ۚ۠ۦۘ۬ۦۘۨۚۨ۠ۖۘۥۤۖ"
            r5 = r4
            goto L_0x0047
        L_0x01a8:
            int r4 = r36.getMeasuredWidth()
            int r4 = r4 / 2
            int r35 = r43 - r4
            java.lang.String r4 = "ۥۛ۠۬ۜۘۧۗۨ۬ۤۥۘۢۛۨ۫ۘ"
            r5 = r4
            goto L_0x0047
        L_0x01b5:
            int r4 = r36.getMeasuredHeight()
            int r34 = r9 - r4
            java.lang.String r4 = "ۙۢۡۘۥۦ۬ۤۡۘ۫۫۫ۥ۬ۛۨۜ۫۠۫"
            r5 = r4
            goto L_0x0047
        L_0x01c0:
            int r4 = r36.getMeasuredWidth()
            int r4 = r4 + r35
            int r5 = r36.getMeasuredHeight()
            int r5 = r5 + r34
            r0 = r36
            r1 = r35
            r2 = r34
            r0.layout(r1, r2, r4, r5)
            java.lang.String r4 = "ۢۙۖ۟۬ۦۜۛۥۘۤۙۡۘ۫ۧ۫۬ۙۘۘۧ۬ۗۦۖۗۥۙۛ"
            r5 = r4
            goto L_0x0047
        L_0x01da:
            int r4 = r44 - r34
            float r15 = (float) r4
            java.lang.String r4 = "ۧۤۚۥۤۨۛ۟ۖۡۥۧۗۘ۠"
            r5 = r4
            goto L_0x0047
        L_0x01e2:
            r5 = 291987923(0x116761d3, float:1.8252831E-28)
            java.lang.String r4 = "ۚۦ۠۠ۙۘ۠ۧۜۘۢۜۡۘ۫ۘۨۙۘۨۘ"
        L_0x01e7:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -2026202299: goto L_0x0205;
                case -528679097: goto L_0x01f1;
                case 351102768: goto L_0x0202;
                case 1791012984: goto L_0x01f9;
                default: goto L_0x01f0;
            }
        L_0x01f0:
            goto L_0x01e7
        L_0x01f1:
            java.lang.String r4 = "ۗۨۗۜۦۖۘۚۜۥۖۙۤۙ۠ۥۘ"
            r5 = r4
            goto L_0x0047
        L_0x01f6:
            java.lang.String r4 = "۫ۥۥ۠ۡۥۘۢۡ۫ۦۘۖ۠ۘۢۥۖۘ۟۟"
            goto L_0x01e7
        L_0x01f9:
            r0 = r47
            boolean r4 = r0.f1370f
            if (r4 == 0) goto L_0x01f6
            java.lang.String r4 = "ۘ۫ۥۛۜۡۘۡۤۛۜۦ۫۟ۡۘ"
            goto L_0x01e7
        L_0x0202:
            java.lang.String r4 = "۠۠ۦۜۙۖ۬ۙۢۙۛۜۘۦۘۛۡ۟ۘۗۢۚۧ۟"
            goto L_0x01e7
        L_0x0205:
            java.lang.String r4 = "۟ۡ۬ۧۧ۫ۡۙۜۨ۠ۦۘۘۡۜ"
            r5 = r4
            goto L_0x0047
        L_0x020a:
            r33 = 0
            java.lang.String r4 = "ۡۖۜۘ۫ۜۗۙۥۨۘۡۘۡۦۛۡۙۙ۬ۘۘۜۡۛۗ"
            r5 = r4
            goto L_0x0047
        L_0x0211:
            java.lang.String r4 = "ۖۚۜۘۗ۟ۢ۫ۨۦ۫ۖۚۨۡ"
            r5 = r4
            r32 = r33
            goto L_0x0047
        L_0x0218:
            java.lang.String r4 = "۟ۢۥۢۢۨ۟ۘۧۧۚۨ۠ۦۖۤۜۚۨ۟ۨۘ۫ۛۖۘ۫ۜۘ"
            r5 = r4
            r31 = r15
            goto L_0x0047
        L_0x021f:
            java.lang.String r4 = "۠ۘۗۤۤۦۘۨۢۤۢۜ۠ۤۜ۟ۧۚۨ۠۟ۨ"
            r5 = r4
            r32 = r31
            goto L_0x0047
        L_0x0226:
            r0 = r36
            r1 = r32
            r0.setTranslationY(r1)
            java.lang.String r4 = "ۗۤۘۘۧۙۥ۫ۚۗ۟ۧۡۚۘ۫۠۟ۜۗۙۜۘۗۗۗۡۥۢ"
            r5 = r4
            goto L_0x0047
        L_0x0232:
            r5 = 485005792(0x1ce899e0, float:1.5392248E-21)
            java.lang.String r4 = "ۦۧ۟ۙۜۖۘۚ۬ۖۙۙۤ۬ۜۙۧ۟ۦۘۖۘۜۙۥ"
        L_0x0237:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -1556162954: goto L_0x0249;
                case -493762595: goto L_0x0241;
                case -134679841: goto L_0x0252;
                case 1158111065: goto L_0x04b6;
                default: goto L_0x0240;
            }
        L_0x0240:
            goto L_0x0237
        L_0x0241:
            java.lang.String r4 = "۫۫ۡۘۜۧۨۘۖۖۖۘ۫ۢۥۘۥۤۢۜۦۥۧۡۙ"
            r5 = r4
            goto L_0x0047
        L_0x0246:
            java.lang.String r4 = "ۖ۠ۖۘۙۖۘۛۗۡۖ۬۠ۖ۠ۙۗۘۚ۫ۧ۬ۛۜ۬"
            goto L_0x0237
        L_0x0249:
            r0 = r47
            boolean r4 = r0.f1370f
            if (r4 == 0) goto L_0x0246
            java.lang.String r4 = "ۢۡ۫۟ۡۧۛۛ۫ۦ۟ۚۘۚۗ۟ۖ۬ۡۖۘۜۡۘ"
            goto L_0x0237
        L_0x0252:
            java.lang.String r4 = "ۗۡ۬ۖ۟ۦۛۢ۫ۛۦۘۚۖۜۖۥۨ"
            goto L_0x0237
        L_0x0255:
            r30 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "۬۬ۧۛۡۖۘۥ۫ۨۧۜۤ۟ۡۚۥ۫ۙۤ۬"
            r5 = r4
            goto L_0x0047
        L_0x025c:
            java.lang.String r4 = "ۚۛۙۨۢۦۘۛ۟ۖۘۘ۬۟ۗۖۨۘۜۛۗۛۙۘ"
            r5 = r4
            r29 = r30
            goto L_0x0047
        L_0x0263:
            r28 = 0
            java.lang.String r4 = "ۢۘۧۛ۬ۨۙۢۤۧۦ۬ۚۨۡ۟ۧ"
            r5 = r4
            goto L_0x0047
        L_0x026a:
            java.lang.String r4 = "ۢۛۡۦۧۧۚۦۘۛۜۨۛۙۚ۠ۗ۫"
            r5 = r4
            r29 = r28
            goto L_0x0047
        L_0x0271:
            r0 = r36
            r1 = r29
            r0.setAlpha(r1)
            java.lang.String r4 = "ۡۢ۬ۙۤ۬۠ۤۙۨۦۙۖۙۜۦۤۙۥۧۚ۠ۘ"
            r5 = r4
            goto L_0x0047
        L_0x027d:
            android.view.ViewGroup$LayoutParams r4 = r36.getLayoutParams()
            com.obwhatsapp.youbasha.ui.views.h r4 = (com.obwhatsapp.youbasha.ui.views.h) r4
            java.lang.String r5 = "ۦۦۨۤۡۧۘۡ۟ۘۚ۟۬ۜۦۦۘ۟ۤۖۖ۟ۥۘ۫ۢۧ"
            r27 = r4
            goto L_0x0047
        L_0x0289:
            r0 = r27
            android.animation.ObjectAnimator r4 = r0.f1454c
            r5 = 2
            float[] r5 = new float[r5]
            r45 = 0
            r46 = 0
            r5[r45] = r46
            r45 = 1
            r5[r45] = r15
            r4.setFloatValues(r5)
            java.lang.String r4 = "۬ۛۚۖۥۜۘۡۡۖۧۥۗۜ۫ۜۜۢۢۨۥۙۙۦۥ"
            r5 = r4
            goto L_0x0047
        L_0x02a2:
            r0 = r27
            android.animation.ObjectAnimator r4 = r0.f1452a
            r5 = 2
            float[] r5 = new float[r5]
            r45 = 0
            r5[r45] = r15
            r45 = 1
            r46 = 0
            r5[r45] = r46
            r4.setFloatValues(r5)
            java.lang.String r4 = "ۨ۫ۖۘۖ۠۬ۛۖۥ۟ۗۡۥۗۛۧۜ۠ۥ۠ۥۦۤۛ۬۬ۨۘ"
            r5 = r4
            goto L_0x0047
        L_0x02bb:
            r0 = r27
            r1 = r36
            r0.a(r1)
            java.lang.String r4 = "۟ۗۢۢۡۘۖۧۥۖۨۨۘۦ۟"
            r5 = r4
            goto L_0x0047
        L_0x02c7:
            java.lang.String r4 = "fab_label"
            java.lang.String r5 = "id"
            int r4 = com.obwhatsapp.yo.yo.getID(r4, r5)
            r0 = r36
            java.lang.Object r4 = r0.getTag(r4)
            android.view.View r4 = (android.view.View) r4
            java.lang.String r5 = "۫ۗۤۘۡۤۡۘۘ۠ۨۡۘۗ۫ۘۘ۠ۚۗۗۖۨۡۖۘ"
            r26 = r4
            goto L_0x0047
        L_0x02dd:
            r5 = 12584707(0xc00703, float:1.763493E-38)
            java.lang.String r4 = "ۚ۠ۗۘۤۖۘۗۙ۫ۡۙۖۜۨ۬ۨ۬ۜ"
        L_0x02e2:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -1556458065: goto L_0x02f2;
                case -1147749834: goto L_0x04ca;
                case -851990525: goto L_0x02ec;
                case 1490625806: goto L_0x02f7;
                default: goto L_0x02eb;
            }
        L_0x02eb:
            goto L_0x02e2
        L_0x02ec:
            java.lang.String r4 = "ۚ۫ۨ۫ۦۨۧۥۛۦۖۧۘۖۘ۫ۗ۬ۢۚۧۦ"
            goto L_0x02e2
        L_0x02ef:
            java.lang.String r4 = "۫ۦۜۘۜۗ۠ۜۤۨۡۚۤۡۧۤۥۧۖ۠ۛۥۘۗۛۖ"
            goto L_0x02e2
        L_0x02f2:
            if (r26 == 0) goto L_0x02ef
            java.lang.String r4 = "ۖۛۨۜۜۜۦۖۖۦۗۦ۠ۘ۫ۧۧۦۢۧۦۘۤۚۚۦ۟۫"
            goto L_0x02e2
        L_0x02f7:
            java.lang.String r4 = "۬ۨۗۡ۟۠ۖۨۡۘۖۡۛۚۤۧ۠۬ۦۘۛۤۤ۟ۡۘۘۡۘۦۘ"
            r5 = r4
            goto L_0x0047
        L_0x02fc:
            int r4 = r26.getMeasuredWidth()
            int r25 = r40 - r4
            java.lang.String r4 = "ۨۡۥۘۛۢۨۘۗ۫۫۠۟ۜ۠۠۫ۗۨۤۜۨ۬ۙۗۡۘ"
            r5 = r4
            goto L_0x0047
        L_0x0307:
            r0 = r47
            int r0 = r0.f1369e
            r24 = r0
            java.lang.String r4 = "ۚۤۡۙ۫ۦۘۤۢۧۛ۫۠ۛۤۦۘ۫ۖۢ"
            r5 = r4
            goto L_0x0047
        L_0x0312:
            int r4 = r36.getMeasuredHeight()
            int r5 = r26.getMeasuredHeight()
            int r4 = r4 - r5
            int r4 = r4 / 2
            int r5 = r34 - r24
            int r23 = r4 + r5
            java.lang.String r4 = "ۥ۠۟۫ۥۡۘۗۤ۠ۖۛ۬ۡۧۡ۬ۘۘۦۤۥۘ۬ۗۗۚۤ۠"
            r5 = r4
            goto L_0x0047
        L_0x0326:
            int r4 = r26.getMeasuredHeight()
            int r4 = r4 + r23
            r0 = r26
            r1 = r25
            r2 = r23
            r3 = r40
            r0.layout(r1, r2, r3, r4)
            java.lang.String r4 = "ۛۙۨ۟ۤ۫ۥۥ۟۠ۦ۫ۤۘۘۤۦۦ۟ۥۘ"
            r5 = r4
            goto L_0x0047
        L_0x033c:
            r0 = r35
            r1 = r25
            int r22 = java.lang.Math.min(r0, r1)
            java.lang.String r4 = "ۗۛۦۘ۟ۡ۫ۥۡۜۨۖۤۜ۬ۦۘۜ۬۬۬ۧۨ۬ۥۧ"
            r5 = r4
            goto L_0x0047
        L_0x0349:
            r0 = r47
            int r4 = r0.f1367c
            int r21 = r4 / 2
            java.lang.String r4 = "ۛۜۖۘۨۗۦۢ۟ۗۡ۬۟ۛۗۘۖۛۦ"
            r5 = r4
            goto L_0x0047
        L_0x0354:
            int r4 = r36.getMeasuredWidth()
            int r4 = r4 + r35
            r0 = r40
            int r20 = java.lang.Math.max(r4, r0)
            java.lang.String r4 = "ۥ۬۬ۢۥۧۘ۬ۗۧ۠ۚ۠ۢۜۥۗۛۦۘ"
            r5 = r4
            goto L_0x0047
        L_0x0365:
            int r19 = r36.getMeasuredHeight()
            java.lang.String r4 = "ۡۧۚۧۡۨۘۚۥۚ۬ۢۥۘۥۗۥ"
            r5 = r4
            goto L_0x0047
        L_0x036e:
            android.graphics.Rect r18 = new android.graphics.Rect
            int r4 = r34 - r21
            r0 = r47
            int r5 = r0.f1367c
            int r5 = r5 / 2
            int r45 = r19 + r34
            int r5 = r5 + r45
            r0 = r18
            r1 = r22
            r2 = r20
            r0.<init>(r1, r4, r2, r5)
            java.lang.String r4 = "ۜۗۚۖۨۦۜۗۗۥۥۥۚۢۡ"
            r5 = r4
            goto L_0x0047
        L_0x038a:
            r0 = r47
            com.obwhatsapp.youbasha.ui.views.TouchDelegateGroup r4 = r0.f1377m
            android.view.TouchDelegate r5 = new android.view.TouchDelegate
            r0 = r18
            r1 = r36
            r5.<init>(r0, r1)
            r4.addTouchDelegate(r5)
            java.lang.String r4 = "۬۠ۛۨۨۧۘ۫ۗۤۨ۫۫ۘۧۘ"
            r5 = r4
            goto L_0x0047
        L_0x039f:
            r5 = 1469673141(0x57996eb5, float:3.37401524E14)
            java.lang.String r4 = "ۚ۫ۜۘۛۘۧۥۡۛۤۙۤۘۥۖ"
        L_0x03a4:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -877115740: goto L_0x03c2;
                case -490498544: goto L_0x03ae;
                case 1249193761: goto L_0x03bf;
                case 1759356201: goto L_0x03b6;
                default: goto L_0x03ad;
            }
        L_0x03ad:
            goto L_0x03a4
        L_0x03ae:
            java.lang.String r4 = "ۚۥۗۧ۠ۙۡۢۨۘۛۦۨۜۡۧۘ۫۫ۦۘ"
            r5 = r4
            goto L_0x0047
        L_0x03b3:
            java.lang.String r4 = "ۧۘ۠ۨۗۧ۠ۖۧۜۙۨۘ۫ۤۗۖۧۘۢۡۖۘۡ۟ۖۛۘۛ"
            goto L_0x03a4
        L_0x03b6:
            r0 = r47
            boolean r4 = r0.f1370f
            if (r4 == 0) goto L_0x03b3
            java.lang.String r4 = "۠ۧۥۘۖ۬ۨۘۡۥۚۙۖۧۘۜۨۤ"
            goto L_0x03a4
        L_0x03bf:
            java.lang.String r4 = "ۚ۠ۧۢ۟۠۠ۢ۬ۚۡۗ۬ۜ۟ۦۦۘ"
            goto L_0x03a4
        L_0x03c2:
            java.lang.String r4 = "ۜۖۥۘۜ۠۬ۘۘۨ۟ۖۡۙۤۙۢ۟۬۫۟ۗۧۡۡۘ"
            r5 = r4
            goto L_0x0047
        L_0x03c7:
            r17 = 0
            java.lang.String r4 = "ۦۡۗۗۖۜۘۜۛۜۘۛۜۛۤۘۡۛۦۛۦۡۦۘۛ۟۠ۨۙۖۘ"
            r5 = r4
            goto L_0x0047
        L_0x03ce:
            java.lang.String r4 = "۟ۜۖۘۡۘ۬ۘۗ۟ۧ۫ۥۘۤۤۘۚۤۖ"
            r5 = r4
            r16 = r17
            goto L_0x0047
        L_0x03d5:
            java.lang.String r4 = "ۗۘۨۘۢ۬ۛۧۗۘۘۘ۟ۙۜ۟ۡۘ"
            r5 = r4
            r14 = r15
            goto L_0x0047
        L_0x03db:
            java.lang.String r4 = "۫ۤ۠ۧۤۤۚۖۢۜۧۡۘۦۗۘۘۖۢۖ"
            r5 = r4
            r16 = r14
            goto L_0x0047
        L_0x03e2:
            r0 = r26
            r1 = r16
            r0.setTranslationY(r1)
            java.lang.String r4 = "ۦ۟۠ۤۢۦۘۡۖ۬ۡۤۦۘۥۖۡۘۨ۫ۖۘۡۨۜۘۦۛۦۘۜۛۢ"
            r5 = r4
            goto L_0x0047
        L_0x03ee:
            r5 = 2035010128(0x794bca50, float:6.613373E34)
            java.lang.String r4 = "ۧۢۛۛۡۧۘ۟ۖۖۘ۬ۗ۫۫ۗ۬۠۫ۛ۬۬ۨۘۙۜۡۥۙۘ"
        L_0x03f3:
            int r45 = r4.hashCode()
            r45 = r45 ^ r5
            switch(r45) {
                case -1671344422: goto L_0x0411;
                case -1006179001: goto L_0x040e;
                case 250202246: goto L_0x0405;
                case 1665809692: goto L_0x03fd;
                default: goto L_0x03fc;
            }
        L_0x03fc:
            goto L_0x03f3
        L_0x03fd:
            java.lang.String r4 = "۟ۜ۬ۦۗۛۘۡۦۘۡۛۗۙۢ۠ۚۜۘۧۜۦۖۨۜۘ"
            r5 = r4
            goto L_0x0047
        L_0x0402:
            java.lang.String r4 = "۠ۗۥۘۙۤۢۧۦۛۥۛۨۘۙۛۧۚ۠ۖۘۢۙۛ"
            goto L_0x03f3
        L_0x0405:
            r0 = r47
            boolean r4 = r0.f1370f
            if (r4 == 0) goto L_0x0402
            java.lang.String r4 = "ۜۥ۠۟ۧۖۘۥ۟ۚۗۧۘۘ۫ۚۥۘۙ۬ۛ"
            goto L_0x03f3
        L_0x040e:
            java.lang.String r4 = "ۖ۟ۦۘۛۢۜۛۡ۫ۢۢۨۘۖ۟ۖ۫ۖۘۨۥۘۤۛۡ"
            goto L_0x03f3
        L_0x0411:
            java.lang.String r4 = "۬ۙۥۖۨۘ۫ۚۡۤۛۢۜۤ۠ۙۘۘ۟۬ۨۙۜۜ"
            r5 = r4
            goto L_0x0047
        L_0x0416:
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "ۢ۠ۢۛۡ۬ۦ۟ۦۗۗۦۙۨ۟"
            r5 = r4
            goto L_0x0047
        L_0x041d:
            java.lang.String r4 = "۠ۜ۠ۖۨۛۨۗۘۘۥ۬ۧ۫ۘۜۦۘۥ"
            r5 = r4
            r12 = r13
            goto L_0x0047
        L_0x0423:
            r11 = 0
            java.lang.String r4 = "۫ۦۘۘۙ۟ۡۜۦۗۥۜۥۡۙۜ"
            r5 = r4
            goto L_0x0047
        L_0x0429:
            java.lang.String r4 = "۠ۛ۟ۖۨۧۘۚۙۜۡۨۜۤۨۙۘۧۥۗۥۙ"
            r5 = r4
            r12 = r11
            goto L_0x0047
        L_0x042f:
            r0 = r26
            r0.setAlpha(r12)
            java.lang.String r4 = "ۦۧۚۤۡۨۘۛ۠ۖ۫ۛۦۧۘۘۙۨۦۘۢۜۨ"
            r5 = r4
            goto L_0x0047
        L_0x0439:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            com.obwhatsapp.youbasha.ui.views.h r4 = (com.obwhatsapp.youbasha.ui.views.h) r4
            java.lang.String r5 = "ۦۥۘۘ۠ۜۦۘۙۧۤۡۙۗۛۦۘۜۥۨۘ"
            r10 = r4
            goto L_0x0047
        L_0x0444:
            android.animation.ObjectAnimator r4 = r10.f1454c
            r5 = 2
            float[] r5 = new float[r5]
            r45 = 0
            r46 = 0
            r5[r45] = r46
            r45 = 1
            r5[r45] = r15
            r4.setFloatValues(r5)
            java.lang.String r4 = "ۙۥۤۦۗۦۨۙ۟ۚۖۡۚۛ۬ۧۢ۟ۛۖ۟ۦ۟ۡۜۧۚ"
            r5 = r4
            goto L_0x0047
        L_0x045b:
            android.animation.ObjectAnimator r4 = r10.f1452a
            r5 = 2
            float[] r5 = new float[r5]
            r45 = 0
            r5[r45] = r15
            r45 = 1
            r46 = 0
            r5[r45] = r46
            r4.setFloatValues(r5)
            java.lang.String r4 = "۫ۖۦۦۗۖۨ۠ۦۘۤۦۤۧۢۤۖۦ۬۬ۙۚ۠۟"
            r5 = r4
            goto L_0x0047
        L_0x0472:
            r0 = r26
            r10.a(r0)
            java.lang.String r4 = "۠ۥۛۚ۠ۗ۫۫ۜۛۙۨۡۤۜۘۢۧۙۢ۟ۢۦ۫۬ۘۖ"
            r5 = r4
            goto L_0x0047
        L_0x047c:
            r0 = r47
            int r4 = r0.f1367c
            int r8 = r34 - r4
            java.lang.String r4 = "ۘ۬ۨۦۘۧۦۘۧۦ۫ۢۜۥۦ۬ۢۚ"
            r5 = r4
            goto L_0x0047
        L_0x0487:
            java.lang.String r4 = "ۛۤۥۘۖ۟ۥۜۧۖ۬ۜۘ۠ۗۛۨۙۢ"
            r5 = r4
            r7 = r8
            goto L_0x0047
        L_0x048d:
            java.lang.String r4 = "ۚ۫ۧۙۦ۬ۜ۫ۘۘۛۥۧۚۖۡۘ"
            r5 = r4
            r7 = r9
            goto L_0x0047
        L_0x0493:
            int r6 = r38 + -1
            java.lang.String r4 = "ۜۢۙۚۦۧۘۖ۠ۤۤۨ۫ۗ۠ۨۘۗۦۘۘ۬۠ۦۘۚۤ"
            r5 = r4
            goto L_0x0047
        L_0x049a:
            java.lang.String r4 = "۟ۧۖ۟ۜۚ۠۬ۨۘۜ۠ۡ۟ۘ۫۟ۨ"
            r5 = r4
            r9 = r7
            goto L_0x0047
        L_0x04a0:
            java.lang.String r4 = "۫۫۬ۛۦۘۘۥۦۢۜۖۦۚۦۤۚۨۘۘ"
            r5 = r4
            r38 = r6
            goto L_0x0047
        L_0x04a7:
            java.lang.String r4 = "ۥ۠ۗۥۛۜۘۤ۟ۘۘ۬ۖۧۘ۟ۧۘۘۖ۬ۙۗ۟ۖۤۧۢ"
            r5 = r4
            goto L_0x0047
        L_0x04ac:
            java.lang.String r4 = "ۜۖۛ۠ۙ۟ۚۘ۬ۦۜ۟ۨۗ۬۫۫۠"
            r5 = r4
            goto L_0x0047
        L_0x04b1:
            java.lang.String r4 = "۠ۘۗۤۤۦۘۨۢۤۢۜ۠ۤۜ۟ۧۚۨ۠۟ۨ"
            r5 = r4
            goto L_0x0047
        L_0x04b6:
            java.lang.String r4 = "ۢۘۦۘۨۚۖۧۦۙ۠ۨ۟ۗ۫ۥۘۜۨۥۘۦۜۦۛۘۥ۬ۤۚ"
            r5 = r4
            goto L_0x0047
        L_0x04bb:
            java.lang.String r4 = "ۢۛۡۦۧۧۚۦۘۛۜۨۛۙۚ۠ۗ۫"
            r5 = r4
            goto L_0x0047
        L_0x04c0:
            java.lang.String r4 = "۫ۤ۠ۧۤۤۚۖۢۜۧۡۘۦۗۘۘۖۢۖ"
            r5 = r4
            goto L_0x0047
        L_0x04c5:
            java.lang.String r4 = "۠ۛ۟ۖۨۧۘۚۙۜۡۨۜۤۨۙۘۧۥۗۥۙ"
            r5 = r4
            goto L_0x0047
        L_0x04ca:
            java.lang.String r4 = "ۛ۬ۨۘ۬ۙۡۡ۠ۖۜۢۦۘۚۙۘ"
            r5 = r4
            goto L_0x0047
        L_0x04cf:
            java.lang.String r4 = "ۛۗۙۨ۬۫ۖۘۜۨ۠ۨۘۧۢۧ۟۠ۚ۠ۤۤۧۖۘۗ۟ۦۘ"
            r5 = r4
            goto L_0x0047
        L_0x04d4:
            java.lang.String r4 = "ۚ۫ۧۙۦ۬ۜ۫ۘۘۛۥۧۚۖۡۘ"
            r5 = r4
            goto L_0x0047
        L_0x04d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r6 = 0
            r21 = 0
            r18 = 0
            r19 = 0
            r17 = 0
            r16 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r8 = 0
            r15 = 0
            r13 = 0
            r20 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            java.lang.String r2 = "ۢۛۤۜ۫ۘۢۗۨۘ۠۬ۧ۫۫ۙۜۚۡۧۚ"
            r3 = r2
        L_0x001b:
            int r2 = r3.hashCode()
            r22 = 472(0x1d8, float:6.61E-43)
            r23 = -1205307929(0xffffffffb82875e7, float:-4.0164126E-5)
            r2 = r2 ^ r22
            r2 = r2 ^ r23
            switch(r2) {
                case -2123314327: goto L_0x004d;
                case -1805523149: goto L_0x0030;
                case -1635908270: goto L_0x0034;
                case -1607225702: goto L_0x019e;
                case -1333657917: goto L_0x00d1;
                case -1302707840: goto L_0x0156;
                case -1295025700: goto L_0x0038;
                case -1246855189: goto L_0x009d;
                case -1160940150: goto L_0x006b;
                case -936606421: goto L_0x0163;
                case -775039360: goto L_0x017f;
                case -613044439: goto L_0x00f2;
                case -379622338: goto L_0x01a9;
                case -375638007: goto L_0x0112;
                case -252109000: goto L_0x00fd;
                case -157703337: goto L_0x0071;
                case -151211771: goto L_0x00dd;
                case -31057261: goto L_0x01d4;
                case -27630771: goto L_0x0179;
                case 246113754: goto L_0x0170;
                case 257677214: goto L_0x011e;
                case 432416586: goto L_0x0065;
                case 463656844: goto L_0x00aa;
                case 639304921: goto L_0x0059;
                case 775615779: goto L_0x003f;
                case 854850324: goto L_0x00d7;
                case 1033418591: goto L_0x01ca;
                case 1052981989: goto L_0x0150;
                case 1110804723: goto L_0x0169;
                case 1143482026: goto L_0x0044;
                case 1175556722: goto L_0x01e3;
                case 1390508354: goto L_0x0053;
                case 1400777928: goto L_0x005f;
                case 1490589996: goto L_0x015d;
                case 1697448462: goto L_0x014a;
                case 1761032135: goto L_0x0118;
                case 1787392393: goto L_0x013d;
                case 1943023178: goto L_0x002c;
                case 1991955186: goto L_0x01af;
                case 2053437983: goto L_0x007b;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x001b
        L_0x002c:
            java.lang.String r2 = "ۥۛۦۧۦۨۧۙۥۥۙ۟ۤۤۘۘ۬ۘۚۛۨۖۘ"
            r3 = r2
            goto L_0x001b
        L_0x0030:
            java.lang.String r2 = "ۤ۟ۘۘۨ۟ۤۘۘۘۘۢۤ۠۬۬۫ۘۤۘ"
            r3 = r2
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = "ۜۘۘۘۙۙۧۢۘۨۚۛۡ۠ۗۡۖۖۦۘۥ۟۠۬ۨۢ"
            r3 = r2
            goto L_0x001b
        L_0x0038:
            r24.measureChildren(r25, r26)
            java.lang.String r2 = "ۖۚۡۙۤۘۤۡۙۡۢۦۤۥۖ"
            r3 = r2
            goto L_0x001b
        L_0x003f:
            r6 = 0
            java.lang.String r2 = "ۜۡۤۗۛۘ۠ۜۧ۟ۢۦۙۥۜۘ"
            r3 = r2
            goto L_0x001b
        L_0x0044:
            r2 = 0
            r0 = r24
            r0.f1375k = r2
            java.lang.String r2 = "ۢۢ۬ۦ۠ۦۨۖۙۧۨۛۛۥۖۘۡۚۧۥۜ۟ۧۡۨۘۦ۫ۚ"
            r3 = r2
            goto L_0x001b
        L_0x004d:
            r21 = 0
            java.lang.String r2 = "ۥ۠ۚۨۥۨۘۦۥۤۖۘۥۘ۬ۙۡ۫ۧ۬ۤۗ۬۬۬۬"
            r3 = r2
            goto L_0x001b
        L_0x0053:
            r18 = 0
            java.lang.String r2 = "ۤۚۨۘۡ۟ۦۘۜۤۜۘ۫۠ۧۥۖۜۘۗۡۨۛۨ۬"
            r3 = r2
            goto L_0x001b
        L_0x0059:
            r19 = 0
            java.lang.String r2 = "ۘۙۛۘۦۡۘ۠ۖۚۜۦۘۢۘۖ"
            r3 = r2
            goto L_0x001b
        L_0x005f:
            java.lang.String r2 = "ۤۢۨۦ۟ۦۘۡۡۧۘۘۚۦۘۤۜ۟ۚ۟۟ۨۗۚۛۡۧۘ"
            r3 = r2
            r20 = r21
            goto L_0x001b
        L_0x0065:
            java.lang.String r2 = "ۛ۠ۨۘۥۖۚ۬ۙۨۘۖۘ۫ۥۜۤ"
            r3 = r2
            r13 = r19
            goto L_0x001b
        L_0x006b:
            java.lang.String r2 = "ۧ۟ۤۘۖۖۘۤۚۙ۠۬ۡۧۛ۫ۙۚۥۘۙ۟۫ۘۡۜ۬ۡۘ"
            r3 = r2
            r15 = r18
            goto L_0x001b
        L_0x0071:
            r0 = r24
            int r0 = r0.f1376l
            r17 = r0
            java.lang.String r2 = "ۥۦۖۘۡ۫ۢۨ۫ۖ۠ۡ۠۠ۨۧۘ۟ۤۖۘۡۙ۫ۙۡۚ"
            r3 = r2
            goto L_0x001b
        L_0x007b:
            r3 = 519449579(0x1ef62beb, float:2.6064427E-20)
            java.lang.String r2 = "ۧۡۛۢۛۦۘ۫ۦۜۢۚۙۦۜۜۘۤۗۦۘۤۡۧ"
        L_0x0080:
            int r22 = r2.hashCode()
            r22 = r22 ^ r3
            switch(r22) {
                case -1584703208: goto L_0x01d9;
                case -1054732021: goto L_0x009a;
                case -362576276: goto L_0x0091;
                case 1929654739: goto L_0x008a;
                default: goto L_0x0089;
            }
        L_0x0089:
            goto L_0x0080
        L_0x008a:
            java.lang.String r2 = "ۜۛۨۨ۠ۜۘ۬ۜ۬ۧۘۧۘۦۦۥۘ"
            r3 = r2
            goto L_0x001b
        L_0x008e:
            java.lang.String r2 = "ۛۥۡۧۘ۠ۖۚۥۛۢۢۥۜۦۤ۫۟ۙۥۚ"
            goto L_0x0080
        L_0x0091:
            r0 = r20
            r1 = r17
            if (r0 >= r1) goto L_0x008e
            java.lang.String r2 = "ۛۛۦۖ۟ۡ۟ۢۧۡۧ۫۫ۢۜ۬ۖۧۤ۟ۘۘۤ۠ۢ"
            goto L_0x0080
        L_0x009a:
            java.lang.String r2 = "ۚۦ۠ۥۜۧۡ۫ۚ۠ۦۧۛۗۖۥ۟ۜۚۧۚ"
            goto L_0x0080
        L_0x009d:
            r0 = r24
            r1 = r20
            android.view.View r16 = r0.getChildAt(r1)
            java.lang.String r2 = "ۛۢۥۡۡۜۦ۬ۡۖۚۢۦۨۖ"
            r3 = r2
            goto L_0x001b
        L_0x00aa:
            r3 = 978194900(0x3a4e11d4, float:7.860933E-4)
            java.lang.String r2 = "ۦۤۙ۟ۥۘۘ۫ۨۚۢۨۚۚ۫۬"
        L_0x00af:
            int r22 = r2.hashCode()
            r22 = r22 ^ r3
            switch(r22) {
                case 167763613: goto L_0x00cc;
                case 1039761812: goto L_0x01cf;
                case 1044095714: goto L_0x00c9;
                case 1756734839: goto L_0x00b9;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            goto L_0x00af
        L_0x00b9:
            int r2 = r16.getVisibility()
            r22 = 8
            r0 = r22
            if (r2 != r0) goto L_0x00c6
            java.lang.String r2 = "ۢ۠ۦۘۜۖۚ۠ۨۢۖۙ۠ۢۚۡ"
            goto L_0x00af
        L_0x00c6:
            java.lang.String r2 = "ۦۦۨۘۧۘۜۘۦۥۗۙۘ۠ۤۥۙۥۙۖۘۦۦۛۜۖۜۘۛۖۜۘ"
            goto L_0x00af
        L_0x00c9:
            java.lang.String r2 = "۟ۨۨۦۚۖۘ۠ۖۗۡۗۧۨۜۛۨۢۥ"
            goto L_0x00af
        L_0x00cc:
            java.lang.String r2 = "۟ۤۖۚ۫ۘۙۛۥۘۜ۫۬ۖ۠"
            r3 = r2
            goto L_0x001b
        L_0x00d1:
            java.lang.String r2 = "ۨۧۙ۟ۥۜۘۦۖۤ۬ۚۖۡ۫ۘۢۛۢ"
            r3 = r2
            r14 = r15
            goto L_0x001b
        L_0x00d7:
            java.lang.String r2 = "ۚۙۛۗ۫ۥ۫ۚۘۘۛۥۙ۬۫ۖ"
            r3 = r2
            r12 = r13
            goto L_0x001b
        L_0x00dd:
            r0 = r24
            int r2 = r0.f1375k
            int r3 = r16.getMeasuredWidth()
            int r2 = java.lang.Math.max(r2, r3)
            r0 = r24
            r0.f1375k = r2
            java.lang.String r2 = "ۡۙۛۜۜۘۘ۠ۜۥۘۘۗۦۦۛۢۛۖۡۘۥۨ۬ۥ۬ۡۘۨۜۧ"
            r3 = r2
            goto L_0x001b
        L_0x00f2:
            int r2 = r16.getMeasuredHeight()
            int r11 = r13 + r2
            java.lang.String r2 = "ۘۥۛۜ۬ۜۘ۬۟ۡۦۦۜۘۘۥۧۙۨۡۘۧۖۨۖۥ۟"
            r3 = r2
            goto L_0x001b
        L_0x00fd:
            java.lang.String r2 = "fab_label"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r16
            java.lang.Object r2 = r0.getTag(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = "۬ۦۢۤۜ۟ۗۨۥۜۙۤۨۨ۠ۨ۬ۗ۫ۡۨۚۘۨۘ۬۫ۜۘ"
            r10 = r2
            goto L_0x001b
        L_0x0112:
            java.lang.String r2 = "۟ۙۜۚ۬ۡۚۡۧۘۦۥۦۘ۟۫ۚ۠ۤۧۘۚۦۨۧ"
            r3 = r2
            r14 = r15
            goto L_0x001b
        L_0x0118:
            java.lang.String r2 = "ۜۙۤۡ۬ۧ۠ۧۢۡۗۚۤ۫ۡۚ۫ۨۘ۟۬ۚۨۜۥ"
            r3 = r2
            r12 = r11
            goto L_0x001b
        L_0x011e:
            r3 = 1575818462(0x5ded14de, float:2.13544042E18)
            java.lang.String r2 = "ۥۦۢۛۧۛ۟ۙۖۘۤ۟ۦۘ۫ۢۛ۬ۗۜۙۥۘ"
        L_0x0123:
            int r22 = r2.hashCode()
            r22 = r22 ^ r3
            switch(r22) {
                case -1802530134: goto L_0x0138;
                case -423839469: goto L_0x012d;
                case 1183093334: goto L_0x0133;
                case 1184650127: goto L_0x01d4;
                default: goto L_0x012c;
            }
        L_0x012c:
            goto L_0x0123
        L_0x012d:
            java.lang.String r2 = "ۖۧۦۘ۟۫ۡۧۛۙۡۡۘۘۦۥۥۥۦ"
            goto L_0x0123
        L_0x0130:
            java.lang.String r2 = "ۙۦ۠ۗۧۛ۠ۚۥۘۚ۟ۨۘۚۤۢۚۡۖ"
            goto L_0x0123
        L_0x0133:
            if (r10 == 0) goto L_0x0130
            java.lang.String r2 = "ۙۛۗۖ۫ۡ۟ۢۢۚۤۡ۫ۦۘ۟ۙۥۧۚۦۘۜۖۡۘۦ۠"
            goto L_0x0123
        L_0x0138:
            java.lang.String r2 = "ۚۖۜ۟ۛۦۡۨۚۤۘۨ۠ۢۢۛۧۥۘۥۡ۫ۥۤۥۡ۬"
            r3 = r2
            goto L_0x001b
        L_0x013d:
            int r2 = r10.getMeasuredWidth()
            int r9 = java.lang.Math.max(r15, r2)
            java.lang.String r2 = "ۙۧۡ۟ۖۙۤۧۥۘۙۢۥۘ۠ۡۦۙۦ"
            r3 = r2
            goto L_0x001b
        L_0x014a:
            java.lang.String r2 = "ۘۘ۬ۖۘۜۜ۟ۤۖۥۥۡۨۨۘ"
            r3 = r2
            r12 = r11
            goto L_0x001b
        L_0x0150:
            java.lang.String r2 = "ۜۜۡۨ۫۫ۗۘۙۤ۠۬۫ۗۦۨۥۗ"
            r3 = r2
            r14 = r9
            goto L_0x001b
        L_0x0156:
            int r8 = r20 + 1
            java.lang.String r2 = "ۢۦۘۛۢۚۚۚۜۘۖۨۖ۫ۤۜۥۙۨۘۘۡۚ"
            r3 = r2
            goto L_0x001b
        L_0x015d:
            java.lang.String r2 = "ۦۛۜ۟۟ۜۥ۬ۨۧۛۡۜۢۧ۠ۚۨ۫ۢۙ"
            r3 = r2
            r15 = r14
            goto L_0x001b
        L_0x0163:
            java.lang.String r2 = "ۢۢۦۖۚ۟ۦ۠ۗۛ۬ۜۘۗ۬ۨۨۦ۟ۦ۟ۜۥۜۖ۠ۙۤ"
            r3 = r2
            r13 = r12
            goto L_0x001b
        L_0x0169:
            java.lang.String r2 = "۟۠ۗۖۡ۠ۖ۬۫ۖۡۤۙۜۦ"
            r3 = r2
            r20 = r8
            goto L_0x001b
        L_0x0170:
            r0 = r24
            int r7 = r0.f1375k
            java.lang.String r2 = "ۥۢۡۘۜۜۡۘۙۙۘۘۦۖۜۛ۫ۡۘۚۧۥ۠ۙۛ"
            r3 = r2
            goto L_0x001b
        L_0x0179:
            java.lang.String r2 = "ۢۚ۬ۥ۫ۛۡۗۦۘ۬ۡ۬ۘۥۚ"
            r3 = r2
            r5 = r6
            goto L_0x001b
        L_0x017f:
            r3 = 1764242499(0x69283443, float:1.2709146E25)
            java.lang.String r2 = "۠ۗۘۘۜۥۡۧ۟۫ۧۛۥۘۛۚۖۘۧۖۢۛ۟ۘۙۡۚۤۙۦ"
        L_0x0184:
            int r22 = r2.hashCode()
            r22 = r22 ^ r3
            switch(r22) {
                case -1442900711: goto L_0x018e;
                case -461056950: goto L_0x0196;
                case 523282208: goto L_0x0199;
                case 543198372: goto L_0x01de;
                default: goto L_0x018d;
            }
        L_0x018d:
            goto L_0x0184
        L_0x018e:
            if (r15 <= 0) goto L_0x0193
            java.lang.String r2 = "ۥۥۦۘۨۤۖۘۛۤۚۜۤۡۥ۫ۨۘ۬ۖۧۘ"
            goto L_0x0184
        L_0x0193:
            java.lang.String r2 = "ۢۤۢ۫۫ۢ۬ۦۜۙۢۜۢۗۦۘ۠ۤۥ"
            goto L_0x0184
        L_0x0196:
            java.lang.String r2 = "ۜۛۥۦۤۜۨ۫ۘۘۡۘۧۘۗۗۦ"
            goto L_0x0184
        L_0x0199:
            java.lang.String r2 = "۫ۢۛۦۜۘ۟ۤۧۖۙۦۘۜۛۤ۫ۨۜۘ"
            r3 = r2
            goto L_0x001b
        L_0x019e:
            r0 = r24
            int r2 = r0.f1368d
            int r4 = r2 + r15
            java.lang.String r2 = "۠۠ۥۘۙۗۤۨۙۖۧۦۦۨ۬ۧۤۙۦ۠۫ۥۘ"
            r3 = r2
            goto L_0x001b
        L_0x01a9:
            java.lang.String r2 = "ۙۨۗۖۤۜۘۤ۠ۖ۫ۦۗۧۥۜۤۡۧ۠ۨۥۨۖۘ"
            r3 = r2
            r5 = r4
            goto L_0x001b
        L_0x01af:
            int r2 = r5 + r7
            int r3 = r17 + -1
            r0 = r24
            int r0 = r0.f1367c
            r22 = r0
            int r3 = r3 * r22
            int r3 = r3 + r13
            int r3 = r3 * 12
            int r3 = r3 / 10
            r0 = r24
            r0.setMeasuredDimension(r2, r3)
            java.lang.String r2 = "ۤۡۜۘ۟۫۟۫ۛۨۖۢۨۤ۫ۜۘۚۛۢ۠ۚۥۘ"
            r3 = r2
            goto L_0x001b
        L_0x01ca:
            java.lang.String r2 = "ۧ۟ۤۘۖۖۘۤۚۙ۠۬ۡۧۛ۫ۙۚۥۘۙ۟۫ۘۡۜ۬ۡۘ"
            r3 = r2
            goto L_0x001b
        L_0x01cf:
            java.lang.String r2 = "۬۟ۛۡ۠ۡۥۜۧۧۘ۬ۦۤۨ۫ۙۚ۬ۤۙ۬۬"
            r3 = r2
            goto L_0x001b
        L_0x01d4:
            java.lang.String r2 = "ۜۜۡۨ۫۫ۗۘۙۤ۠۬۫ۗۦۨۥۗ"
            r3 = r2
            goto L_0x001b
        L_0x01d9:
            java.lang.String r2 = "۬ۗۘۧۚۛۙۜ۬ۤۨۨۛۦۥۗۢۡۘ۠ۨ۫۟ۖۗۤۤۨ"
            r3 = r2
            goto L_0x001b
        L_0x01de:
            java.lang.String r2 = "ۙۨۗۖۤۜۘۤ۠ۖ۫ۦۗۧۥۜۤۡۧ۠ۨۥۨۖۘ"
            r3 = r2
            goto L_0x001b
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z2 = false;
        String str = "ۖۗۖ۠۬ۘۘ۟ۦۢۧۤۢ۠ۧۜۚۙۡ";
        Parcelable parcelable2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RotatingDrawable rotatingDrawable = null;
        SavedState savedState = null;
        Parcelable parcelable3 = null;
        while (true) {
            switch ((str.hashCode() ^ 604) ^ -329704008) {
                case -2054062431:
                    f3 = 135.0f;
                    str = "ۨ۠ۜ۬۠۠ۗۜۨۘ۫ۙۚۛ۫ۧۦ۬۬ۗ۠ۙ۠ۥۡ";
                    break;
                case -1756876868:
                    str = "ۖۚۗ۬۫ۦۘۡۦۙۥۚۘۦۤۗۡۘ۟۫ۖۡۧۦ۟ۚ۠۫";
                    break;
                case -1702382712:
                    return;
                case -1549110036:
                    str = "ۨۦۧۘۡۧۦۧ۠ۤۥۛۘۘۘ۠ۘ";
                    z2 = savedState.mExpanded;
                    break;
                case -1538487112:
                    this.f1377m.setEnabled(z2);
                    str = "۟ۨۖۘۛۧۦۘۡۖۨۘۡۗۖۘۛۢۦۘ";
                    break;
                case -1429843658:
                    String str2 = "ۢۡ۬۟ۛۦۘۘۢۙۨ۟۬ۜۘۘ۫۟ۖ";
                    while (true) {
                        switch (str2.hashCode() ^ -1526611817) {
                            case -503370683:
                                str = "ۙۡۥ۟ۛ۬ۘۧ۠ۚۘ۫ۡ۬۬۟ۘ۟ۙۢۨۘ";
                                continue;
                            case 98669307:
                                str2 = "ۙۗ۠ۘ۬ۖۛۙۙۚۢۖۥۘۘ";
                                break;
                            case 394905904:
                                if (rotatingDrawable == null) {
                                    str2 = "ۧۗۛۥ۠ۜۘ۟ۨۧۦۥۖۘۢ۠ۚۥۜۧۘۗۡۨۘ۠۬ۥ";
                                    break;
                                } else {
                                    str2 = "ۡۖۦ۟ۨ۠ۢۙۚ۟ۘۗ۫۫ۢۖ۟ۖۘ";
                                    break;
                                }
                            case 1106938031:
                                str = "ۘۘۥۘۛۘۖۘۖۜۘۘۘۛۖۖۥۤۤۗۘۡۖۖۘ";
                                continue;
                        }
                    }
                    break;
                case -1224666709:
                    str = "ۛۚ۬ۛۗ۬۟ۛۨۘ۫ۗۖ۬ۨ۠۟۟ۥۘ۠۟ۨۖ۫۟";
                    break;
                case -1158763336:
                    super.onRestoreInstanceState(parcelable3);
                    str = "۫ۚۜۛۘ۟۬ۥۜۘۙۗۤ۫ۢۨۘۛۢۖ";
                    break;
                case -1007566108:
                    this.f1370f = z2;
                    str = "ۜۡۦۘۨۡ۫۠ۦۛ۫ۛۚۤ۠ۜ۬";
                    break;
                case -674257223:
                    str = "ۖۛۙۨۧ۫ۚۙۧ۠ۢۜۘۙۜۥ۠ۖۗۘۥۘ";
                    f2 = 0.0f;
                    break;
                case -251275162:
                    parcelable2 = savedState.getSuperState();
                    str = "ۙۛۤۙۖۜۖۧۥۘ۟۠۬ۤۨۧۘۤۤۢۧۢۧ";
                    break;
                case 140674339:
                    String str3 = "ۦۦۘۨۦ۟ۥۧۖۘۨۘۦۢ۬ۦۥۗۥۘ۬ۖۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1349133082) {
                            case -2030730922:
                                str = "ۡۙۤۚ۠ۖۘۨۗۨۚۢۦۘۦۘۖۜ۬۠ۙ۟ۜۘۘۛۥۙۚۖ";
                                continue;
                            case -1378109120:
                                str = "ۗۨۨۘۜۘۦۘۧۛۦۘۨۙۛۦۛ۠ۨۢ۬";
                                continue;
                            case -225895153:
                                str3 = "ۜۛۖۘ۠۬ۜۡۘۖۘۗۚۤۡ۠ۨ۬ۢۖ";
                                break;
                            case 1146078776:
                                if (!(parcelable instanceof SavedState)) {
                                    str3 = "ۤۜۨۘۢۢۤۙۘۤ۠ۧ۠ۛۖۦۘ۟۠ۢۗۥۘ";
                                    break;
                                } else {
                                    str3 = "ۜ۫ۦۘۙۤۤ۠۟ۤۦ۫ۘۘ۫ۜۘۜۥۘۚۤۙۚۜ۠";
                                    break;
                                }
                        }
                    }
                    break;
                case 299875374:
                    str = "ۗۤ۫ۦ۫ۚۗۛۛۥۡۘۦ۬ۦۘ۬ۡۙۥ۠ۦۘۢ۠ۜۘۘۙۜ";
                    f2 = f3;
                    break;
                case 310316036:
                    str = "۬ۜۖۗۥۙۤ۫ۥۡ۟ۜۘۤۡۘۘۥۦۚۥۖۡۘۨ۟ۘۘ";
                    savedState = (SavedState) parcelable;
                    break;
                case 504749389:
                    str = "ۗۨۨۘۜۘۦۘۧۛۦۘۨۙۛۦۛ۠ۨۢ۬";
                    parcelable3 = parcelable2;
                    break;
                case 662149915:
                    str = "ۡۚۚۥۦۚۛۤۜۘۡۖۗۛ۠ۘۘۤۨۘۡۜۡۘۢۘ";
                    rotatingDrawable = this.f1374j;
                    break;
                case 869311325:
                    str = "ۛۧۧۥۨۨ۬ۙۤۦۦۡۧۢۤۙۜۖۘ";
                    break;
                case 938602089:
                    String str4 = "ۛ۠۫ۢۦۛۧ۟ۗۤۧۡۘۙۚۡۚۛۦۜۡۧۘۤۢۚ";
                    while (true) {
                        switch (str4.hashCode() ^ 1054050332) {
                            case -930936411:
                                if (!this.f1370f) {
                                    str4 = "ۙۜۜۘ۠۟۟ۨ۫ۤۜۢۧۦۛۜۘۡ۬ۘ";
                                    break;
                                } else {
                                    str4 = "ۘۡۘۜۨ۬ۚۢۡۘۖۚۤۛۜۥۘۖۜۚۜۖۗۨۘۘ۬۟ۛ";
                                    break;
                                }
                            case 1039313479:
                                str = "ۘ۟ۥۘ۬ۗ۟ۙ۠ۛۖ۠ۧۜۨ";
                                continue;
                            case 1590593787:
                                str = "ۦ۬ۧۗۡۦۡۗۛۧۚۜۘ۠ۤۢ";
                                continue;
                            case 1985082193:
                                str4 = "ۜۤۢ۬ۘۨۧ۬۫ۙۡ۟ۘۚۦۘ";
                                break;
                        }
                    }
                    break;
                case 1274014842:
                    rotatingDrawable.setRotation(f2);
                    str = "ۘۘۥۘۛۘۖۘۖۜۘۘۘۛۖۖۥۤۤۗۘۡۖۖۘ";
                    break;
                case 1896781950:
                    str = "ۚۡۙۜۧۘۘۚۖۡۘ۬ۤۦۛۢۖۘ";
                    parcelable3 = parcelable;
                    break;
                case 1969978400:
                    str = "ۖۛۙۨۧ۫ۚۙۧ۠ۢۜۘۙۜۥ۠ۖۗۘۥۘ";
                    break;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = null;
        String str = "ۗۗۘۦۢۧ۫۬ۦۘ۬ۖ۠ۙ۟ۛۛ۫ۦۘۛۡۛ۬ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 133) ^ -2112864648) {
                case -1073467043:
                    savedState = new SavedState(super.onSaveInstanceState());
                    str = "ۚ۟۬ۥۜۦۘۖۜۧ۬ۛۥ۟ۗ۟ۦۙ۬";
                    break;
                case -428332622:
                    return savedState;
                case -253641110:
                    savedState.mExpanded = this.f1370f;
                    str = "ۥۥ۬ۧۤۦۘ۬۠ۦۗۛۦۘۡۗۨۗۢ۟";
                    break;
                case 663178685:
                    str = "ۗۗۜۘ۠ۜۦۘ۫ۤۧۧۜۖ۟۠ۖۘ";
                    break;
            }
        }
    }

    public void removeButton(FloatingActionButton floatingActionButton) {
        String str = "۬ۡۚۨۚۦۘۚۘۤۦۥۧۘۙۧ۠ۙۗۖ۟ۥۡۘۙۥۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 551) ^ -1721352874) {
                case -2048391171:
                    str = "۟۟۫ۤۡۖۙۡۧ۬۟ۢۚ۟۠ۥۦۖۘ";
                    break;
                case -407700707:
                    floatingActionButton.setTag(yo.getID("fab_label", "id"), (Object) null);
                    str = "ۦۡۢۗۧۜۚۗۖۨۘۤۛۨۡ";
                    break;
                case -128975983:
                    str = "ۢۢۘۡۧۢۡۙ۫۫ۢۨۛۚۧۚۥۦۛۜۙۗۥ";
                    break;
                case -94351163:
                    this.f1376l--;
                    str = "ۧۛۖۛۖ۠ۗ۟ۛۚۚۦۘۧۙۦۙۗۨۘۢۚۥۘۖۛ۟";
                    break;
                case 21658240:
                    removeView(floatingActionButton.getLabelView());
                    str = "ۗۢۧۤۚۘۘ۠ۥ۬ۡۤۗۗ۬ۡۘۦۥۚ۫۬ۢ";
                    break;
                case 126803774:
                    return;
                case 1049458336:
                    removeView(floatingActionButton);
                    str = "ۗۗۦۘ۟ۥۦۖۢۢۛۜۨۘ۫ۚۛۦۨ۟ۘ۟ۨۡۤۦۘ";
                    break;
            }
        }
    }

    public void setEnabled(boolean z2) {
        String str = "ۤ۠ۡۨۙۢۧۦ۟۟۠ۚ۠ۖۦۧ۟ۘ۟ۛۖ";
        while (true) {
            switch ((str.hashCode() ^ 396) ^ -1111501101) {
                case -1156224821:
                    super.setEnabled(z2);
                    str = "ۛۡۜۘۦۤۖۘۧۜۡۘۘۖ۟ۦۢۢۗۙۜۥۨۘۘ۠ۤۦۦۖ۠";
                    break;
                case -1052813350:
                    str = "ۛ۫ۤ۫ۦۥۘۥۦۘۚ۠ۨۡۚ۠ۘ۠ۖۛۘ۫";
                    break;
                case 430119294:
                    return;
                case 1197673541:
                    str = "ۘۢ۠ۦ۠ۦۘۢۡۤۨۖۡۙۜۧ";
                    break;
                case 1240897159:
                    this.f1373i.setEnabled(z2);
                    str = "ۘۤۖۘۨۦ۬ۗۘۡۢۘۥۘۗۨۛ";
                    break;
            }
        }
    }

    public void setOnFloatingActionsMenuUpdateListener(OnFloatingActionsMenuUpdateListener onFloatingActionsMenuUpdateListener) {
        String str = "ۨۡۚۛ۬۫ۤ۫۠ۙۤۢۢۢۦۘ۫ۦۖۘۥۨۢ";
        while (true) {
            switch ((str.hashCode() ^ 379) ^ 979342588) {
                case -1908678498:
                    str = "۟ۤۖۘۚۦۙ۬ۖۧۤۨۧۘۙۢۡۨ۬ۛۙۛۥۡۥۜۧۜۗ";
                    break;
                case -1322026491:
                    str = "ۜۤۨۘۖۖۢۛۢۦۘۡۙۚۨۥۘ۫۟ۥ";
                    break;
                case 1391356854:
                    return;
                case 1630771666:
                    this.f1378n = onFloatingActionsMenuUpdateListener;
                    str = "ۚۖۨۘۡ۟ۧۧ۫ۧ۟ۜ۟ۢ۠ۡۙۙ۫ۧۨۘۚۖۖۘ";
                    break;
            }
        }
    }

    public void toggle() {
        String str = "ۖۘ۬ۘ۠ۜۘۙۗۥ۠۟ۡۘۨۗ۠ۚۜۜۘۢۡۧۗۗۤۚۧۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 715) ^ 1198599647) {
                case -1807325442:
                    collapse();
                    str = "ۚۤ۬۫۟ۦ۟ۡۖۜۨۘۢۖۡۘ";
                    break;
                case -139290809:
                    str = "ۤۤۢ۬ۗۚۥۡ۠۟ۛۜۜۛۦۡۡۚۡۧۤ۠ۘ۫۠۬";
                    break;
                case 56944265:
                    expand();
                    str = "ۤۤۢ۬ۗۚۥۡ۠۟ۛۜۜۛۦۡۡۚۡۧۤ۠ۘ۫۠۬";
                    break;
                case 888258204:
                    String str2 = "ۖۦۘۡۤۘۚۨ۬ۦۢ۬ۖۗۥۘۜۤۦ۠۟ۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1086101861) {
                            case -1578822250:
                                str = "ۘۢۡۛ۟ۦۡۙۧ۬ۤ۟ۜ۫۠ۡۥۖۘۖۗۛۘۜۥۘ";
                                continue;
                            case -699234641:
                                if (!this.f1370f) {
                                    str2 = "ۛۥۘۘ۟ۥۗۡۡۧ۬ۘۥ۫ۛۛۗ۟۬ۧۦۘۢۨۧۘ۬ۡۘۘ";
                                    break;
                                } else {
                                    str2 = "ۖۨۖۘۚۡۖۜۢۡۘ۬ۗۨۘ۫۠ۢۤ۟۫۠۠ۤۤۤۙۡۥ";
                                    break;
                                }
                            case 597627978:
                                str2 = "ۧۖۘ۟ۥۧۘۡ۠ۖ۟ۚۦۘۥۚۚ۟ۜۥۘۘۛۜۘۜ۫ۜۘۙۡ۟";
                                break;
                            case 1215782937:
                                str = "ۨۦۖۘ۟ۢۦۘۥۜۡۧۜۖۦۤۖۘۖۗۨ۬۟ۜۘ";
                                continue;
                        }
                    }
                    break;
                case 1283516177:
                    str = "۬۠ۗۨ۟ۤۗۦۛۡۖ۠ۖ۬ۢۛۚۡۘ۟ۗۙۤۗ۬ۘۤۥ";
                    break;
                case 1505892969:
                    return;
            }
        }
    }
}
