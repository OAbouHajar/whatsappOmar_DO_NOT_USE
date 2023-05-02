package com.obwhatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass1WS;
import X.AnonymousClass29T;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16220sf;
import X.C218415q;
import X.C32241fu;
import X.C40981v0;
import X.C434920f;
import X.C45842Bi;
import X.C49132Rg;
import X.C49282Sg;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class SettingsNotifications extends C45842Bi implements C49282Sg {
    public static final int[] A0q = {R.string.str04d1, R.string.str04d4, R.string.str04d3, R.string.str04d5, R.string.str047d, R.string.str047c, R.string.str047b, R.string.str04d2};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public ViewGroup A0K;
    public ViewGroup A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public TextView A0R;
    public TextView A0S;
    public TextView A0T;
    public TextView A0U;
    public TextView A0V;
    public TextView A0W;
    public SwitchCompat A0X;
    public SwitchCompat A0Y;
    public SwitchCompat A0Z;
    public SwitchCompat A0a;
    public SwitchCompat A0b;
    public C16220sf A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public String[] A0l;
    public String[] A0m;
    public String[] A0n;
    public String[] A0o;
    public String[] A0p;

    public SettingsNotifications() {
        this(0);
    }

    public SettingsNotifications(int i2) {
        this.A0k = false;
        C13680ns.A1G(this, 120);
    }

    public static int A02(String str, String[] strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (str.equals(strArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public void A1q() {
        if (!this.A0k) {
            this.A0k = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0c = (C16220sf) r1.A3y.get();
        }
    }

    public final void A35() {
        View view;
        int i2;
        AnonymousClass1WS A032 = this.A0c.A03();
        AnonymousClass1WS A022 = this.A0c.A02();
        this.A0f = A032.A07();
        this.A06 = A02(A032.A08(), this.A0p);
        this.A05 = A02(A032.A06(), this.A0n);
        this.A04 = A02(A032.A05(), this.A0l);
        this.A0i = A032.A0B();
        this.A0e = A022.A07();
        this.A03 = A02(A022.A08(), this.A0p);
        this.A02 = A02(A022.A06(), this.A0n);
        this.A01 = A02(A022.A05(), this.A0l);
        this.A0g = A022.A0B();
        this.A0d = A032.A03();
        this.A00 = A02(A032.A04(), this.A0p);
        this.A0j = A032.A02().A0F;
        this.A0h = A022.A02().A0F;
        C13680ns.A19(this.A09, this, 9);
        this.A0X.setChecked(C13680ns.A0B(this.A09).getBoolean("conversation_sound", true));
        this.A0U.setText(C218415q.A07(this, this.A0f));
        C13680ns.A19(this.A0H, this, 16);
        int i3 = this.A06;
        if (i3 != -1) {
            this.A0W.setText(this.A0o[i3]);
        }
        C13680ns.A19(this.A0J, this, 10);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            int A002 = C434920f.A00(this, R.attr.attr0465, R.color.color070b);
            this.A0M.setTextColor(A002);
            this.A0V.setTextColor(A002);
            this.A0V.setText(R.string.str12eb);
            view = this.A0I;
            i2 = 20;
        } else {
            int i5 = this.A05;
            if (i5 != -1) {
                this.A0V.setText(this.A0m[i5]);
            }
            view = this.A0I;
            i2 = 8;
        }
        C13680ns.A19(view, this, i2);
        int i6 = this.A04;
        if (i6 != -1) {
            this.A0T.setText(A0q[i6]);
        }
        C13680ns.A19(this.A0G, this, 11);
        View view2 = this.A0F;
        if (i4 >= 21) {
            view2.setVisibility(0);
            this.A0a.setChecked(C13690nt.A1S(Boolean.FALSE, this.A0i));
            C13680ns.A19(this.A0F, this, 14);
        } else {
            view2.setVisibility(8);
        }
        this.A0L.setVisibility(0);
        SwitchCompat switchCompat = this.A0b;
        Boolean bool = Boolean.FALSE;
        switchCompat.setChecked(C13690nt.A1S(bool, this.A0j));
        C13680ns.A19(this.A0L, this, 19);
        this.A0K.setVisibility(0);
        this.A0Z.setChecked(C13690nt.A1S(bool, this.A0h));
        C13680ns.A19(this.A0K, this, 5);
        this.A0Q.setText(C218415q.A07(this, this.A0e));
        C13680ns.A19(this.A0C, this, 6);
        int i7 = this.A03;
        if (i7 != -1) {
            this.A0S.setText(this.A0o[i7]);
        }
        C13680ns.A19(this.A0E, this, 13);
        if (i4 >= 29) {
            this.A0D.setVisibility(8);
        } else {
            int i8 = this.A02;
            if (i8 != -1) {
                this.A0R.setText(this.A0m[i8]);
            }
            C13680ns.A19(this.A0D, this, 7);
        }
        int i9 = this.A01;
        if (i9 != -1) {
            this.A0P.setText(A0q[i9]);
        }
        C13680ns.A19(this.A0B, this, 17);
        View view3 = this.A0A;
        if (i4 >= 21) {
            view3.setVisibility(0);
            this.A0Y.setChecked(C13690nt.A1S(bool, this.A0g));
            C13680ns.A19(this.A0A, this, 15);
        } else {
            view3.setVisibility(8);
        }
        this.A0N.setText(C218415q.A07(this, this.A0d));
        C13680ns.A19(this.A07, this, 12);
        int i10 = this.A00;
        if (i10 != -1) {
            this.A0O.setText(this.A0o[i10]);
        }
        C13680ns.A19(this.A08, this, 18);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0088, code lost:
        r0 = r4.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        X.AnonymousClass29T.A01(r4, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        r1.setText(A0q[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        r0 = r4.A0o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        r1.setText(r0[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AXH(int r5, int r6) {
        /*
            r4 = this;
            r3 = 7
            switch(r5) {
                case 9: goto L_0x0005;
                case 10: goto L_0x001a;
                case 11: goto L_0x002e;
                case 12: goto L_0x0061;
                case 13: goto L_0x0075;
                case 14: goto L_0x008b;
                case 15: goto L_0x00c8;
                default: goto L_0x0004;
            }
        L_0x0004:
            return
        L_0x0005:
            r4.A06 = r6
            X.0sf r2 = r4.A0c
            java.lang.String[] r0 = r4.A0p
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            r2.A0O(r0, r1)
            android.widget.TextView r1 = r4.A0W
            goto L_0x00e9
        L_0x001a:
            r4.A05 = r6
            X.0sf r2 = r4.A0c
            java.lang.String[] r0 = r4.A0n
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            r2.A0M(r0, r1)
            android.widget.TextView r1 = r4.A0V
            goto L_0x0088
        L_0x002e:
            java.lang.String[] r0 = r4.A0l
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004d
        L_0x0044:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x00a9
        L_0x004d:
            r4.A04 = r6
            X.0sf r2 = r4.A0c
            java.lang.String[] r0 = r4.A0l
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            r2.A0L(r0, r1)
            android.widget.TextView r1 = r4.A0T
            goto L_0x00c0
        L_0x0061:
            r4.A03 = r6
            X.0sf r2 = r4.A0c
            java.lang.String[] r0 = r4.A0p
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            r2.A0O(r0, r1)
            android.widget.TextView r1 = r4.A0S
            goto L_0x00e9
        L_0x0075:
            r4.A02 = r6
            X.0sf r2 = r4.A0c
            java.lang.String[] r0 = r4.A0n
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            r2.A0M(r0, r1)
            android.widget.TextView r1 = r4.A0R
        L_0x0088:
            java.lang.String[] r0 = r4.A0m
            goto L_0x00eb
        L_0x008b:
            java.lang.String[] r0 = r4.A0l
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ad
        L_0x00a1:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ad
        L_0x00a9:
            X.AnonymousClass29T.A01(r4, r3)
            return
        L_0x00ad:
            r4.A01 = r6
            X.0sf r2 = r4.A0c
            java.lang.String[] r0 = r4.A0l
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            r2.A0L(r0, r1)
            android.widget.TextView r1 = r4.A0P
        L_0x00c0:
            int[] r0 = A0q
            r0 = r0[r6]
            r1.setText(r0)
            return
        L_0x00c8:
            r4.A00 = r6
            X.0sf r3 = r4.A0c
            java.lang.String[] r0 = r4.A0p
            r0 = r0[r6]
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.1WS r1 = r3.A07(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x00e7
            r1.A08 = r2
            r3.A0K(r1)
        L_0x00e7:
            android.widget.TextView r1 = r4.A0O
        L_0x00e9:
            java.lang.String[] r0 = r4.A0o
        L_0x00eb:
            r0 = r0[r6]
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsNotifications.AXH(int, int):void");
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        String A072;
        String str;
        TextView textView;
        super.onActivityResult(i2, i3, intent);
        if ((i2 == 1 || i2 == 2 || i2 == 3) && i3 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                A072 = RingtoneManager.getRingtone(this, uri).getTitle(this);
                str = uri.toString();
            } else {
                A072 = C218415q.A07(this, (String) null);
                str = "Silent";
            }
            if (i2 == 1) {
                this.A0f = str;
                this.A0c.A0N("individual_chat_defaults", str);
                textView = this.A0U;
            } else if (i2 != 2) {
                this.A0d = str;
                C16220sf r2 = this.A0c;
                AnonymousClass1WS A073 = r2.A07("individual_chat_defaults");
                if (!TextUtils.equals(str, A073.A07)) {
                    A073.A07 = str;
                    r2.A0K(A073);
                }
                textView = this.A0N;
            } else {
                this.A0e = str;
                this.A0c.A0N("group_chat_defaults", str);
                textView = this.A0Q;
            }
            textView.setText(A072);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1da5);
        setContentView((int) R.layout.layout04ca);
        C14530pL.A0Y(this);
        this.A09 = findViewById(R.id.conversation_sound_setting);
        this.A0X = (SwitchCompat) findViewById(R.id.conversation_sound_switch);
        this.A0H = findViewById(R.id.notification_tone_setting);
        this.A0U = C13680ns.A0N(this, R.id.selected_notification_tone);
        this.A0J = findViewById(R.id.vibrate_setting);
        this.A0W = C13680ns.A0N(this, R.id.selected_vibrate_setting);
        this.A0I = findViewById(R.id.popup_notification_setting);
        this.A0M = C13680ns.A0N(this, R.id.popup_notification_setting_title);
        this.A0V = C13680ns.A0N(this, R.id.selected_popup_notification_setting);
        this.A0G = findViewById(R.id.notification_light_setting);
        this.A0T = C13680ns.A0N(this, R.id.selected_notification_light_setting);
        this.A0F = findViewById(R.id.high_priority_notifications_setting);
        this.A0a = (SwitchCompat) findViewById(R.id.high_priority_notifications_switch);
        this.A0C = findViewById(R.id.group_notification_tone_setting);
        this.A0Q = C13680ns.A0N(this, R.id.selected_group_notification_tone);
        this.A0E = findViewById(R.id.group_vibrate_setting);
        this.A0S = C13680ns.A0N(this, R.id.selected_group_vibrate_setting);
        this.A0D = findViewById(R.id.group_popup_notification_setting);
        this.A0R = C13680ns.A0N(this, R.id.selected_group_popup_notification_setting);
        this.A0B = findViewById(R.id.group_notification_light_setting);
        this.A0P = C13680ns.A0N(this, R.id.selected_group_notification_light_setting);
        this.A0A = findViewById(R.id.group_high_priority_notifications_setting);
        this.A0Y = (SwitchCompat) findViewById(R.id.group_high_priority_notifications_switch);
        this.A07 = findViewById(R.id.call_tone_setting);
        this.A0N = C13680ns.A0N(this, R.id.selected_call_tone);
        this.A08 = findViewById(R.id.call_vibrate_setting);
        this.A0O = C13680ns.A0N(this, R.id.selected_call_vibrate_setting);
        this.A0L = (ViewGroup) findViewById(R.id.reaction_notifications_setting);
        this.A0K = (ViewGroup) findViewById(R.id.group_reaction_notifications_setting);
        this.A0b = (SwitchCompat) findViewById(R.id.reactions_switch);
        this.A0Z = (SwitchCompat) findViewById(R.id.group_reactions_switch);
        Resources resources = getResources();
        this.A0o = resources.getStringArray(R.array.array001d);
        this.A0p = resources.getStringArray(R.array.array001e);
        this.A0m = resources.getStringArray(R.array.array0018);
        this.A0n = resources.getStringArray(R.array.array0019);
        this.A0l = resources.getStringArray(R.array.array0015);
        A35();
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r2;
        if (i2 == 7) {
            r2 = C32241fu.A00(this);
            r2.A01(R.string.str0c16);
            r2.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        } else if (i2 != 8) {
            return super.onCreateDialog(i2);
        } else {
            r2 = C32241fu.A00(this);
            r2.A01(R.string.str159d);
            C13680ns.A1H(r2, this, 100, R.string.str1456);
            r2.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        }
        return r2.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_reset_notification_settings, 0, R.string.str159c).setShowAsAction(0);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass29T.A01(this, 8);
        return true;
    }

    public void onStart() {
        super.onStart();
        C16220sf r2 = this.A0c;
        if (C40981v0.A00) {
            boolean A0V2 = r2.A0V("individual_chat_defaults");
            boolean A0V3 = r2.A0V("group_chat_defaults");
            if (A0V2 || A0V3) {
                Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
                A35();
            }
        }
    }

    public final void requestFocusOnViewAndHighlight(View view) {
        view.getParent().requestChildFocus(view, view);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] objArr = new Object[2];
        AnonymousClass000.A1K(objArr, getResources().getColor(R.color.color090b));
        objArr[1] = Integer.valueOf(getResources().getColor(R.color.color00be));
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
        ofObject.setRepeatMode(2);
        ofObject.setRepeatCount(1);
        ofObject.setDuration(500);
        C13690nt.A0p(ofObject, view, 10);
        ofObject.start();
    }
}
