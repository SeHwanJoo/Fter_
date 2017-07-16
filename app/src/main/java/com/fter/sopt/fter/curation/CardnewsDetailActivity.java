//package com.fter.sopt.fter.curation;
//
//import android.content.Intent;
//import android.graphics.BitmapFactory;
//import android.graphics.drawable.BitmapDrawable;
//import android.graphics.drawable.Drawable;
//import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.fter.sopt.fter.R;
//
////////////////////혜민_큐레이션 상세보기 페이지
//public class CardnewsDetailActivity extends ActionBarActivity {
//
//    int id;
//    TextView title_cardnews;
//    ImageView detailimg1,detailimg2, detailimg3, detailimg4, detailimg5, detailimg6, detailimg7, detailimg8 ,detailimg9,
//            detailimg10,detailimg11,detailimg12,detailimg13,detailimg14,detailimg15,detailimg16,detailimg17,detailimg18,
//            detailimg19,detailimg20,detailimg21,detailimg22,detailimg23,detailimg24,detailimg25;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_cardnews_detail);
//
//        title_cardnews = (TextView)findViewById(R.id.txtLinkRoom);
//
//        detailimg1 = (ImageView) findViewById(R.id.detailpic1);
//        detailimg2 = (ImageView) findViewById(R.id.detailpic2);
//        detailimg3 = (ImageView) findViewById(R.id.detailpic3);
//        detailimg4 = (ImageView) findViewById(R.id.detailpic4);
//        detailimg5 = (ImageView) findViewById(R.id.detailpic5);
//        detailimg6 = (ImageView) findViewById(R.id.detailpic6);
//        detailimg7 = (ImageView) findViewById(R.id.detailpic7);
//        detailimg8 = (ImageView) findViewById(R.id.detailpic8);
//        detailimg9 = (ImageView) findViewById(R.id.detailpic9);
//        detailimg10 = (ImageView) findViewById(R.id.detailpic10);
//        detailimg11 = (ImageView) findViewById(R.id.detailpic11);
//        detailimg12 = (ImageView) findViewById(R.id.detailpic12);
//        detailimg13 = (ImageView) findViewById(R.id.detailpic13);
//        detailimg14 = (ImageView) findViewById(R.id.detailpic14);
//        detailimg15 = (ImageView) findViewById(R.id.detailpic15);
//        detailimg16 = (ImageView) findViewById(R.id.detailpic16);
//        detailimg17 = (ImageView) findViewById(R.id.detailpic17);
//        detailimg18 = (ImageView) findViewById(R.id.detailpic18);
//        detailimg19 = (ImageView) findViewById(R.id.detailpic19);
//        detailimg20 = (ImageView) findViewById(R.id.detailpic20);
//        detailimg21 = (ImageView) findViewById(R.id.detailpic21);
//        detailimg22 = (ImageView) findViewById(R.id.detailpic22);
//        detailimg23 = (ImageView) findViewById(R.id.detailpic23);
//        detailimg24 = (ImageView) findViewById(R.id.detailpic24);
//        detailimg25 = (ImageView) findViewById(R.id.detailpic25);
//
//
//        Intent intent = getIntent();
//        id = intent.getIntExtra("ID",0);
//
//        BitmapFactory.Options options = new BitmapFactory.Options();
//
//        options.inSampleSize = 2;
//
//        if((id==1)){
//            // detailimg1.setBackground(this.getResources().getDrawable(R.drawable.profile_4));
//            Log.i("Mytag", "" + "if1");
//            //detailimg1.setBackground(new ColorDrawable(0xff6dc6d2));
//
//
//            title_cardnews.setText("서울 무료 공간 대여 TOP5");
//            detailimg1.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_1,options));
//            detailimg2.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_2,options));
//            detailimg3.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_3,options));
//            detailimg4.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_4,options));
//            detailimg5.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_5,options));
//            detailimg6.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_6,options));
//            detailimg7.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_7,options));
//            detailimg8.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_8,options));
//            detailimg9.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card1_9,options));
//            detailimg10.setVisibility(View.GONE);
//            detailimg11.setVisibility(View.GONE);
//            detailimg12.setVisibility(View.GONE);
//            detailimg13.setVisibility(View.GONE);
//            detailimg14.setVisibility(View.GONE);
//            detailimg15.setVisibility(View.GONE);
//            detailimg16.setVisibility(View.GONE);
//            detailimg17.setVisibility(View.GONE);
//            detailimg18.setVisibility(View.GONE);
//            detailimg19.setVisibility(View.GONE);
//            detailimg20.setVisibility(View.GONE);
//            detailimg21.setVisibility(View.GONE);
//            detailimg22.setVisibility(View.GONE);
//            detailimg23.setVisibility(View.GONE);
//            detailimg24.setVisibility(View.GONE);
//            detailimg25.setVisibility(View.GONE);
//
//            //이런식으로 이미지 25장에 해당하는 거 디자인한테 받아와서 뿌려주기 테스트 해보려고 저렇게 넣엇삼
//            //이전 페이지에서 int로 숫자를 구분해서 넘겨줌
//            //detailimg1.setBackground();
//
//        }else if(id==2){
//            title_cardnews.setText("앱 기획자가 알면 좋은 개발 용어 모음");
//
//
//            detailimg1.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_1,options));
//            detailimg2.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_2,options));
//            detailimg3.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_3,options));
//            detailimg4.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_4,options));
//            detailimg5.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_5,options));
//            detailimg6.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_6,options));
//            detailimg7.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_7,options));
//            detailimg8.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_8,options));
//            detailimg9.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_9,options));
//            detailimg10.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_10,options));
//            detailimg11.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_11,options));
//            detailimg12.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card2_12,options));
//            detailimg12.setVisibility(View.GONE);
//            detailimg13.setVisibility(View.GONE);
//            detailimg14.setVisibility(View.GONE);
//            detailimg15.setVisibility(View.GONE);
//            detailimg16.setVisibility(View.GONE);
//            detailimg17.setVisibility(View.GONE);
//            detailimg18.setVisibility(View.GONE);
//            detailimg19.setVisibility(View.GONE);
//            detailimg20.setVisibility(View.GONE);
//            detailimg21.setVisibility(View.GONE);
//            detailimg22.setVisibility(View.GONE);
//            detailimg23.setVisibility(View.GONE);
//            detailimg24.setVisibility(View.GONE);
//            detailimg25.setVisibility(View.GONE);
//
//
//            //detailimg10.setBackground(this.getResources().getDrawable(R.drawable.profile_4));
//            //detailimg10.setBackground(new ColorDrawable(0xff6dc6d2));
//            Log.i("Mytag", "" + "if2");
//        }else if(id==3){
//            title_cardnews.setText("스타트업 사람들이 보면 좋은 영화 TOP7");
//
//            detailimg1.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_1,options));
//            detailimg2.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_2,options));
//            detailimg3.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_3,options));
//            detailimg4.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_4,options));
//            detailimg5.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_5,options));
//            detailimg6.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_6,options));
//            detailimg7.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_7,options));
//            detailimg8.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_8,options));
//            detailimg9.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_9,options));
//            detailimg10.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_10,options));
//            detailimg11.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_11,options));
//            detailimg12.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_12,options));
//            detailimg13.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_13,options));
//            detailimg14.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_14,options));
//            detailimg15.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card3_15,options));
//            detailimg16.setVisibility(View.GONE);
//            detailimg17.setVisibility(View.GONE);
//            detailimg18.setVisibility(View.GONE);
//            detailimg19.setVisibility(View.GONE);
//            detailimg20.setVisibility(View.GONE);
//            detailimg21.setVisibility(View.GONE);
//            detailimg22.setVisibility(View.GONE);
//            detailimg23.setVisibility(View.GONE);
//            detailimg24.setVisibility(View.GONE);
//            detailimg25.setVisibility(View.GONE);
//
//
//            //마찬가지로 위의 주석처럼 이미지 넣어주세요
//        }else if(id==4){
//
//            title_cardnews.setText("디자이너가 빡치는 순간 TOP5");
//
//
//            detailimg1.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_1,options));
//            detailimg2.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_2,options));
//            detailimg3.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_3,options));
//            detailimg4.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_4,options));
//            detailimg5.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_5,options));
//            detailimg6.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_6,options));
//            detailimg7.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_7,options));
//            detailimg8.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_8,options));
//            detailimg9.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_9,options));
//            detailimg10.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_10,options));
//            detailimg11.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card4_11,options));
//            detailimg12.setVisibility(View.GONE);
//            detailimg13.setVisibility(View.GONE);
//            detailimg14.setVisibility(View.GONE);
//            detailimg15.setVisibility(View.GONE);
//            detailimg16.setVisibility(View.GONE);
//            detailimg17.setVisibility(View.GONE);
//            detailimg18.setVisibility(View.GONE);
//            detailimg19.setVisibility(View.GONE);
//            detailimg20.setVisibility(View.GONE);
//            detailimg21.setVisibility(View.GONE);
//            detailimg22.setVisibility(View.GONE);
//            detailimg23.setVisibility(View.GONE);
//            detailimg24.setVisibility(View.GONE);
//            detailimg25.setVisibility(View.GONE);
//
//
//            //마찬가지로 위의 주석처럼 이미지 넣어주세요
//        }else if(id==5){
//
//
//            title_cardnews.setText("햄버거는 리필 안되나요?");
//
//            detailimg1.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_1,options));
//            detailimg2.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_2,options));
//            detailimg3.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_3,options));
//            detailimg4.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_4,options));
//            detailimg5.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_5,options));
//            detailimg6.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_6,options));
//            detailimg7.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_7,options));
//            detailimg8.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_8,options));
//            detailimg9.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_9,options));
//            detailimg10.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_10,options));
//            detailimg11.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_11,options));
//            detailimg12.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_12,options));
//            detailimg13.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_13,options));
//            detailimg14.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_14,options));
//            detailimg15.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_15,options));
//            detailimg16.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_16,options));
//            detailimg17.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_17,options));
//            detailimg18.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_18,options));
//            detailimg19.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_19,options));
//            detailimg20.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_20,options));
//            detailimg21.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_21,options));
//            detailimg22.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_22,options));
//            detailimg23.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card5_23,options));
//            detailimg24.setVisibility(View.GONE);
//            detailimg25.setVisibility(View.GONE);
//            //마찬가지로 위의 주석처럼 이미지 넣어주세요
//        }else if (id==6){
//            title_cardnews.setText("2017년 떠오르는 10대기술");
//
//            detailimg1.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_1,options));
//            detailimg2.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_2,options));
//            detailimg3.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_3,options));
//            detailimg4.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_4,options));
//            detailimg5.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_5,options));
//            detailimg6.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_6,options));
//            detailimg7.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_7,options));
//            detailimg8.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_8,options));
//            detailimg9.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_9,options));
//            detailimg10.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.card6_10,options));
//            detailimg11.setVisibility(View.GONE);
//            detailimg12.setVisibility(View.GONE);
//            detailimg13.setVisibility(View.GONE);
//            detailimg14.setVisibility(View.GONE);
//            detailimg15.setVisibility(View.GONE);
//            detailimg16.setVisibility(View.GONE);
//            detailimg17.setVisibility(View.GONE);
//            detailimg18.setVisibility(View.GONE);
//            detailimg19.setVisibility(View.GONE);
//            detailimg20.setVisibility(View.GONE);
//            detailimg21.setVisibility(View.GONE);
//            detailimg22.setVisibility(View.GONE);
//            detailimg23.setVisibility(View.GONE);
//            detailimg24.setVisibility(View.GONE);
//            detailimg25.setVisibility(View.GONE);
//        }
//    }
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        recycleView(findViewById(R.id.detailpic1));
//        recycleView(findViewById(R.id.detailpic2));
//        recycleView(findViewById(R.id.detailpic3));
//        recycleView(findViewById(R.id.detailpic4));
//        recycleView(findViewById(R.id.detailpic5));
//        recycleView(findViewById(R.id.detailpic6));
//        recycleView(findViewById(R.id.detailpic7));
//        recycleView(findViewById(R.id.detailpic8));
//        recycleView(findViewById(R.id.detailpic9));
//        recycleView(findViewById(R.id.detailpic11));
//        recycleView(findViewById(R.id.detailpic12));
//        recycleView(findViewById(R.id.detailpic13));
//        recycleView(findViewById(R.id.detailpic14));
//        recycleView(findViewById(R.id.detailpic15));
//        recycleView(findViewById(R.id.detailpic16));
//        recycleView(findViewById(R.id.detailpic17));
//        recycleView(findViewById(R.id.detailpic18));
//        recycleView(findViewById(R.id.detailpic19));
//        recycleView(findViewById(R.id.detailpic20));
//        recycleView(findViewById(R.id.detailpic21));
//        recycleView(findViewById(R.id.detailpic22));
//        recycleView(findViewById(R.id.detailpic23));
//        recycleView(findViewById(R.id.detailpic24));
//        recycleView(findViewById(R.id.detailpic25));
//    }
//    private void recycleView(View view) {
//        if (view != null) {
//            Drawable bg = view.getBackground();
//            if (bg != null) {
//                bg.setCallback(null);
//                ((BitmapDrawable) bg).getBitmap().recycle();
//                view.setBackgroundDrawable(null);
//            }
//        }
//    }
//}