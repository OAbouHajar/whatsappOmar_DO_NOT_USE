package com.obwhatsapp.yo.x;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.Conversation;

final class dg implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ df f110a;

    dg(df dfVar) {
        this.f110a = dfVar;
    }

    public static void openChat(Context context, String str) {
        try {
            Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"_id"}, "data1=?", new String[]{str}, (String) null);
            if (query.moveToFirst() && query.getCount() > 0) {
                query.moveToFirst();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("content://com.android.contacts/data/" + query.getString(0)));
                if (str.contains("@g.us")) {
                    intent = new Intent(context, Conversation.class);
                }
                try {
                    intent.putExtra("jid", str);
                    intent.addFlags(335544320);
                    intent.setPackage("com.obwhatsapp");
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e2) {
                    e2.printStackTrace();
                }
                query.close();
            }
        } catch (CursorIndexOutOfBoundsException e3) {
            e3.printStackTrace();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        String[] split = ((String) this.f110a.f108a.f116e.get(i2)).split("@")[0].split(" ");
        String replace = split[split.length - 1].replace("jid=", "");
        try {
            openChat(this.f110a.f108a, replace.contains("-") ? String.valueOf(replace) + "@g.us" : String.valueOf(replace) + "@s.whatsapp.net");
        } catch (Exception e2) {
        }
    }
}
