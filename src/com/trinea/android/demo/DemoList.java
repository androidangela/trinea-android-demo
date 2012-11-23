package com.trinea.android.demo;

import java.util.Arrays;
import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * demo list 列表
 * 
 * @author Trinea 2012-6-17 下午06:14:57
 */
public class DemoList extends Activity {

    private static final String[] mStrings = { "Gallery Demo", "ViewPager Demo", "Google Map Demo", "Baidu Map Demo",
            "Intent Demo", "Service Demo", "BroadcastReceiver Demo", "短信 Demo", "通知栏 Demo" };

    private static final int      total    = mStrings.length - 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_list);

        LinkedList<String> mListItems = new LinkedList<String>();
        mListItems.addAll(Arrays.asList(mStrings));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListItems);

        ListView demoListView = (ListView)findViewById(R.id.simpleListView);
        demoListView.setAdapter(adapter);
        demoListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == total - 8) {
                    Intent intent = new Intent(DemoList.this, GalleryDemo.class);
                    startActivity(intent);
                } else if (position == total - 7) {
                    Intent intent = new Intent(DemoList.this, ViewPagerDemo.class);
                    startActivity(intent);
                } else if (position == total - 6) {
                    Intent intent = new Intent(DemoList.this, GoogleMapDemo.class);
                    startActivity(intent);
                } else if (position == total - 5) {
                    Intent intent = new Intent(DemoList.this, BaiduMapDemo.class);
                    startActivity(intent);
                } else if (position == total - 4) {
                    Intent intent = new Intent(DemoList.this, IntentDemo.class);
                    startActivity(intent);
                } else if (position == total - 3) {
                    Intent intent = new Intent(DemoList.this, ServiceDemo.class);
                    startActivity(intent);
                } else if (position == total - 2) {
                    Intent intent = new Intent(DemoList.this, BroadcastReceiverDemo.class);
                    startActivity(intent);
                } else if (position == total - 1) {
                    Intent intent = new Intent(DemoList.this, SmsManagerDemo.class);
                    startActivity(intent);
                } else if (position == total) {
                    Intent intent = new Intent(DemoList.this, NotificationDemo.class);
                    startActivity(intent);
                }
            }
        });
    }
}
