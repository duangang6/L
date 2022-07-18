package com.example.l;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.l.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

        ListView listView;
        ArrayList<HashMap<String, Object>> list;
        int[] icon={R.drawable.pinglun, R.drawable.shoucang, R.drawable.weixin,R.drawable.xiazai, R.drawable.zhuanfa, R.drawable.shezhi};
        String[] title={"服务", "收藏", "朋友圈","卡包", "表情", "设置"};
        int icon1 = R.drawable.zhishi;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            listView =(ListView)findViewById(R.id.ls);
            list= initDatas();

            SimpleAdapter adapter= new SimpleAdapter(this, list, R.layout.item, new String[]{"img","name","img1"}, new int[]{R.id.imageView3, R.id.textView3, R.id.imageView4});
            listView.setAdapter(adapter);
        }

        private ArrayList<HashMap<String,Object>> initDatas() {
            ArrayList<HashMap<String, Object>> tmplist=new ArrayList<>();

            for(int i=0; i<6; i++){
                HashMap<String, Object> map= new HashMap<>();
                map.put("img", icon[i]);
                map.put("name", title[i]);
                map.put("img1", icon1);
                tmplist.add(map);
            }
            return  tmplist;
        }


    }
