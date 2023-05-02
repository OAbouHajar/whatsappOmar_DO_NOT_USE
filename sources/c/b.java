package c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.google.gson.internal.f;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.collections.observablelistview.ObservableListView;
import com.obwhatsapp.yo.ChatGenSingle;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.autoschedreply.AutoMessageAdapter;
import com.obwhatsapp.yo.autoschedreply.AutoMsg;
import com.obwhatsapp.yo.autoschedreply.Auto_message;
import com.obwhatsapp.yo.autoschedreply.object_automsg;
import com.obwhatsapp.yo.c1;
import com.obwhatsapp.yo.f0;
import com.obwhatsapp.yo.j;
import com.obwhatsapp.yo.k;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.yo.z0;
import com.obwhatsapp.youbasha.ui.themeserver.SingleItemView;
import com.obwhatsapp.youbasha.ui.views.CustomListAdapter;
import com.obwhatsapp.youbasha.ui.views.c;
import q.d;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f183a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f184b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f185c;

    public /* synthetic */ b(Object obj, Object obj2, int i2) {
        this.f183a = i2;
        this.f184b = obj;
        this.f185c = obj2;
    }

    public final void onClick(View view) {
        int i2 = this.f183a;
        Object obj = this.f185c;
        Object obj2 = this.f184b;
        switch (i2) {
            case 0:
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) obj2;
                int i3 = DefaultErrorActivity.f219a;
                defaultErrorActivity.getClass();
                CustomActivityOnCrash.closeApplication(defaultErrorActivity, (CustomActivityOnCrash.EventListener) obj);
                return;
            case 1:
                ChatGenSingle.SingleUserMessagesAdapter singleUserMessagesAdapter = (ChatGenSingle.SingleUserMessagesAdapter) obj2;
                f0 f0Var = (f0) obj;
                int i4 = ChatGenSingle.SingleUserMessagesAdapter.f484c;
                singleUserMessagesAdapter.getClass();
                long j2 = f0Var.f760a;
                ChatGenSingle chatGenSingle = singleUserMessagesAdapter.f486b;
                Intent intent = (Intent) chatGenSingle.getIntent().getParcelableExtra(Deobfuscator$app$Custom.getString(-1231001320897L));
                String str = "۟ۗۙۜۜۗۦ۟ۘۘ۫ۨۛۛ۬ۖ۟ۦۚۡۚۛ";
                while (true) {
                    switch (str.hashCode() ^ -1857212025) {
                        case -1752899166:
                            intent.putExtra(Deobfuscator$app$Custom.getString(-1299720797633L), j2);
                            intent.putExtra(Deobfuscator$app$Custom.getString(-1329785568705L), j2);
                            intent.putExtra(Deobfuscator$app$Custom.getString(-1364145307073L), f0Var.f763d);
                            intent.putExtra(Deobfuscator$app$Custom.getString(-1424274849217L), false);
                            chatGenSingle.startActivity(intent);
                            return;
                        case -1744866812:
                            return;
                        case -489780030:
                            if (intent == null) {
                                str = "۠ۨ۬ۚ۫ۖۘ۠ۤۙۗ۬ۨۘۗۤ۠۠ۨۗ۠ۤۜۛۗۥۖۘۧۘ";
                                break;
                            } else {
                                str = "۬ۥۘۦ۬ۨ۬ۛۨۘۙۙۦۦۙۛ۠۠ۨۘۚۙۘۘ";
                                break;
                            }
                        case 2084637076:
                            str = "ۧ۟۟ۙۗۙۖۥۦۘۙۦ۠ۚ۟ۖۘ";
                            break;
                    }
                }
                break;
            case 2:
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                Conversation.c(activity, str2);
                Handler handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new k(activity, str2, 0), 3500);
                handler.postDelayed(new k(activity, str2, 1), 7500);
                handler.postDelayed(new k(activity, str2, 2), 11000);
                return;
            case 3:
                View view2 = (View) obj2;
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                int i5 = Conversation.f512a;
                try {
                    View inflate = LayoutInflater.from(view2.getContext()).inflate(yo.getID("sticker_picker_item", "layout"), (ViewGroup) null);
                    ((ImageView) ((ViewGroup) inflate).getChildAt(0)).setImageDrawable(((ImageView) ((ViewGroup) view2).getChildAt(0)).getDrawable());
                    new CustomAlertDialogBuilder(view2.getContext()).setTitle((CharSequence) yo.getString("msg_store_confirm")).setView(inflate).setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(0)).setPositiveButton((CharSequence) yo.getString("send_button"), (DialogInterface.OnClickListener) new j(onClickListener, view2, 0)).show();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    onClickListener.onClick(view2);
                    return;
                }
            case 4:
                AutoMessageAdapter autoMessageAdapter = (AutoMessageAdapter) obj2;
                object_automsg object_automsg = (object_automsg) obj;
                int i6 = AutoMessageAdapter.f627b;
                autoMessageAdapter.getClass();
                Auto_message auto_message = autoMessageAdapter.f628a;
                Intent intent2 = new Intent(auto_message, AutoMsg.class);
                intent2.putExtra("edit", "yes");
                intent2.putExtra("receive_edittext", object_automsg.getReceived_message());
                intent2.putExtra("reply_edittext", object_automsg.getReply_message());
                intent2.putExtra("daley_edittext", object_automsg.getReply_delay());
                intent2.putExtra("startTime_edittext", object_automsg.getStart_time());
                intent2.putExtra("endTime_edittext", object_automsg.getEnd_time());
                intent2.putExtra("match_radio", object_automsg.getPattern_matching());
                intent2.putExtra("receiver_radio", object_automsg.getRecipients());
                intent2.putExtra("id", object_automsg.get_id());
                intent2.putExtra("specific", object_automsg.getSpecific());
                intent2.putExtra("ignored", object_automsg.getIgnored());
                auto_message.startActivity(intent2);
                return;
            case 5:
                String str3 = z0.f925i;
                ((ObservableListView) obj2).removeHeaderView((View) obj);
                return;
            case 6:
                f fVar = ((d) obj2).f2397c;
                fVar.f401d = (q.b) obj;
                new CustomAlertDialogBuilder((Context) fVar.f400c).setTitle((CharSequence) ((q.b) fVar.f401d).f2381a).setMessage(yo.getString(Deobfuscator$app$Custom.getString(-27730949537217L))).setNegativeButton(17039369, new com.obwhatsapp.youbasha.ui.views.b(1)).setPositiveButton(17039379, new d(fVar, 17)).create().show();
                return;
            case 7:
                d dVar = (d) obj2;
                int i7 = d.f2392e;
                dVar.getClass();
                Context context = dVar.f2395a;
                Intent intent3 = new Intent(context, SingleItemView.class);
                intent3.putExtra("url", (String) obj);
                context.startActivity(intent3);
                return;
            default:
                CustomListAdapter customListAdapter = (CustomListAdapter) obj2;
                c cVar = (c) obj;
                Activity activity2 = customListAdapter.f1345a;
                try {
                    String string = yo.getString("delete");
                    new CustomAlertDialogBuilder(activity2).setTitle((CharSequence) string).setPositiveButton((CharSequence) string, (DialogInterface.OnClickListener) new c1(customListAdapter, cVar, 6)).setNegativeButton(17039360, (DialogInterface.OnClickListener) new com.obwhatsapp.youbasha.ui.views.b(0)).create().show();
                    return;
                } catch (Exception e3) {
                    Toast.makeText(activity2, "Error", 0).show();
                    e3.printStackTrace();
                    return;
                }
        }
    }
}
