package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    int imgno=0;
    int imgs[] = {R.drawable.info1,R.drawable.info2,R.drawable.info3,R.drawable.info4,R.drawable.info5};
    String txts[] = {"인간이 가장 잘하는 창조와 혁신을 마음껏 펼칠 수 있도록 하는 것이 목적입니다","자율 운송 기술은 차량뿐 아니라 다른 분야에 사용되고 있습니다.","종래의 로봇의 설치량이 감소했던 2019년에도 코봇 도입량은 12% 증가했습니다",
            "기계와 사람 간에 이루어지는 더욱 정교한 상호작용의 수요가 늘면서 로봇의 산업적 응용 범위가 빠르게 확대되고 있습니다.","AGV 제조업체에는 유진로봇에서 제공하는 것과 같은 SLAM과 주행이 통합된 시스템이 유용합니다. 유진은 Hantech 및 BH Systems 등의 제조업체와 긴밀히 협력하여 유진의 AMS-SLAM 및 주행 솔루션을 갖춘 진보된 AGV 및 AMR을 생산합니다."
            };
    ImageView img_info;
    TextView txt_info;
    Button btn_info_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img_info = findViewById(R.id.img_info);
        txt_info = findViewById(R.id.txt_info);
        btn_info_back = findViewById(R.id.btn_info_back);

        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_info:
                Log.d("TEST", "이미지 클릭");
                imgno = ++imgno%5;
                img_info.setImageResource(imgs[imgno]);
                txt_info.setText(txts[imgno]);
                break;
            case R.id.btn_info_back:
                Log.d("TEST","버튼 클릭");
                finish();
                break;
        }
    }
}