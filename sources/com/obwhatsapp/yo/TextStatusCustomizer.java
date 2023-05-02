package com.obwhatsapp.yo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.obwhatsapp.youbasha.colorPicker.ColorSelectorDialog;

@SuppressLint({"AppCompatCustomView"})
public class TextStatusCustomizer extends WaImageButton implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final TextStatusComposerActivity f578a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f579b;

    public TextStatusCustomizer(Context context) {
        super(context);
        TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) context;
        this.f578a = textStatusComposerActivity;
        setOnClickListener(this);
        textStatusComposerActivity.fmTColor = -1;
    }

    public TextStatusCustomizer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) context;
        this.f578a = textStatusComposerActivity;
        setOnClickListener(this);
        textStatusComposerActivity.fmTColor = -1;
    }

    public TextStatusCustomizer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) context;
        this.f578a = textStatusComposerActivity;
        setOnClickListener(this);
        textStatusComposerActivity.fmTColor = -1;
    }

    public static /* synthetic */ void a(TextStatusCustomizer textStatusCustomizer, int i2) {
        String str = "۟ۤۥۢ۟ۤۥ۬۬ۤۡۗۤ۟ۛۛ۠ۜۤۤ۟ۖۘۜ۬ۥۘ";
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 739) ^ 1341297837) {
                case -1851575876:
                    str = "ۨۗۘۘ۫ۗۨۘۨۖۧۘ۬ۢۘۙۧۜۢۤۚ۠ۗۜۘ";
                    i4 = i2;
                    break;
                case -1484636041:
                    str = "ۢۡۨۤ۟ۙۖۥۚۥ۫ۥۘۡ۬ۨۘۡۗۛۖۧ۫ۜ۬";
                    i4 = i3;
                    break;
                case -1008401246:
                    str = "ۨۛۢۖۚ۫ۛۜۢۖ۠ۡ۬ۙۡۤ۫۬ۥۢۛۥ۫ۘۜۘ";
                    break;
                case -507248319:
                    textStatusCustomizer.getClass();
                    str = "۟ۨۦۘ۫ۢۦۘۖۥۜۡۙ۫ۘۢۡۘ۟ۚۘ";
                    break;
                case 850052105:
                    return;
                case 925089761:
                    textStatusCustomizer.setTextColor(i4);
                    str = "۠ۛۢ۫ۤۜۘۡۡ۫۬۫ۘۘ۬ۘۥۨۨۘۘۧۘۥۘۦۧۡۘ";
                    break;
                case 930309331:
                    i3 = -1;
                    str = "ۜ۟ۖۘۜۡۘۗۡۖۘ۟ۚۤۦۥۖ۟ۜۡۘۥۢ";
                    break;
                case 1021852863:
                    str = "ۧۧۚ۫ۛۦۘۨۥۛۛۙۛۤۙۧۗۜۨۢۦۗۦۥۛۥۜۘ";
                    break;
                case 1561481947:
                    String str2 = "۬ۗ۠ۨۧ۠ۛۥۦۚۢۜۘۘۡۙ";
                    while (true) {
                        switch (str2.hashCode() ^ -46435539) {
                            case -1318406476:
                                str2 = "ۖ۠ۚۤۤۦۘۨ۫ۙۢۡۗ۬ۢۥۨۨ۠ۥ";
                                break;
                            case -429748067:
                                str = "ۜۛۗۧۨۙ۬ۙۢ۫ۥۨۘۤۘ۟ۥۤۨ";
                                continue;
                            case 410453521:
                                if (i2 != ColorPref.RESETBTN_COLOR_CODE) {
                                    str2 = "ۘۤۨۘۢۚۥۘۡۙۨۘ۬ۥۥۛۘۘۙۤ۟";
                                    break;
                                } else {
                                    str2 = "۠ۛۡۢۛۥۘۡ۬ۤۦۖۧۘ۫۬ۢ";
                                    break;
                                }
                            case 1043336219:
                                str = "ۢۡۨۤ۟ۙۖۥۚۥ۫ۥۘۡ۬ۨۘۡۗۛۖۧ۫ۜ۬";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static /* synthetic */ void b(TextStatusCustomizer textStatusCustomizer, int i2, int i3) {
        String str = "ۖۧ۠ۨۗ۠۫ۤۨۘۨۗۙۤ۬ۖۤۙۦۦ۫ۘۡۤۜۜ۫ۢ";
        while (true) {
            switch ((str.hashCode() ^ 365) ^ 1560894333) {
                case -2006229337:
                    return;
                case -1759226487:
                    str = "۟۫ۛۙ۫ۘۡ۟ۙۘۗۖۦۨۖۘۢ۬ۙۢۥۜۘ";
                    break;
                case -1354149899:
                    str = "ۖ۟ۦۘۚۖۥۡۥۖۛۛۗ۫ۢ۠ۗ۠ۧۗ۟ۚ";
                    break;
                case -949475430:
                    str = "ۚۖۡۘ۠ۥۗۥۙۦۘۡۙۖۘۛۨۧۘۥۘۡۙۜۥۘ۟ۥۖ۬ۦ";
                    break;
                case -527195406:
                    String str2 = "ۙۖۦۡۤۧ۟۠ۗۥۛۨۘۤ۬ۤۢ۟۟ۖ۬ۗۚۚ۠ۧۦ";
                    while (true) {
                        switch (str2.hashCode() ^ 1337052476) {
                            case -1759949415:
                                if (i3 != ColorPref.RESETBTN_COLOR_CODE) {
                                    str2 = "ۢۧۢۗۚۤۙۦۘۘۙۧۡۢۥۘۘ";
                                    break;
                                } else {
                                    str2 = "ۥۙۨۘۜۚ۟ۦ۫ۥۦۦۧۘۙۗۖ۬ۗۖۘۘ۫ۘ";
                                    break;
                                }
                            case -860313255:
                                str = "ۘۖۥۗۚۤ۬ۥۥۗۘ۫ۢ۠ۘۡۜۘۚۗۥۘۢۘۚ";
                                continue;
                            case -61725048:
                                str2 = "۬ۤۨۚۜۥۘ۟ۦۖۘۢۗۚۥۛۧ";
                                break;
                            case 976232550:
                                str = "ۖۥۖ۟ۗ۟ۘۘ۟ۘۘۖۜۚۡ۠ۘۘۛۘۘ";
                                continue;
                        }
                    }
                    break;
                case -148517773:
                    textStatusCustomizer.getClass();
                    str = "ۧۗۧۙ۠ۘۘۨۨۖۦ۬ۨۤۦۡۘۢۡۘۘ";
                    break;
                case 1630919387:
                    str = "۬۬ۥ۫ۨۜۗۡۘۘۤۛ۟ۧۨۧۘۙۦۖۘ";
                    break;
                case 1732415415:
                    textStatusCustomizer.setSolidBKColor(i2);
                    str = "ۤۙۚۢۧۘۜۧۖۘۘۧۦۘۗۙۗ";
                    break;
                case 2075944169:
                    textStatusCustomizer.setSolidBKColor(i3);
                    str = "۟۫ۛۙ۫ۘۡ۟ۙۘۗۖۦۨۖۘۢ۬ۙۢۥۜۘ";
                    break;
            }
        }
    }

    private void setSolidBKColor(int i2) {
        TextStatusComposerActivity textStatusComposerActivity = null;
        String str = "ۚۙۜۘۨ۟ۜۨۜۛۘۜۦۙۤ۟ۚۖۗۖۤۢۗۢۧ";
        while (true) {
            switch ((str.hashCode() ^ 682) ^ -24422121) {
                case -1391994013:
                    return;
                case -718210009:
                    str = "۟ۦ۬ۜۤۥۘۨۤۤۚۜۖۘۛۘۨۘۨۤۥ۫ۨۨۘ";
                    break;
                case -477871767:
                    str = "ۤۚۛۢ۬ۢ۠ۗۛ۫ۨۧۘۥ۬ۥۘۛۧ۟";
                    break;
                case -311389984:
                    textStatusComposerActivity = this.f578a;
                    str = "ۤۡۛۙۡۢ۠ۥۗۤ۬ۖۧۚۗ";
                    break;
                case 303260321:
                    textStatusComposerActivity.A00 = i2;
                    str = "ۚۗۖۘۘۧۦۘۛۛۗۦۦۧۘ۫ۙۧۜۧۘۘۤۦ";
                    break;
                case 838918769:
                    textStatusComposerActivity.getWindow().setBackgroundDrawable(new ColorDrawable(i2));
                    str = "ۨۥۦۛ۬ۗۙۥۦۛۦ۫ۜ۠ۜ۟۬ۧۥۙۡ۠ۛ۟";
                    break;
            }
        }
    }

    private void setTextColor(int i2) {
        String str = "ۧ۬ۦۘۜۖۚۤۨۜ۬ۜ۟ۖۦۘ";
        TextView textView = null;
        TextStatusComposerActivity textStatusComposerActivity = null;
        TextView textView2 = null;
        while (true) {
            switch ((str.hashCode() ^ 280) ^ -1724486813) {
                case -1839312662:
                    str = "ۦۛۥۘۛۘۗۦۖ۠ۥ۬ۘۘۚ۟ۧۚۚۘۘ";
                    textStatusComposerActivity = this.f578a;
                    break;
                case -938231526:
                    return;
                case -824265831:
                    textView = this.f579b;
                    str = "ۡۙۗۛۦۥۥۤۨۜۚۡۦۜۛ۫ۨۢۖۨ۬ۨ۬ۙ";
                    break;
                case -655319190:
                    textView.setTextColor(i2);
                    str = "ۤ۟ۛۗۗۡۘ۟ۜۨۦ۟ۡۘۙۘۥۚۦۢ";
                    break;
                case -148952205:
                    this.f579b = (TextView) textStatusComposerActivity.findViewById(yo.getID("entry", "id"));
                    str = "ۡ۠ۘۨۗ۬۠۟ۨۘۤۜۢ۫ۙ۟ۖ۠ۦ";
                    break;
                case 140752998:
                    String str2 = "ۜۙۤۛ۫ۡۨۥۡۡ۟ۢ۫ۛۥۥۜۜۦۛ۠";
                    while (true) {
                        switch (str2.hashCode() ^ -441504868) {
                            case -616061185:
                                str = "ۡ۠ۘۨۗ۬۠۟ۨۘۤۜۢ۫ۙ۟ۖ۠ۦ";
                                continue;
                            case -502343412:
                                str = "۬ۗۚۚۥۨۘۧۙۖۡۢ۬۟ۖ";
                                continue;
                            case 439049060:
                                str2 = "۠ۥۥۘۗۥۖۘ۫۫ۚۘۙ۟ۛۡۡۘ۬۫۟ۧۤۡۘ۫۫ۛ";
                                break;
                            case 2084677389:
                                if (textView2 != null) {
                                    str2 = "ۚۚۥۘ۠ۚۥۘۜۘۜۡۚ۟ۖۙ۠ۤۥ۠ۡۜۦ";
                                    break;
                                } else {
                                    str2 = "ۡۚۤ۬ۥۧۘۚۦۨۘۛۤۛۡ۟۟ۥۦۥۘۧۥۜ۫ۙۘۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1120848435:
                    str = "ۧۦۖۙۡۛۛۤۨۘۦۘۥۖۖۡۖۨۘۤۗۗۛۧ۫ۨۜۡ";
                    break;
                case 1183376660:
                    str = "۟۠۬۟ۥۢۥۧ۬ۗ۫ۥۘۙ۬ۨۘ";
                    break;
                case 1211005259:
                    String str3 = "ۦۖۧ۠ۗۜۘ۬ۢ۠ۧۦۦۛۗۖ";
                    while (true) {
                        switch (str3.hashCode() ^ 334672235) {
                            case -1143775274:
                                str = "ۖۙۡۘۜۖ۫ۨۤۚۥۤۖۜۢۧ";
                                continue;
                            case -880447051:
                                str3 = "ۘۖۛ۫ۡۢ۟ۗ۬ۥۧۘۘ۟ۛۗۡۙۖۥۡۘۘۥۛۙ";
                                break;
                            case 398280792:
                                if (textView == null) {
                                    str3 = "ۧۗۘۘۚۧۘۘۢۧۜۘ۬ۡۘ۠۬ۖۙۡۙ";
                                    break;
                                } else {
                                    str3 = "ۨۙۘ۫۬ۥۘۦۦۛۤۜۥۤ۬ۜۘۘۥۡۘ۫ۙۡ";
                                    break;
                                }
                            case 1224164775:
                                str = "ۥ۟ۛۡۨۡۜۦۜۘۚۛۡۦۗۜۘۢۘۘۘۖۜ۫";
                                continue;
                        }
                    }
                    break;
                case 1320540591:
                    textStatusComposerActivity.fmTColor = i2;
                    str = "ۥ۟ۛۡۨۡۜۦۜۘۚۛۡۦۗۜۘۢۘۘۘۖۜ۫";
                    break;
                case 1639731160:
                    str = "ۤ۟ۖۚۨۘۨۤۨۘۗۗ۬۠ۡۚۢ۫";
                    textView2 = this.f579b;
                    break;
            }
        }
    }

    public void onClick(View view) {
        String str = null;
        int i2 = 0;
        String str2 = "ۗۨۖۡۧۖۘۥۙۥۧ۬ۗ۫ۦۨۘۧۥۛۤۘۖۘۥۢۦۘۘۧۜۘ";
        while (true) {
            switch ((str2.hashCode() ^ 889) ^ -832272509) {
                case -2065134034:
                    str2 = "ۡۦ۬ۖ۠ۖۘۦۖۦۦ۟ۥۥۙۥۘ";
                    break;
                case -1750147027:
                    new ColorSelectorDialog(getContext(), new q0(this, i2), i2).show();
                    str2 = "ۚۨۨۘ۟ۛۚۙۚۙ۠ۚۢۧ۟ۘۘۨۛۥ";
                    break;
                case -1158882240:
                    String str3 = "۫ۜۡۘۙۗۡۘۜۖۘۘ۬۫ۖۘۤۦۘۘۢۗۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 493045994) {
                            case -218870414:
                                str2 = "ۗۛۗۡۦ۬۟ۨۦۗۛۜۗۙۦۘۧۧ۟";
                                continue;
                            case 1277022664:
                                str2 = "ۚۨۨۘ۟ۛۚۙۚۙ۠ۚۢۧ۟ۘۘۨۛۥ";
                                continue;
                            case 1423295397:
                                if (!"bk".equals(str)) {
                                    str3 = "ۙۜ۠۟ۨۛO۟ۦۥۙۖۧۘۘ۬ۜۚۦۘۘ";
                                    break;
                                } else {
                                    str3 = "ۗ۠ۡۘۘ۫ۦۡۡۘۘۛۡ۬ۧۥ۬۬ۜ۟ۘۚۥۘۘۢۖۘۢ۬ۢ";
                                    break;
                                }
                            case 1439839753:
                                str3 = "ۡ۠ۡۘۘۦۥۜ۠۟ۨ۠ۦۨ۬ۡۡۖ۠ۜۚۦۥۧۘۛۘۥ";
                                break;
                        }
                    }
                    break;
                case 278001094:
                    i2 = this.f578a.A00;
                    str2 = "ۥۛۛۛ۟ۖ۫ۗۨۢۨۤۖ۫ۜۘۜۜۢۥۤۡۜ۟ۚ";
                    break;
                case 1515310435:
                    return;
                case 1517743568:
                    String str4 = "ۚۙۡۘۢۗۡۦۡۥۨۘۘۘۜ۬۠۠";
                    while (true) {
                        switch (str4.hashCode() ^ -2123695854) {
                            case -2108366266:
                                if (!"txt".equals(str)) {
                                    str4 = "ۢۖۖۚۨ۟ۧۡۡۥۖ۠ۧۚۘۜۜۚ";
                                    break;
                                } else {
                                    str4 = "ۦۤۖۘۦۧۢۡۡۘ۠ۤۗۗ۟۬ۗۘۥۘ";
                                    break;
                                }
                            case -914824296:
                                str2 = "ۤۤ۫ۢۜۛۡۧۜۚۤ۫ۡ۟ۗۙ۫۟";
                                continue;
                            case 824461854:
                                str2 = "ۢۗۖۦۖۨۤ۠ۤ۫ۦۘۤۗۢۛۗۡۧۘۛۦۚ۟ۜ";
                                continue;
                            case 1944042126:
                                str4 = "ۢۙۜ۠ۚۦۘۡ۠ۧۥۧۤ۟ۡۨۢ۠ۢۛ۬ۦۘۢۚۡۘۧۛۙ";
                                break;
                        }
                    }
                    break;
                case 2034845743:
                    new ColorSelectorDialog(getContext(), new g(this, 1), -1).show();
                    str2 = "ۢۗۖۦۖۨۤ۠ۤ۫ۦۘۤۗۢۛۗۡۧۘۛۦۚ۟ۜ";
                    break;
                case 2112598483:
                    str = view.getTag().toString();
                    str2 = "ۙۦۢۘۨۘۘ۫ۢۥۘۤ۟ۖۘۤۧۨۘۡ۫ۘۘۗۘۗ۟۬";
                    break;
                case 2120701258:
                    str2 = "۬ۥ۬۬ۡۡ۫ۙۥۦۘۘۘ۬ۛۘ۬ۖ۬";
                    break;
            }
        }
    }
}
