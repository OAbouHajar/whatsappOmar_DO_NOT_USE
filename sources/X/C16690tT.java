package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.renderscript.RenderScript;
import android.view.View;
import com.facebook.redex.IDxCListenerShape162S0100000_2_I1;
import com.facebook.redex.IDxConsumerShape208S0100000_1_I1;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.group.GroupProfileEmojiEditor;
import com.obwhatsapp.profile.WebImagePicker;
import com.obwhatsapp.registration.RegisterPhone;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.obwhatsapp.registration.VerifyTwoFactorAuth;
import com.obwhatsapp.settings.SettingsDataUsageActivity;
import com.obwhatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.jid.Jid;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.IDxATaskShape25S0200000_1_I0;
import com.whatsapp.util.Log;
import com.whatsapp.util.WaAsyncTask$$ExternalSyntheticLambda0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.0tT  reason: invalid class name and case insensitive filesystem */
public abstract class C16690tT {
    public AnonymousClass05T A00;
    public C001300o A01;
    public final C16700tU A02;

    public C16690tT() {
        this.A02 = new C16700tU(this);
    }

    public C16690tT(C001300o r2) {
        this(r2, true);
    }

    public C16690tT(C001300o r4, boolean z2) {
        this();
        AnonymousClass00B.A01();
        AnonymousClass00B.A0G(((C009604p) r4.getLifecycle()).A02 != C011005f.DESTROYED);
        this.A01 = r4;
        this.A00 = new WaAsyncTask$$ExternalSyntheticLambda0(this, z2);
        r4.getLifecycle().A00(this.A00);
    }

    public static AnonymousClass2BC A00(C49172Rk r2, String str, int i2, boolean z2) {
        C35341ll r0 = new C35341ll();
        r0.A01 = 2;
        r0.A00 = i2;
        r0.A02 = 2;
        r0.A03 = str;
        r0.A04 = z2;
        return r2.A00(r0);
    }

    public static C28371Vv A01(C28371Vv r5, String str, int i2) {
        C35081lL[] r3 = new C35081lL[4];
        r3[i2] = new C35081lL((Jid) C34791ks.A00, "to");
        r3[1] = new C35081lL("xmlns", "urn:xmpp:whatsapp:account");
        r3[2] = new C35081lL("type", "get");
        r3[3] = new C35081lL("id", str);
        return new C28371Vv(r5, "iq", r3);
    }

    public static boolean A02(C16690tT r0) {
        return r0.A02.isCancelled();
    }

    public final int A03() {
        AsyncTask.Status status = this.A02.getStatus();
        if (status == AsyncTask.Status.PENDING) {
            return 0;
        }
        return status == AsyncTask.Status.RUNNING ? 1 : 2;
    }

    public C001300o A04(Class cls) {
        return C001300o.class.equals(cls) ? this.A01 : (C001300o) cls.cast(this.A01);
    }

