package com.example.savvyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.savvyapplication.ArrayClasses.event;

import java.util.ArrayList;
import java.util.List;

public class whatup extends AppCompatActivity {

    private static int counter = 0 ;
    private TextView txt_day , txt_hours ,txt_free;
    private ImageView img_day;
    private RecyclerView MyRecViewEvents;
    private List<event> lstEvents1 , lstEvents2;
    Button counterbtn , counterbtn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatup);

        txt_day= (TextView)findViewById(R.id.txt_day_id);
        txt_hours=(TextView)findViewById(R.id.txt_time_id);
        txt_free=(TextView)findViewById(R.id.txt_free_id);
        img_day=(ImageView)findViewById(R.id.Img_day_id);
        counterbtn=(Button)findViewById(R.id.counterbtn);
        counterbtn2=(Button)findViewById(R.id.counterbtn);

        counterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
            }
        });



        if(counter==0){
            lstEvents1 = new ArrayList<>();
            lstEvents1.add(new event("קבוצות ריצה בחינם" ,"28 | Jan", "28 - 31 | Jan","20:00 – 21:00." ,"בואו להשתתף בקבוצות ריצה בחינם...", "מחזיקי כרטיס דיגיתל מוזמנים ליהנות מקבוצות ריצה בחינם! רוצו איתנו צעד אחר צעד. הקבוצות יכינו את הרצים להשתתפות במקצים שונים במרתונים ברחבי העיר בהתאם ליכולת הרצים." , "החשמל 14, תל אביב – יפו" ,"Free", R.drawable.x2));
            lstEvents1.add(new event("משחק חדר בריחה אורבני" ,"28 | Jan", "28 - 31 | Jan" ,"24/7" ,"״מתח גבוה״ הוא משחק חדר בריחה אורבני...", "״מתח גבוה״ הוא משחק חדר בריחה אורבני, המספר סיפורו של החשמל שהאיר את העיר תל-אביב. " , "החשמל 14, תל אביב – יפו" ,"Free", R.drawable.x1));
            lstEvents1.add(new event("תל-אופן" , "28 | Jan", "28 - 31 | Jan","24/7","מנוי שבועי יחיד לתל-אופן...", "מנוי שבועי יחיד לתל-אופן - מתנת הצטרפות.\n" + "למימוש ההטבה יש לבצע רישום באתר האינטרנט של תל-אופן" , "l" ,"מנוי שבועי", R.drawable.x3));

            txt_day.setText("TUE");
            txt_hours.setText("18:00 - 20:00");
            img_day.setImageResource(R.drawable.eightligh);

            MyRecViewEvents=(RecyclerView)findViewById(R.id.whatrec_id);
            Recviewadapterwhatup recadapter = new Recviewadapterwhatup(this,lstEvents1);
            MyRecViewEvents.setLayoutManager(new GridLayoutManager(this , 1));
            MyRecViewEvents.setAdapter(recadapter);
        }

        if(counter==1){
            lstEvents2 = new ArrayList<>();
            lstEvents2.add(new event(" מפגש שחמט" ,"30 | Jan", "30 | Jan " ,"17:00 - 19:00" ,"מפגש שחמט קהילתי בבית יד לבנים", "בואו לשחק שחמט עם השכנים והחברים, בבית יד לבנים." , "פנקס דוד צבי 63, תל אביב – יפו" ,"Free", R.drawable.x2));
            lstEvents2.add(new event("קונצרט" ,"30 | Jan", "30 | Jan"  ,"18:00 - 19:00" ,"קונצרט בהנחיית ד\"ר רון רגב", "\"באך - מוסיקה בת 300 שנה בראי הזמן\" יצירותיו של באך נכתבו עבור כלי נגינה שונים מאלה בהם אנו מנגנים כיום, ועבור קהל עם הרגלי האזנה שונים." , "טאגור רבינדרנת 26, תל אביב – יפו" ,"35 ש\"ח", R.drawable.u4));

            txt_day.setText("THU");
            txt_hours.setText("17:00 - 19:00");
            img_day.setImageResource(R.drawable.zerolight);

            MyRecViewEvents=(RecyclerView)findViewById(R.id.whatrec_id);
            Recviewadapterwhatup recadapter = new Recviewadapterwhatup(this,lstEvents2);
            MyRecViewEvents.setLayoutManager(new GridLayoutManager(this , 1));
            MyRecViewEvents.setAdapter(recadapter);
        }




    }
}
