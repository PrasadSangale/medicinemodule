package com.example.medicinemodule;

import static com.example.medicinemodule.R.id.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] medicines = {"Ibuprofen","Acetaminophen","Aspirin","Metformin","Lipitor (Atorvastatin)","Zoloft (Sertraline)","Prozac (Fluoxetine)","Albuterol","Benadryl (Diphenhydramine)","Claritin (Loratadine)","Omeprazole","Lisinopril","Warfarin","Metoprolol","Tramadol"};

        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,medicines);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        String[] meddesc= {"1.Ibuprofen - A pain reliever and anti-inflammatory medication used to treat headaches, muscle aches, menstrual cramps, and fever.",
                "2. Acetaminophen - A pain reliever and fever reducer that is commonly used to treat minor aches and pains, headaches, and fever.",
                "3. Aspirin - A medication that can relieve pain, reduce fever, and has anti-inflammatory properties. It is also used to reduce the risk of heart attack or stroke in some patients.",
                "4. Metformin - An oral medication used to treat type 2 diabetes by regulating blood sugar levels.",
                "5. Lipitor (Atorvastatin) - A medication used to lower high cholesterol levels and reduce the risk of heart disease.",
                "6. Zoloft (Sertraline) - An antidepressant medication used to treat depression, anxiety, and other mood disorders.",
                "7. Prozac (Fluoxetine) - Another antidepressant medication used to treat depression, anxiety, and other mood disorders.",
                "8. Albuterol - A bronchodilator medication used to treat asthma and other respiratory conditions by opening up the airways.",
                "9. Benadryl (Diphenhydramine) - An antihistamine medication used to relieve allergy symptoms such as sneezing, itching, and runny nose.",
                "10. Claritin (Loratadine) - Another antihistamine medication used to treat allergy symptoms, but with fewer sedative side effects than Benadryl.",
                "11. Omeprazole - A medication used to reduce stomach acid production and treat conditions such as heartburn and acid reflux.",
                "12. Lisinopril - An ACE inhibitor medication used to treat high blood pressure and congestive heart failure.",
                "13. Warfarin - An anticoagulant medication used to prevent blood clots and reduce the risk of stroke and heart attack.",
                "14. Metoprolol - A beta-blocker medication used to treat high blood pressure, angina, and other heart conditions.",
                "15. Tramadol - A prescription pain medication used to treat moderate to severe pain."};

        @SuppressLint("MissingInflatedId") ListView listView=findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,meddesc);
        listView.setAdapter(arrayAdapter);


    }
}