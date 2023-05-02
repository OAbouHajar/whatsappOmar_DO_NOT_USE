package com.obwhatsapp.youbasha.colorPicker;

import X.AnonymousClass00T;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class HsvAlphaSelectorView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f993a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f994b;

    /* renamed from: c  reason: collision with root package name */
    public int f995c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f996d;

    /* renamed from: e  reason: collision with root package name */
    public int f997e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f998f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f999g = true;

    /* renamed from: h  reason: collision with root package name */
    public OnAlphaChangedListener f1000h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1001i = false;

    public interface OnAlphaChangedListener {
        void alphaChanged(HsvAlphaSelectorView hsvAlphaSelectorView, int i2);
    }

    public HsvAlphaSelectorView(Context context) {
        super(context);
        a();
    }

    public HsvAlphaSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private int getOffset() {
        String str = "ۙۦۗۖ۠ۦۘ۫۫ۗ۟ۦۥ۠ۖۥۘۗۦۨۘۡۢ۠";
        while (true) {
            switch ((str.hashCode() ^ 136) ^ 975313658) {
                case 1392930616:
                    str = "۫ۨۗۥ۫ۥۘ۬ۗۨۘۖ۬ۡۧۘۖ";
                    break;
                case 1847787162:
                    return Math.max(this.f995c, (int) Math.ceil(((double) this.f993a.getIntrinsicHeight()) / 2.0d));
            }
        }
    }

    private int getSelectorOffset() {
        String str = "ۗۜۚۨۛۦ۬ۜۘۜۜۜۘۥ۬ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 667) ^ 1270156419) {
                case -857704396:
                    return (int) Math.ceil((double) (((float) this.f994b.getHeight()) / 2.0f));
                case 2113422961:
                    str = "ۤۙۖۥ۟ۤۨ۬ۡۘ۠ۢۖۘ۠ۢۜۘۧۤۖۘ۟ۗۜۧۙۗۘۢۜۘ";
                    break;
            }
        }
    }

    private void setPosition(int i2) {
        OnAlphaChangedListener onAlphaChangedListener = null;
        String str = "ۨۘۘۧۦۡۘ۠ۛۡۘۙ۬ۜۘۤۨۥ۬ۜۨۚۘۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 126) ^ -572450607) {
                case -1818681910:
                    onAlphaChangedListener.alphaChanged(this, this.f997e);
                    str = "ۖۙۜۘۨۛۨۦ۫ۨ۫ۛۚۢ۫ۚۘ۟۠";
                    break;
                case -951219995:
                    str = "ۦ۫ۛ۟۬ۢ۫ۖۛۗۦ۟ۚۙۛۢۥۦۘۖۙۥۘۢۖۧۙ۟ۨۘ";
                    break;
                case -598433266:
                    this.f997e = 255 - Math.min(MotionEventCompat.ACTION_MASK, Math.max(0, (int) ((((float) (i2 - this.f996d.getTop())) / ((float) this.f996d.getHeight())) * 255.0f)));
                    str = "ۗۥ۫ۘۛۤۧۢۙ۟ۤۚۤۛۘۘ";
                    break;
                case -178445721:
                    onAlphaChangedListener = this.f1000h;
                    str = "ۚۨۧۚۧۡ۬ۘۘ۠ۧۜۢ۟ۛ۫ۗۦۘۨۘ۬۠ۤۨۘ";
                    break;
                case 312268759:
                    String str2 = "ۙۡۧ۫ۦۚۢۗۛۡ۬ۥۘۢ۟ۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 213997907) {
                            case -388416160:
                                if (onAlphaChangedListener == null) {
                                    str2 = "ۥۧ۫ۜۢۛۘۘۦۘۡۦۢ۬۟ۤ۟ۧۦۘ";
                                    break;
                                } else {
                                    str2 = "ۦۗۘۘۖ۟ۨۘ۫ۘۖۘۡ۠ۥۖ۫ۨ";
                                    break;
                                }
                            case -108518305:
                                str = "ۖۙۜۘۨۛۨۦ۫ۨ۫ۛۚۢ۫ۚۘ۟۠";
                                continue;
                            case 1405956757:
                                str2 = "ۦ۠ۘۦۢۙ۬ۥۧ۟۬ۖۘۡۚۢۙۡۛۢۙۡ";
                                break;
                            case 1770147089:
                                str = "ۨۗۢۢ۬ۖۘۧ۫ۗ۟ۥۜۘۤۙۜ۬ۦۨۨ۟ۘۘۜ۫ۥۦۛۜ";
                                continue;
                        }
                    }
                    break;
                case 319136767:
                    str = "ۦۙۗۖۚۘۖۚ۫۫ۤۨ۫۬ۘۘۖ۬ۦۘۗۦۚ";
                    break;
                case 1031697706:
                    return;
                case 1343445181:
                    b();
                    str = "ۤۧۨۙۦۛۜۚۙ۬ۧ۬۟ۘۦۢۗۜۘ۬ۦۖۘۢۜۥۘ";
                    break;
            }
        }
    }

    public final void a() {
        String str = "۠۟ۛۡۗۤۤ۟ۡۦۤ۬ۧۜۘۗۛۨۛۡۢ";
        LinearLayout.LayoutParams layoutParams = null;
        ImageView imageView = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        ImageView imageView2 = null;
        while (true) {
            switch ((str.hashCode() ^ 29) ^ -513992943) {
                case -1943425220:
                    this.f993a = AnonymousClass00T.A04(yo.getCtx(), others.getID("color_seekselector", "drawable"));
                    str = "۬ۧۥۘۗۗۚۡۢ۠ۚۨۗۧۛۡۘۜۘۗۡۚۢ";
                    break;
                case -1838843350:
                    addView(this.f996d, layoutParams);
                    str = "ۚۗۤۡۡۘۥۥۥۘۚۡۖۡۙۦۘ";
                    break;
                case -1699962453:
                    str = "ۦۧۢ۫۬۫ۜۨۦۘۨ۫ۨۘۥ۫ۡ";
                    imageView = new ImageView(getContext());
                    break;
                case -1571367016:
                    setGravity(1);
                    str = "ۙۢۜۘۢۡۙۥۜ۟ۦۘۙۗۛۖۦۖۘ۠ۨۚۧ۫ۜۘ";
                    break;
                case -1466331763:
                    this.f996d = imageView;
                    str = "ۖ۫۬ۤۖۦۙۤۥۘۨ۠ۖۘۛۢۨۘۖ۫ۡۘ";
                    break;
                case -1452677628:
                    setWillNotDraw(false);
                    str = "ۢۢ۫ۚۚۨۘ۟ۧۨۗۤۦۘۛۧۡۗۥ۬ۚۘۛۙۧۦ";
                    break;
                case -1385576583:
                    return;
                case -973910908:
                    str = "ۡۘۖۦۨ۠ۜۖۥ۬۫ۙۨۜ";
                    imageView2 = new ImageView(getContext());
                    break;
                case -922352211:
                    str = "ۙۤۧۧۡۛ۬ۢۦۤۤۚۨۘۗۖۦۦۢۙۥ";
                    break;
                case -794215160:
                    layoutParams.setMargins(0, getOffset(), 0, getSelectorOffset());
                    str = "۬ۛۧ۫۟ۤ۠ۜ۬ۢۚۧۨۥۚ";
                    break;
                case -786333663:
                    addView(this.f994b, layoutParams2);
                    str = "۫ۢۡۢۢۤۢ۬ۚۚۧۖۘۥۧۧۛۜۨ";
                    break;
                case -500378552:
                    str = "ۘۤۢۦۢۨ۫ۤ۟ۗۗۖۙۧۘۘۛۙۛۚ۬ۡۘۗۙۡ";
                    layoutParams2 = new LinearLayout.LayoutParams(this.f993a.getIntrinsicWidth(), this.f993a.getIntrinsicHeight());
                    break;
                case -268480701:
                    setOrientation(0);
                    str = "۬ۙۖۦۤ۫ۘۚۘ۫ۖۡۖۙۥۨ۠۠ۚۖۛۜۛ";
                    break;
                case -101496819:
                    this.f996d.setScaleType(ImageView.ScaleType.FIT_XY);
                    str = "ۥۧۘۘۤۘۖۨ۫ۚۚۜۙ۬ۧۜۘۤۤ";
                    break;
                case 1117088241:
                    imageView2.setImageDrawable(this.f993a);
                    str = "ۜ۠ۨۘ۬۠ۚ۫ۦۡۘۥۡۜۘۢۡۙۦۜۡۘ۬ۥ";
                    break;
                case 1443190459:
                    layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    str = "ۘۢۖۘ۫۬ۨ۠ۘۤۤ۟ۘۗۘۥۢ۫ۘۛۢۢ";
                    break;
                case 1736311374:
                    this.f994b = imageView2;
                    str = "ۧۖۚ۬ۙۨۘۨۘۚۥۜ۫ۦۡ۬ۚۖۘ";
                    break;
                case 2028443156:
                    imageView.setBackgroundDrawable(AnonymousClass00T.A04(yo.getCtx(), others.getID("transparentbackrepeat", "drawable")));
                    str = "۫ۦ۟ۥۤۢۤۢ۠ۨۛ۠ۥۜ۠ۢۤ";
                    break;
            }
        }
    }

    public final void b() {
        ImageView imageView = null;
        String str = "ۥۙۘۘۖۥۤۤۙۘۘۢۨۥ۬ۢۛ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((str.hashCode() ^ 481) ^ 1619429446) {
                case -1057069605:
                    str = "ۢۙۙ۟ۢ۫ۛۚۦۥۡۘۡ۬۫۬ۙۚۥۛۨۘۙۘۥ۟ۙ";
                    break;
                case -820207919:
                    i2 = (i5 + i3) - i4;
                    str = "ۨ۠ۢۡۧ۫۫۫ۨۘۢۦۨ۠۟ۜۖۡ۫";
                    break;
                case 493834752:
                    imageView = this.f994b;
                    str = "۬ۢۥۡۗۥۘۘۤۢ۟۬ۘۘ۟ۗۥۘۧۛۖۢۤۡۘۚۦۗۖۢۨ";
                    break;
                case 1019061083:
                    imageView.layout(0, i2, imageView.getWidth(), this.f994b.getHeight() + i2);
                    str = "ۘۙ۫۟ۖۚۧۧ۬ۨۙۗ۫۟ۨۘۗۡۘۚۦۜۘۡۖۢ";
                    break;
                case 1095667717:
                    i3 = this.f996d.getTop();
                    str = "ۥۘۖۘۖۘ۟ۢۧۘۘۜۨۡۦۦۖۡۚ";
                    break;
                case 1170117973:
                    i5 = (int) ((((float) (255 - this.f997e)) / 255.0f) * ((float) this.f996d.getHeight()));
                    str = "ۧۜۗۥۜۘۙۥۥۙۘۢۧۥۡۘۨۖ";
                    break;
                case 1839515019:
                    i4 = getSelectorOffset();
                    str = "ۥ۟۟ۙۗۚ۫ۦۦۛۨۢۨ۫ۦۘ۫ۙۖۢۙۚۡۦۘ";
                    break;
                case 1855241641:
                    return;
            }
        }
    }

    public final void c() {
        String str = "ۤ۬ۜۖۘۙۜ۠ۥۘۧۡ۫۬ۡۘ";
        Bitmap bitmap = null;
        int i2 = 0;
        Paint paint = null;
        while (true) {
            switch ((str.hashCode() ^ 909) ^ -1863061009) {
                case -1409130616:
                    String str2 = "ۜۨۡ۠ۛۖۙ۫ۥۖۛۢۜۖۜۘۙۦۖۘۧ۬ۡ";
                    while (true) {
                        switch (str2.hashCode() ^ 198235350) {
                            case -1070079119:
                                if (this.f996d.getHeight() > 0) {
                                    str2 = "ۡۦۨۗۧ۬ۨۤۖۘ۠ۛۜ۟۟ۗۖۡۢۧۛ۬ۡۡ۫";
                                    break;
                                } else {
                                    str2 = "ۚۙۜۖۢۙ۠ۗ۠ۙۜۖۘۡۖۛۚۥۙۥۡۘۚۡۙۗۨۘ";
                                    break;
                                }
                            case -803249699:
                                str2 = "۠ۚۨۧ۬ۤۦ۠ۤ۠۬ۚۨۗۥۘ۫ۚۥۘ";
                                break;
                            case 182772459:
                                str = "۠ۗۛۜۥۘۤۚۖۘۥۜۧۘۥۨۢ۟۠ۦ";
                                continue;
                            case 951445935:
                                str = "۟۠ۦۘ۬۬۟۟ۥۜۧۙۦۖۦۥۥۙۨ۫ۡۘۧ۫ۧ";
                                continue;
                        }
                    }
                    break;
                case -1388907218:
                case 811490384:
                    return;
                case -1333380004:
                    invalidate();
                    str = "ۘۘۜۘۜۖۖۘۙۥ۫ۨۥۥۙۖۘۘۛۥ۬ۥۤۥۜ۫ۡ۬ۨ";
                    break;
                case -1043887864:
                    this.f999g = true;
                    str = "ۢۗۨۘ۠۠ۗ۫ۦۢۥۧۦۘ۬ۡۜ";
                    break;
                case -323350161:
                    str = "۠۠ۜۘۢۖۛۨۙۚۧۖۧۘۢۥۡۗۡۤ۬ۧۡۘ";
                    bitmap = Bitmap.createBitmap(this.f996d.getWidth(), this.f996d.getHeight(), Bitmap.Config.ARGB_8888);
                    break;
                case -51817010:
                    new Canvas(bitmap).drawRect(0.0f, 0.0f, (float) this.f996d.getWidth(), (float) this.f996d.getHeight(), paint);
                    str = "ۥۦۥۘۧۦۘۘۜۨۤۛۥۘۧۡۡۘۧۛۚ";
                    break;
                case 990584382:
                    paint.setShader(new LinearGradient(0.0f, (float) this.f996d.getHeight(), 0.0f, 0.0f, i2 & ViewCompat.MEASURED_SIZE_MASK, i2 | -16777216, Shader.TileMode.CLAMP));
                    str = "ۚۡ۠ۚۛ۟ۚ۠ۘۘۙۗ۬ۢۛۖ۫ۢۡۖۖۖۘۧۖۧۛ۠ۖۘ";
                    break;
                case 997244366:
                    str = "ۤۖۦۘۚۤۡۘۚ۠ۡۘۗ۬۫۠ۗ۬۟ۜۘۢۢۦۨۖۤ";
                    break;
                case 1104805907:
                    str = "ۤ۠ۜۦۨۦۨۤۛ۫ۚۖۥۢ۫ۢۦۙۖۘۧۢ۟ۙۢۢ";
                    paint = new Paint();
                    break;
                case 1200020686:
                    this.f996d.setImageBitmap(bitmap);
                    str = "ۡۗۗۚۙۥ۫ۙۢ۟ۨۨۚۚۤۜۚۙ۠۫";
                    break;
                case 1273005480:
                    str = "۟ۦۥۘۧۘۖ۟ۢۛۗ۫ۙۛ۟";
                    i2 = this.f998f;
                    break;
            }
        }
    }

    public float getAlpha() {
        String str = "ۙۗۡۢۙۨۘۖ۬ۖۢۜۧۖۡۗۤۜ۠ۛۖۡۛۤۘۤۥۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 112) ^ 1359265671) {
                case -1612799208:
                    str = "ۖۚۖۘۖۢۡۘۙۥۚۖۖۥۜۙۧۡۚۢۖۘۜۚ۫";
                    break;
                case -1249678085:
                    return (float) this.f997e;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        String str = "ۢۡۧ۫ۢۖۛۛۢ۫ۖۢۙۥۖۦۜ۟";
        while (true) {
            switch ((str.hashCode() ^ 879) ^ -2143168394) {
                case -1507583152:
                    String str2 = "۠ۨۢۡۨۢۨ۬ۜۘۤ۠۠۫ۦۘ۠ۤۜۘۗۛۜۘ۫ۜۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1268478140) {
                            case -1849249469:
                                str2 = "ۦۚۘۘۙۘۦۚۖ۠ۨۤۘ۬ۤۢ";
                                break;
                            case 531645133:
                                str = "ۙ۠ۢۢۘۖۘۤۚۘۘۜۤۧۚۧۙۜۜۙۨۡۘ";
                                continue;
                            case 746443014:
                                if (!this.f999g) {
                                    str2 = "۫ۗۥۖۜۦۤۜۙۨۢۙۧۤ۫";
                                    break;
                                } else {
                                    str2 = "ۙ۟ۜۘۤۦۗ۫ۦۜۙ۫ۤۡۢۖۘ";
                                    break;
                                }
                            case 1036746203:
                                str = "ۨۗۚۚۦۘ۬ۢۘۛۦ۬ۧۧۥۦۛۘۛ۟";
                                continue;
                        }
                    }
                    break;
                case -1398083141:
                    this.f999g = false;
                    str = "ۢ۠ۘۘ۬ۦ۟ۗۚۧۘۘۘۙۛۘۜۛۘۘ۬ۖۥۘۖۜۖۢ۫ۜ";
                    break;
                case -762850990:
                    str = "۬ۨۛۚۡۥۤ۟ۨۜ۠ۦۘ۟ۗ۟ۘۤۧۗۚۖۘۚۜۙ";
                    break;
                case -626506203:
                    super.onDraw(canvas);
                    str = "۫ۚ۬۬ۜۤۤۚۛۖۜۖۧ۬ۦۡ۠ۦۘ";
                    break;
                case -541900087:
                    return;
                case -519524509:
                    str = "ۛۛ۠۫ۨۚ۫ۦۖۘۤ۬ۘۨۛۥۜۜ۬ۖۗۚ";
                    break;
                case 1820163715:
                    c();
                    str = "ۙ۠ۢۢۘۖۘۤۚۘۘۜۤۧۚۧۙۜۜۙۨۡۘ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "۠ۚ۬۠ۖۡۘۥۤۚ۫۬ۡۘۜۖۛ";
        while (true) {
            switch ((str.hashCode() ^ 6) ^ 2018223068) {
                case -2146398719:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "۠۠۫۟۫ۨۘۥۛۨۘۚۥ۬ۧۦۤۡۗ۟ۢ۟ۧ";
                    break;
                case -1610894972:
                    return;
                case -262892477:
                    str = "ۡۗۖۘ۠ۙۘۧۢۡۥۚۖۘۗ۬۫ۢۚۨۦۗۖۘۤۡۧ";
                    break;
                case -260535022:
                    str = "ۦۤۙ۟۫ۖۘۧۥۘ۠ۘۦ۬ۨ۬۬ۚۦۘ";
                    break;
                case 696334953:
                    str = "ۢۢۢۧ۠ۥ۬۟ۜۘۥۡ۠ۧ۠ۡۘ";
                    break;
                case 1021926760:
                    b();
                    str = "ۖۡۦۡۖ۠ۧۧۙۙۖ۬ۙۛۘ۫۠۬ۥۛۡۘۤۗۡۘ";
                    break;
                case 1107378173:
                    str = "ۘۡۡۚۖۡۘ۠ۚۖۢ۬ۨۤۥۧۘ۟ۢۨۘ";
                    break;
                case 1459167144:
                    str = "ۡۤ۫ۙۘۘۗۛۢۥ۫ۘ۬۫۬";
                    break;
                case 1917590327:
                    str = "ۢ۬ۡ۠ۤۙۥۜۨ۬ۚۢۖۛۥۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r0 = "ۙۚۚۛۧۜ۬ۘۡۥۦۧۥ۠۫ۖۥۘۘۤۢۦۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r1 = 1
            java.lang.String r0 = "۠ۧۦۘۧۡۘ۠۫ۘۛۦ۠ۖۘۘۥۚۦ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 577(0x241, float:8.09E-43)
            r4 = -236240189(0xfffffffff1eb42c3, float:-2.32991E30)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -2044461907: goto L_0x003d;
                case -2023917339: goto L_0x00c4;
                case -1752653094: goto L_0x0015;
                case -1741534352: goto L_0x004a;
                case -1400857945: goto L_0x0072;
                case -494900998: goto L_0x0048;
                case 162018610: goto L_0x006a;
                case 279706367: goto L_0x00c2;
                case 794354923: goto L_0x0094;
                case 828653578: goto L_0x0012;
                case 1327144496: goto L_0x0018;
                case 1391368921: goto L_0x00b6;
                case 2056364378: goto L_0x0038;
                case 2144291985: goto L_0x0070;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۖۜ۫ۘ۟ۡۡۛۤۗۘۘۘۜۜۖۨۧۜۘ۬ۚ۬ۥ۠ۖ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "۬۠ۡ۟۫ۜۨۨ۬۠ۜۙ۟ۡۨ"
            goto L_0x0003
        L_0x0018:
            r2 = 1039496860(0x3df5769c, float:0.119855136)
            java.lang.String r0 = "ۨۢ۫ۜۤۙۘۖ۠۫ۧۜ۫ۢۦۘۙۘۙۤ۫ۚۡۤۗ"
        L_0x001d:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1729121818: goto L_0x0032;
                case -914273957: goto L_0x00c9;
                case -107195256: goto L_0x0026;
                case 587370575: goto L_0x0035;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "ۗۧۜۘۧۖۡۘ۬۠ۨۧ۬ۥۙۖۥ۬ۡۘۘۥۧۛ"
            goto L_0x001d
        L_0x002f:
            java.lang.String r0 = "ۙۛ۬ۤۚۤۡۦ۟ۤۨۦۘۜۗۡۥ۟ۜۘ۟ۖۘۘ"
            goto L_0x001d
        L_0x0032:
            java.lang.String r0 = "ۘۧۦۘۡۜۡ۟ۖۤ۫۟ۘۚۙۨۚۡ۟ۛۘۜۛۚۘۘ"
            goto L_0x001d
        L_0x0035:
            java.lang.String r0 = "ۘۙ۫۟ۥ۠ۛۨ۟ۡۘۚۚۘۖۘۢ۟ۖ"
            goto L_0x0003
        L_0x0038:
            r5.f1001i = r1
            java.lang.String r0 = "ۘۛۥۨۘۢۗۚ۫ۨۘۚۡ۫ۥۘ"
            goto L_0x0003
        L_0x003d:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.setPosition(r0)
            java.lang.String r0 = "ۢ۟ۘۘ۠۟ۧۘۚۘۡۙۙۢۥۧۖ۟ۨۖۚۤۙۜ۫ۥۖۢ"
            goto L_0x0003
        L_0x0048:
            r0 = r1
        L_0x0049:
            return r0
        L_0x004a:
            r2 = -1310019797(0xffffffffb1eaaf2b, float:-6.8302106E-9)
            java.lang.String r0 = "ۘۙۥۘۤۗۙۘ۬ۚۧۗۤۛۥۘۘ۟ۥۙ۟ۤۧۜۜۗ۠۟ۜۘ"
        L_0x004f:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1754388359: goto L_0x0067;
                case -1211699515: goto L_0x0058;
                case -277585582: goto L_0x005e;
                case 1393088548: goto L_0x00cd;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x004f
        L_0x0058:
            java.lang.String r0 = "ۥۚۘۘۤۦۥۜ۟ۙۜ۬ۙ۠ۛۥۘۦ۬۫ۤ۠ۨۘ۟ۧۚۘۘۖۘ"
            goto L_0x004f
        L_0x005b:
            java.lang.String r0 = "ۚۚ۠۠۫ۖ۫ۗۗۧ۬ۗۚۛ۟ۚۦۧ"
            goto L_0x004f
        L_0x005e:
            int r0 = r6.getAction()
            if (r0 != r1) goto L_0x005b
            java.lang.String r0 = "ۗ۫۠ۘ۫ۖۢۡۥۧ۟۟ۖۜۡۘ۠ۢۥ"
            goto L_0x004f
        L_0x0067:
            java.lang.String r0 = "ۥۙۡۨ۫۫ۖ۬ۡۘۙۡۙ۫۠ۦۘ"
            goto L_0x0003
        L_0x006a:
            r0 = 0
            r5.f1001i = r0
            java.lang.String r0 = "ۦ۬۠ۤۡۖۘۢۢۡۘۗۧۜۘۘۛۖ۟ۗۢ"
            goto L_0x0003
        L_0x0070:
            r0 = r1
            goto L_0x0049
        L_0x0072:
            r2 = -575604876(0xffffffffddb0f774, float:-1.59397355E18)
            java.lang.String r0 = "ۤۜۦۘۖۗ۟ۦۖۧۘۦۚۡ۟ۨۖۘۤۡۥ۬ۜۘ۟۠ۤ"
        L_0x0077:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case 51405188: goto L_0x0090;
                case 404495452: goto L_0x0080;
                case 453108993: goto L_0x008d;
                case 769202932: goto L_0x0086;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0077
        L_0x0080:
            java.lang.String r0 = "ۙۚۚۛۧۜ۬ۘۡۥۦۧۥ۠۫ۖۥۘۘۤۢۦۘ"
            goto L_0x0003
        L_0x0083:
            java.lang.String r0 = "ۥۙ۬ۖۚۛ۠ۡۧۤ۫ۧۢۛۚ"
            goto L_0x0077
        L_0x0086:
            boolean r0 = r5.f1001i
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "۟ۖۚۨۚۜۗۜۡۘۚ۟ۦۘۗ۫۠ۗۜۙۖۨ۬ۙۢۙۘ۫۠"
            goto L_0x0077
        L_0x008d:
            java.lang.String r0 = "ۨۤۡۥۡۦۘ۟۬ۛۦ۟۠ۨۗۘۘ۬۠۟"
            goto L_0x0077
        L_0x0090:
            java.lang.String r0 = "ۘۥۨۘۙۦۥۘۡۧ۫ۘ۠ۤۤ۠ۦ۟"
            goto L_0x0003
        L_0x0094:
            r2 = 2014502331(0x7812ddbb, float:1.1915196E34)
            java.lang.String r0 = "ۛ۟ۦۘ۟ۖۦ۠ۢۡۘۢۘ۫ۗۖۢ"
        L_0x0099:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1449654597: goto L_0x00a2;
                case -1001974464: goto L_0x00af;
                case 664879667: goto L_0x00b2;
                case 1634973325: goto L_0x0080;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x0099
        L_0x00a2:
            int r0 = r6.getAction()
            r3 = 2
            if (r0 != r3) goto L_0x00ac
            java.lang.String r0 = "۠ۗۤۚۚۙۡۦۥ۟ۧۡۘ۫۟ۤۜۡۢۢۜۗۘۖۘۘ"
            goto L_0x0099
        L_0x00ac:
            java.lang.String r0 = "ۙۢۘۘۘ۬ۘۚۚ۫ۤۢۜۘۦ۫ۖۢۡۦۥۧۘ"
            goto L_0x0099
        L_0x00af:
            java.lang.String r0 = "ۙۦۙۛۗۚ۠ۧۚۢۛۘۘۛۖۡۘۙۥۨۘ"
            goto L_0x0099
        L_0x00b2:
            java.lang.String r0 = "ۨ۠ۚۛۛۨۜۦۨۦۢۦۘ۠ۘۧۘۧۘۜۘ۠۟ۙ۟ۖۥۡ۬"
            goto L_0x0003
        L_0x00b6:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.setPosition(r0)
            java.lang.String r0 = "ۥۢۙۗۤ۬ۜۢۥۘۙۡۢ۬ۢۛۦۜ"
            goto L_0x0003
        L_0x00c2:
            r0 = r1
            goto L_0x0049
        L_0x00c4:
            boolean r0 = super.onTouchEvent(r6)
            goto L_0x0049
        L_0x00c9:
            java.lang.String r0 = "ۖۖۘۥۡۙۤۖۘۘۨۜۘۨۘۘۘۜۘۧۘۦۖۧۢۚۖۦۧۤ"
            goto L_0x0003
        L_0x00cd:
            java.lang.String r0 = "ۙۖۜۘۡۜۜۘۨۙۢ۫ۡۖ۫ۖۥۖۦۥۘۖۦۡۘ"
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HsvAlphaSelectorView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAlpha(int i2) {
        String str = "ۜۡۘۘ۠ۧۘۘۛۢۜۘۦۘۢۢ۟ۙ";
        while (true) {
            switch ((str.hashCode() ^ 100) ^ -1711311809) {
                case -1991858822:
                case 586820908:
                    return;
                case -1741965363:
                    b();
                    str = "ۨۚۗۡۖۦۘۙۛۡۖۨۘ۠ۘۢۡ۫ۤۢ۠";
                    break;
                case 788200094:
                    str = "ۖ۫ۥۘۖۧۥۘۚ۠ۜۘۛ۟۠ۢۘۙۢۦۘۘۡ۫";
                    break;
                case 954854368:
                    str = "۠ۘۨ۠ۛۤ۫ۗۗۢ۠ۦۘۧۘۦۘ";
                    break;
                case 1894096888:
                    String str2 = "۫ۥۜۘۙۧۥۘۜۚۖۘۚۢۥۤ۠۫۬ۛۗۘ۠ۥ۟ۤ۬";
                    while (true) {
                        switch (str2.hashCode() ^ -923922188) {
                            case -2003098145:
                                str2 = "ۦۗۢۙۢۨۗۗۜۘ۟ۛۦۘۨۚۘۘۙۖۚۘۖۨۘۜۙۜ";
                                break;
                            case -1719217302:
                                str = "ۙ۬ۦۘ۠ۚ۠۠ۢ۟ۤۨ۫ۖۤ۫ۖۤۡۦۘۖۘۨۤۨ";
                                continue;
                            case 23967783:
                                str = "ۦۙۡۘۙ۠ۜۡ۫ۙۗۚۛۧۙۗۛۧۧۧۛ";
                                continue;
                            case 1621815229:
                                if (this.f997e != i2) {
                                    str2 = "ۦۘ۠۠ۡۘ۫ۖۨۘۧۧۡۘۦۧۡۘ";
                                    break;
                                } else {
                                    str2 = "ۥۤۢۢۤۨ۬ۨۡۘ۫ۖۡۢۛۜ۬ۙۨۤۜۨۤۦۘۡۙۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case 2120245157:
                    this.f997e = i2;
                    str = "ۧۙۥۘ۟۬ۘۨۢۙۢۛۦۛۢ۬ۙۛۥ۬ۦۢ";
                    break;
            }
        }
    }

    public void setColor(int i2) {
        String str = "ۘۦ۬ۛۜۥۘۥۖۢۖۦۥۘ۫ۘۦۘۢۡۘۥۤۡۘ۫ۢ۬ۨ۠ۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 677) ^ 745723220) {
                case -1136157846:
                case 722189802:
                    return;
                case -1062810041:
                    str = "ۡ۟ۥۘۘۘۡۜۛۘۘۡۤ۟ۡۗۤۧۗۥۘ";
                    break;
                case -1012496924:
                    this.f998f = i2;
                    str = "ۛۛۛۧ۟ۨۘ۟ۗۗۨۘۘ۫ۚۦۖۢۘۘ";
                    break;
                case 242454470:
                    c();
                    str = "ۡۛۘۘ۟ۧۡۧ۠ۤۨ۠ۙۡ۫ۚ";
                    break;
                case 362227093:
                    String str2 = "ۨ۫ۜۦۙۥۥۘۧۘۧۤۗۦۗۦۨۗۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 848435803) {
                            case -1177186686:
                                str = "ۡۙ۬ۢۚۨۛۜۢ۫ۨۚۚۘ۠ۙۙ۫ۗۛۜۘۢۜۥ۫ۢۖ";
                                continue;
                            case -1012176080:
                                str = "ۗۦۖۘ۠۬ۡۘۥۧۨۜ۫ۨۤ۠ۡۖۚۢۘۚۤۧ۠";
                                continue;
                            case -911050656:
                                if (this.f998f != i2) {
                                    str2 = "ۘ۬۠۟۫۠ۡ۟ۨۥۤۙۚۙۖۘ۟ۛ۟ۡۘۦ۠ۥۛۜۤ";
                                    break;
                                } else {
                                    str2 = "ۚۤ۬ۨۘۛۢۙۖ۠ۗۥۗ۠ۜۡۗۦ۠ۢۥ";
                                    break;
                                }
                            case 1368214069:
                                str2 = "ۙۗ۬ۙۥۖۘۜۡۥ۟ۙۘۥۢ۟ۙۙ۬۬۟ۢ";
                                break;
                        }
                    }
                    break;
                case 1849385262:
                    str = "ۖۨۢ۠۟ۖۙۦ۫ۨۖۘۘۨۜۘۤ۟ۘۖ۟۠۟ۢ۬ۚ۫ۗ";
                    break;
            }
        }
    }

    public void setMaxHeight(int i2) {
        String str = "ۥ۟۫ۚۢ۫ۖۦۘۤۦۛ۫۫ۙۜ۟ۨۘۥۛۚ";
        while (true) {
            switch ((str.hashCode() ^ 917) ^ -1986258422) {
                case -212323068:
                    str = "۟ۛۨ۠ۤۦۤۡۖۘۤۥۖ۫۠ۥۘۖ۠ۖۘۤۡۡ";
                    break;
                case 638751723:
                    return;
                case 1142751311:
                    str = "ۜ۠ۖۘۚۘۥ۠ۦۗۙ۫ۦ۠ۜۚۙ۫ۖۗ۠۟";
                    break;
                case 2062667059:
                    this.f996d.getLayoutParams().height = i2 - this.f994b.getMeasuredHeight();
                    str = "ۗ۠ۘ۬ۧۢۥۛۜۧۚۖۜۜۜۘ۫ۗۨ۬۟ۥۚۗۘ۬۬";
                    break;
            }
        }
    }

    public void setMinContentOffset(int i2) {
        LinearLayout.LayoutParams layoutParams = null;
        String str = "ۖۢ۠ۨ۠ۥ۫ۨۘۘۤۨۧۘۗ۟ۢ۠ۢ۟";
        while (true) {
            switch ((str.hashCode() ^ 410) ^ -476736789) {
                case -2145597454:
                    this.f995c = i2;
                    str = "ۡۤۖۧۥۚۗۚۡ۫ۥۙ۟ۙۗۧ۟";
                    break;
                case -2107389352:
                    return;
                case -413318814:
                    this.f996d.setLayoutParams(layoutParams);
                    str = "ۚۜۜۘۚۜۘۘ۬ۘ۟ۖۤۛۚ۟ۘۘۤۡۘۘۙۙ۠۠ۚۧ";
                    break;
                case -99760102:
                    layoutParams = new LinearLayout.LayoutParams(this.f996d.getLayoutParams());
                    str = "ۛ۬ۜۤۖۧۘۥۘۚۙ۫۠ۖۢۗۗۥۜۘۖۢۜۘ";
                    break;
                case 659024153:
                    layoutParams.setMargins(0, getOffset(), 0, getSelectorOffset());
                    str = "ۧ۫ۥۘۡۡۘ۠ۧۥۘ۫ۗۜۥۡۘۚ";
                    break;
                case 695920550:
                    str = "ۖۤ۫۬ۚۧۗ۫ۘۡۗۜۢۨۡۧ۫ۨۡ۫ۗۦۙ۫ۥۘۨ";
                    break;
                case 1946058527:
                    str = "ۖۛۙۤۙۗۙ۟ۘۨۘۜ۠ۖۡۖۚۛۡ۟ۤۢۢۦۗۢۖ";
                    break;
            }
        }
    }

    public void setOnAlphaChangedListener(OnAlphaChangedListener onAlphaChangedListener) {
        String str = "ۖۗۥ۟۠۫ۡ۬ۘۜۢۜۘۘۨۙ";
        while (true) {
            switch ((str.hashCode() ^ 877) ^ 562709759) {
                case -562061977:
                    this.f1000h = onAlphaChangedListener;
                    str = "ۚ۬ۦۘۙۤۨۡۡ۠ۨۧۤۨۤۢۘ۠";
                    break;
                case 200465858:
                    return;
                case 486716114:
                    str = "۬ۗۜۘۨۡۧۘۤۛۧۙ۠ۢۙۦۜ";
                    break;
                case 718412417:
                    str = "ۙ۟ۘ۬ۢۖۘۗۤۖۘۦۖۧۘ۠۬ۤۧ۠۬";
                    break;
            }
        }
    }
}