    public void A05() {
        AnonymousClass024 r0;
        String str;
        if (this instanceof IDxATaskShape25S0200000_1_I0) {
            IDxATaskShape25S0200000_1_I0 iDxATaskShape25S0200000_1_I0 = (IDxATaskShape25S0200000_1_I0) this;
            if (iDxATaskShape25S0200000_1_I0.A02 == 0) {
                AnonymousClass1BP r2 = (AnonymousClass1BP) iDxATaskShape25S0200000_1_I0.A00;
                ((AnonymousClass4QG) iDxATaskShape25S0200000_1_I0.A01).A00(r2.A01);
                r2.A08.Ae3(r2.A01);
                StringBuilder sb = new StringBuilder("dictionaryloader/prepare/onCancelled/dictionaryAvailable=");
                sb.append(r2.A01);
                str = sb.toString();
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass37F) {
            AnonymousClass37F r1 = (AnonymousClass37F) this;
            C55552jq r22 = r1.A02.A0S;
            if (r22 != null) {
                r22.A0G(r1.A00, false);
                return;
            }
            return;
        } else if (this instanceof AnonymousClass37I) {
            ((AnonymousClass37I) this).A05.A0B.AKy(453128091, 2, 4);
            return;
        } else if (this instanceof C47832Ku) {
            C47832Ku r12 = (C47832Ku) this;
            r12.A02.clear();
            RenderScript renderScript = r12.A00;
            if (renderScript != null) {
                renderScript.destroy();
                return;
            }
            return;
        } else if (this instanceof AnonymousClass37J) {
            C46522Er r23 = (C46522Er) ((AnonymousClass37J) this).A08.get();
            if (r23 == null) {
                str = "SecurityCodeTask/onPostExecute/null callback";
            } else {
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) r23;
                verifyTwoFactorAuth.A0A.setEnabled(true);
                verifyTwoFactorAuth.A07.setProgress(100);
                return;
            }
        } else if (this instanceof AnonymousClass37K) {
            AnonymousClass2F5 r24 = (AnonymousClass2F5) ((AnonymousClass37K) this).A0D.get();
            if (r24 != null) {
                AnonymousClass2F3 r25 = (AnonymousClass2F3) r24;
                AnonymousClass29T.A00(r25, 9);
                r25.A01 = null;
                if (r25 instanceof RegisterPhone) {
                    ((RegisterPhone) r25).A0N = null;
                    return;
                }
                return;
            }
            return;
        } else if (this instanceof AnonymousClass37V) {
            AnonymousClass37V r13 = (AnonymousClass37V) this;
            File A03 = AnonymousClass37V.A03(r13.A04.A00, r13);
            if (A03.exists()) {
                A03.delete();
                return;
            }
            return;
        } else if (this instanceof AnonymousClass37H) {
            AnonymousClass37H r02 = (AnonymousClass37H) this;
            r02.A02.A03(r02.A00);
            return;
        } else if (this instanceof AnonymousClass37G) {
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) ((AnonymousClass37G) this).A04.get();
            if (contactPickerFragment != null && contactPickerFragment.A0c()) {
                Log.i("contactpicker/fetchContactUsingPhoneNumber/canceled");
                contactPickerFragment.A10 = null;
                contactPickerFragment.A0H.setVisibility(8);
                contactPickerFragment.A0G.setVisibility(0);
                return;
            }
            return;
        } else {
            if (this instanceof AnonymousClass373) {
                r0 = ((AnonymousClass373) this).A00;
            } else if (this instanceof C609936x) {
                r0 = ((C609936x) this).A00;
            } else {
                return;
            }
            r0.A01();
            return;
        }
        Log.i(str);
    }

    public final void A06(boolean z2) {
        this.A02.cancel(z2);
    }

    public final void A07(Object... objArr) {
        this.A02.A01(objArr);
    }

    public abstract Object A08(Object... objArr);

    public void A09() {
        C14550pN r1;
        WeakReference weakReference;
        WeakReference weakReference2;
        View view;
        View view2;
        C14550pN r2;
        int i2;
        int i3;
        WeakReference weakReference3;
        if (this instanceof AnonymousClass375) {
            weakReference2 = ((AnonymousClass375) this).A08;
        } else if (this instanceof AnonymousClass370) {
            weakReference2 = ((AnonymousClass370) this).A06;
        } else {
            if (this instanceof AnonymousClass20L) {
                weakReference = ((AnonymousClass20L) this).A05;
            } else if (this instanceof C610136z) {
                C610136z r4 = (C610136z) this;
                Context context = (Context) r4.A06.get();
                if (context != null) {
                    if (r4.A00 == null) {
                        ProgressDialog progressDialog = new ProgressDialog(context);
                        r4.A00 = progressDialog;
                        progressDialog.setOnCancelListener(new IDxCListenerShape162S0100000_2_I1(r4, 15));
                        r4.A00.setCanceledOnTouchOutside(false);
                    }
                    if (!r4.A00.isShowing()) {
                        r4.A00.setMessage(context.getString(R.string.str0b25));
                        r4.A00.setIndeterminate(true);
                        r4.A00.show();
                        return;
                    }
                    return;
                }
                return;
            } else if (this instanceof AnonymousClass37A) {
                AnonymousClass37A r22 = (AnonymousClass37A) this;
                AnonymousClass4NU r0 = r22.A08;
                if (r0 != null) {
                    C14550pN r12 = r0.A00;
                    if (!r12.isFinishing()) {
                        r12.Afq(R.string.str1392);
                    }
                }
                C23251Bb r3 = r22.A09;
                StringBuilder sb = new StringBuilder("contactsupporttask");
                sb.append(": PRIVACY SETTINGS BEGIN");
                Log.e(sb.toString());
                for (C27881Tm AKY : (Set) r3.A0c.get()) {
                    AKY.AKY("contactsupporttask");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("contactsupporttask");
                sb2.append(": PRIVACY SETTINGS END");
                Log.e(sb2.toString());
                return;
            } else if (this instanceof C610036y) {
                C610036y r42 = (C610036y) this;
                C001000l r32 = (C001000l) r42.A06.get();
                if (r32 != null) {
                    AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A012 = AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A01(r42.A04, r42.A03, r42.A05);
                    r42.A00 = A012;
                    A012.A1G(r32.AGM(), "add");
                    return;
                }
                return;
            } else if (this instanceof AnonymousClass37F) {
                AnonymousClass37F r13 = (AnonymousClass37F) this;
                r13.A02.A0S.A0G(r13.A00, true);
                return;
            } else if (this instanceof C609836w) {
                C609836w r02 = (C609836w) this;
                Resources resources = r02.A03;
                if (resources != null) {
                    WallpaperImagePreview wallpaperImagePreview = r02.A05;
                    wallpaperImagePreview.setImageDrawable(resources.getDrawable(r02.A00));
                    wallpaperImagePreview.setVisibility(0);
                    return;
                }
                return;
            } else if (this instanceof C608536j) {
                Log.i("settings-data-usage-activity/load storage size task/started");
                SettingsDataUsageActivity settingsDataUsageActivity = ((C608536j) this).A01;
                if (settingsDataUsageActivity.A03 == -1) {
                    settingsDataUsageActivity.A0C.setText(R.string.str0333);
                    return;
                }
                return;
            } else {
                if (this instanceof C608736l) {
                    weakReference3 = ((C608736l) this).A02;
                } else if (this instanceof C608636k) {
                    weakReference3 = ((C608636k) this).A02;
                } else if (this instanceof C609136p) {
                    C609136p r14 = (C609136p) this;
                    C14550pN r03 = (C14550pN) r14.A03.get();
                    if (r03 != null && !r03.AIm()) {
                        r14.A02.Afr(0, R.string.str13db);
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass374) {
                    AnonymousClass374 r23 = (AnonymousClass374) this;
                    StringBuilder sb3 = new StringBuilder("verifycode/");
                    sb3.append(r23.A08);
                    Log.i(sb3.toString());
                    AnonymousClass2FQ r24 = (AnonymousClass2FQ) r23.A0A.get();
                    if (r24 != null) {
                        C14530pL r25 = (C14530pL) r24;
                        if (r25.A09.A00() != 8) {
                            AnonymousClass29T.A01(r25, 23);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass37J) {
                    C46522Er r26 = (C46522Er) ((AnonymousClass37J) this).A08.get();
                    if (r26 == null) {
                        Log.i("SecurityCodeTask/onPreExecute/null callback");
                        return;
                    }
                    VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) r26;
                    verifyTwoFactorAuth.A0A.setEnabled(false);
                    verifyTwoFactorAuth.A07.setProgress(0);
                    AnonymousClass29T.A01(verifyTwoFactorAuth, verifyTwoFactorAuth.A00);
                    return;
                } else if (this instanceof AnonymousClass37B) {
                    AnonymousClass37B r33 = (AnonymousClass37B) this;
                    StringBuilder sb4 = new StringBuilder("requestcode/");
                    String str = r33.A0D;
                    sb4.append(str);
                    Log.i(sb4.toString());
                    AnonymousClass2FP r27 = (AnonymousClass2FP) r33.A0G.get();
                    if (r27 != null) {
                        boolean z2 = r33.A0H;
                        VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) r27;
                        verifyPhoneNumber.A3Z(300000, 0, false);
                        verifyPhoneNumber.A3Z(300000, 1, false);
                        if (verifyPhoneNumber.A48()) {
                            verifyPhoneNumber.A3Z(300000, 2, false);
                        }
                        verifyPhoneNumber.A0v.A01();
                        if (str.equals("sms")) {
                            verifyPhoneNumber.A3W(0);
                            if (verifyPhoneNumber.A1P) {
                                verifyPhoneNumber.A1O = true;
                                verifyPhoneNumber.registerReceiver(verifyPhoneNumber.A13, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
                            } else {
                                IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
                                intentFilter.setPriority(Integer.MAX_VALUE);
                                verifyPhoneNumber.registerReceiver(verifyPhoneNumber.A0y, intentFilter);
                                verifyPhoneNumber.A1L = true;
                            }
                            verifyPhoneNumber.A11.A03();
                            if (z2) {
                                i3 = 35;
                            } else {
                                return;
                            }
                        } else if (str.equals("voice") || str.equals("flash")) {
                            if (str.equals("flash")) {
                                verifyPhoneNumber.A3W(16);
                            }
                            if (z2) {
                                verifyPhoneNumber.A3U(R.string.str13d5);
                                return;
                            }
                            return;
                        } else if (str.equals("wa_old")) {
                            verifyPhoneNumber.A3W(0);
                            verifyPhoneNumber.A11.A03();
                            if (z2) {
                                i3 = 46;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                        AnonymousClass29T.A01(verifyPhoneNumber, i3);
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass37K) {
                    AnonymousClass37K r15 = (AnonymousClass37K) this;
                    AnonymousClass2F5 r28 = (AnonymousClass2F5) r15.A0D.get();
                    C15860rz r16 = r15.A04;
                    r16.A0p("did_not_query");
                    r16.A0d(-1);
                    if (r28 != null) {
                        r28.Afp();
                        return;
                    }
                    return;
                } else if (this instanceof C609436s) {
                    ((C609436s) this).A01.A08(0, R.string.str0c8c);
                    return;
                } else if (this instanceof AnonymousClass37E) {
                    AnonymousClass37E r43 = (AnonymousClass37E) this;
                    WebImagePicker webImagePicker = r43.A02;
                    ProgressDialog progressDialog2 = new ProgressDialog(webImagePicker);
                    r43.A00 = progressDialog2;
                    progressDialog2.setProgressStyle(1);
                    r43.A00.setMessage(webImagePicker.getString(R.string.str129b));
                    r43.A00.setCancelable(true);
                    r43.A00.setOnCancelListener(new IDxCListenerShape162S0100000_2_I1(r43, 13));
                    r43.A00.show();
                    return;
                } else if (this instanceof AnonymousClass2K4) {
                    AnonymousClass2K4 r34 = (AnonymousClass2K4) this;
                    AnonymousClass16R r29 = r34.A08;
                    if (r29 != null) {
                        try {
                            r29.A05(r34, "map-download", 0.0f, 3, 1000, 1000);
                        } catch (IllegalArgumentException e2) {
                            Log.w("MapDownload/registerListener/GPS error ", e2);
                        }
                    }
                    C30901d9 r210 = r34.A0H;
                    r210.A02 = 1;
                    r34.A0D.A08(r210, -1);
                    return;
                } else if (this instanceof AnonymousClass37C) {
                    AnonymousClass37C r35 = (AnonymousClass37C) this;
                    Context context2 = (Context) r35.A0L.get();
                    if (context2 != null) {
                        if (r35.A01 == null) {
                            ProgressDialog progressDialog3 = new ProgressDialog(context2);
                            r35.A01 = progressDialog3;
                            progressDialog3.setOnCancelListener(new IDxCListenerShape162S0100000_2_I1(r35, 11));
                            r35.A01.setCancelable(false);
                        }
                        if (!r35.A01.isShowing()) {
                            ProgressDialog progressDialog4 = r35.A01;
                            boolean A002 = r35.A0B.A00();
                            int i4 = R.string.str14b3;
                            if (A002) {
                                i4 = R.string.str059b;
                            }
                            progressDialog4.setMessage(context2.getString(i4));
                            r35.A01.setIndeterminate(true);
                            r35.A01.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass37U) {
                    AnonymousClass4QJ r04 = (AnonymousClass4QJ) ((AnonymousClass37U) this).A03.get();
                    if (r04 != null) {
                        r04.A00.A06.setVisibility(0);
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass2O3) {
                    r2 = (C14550pN) ((AnonymousClass2O3) this).A07.get();
                    if (r2 != null && !r2.isFinishing()) {
                        i2 = R.string.str18af;
                        r2.Afr(i2, R.string.str13db);
                    }
                    return;
                } else if (this instanceof C609336r) {
                    C001300o A04 = A04(GroupProfileEmojiEditor.class);
                    IDxConsumerShape208S0100000_1_I1 iDxConsumerShape208S0100000_1_I1 = new IDxConsumerShape208S0100000_1_I1(this, 0);
                    if (A04 != null) {
                        iDxConsumerShape208S0100000_1_I1.accept(A04);
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass37S) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) ((AnonymousClass37S) this).A07.get();
                    if (groupChatInfoActivity != null) {
                        groupChatInfoActivity.A01.setVisibility(0);
                        groupChatInfoActivity.A1Z.setVisibility(8);
                        return;
                    }
                    return;
                } else if (this instanceof C46742Gb) {
                    C46742Gb r211 = (C46742Gb) this;
                    for (AnonymousClass2Ga ANX : r211.A05.A01()) {
                        ANX.ANX();
                    }
                    r211.A02.A00(1, true);
                    return;
                } else if (this instanceof AnonymousClass37R) {
                    AnonymousClass37R r36 = (AnonymousClass37R) this;
                    AnonymousClass02C r212 = (AnonymousClass02C) r36.A05.get();
                    if (r212 != null) {
                        ProgressDialogFragment A013 = ProgressDialogFragment.A01(R.string.str130a, R.string.str13db);
                        r36.A01 = A013;
                        A013.A1G(r212, "count_progress");
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass377) {
                    WeakReference weakReference4 = ((AnonymousClass377) this).A09;
                    if (weakReference4.get() != null) {
                        ((C14600pS) weakReference4.get()).Afr(0, R.string.str13db);
                        return;
                    }
                    return;
                } else if (this instanceof C609636u) {
                    C14550pN r213 = (C14550pN) ((C609636u) this).A00.get();
                    if (r213 != null && !r213.AIm()) {
                        r213.Afr(0, R.string.str14b4);
                        return;
                    }
                    return;
                } else if (this instanceof C609536t) {
                    ((C609536t) this).A00.A08(0, R.string.str0454);
                    return;
                } else if (this instanceof AnonymousClass37H) {
                    AnonymousClass37H r37 = (AnonymousClass37H) this;
                    C14550pN r214 = (C14550pN) r37.A05.get();
                    if (r214 != null) {
                        r214.Afr(0, R.string.str0c89);
                    }
                    r37.A02.A02(r37.A00);
                    return;
                } else if (this instanceof AnonymousClass376) {
                    AnonymousClass376 r38 = (AnonymousClass376) this;
                    C42791yg r215 = (C42791yg) r38.A0B.get();
                    r38.A01 = r38.A06.A04();
                    if (r215 != null) {
                        boolean z3 = r38.A0C;
                        C42821yj r39 = ((Conversation) r215).A00;
                        r39.A42 = new C28921Zf("conversation/search/searchTask");
                        if (!C42451xo.A00(r39.A2f)) {
                            r39.A22.Afq(R.string.str14b3);
                            return;
                        } else if (r39.A0G != null && r39.A0E != null && (view = r39.A0H) != null && (view2 = r39.A0F) != null) {
                            if (z3) {
                                view.setVisibility(0);
                            } else {
                                view2.setVisibility(0);
                            }
                            r39.A0G.setEnabled(false);
                            r39.A0E.setEnabled(false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (this instanceof AnonymousClass371) {
                    weakReference2 = ((AnonymousClass371) this).A06;
                } else if (this instanceof AnonymousClass37G) {
                    ContactPickerFragment contactPickerFragment = (ContactPickerFragment) ((AnonymousClass37G) this).A04.get();
                    if (contactPickerFragment != null && contactPickerFragment.A0c()) {
                        Log.i("contactpicker/fetchcontactusingphonenumber/started");
                        contactPickerFragment.A0H.setVisibility(0);
                        contactPickerFragment.A0G.setVisibility(8);
                        return;
                    }
                    return;
                } else if (this instanceof AnonymousClass37Q) {
                    AnonymousClass37Q r216 = (AnonymousClass37Q) this;
                    for (AnonymousClass5RR ANc : r216.A01.A01()) {
                        ANc.ANc();
                    }
                    r216.A03.A00(1, true);
                    return;
                } else if (this instanceof C55042ii) {
                    C55042ii r05 = (C55042ii) this;
                    r05.A0A.schedule(new C55032ih(r05), AnonymousClass1NO.A0L);
                    return;
                } else if (this instanceof AnonymousClass2Rx) {
                    AnonymousClass29T.A01(((AnonymousClass2Rx) this).A00, 104);
                    return;
                } else if (this instanceof AnonymousClass2K9) {
                    weakReference = ((AnonymousClass2K9) this).A0F;
                } else if (this instanceof AnonymousClass2S1) {
                    AnonymousClass29T.A01(((AnonymousClass2S1) this).A00, 104);
                    return;
                } else if ((this instanceof AnonymousClass379) && (r1 = (C14550pN) ((AnonymousClass379) this).A00.get()) != null) {
                    r1.Afq(R.string.str1376);
                    return;
                } else {
                    return;
                }
                r2 = (C14550pN) weakReference3.get();
                if (r2 != null && !r2.AIm()) {
                    i2 = 0;
                    r2.Afr(i2, R.string.str13db);
                }
                return;
            }
            C14600pS r217 = (C14600pS) weakReference.get();
            if (r217 != null) {
                r217.Afr(0, R.string.str0cf0);
                return;
            }
            return;
        }
        r2 = (C14550pN) weakReference2.get();
        if (r2 != null) {
            i2 = R.string.str130a;
            r2.Afr(i2, R.string.str13db);
        }
    }

    public void A0A(Object obj) {
    }
}
