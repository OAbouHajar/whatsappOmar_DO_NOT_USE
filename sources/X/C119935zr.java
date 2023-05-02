package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape134S0100000_3_I0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5zr  reason: invalid class name and case insensitive filesystem */
public class C119935zr implements AnonymousClass1JW {
    public final C17100uX A00;
    public final C14870pt A01;
    public final C118305uT A02;
    public final AnonymousClass5wS A03;
    public final C117875th A04;
    public final AnonymousClass01V A05;
    public final AnonymousClass013 A06;
    public final C23061Ai A07;
    public final AnonymousClass01D A08;

    public C119935zr(C17100uX r1, C14870pt r2, C118305uT r3, AnonymousClass5wS r4, C117875th r5, AnonymousClass01V r6, AnonymousClass013 r7, C23061Ai r8, AnonymousClass01D r9) {
        this.A01 = r2;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static void A00(AnonymousClass4KC r7, float f2, float f3, float f4) {
        if (r7 != null) {
            double d2 = (double) f4;
            BigDecimal bigDecimal = new BigDecimal(((double) Math.round(((double) f2) / d2)) * d2);
            BigDecimal bigDecimal2 = new BigDecimal(((double) Math.round(((double) f3) / d2)) * d2);
            float floatValue = bigDecimal.floatValue();
            float floatValue2 = bigDecimal2.floatValue();
            C31201dg r5 = r7.A01;
            C14930q1 r4 = r7.A02;
            C14990q7 r3 = r7.A00;
            C14940q2 r2 = new C14940q2();
            r2.A03(C89554cQ.A00((double) floatValue), 0);
            r2.A03(C89554cQ.A00((double) floatValue2), 1);
            C29701b3.A01(r3, r5, r2.A01(), r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5V(android.content.Context r5, android.view.View r6, X.AnonymousClass04N r7, X.AnonymousClass04N r8, X.AnonymousClass04N r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, boolean r16) {
        /*
            r4 = this;
            android.app.Activity r0 = X.C19980zJ.A00(r5)
            android.view.Window r1 = r0.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            r0 = 2131362770(0x7f0a03d2, float:1.834533E38)
            android.view.View r3 = r6.findViewById(r0)
            com.obwhatsapp.CodeInputField r3 = (com.obwhatsapp.CodeInputField) r3
            if (r3 != 0) goto L_0x004a
            r2 = 0
            if (r12 == 0) goto L_0x0026
            java.lang.String r0 = "fb_pay"
            boolean r1 = r12.equals(r0)
            r0 = 2131558665(0x7f0d0109, float:1.8742652E38)
            if (r1 != 0) goto L_0x0029
        L_0x0026:
            r0 = 2131558664(0x7f0d0108, float:1.874265E38)
        L_0x0029:
            android.view.View r3 = android.view.View.inflate(r5, r0, r2)
            com.obwhatsapp.CodeInputField r3 = (com.obwhatsapp.CodeInputField) r3
            X.5yf r0 = new X.5yf
            r0.<init>(r4)
            r3.setCustomSelectionActionModeCallback(r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.addView(r3)
            X.5zW r1 = new X.5zW
            r1.<init>(r8, r9)
            if (r11 == 0) goto L_0x00b9
            int r0 = r11.intValue()
            r3.A07(r1, r15, r0)
        L_0x004a:
            if (r10 == 0) goto L_0x0053
            int r0 = r10.intValue()
            r3.setGravity(r0)
        L_0x0053:
            r2 = 0
            if (r14 == 0) goto L_0x00b5
            java.lang.String r0 = "error"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00b5
            r0 = 1
            r3.setErrorState(r0)
            r3.A05()
            java.lang.String r0 = "no_error"
            r7.accept(r0)
            X.3CR r0 = r3.A04
            r3.removeTextChangedListener(r0)
            X.5zW r1 = new X.5zW
            r1.<init>(r8, r9)
            if (r11 == 0) goto L_0x00b1
            int r0 = r11.intValue()
            r3.A07(r1, r15, r0)
        L_0x007d:
            r1 = r16
            r3.setEnabled(r1)
            r3.setCursorVisible(r2)
            if (r14 != 0) goto L_0x0096
            if (r13 == 0) goto L_0x0096
            java.lang.String r0 = r3.getCode()
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0096
            r3.setCode(r13)
        L_0x0096:
            if (r16 == 0) goto L_0x00bd
            r3.requestFocus()
            java.lang.Object r2 = r3.getTag()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L_0x00ab
            X.65B r2 = new X.65B
            r2.<init>(r3, r4)
            r3.setTag(r2)
        L_0x00ab:
            r0 = 0
            r3.postDelayed(r2, r0)
            return
        L_0x00b1:
            r3.A06(r1, r15)
            goto L_0x007d
        L_0x00b5:
            r3.setErrorState(r2)
            goto L_0x007d
        L_0x00b9:
            r3.A06(r1, r15)
            goto L_0x004a
        L_0x00bd:
            r3.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119935zr.A5V(android.content.Context, android.view.View, X.04N, X.04N, X.04N, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    public void A5X(Context context, View view, AnonymousClass4KB r16, String str, String str2, String str3, int i2, boolean z2) {
        Long l2;
        TextView A0L = C13680ns.A0L(view, R.id.hintOrDate);
        TextInputLayout textInputLayout = (TextInputLayout) C004601z.A0E(view, R.id.inputView);
        String str4 = str;
        if (str != null) {
            textInputLayout.setHint(str4);
        }
        Calendar instance = Calendar.getInstance();
        if (!TextUtils.isEmpty(str2)) {
            Date A002 = C119055vq.A00(str2);
            if (A002 != null) {
                AnonymousClass00B.A06(A002);
                A0L.setText(DateFormat.getDateInstance(1).format(A002));
                instance.setTime(A002);
            }
        } else if (i2 != 0) {
            instance.set(1, instance.get(1) + i2);
        }
        C119445xt r8 = new C119445xt(r16);
        boolean z3 = z2;
        A0L.setEnabled(z3);
        A0L.setClickable(z3);
        String str5 = str3;
        try {
            l2 = Long.valueOf(Long.parseLong(str5));
        } catch (NumberFormatException unused) {
            Log.e(AnonymousClass000.A0h(str5, AnonymousClass000.A0r("WaBkComponentConfiguratorImpl/WaDatePicker/bind Max date is not a valid date format")));
            l2 = null;
        }
        if (z2) {
            C110505eJ r7 = new C110505eJ(r8, context, instance.get(1), instance.get(2), instance.get(5));
            if (l2 != null) {
                r7.A01.setMaxDate(l2.longValue());
            }
            A0L.setOnClickListener(new IDxCListenerShape134S0100000_3_I0(r7, 0));
            return;
        }
        A0L.setOnClickListener((View.OnClickListener) null);
    }

    public void A5Y(ImageView imageView, C12380kI r19, C12380kI r20, Object obj, String str, String str2, String str3, String str4) {
        File A002;
        String str5 = str;
        String str6 = str2;
        ImageView imageView2 = imageView;
        C12380kI r5 = r19;
        C12380kI r4 = r20;
        String str7 = str3;
        if (!TextUtils.isEmpty(str5)) {
            AnonymousClass5wS r6 = this.A03;
            C118305uT r2 = this.A02;
            if (!TextUtils.isEmpty(str6)) {
                String str8 = str6;
                if (str3 != null && AnonymousClass000.A1X(r5.get())) {
                    str8 = str7;
                }
                r6.A00(new C119845zi(imageView2, r4), str8);
            }
            r2.A00().A00((Drawable) null, (Drawable) null, imageView2, new C1205462b(imageView2, r4, r5, r6, str6, str7, new WeakReference(imageView2), new WeakReference(obj)), str5);
        } else if (!TextUtils.isEmpty(str6)) {
            AnonymousClass5wS r1 = this.A03;
            if (str3 != null && AnonymousClass000.A1X(r5.get())) {
                str6 = str7;
            }
            r1.A00(new C119845zi(imageView2, r4), str6);
        } else {
            String str9 = str4;
            if (!TextUtils.isEmpty(str9) && (A002 = this.A04.A00(str9)) != null) {
                imageView2.setImageBitmap(BitmapFactory.decodeFile(A002.getAbsolutePath()));
            }
        }
    }

    public void A5Z(Context context, View view, AnonymousClass04N r21, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, boolean z2, boolean z3) {
        View view2 = view;
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(view2, R.id.recycler_view);
        view2.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.A0h = true;
        String str9 = str;
        try {
            AnonymousClass04N r5 = r21;
            recyclerView.setAdapter(new C110825et(LayoutInflater.from(context), r5, this.A02.A00(), str2, str3, str4, str5, str6, str7, str8, new JSONArray(str9), i2, z2, z3));
        } catch (JSONException unused) {
            Log.e(AnonymousClass000.A0h(str9, AnonymousClass000.A0r("WaBkComponentConfiguratorImpl/bindView data source is not a valid JSON: ")));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r2 != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5a(android.view.View r5, X.AnonymousClass4KC r6, float r7, int r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            r0 = 2131362296(0x7f0a01f8, float:1.8344369E38)
            android.view.View r3 = X.C004601z.A0E(r5, r0)
            com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r3 = (com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r3
            float r2 = (float) r8
            float r1 = (float) r9
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r3.A01 = r2
            r3.A00 = r1
            float r0 = r3.A03
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002a
            float r0 = r3.A02
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002a
            r3.A03 = r2
            r3.A02 = r1
            r3.A02()
        L_0x002a:
            r2 = 0
            float r0 = r3.A03
            float r1 = r3.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r3.A03 = r1
            r2 = 1
        L_0x0036:
            float r0 = r3.A02
            float r1 = r3.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            r3.A02 = r1
        L_0x0040:
            r3.invalidate()
            r3.A02()
        L_0x0046:
            float r2 = (float) r10
            float r1 = (float) r11
            float r0 = r3.A01
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0062
            float r0 = r3.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0062
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0062
            r3.A03 = r2
            r3.A02 = r1
            r3.invalidate()
            r3.A02()
        L_0x0062:
            X.600 r0 = new X.600
            r0.<init>(r6, r7)
            r3.A0D = r0
            return
        L_0x006a:
            if (r2 == 0) goto L_0x0046
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119935zr.A5a(android.view.View, X.4KC, float, int, int, int, int):void");
    }

    public void A5b(View view, String str, boolean z2) {
        int i2;
        File A002;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C004601z.A0E(view, R.id.video_view);
        View A0E = C004601z.A0E(view, R.id.loading_progress);
        View A0E2 = C004601z.A0E(view, R.id.play_button);
        String str2 = null;
        if (!TextUtils.isEmpty(str) && (A002 = this.A04.A00(str)) != null) {
            str2 = A002.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(str2)) {
            videoSurfaceView.setVideoPath(str2);
        }
        videoSurfaceView.A0B = new AnonymousClass5yT(A0E);
        videoSurfaceView.A09 = new AnonymousClass5yS(A0E2);
        A0E2.setOnClickListener(new C119585yi(A0E2, videoSurfaceView));
        if (z2) {
            videoSurfaceView.start();
            i2 = 8;
        } else {
            i2 = 0;
        }
        A0E2.setVisibility(i2);
    }

    public void A87(ImageView imageView, C88024Zp r3, String str, String str2) {
        ((C118355uY) this.A08.get()).A00(imageView, r3, str, str2);
    }

    public Spannable ACP(Context context, Context context2, AnonymousClass04N r15, String str, List list, List list2, List list3, List list4) {
        SpannableStringBuilder spannableStringBuilder;
        String str2 = str;
        if (str == null) {
            return null;
        }
        Iterator it = C39791t4.A01.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (str2.contains(AnonymousClass000.A0m(it))) {
                    spannableStringBuilder = new SpannableStringBuilder(C39791t4.A00(context, str2));
                    break;
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                break;
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                JSONObject A0K = C13700nu.A0K(AnonymousClass000.A0m(it2));
                int i2 = A0K.getInt("offset");
                int i3 = A0K.getInt("length");
                String str3 = "inline_style";
                if (!A0K.has(str3)) {
                    str3 = "style";
                }
                String string = A0K.getString(str3);
                switch (string.hashCode()) {
                    case -2125451728:
                        if (!string.equals("ITALIC")) {
                            break;
                        } else {
                            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3 + i2, 0);
                            break;
                        }
                    case 2044549:
                        if (!string.equals("BOLD")) {
                            break;
                        } else {
                            spannableStringBuilder.setSpan(new StyleSpan(1), i2, i3 + i2, 0);
                            break;
                        }
                    case 1759631020:
                        if (!string.equals("UNDERLINE")) {
                            break;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3 + i2, 0);
                            break;
                        }
                    case 2143721139:
                        if (!string.equals("STRIKETHROUGH")) {
                            break;
                        } else {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3 + i2, 0);
                            break;
                        }
                }
            }
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                JSONObject A0K2 = C13700nu.A0K(AnonymousClass000.A0m(it3));
                int i4 = A0K2.getInt("offset");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(A0K2.has("hex_rgb_color_with_pound_key") ? Color.parseColor(A0K2.getString("hex_rgb_color_with_pound_key")) : A0K2.getInt("color")), i4, A0K2.getInt("length") + i4, 0);
            }
        }
        if (list3 != null) {
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                C117005sI r2 = new C117005sI(C13700nu.A0K(AnonymousClass000.A0m(it4)));
                C59142uk r6 = new C59142uk(context2, this.A00, this.A01, this.A05, r2.A02);
                r6.A02 = new AnonymousClass5zY(r15, r2);
                int i5 = r2.A01;
                spannableStringBuilder.setSpan(r6, i5, r2.A00 + i5, 0);
            }
        }
        if (list4 == null) {
            return spannableStringBuilder;
        }
        Iterator it5 = list4.iterator();
        while (it5.hasNext()) {
            JSONObject A0K3 = C13700nu.A0K(AnonymousClass000.A0m(it5));
            int i6 = A0K3.getInt("offset");
            spannableStringBuilder.setSpan(new RelativeSizeSpan((float) A0K3.getDouble("scale")), i6, A0K3.getInt("length") + i6, 0);
        }
        return spannableStringBuilder;
    }

    public TextWatcher ADL(TextInputEditText textInputEditText, Integer num, String str, String str2) {
        if ((num.intValue() & 2) != 2) {
            return new C119545ye(textInputEditText, str);
        }
        if (str == null) {
            str = str2;
        }
        return new C111605h3(textInputEditText, str);
    }

    public InputFilter ADx() {
        return new C119515yb();
    }

    public CharacterStyle AH2(Runnable runnable, int i2, int i3, int i4) {
        return new C111275fe(runnable, i2);
    }

    public Locale AH6() {
        return C13690nt.A0m(this.A06);
    }

    public void Aez(View view, long j2) {
        C13680ns.A0L(view, R.id.timer_text).setText(C28961Zl.A04(this.A06, j2));
    }

    public void AgT() {
        C41631wI.A02(this.A05);
    }

    public void Ah8(View view) {
        C13680ns.A0L(view, R.id.start_message).setText("");
        C13680ns.A0L(view, R.id.timer_text).setText("");
    }

    public void Ah9(View view) {
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C004601z.A0E(view, R.id.video_view);
        videoSurfaceView.A00();
        MediaPlayer mediaPlayer = videoSurfaceView.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            videoSurfaceView.A0C.release();
            videoSurfaceView.A0C = null;
            videoSurfaceView.A02 = 0;
        }
    }
}
