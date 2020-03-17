package com.example.myspinners;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    String[] spinners = {"Виберіть предмет:", "Українська мова", "Українська література", "Математика", "Хімія", "Біологія", "Фізика"};
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final EditText editText6 = (EditText) findViewById(R.id.editText6);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        final Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        final Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        final Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        final Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        final int maxLength = 0;
        final int maxLength2 = 2;


        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinners);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
        spinner2.setAdapter(spinnerArrayAdapter);
        spinner3.setAdapter(spinnerArrayAdapter);
        spinner4.setAdapter(spinnerArrayAdapter);
        spinner5.setAdapter(spinnerArrayAdapter);
        spinner6.setAdapter(spinnerArrayAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner.setSelection(0);
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner.setSelection(0);
                } else if (position == 1 | position == 2 | position == 3 | position == 4 | position == 5 | position == 6) {
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength2)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner2.setSelection(0);
                    editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
                } else if (position == spinner.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner2.setSelection(0);
                } else if (position == 1 | position == 2 | position == 3 | position == 4 | position == 5 | position == 6) {
                    editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength2)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner3.setSelection(0);
                    editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
                } else if (position == spinner.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner3.setSelection(0);
                } else if (position == 1 | position == 2 | position == 3 | position == 4 | position == 5 | position == 6) {
                    editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength2)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner4.setSelection(0);
                    editText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
                } else if (position == spinner.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner4.setSelection(0);
                } else if (position == 1 | position == 2 | position == 3 | position == 4 | position == 5 | position == 6) {
                    editText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength2)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner5.setSelection(0);
                    editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
                } else if (position == spinner.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == spinner6.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner5.setSelection(0);
                } else if (position == 1 | position == 2 | position == 3 | position == 4 | position == 5 | position == 6) {
                    editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength2)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (position == 0) {
                    spinner6.setSelection(0);
                    editText6.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
                } else if (position == spinner.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner2.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner3.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner4.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == spinner5.getSelectedItemPosition()) {
                    Toast.makeText(parent.getContext(), R.string.textMe, Toast.LENGTH_SHORT).show();
                    spinner6.setSelection(0);
                } else if (position == 1 | position == 2 | position == 3 | position == 4 | position == 5 | position == 6) {
                    editText6.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength2)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

    }

    @Override
    public void onClick(View v) {
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        final EditText editText3 = findViewById(R.id.editText3);
        final EditText editText4 = findViewById(R.id.editText4);
        final EditText editText5 = findViewById(R.id.editText5);
        final EditText editText6 = findViewById(R.id.editText6);
        Spinner spinner = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);
        Spinner spinner3 = findViewById(R.id.spinner3);
        Spinner spinner4 = findViewById(R.id.spinner4);
        Spinner spinner5 = findViewById(R.id.spinner5);
        Spinner spinner6 = findViewById(R.id.spinner6);
        String e = editText.getText().toString();
        String e2 = editText2.getText().toString();
        String e3 = editText3.getText().toString();
        String e4 = editText4.getText().toString();
        String e5 = editText5.getText().toString();
        String e6 = editText6.getText().toString();
        int a = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0;
        if (!"".equals(e)) {
            a = Integer.parseInt(e);
        }
        if (!"".equals(e2)) {
            a2 = Integer.parseInt(e2);
        }
        if (!"".equals(e3)) {
            a3 = Integer.parseInt(e3);
        }
        if (!"".equals(e4)) {
            a4 = Integer.parseInt(e4);
        }
        if (!"".equals(e5)) {
            a5 = Integer.parseInt(e5);
        }
        if (!"".equals(e6)) {
            a6 = Integer.parseInt(e6);
        }


        if (spinner.getSelectedItemPosition() == 0 & spinner2.getSelectedItemPosition() == 0 & spinner3.getSelectedItemPosition() == 0 &
                spinner4.getSelectedItemPosition() == 0 & spinner5.getSelectedItemPosition() == 0 & spinner6.getSelectedItemPosition() == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.clear, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);
        } else if (spinner.getSelectedItemPosition() != 0 & editText.getText().toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.sum, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);
        } else if (spinner2.getSelectedItemPosition() != 0 & editText2.getText().toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.sum, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);
        } else if (spinner3.getSelectedItemPosition() != 0 & editText3.getText().toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.sum, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);
        } else if (spinner4.getSelectedItemPosition() != 0 & editText4.getText().toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.sum, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);
        } else if (spinner5.getSelectedItemPosition() != 0 & editText5.getText().toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.sum, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);
        } else if (spinner6.getSelectedItemPosition() != 0 & editText6.getText().toString().equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.sum, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);
        } else if (a >= 13) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (a2 >= 13) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (a3 >= 13) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (a4 >= 13) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (a5 >= 13) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (a6 >= 13) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (spinner.getSelectedItemPosition() != 0 & a == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (spinner2.getSelectedItemPosition() != 0 & a2 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (spinner3.getSelectedItemPosition() != 0 & a3 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (spinner4.getSelectedItemPosition() != 0 & a4 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (spinner5.getSelectedItemPosition() != 0 & a5 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else if (spinner6.getSelectedItemPosition() != 0 & a6 == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.myDad, Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER,0,0);

        } else {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("name", a);
            intent.putExtra("name2", a2);
            intent.putExtra("name3", a3);
            intent.putExtra("name4", a4);
            intent.putExtra("name5", a5);
            intent.putExtra("name6", a6);
            startActivity(intent);

        }


    }
}
