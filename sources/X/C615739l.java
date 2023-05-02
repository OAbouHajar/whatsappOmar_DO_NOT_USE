package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape3S0400000_I1;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.audiopicker.AudioPickerActivity;
import com.obwhatsapp.components.SelectionCheckView;
import java.io.File;
import java.util.LinkedHashMap;

/* renamed from: X.39l  reason: invalid class name and case insensitive filesystem */
public class C615739l {
    public final int A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageButton A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final CircularProgressBar A0A;
    public final SelectionCheckView A0B;
    public final /* synthetic */ AudioPickerActivity A0C;

    public C615739l(View view, AudioPickerActivity audioPickerActivity, int i2) {
        this.A0C = audioPickerActivity;
        this.A00 = i2;
        this.A02 = view;
        this.A03 = (FrameLayout) view.findViewById(R.id.audio_file_thumb_frame);
        this.A05 = C13680ns.A0K(view, R.id.audio_file_thumb);
        this.A0B = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A09 = C13680ns.A0M(view, R.id.audio_file_title);
        this.A06 = C13680ns.A0M(view, R.id.audio_file_artist);
        this.A07 = C13680ns.A0M(view, R.id.audio_file_duration);
        this.A08 = C13680ns.A0M(view, R.id.audio_file_size);
        this.A01 = view.findViewById(R.id.bullet_duration_size);
        this.A04 = (ImageButton) view.findViewById(R.id.audio_file_play_btn);
        this.A0A = (CircularProgressBar) view.findViewById(R.id.progress_bar);
    }

    public final void A00(Context context) {
        ImageButton imageButton = this.A04;
        AudioPickerActivity audioPickerActivity = this.A0C;
        C13680ns.A0t(audioPickerActivity, imageButton, R.string.str0f30);
        imageButton.setBackground((Drawable) null);
        C447725m.A01(context, imageButton, audioPickerActivity.A01, R.drawable.pause);
        AnonymousClass2SR.A07(audioPickerActivity, imageButton, R.color.color0063);
        this.A0A.setVisibility(0);
    }

    public final void A01(Context context, boolean z2) {
        CircularProgressBar circularProgressBar;
        int i2;
        ImageButton imageButton = this.A04;
        AudioPickerActivity audioPickerActivity = this.A0C;
        C13680ns.A0t(audioPickerActivity, imageButton, R.string.str1d62);
        if (z2) {
            imageButton.setBackground(C447725m.A00(context, audioPickerActivity.A01, R.drawable.audio_picker_row_start_button_background));
            C447725m.A01(context, imageButton, audioPickerActivity.A01, R.drawable.play_button_audio);
            AnonymousClass2SR.A07(audioPickerActivity, imageButton, R.color.color005d);
            circularProgressBar = this.A0A;
            i2 = 8;
        } else {
            imageButton.setBackground((Drawable) null);
            C447725m.A01(context, imageButton, audioPickerActivity.A01, R.drawable.toggle_play);
            AnonymousClass2SR.A07(audioPickerActivity, imageButton, R.color.color0063);
            circularProgressBar = this.A0A;
            i2 = 0;
        }
        circularProgressBar.setVisibility(i2);
    }

