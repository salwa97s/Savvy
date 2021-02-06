package com.example.savvyapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savvyapplication.ArrayClasses.event;
import com.example.savvyapplication.ArrayClasses.freetime;
import com.example.savvyapplication.R;
import com.example.savvyapplication.RecviewadapterEvents;
import com.example.savvyapplication.RecviewadapterEventsSlide;
import com.example.savvyapplication.RecviewadapterFreetime;

import java.util.ArrayList;
import java.util.List;

public class EventFragment extends Fragment {

    View v ;
    private RecyclerView MyRecViewEvents , MyRecViewSlide;
    private List<event> lstEvents  , lstEventsStudent , lstEventsMom ;

    public EventFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_event,container,false);

        //events !!
        MyRecViewEvents=(RecyclerView)v.findViewById(R.id.Eventsrec_id);
        RecviewadapterEvents recadapter = new RecviewadapterEvents(getContext(),lstEventsStudent);
        MyRecViewEvents.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyRecViewEvents.setAdapter(recadapter);


        //slide !!
        MyRecViewSlide=(RecyclerView)v.findViewById(R.id.Picrec_id);
        RecviewadapterEventsSlide recadapter2 = new RecviewadapterEventsSlide(getContext(),lstEventsStudent);
        MyRecViewSlide.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false )) ;
        MyRecViewSlide.setAdapter(recadapter2);

        return v;
    }

              //lstEvents.add(new event("t" ,"d", "d t " ,"t" ,"s", "l" , "l" ,"Free", R.drawable.x1));
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        lstEvents = new ArrayList<>();
        lstEvents.add(new event("מוזיאון ארץ-ישראל" ,"28 | Jan", "28 - 31 | Jan" ,"8:00 - 19:00" ,"כרטיס כניסה חינם ליחיד למוזיאון...", "כרטיס כניסה חינם ליחיד למוזיאון ולפלנטריום במוזיאון ארץ-ישראל - מתנת הצטרפות" , "לבנון חיים 2, תל אביב – יפו" ,"Free", R.drawable.u1));
        lstEvents.add(new event("הרצאה מוזיקלית הביאדרה" ,"28 | Jan", "28 | Jan"  ,"11:15 - 12:45" ,"הרצאה מוזיקלית הביאדרה - רקדנית המקדש", "זוהי יצירה לבלט, המתארת סיפור מלודרמטי המתרחש בהודו על פי ספרו של סרגיי חודקוב.\n" + "סיפור היצירה מדבר על אהבה, בגידה, רגשות והעל טבעי. \u200B" , "ארלוזורוב 106, תל אביב – יפו" ,"25 ש\"ח", R.drawable.u2));
        lstEvents.add(new event("שירים שאהבנו" ,"29 | Jan", "29 | Jan" ,"17:00 - 17:45" ,"שירים שאהבנו - מופע מוסיקלי לילדים", "מופע מוסיקלי קסום וסוחף לכל המשפחה עם כל הריקודים ושירי הילדות הנפלאים שכולנו אוהבים - גם הילדים וגם ההורים!" , "חריף אייזיק 23, תל אביב – יפו" ,"Free", R.drawable.u3));
        lstEvents.add(new event("קונצרט" ,"30 | Jan", "30 | Jan"  ,"18:00 - 19:00" ,"קונצרט בהנחיית ד\"ר רון רגב", "\"באך - מוסיקה בת 300 שנה בראי הזמן\" יצירותיו של באך נכתבו עבור כלי נגינה שונים מאלה בהם אנו מנגנים כיום, ועבור קהל עם הרגלי האזנה שונים." , "טאגור רבינדרנת 26, תל אביב – יפו" ,"35 ש\"ח", R.drawable.u4));
        lstEvents.add(new event("דיגיטף בספריית שרמן" ,"30 | Jan", "30 | Jan"  ,"17:15 - 18:00" ,"סדנת יצירת בובות להורים ולילדים", "\u200Bסדנא ליצירת דמויות שובבות המשמשות למשחק ולתמונה מדליקה. " , "ישראל מסלנט 27, תל אביב – יפו" ,"Free", R.drawable.u1));
        lstEvents.add(new event("יוגה" ,"31 | Jan", "31 | Jan" ,"10:00" ,"ספורט ובריאות יוגה על גג עיריית תל-אביב-יפו", "יוגה על גג עיריית תל-אביב-יפו\n" + "במידה ויירד גשם הפעילות תתקיים בלובי העירייה ו/או במקום מקורה אחר." , "אבן גבירול 69, תל אביב – יפו" ,"Free", R.drawable.u2));

        // student !!

        lstEventsStudent = new ArrayList<>();
        lstEventsStudent.add(new event("משחק חדר בריחה אורבני" ,"28 | Jan", "28 - 31 | Jan" ,"24/7" ,"״מתח גבוה״ הוא משחק חדר בריחה אורבני...", "״מתח גבוה״ הוא משחק חדר בריחה אורבני, המספר סיפורו של החשמל שהאיר את העיר תל-אביב. " , "החשמל 14, תל אביב – יפו" ,"Free", R.drawable.x1));
        lstEventsStudent.add(new event("קבוצות ריצה בחינם" ,"28 | Jan", "28 - 31 | Jan","20:00 – 21:00." ,"בואו להשתתף בקבוצות ריצה בחינם...", "מחזיקי כרטיס דיגיתל מוזמנים ליהנות מקבוצות ריצה בחינם! רוצו איתנו צעד אחר צעד. הקבוצות יכינו את הרצים להשתתפות במקצים שונים במרתונים ברחבי העיר בהתאם ליכולת הרצים." , "החשמל 14, תל אביב – יפו" ,"Free", R.drawable.x2));
        lstEventsStudent.add(new event("תל-אופן" , "28 | Jan", "28 - 31 | Jan","24/7","מנוי שבועי יחיד לתל-אופן...", "מנוי שבועי יחיד לתל-אופן - מתנת הצטרפות.\n" + "למימוש ההטבה יש לבצע רישום באתר האינטרנט של תל-אופן" , "l" ,"מנוי שבועי", R.drawable.x3));
        lstEventsStudent.add(new event("מופע הומאז' לשאנסון הצרפתי" ,"29 | Jan", "29 | Jan" ,"19:30 - 20:30" ,"מופע הומאז' לשאנסון הצרפתי - פיאף", "ד\"ר מאיה גז וזמרת הסופרן אירית שטרק במופע סוחף מלהיב וחד פעמי.\n" + " הקהל מוזמן להצטרף לשירה בעברית ובצרפתית" , "טאגור רבינדרנת 26, תל אביב – יפו" ,"50 ש\"ח", R.drawable.u2));
        lstEventsStudent.add(new event(" מפגש שחמט" ,"30 | Jan", "30 | Jan " ,"17:00 - 19:00" ,"מפגש שחמט קהילתי בבית יד לבנים", "בואו לשחק שחמט עם השכנים והחברים, בבית יד לבנים." , "פנקס דוד צבי 63, תל אביב – יפו" ,"Free", R.drawable.x2));
        lstEventsStudent.add(new event("קונצרט" ,"30 | Jan", "30 | Jan"  ,"18:00 - 19:00" ,"קונצרט בהנחיית ד\"ר רון רגב", "\"באך - מוסיקה בת 300 שנה בראי הזמן\" יצירותיו של באך נכתבו עבור כלי נגינה שונים מאלה בהם אנו מנגנים כיום, ועבור קהל עם הרגלי האזנה שונים." , "טאגור רבינדרנת 26, תל אביב – יפו" ,"35 ש\"ח", R.drawable.u2));

        lstEventsMom = new ArrayList<>();



    }
}
