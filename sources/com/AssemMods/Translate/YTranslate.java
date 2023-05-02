package com.AssemMods.Translate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import com.AssemMods.translator.Language;
import com.obwhatsapp.yo.Trans.Translator;
import com.obwhatsapp.yo.p0;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.app;
import java.lang.ref.WeakReference;

public class YTranslate {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Activity> f204a;

    /* renamed from: b  reason: collision with root package name */
    private static CharSequence f205b;

    /* renamed from: c  reason: collision with root package name */
    private static String f206c;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        String str = Language.ENGLISH;
        switch (i2) {
            case 0:
                str = Language.ARABIC;
                break;
            case 2:
                str = Language.FRENCH;
                break;
            case 3:
                str = Language.SPANISH;
                break;
            case 4:
                str = Language.ITALIAN;
                break;
            case 5:
                str = Language.RUSSIAN;
                break;
            case 6:
                str = Language.PORTUGUESE;
                break;
            case 7:
                str = Language.TURKISH;
                break;
            case 8:
                str = "id";
                break;
            case 9:
                str = Language.HINDI;
                break;
            case 10:
                str = Language.GERMAN;
                break;
            case 11:
                str = "ms";
                break;
            case 12:
                str = Language.URDU;
                break;
            case 13:
                str = Language.VIETNAMESE;
                break;
            case 14:
                str = Language.GUJARATI;
                break;
            case 15:
                str = Language.PUNJABI;
                break;
            case 16:
                str = Language.TAMIL;
                break;
            case 17:
                str = Language.BENGALI;
                break;
            case 18:
                str = Language.MARATHI;
                break;
            case 19:
                str = Language.TELUGU;
                break;
        }
        f206c = str;
        Context context = (Context) f204a.get();
        try {
            if (app.checkInternetNow()) {
                Toast.makeText(context, yo.getString("yoProcessing"), 0).show();
                if (f205b.toString().isEmpty() || f205b == null) {
                    throw new NullPointerException();
                }
                new Translator(f206c, f205b.toString()).A01(new Translator.TranslateListener(context) {
                    private Context ctx;

                    {
                        this.ctx = r1;
                    }

                    /* access modifiers changed from: private */
                    public static /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
                        dialogInterface.cancel();
                        p0.resume();
                    }

                    /* access modifiers changed from: private */
                    public static /* synthetic */ void a(String str, DialogInterface dialogInterface, int i2) {
                        ((ClipboardManager) yo.getCtx().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", str));
                        Toast.makeText((Context) YTranslate.f204a.get(), yo.getString("yoMessage_copied"), 0).show();
                        p0.resume();
                    }

                    public void onFailure(String str) {
                        Toast.makeText(this.ctx, str, 0).show();
                    }

                    public void onSuccess(String str) {
                        Activity activity = (Activity) this.ctx;
                        if (!activity.isFinishing()) {
                            AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle(yo.getString("Translated"));
                            title.setCancelable(true);
                            title.setMessage(str).setPositiveButton(17039361, new DialogInterface.OnClickListener(str) {
                                private final /* synthetic */ String f$0;

                                {
                                    this.f$0 = r1;
                                }

                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    AnonymousClass1.a(this.f$0, dialogInterface, i2);
                                }
                            }).setNegativeButton(17039370, AnonymousClass3.INSTANCE).create().show();
                        }
                    }
                });
                return;
            }
            Toast.makeText(context, yo.getString("network_required"), 0).show();
        } catch (Exception unused) {
            Toast.makeText(context, yo.getString("Translating_Failed"), 0).show();
        }
    }

    public static void translte(CharSequence charSequence, Context context) {
        if (charSequence != null && charSequence.length() > 0) {
            f204a = new WeakReference<>(context);
            f205b = charSequence;
            CharSequence[] charSequenceArr = {yo.getString("Arabic"), yo.getString("English"), yo.getString("French"), yo.getString("Spanish"), yo.getString("Italian"), yo.getString("Russian"), yo.getString("Portuguese"), yo.getString("Turkish"), yo.getString("Indonesian"), yo.getString("Hindi"), yo.getString("German"), yo.getString("Malay"), yo.getString("Urdu"), yo.getString("Vietnamese"), yo.getString("Gujarati"), yo.getString("Punjabi"), yo.getString("Tamil"), yo.getString("Bengali"), yo.getString("Marathi"), yo.getString("Telugu")};
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(yo.getString("Make_your_selection"));
            builder.setItems(charSequenceArr, AnonymousClass4.INSTANCE);
            builder.setCancelable(true);
            builder.create().show();
        }
    }
}