    public final void A02(View view) {
        String A0J;
        C14870pt r8;
        String string;
        AudioPickerActivity audioPickerActivity = this.A0C;
        C64303Np r1 = audioPickerActivity.A09;
        AnonymousClass38M A002 = r1.A00((Cursor) r1.getItem(this.A00));
        if (A002 != null) {
            C14710pd r12 = audioPickerActivity.A0C;
            C16620tM r2 = C16620tM.A02;
            int A032 = r12.A03(r2, 2614);
            if (audioPickerActivity.A0O.size() >= A032) {
                A032 = audioPickerActivity.A0C.A03(r2, 2693);
            }
            LinkedHashMap linkedHashMap = audioPickerActivity.A0O;
            if (linkedHashMap.size() < A032 || linkedHashMap.containsKey(Integer.valueOf(A002.A00))) {
                long j2 = (long) A002.A01;
                C15900s5 r0 = audioPickerActivity.A06;
                C16520tC r9 = C15910s6.A1f;
                if (j2 >= ((long) r0.A02(r9)) * SearchActionVerificationClientService.MS_TO_NS) {
                    r8 = audioPickerActivity.A05;
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, audioPickerActivity.A06.A02(r9), 0);
                    string = audioPickerActivity.getString(R.string.str0cc4, objArr);
                } else {
                    int i2 = A002.A00;
                    LinkedHashMap linkedHashMap2 = audioPickerActivity.A0O;
                    Integer valueOf = Integer.valueOf(i2);
                    boolean containsKey = linkedHashMap2.containsKey(valueOf);
                    A04(A002, !containsKey);
                    LinkedHashMap linkedHashMap3 = audioPickerActivity.A0O;
                    if (containsKey) {
                        linkedHashMap3.remove(valueOf);
                        view.setSelected(false);
                        view.setBackgroundResource(0);
                        ((SelectionCheckView) view.findViewById(R.id.selection_check)).A04(false, true);
                    } else {
                        linkedHashMap3.put(valueOf, A002);
                        view.setSelected(true);
                        view.setBackgroundResource(R.color.color005e);
                        ((SelectionCheckView) view.findViewById(R.id.selection_check)).A04(true, true);
                    }
                    int size = audioPickerActivity.A0O.size();
                    ImageButton imageButton = audioPickerActivity.A03;
                    if (size == 0) {
                        AnonymousClass4Y7.A01(imageButton, false, true);
                        A0J = audioPickerActivity.getString(R.string.str178a);
                    } else {
                        AnonymousClass4Y7.A01(imageButton, true, true);
                        Object[] objArr2 = new Object[1];
                        AnonymousClass000.A1M(objArr2, size, 0);
                        A0J = audioPickerActivity.A01.A0J(objArr2, R.plurals.plurals00e2, (long) size);
                    }
                    C005402i x2 = audioPickerActivity.x();
                    AnonymousClass00B.A07(x2, "supportActionBar is null");
                    x2.A0I(A0J);
                    return;
                }
            } else {
                r8 = audioPickerActivity.A05;
                Object[] objArr3 = new Object[1];
                AnonymousClass000.A1M(objArr3, A032, 0);
                string = audioPickerActivity.A01.A0J(objArr3, R.plurals.plurals00ce, (long) A032);
            }
            r8.A0H(string, 0);
        }
    }

    public void A03(C14550pN r22, AnonymousClass38M r23) {
        long A032;
        TextView textView;
        float f2;
        View view = this.A02;
        C13680ns.A1A(view, this, 16);
        C13700nu.A0S(view, this, 2);
        AnonymousClass38M r9 = r23;
        String str = r9.A03;
        File file = null;
        if (str != null) {
            file = C13700nu.A0D(str);
        }
        int i2 = r9.A00;
        int i3 = i2;
        C102094yO r2 = new C102094yO(this, (long) i2);
        C102154yU r1 = new C102154yU(this);
        AudioPickerActivity audioPickerActivity = this.A0C;
        audioPickerActivity.A0I.A02(r2, r1);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A05.setClipToOutline(true);
        }
        this.A05.setScaleType(ImageView.ScaleType.CENTER_CROP);
        TextView textView2 = this.A09;
        C14550pN r10 = r22;
        textView2.setText(AnonymousClass2TP.A02(r10, audioPickerActivity.A01, r9.A07, audioPickerActivity.A0N));
        String str2 = r9.A02;
        TextView textView3 = this.A06;
        if (str2 != null) {
            textView3.setVisibility(0);
            textView3.setText(AnonymousClass2TP.A02(r10, audioPickerActivity.A01, str2, audioPickerActivity.A0N));
        } else {
            textView3.setVisibility(8);
        }
        String str3 = r9.A05;
        boolean isEmpty = str3.isEmpty();
        TextView textView4 = this.A07;
        if (!isEmpty) {
            textView4.setVisibility(0);
            textView4.setText(str3);
        } else {
            textView4.setVisibility(8);
        }
        String str4 = r9.A06;
        boolean isEmpty2 = str4.isEmpty();
        if (!isEmpty2) {
            if (((long) r9.A01) >= ((long) audioPickerActivity.A06.A02(C15910s6.A1f)) * SearchActionVerificationClientService.MS_TO_NS) {
                SpannableString spannableString = new SpannableString(str4);
                spannableString.setSpan(new ForegroundColorSpan(-65536), 0, str4.length(), 33);
                textView = this.A08;
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                f2 = 0.5f;
            } else {
                textView = this.A08;
                textView.setText(str4);
                f2 = 1.0f;
            }
            textView2.setAlpha(f2);
            textView.setVisibility(0);
        } else {
            this.A08.setVisibility(8);
        }
        if (isEmpty || isEmpty2) {
            this.A01.setVisibility(8);
        } else {
            this.A01.setVisibility(0);
        }
        boolean containsKey = audioPickerActivity.A0O.containsKey(Integer.valueOf(i3));
        if (containsKey) {
            view.setSelected(true);
            view.setBackgroundResource(R.color.color005e);
            SelectionCheckView selectionCheckView = this.A0B;
            selectionCheckView.setVisibility(0);
            selectionCheckView.A04(true, false);
        } else {
            view.setBackgroundResource(0);
            SelectionCheckView selectionCheckView2 = this.A0B;
            selectionCheckView2.A04(false, false);
            selectionCheckView2.setVisibility(4);
        }
        A04(r9, containsKey);
        CircularProgressBar circularProgressBar = this.A0A;
        circularProgressBar.A0B = AnonymousClass00T.A00(r10, R.color.color0061);
        circularProgressBar.A0C = AnonymousClass00T.A00(r10, R.color.color0062);
        circularProgressBar.A05 = 0.1f;
        circularProgressBar.A06 = 10.0f;
        circularProgressBar.setIndeterminate(false);
        C38701rH r24 = new C38701rH(new C28381Vw((C15830rv) null, Integer.toString(i3), true), 0);
        r24.A08 = 2;
        C16750ta r0 = new C16750ta();
        r0.A0F = file;
        r24.A02 = r0;
        if (!audioPickerActivity.A0G.A0D(r24)) {
            A01(r10, true);
            circularProgressBar.setMax(r24.A00 * 1000);
            circularProgressBar.setProgress(0);
            A032 = 0;
        } else {
            AnonymousClass2DT A002 = audioPickerActivity.A0G.A00();
            if (A002 != null) {
                circularProgressBar.setMax(A002.A03);
                if (A002.A0J()) {
                    A00(r10);
                } else if (A002.A03() > 0) {
                    A01(r10, false);
                } else {
                    A01(r10, true);
                    circularProgressBar.setProgress(0);
                    circularProgressBar.setMax(A002.A03);
                    A002.A0K = new AnonymousClass3FO(r10, this, A002, r24);
                    A032 = (long) A002.A03();
                }
                circularProgressBar.setProgress(A002.A03());
                circularProgressBar.setMax(A002.A03);
                A002.A0K = new AnonymousClass3FO(r10, this, A002, r24);
                A032 = (long) A002.A03();
            }
            this.A04.setOnClickListener(new ViewOnClickCListenerShape3S0400000_I1(this, r24, r9, r10, 0));
        }
        circularProgressBar.setContentDescription(C13680ns.A0d(audioPickerActivity, C28961Zl.A06(audioPickerActivity.A01, A032), new Object[1], 0, R.string.str1a50));
        this.A04.setOnClickListener(new ViewOnClickCListenerShape3S0400000_I1(this, r24, r9, r10, 0));
    }

    public final void A04(AnonymousClass38M r11, boolean z2) {
        int i2;
        Object[] objArr;
        String str = r11.A02;
        View view = this.A02;
        AudioPickerActivity audioPickerActivity = this.A0C;
        if (str != null) {
            i2 = R.string.str012b;
            if (z2) {
                i2 = R.string.str012d;
            }
            objArr = new Object[]{r11.A07, str, r11.A04, r11.A06};
        } else {
            int i3 = R.string.str012c;
            if (z2) {
                i3 = R.string.str012e;
            }
            objArr = new Object[]{r11.A07, r11.A04, r11.A06};
        }
        view.setContentDescription(audioPickerActivity.getString(i2, objArr));
    }
}
